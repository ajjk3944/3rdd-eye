package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class n81 {

    /* renamed from: a, reason: collision with root package name */
    private final m81 f30798a;

    /* renamed from: b, reason: collision with root package name */
    private final m81 f30799b;

    public /* synthetic */ n81() {
        this(new a51(), new em1());
    }

    public final m81 a(ar1 responseNativeType) {
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        int iOrdinal = responseNativeType.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                return this.f30799b;
            }
            if (iOrdinal != 4) {
                throw new b9.j();
            }
        }
        return this.f30798a;
    }

    public n81(m81 nativeAdCreator, m81 promoAdCreator) {
        kotlin.jvm.internal.l.f(nativeAdCreator, "nativeAdCreator");
        kotlin.jvm.internal.l.f(promoAdCreator, "promoAdCreator");
        this.f30798a = nativeAdCreator;
        this.f30799b = promoAdCreator;
    }
}
