package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zy1 implements iz1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bz1 f19236b;

    public zy1(bz1 bz1Var, int i4) {
        this.f19236b = bz1Var;
        this.f19235a = i4;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final boolean a() {
        bz1 bz1Var = this.f19236b;
        return !bz1Var.q() && bz1Var.f9877s[this.f19235a].o(bz1Var.M);
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int b(ce1 ce1Var, rq1 rq1Var, int i4) {
        int i10;
        boolean z3;
        int i11;
        bz1 bz1Var = this.f19236b;
        int i12 = this.f19235a;
        if (bz1Var.q()) {
            return -3;
        }
        bz1Var.n(i12);
        hz1 hz1Var = bz1Var.f9877s[i12];
        boolean z10 = bz1Var.M;
        hz1Var.getClass();
        boolean z11 = (i4 & 2) != 0;
        ca.c cVar = hz1Var.f12042b;
        synchronized (hz1Var) {
            try {
                rq1Var.f15736f = false;
                int i13 = hz1Var.f12056r;
                i10 = -4;
                if (i13 != hz1Var.f12053o) {
                    mx1 mx1Var = ((gz1) hz1Var.f12043c.g(hz1Var.f12054p + i13)).f11669a;
                    if (!z11 && mx1Var == hz1Var.f12046f) {
                        int iK = hz1Var.k(hz1Var.f12056r);
                        if (hz1Var.g != null) {
                            int i14 = hz1Var.f12050l[iK];
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            int i15 = hz1Var.f12050l[iK];
                            rq1Var.f14029b = i15;
                            if (hz1Var.f12056r == hz1Var.f12053o - 1 && (z10 || hz1Var.f12060v)) {
                                rq1Var.f14029b = 536870912 | i15;
                            }
                            rq1Var.g = hz1Var.f12051m[iK];
                            cVar.f2830c = hz1Var.f12049k[iK];
                            cVar.f2829b = hz1Var.j[iK];
                            cVar.f2831d = hz1Var.f12052n[iK];
                            i11 = -4;
                        } else {
                            rq1Var.f15736f = true;
                            i11 = -3;
                        }
                    }
                    hz1Var.h(mx1Var, ce1Var);
                    i11 = -5;
                } else {
                    if (!z10 && !hz1Var.f12060v) {
                        mx1 mx1Var2 = hz1Var.f12063y;
                        if (mx1Var2 == null || (!z11 && mx1Var2 == hz1Var.f12046f)) {
                            i11 = -3;
                        }
                        hz1Var.h(mx1Var2, ce1Var);
                        i11 = -5;
                    }
                    rq1Var.f14029b = 4;
                    rq1Var.g = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 != -4) {
            i10 = i11;
        } else if (!rq1Var.h(4)) {
            int i16 = i4 & 1;
            if ((i4 & 4) == 0) {
                if (i16 != 0) {
                    fz1 fz1Var = hz1Var.f12041a;
                    fz1.d((g5) fz1Var.f11322e, rq1Var, cVar, (sk0) fz1Var.f11320c);
                } else {
                    fz1 fz1Var2 = hz1Var.f12041a;
                    fz1Var2.f11322e = fz1.d((g5) fz1Var2.f11322e, rq1Var, cVar, (sk0) fz1Var2.f11320c);
                    hz1Var.f12056r++;
                }
            } else if (i16 == 0) {
                hz1Var.f12056r++;
            }
        }
        if (i10 == -3) {
            bz1Var.p(i12);
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int f(long j) {
        int i4;
        bz1 bz1Var = this.f19236b;
        int i10 = this.f19235a;
        if (bz1Var.q()) {
            return 0;
        }
        bz1Var.n(i10);
        hz1 hz1Var = bz1Var.f9877s[i10];
        boolean z3 = bz1Var.M;
        synchronized (hz1Var) {
            int i11 = hz1Var.f12056r;
            int iK = hz1Var.k(i11);
            int i12 = hz1Var.f12056r;
            int i13 = hz1Var.f12053o;
            if ((i12 != i13) && j >= hz1Var.f12051m[iK]) {
                if (j <= hz1Var.f12059u || !z3) {
                    i4 = hz1Var.i(iK, i13 - i11, j, true);
                    if (i4 == -1) {
                    }
                } else {
                    i4 = i13 - i11;
                }
            }
            i4 = 0;
        }
        hz1Var.q(i4);
        if (i4 != 0) {
            return i4;
        }
        bz1Var.p(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final void zzc() throws IOException {
        IOException iOException;
        int i4 = this.f19235a;
        bz1 bz1Var = this.f19236b;
        rg0 rg0Var = bz1Var.f9877s[i4].g;
        if (rg0Var != null) {
            throw ((qw1) rg0Var.f15651b);
        }
        int i10 = bz1Var.C == 7 ? 6 : 3;
        pq0 pq0Var = bz1Var.j;
        IOException iOException2 = (IOException) pq0Var.f15075d;
        if (iOException2 != null) {
            throw iOException2;
        }
        q qVar = (q) pq0Var.f15074c;
        if (qVar != null && (iOException = qVar.f15161c) != null && qVar.f15162d > i10) {
            throw iOException;
        }
    }
}
