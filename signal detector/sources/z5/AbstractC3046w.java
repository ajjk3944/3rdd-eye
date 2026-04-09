package z5;

import c5.C0409f;
import c5.C0412i;
import h5.C2369c;
import h5.C2371e;
import h5.C2376j;
import h5.InterfaceC2370d;
import h5.InterfaceC2372f;
import h5.InterfaceC2373g;
import h5.InterfaceC2375i;
import i5.EnumC2380a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: z5.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3046w {

    /* renamed from: a, reason: collision with root package name */
    public static final B2.a f24558a;

    /* renamed from: b, reason: collision with root package name */
    public static final B2.a f24559b;

    /* renamed from: c, reason: collision with root package name */
    public static final B2.a f24560c;

    /* renamed from: d, reason: collision with root package name */
    public static final B2.a f24561d;

    /* renamed from: e, reason: collision with root package name */
    public static final B2.a f24562e;

    /* renamed from: f, reason: collision with root package name */
    public static final B2.a f24563f;

    /* renamed from: g, reason: collision with root package name */
    public static final B2.a f24564g;

    /* renamed from: h, reason: collision with root package name */
    public static final B2.a f24565h;
    public static final F i = new F(false);

    /* renamed from: j, reason: collision with root package name */
    public static final F f24566j = new F(true);

    static {
        int i3 = 1;
        f24558a = new B2.a("RESUME_TOKEN", i3);
        f24559b = new B2.a("REMOVED_TASK", i3);
        f24560c = new B2.a("CLOSED_EMPTY", i3);
        f24561d = new B2.a("COMPLETING_ALREADY", i3);
        f24562e = new B2.a("COMPLETING_WAITING_CHILDREN", i3);
        f24563f = new B2.a("COMPLETING_RETRY", i3);
        f24564g = new B2.a("TOO_LATE_TO_CANCEL", i3);
        f24565h = new B2.a("SEALED", i3);
    }

    public static final E5.e a(InterfaceC2375i interfaceC2375i) {
        if (interfaceC2375i.h(C3043t.f24555b) == null) {
            interfaceC2375i = interfaceC2375i.m(new W());
        }
        return new E5.e(interfaceC2375i);
    }

    public static final E5.e b() {
        C2369c c2369c;
        InterfaceC2375i h0Var = new h0();
        G5.e eVar = D.f24485a;
        A5.d dVar = E5.o.f1409a;
        q5.i.e(dVar, "context");
        C2376j c2376j = C2376j.f20486a;
        if (dVar != c2376j) {
            InterfaceC2375i interfaceC2375iN = h0Var.n(dVar.getKey());
            if (interfaceC2375iN == c2376j) {
                h0Var = dVar;
            } else {
                C2371e c2371e = C2371e.f20485a;
                InterfaceC2372f interfaceC2372f = (InterfaceC2372f) interfaceC2375iN.h(c2371e);
                if (interfaceC2372f == null) {
                    c2369c = new C2369c(interfaceC2375iN, dVar);
                } else {
                    InterfaceC2375i interfaceC2375iN2 = interfaceC2375iN.n(c2371e);
                    if (interfaceC2375iN2 == c2376j) {
                        h0Var = new C2369c(dVar, interfaceC2372f);
                    } else {
                        c2369c = new C2369c(new C2369c(interfaceC2375iN2, dVar), interfaceC2372f);
                    }
                }
                h0Var = c2369c;
            }
        }
        return new E5.e(h0Var);
    }

    public static C3049z c(E5.e eVar, p5.p pVar) {
        boolean z6 = true;
        InterfaceC2375i interfaceC2375iG = g(eVar.k(), C2376j.f20486a, true);
        G5.e eVar2 = D.f24485a;
        if (interfaceC2375iG != eVar2 && interfaceC2375iG.h(C2371e.f20485a) == null) {
            interfaceC2375iG = interfaceC2375iG.m(eVar2);
        }
        C3049z c3049z = new C3049z(interfaceC2375iG, z6, 0);
        c3049z.N(EnumC3045v.f24556a, c3049z, pVar);
        return c3049z;
    }

    public static final void d(InterfaceC2375i interfaceC2375i, CancellationException cancellationException) {
        T t6 = (T) interfaceC2375i.h(C3043t.f24555b);
        if (t6 != null) {
            c0 c0Var = (c0) t6;
            if (cancellationException == null) {
                cancellationException = new U(c0Var.p(), null, c0Var);
            }
            c0Var.j(cancellationException);
        }
    }

    public static final Object e(long j6, j5.g gVar) {
        if (j6 > 0) {
            C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(gVar));
            c3030f.t();
            if (j6 < Long.MAX_VALUE) {
                InterfaceC2373g interfaceC2373gH = c3030f.f24532e.h(C2371e.f20485a);
                A a6 = interfaceC2373gH instanceof A ? (A) interfaceC2373gH : null;
                if (a6 == null) {
                    a6 = AbstractC3048y.f24568a;
                }
                a6.b(j6, c3030f);
            }
            Object objS = c3030f.s();
            if (objS == EnumC2380a.f20635a) {
                return objS;
            }
        }
        return C0412i.f5929a;
    }

    public static final void f(InterfaceC2375i interfaceC2375i) {
        T t6 = (T) interfaceC2375i.h(C3043t.f24555b);
        if (t6 != null && !t6.a()) {
            throw ((c0) t6).u();
        }
    }

    public static final InterfaceC2375i g(InterfaceC2375i interfaceC2375i, InterfaceC2375i interfaceC2375i2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        C3040p c3040p = C3040p.f24548d;
        boolean zBooleanValue = ((Boolean) interfaceC2375i.o(bool, c3040p)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC2375i2.o(bool, c3040p)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC2375i.m(interfaceC2375i2);
        }
        C3040p c3040p2 = new C3040p(2, 2);
        C2376j c2376j = C2376j.f20486a;
        InterfaceC2375i interfaceC2375i3 = (InterfaceC2375i) interfaceC2375i.o(c2376j, c3040p2);
        Object objO = interfaceC2375i2;
        if (zBooleanValue2) {
            objO = interfaceC2375i2.o(c2376j, C3040p.f24547c);
        }
        return interfaceC2375i3.m((InterfaceC2375i) objO);
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C3030f i(InterfaceC2370d interfaceC2370d) {
        C3030f c3030f;
        C3030f c3030f2;
        if (!(interfaceC2370d instanceof E5.h)) {
            return new C3030f(1, interfaceC2370d);
        }
        E5.h hVar = (E5.h) interfaceC2370d;
        B2.a aVar = E5.a.f1375d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.h.f1385h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c3030f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c3030f2 = null;
                break;
            }
            if (obj instanceof C3030f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c3030f2 = (C3030f) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c3030f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3030f.f24529g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c3030f2);
            if (!(obj2 instanceof C3037m) || ((C3037m) obj2).f24542d == null) {
                C3030f.f24528f.set(c3030f2, 536870911);
                atomicReferenceFieldUpdater2.set(c3030f2, C3026b.f24518a);
                c3030f = c3030f2;
            } else {
                c3030f2.p();
            }
            if (c3030f != null) {
                return c3030f;
            }
        }
        return new C3030f(2, interfaceC2370d);
    }

    public static final void j(InterfaceC2375i interfaceC2375i, Throwable th) {
        try {
            A5.b bVar = (A5.b) interfaceC2375i.h(C3043t.f24554a);
            if (bVar != null) {
                bVar.d(th);
            } else {
                E5.a.c(interfaceC2375i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.bumptech.glide.e.b(runtimeException, th);
                th = runtimeException;
            }
            E5.a.c(interfaceC2375i, th);
        }
    }

    public static C3049z l(InterfaceC3044u interfaceC3044u, InterfaceC2375i interfaceC2375i, p5.p pVar, int i3) {
        boolean z6 = true;
        if ((i3 & 1) != 0) {
            interfaceC2375i = C2376j.f20486a;
        }
        InterfaceC2375i interfaceC2375iG = g(interfaceC3044u.k(), interfaceC2375i, true);
        G5.e eVar = D.f24485a;
        if (interfaceC2375iG != eVar && interfaceC2375iG.h(C2371e.f20485a) == null) {
            interfaceC2375iG = interfaceC2375iG.m(eVar);
        }
        C3049z c3049z = new C3049z(interfaceC2375iG, z6, 1);
        c3049z.N(EnumC3045v.f24556a, c3049z, pVar);
        return c3049z;
    }

    public static final Object m(Object obj) {
        return obj instanceof C3038n ? R2.a.d(((C3038n) obj).f24546a) : obj;
    }

    public static final void n(C3030f c3030f, InterfaceC2370d interfaceC2370d, boolean z6) {
        Object obj = C3030f.f24529g.get(c3030f);
        Throwable thF = c3030f.f(obj);
        Object objD = thF != null ? R2.a.d(thF) : c3030f.h(obj);
        if (!z6) {
            interfaceC2370d.e(objD);
            return;
        }
        q5.i.c(interfaceC2370d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        E5.h hVar = (E5.h) interfaceC2370d;
        j5.b bVar = hVar.f1387e;
        Object obj2 = hVar.f1389g;
        InterfaceC2375i context = bVar.getContext();
        Object objK = E5.a.k(context, obj2);
        l0 l0VarQ = objK != E5.a.f1377f ? q(bVar, context, objK) : null;
        try {
            bVar.e(objD);
            if (l0VarQ == null || l0VarQ.O()) {
                E5.a.f(context, objK);
            }
        } catch (Throwable th) {
            if (l0VarQ == null || l0VarQ.O()) {
                E5.a.f(context, objK);
            }
            throw th;
        }
    }

    public static final String o(InterfaceC2370d interfaceC2370d) {
        Object objD;
        if (interfaceC2370d instanceof E5.h) {
            return interfaceC2370d.toString();
        }
        try {
            objD = interfaceC2370d + '@' + h(interfaceC2370d);
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (C0409f.a(objD) != null) {
            objD = interfaceC2370d.getClass().getName() + '@' + h(interfaceC2370d);
        }
        return (String) objD;
    }

    public static final Object p(Object obj) {
        O o5;
        P p6 = obj instanceof P ? (P) obj : null;
        return (p6 == null || (o5 = p6.f24501a) == null) ? obj : o5;
    }

    public static final l0 q(InterfaceC2370d interfaceC2370d, InterfaceC2375i interfaceC2375i, Object obj) {
        l0 l0Var = null;
        if ((interfaceC2370d instanceof j5.c) && interfaceC2375i.h(m0.f24544a) != null) {
            j5.c cVarD = (j5.c) interfaceC2370d;
            while (true) {
                if ((cVarD instanceof B) || (cVarD = cVarD.d()) == null) {
                    break;
                }
                if (cVarD instanceof l0) {
                    l0Var = (l0) cVarD;
                    break;
                }
            }
            if (l0Var != null) {
                l0Var.P(interfaceC2375i, obj);
            }
        }
        return l0Var;
    }

    public static final Object r(InterfaceC2375i interfaceC2375i, j5.b bVar, p5.p pVar) throws Throwable {
        InterfaceC2375i context = bVar.getContext();
        InterfaceC2375i interfaceC2375iM = !((Boolean) interfaceC2375i.o(Boolean.FALSE, C3040p.f24548d)).booleanValue() ? context.m(interfaceC2375i) : g(context, interfaceC2375i, false);
        f(interfaceC2375iM);
        if (interfaceC2375iM == context) {
            E5.s sVar = new E5.s(interfaceC2375iM, bVar);
            return T2.g.M(sVar, sVar, pVar);
        }
        C2371e c2371e = C2371e.f20485a;
        if (q5.i.a(interfaceC2375iM.h(c2371e), context.h(c2371e))) {
            l0 l0Var = new l0(interfaceC2375iM, bVar);
            InterfaceC2375i interfaceC2375i2 = l0Var.f24513c;
            Object objK = E5.a.k(interfaceC2375i2, null);
            try {
                return T2.g.M(l0Var, l0Var, pVar);
            } finally {
                E5.a.f(interfaceC2375i2, objK);
            }
        }
        B b5 = new B(interfaceC2375iM, bVar);
        R3.b.y(pVar, b5, b5);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B.f24483e;
        do {
            int i3 = atomicIntegerFieldUpdater.get(b5);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objP = p(b5.y());
                if (objP instanceof C3038n) {
                    throw ((C3038n) objP).f24546a;
                }
                return objP;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(b5, 0, 1));
        return EnumC2380a.f20635a;
    }
}
