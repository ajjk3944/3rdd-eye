package com.bytedance.sdk.openadsdk.core.sup.emc;

/* loaded from: classes.dex */
public enum emc {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int msw;

    emc(int i) {
        this.msw = i;
    }

    public String emc() {
        return String.valueOf(this.msw);
    }
}
