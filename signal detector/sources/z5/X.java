package z5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class X extends E5.k implements E, O, p5.l {

    /* renamed from: d, reason: collision with root package name */
    public c0 f24508d;

    @Override // z5.O
    public final boolean a() {
        return true;
    }

    @Override // z5.O
    public final d0 e() {
        return null;
    }

    @Override // z5.E
    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c0 c0VarN = n();
        while (true) {
            Object objY = c0VarN.y();
            if (objY instanceof X) {
                if (objY != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c0.f24523a;
                F f2 = AbstractC3046w.f24566j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0VarN, objY, f2)) {
                    if (atomicReferenceFieldUpdater2.get(c0VarN) != objY) {
                        break;
                    }
                }
                return;
            }
            if (!(objY instanceof O) || ((O) objY).e() == null) {
                return;
            }
            while (true) {
                Object objK = k();
                if (objK instanceof E5.q) {
                    E5.k kVar = ((E5.q) objK).f1410a;
                    return;
                }
                if (objK == this) {
                    return;
                }
                q5.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                E5.k kVar2 = (E5.k) objK;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = E5.k.f1399c;
                E5.q qVar = (E5.q) atomicReferenceFieldUpdater3.get(kVar2);
                if (qVar == null) {
                    qVar = new E5.q(kVar2);
                    atomicReferenceFieldUpdater3.set(kVar2, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = E5.k.f1397a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objK, qVar)) {
                        kVar2.i();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objK);
            }
        }
    }

    public T getParent() {
        return n();
    }

    public final c0 n() {
        c0 c0Var = this.f24508d;
        if (c0Var != null) {
            return c0Var;
        }
        q5.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // E5.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3046w.h(this) + "[job@" + AbstractC3046w.h(n()) + ']';
    }
}
