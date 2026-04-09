package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u03 extends y62 implements hn2 {
    public z62 f;
    public wy0 g;

    public final synchronized void C3(c23 c23Var) {
        this.f = c23Var;
    }

    @Override // defpackage.z62
    public final synchronized void F1(nx2 nx2Var) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.F1(nx2Var);
        }
    }

    @Override // defpackage.z62
    public final synchronized void G0() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.G0();
        }
    }

    @Override // defpackage.z62
    public final synchronized void K0(nx2 nx2Var) {
        wy0 wy0Var = this.g;
        if (wy0Var != null) {
            synchronized (wy0Var) {
                if (!wy0Var.f) {
                    wy0Var.f = true;
                    wy0Var.j(nx2Var);
                }
            }
        }
    }

    @Override // defpackage.z62
    public final synchronized void b() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.b();
        }
    }

    @Override // defpackage.z62
    public final synchronized void b0() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.b0();
        }
    }

    @Override // defpackage.z62
    public final synchronized void c() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.c();
        }
    }

    @Override // defpackage.z62
    public final synchronized void c3(p22 p22Var, String str) {
    }

    @Override // defpackage.z62
    public final synchronized void f() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.f();
        }
    }

    @Override // defpackage.z62
    public final synchronized void f0(int i) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.f0(i);
        }
    }

    @Override // defpackage.z62
    public final synchronized void g() {
        try {
            z62 z62Var = this.f;
            if (z62Var != null) {
                z62Var.g();
            }
            wy0 wy0Var = this.g;
            if (wy0Var != null) {
                synchronized (wy0Var) {
                    ((pd2) wy0Var.h).a(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.z62
    public final synchronized void h0() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.h0();
        }
    }

    @Override // defpackage.z62
    public final synchronized void i0(String str) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.i0(str);
        }
    }

    @Override // defpackage.z62
    public final synchronized void j() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.j();
        }
    }

    @Override // defpackage.z62
    public final synchronized void j0() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.j0();
        }
    }

    @Override // defpackage.z62
    public final synchronized void k() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.k();
        }
    }

    @Override // defpackage.hn2
    public final synchronized void l1(wy0 wy0Var) {
        this.g = wy0Var;
    }

    @Override // defpackage.z62
    public final synchronized void l2(va2 va2Var) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.l2(va2Var);
        }
    }

    @Override // defpackage.z62
    public final synchronized void m0(int i) {
        wy0 wy0Var = this.g;
        if (wy0Var != null) {
            wy0Var.e(i);
        }
    }

    @Override // defpackage.z62
    public final synchronized void p() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.p();
        }
    }

    @Override // defpackage.z62
    public final synchronized void r3(ta2 ta2Var) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.r3(ta2Var);
        }
    }

    @Override // defpackage.z62
    public final synchronized void v2(String str, String str2) {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.v2(str, str2);
        }
    }

    @Override // defpackage.z62
    public final synchronized void w0(String str, int i) {
        wy0 wy0Var = this.g;
        if (wy0Var != null) {
            synchronized (wy0Var) {
                try {
                    if (!wy0Var.f) {
                        wy0Var.f = true;
                        if (str == null) {
                            str = b23.c(((c03) wy0Var.g).a, i);
                        }
                        wy0Var.j(new nx2(i, str, "undefined", null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.z62
    public final synchronized void x() {
        z62 z62Var = this.f;
        if (z62Var != null) {
            z62Var.x();
        }
    }
}
