package F9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes3.dex */
public class n<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1773a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1773a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int iA = oVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                o<E> oVarC = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1773a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o<E> oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) f1773a.get(this);
        oVar.getClass();
        long j4 = o.f1775f.get(oVar);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1773a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            E e4 = (E) oVar.d();
            if (e4 != o.f1776g) {
                return e4;
            }
            o<E> oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
