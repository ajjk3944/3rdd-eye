package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g71 implements ha {

    /* renamed from: a, reason: collision with root package name */
    private final ca1 f27566a;

    public g71(ca1 nativeAdValidator) {
        kotlin.jvm.internal.l.f(nativeAdValidator, "nativeAdValidator");
        this.f27566a = nativeAdValidator;
    }

    @Override // com.yandex.mobile.ads.impl.ha
    public final boolean a() {
        return this.f27566a.c();
    }

    @Override // com.yandex.mobile.ads.impl.ha
    public final boolean b() {
        return !this.f27566a.b();
    }
}
