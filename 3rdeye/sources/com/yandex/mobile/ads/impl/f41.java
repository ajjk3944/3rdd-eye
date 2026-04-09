package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f41 {

    /* renamed from: a, reason: collision with root package name */
    private final qa f27197a;

    public f41(qa adaptiveValidationRulesProvider) {
        kotlin.jvm.internal.l.f(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        this.f27197a = adaptiveValidationRulesProvider;
    }

    public final q71 a(Context context, ns adType, List<? extends ag<?>> assets, n71 nativeAdsConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(nativeAdsConfiguration, "nativeAdsConfiguration");
        Set<? extends String> setA = this.f27197a.a(context, adType);
        return setA != null ? new la(assets, nativeAdsConfiguration, setA, 0) : new e41(assets, nativeAdsConfiguration);
    }
}
