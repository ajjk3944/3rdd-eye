package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f25674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25675b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25676c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25678e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25679f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f25680h;

    /* renamed from: i, reason: collision with root package name */
    public int f25681i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25682k;

    /* renamed from: l, reason: collision with root package name */
    public int f25683l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25684m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25685n;

    /* renamed from: o, reason: collision with root package name */
    public int f25686o;

    /* renamed from: q, reason: collision with root package name */
    public q0 f25688q;

    /* renamed from: d, reason: collision with root package name */
    public a0 f25677d = a0.f25571e;

    /* renamed from: p, reason: collision with root package name */
    public final u0 f25687p = new u0(this);

    public i0(e0 e0Var) {
        this.f25674a = e0Var;
    }

    public final d1 a() {
        return (d1) this.f25674a.G.f19258e;
    }

    public final void b() {
        a0 a0Var = this.f25674a.H.f25677d;
        a0 a0Var2 = a0.f25569c;
        a0 a0Var3 = a0.f25570d;
        if (a0Var == a0Var2 || a0Var == a0Var3) {
            if (this.f25687p.A) {
                g(true);
            } else {
                f(true);
            }
        }
        if (a0Var == a0Var3) {
            q0 q0Var = this.f25688q;
            if (q0Var == null || !q0Var.f25754u) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        q0 q0Var = this.f25688q;
        if (q0Var != null) {
            i0 i0Var = q0Var.f25741f;
            i0Var.f25677d = a0.f25568b;
            u0 u0Var = i0Var.f25687p;
            e0 e0Var = i0Var.f25674a;
            i0Var.f25678e = false;
            q0Var.f25758y = j;
            o1 snapshotObserver = ((j2.r) h0.a(e0Var)).getSnapshotObserver();
            p0 p0Var = q0Var.f25759z;
            snapshotObserver.f25732a.b(e0Var, snapshotObserver.f25733b, p0Var);
            i0Var.f25679f = true;
            i0Var.g = true;
            if (k.o(e0Var)) {
                u0Var.f25800v = true;
                u0Var.f25801w = true;
            } else {
                u0Var.f25799u = true;
            }
            i0Var.f25677d = a0.f25571e;
        }
    }

    public final void d(int i4) {
        int i10 = this.f25683l;
        this.f25683l = i4;
        if ((i10 == 0) != (i4 == 0)) {
            e0 e0VarV = this.f25674a.v();
            i0 i0Var = e0VarV != null ? e0VarV.H : null;
            if (i0Var != null) {
                if (i4 == 0) {
                    i0Var.d(i0Var.f25683l - 1);
                } else {
                    i0Var.d(i0Var.f25683l + 1);
                }
            }
        }
    }

    public final void e(int i4) {
        int i10 = this.f25686o;
        this.f25686o = i4;
        if ((i10 == 0) != (i4 == 0)) {
            e0 e0VarV = this.f25674a.v();
            i0 i0Var = e0VarV != null ? e0VarV.H : null;
            if (i0Var != null) {
                if (i4 == 0) {
                    i0Var.e(i0Var.f25686o - 1);
                } else {
                    i0Var.e(i0Var.f25686o + 1);
                }
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f25682k != z3) {
            this.f25682k = z3;
            if (z3 && !this.j) {
                d(this.f25683l + 1);
            } else {
                if (z3 || this.j) {
                    return;
                }
                d(this.f25683l - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.j != z3) {
            this.j = z3;
            if (z3 && !this.f25682k) {
                d(this.f25683l + 1);
            } else {
                if (z3 || this.f25682k) {
                    return;
                }
                d(this.f25683l - 1);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f25685n != z3) {
            this.f25685n = z3;
            if (z3 && !this.f25684m) {
                e(this.f25686o + 1);
            } else {
                if (z3 || this.f25684m) {
                    return;
                }
                e(this.f25686o - 1);
            }
        }
    }

    public final void i(boolean z3) {
        if (this.f25684m != z3) {
            this.f25684m = z3;
            if (z3 && !this.f25685n) {
                e(this.f25686o + 1);
            } else {
                if (z3 || this.f25685n) {
                    return;
                }
                e(this.f25686o - 1);
            }
        }
    }

    public final void j() {
        u0 u0Var = this.f25687p;
        i0 i0Var = u0Var.f25786f;
        Object obj = u0Var.f25796r;
        e0 e0Var = this.f25674a;
        if ((obj != null || i0Var.a().w() != null) && u0Var.f25795q) {
            u0Var.f25795q = false;
            u0Var.f25796r = i0Var.a().w();
            e0 e0VarV = e0Var.v();
            if (e0VarV != null) {
                e0.V(e0VarV, false, 7);
            }
        }
        q0 q0Var = this.f25688q;
        if (q0Var != null) {
            i0 i0Var2 = q0Var.f25741f;
            if (q0Var.f25757x == null) {
                n0 n0VarX0 = i0Var2.a().x0();
                nk.k.b(n0VarX0);
                if (n0VarX0.f25719o.w() == null) {
                    return;
                }
            }
            if (q0Var.f25756w) {
                q0Var.f25756w = false;
                n0 n0VarX02 = i0Var2.a().x0();
                nk.k.b(n0VarX02);
                q0Var.f25757x = n0VarX02.f25719o.w();
                if (k.o(e0Var)) {
                    e0 e0VarV2 = e0Var.v();
                    if (e0VarV2 != null) {
                        e0.V(e0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                e0 e0VarV3 = e0Var.v();
                if (e0VarV3 != null) {
                    e0.T(e0VarV3, false, 7);
                }
            }
        }
    }
}
