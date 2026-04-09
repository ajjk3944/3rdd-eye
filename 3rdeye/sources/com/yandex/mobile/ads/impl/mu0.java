package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class mu0 {

    /* renamed from: a, reason: collision with root package name */
    private final kt f30517a;

    public mu0(kt nativeAdAssets) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        this.f30517a = nativeAdAssets;
    }

    public final Float a() {
        qt qtVarI = this.f30517a.i();
        mt mtVarH = this.f30517a.h();
        if (qtVarI != null) {
            return Float.valueOf(qtVarI.a());
        }
        if (mtVarH == null || mtVarH.d() <= 0 || mtVarH.b() <= 0) {
            return null;
        }
        return Float.valueOf(mtVarH.d() / mtVarH.b());
    }
}
