package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4213u5 implements ep {

    /* renamed from: a, reason: collision with root package name */
    private final C4199s5 f33936a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33937b;

    public C4213u5(C4199s5 adPod, int i) {
        kotlin.jvm.internal.l.f(adPod, "adPod");
        this.f33936a = adPod;
        this.f33937b = i;
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final boolean a() {
        return this.f33936a.a() <= this.f33937b;
    }
}
