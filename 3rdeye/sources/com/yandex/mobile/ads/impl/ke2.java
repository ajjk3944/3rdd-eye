package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final lf2 f29643a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29644b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29645c;

    /* renamed from: d, reason: collision with root package name */
    private final Double f29646d;

    public ke2(lf2 lf2Var, boolean z10, boolean z11, Double d10) {
        this.f29643a = lf2Var;
        this.f29644b = z10;
        this.f29645c = z11;
        this.f29646d = d10;
    }

    public final Double a() {
        return this.f29646d;
    }

    public final boolean b() {
        return this.f29645c;
    }

    public final lf2 c() {
        return this.f29643a;
    }

    public final boolean d() {
        return this.f29644b;
    }

    public final boolean e() {
        Double d10 = this.f29646d;
        return (d10 != null && d10.doubleValue() == 0.0d) || this.f29646d == null;
    }
}
