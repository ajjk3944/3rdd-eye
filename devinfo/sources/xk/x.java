package xk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final cl.u f37250a = new cl.u("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final cl.u f37251b = new cl.u("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final cl.u f37252c = new cl.u("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final cl.u f37253d = new cl.u("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final cl.u f37254e = new cl.u("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final cl.u f37255f = new cl.u("COMPLETING_RETRY", 0);
    public static final cl.u g = new cl.u("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final cl.u f37256h = new cl.u("SEALED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f37257i = new k0(false);
    public static final k0 j = new k0(true);

    public static final Object A(p1 p1Var, mk.e eVar) {
        r(p1Var, true, new j0(0, m(p1Var.f2937d.getContext()).F(p1Var.f37222e, p1Var, p1Var.f37167c)));
        return ci.b.B(p1Var, false, p1Var, eVar);
    }

    public static final String B(ck.c cVar) {
        Object objH;
        if (cVar instanceof cl.g) {
            return ((cl.g) cVar).toString();
        }
        try {
            objH = cVar + '@' + n(cVar);
        } catch (Throwable th2) {
            objH = ci.b.h(th2);
        }
        if (yj.l.a(objH) != null) {
            objH = cVar.getClass().getName() + '@' + n(cVar);
        }
        return (String) objH;
    }

    public static final Object C(Object obj) {
        v0 v0Var;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        return (w0Var == null || (v0Var = w0Var.f37249a) == null) ? obj : v0Var;
    }

    public static final s1 D(ck.c cVar, ck.h hVar, Object obj) {
        s1 s1Var = null;
        if ((cVar instanceof ek.d) && hVar.O(t1.f37239a) != null) {
            ek.d callerFrame = (ek.d) cVar;
            while (true) {
                if ((callerFrame instanceof d0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof s1) {
                    s1Var = (s1) callerFrame;
                    break;
                }
            }
            if (s1Var != null) {
                s1Var.m0(hVar, obj);
            }
        }
        return s1Var;
    }

    public static final Object E(ck.h hVar, mk.e eVar, ck.c cVar) throws Throwable {
        ck.h context = cVar.getContext();
        ck.h hVarY = !((Boolean) hVar.G(Boolean.FALSE, new s2.u(17))).booleanValue() ? context.y(hVar) : k(context, hVar, false);
        j(hVarY);
        if (hVarY == context) {
            cl.r rVar = new cl.r(cVar, hVarY);
            return ci.b.B(rVar, true, rVar, eVar);
        }
        ck.d dVar = ck.d.f2897a;
        if (nk.k.a(hVarY.O(dVar), context.O(dVar))) {
            s1 s1Var = new s1(cVar, hVarY);
            ck.h hVar2 = s1Var.f37167c;
            Object objN = cl.b.n(hVar2, null);
            try {
                return ci.b.B(s1Var, true, s1Var, eVar);
            } finally {
                cl.b.g(hVar2, objN);
            }
        }
        d0 d0Var = new d0(cVar, hVarY);
        try {
            cl.b.h(a.a.r(a.a.h(d0Var, d0Var, eVar)), yj.u.f37649a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0.f37176e;
            do {
                int i4 = atomicIntegerFieldUpdater.get(d0Var);
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objC = C(f1.f37187a.get(d0Var));
                    if (objC instanceof p) {
                        throw ((p) objC).f37219a;
                    }
                    return objC;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(d0Var, 0, 1));
            return dk.a.f22275a;
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof c0) {
                th = ((c0) th).f37174a;
            }
            d0Var.resumeWith(ci.b.h(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(long r5, mk.e r7, ek.c r8) {
        /*
            boolean r0 = r8 instanceof xk.q1
            if (r0 == 0) goto L13
            r0 = r8
            xk.q1 r0 = (xk.q1) r0
            int r1 = r0.f37231c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37231c = r1
            goto L18
        L13:
            xk.q1 r0 = new xk.q1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37230b
            int r1 = r0.f37231c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            nk.u r5 = r0.f37229a
            ci.b.D(r8)     // Catch: xk.o1 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ci.b.D(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            nk.u r8 = new nk.u
            r8.<init>()
            r0.f37229a = r8     // Catch: xk.o1 -> L55
            r0.f37231c = r2     // Catch: xk.o1 -> L55
            xk.p1 r1 = new xk.p1     // Catch: xk.o1 -> L55
            r1.<init>(r5, r0)     // Catch: xk.o1 -> L55
            r8.f29986a = r1     // Catch: xk.o1 -> L55
            java.lang.Object r5 = A(r1, r7)     // Catch: xk.o1 -> L55
            dk.a r6 = dk.a.f22275a
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            xk.y0 r7 = r6.f37217a
            java.lang.Object r5 = r5.f29986a
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.x.F(long, mk.e, ek.c):java.lang.Object");
    }

    public static n a() {
        n nVar = new n(true);
        nVar.P(null);
        return nVar;
    }

    public static final cl.d b(ck.h hVar) {
        if (hVar.O(s.f37235b) == null) {
            hVar = hVar.y(c());
        }
        return new cl.d(hVar);
    }

    public static a1 c() {
        return new a1(null);
    }

    public static m1 d() {
        return new m1(null);
    }

    public static a0 e(cl.d dVar, mk.e eVar) {
        a0 a0Var = new a0(w(dVar, ck.i.f2898a), true, 0);
        a0Var.i0(w.f37244a, a0Var, eVar);
        return a0Var;
    }

    public static final void f(ck.h hVar, CancellationException cancellationException) {
        y0 y0Var = (y0) hVar.O(s.f37235b);
        if (y0Var != null) {
            y0Var.e(cancellationException);
        }
    }

    public static final void g(v vVar, CancellationException cancellationException) {
        y0 y0Var = (y0) vVar.A().O(s.f37235b);
        if (y0Var != null) {
            y0Var.e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + vVar).toString());
        }
    }

    public static final Object h(mk.e eVar, ck.c cVar) {
        cl.r rVar = new cl.r(cVar, cVar.getContext());
        return ci.b.B(rVar, true, rVar, eVar);
    }

    public static final Object i(long j8, ek.c cVar) {
        if (j8 > 0) {
            h hVar = new h(1, a.a.r(cVar));
            hVar.s();
            if (j8 < Long.MAX_VALUE) {
                m(hVar.f37194e).A(j8, hVar);
            }
            Object objR = hVar.r();
            if (objR == dk.a.f22275a) {
                return objR;
            }
        }
        return yj.u.f37649a;
    }

    public static final void j(ck.h hVar) {
        y0 y0Var = (y0) hVar.O(s.f37235b);
        if (y0Var != null && !y0Var.c()) {
            throw y0Var.p();
        }
    }

    public static final ck.h k(ck.h hVar, ck.h hVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.G(bool, new s2.u(17))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.G(bool, new s2.u(17))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.y(hVar2);
        }
        s2.u uVar = new s2.u(18);
        ck.i iVar = ck.i.f2898a;
        ck.h hVar3 = (ck.h) hVar.G(iVar, uVar);
        Object objG = hVar2;
        if (zBooleanValue2) {
            objG = hVar2.G(iVar, new s2.u(19));
        }
        return hVar3.y((ck.h) objG);
    }

    public static final r l(Executor executor) {
        return new s0(executor);
    }

    public static final b0 m(ck.h hVar) {
        ck.f fVarO = hVar.O(ck.d.f2897a);
        b0 b0Var = fVarO instanceof b0 ? (b0) fVarO : null;
        return b0Var == null ? z.f37261a : b0Var;
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final y0 o(ck.h hVar) {
        y0 y0Var = (y0) hVar.O(s.f37235b);
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final h p(ck.c cVar) {
        h hVar;
        h hVar2;
        if (!(cVar instanceof cl.g)) {
            return new h(1, cVar);
        }
        cl.g gVar = (cl.g) cVar;
        cl.u uVar = cl.b.f2904c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cl.g.f2913h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, uVar);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            }
            if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof o) || ((o) obj2).f37214d == null) {
                h.f37191f.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.f37170a);
                hVar = hVar2;
            } else {
                hVar2.o();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, cVar);
    }

    public static final void q(ck.h hVar, Throwable th2) {
        if (th2 instanceof c0) {
            th2 = ((c0) th2).f37174a;
        }
        try {
            t tVar = (t) hVar.O(s.f37234a);
            if (tVar != null) {
                tVar.E(hVar, th2);
            } else {
                cl.b.d(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                wd.b.a(runtimeException, th2);
                th2 = runtimeException;
            }
            cl.b.d(hVar, th2);
        }
    }

    public static final i0 r(y0 y0Var, boolean z3, b1 b1Var) {
        if (y0Var instanceof f1) {
            return ((f1) y0Var).Q(z3, b1Var);
        }
        return y0Var.w(b1Var.k(), z3, new c0.a(1, b1Var, b1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    public static final boolean s(ck.h hVar) {
        y0 y0Var = (y0) hVar.O(s.f37235b);
        if (y0Var != null) {
            return y0Var.c();
        }
        return true;
    }

    public static final boolean t(v vVar) {
        y0 y0Var = (y0) vVar.A().O(s.f37235b);
        if (y0Var != null) {
            return y0Var.c();
        }
        return true;
    }

    public static final a0 u(v vVar, ck.h hVar, w wVar, mk.e eVar) {
        a0 a0Var;
        ck.h hVarW = w(vVar, hVar);
        wVar.getClass();
        if (wVar == w.f37245b) {
            a0Var = new g1(hVarW, eVar);
        } else {
            a0Var = new a0(hVarW, true, 1);
        }
        a0Var.i0(wVar, a0Var, eVar);
        return a0Var;
    }

    public static /* synthetic */ a0 v(v vVar, ck.h hVar, w wVar, mk.e eVar, int i4) {
        if ((i4 & 1) != 0) {
            hVar = ck.i.f2898a;
        }
        if ((i4 & 2) != 0) {
            wVar = w.f37244a;
        }
        return u(vVar, hVar, wVar, eVar);
    }

    public static final ck.h w(v vVar, ck.h hVar) {
        ck.h hVarK = k(vVar.A(), hVar, true);
        el.e eVar = g0.f37189a;
        return (hVarK == eVar || hVarK.O(ck.d.f2897a) != null) ? hVarK : hVarK.y(eVar);
    }

    public static final Object x(Object obj) {
        return obj instanceof p ? ci.b.h(((p) obj).f37219a) : obj;
    }

    public static final void y(h hVar, ck.c cVar, boolean z3) {
        Object obj = h.g.get(hVar);
        Throwable thD = hVar.d(obj);
        Object objH = thD != null ? ci.b.h(thD) : hVar.e(obj);
        if (!z3) {
            cVar.resumeWith(objH);
            return;
        }
        nk.k.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        cl.g gVar = (cl.g) cVar;
        ek.c cVar2 = gVar.f2915e;
        Object obj2 = gVar.g;
        ck.h context = cVar2.getContext();
        Object objN = cl.b.n(context, obj2);
        s1 s1VarD = objN != cl.b.f2905d ? D(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objH);
            if (s1VarD == null || s1VarD.k0()) {
                cl.b.g(context, objN);
            }
        } catch (Throwable th2) {
            if (s1VarD == null || s1VarD.k0()) {
                cl.b.g(context, objN);
            }
            throw th2;
        }
    }

    public static final Object z(ck.h hVar, mk.e eVar) throws Throwable {
        q0 q0VarA;
        ck.h hVarK;
        long jB0;
        Thread threadCurrentThread = Thread.currentThread();
        ck.g gVar = ck.d.f2897a;
        ck.e eVar2 = (ck.e) hVar.O(gVar);
        ck.i iVar = ck.i.f2898a;
        if (eVar2 == null) {
            q0VarA = n1.a();
            hVarK = k(iVar, hVar.y(q0VarA), true);
            el.e eVar3 = g0.f37189a;
            if (hVarK != eVar3 && hVarK.O(gVar) == null) {
                hVarK = hVarK.y(eVar3);
            }
        } else {
            if (eVar2 instanceof q0) {
            }
            q0VarA = (q0) n1.f37210a.get();
            hVarK = k(iVar, hVar, true);
            el.e eVar4 = g0.f37189a;
            if (hVarK != eVar4 && hVarK.O(gVar) == null) {
                hVarK = hVarK.y(eVar4);
            }
        }
        c cVar = new c(hVarK, threadCurrentThread, q0VarA);
        cVar.i0(w.f37244a, cVar, eVar);
        q0 q0Var = cVar.f37173e;
        if (q0Var != null) {
            int i4 = q0.f37225f;
            q0Var.a0(false);
        }
        while (true) {
            if (q0Var != null) {
                try {
                    jB0 = q0Var.b0();
                } catch (Throwable th2) {
                    if (q0Var != null) {
                        int i10 = q0.f37225f;
                        q0Var.X(false);
                    }
                    throw th2;
                }
            } else {
                jB0 = Long.MAX_VALUE;
            }
            if (cVar.R()) {
                break;
            }
            LockSupport.parkNanos(cVar, jB0);
            if (Thread.interrupted()) {
                cVar.r(new InterruptedException());
            }
        }
        if (q0Var != null) {
            int i11 = q0.f37225f;
            q0Var.X(false);
        }
        Object objC = C(f1.f37187a.get(cVar));
        p pVar = objC instanceof p ? (p) objC : null;
        if (pVar == null) {
            return objC;
        }
        throw pVar.f37219a;
    }
}
