package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class b40 extends b80 implements f30, jp, l20 {
    public g40 i;

    @Override // defpackage.l20
    public final boolean a() {
        return true;
    }

    @Override // defpackage.jp
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g40 g40VarK = k();
        while (true) {
            Object objA = g40VarK.A();
            if (objA instanceof b40) {
                if (objA != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g40.f;
                js jsVar = wl2.h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(g40VarK, objA, jsVar)) {
                    if (atomicReferenceFieldUpdater2.get(g40VarK) != objA) {
                        break;
                    }
                }
                return;
            }
            if (!(objA instanceof l20) || ((l20) objA).e() == null) {
                return;
            }
            while (true) {
                Object objH = h();
                if (objH instanceof ip0) {
                    return;
                }
                if (objH == this) {
                    return;
                }
                i30.k(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                b80 b80Var = (b80) objH;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b80.h;
                ip0 ip0Var = (ip0) atomicReferenceFieldUpdater3.get(b80Var);
                if (ip0Var == null) {
                    ip0Var = new ip0(b80Var);
                    atomicReferenceFieldUpdater3.set(b80Var, ip0Var);
                }
                do {
                    atomicReferenceFieldUpdater = b80.f;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objH, ip0Var)) {
                        b80Var.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objH);
            }
        }
    }

    @Override // defpackage.l20
    public final oh0 e() {
        return null;
    }

    public w30 getParent() {
        return k();
    }

    public final g40 k() {
        g40 g40Var = this.i;
        if (g40Var != null) {
            return g40Var;
        }
        i30.S("job");
        throw null;
    }

    @Override // defpackage.b80
    public final String toString() {
        return getClass().getSimpleName() + '@' + um.k(this) + "[job@" + um.k(k()) + ']';
    }
}
