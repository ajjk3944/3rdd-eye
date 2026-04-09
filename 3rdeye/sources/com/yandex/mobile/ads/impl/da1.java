package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;

/* loaded from: classes3.dex */
public final class da1 {

    /* renamed from: a, reason: collision with root package name */
    private final qa f26033a;

    public da1(qa adaptiveValidationRulesProvider) {
        kotlin.jvm.internal.l.f(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        this.f26033a = adaptiveValidationRulesProvider;
    }

    public final ca1 a(Context context, ns adType, q71 assetsValidator, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(assetsValidator, "assetsValidator");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        Set<? extends String> setA = this.f26033a.a(context, adType);
        return setA != null ? new ma(context, assetsValidator, setA) : new w61(context, assetsValidator, adResponse);
    }

    public final ca1 a(Context context, ns adType, z71 nativeCompositeAd, q71 assetsValidator, ew1 sdkSettings, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(nativeCompositeAd, "nativeCompositeAd");
        kotlin.jvm.internal.l.f(assetsValidator, "assetsValidator");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        Set<? extends String> setA = this.f26033a.a(context, adType);
        if (setA != null) {
            return new na(context, nativeCompositeAd, assetsValidator, setA, sdkSettings, 0);
        }
        return new qz1(context, nativeCompositeAd, assetsValidator, sdkSettings, adResponse);
    }
}
