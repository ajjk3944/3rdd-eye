package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final b3 f9942a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f9943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9944c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9945d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9946e;

    /* renamed from: f, reason: collision with root package name */
    public int f9947f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f9948h;

    /* renamed from: i, reason: collision with root package name */
    public int f9949i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f9950k;

    /* renamed from: l, reason: collision with root package name */
    public long f9951l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f9952m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f9953n;

    public c3(int i4, b3 b3Var, u2 u2Var) {
        int i10 = b3Var.f9564d;
        this.f9942a = b3Var;
        int iA = b3Var.a();
        boolean z3 = true;
        if (iA != 1) {
            if (iA == 2) {
                iA = 2;
            } else {
                z3 = false;
            }
        }
        mq0.m(z3);
        int i11 = ((i4 / 10) + 48) | (((i4 % 10) + 48) << 8);
        this.f9944c = (iA == 2 ? 1667497984 : 1651965952) | i11;
        this.f9946e = bq0.u(i10, b3Var.f9562b * 1000000, b3Var.f9563c, RoundingMode.DOWN);
        this.f9943b = u2Var;
        this.f9945d = iA == 2 ? 1650720768 | i11 : -1;
        this.f9951l = -1L;
        this.f9952m = new long[512];
        this.f9953n = new int[512];
        this.f9947f = i10;
    }

    public final l2 a(long j) {
        if (this.f9950k == 0) {
            n2 n2Var = new n2(0L, this.f9951l);
            return new l2(n2Var, n2Var);
        }
        int i4 = (int) (j / ((this.f9946e * 1) / this.f9947f));
        int iP = bq0.p(this.f9953n, i4, true, true);
        if (this.f9953n[iP] == i4) {
            n2 n2VarB = b(iP);
            return new l2(n2VarB, n2VarB);
        }
        n2 n2VarB2 = b(iP);
        int i10 = iP + 1;
        return i10 < this.f9952m.length ? new l2(n2VarB2, b(i10)) : new l2(n2VarB2, n2VarB2);
    }

    public final n2 b(int i4) {
        return new n2(((this.f9946e * 1) / this.f9947f) * this.f9953n[i4], this.f9952m[i4]);
    }
}
