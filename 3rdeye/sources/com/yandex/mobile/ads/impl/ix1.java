package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ix1 implements hx1 {

    /* renamed from: b, reason: collision with root package name */
    private final cs0 f28892b;

    public ix1(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f28892b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final String a() {
        return this.f28892b.d("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final void a(String str) {
        this.f28892b.a("SessionData", str);
    }
}
