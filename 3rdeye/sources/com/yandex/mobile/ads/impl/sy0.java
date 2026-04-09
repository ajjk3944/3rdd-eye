package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;

/* loaded from: classes3.dex */
public final class sy0 implements ub1 {

    /* renamed from: a, reason: collision with root package name */
    private final MediatedNativeAd f33323a;

    /* renamed from: b, reason: collision with root package name */
    private final ly0 f33324b;

    /* renamed from: c, reason: collision with root package name */
    private final x6 f33325c;

    /* renamed from: d, reason: collision with root package name */
    private final ub1 f33326d;

    public sy0(MediatedNativeAd mediatedNativeAd, ly0 mediatedNativeRenderingTracker, x6 adQualityVerifierController, ub1 sdkAdFactory) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        kotlin.jvm.internal.l.f(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        kotlin.jvm.internal.l.f(adQualityVerifierController, "adQualityVerifierController");
        kotlin.jvm.internal.l.f(sdkAdFactory, "sdkAdFactory");
        this.f33323a = mediatedNativeAd;
        this.f33324b = mediatedNativeRenderingTracker;
        this.f33325c = adQualityVerifierController;
        this.f33326d = sdkAdFactory;
    }

    @Override // com.yandex.mobile.ads.impl.ub1
    public final tb1 a(w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        return new my0(this.f33326d.a(nativeAd), this.f33323a, this.f33324b, this.f33325c);
    }
}
