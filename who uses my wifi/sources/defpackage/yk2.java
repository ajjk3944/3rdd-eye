package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yk2 implements rn2, ov1, to2 {
    public final a83 f;
    public final cn2 g;
    public final vn2 h;
    public final co2 k;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean l = new AtomicBoolean();

    public yk2(a83 a83Var, cn2 cn2Var, vn2 vn2Var, co2 co2Var) {
        this.f = a83Var;
        this.g = cn2Var;
        this.h = vn2Var;
        this.k = co2Var;
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        int i = this.f.e;
        if (i == 1) {
            if (nv1Var.j && this.i.compareAndSet(false, true)) {
                this.g.a();
            }
        } else if (i == 4 && nv1Var.j && this.l.compareAndSet(false, true)) {
            this.k.a();
        }
        if (nv1Var.j && this.j.compareAndSet(false, true)) {
            vn2 vn2Var = this.h;
            synchronized (vn2Var) {
                vn2Var.P1(qd2.m);
            }
        }
    }

    @Override // defpackage.rn2
    public final synchronized void e() {
        int i = this.f.e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.i.compareAndSet(false, true)) {
            this.g.a();
        }
    }

    @Override // defpackage.to2
    public final void p() {
        if (this.f.e == 4 && this.i.compareAndSet(false, true)) {
            this.g.a();
        }
    }

    @Override // defpackage.to2
    public final void w() {
    }
}
