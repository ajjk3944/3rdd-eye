package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gq2 implements ye4, fd1 {
    public final uu2 f;
    public final c83 g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public gq2(uu2 uu2Var, c83 c83Var) {
        this.f = uu2Var;
        this.g = c83Var;
    }

    @Override // defpackage.fd1
    public final void C() {
        uu2 uu2Var = this.f;
        if (uu2Var.b.get()) {
            mu2 mu2Var = uu2Var.a;
            mu2Var.getClass();
            gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 1), 3);
        }
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        a();
    }

    @Override // defpackage.ye4
    public final void M1() {
        a();
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        uu2 uu2Var = this.f;
        if (uu2Var.b.getAndSet(false)) {
            mu2 mu2Var = uu2Var.a;
            mu2Var.getClass();
            gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 2), 3);
        }
    }

    @Override // defpackage.ye4
    public final void f() {
        String str = this.g.b;
        boolean zS = yc0.s(str);
        uu2 uu2Var = this.f;
        if (zS) {
            uu2Var.getClass();
            return;
        }
        if (!uu2Var.c.get() || uu2Var.b.getAndSet(true)) {
            return;
        }
        mu2 mu2Var = uu2Var.a;
        mu2Var.getClass();
        i30.m(str, "gwsQueryId");
        gi2.q((mj) mu2Var.c, null, new km(mu2Var, str, null, 7), 3);
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void R2() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }
}
