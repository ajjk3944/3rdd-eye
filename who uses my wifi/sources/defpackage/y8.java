package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class y8 extends nj0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(y8.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a30.i;

    @Override // defpackage.nj0
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        gs3 gs3Var = a30.i;
        if (obj2 == gs3Var) {
            gs3 gs3VarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == gs3Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, gs3Var, gs3VarC)) {
                        obj2 = gs3VarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != gs3Var) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract gs3 c(Object obj);
}
