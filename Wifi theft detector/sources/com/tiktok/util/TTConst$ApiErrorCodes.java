package com.tiktok.util;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes3.dex */
public enum TTConst$ApiErrorCodes {
    PARTIAL_SUCCESS(Integer.valueOf(Sdk$SDKError.Reason.AD_SERVER_ERROR_VALUE)),
    API_ERROR(40000);

    public Integer code;

    TTConst$ApiErrorCodes(Integer num) {
        this.code = num;
    }
}
