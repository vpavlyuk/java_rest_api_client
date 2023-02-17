package com.ultradns.ultra.rest.dto;

import com.ultradns.ultra.rest.constants.UltraRestSharedConstant;

/*
 * User: jbodner
 * Date: 9/30/13
 * Time: 3:27 PM
 *
 * Copyright 2023 Vercara LLC. All rights reserved.
 * Vercara, the Vercara logo and related names and logos are registered
 * trademarks, service marks or tradenames of Vercara LLC. All other
 * product names, company names, marks, logos and symbols may be trademarks
 * of their respective owners.
 */
public class ZoneDnssecType {

    private UltraRestSharedConstant.DnssecType dnssecType;

    public ZoneDnssecType() {
        dnssecType = UltraRestSharedConstant.DnssecType.NONE;
    }

    public ZoneDnssecType(UltraRestSharedConstant.DnssecType dnssecType) {
        this.dnssecType = dnssecType;
    }

    public UltraRestSharedConstant.DnssecType getDnssecType() {
        return dnssecType;
    }

    public void setDnssecType(UltraRestSharedConstant.DnssecType dnssecType) {
        this.dnssecType = dnssecType;
    }
}
