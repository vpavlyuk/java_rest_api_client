/*
 * User: nupadhyay
 * Date: Apr 2, 2014
 * Time: 1:21:23 PM
 *
 * Copyright 2000-2013 NeuStar, Inc. All rights reserved.
 * NeuStar, the Neustar logo and related names and logos are registered
 * trademarks, service marks or tradenames of NeuStar, Inc. All other
 * product names, company names, marks, logos and symbols may be trademarks
 * of their respective owners.
 */
package biz.neustar.ultra.rest.dto;

import biz.neustar.ultra.rest.constants.UltraRestSharedConstant.ProbeHttpMethod;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Transaction info.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionInfo {

    /**
     * List of http requests sent for a single probe.
     */
    private ProbeHttpMethod method;
    /**
     * URL to probe.
     */
    private String url;
    /**
     * Data to send to URL.
     */
    private String transmittedData;
    /**
     * Indicates whether or not to follow redirects.
     */
    private HttpLimitInfo limits;
    /**
     * Determine the cutoffs for sending notification or failing the probe.
     */
    private Boolean followRedirects;

    public TransactionInfo() {
        super();
    }

    public TransactionInfo(ProbeHttpMethod method, String url, String transmittedData, HttpLimitInfo limits,
            Boolean followRedirects) {
        super();
        this.method = method;
        this.url = url;
        this.transmittedData = transmittedData;
        this.limits = limits;
        this.followRedirects = followRedirects;
    }

    public ProbeHttpMethod getMethod() {
        return method;
    }

    public void setMethod(ProbeHttpMethod method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTransmittedData() {
        return transmittedData;
    }

    public void setTransmittedData(String transmittedData) {
        this.transmittedData = transmittedData;
    }

    public HttpLimitInfo getLimits() {
        return limits;
    }

    public void setLimits(HttpLimitInfo limits) {
        this.limits = limits;
    }

    public Boolean isFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(Boolean followRedirects) {
        this.followRedirects = followRedirects;
    }

    public void setDefaultValue() {
        if (followRedirects == null) {
            followRedirects = Boolean.FALSE;
        }
    }
}
