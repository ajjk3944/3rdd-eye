package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class z12 implements tu0 {

    /* renamed from: b, reason: collision with root package name */
    private final dp f36136b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36137c;

    /* renamed from: d, reason: collision with root package name */
    private long f36138d;

    /* renamed from: e, reason: collision with root package name */
    private long f36139e;

    /* renamed from: f, reason: collision with root package name */
    private vh1 f36140f = vh1.f34541e;

    public z12(m32 m32Var) {
        this.f36136b = m32Var;
    }

    public final void a(long j4) {
        this.f36138d = j4;
        if (this.f36137c) {
            this.f36139e = this.f36136b.b();
        }
    }

    public final void b() {
        if (this.f36137c) {
            a(o());
            this.f36137c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final vh1 getPlaybackParameters() {
        return this.f36140f;
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final long o() {
        long j4 = this.f36138d;
        if (!this.f36137c) {
            return j4;
        }
        long jB = this.f36136b.b() - this.f36139e;
        vh1 vh1Var = this.f36140f;
        return (vh1Var.f34542b == 1.0f ? s82.a(jB) : vh1Var.a(jB)) + j4;
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final void a(vh1 vh1Var) {
        if (this.f36137c) {
            a(o());
        }
        this.f36140f = vh1Var;
    }

    public final void a() {
        if (this.f36137c) {
            return;
        }
        this.f36139e = this.f36136b.b();
        this.f36137c = true;
    }
}
