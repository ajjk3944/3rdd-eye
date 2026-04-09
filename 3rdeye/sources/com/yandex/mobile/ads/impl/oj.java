package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class oj implements qj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31391a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31392b;

    public oj(a8 adResponse, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31391a = z10;
        this.f31392b = z11;
    }

    @Override // com.yandex.mobile.ads.impl.qj
    public final boolean a() {
        return this.f31392b;
    }

    @Override // com.yandex.mobile.ads.impl.qj
    public final boolean b() {
        return this.f31391a;
    }
}
