package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class bj2 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final zi2 f25300a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25301b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25302c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25303d;

    /* renamed from: e, reason: collision with root package name */
    private final long f25304e;

    public bj2(zi2 zi2Var, int i, long j4, long j10) {
        this.f25300a = zi2Var;
        this.f25301b = i;
        this.f25302c = j4;
        long j11 = (j10 - j4) / zi2Var.f36522d;
        this.f25303d = j11;
        this.f25304e = c(j11);
    }

    private long c(long j4) {
        return s82.a(j4 * this.f25301b, 1000000L, this.f25300a.f36521c);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j10 = this.f25303d - 1;
        int i = s82.f32899a;
        long jMax = Math.max(0L, Math.min((this.f25300a.f36521c * j4) / (this.f25301b * 1000000), j10));
        long j11 = (this.f25300a.f36522d * jMax) + this.f25302c;
        long jC = c(jMax);
        vw1 vw1Var = new vw1(jC, j11);
        if (jC >= j4 || jMax == this.f25303d - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        long j12 = jMax + 1;
        return new tw1.a(vw1Var, new vw1(c(j12), (this.f25300a.f36522d * j12) + this.f25302c));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f25304e;
    }
}
