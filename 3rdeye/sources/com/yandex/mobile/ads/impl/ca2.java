package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ca2 {

    /* renamed from: a, reason: collision with root package name */
    private final dn1 f25581a;

    /* renamed from: b, reason: collision with root package name */
    private final bq f25582b;

    /* renamed from: c, reason: collision with root package name */
    private final zw1 f25583c;

    public /* synthetic */ ca2() {
        dn1 dn1Var = new dn1();
        vp1 vp1Var = new vp1();
        this(dn1Var, vp1Var, new bq(vp1Var), new zw1());
    }

    public ca2(dn1 randomGenerator, vp1 requestHelper, bq cmpRequestConfigurator, zw1 sensitiveModeChecker) {
        kotlin.jvm.internal.l.f(randomGenerator, "randomGenerator");
        kotlin.jvm.internal.l.f(requestHelper, "requestHelper");
        kotlin.jvm.internal.l.f(cmpRequestConfigurator, "cmpRequestConfigurator");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        this.f25581a = randomGenerator;
        this.f25582b = cmpRequestConfigurator;
        this.f25583c = sensitiveModeChecker;
    }
}
