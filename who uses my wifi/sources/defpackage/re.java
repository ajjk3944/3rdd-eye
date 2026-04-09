package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class re extends y30 {
    public final kd j;

    public re(kd kdVar) {
        this.j = kdVar;
    }

    @Override // defpackage.f30
    public final void d(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g40 g40VarK = k();
        kd kdVar = this.j;
        Throwable thS = kdVar.s(g40VarK);
        if (kdVar.x()) {
            oj ojVar = kdVar.i;
            i30.k(ojVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            cp cpVar = (cp) ojVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cp.m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cpVar);
                gs3 gs3Var = pu1.i;
                if (!i30.c(obj, gs3Var)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cpVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(cpVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(cpVar, gs3Var, thS)) {
                    if (atomicReferenceFieldUpdater.get(cpVar) != gs3Var) {
                        break;
                    }
                }
                return;
            }
        }
        kdVar.p(thS);
        if (kdVar.x()) {
            return;
        }
        kdVar.q();
    }
}
