package A9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* renamed from: A9.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0603t0 extends F9.m implements InterfaceC0588l0, W, InterfaceC0584j0 {

    /* renamed from: e, reason: collision with root package name */
    public C0605u0 f273e;

    @Override // A9.InterfaceC0584j0
    public final D0 c() {
        return null;
    }

    @Override // A9.W
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        C0605u0 c0605u0I = i();
        while (true) {
            Object objL = c0605u0I.L();
            if (objL instanceof AbstractC0603t0) {
                if (objL != this) {
                    return;
                }
                Z z10 = A0.f181g;
                do {
                    atomicReferenceFieldUpdater2 = C0605u0.f274b;
                    if (atomicReferenceFieldUpdater2.compareAndSet(c0605u0I, objL, z10)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(c0605u0I) == objL);
            } else {
                if (!(objL instanceof InterfaceC0584j0) || ((InterfaceC0584j0) objL).c() == null) {
                    return;
                }
                while (true) {
                    Object objF = f();
                    if (objF instanceof F9.t) {
                        F9.m mVar = ((F9.t) objF).f1783a;
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    kotlin.jvm.internal.l.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    F9.m mVar2 = (F9.m) objF;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = F9.m.f1770d;
                    F9.t tVar = (F9.t) atomicReferenceFieldUpdater3.get(mVar2);
                    if (tVar == null) {
                        tVar = new F9.t(mVar2);
                        atomicReferenceFieldUpdater3.set(mVar2, tVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = F9.m.f1768b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objF, tVar)) {
                            mVar2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objF);
                }
            }
        }
    }

    public InterfaceC0594o0 getParent() {
        return i();
    }

    public final C0605u0 i() {
        C0605u0 c0605u0 = this.f273e;
        if (c0605u0 != null) {
            return c0605u0;
        }
        kotlin.jvm.internal.l.l("job");
        throw null;
    }

    @Override // A9.InterfaceC0584j0
    public final boolean isActive() {
        return true;
    }

    @Override // F9.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + I.x(this) + "[job@" + I.x(i()) + ']';
    }
}
