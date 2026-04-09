package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class nk0 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f30918a;

    /* renamed from: b, reason: collision with root package name */
    private final us0 f30919b;

    /* renamed from: c, reason: collision with root package name */
    private final us0 f30920c;

    /* renamed from: d, reason: collision with root package name */
    private long f30921d;

    public nk0(long j4, long j10, long j11) {
        this.f30921d = j4;
        this.f30918a = j11;
        us0 us0Var = new us0();
        this.f30919b = us0Var;
        us0 us0Var2 = new us0();
        this.f30920c = us0Var2;
        us0Var.a(0L);
        us0Var2.a(j10);
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f30918a;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f30921d;
    }

    public final void d(long j4) {
        this.f30921d = j4;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return this.f30919b.a(s82.a(this.f30920c, j4));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int iA = s82.a(this.f30919b, j4);
        long jA = this.f30919b.a(iA);
        vw1 vw1Var = new vw1(jA, this.f30920c.a(iA));
        if (jA == j4 || iA == this.f30919b.a() - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i = iA + 1;
        return new tw1.a(vw1Var, new vw1(this.f30919b.a(i), this.f30920c.a(i)));
    }

    public final boolean c(long j4) {
        us0 us0Var = this.f30919b;
        return j4 - us0Var.a(us0Var.a() - 1) < 100000;
    }

    public final void a(long j4, long j10) {
        if (c(j4)) {
            return;
        }
        this.f30919b.a(j4);
        this.f30920c.a(j10);
    }
}
