package com.yandex.mobile.ads.impl;

import b9.m;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.yandex.mobile.ads.impl.do1;

/* loaded from: classes3.dex */
public final class v6 {
    public static AdQualityVerifierAdapter a() {
        Object objA;
        try {
            Object objA2 = do1.a.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            objA = objA2 instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) objA2 : null;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            thA.getMessage();
            fp0.b(new Object[0]);
        }
        return (AdQualityVerifierAdapter) (objA instanceof m.a ? null : objA);
    }
}
