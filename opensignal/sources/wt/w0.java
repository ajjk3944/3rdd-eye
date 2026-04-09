package wt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class w0 extends bu.j implements e0, p0 {

    /* renamed from: r, reason: collision with root package name */
    public b1 f24671r;

    @Override // wt.e0
    public final void a() {
        b1 b1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.f24604a;
            Object obj = atomicReferenceFieldUpdater.get(b1VarJ);
            if (obj instanceof w0) {
                if (obj != this) {
                    return;
                }
                f0 f0Var = w.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(b1VarJ, obj, f0Var)) {
                    if (atomicReferenceFieldUpdater.get(b1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof p0) || ((p0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bu.j.f2971a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof bu.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                br.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                bu.j jVar = (bu.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = bu.j.f2973g;
                bu.o oVar = (bu.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new bu.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.f();
                return;
            }
        }
    }

    @Override // wt.p0
    public final boolean b() {
        return true;
    }

    @Override // wt.p0
    public final e1 d() {
        return null;
    }

    public t0 getParent() {
        return j();
    }

    public final b1 j() {
        b1 b1Var = this.f24671r;
        if (b1Var != null) {
            return b1Var;
        }
        br.l.l("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // bu.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + w.l(this) + "[job@" + w.l(j()) + ']';
    }
}
