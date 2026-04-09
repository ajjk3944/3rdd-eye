package com.bytedance.sdk.openadsdk.core.sup.emc;

import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes.dex */
public enum emc {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(Sdk$SDKError.Reason.MRAID_ERROR_VALUE),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE),
    UNDEFINED_ERROR(900);

    private final int msw;

    emc(int i10) {
        this.msw = i10;
    }

    @NonNull
    public String emc() {
        return String.valueOf(this.msw);
    }
}
