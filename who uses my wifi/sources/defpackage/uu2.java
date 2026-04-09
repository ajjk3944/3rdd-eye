package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uu2 {
    public final mu2 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public uu2(mu2 mu2Var) {
        this.a = mu2Var;
    }

    public final void a(wy0 wy0Var) {
        this.c.set(true);
        synchronized (wy0Var.g) {
            try {
                if (((vv1) wy0Var.h) == null) {
                    wy0Var.h = new vv1();
                }
                vv1 vv1Var = (vv1) wy0Var.h;
                synchronized (vv1Var.h) {
                    vv1Var.l.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mu2 mu2Var = this.a;
        mu2Var.getClass();
        gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 3), 3);
    }

    public final void b() {
        if (this.b.get()) {
            mu2 mu2Var = this.a;
            mu2Var.getClass();
            gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 5), 3);
        }
    }

    public final void c() {
        if (this.b.get()) {
            mu2 mu2Var = this.a;
            mu2Var.getClass();
            gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 0), 3);
        }
    }

    public final void d() {
        if (this.b.getAndSet(false)) {
            mu2 mu2Var = this.a;
            mu2Var.getClass();
            gi2.q((mj) mu2Var.c, null, new bf3(mu2Var, null, 4), 3);
        }
    }
}
