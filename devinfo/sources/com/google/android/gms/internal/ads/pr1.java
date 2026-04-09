package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class pr1 implements gu1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f15083b;

    /* renamed from: d, reason: collision with root package name */
    public ku1 f15085d;

    /* renamed from: e, reason: collision with root package name */
    public int f15086e;

    /* renamed from: f, reason: collision with root package name */
    public cv1 f15087f;
    public w5 g;

    /* renamed from: h, reason: collision with root package name */
    public int f15088h;

    /* renamed from: i, reason: collision with root package name */
    public iz1 f15089i;
    public mx1[] j;

    /* renamed from: k, reason: collision with root package name */
    public long f15090k;

    /* renamed from: l, reason: collision with root package name */
    public long f15091l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15093n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15094o;

    /* renamed from: q, reason: collision with root package name */
    public jy1 f15096q;

    /* renamed from: r, reason: collision with root package name */
    public b f15097r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15082a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ce1 f15084c = new ce1(26);

    /* renamed from: m, reason: collision with root package name */
    public long f15092m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public uh f15095p = uh.f17203a;

    public pr1(int i4) {
        this.f15083b = i4;
    }

    public abstract void A(mx1[] mx1VarArr, long j, long j8, jy1 jy1Var);

    public abstract void c(long j, boolean z3, boolean z10);

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public final void j() {
        this.f15085d.getClass();
    }

    public final us1 k(Exception exc, mx1 mx1Var, boolean z3, int i4) {
        int iT;
        if (mx1Var == null || this.f15094o) {
            iT = 4;
        } else {
            this.f15094o = true;
            try {
                iT = t(mx1Var) & 7;
            } catch (us1 unused) {
            } finally {
                this.f15094o = false;
            }
        }
        return new us1(1, exc, i4, m(), this.f15086e, mx1Var, mx1Var == null ? 4 : iT, this.f15096q, z3);
    }

    public final int l(ce1 ce1Var, rq1 rq1Var, int i4) {
        iz1 iz1Var = this.f15089i;
        iz1Var.getClass();
        int iB = iz1Var.b(ce1Var, rq1Var, i4);
        if (iB == -4) {
            if (rq1Var.h(4)) {
                this.f15092m = Long.MIN_VALUE;
                return this.f15093n ? -4 : -3;
            }
            long j = rq1Var.g + this.f15090k;
            rq1Var.g = j;
            this.f15092m = Math.max(this.f15092m, j);
            return iB;
        }
        if (iB == -5) {
            mx1 mx1Var = (mx1) ce1Var.f10095c;
            mx1Var.getClass();
            long j8 = mx1Var.f14057r;
            if (j8 != Long.MAX_VALUE) {
                lw1 lw1Var = new lw1(mx1Var);
                lw1Var.f13666q = j8 + this.f15090k;
                ce1Var.f10095c = new mx1(lw1Var);
                return -5;
            }
        }
        return iB;
    }

    public abstract String m();

    public boolean n(long j) {
        return false;
    }

    public abstract void o(float f10, float f11);

    public abstract void q(long j, long j8);

    public abstract boolean r();

    public abstract boolean s();

    public abstract int t(mx1 mx1Var);

    public final void u(long j, boolean z3, boolean z10) {
        this.f15093n = false;
        this.f15091l = j;
        this.f15092m = j;
        if (!z10) {
            iz1 iz1Var = this.f15089i;
            iz1Var.getClass();
            z10 = iz1Var.f(j - this.f15090k) != 0;
        }
        c(j, z3, z10);
    }

    public final void v(mx1[] mx1VarArr, iz1 iz1Var, long j, long j8, jy1 jy1Var) {
        mq0.c0(!this.f15093n);
        this.f15089i = iz1Var;
        this.f15096q = jy1Var;
        if (this.f15092m == Long.MIN_VALUE) {
            this.f15092m = j;
        }
        this.j = mx1VarArr;
        this.f15090k = j8;
        A(mx1VarArr, j, j8, jy1Var);
    }

    public final boolean w() {
        return this.f15092m == Long.MIN_VALUE;
    }

    public st1 x() {
        return null;
    }

    public final void y() {
        synchronized (this.f15082a) {
            this.f15097r = null;
        }
    }

    public abstract void z(boolean z3, boolean z10);

    public void p() {
    }
}
