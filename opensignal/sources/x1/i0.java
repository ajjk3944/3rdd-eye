package x1;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f24846a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24848c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24850e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24852g;

    /* renamed from: h, reason: collision with root package name */
    public int f24853h;

    /* renamed from: i, reason: collision with root package name */
    public int f24854i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f24855l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24856m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24857n;

    /* renamed from: o, reason: collision with root package name */
    public int f24858o;

    /* renamed from: q, reason: collision with root package name */
    public s0 f24860q;

    /* renamed from: d, reason: collision with root package name */
    public b0 f24849d = b0.Idle;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f24859p = new y0(this);

    public i0(f0 f0Var) {
        this.f24846a = f0Var;
    }

    public final f1 a() {
        return (f1) this.f24846a.D.f823e;
    }

    public final void b() {
        b0 b0VarT = this.f24846a.t();
        if (b0VarT == b0.LayingOut || b0VarT == b0.LookaheadLayingOut) {
            if (this.f24859p.f24977z) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0VarT == b0.LookaheadLayingOut) {
            s0 s0Var = this.f24860q;
            if (s0Var == null || !s0Var.f24930u) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        s0 s0Var = this.f24860q;
        if (s0Var != null) {
            b0 b0Var = b0.LookaheadMeasuring;
            i0 i0Var = s0Var.f24918g;
            i0Var.f24849d = b0Var;
            y0 y0Var = i0Var.f24859p;
            f0 f0Var = i0Var.f24846a;
            i0Var.f24850e = false;
            n1 snapshotObserver = k.t(f0Var).getSnapshotObserver();
            q0 q0Var = new q0(s0Var, j);
            snapshotObserver.getClass();
            if (f0Var.f24804h != null) {
                snapshotObserver.a(f0Var, snapshotObserver.f24896b, q0Var);
            } else {
                snapshotObserver.a(f0Var, snapshotObserver.f24897c, q0Var);
            }
            i0Var.f24851f = true;
            i0Var.f24852g = true;
            if (k.o(f0Var)) {
                y0Var.f24972u = true;
                y0Var.f24973v = true;
            } else {
                y0Var.f24971t = true;
            }
            i0Var.f24849d = b0.Idle;
        }
    }

    public final void d(int i10) {
        int i11 = this.f24855l;
        this.f24855l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            f0 f0VarC = this.f24846a.C();
            i0 i0VarR = f0VarC != null ? f0VarC.r() : null;
            if (i0VarR != null) {
                if (i10 == 0) {
                    i0VarR.d(i0VarR.f24855l - 1);
                } else {
                    i0VarR.d(i0VarR.f24855l + 1);
                }
            }
        }
    }

    public final void e(int i10) {
        int i11 = this.f24858o;
        this.f24858o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            f0 f0VarC = this.f24846a.C();
            i0 i0VarR = f0VarC != null ? f0VarC.r() : null;
            if (i0VarR != null) {
                if (i10 == 0) {
                    i0VarR.e(i0VarR.f24858o - 1);
                } else {
                    i0VarR.e(i0VarR.f24858o + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.k != z10) {
            this.k = z10;
            if (z10 && !this.j) {
                d(this.f24855l + 1);
            } else {
                if (z10 || this.j) {
                    return;
                }
                d(this.f24855l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.j != z10) {
            this.j = z10;
            if (z10 && !this.k) {
                d(this.f24855l + 1);
            } else {
                if (z10 || this.k) {
                    return;
                }
                d(this.f24855l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f24857n != z10) {
            this.f24857n = z10;
            if (z10 && !this.f24856m) {
                e(this.f24858o + 1);
            } else {
                if (z10 || this.f24856m) {
                    return;
                }
                e(this.f24858o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f24856m != z10) {
            this.f24856m = z10;
            if (z10 && !this.f24857n) {
                e(this.f24858o + 1);
            } else {
                if (z10 || this.f24857n) {
                    return;
                }
                e(this.f24858o - 1);
            }
        }
    }

    public final void j() {
        y0 y0Var = this.f24859p;
        i0 i0Var = y0Var.f24960g;
        Object obj = y0Var.f24968q;
        f0 f0Var = this.f24846a;
        if ((obj != null || i0Var.a().t() != null) && y0Var.f24967p) {
            y0Var.f24967p = false;
            y0Var.f24968q = i0Var.a().t();
            f0 f0VarC = f0Var.C();
            if (f0VarC != null) {
                f0.n0(f0VarC, false, 7);
            }
        }
        s0 s0Var = this.f24860q;
        if (s0Var != null) {
            i0 i0Var2 = s0Var.f24918g;
            if (s0Var.f24932w == null) {
                n0 n0VarT0 = i0Var2.a().t0();
                br.l.b(n0VarT0);
                if (n0VarT0.f24889o.t() == null) {
                    return;
                }
            }
            if (s0Var.f24931v) {
                s0Var.f24931v = false;
                n0 n0VarT02 = i0Var2.a().t0();
                br.l.b(n0VarT02);
                s0Var.f24932w = n0VarT02.f24889o.t();
                if (k.o(f0Var)) {
                    f0 f0VarC2 = f0Var.C();
                    if (f0VarC2 != null) {
                        f0.n0(f0VarC2, false, 7);
                        return;
                    }
                    return;
                }
                f0 f0VarC3 = f0Var.C();
                if (f0VarC3 != null) {
                    f0.l0(f0VarC3, false, 7);
                }
            }
        }
    }
}
