package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lu1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13634b;

    /* renamed from: c, reason: collision with root package name */
    public int f13635c;

    /* renamed from: d, reason: collision with root package name */
    public int f13636d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13637e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13638f;

    public static boolean l(pr1 pr1Var) {
        return pr1Var.f15088h != 0;
    }

    public static final void n(pr1 pr1Var) {
        int i4 = pr1Var.f15088h;
        if (i4 == 2) {
            mq0.c0(i4 == 2);
            pr1Var.f15088h = 1;
            pr1Var.f();
        }
    }

    public boolean A(tt1 tt1Var) {
        return h(tt1Var, (pr1) this.f13637e) && h(tt1Var, (pr1) this.f13638f);
    }

    public void B(long j, long j8) {
        pr1 pr1Var = (pr1) this.f13637e;
        if (l(pr1Var)) {
            pr1Var.q(j, j8);
        }
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 == null || pr1Var2.f15088h == 0) {
            return;
        }
        pr1Var2.q(j, j8);
    }

    public boolean C(tt1 tt1Var) {
        pr1 pr1VarM = m(tt1Var);
        return pr1VarM == null || pr1VarM.w() || pr1VarM.r() || pr1VarM.s();
    }

    public void D() {
        int i4;
        pr1 pr1Var = (pr1) this.f13637e;
        int i10 = pr1Var.f15088h;
        if (i10 == 1 && this.f13636d != 4) {
            mq0.c0(i10 == 1);
            pr1Var.f15088h = 2;
            pr1Var.d();
            return;
        }
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 == null || (i4 = pr1Var2.f15088h) != 1 || this.f13636d == 3) {
            return;
        }
        mq0.c0(i4 == 1);
        pr1Var2.f15088h = 2;
        pr1Var2.d();
    }

    public void a() {
        int i4 = this.f13636d;
        if (i4 != 3 && i4 != 4) {
            if (i4 == 2) {
                this.f13636d = 0;
                return;
            }
            return;
        }
        boolean z3 = i4 == 4;
        pr1 pr1Var = (pr1) this.f13637e;
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (z3) {
            pr1Var2.getClass();
            pr1Var2.b(17, pr1Var);
        } else {
            pr1Var2.getClass();
            pr1Var.b(17, pr1Var2);
        }
        this.f13636d = this.f13636d != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((pr1) this.f13637e)) {
            j(true);
        }
        pr1 pr1Var = (pr1) this.f13638f;
        if (pr1Var == null || pr1Var.f15088h != 0) {
            return;
        }
        j(false);
    }

    public int c(tt1 tt1Var, g gVar, in0 in0Var) {
        int iK = k((pr1) this.f13637e, tt1Var, gVar, in0Var);
        return iK == 1 ? k((pr1) this.f13638f, tt1Var, gVar, in0Var) : iK;
    }

    public void d() {
        pr1 pr1Var = (pr1) this.f13637e;
        mq0.c0(pr1Var.f15088h == 0);
        pr1Var.i();
        this.f13633a = false;
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 != null) {
            mq0.c0(pr1Var2.f15088h == 0);
            pr1Var2.i();
            this.f13634b = false;
        }
    }

    public void e(Object obj) {
        pr1 pr1Var = (pr1) this.f13637e;
        if (pr1Var.f15083b != 2) {
            return;
        }
        int i4 = this.f13636d;
        if (i4 != 4 && i4 != 1) {
            pr1Var.b(1, obj);
            return;
        }
        pr1 pr1Var2 = (pr1) this.f13638f;
        pr1Var2.getClass();
        pr1Var2.b(1, obj);
    }

    public void f(r0 r0Var) {
        pr1 pr1Var = (pr1) this.f13637e;
        if (pr1Var.f15083b == 2) {
            pr1Var.b(7, r0Var);
            pr1 pr1Var2 = (pr1) this.f13638f;
            if (pr1Var2 != null) {
                pr1Var2.b(7, r0Var);
            }
        }
    }

    public boolean g() {
        int i4 = this.f13636d;
        if (i4 == 0 || i4 == 2 || i4 == 4) {
            return l((pr1) this.f13637e);
        }
        pr1 pr1Var = (pr1) this.f13638f;
        pr1Var.getClass();
        return pr1Var.f15088h != 0;
    }

    public boolean h(tt1 tt1Var, pr1 pr1Var) {
        if (pr1Var == null) {
            return true;
        }
        iz1[] iz1VarArr = tt1Var.f16950c;
        int i4 = this.f13635c;
        iz1 iz1Var = iz1VarArr[i4];
        iz1 iz1Var2 = pr1Var.f15089i;
        if (iz1Var2 == null) {
            return true;
        }
        if (iz1Var2 == iz1Var && (iz1Var == null || pr1Var.w())) {
            return true;
        }
        tt1 tt1Var2 = tt1Var.f16958m;
        return tt1Var2 != null && tt1Var2.f16950c[i4] == pr1Var.f15089i;
    }

    public void i(pr1 pr1Var, in0 in0Var) {
        mq0.c0(((pr1) this.f13637e) == pr1Var || ((pr1) this.f13638f) == pr1Var);
        if (l(pr1Var)) {
            if (pr1Var == ((pr1) in0Var.f12389e)) {
                in0Var.f12390f = null;
                in0Var.f12389e = null;
                in0Var.f12385a = true;
            }
            n(pr1Var);
            mq0.c0(pr1Var.f15088h == 1);
            ce1 ce1Var = pr1Var.f15084c;
            ce1Var.f10094b = null;
            ce1Var.f10095c = null;
            pr1Var.f15088h = 0;
            pr1Var.f15089i = null;
            pr1Var.j = null;
            pr1Var.f15093n = false;
            pr1Var.g();
            pr1Var.f15096q = null;
        }
    }

    public void j(boolean z3) {
        if (z3) {
            if (this.f13633a) {
                pr1 pr1Var = (pr1) this.f13637e;
                mq0.c0(pr1Var.f15088h == 0);
                ce1 ce1Var = pr1Var.f15084c;
                ce1Var.f10094b = null;
                ce1Var.f10095c = null;
                pr1Var.h();
                this.f13633a = false;
                return;
            }
            return;
        }
        if (this.f13634b) {
            pr1 pr1Var2 = (pr1) this.f13638f;
            pr1Var2.getClass();
            mq0.c0(pr1Var2.f15088h == 0);
            ce1 ce1Var2 = pr1Var2.f15084c;
            ce1Var2.f10094b = null;
            ce1Var2.f10095c = null;
            pr1Var2.h();
            this.f13634b = false;
        }
    }

    public int k(pr1 pr1Var, tt1 tt1Var, g gVar, in0 in0Var) {
        int i4;
        if (pr1Var != null && pr1Var.f15088h != 0) {
            pr1 pr1Var2 = (pr1) this.f13637e;
            boolean z3 = pr1Var != pr1Var2;
            if (pr1Var == pr1Var2 && ((i4 = this.f13636d) == 2 || i4 == 4)) {
                return 1;
            }
            if (pr1Var == ((pr1) this.f13638f) && this.f13636d == 3) {
                return 1;
            }
            iz1 iz1Var = pr1Var.f15089i;
            iz1[] iz1VarArr = tt1Var.f16950c;
            int i10 = this.f13635c;
            iz1 iz1Var2 = iz1VarArr[i10];
            boolean zB = gVar.b(i10);
            if (!zB || iz1Var != iz1Var2) {
                if (!pr1Var.f15093n) {
                    d dVar = ((d[]) gVar.f11326c)[i10];
                    int iC = dVar != null ? dVar.c() : 0;
                    mx1[] mx1VarArr = new mx1[iC];
                    for (int i11 = 0; i11 < iC; i11++) {
                        dVar.getClass();
                        mx1VarArr[i11] = dVar.L1(i11);
                    }
                    iz1 iz1Var3 = iz1VarArr[i10];
                    iz1Var3.getClass();
                    pr1Var.v(mx1VarArr, iz1Var3, tt1Var.a(), tt1Var.f16961p, tt1Var.g.f17335a);
                    return 3;
                }
                if (!pr1Var.s()) {
                    return 0;
                }
                i(pr1Var, in0Var);
                if (!zB || q()) {
                    j(!z3);
                    return 1;
                }
            }
        }
        return 1;
    }

    public pr1 m(tt1 tt1Var) {
        if (tt1Var != null) {
            iz1 iz1Var = tt1Var.f16950c[this.f13635c];
            if (iz1Var != null) {
                pr1 pr1Var = (pr1) this.f13637e;
                if (pr1Var.f15089i == iz1Var) {
                    return pr1Var;
                }
                pr1 pr1Var2 = (pr1) this.f13638f;
                if (pr1Var2 != null && pr1Var2.f15089i == iz1Var) {
                    return pr1Var2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((pr1) this.f13638f) != null;
    }

    public void p() {
        int i4;
        mq0.c0(!q());
        if (l((pr1) this.f13637e)) {
            i4 = 3;
        } else {
            pr1 pr1Var = (pr1) this.f13638f;
            i4 = (pr1Var == null || pr1Var.f15088h == 0) ? 2 : 4;
        }
        this.f13636d = i4;
    }

    public boolean q() {
        int i4 = this.f13636d;
        return i4 == 2 || i4 == 4 || i4 == 3;
    }

    public int r() {
        pr1 pr1Var = (pr1) this.f13638f;
        boolean zL = l((pr1) this.f13637e);
        int i4 = 0;
        if (pr1Var != null && pr1Var.f15088h != 0) {
            i4 = 1;
        }
        return (zL ? 1 : 0) + i4;
    }

    public void s() {
        int i4 = ((pr1) this.f13637e).f15083b;
    }

    public boolean t(tt1 tt1Var) {
        pr1 pr1VarM = m(tt1Var);
        pr1VarM.getClass();
        return pr1VarM.w();
    }

    public void u(tt1 tt1Var) {
        pr1 pr1VarM = m(tt1Var);
        pr1VarM.getClass();
        pr1VarM.f15093n = true;
    }

    public void v(g gVar, g gVar2) {
        int i4;
        pr1 pr1Var = (pr1) this.f13637e;
        int i10 = this.f13635c;
        boolean zB = gVar.b(i10);
        boolean zB2 = gVar2.b(i10);
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 == null || (i4 = this.f13636d) == 3 || (i4 == 0 && l(pr1Var))) {
            pr1Var2 = pr1Var;
        }
        if (!zB || pr1Var2.f15093n) {
            return;
        }
        int i11 = pr1Var.f15083b;
        ku1 ku1Var = ((ku1[]) gVar.f11325b)[i10];
        ku1 ku1Var2 = ((ku1[]) gVar2.f11325b)[i10];
        if (zB2 && Objects.equals(ku1Var2, ku1Var) && !q()) {
            return;
        }
        pr1Var2.f15093n = true;
    }

    public void w() {
        int i4;
        pr1 pr1Var = (pr1) this.f13637e;
        if (l(pr1Var) && (i4 = this.f13636d) != 4 && i4 != 2) {
            pr1Var.f15093n = true;
        }
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 == null || pr1Var2.f15088h == 0 || this.f13636d == 3) {
            return;
        }
        pr1Var2.f15093n = true;
    }

    public void x() {
        pr1 pr1Var = (pr1) this.f13637e;
        if (l(pr1Var)) {
            pr1Var.p();
            return;
        }
        pr1 pr1Var2 = (pr1) this.f13638f;
        if (pr1Var2 == null || pr1Var2.f15088h == 0) {
            return;
        }
        pr1Var2.p();
    }

    public boolean y() {
        pr1 pr1Var = (pr1) this.f13637e;
        boolean zS = l(pr1Var) ? pr1Var.s() : true;
        pr1 pr1Var2 = (pr1) this.f13638f;
        return (pr1Var2 == null || pr1Var2.f15088h == 0) ? zS : zS & pr1Var2.s();
    }

    public boolean z(tt1 tt1Var) {
        int i4 = this.f13636d;
        return ((i4 == 2 || i4 == 4) && m(tt1Var) == ((pr1) this.f13637e)) || (this.f13636d == 3 && m(tt1Var) == ((pr1) this.f13638f));
    }
}
