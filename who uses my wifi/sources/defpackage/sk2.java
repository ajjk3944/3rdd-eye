package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sk2 implements ov1 {
    public final ag2 f;
    public final Executor g;
    public final AtomicReference h = new AtomicReference();

    public sk2(ag2 ag2Var, Executor executor) {
        this.f = ag2Var;
        this.g = executor;
    }

    @Override // defpackage.ov1
    public final synchronized void S0(nv1 nv1Var) {
        ag2 ag2Var = this.f;
        if (ag2Var != null) {
            if (((Boolean) tw1.e.c.a(mz1.sd)).booleanValue()) {
                if (nv1Var.j) {
                    AtomicReference atomicReference = this.h;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.g.execute(new ig2(ag2Var, 3));
                    }
                } else {
                    AtomicReference atomicReference2 = this.h;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.g.execute(new ig2(ag2Var, 2));
                    }
                }
            }
        }
    }
}
