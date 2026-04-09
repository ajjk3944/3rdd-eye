package A9;

import b9.C1992A;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import t4.C5606d;

/* renamed from: A9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0575f {
    public static L0 a() {
        return new L0(null);
    }

    public static M b(E e4, A a10, p9.p pVar, int i) {
        InterfaceC4350h interfaceC4350h = a10;
        if ((i & 1) != 0) {
            interfaceC4350h = C4351i.f37871b;
        }
        G g10 = G.DEFAULT;
        InterfaceC4350h interfaceC4350hB = C0609x.b(e4, interfaceC4350h);
        M b02 = g10.isLazy() ? new B0(interfaceC4350hB, pVar) : new M(interfaceC4350hB, true, true);
        g10.invoke(pVar, b02, b02);
        return b02;
    }

    public static final A c(Executor executor) {
        T t10 = executor instanceof T ? (T) executor : null;
        return t10 != null ? t10.f209b : new C0578g0(executor);
    }

    public static final K0 d(E e4, InterfaceC4350h interfaceC4350h, G g10, p9.p pVar) {
        InterfaceC4350h interfaceC4350hB = C0609x.b(e4, interfaceC4350h);
        K0 c02 = g10.isLazy() ? new C0(interfaceC4350hB, pVar) : new K0(interfaceC4350hB, true, true);
        g10.invoke(pVar, c02, c02);
        return c02;
    }

    public static /* synthetic */ K0 e(E e4, InterfaceC4350h interfaceC4350h, G g10, p9.p pVar, int i) {
        if ((i & 1) != 0) {
            interfaceC4350h = C4351i.f37871b;
        }
        if ((i & 2) != 0) {
            g10 = G.DEFAULT;
        }
        return d(e4, interfaceC4350h, g10, pVar);
    }

    public static final void f(C0583j c0583j, InterfaceC4347e interfaceC4347e, boolean z10) {
        Object obj = C0583j.f251h.get(c0583j);
        Throwable thD = c0583j.d(obj);
        Object objA = thD != null ? b9.n.a(thD) : c0583j.e(obj);
        if (!z10) {
            interfaceC4347e.resumeWith(objA);
            return;
        }
        kotlin.jvm.internal.l.d(interfaceC4347e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        F9.i iVar = (F9.i) interfaceC4347e;
        h9.c cVar = iVar.f1756f;
        InterfaceC4350h context = cVar.getContext();
        Object objC = F9.A.c(context, iVar.f1758h);
        S0<?> s0C = objC != F9.A.f1727a ? C0609x.c(cVar, context, objC) : null;
        try {
            cVar.resumeWith(objA);
            C1992A c1992a = C1992A.f18074a;
            if (s0C == null || s0C.f0()) {
                F9.A.a(context, objC);
            }
        } catch (Throwable th) {
            if (s0C == null || s0C.f0()) {
                F9.A.a(context, objC);
            }
            throw th;
        }
    }

    public static final Object g(InterfaceC4350h interfaceC4350h, p9.p pVar) throws Throwable {
        AbstractC0566a0 abstractC0566a0A;
        InterfaceC4350h interfaceC4350hA;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC4348f.a aVar = InterfaceC4348f.a.f37870b;
        InterfaceC4348f interfaceC4348f = (InterfaceC4348f) interfaceC4350h.get(aVar);
        C4351i c4351i = C4351i.f37871b;
        if (interfaceC4348f == null) {
            abstractC0566a0A = N0.a();
            interfaceC4350hA = C0609x.a(c4351i, interfaceC4350h.plus(abstractC0566a0A), true);
            I9.c cVar = U.f211a;
            if (interfaceC4350hA != cVar && interfaceC4350hA.get(aVar) == null) {
                interfaceC4350hA = interfaceC4350hA.plus(cVar);
            }
        } else {
            if (interfaceC4348f instanceof AbstractC0566a0) {
            }
            abstractC0566a0A = N0.f198a.get();
            interfaceC4350hA = C0609x.a(c4351i, interfaceC4350h, true);
            I9.c cVar2 = U.f211a;
            if (interfaceC4350hA != cVar2 && interfaceC4350hA.get(aVar) == null) {
                interfaceC4350hA = interfaceC4350hA.plus(cVar2);
            }
        }
        C0571d c0571d = new C0571d(interfaceC4350hA, threadCurrentThread, abstractC0566a0A);
        G.DEFAULT.invoke(pVar, c0571d, c0571d);
        AbstractC0566a0 abstractC0566a0 = c0571d.f240f;
        if (abstractC0566a0 != null) {
            int i = AbstractC0566a0.f220f;
            abstractC0566a0.T0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jU0 = abstractC0566a0 != null ? abstractC0566a0.U0() : Long.MAX_VALUE;
                if (!(c0571d.L() instanceof InterfaceC0584j0)) {
                    if (abstractC0566a0 != null) {
                        int i10 = AbstractC0566a0.f220f;
                        abstractC0566a0.R0(false);
                    }
                    Object objB = A0.b(c0571d.L());
                    C0602t c0602t = objB instanceof C0602t ? (C0602t) objB : null;
                    if (c0602t == null) {
                        return objB;
                    }
                    throw c0602t.f272a;
                }
                LockSupport.parkNanos(c0571d, jU0);
            } catch (Throwable th) {
                if (abstractC0566a0 != null) {
                    int i11 = AbstractC0566a0.f220f;
                    abstractC0566a0.R0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0571d.u(interruptedException);
        throw interruptedException;
    }

    public static final Object h(InterfaceC4350h interfaceC4350h, p9.p pVar, InterfaceC4347e interfaceC4347e) throws Throwable {
        Object objB;
        InterfaceC4350h context = interfaceC4347e.getContext();
        InterfaceC4350h interfaceC4350hPlus = !((Boolean) interfaceC4350h.fold(Boolean.FALSE, C0610y.f299g)).booleanValue() ? context.plus(interfaceC4350h) : C0609x.a(context, interfaceC4350h, false);
        C0572d0.c(interfaceC4350hPlus);
        if (interfaceC4350hPlus == context) {
            F9.v vVar = new F9.v(interfaceC4347e, interfaceC4350hPlus);
            objB = A2.l.E(vVar, vVar, pVar);
        } else {
            InterfaceC4348f.a aVar = InterfaceC4348f.a.f37870b;
            if (kotlin.jvm.internal.l.b(interfaceC4350hPlus.get(aVar), context.get(aVar))) {
                S0 s02 = new S0(interfaceC4347e, interfaceC4350hPlus);
                InterfaceC4350h interfaceC4350h2 = s02.f219d;
                Object objC = F9.A.c(interfaceC4350h2, null);
                try {
                    Object objE = A2.l.E(s02, s02, pVar);
                    F9.A.a(interfaceC4350h2, objC);
                    objB = objE;
                } catch (Throwable th) {
                    F9.A.a(interfaceC4350h2, objC);
                    throw th;
                }
            } else {
                Q q10 = new Q(interfaceC4347e, interfaceC4350hPlus);
                C5606d.D(pVar, q10, q10);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Q.f201f;
                    int i = atomicIntegerFieldUpdater.get(q10);
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = A0.b(q10.L());
                        if (objB instanceof C0602t) {
                            throw ((C0602t) objB).f272a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(q10, 0, 1)) {
                        objB = g9.a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        return objB;
    }
}
