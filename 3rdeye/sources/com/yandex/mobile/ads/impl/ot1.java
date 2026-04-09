package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ot1 implements InterfaceC4143k4 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31500a;

    public ot1(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31500a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4143k4
    public final InterfaceC4195s1 a() {
        return new qt1();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4143k4
    public final e8 b() {
        return new pt1(this.f31500a);
    }
}
