package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class f81 {
    public static long a(a8 adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        ns nsVarN = adResponse.n();
        Long lU = adResponse.u();
        if (lU == null) {
            lU = nsVarN == ns.f30990f ? 5000L : 0L;
        }
        return lU.longValue();
    }
}
