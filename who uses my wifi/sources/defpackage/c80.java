package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class c80 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c80.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new e80(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e80 e80Var = (e80) atomicReferenceFieldUpdater.get(this);
            int iA = e80Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                e80 e80VarC = e80Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, e80Var, e80VarC) && atomicReferenceFieldUpdater.get(this) == e80Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e80 e80Var = (e80) atomicReferenceFieldUpdater.get(this);
            if (e80Var.b()) {
                return;
            }
            e80 e80VarC = e80Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e80Var, e80VarC) && atomicReferenceFieldUpdater.get(this) == e80Var) {
            }
        }
    }

    public final int c() {
        e80 e80Var = (e80) a.get(this);
        e80Var.getClass();
        long j = e80.f.get(e80Var);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e80 e80Var = (e80) atomicReferenceFieldUpdater.get(this);
            Object objD = e80Var.d();
            if (objD != e80.g) {
                return objD;
            }
            e80 e80VarC = e80Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e80Var, e80VarC) && atomicReferenceFieldUpdater.get(this) == e80Var) {
            }
        }
    }
}
