package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w03 extends ra2 implements hn2 {
    public y13 f;
    public wy0 g;
    public mc2 h;

    @Override // defpackage.sa2
    public final synchronized void D(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.h.U1();
        }
    }

    @Override // defpackage.sa2
    public final synchronized void L2(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.g.C();
        }
    }

    @Override // defpackage.sa2
    public final synchronized void M(u10 u10Var) {
        wy0 wy0Var = this.g;
        if (wy0Var != null) {
            synchronized (wy0Var) {
                ((pd2) wy0Var.h).a(null);
            }
        }
    }

    @Override // defpackage.sa2
    public final synchronized void R(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.f.f();
        }
    }

    @Override // defpackage.sa2
    public final synchronized void W1(u10 u10Var) {
        mc2 mc2Var = this.h;
        if (mc2Var != null) {
            c03 c03Var = (c03) mc2Var.i;
            ((t13) mc2Var.j).c.execute(new gi((h83) mc2Var.g, (a83) mc2Var.h, c03Var, 20));
        }
    }

    @Override // defpackage.sa2
    public final synchronized void a3(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.i.T(null);
        }
    }

    @Override // defpackage.sa2
    public final synchronized void d0(u10 u10Var, int i) {
        mc2 mc2Var = this.h;
        if (mc2Var != null) {
            gi2.i0("Fail to initialize adapter ".concat(String.valueOf(((c03) mc2Var.i).a)));
        }
    }

    @Override // defpackage.sa2
    public final synchronized void k2(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.h.P1(qd2.k);
        }
    }

    @Override // defpackage.hn2
    public final synchronized void l1(wy0 wy0Var) {
        this.g = wy0Var;
    }

    @Override // defpackage.sa2
    public final synchronized void o1(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.o1(u10Var);
        }
    }

    @Override // defpackage.sa2
    public final synchronized void r0(u10 u10Var, ta2 ta2Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.i.T(ta2Var);
        }
    }

    @Override // defpackage.sa2
    public final synchronized void s3(u10 u10Var, int i) {
        wy0 wy0Var = this.g;
        if (wy0Var != null) {
            wy0Var.e(i);
        }
    }

    @Override // defpackage.sa2
    public final synchronized void z0(u10 u10Var) {
        y13 y13Var = this.f;
        if (y13Var != null) {
            y13Var.i.a();
        }
    }
}
