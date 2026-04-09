package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class h00 implements hr1 {

    /* renamed from: a, reason: collision with root package name */
    private int f28057a;

    /* renamed from: b, reason: collision with root package name */
    private int f28058b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28059c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28060d;

    public h00() {
        this(1.0f, 2500, 1);
    }

    @Override // com.yandex.mobile.ads.impl.hr1
    public final int a() {
        return this.f28057a;
    }

    @Override // com.yandex.mobile.ads.impl.hr1
    public final int b() {
        return this.f28058b;
    }

    public h00(float f10, int i, int i10) {
        this.f28057a = i;
        this.f28059c = i10;
        this.f28060d = f10;
    }

    @Override // com.yandex.mobile.ads.impl.hr1
    public final void a(fi2 fi2Var) throws fi2 {
        int i = this.f28058b + 1;
        this.f28058b = i;
        int i10 = this.f28057a;
        this.f28057a = i10 + ((int) (i10 * this.f28060d));
        if (i > this.f28059c) {
            throw fi2Var;
        }
    }
}
