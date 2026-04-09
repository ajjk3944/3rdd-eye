package com.bytedance.sdk.openadsdk.zin;

import com.applovin.sdk.AppLovinMediationProvider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum yu {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN(AppLovinMediationProvider.UNKNOWN);

    private String pno;

    yu(String str) {
        this.pno = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.pno;
    }
}
