package wt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import lf.t1;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final bu.t f24662a;

    /* renamed from: b, reason: collision with root package name */
    public static final bu.t f24663b;

    /* renamed from: c, reason: collision with root package name */
    public static final bu.t f24664c;

    /* renamed from: d, reason: collision with root package name */
    public static final bu.t f24665d;

    /* renamed from: e, reason: collision with root package name */
    public static final bu.t f24666e;

    /* renamed from: f, reason: collision with root package name */
    public static final bu.t f24667f;

    /* renamed from: g, reason: collision with root package name */
    public static final bu.t f24668g;

    /* renamed from: h, reason: collision with root package name */
    public static final bu.t f24669h;

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f24670i = new f0(false);
    public static final f0 j = new f0(true);

    static {
        int i10 = 0;
        f24662a = new bu.t("RESUME_TOKEN", i10);
        f24663b = new bu.t("REMOVED_TASK", i10);
        f24664c = new bu.t("CLOSED_EMPTY", i10);
        f24665d = new bu.t("COMPLETING_ALREADY", i10);
        f24666e = new bu.t("COMPLETING_WAITING_CHILDREN", i10);
        f24667f = new bu.t("COMPLETING_RETRY", i10);
        f24668g = new bu.t("TOO_LATE_TO_CANCEL", i10);
        f24669h = new bu.t("SEALED", i10);
    }

    public static final o1 A(pq.c cVar, pq.h hVar, Object obj) {
        o1 o1Var = null;
        if ((cVar instanceof rq.d) && hVar.Y(p1.f24649a) != null) {
            rq.d dVarE = (rq.d) cVar;
            while (true) {
                if ((dVarE instanceof b0) || (dVarE = dVarE.e()) == null) {
                    break;
                }
                if (dVarE instanceof o1) {
                    o1Var = (o1) dVarE;
                    break;
                }
            }
            if (o1Var != null) {
                o1Var.c0(hVar, obj);
            }
        }
        return o1Var;
    }

    public static final Object B(pq.h hVar, ar.n nVar, pq.c cVar) throws Throwable {
        Object objZ;
        pq.h hVarM = cVar.m();
        pq.h hVarI0 = !((Boolean) hVar.Z(new wl.a(2), Boolean.FALSE)).booleanValue() ? hVarM.i0(hVar) : k(hVarM, hVar, false);
        i(hVarI0);
        if (hVarI0 == hVarM) {
            bu.q qVar = new bu.q(cVar, hVarI0);
            objZ = xu.d.g0(qVar, qVar, nVar);
        } else {
            pq.d dVar = pq.d.f20620a;
            if (br.l.a(hVarI0.Y(dVar), hVarM.Y(dVar))) {
                o1 o1Var = new o1(cVar, hVarI0);
                pq.h hVar2 = o1Var.f24597g;
                Object objL = bu.a.l(hVar2, null);
                try {
                    Object objG0 = xu.d.g0(o1Var, o1Var, nVar);
                    bu.a.g(hVar2, objL);
                    objZ = objG0;
                } catch (Throwable th2) {
                    bu.a.g(hVar2, objL);
                    throw th2;
                }
            } else {
                b0 b0Var = new b0(cVar, hVarI0);
                try {
                    bu.a.h(lq.b0.f15562a, xu.l.D(xu.l.m(nVar, b0Var, b0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b0.f24603x;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(b0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objZ = z(b1.f24604a.get(b0Var));
                            if (objZ instanceof o) {
                                throw ((o) objZ).f24644a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(b0Var, 0, 1)) {
                            objZ = qq.a.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    b0Var.g(t1.k(th3));
                    throw th3;
                }
            }
        }
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static final Object C(rq.c cVar) {
        Object obj;
        pq.h hVarM = cVar.m();
        i(hVarM);
        pq.c cVarD = xu.l.D(cVar);
        bu.f fVar = cVarD instanceof bu.f ? (bu.f) cVarD : null;
        lq.b0 b0Var = lq.b0.f15562a;
        if (fVar == null) {
            obj = b0Var;
        } else {
            q qVar = fVar.f2963r;
            if (qVar.p0(hVarM)) {
                fVar.f2965y = b0Var;
                fVar.f24608g = 1;
                qVar.o0(hVarM, fVar);
            } else {
                pq.h hVarI0 = hVarM.i0(new r1(r1.f24656d));
                fVar.f2965y = b0Var;
                fVar.f24608g = 1;
                qVar.o0(hVarI0, fVar);
            }
            obj = qq.a.COROUTINE_SUSPENDED;
        }
        return obj == qq.a.COROUTINE_SUSPENDED ? obj : b0Var;
    }

    public static m a() {
        m mVar = new m(true);
        mVar.F(null);
        return mVar;
    }

    public static final bu.c b(pq.h hVar) {
        if (hVar.Y(r.f24653d) == null) {
            hVar = hVar.i0(new v0(null));
        }
        return new bu.c(hVar);
    }

    public static i1 c() {
        return new i1(null);
    }

    public static z d(bu.c cVar, ar.n nVar) {
        z zVar;
        v vVar = v.DEFAULT;
        pq.h hVarT = t(cVar, pq.i.f20621a);
        if (vVar.isLazy()) {
            zVar = new c1(hVarT, nVar);
        } else {
            zVar = new z(hVarT, true, 0);
        }
        vVar.invoke(nVar, zVar, zVar);
        return zVar;
    }

    public static final void e(pq.h hVar, CancellationException cancellationException) {
        t0 t0Var = (t0) hVar.Y(r.f24653d);
        if (t0Var != null) {
            t0Var.h(cancellationException);
        }
    }

    public static final void f(t tVar, CancellationException cancellationException) {
        t0 t0Var = (t0) tVar.getCoroutineContext().Y(r.f24653d);
        if (t0Var != null) {
            t0Var.h(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + tVar).toString());
        }
    }

    public static final Object g(ar.n nVar, pq.c cVar) {
        bu.q qVar = new bu.q(cVar, cVar.m());
        Object objG0 = xu.d.g0(qVar, qVar, nVar);
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        return objG0;
    }

    public static final Object h(long j7, rq.c cVar) {
        if (j7 > 0) {
            g gVar = new g(1, xu.l.D(cVar));
            gVar.v();
            if (j7 < Long.MAX_VALUE) {
                pq.f fVarY = gVar.f24618x.Y(pq.d.f20620a);
                a0 a0Var = fVarY instanceof a0 ? (a0) fVarY : null;
                if (a0Var == null) {
                    a0Var = y.f24672a;
                }
                a0Var.G(j7, gVar);
            }
            Object objU = gVar.u();
            if (objU == qq.a.COROUTINE_SUSPENDED) {
                return objU;
            }
        }
        return lq.b0.f15562a;
    }

    public static final void i(pq.h hVar) {
        t0 t0Var = (t0) hVar.Y(r.f24653d);
        if (t0Var != null && !t0Var.b()) {
            throw t0Var.y();
        }
    }

    public static final void j(t tVar) {
        i(tVar.getCoroutineContext());
    }

    public static final pq.h k(pq.h hVar, pq.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.Z(new wl.a(2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.Z(new wl.a(2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.i0(hVar2);
        }
        wl.a aVar = new wl.a(3);
        pq.i iVar = pq.i.f20621a;
        pq.h hVar3 = (pq.h) hVar.Z(aVar, iVar);
        Object objZ = hVar2;
        if (zBooleanValue2) {
            objZ = hVar2.Z(new wl.a(4), iVar);
        }
        return hVar3.i0((pq.h) objZ);
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final t0 m(pq.h hVar) {
        t0 t0Var = (t0) hVar.Y(r.f24653d);
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final g n(pq.c cVar) {
        g gVar;
        g gVar2;
        if (!(cVar instanceof bu.f)) {
            return new g(1, cVar);
        }
        bu.f fVar = (bu.f) cVar;
        bu.t tVar = bu.a.f2953c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bu.f.D;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            gVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                gVar2 = null;
                break;
            }
            if (obj instanceof g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                gVar2 = (g) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (gVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g.B;
            Object obj2 = atomicReferenceFieldUpdater2.get(gVar2);
            if (!(obj2 instanceof n) || ((n) obj2).f24639d == null) {
                g.f24616y.set(gVar2, 536870911);
                atomicReferenceFieldUpdater2.set(gVar2, b.f24602a);
                gVar = gVar2;
            } else {
                gVar2.r();
            }
            if (gVar != null) {
                return gVar;
            }
        }
        return new g(2, cVar);
    }

    public static final void o(Throwable th2, pq.h hVar) {
        try {
            s sVar = (s) hVar.Y(r.f24652a);
            if (sVar != null) {
                sVar.L(th2, hVar);
            } else {
                bu.a.d(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ir.f0.c(runtimeException, th2);
                th2 = runtimeException;
            }
            bu.a.d(th2, hVar);
        }
    }

    public static final e0 p(t0 t0Var, boolean z10, w0 w0Var) {
        if (t0Var instanceof b1) {
            return ((b1) t0Var).G(z10, w0Var);
        }
        return t0Var.w(w0Var.k(), z10, new bq.g(1, w0Var, w0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 9));
    }

    public static final boolean q(pq.h hVar) {
        t0 t0Var = (t0) hVar.Y(r.f24653d);
        if (t0Var != null) {
            return t0Var.b();
        }
        return true;
    }

    public static final boolean r(t tVar) {
        t0 t0Var = (t0) tVar.getCoroutineContext().Y(r.f24653d);
        if (t0Var != null) {
            return t0Var.b();
        }
        return true;
    }

    public static z s(t tVar, pq.h hVar, v vVar, ar.n nVar, int i10) {
        z zVar;
        if ((i10 & 1) != 0) {
            hVar = pq.i.f20621a;
        }
        if ((i10 & 2) != 0) {
            vVar = v.DEFAULT;
        }
        pq.h hVarT = t(tVar, hVar);
        if (vVar.isLazy()) {
            zVar = new d1(hVarT, nVar);
        } else {
            zVar = new z(hVarT, true, 1);
        }
        vVar.invoke(nVar, zVar, zVar);
        return zVar;
    }

    public static final pq.h t(t tVar, pq.h hVar) {
        pq.h hVarK = k(tVar.getCoroutineContext(), hVar, true);
        du.f fVar = d0.f24610a;
        return (hVarK == fVar || hVarK.Y(pq.d.f20620a) != null) ? hVarK : hVarK.i0(fVar);
    }

    public static final Object u(Object obj) {
        return obj instanceof o ? t1.k(((o) obj).f24644a) : obj;
    }

    public static final void v(g gVar, pq.c cVar, boolean z10) {
        Object obj = g.B.get(gVar);
        Throwable thD = gVar.d(obj);
        Object objK = thD != null ? t1.k(thD) : gVar.f(obj);
        if (!z10) {
            cVar.g(objK);
            return;
        }
        br.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        bu.f fVar = (bu.f) cVar;
        rq.c cVar2 = fVar.f2964x;
        Object obj2 = fVar.B;
        pq.h hVarM = cVar2.m();
        Object objL = bu.a.l(hVarM, obj2);
        o1 o1VarA = objL != bu.a.f2954d ? A(cVar2, hVarM, objL) : null;
        try {
            cVar2.g(objK);
            if (o1VarA == null || o1VarA.b0()) {
                bu.a.g(hVarM, objL);
            }
        } catch (Throwable th2) {
            if (o1VarA == null || o1VarA.b0()) {
                bu.a.g(hVarM, objL);
            }
            throw th2;
        }
    }

    public static final Object w(pq.h hVar, ar.n nVar) throws Throwable {
        k0 k0VarA;
        pq.h hVarK;
        Thread threadCurrentThread = Thread.currentThread();
        pq.g gVar = pq.d.f20620a;
        pq.e eVar = (pq.e) hVar.Y(gVar);
        pq.i iVar = pq.i.f20621a;
        if (eVar == null) {
            k0VarA = k1.a();
            hVarK = k(iVar, hVar.i0(k0VarA), true);
            du.f fVar = d0.f24610a;
            if (hVarK != fVar && hVarK.Y(gVar) == null) {
                hVarK = hVarK.i0(fVar);
            }
        } else {
            if (eVar instanceof k0) {
            }
            k0VarA = (k0) k1.f24632a.get();
            hVarK = k(iVar, hVar, true);
            du.f fVar2 = d0.f24610a;
            if (hVarK != fVar2 && hVarK.Y(gVar) == null) {
                hVarK = hVarK.i0(fVar2);
            }
        }
        c cVar = new c(hVarK, threadCurrentThread, k0VarA);
        v.DEFAULT.invoke(nVar, cVar, cVar);
        k0 k0Var = cVar.f24607x;
        if (k0Var != null) {
            int i10 = k0.f24628y;
            k0Var.u0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jV0 = k0Var != null ? k0Var.v0() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.f24604a;
                if (!(atomicReferenceFieldUpdater.get(cVar) instanceof p0)) {
                    if (k0Var != null) {
                        int i11 = k0.f24628y;
                        k0Var.r0(false);
                    }
                    Object objZ = z(atomicReferenceFieldUpdater.get(cVar));
                    o oVar = objZ instanceof o ? (o) objZ : null;
                    if (oVar == null) {
                        return objZ;
                    }
                    throw oVar.f24644a;
                }
                LockSupport.parkNanos(cVar, jV0);
            } catch (Throwable th2) {
                if (k0Var != null) {
                    int i12 = k0.f24628y;
                    k0Var.r0(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.o(interruptedException);
        throw interruptedException;
    }

    public static Object x(ar.a aVar, rq.c cVar) {
        return B(pq.i.f20621a, new androidx.lifecycle.p(aVar, (pq.c) null, 7), cVar);
    }

    public static final String y(pq.c cVar) {
        Object objK;
        if (cVar instanceof bu.f) {
            return ((bu.f) cVar).toString();
        }
        try {
            objK = cVar + '@' + l(cVar);
        } catch (Throwable th2) {
            objK = t1.k(th2);
        }
        if (lq.o.a(objK) != null) {
            objK = cVar.getClass().getName() + '@' + l(cVar);
        }
        return (String) objK;
    }

    public static final Object z(Object obj) {
        p0 p0Var;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return (q0Var == null || (p0Var = q0Var.f24651a) == null) ? obj : p0Var;
    }
}
