package xk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b1 extends cl.k implements i0, v0 {

    /* renamed from: d, reason: collision with root package name */
    public f1 f37171d;

    @Override // xk.i0
    public final void a() {
        f1 f1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f37187a;
            Object obj = atomicReferenceFieldUpdater.get(f1VarJ);
            if (obj instanceof b1) {
                if (obj != this) {
                    return;
                }
                k0 k0Var = x.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(f1VarJ, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(f1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof v0) || ((v0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = cl.k.f2924a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof cl.p) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                nk.k.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                cl.k kVar = (cl.k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = cl.k.f2926c;
                cl.p pVar = (cl.p) atomicReferenceFieldUpdater3.get(kVar);
                if (pVar == null) {
                    pVar = new cl.p(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                kVar.f();
                return;
            }
        }
    }

    @Override // xk.v0
    public final boolean c() {
        return true;
    }

    @Override // xk.v0
    public final h1 d() {
        return null;
    }

    public y0 getParent() {
        return j();
    }

    public final f1 j() {
        f1 f1Var = this.f37171d;
        if (f1Var != null) {
            return f1Var;
        }
        nk.k.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // cl.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + x.n(this) + "[job@" + x.n(j()) + ']';
    }
}
