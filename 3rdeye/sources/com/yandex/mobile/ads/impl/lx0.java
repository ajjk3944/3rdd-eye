package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class lx0 implements InterfaceC4143k4 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f30124a;

    /* renamed from: b, reason: collision with root package name */
    private final ex0<?> f30125b;

    public lx0(a8<?> adResponse, ex0<?> ex0Var) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f30124a = adResponse;
        this.f30125b = ex0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4143k4
    public final InterfaceC4195s1 a() {
        return new sx0(this.f30125b, new rx0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4143k4
    public final e8 b() {
        return new px0(this.f30124a);
    }
}
