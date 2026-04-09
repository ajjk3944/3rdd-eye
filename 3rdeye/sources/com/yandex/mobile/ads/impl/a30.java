package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class a30 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    private final N7.U3 f24413a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f24414b;

    /* renamed from: c, reason: collision with root package name */
    private final w00<ExtendedNativeAdView> f24415c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4105f1 f24416d;

    /* renamed from: e, reason: collision with root package name */
    private final g20 f24417e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24418f;

    /* renamed from: g, reason: collision with root package name */
    private final r10 f24419g;

    public /* synthetic */ a30(N7.U3 u32, C4072a3 c4072a3, uq uqVar, InterfaceC4105f1 interfaceC4105f1, g20 g20Var, int i) {
        this(u32, c4072a3, uqVar, interfaceC4105f1, g20Var, i, new r10(c4072a3.q().c()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.yandex.mobile.ads.impl.yd0
    public final com.yandex.mobile.ads.impl.sq0<com.monetization.ads.nativeads.ExtendedNativeAdView> a(android.content.Context r21, com.yandex.mobile.ads.impl.a8<?> r22, com.yandex.mobile.ads.impl.h61 r23, com.yandex.mobile.ads.impl.tr r24, com.yandex.mobile.ads.impl.lt r25, com.yandex.mobile.ads.impl.C4070a1 r26) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a30.a(android.content.Context, com.yandex.mobile.ads.impl.a8, com.yandex.mobile.ads.impl.h61, com.yandex.mobile.ads.impl.tr, com.yandex.mobile.ads.impl.lt, com.yandex.mobile.ads.impl.a1):com.yandex.mobile.ads.impl.sq0");
    }

    public a30(N7.U3 divData, C4072a3 adConfiguration, uq adTypeSpecificBinder, InterfaceC4105f1 adActivityListener, g20 divKitActionHandlerDelegate, int i, r10 divConfigurationCreator) {
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adTypeSpecificBinder, "adTypeSpecificBinder");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        kotlin.jvm.internal.l.f(divConfigurationCreator, "divConfigurationCreator");
        this.f24413a = divData;
        this.f24414b = adConfiguration;
        this.f24415c = adTypeSpecificBinder;
        this.f24416d = adActivityListener;
        this.f24417e = divKitActionHandlerDelegate;
        this.f24418f = i;
        this.f24419g = divConfigurationCreator;
    }
}
