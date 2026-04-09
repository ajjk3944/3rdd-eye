package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class ex1 implements dx1 {

    /* renamed from: b, reason: collision with root package name */
    private final cs0 f27083b;

    public ex1(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f27083b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.dx1
    public final String a() {
        return this.f27083b.d("ServerSideClientIP");
    }

    @Override // com.yandex.mobile.ads.impl.dx1
    public final void a(String str) {
        this.f27083b.a("ServerSideClientIP", str);
    }
}
