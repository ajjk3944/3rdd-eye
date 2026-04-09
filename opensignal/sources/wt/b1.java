package wt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b1 implements t0, h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24604a = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_state$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24605d = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public b1(boolean z10) {
        this._state$volatile = z10 ? w.j : w.f24670i;
    }

    public static k K(bu.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bu.j.f2972d;
            bu.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (bu.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof k) {
                    return (k) jVar;
                }
                if (jVar instanceof e1) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof z0)) {
            return obj instanceof p0 ? ((p0) obj).b() ? "Active" : "New" : obj instanceof o ? "Cancelled" : "Completed";
        }
        z0 z0Var = (z0) obj;
        return z0Var.e() ? "Cancelling" : z0.f24676d.get(z0Var) != 0 ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof m;
    }

    public final e1 C(p0 p0Var) {
        e1 e1VarD = p0Var.d();
        if (e1VarD != null) {
            return e1VarD;
        }
        if (p0Var instanceof f0) {
            return new e1();
        }
        if (p0Var instanceof w0) {
            Q((w0) p0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + p0Var).toString());
    }

    public boolean D(Throwable th2) {
        return false;
    }

    public final void F(t0 t0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24605d;
        f1 f1Var = f1.f24615a;
        if (t0Var == null) {
            atomicReferenceFieldUpdater.set(this, f1Var);
            return;
        }
        t0Var.start();
        j jVarF0 = t0Var.f0(this);
        atomicReferenceFieldUpdater.set(this, jVarF0);
        if (f24604a.get(this) instanceof p0) {
            return;
        }
        jVarF0.a();
        atomicReferenceFieldUpdater.set(this, f1Var);
    }

    public final e0 G(boolean z10, w0 w0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var;
        boolean z11;
        boolean zE;
        w0Var.f24671r = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f24604a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof f0;
            f1Var = f1.f24615a;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof p0)) {
                    z11 = false;
                    break;
                }
                p0 p0Var = (p0) obj;
                e1 e1VarD = p0Var.d();
                if (e1VarD == null) {
                    Q((w0) obj);
                } else {
                    if (w0Var.k()) {
                        z0 z0Var = p0Var instanceof z0 ? (z0) p0Var : null;
                        Throwable thC = z0Var != null ? z0Var.c() : null;
                        if (thC == null) {
                            zE = e1VarD.e(w0Var, 5);
                        } else if (z10) {
                            w0Var.l(thC);
                            return f1Var;
                        }
                    } else {
                        zE = e1VarD.e(w0Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                f0 f0Var = (f0) obj;
                if (f0Var.f24614a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                P(f0Var);
            }
        }
        if (z11) {
            return w0Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            o oVar = obj2 instanceof o ? (o) obj2 : null;
            w0Var.l(oVar != null ? oVar.f24644a : null);
        }
        return f1Var;
    }

    public boolean H() {
        return this instanceof c;
    }

    public final boolean I(Object obj) {
        Object objU;
        do {
            objU = U(f24604a.get(this), obj);
            if (objU == w.f24665d) {
                return false;
            }
            if (objU == w.f24666e) {
                return true;
            }
        } while (objU == w.f24667f);
        d(objU);
        return true;
    }

    public final Object J(Object obj) {
        Object objU;
        do {
            objU = U(f24604a.get(this), obj);
            if (objU == w.f24665d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                o oVar = obj instanceof o ? (o) obj : null;
                throw new IllegalStateException(str, oVar != null ? oVar.f24644a : null);
            }
        } while (objU == w.f24667f);
        return objU;
    }

    public final void M(e1 e1Var, Throwable th2) {
        e1Var.e(new bu.h(4), 4);
        Object obj = bu.j.f2971a.get(e1Var);
        br.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        bf.n nVar = null;
        for (bu.j jVarH = (bu.j) obj; !jVarH.equals(e1Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof w0) && ((w0) jVarH).k()) {
                try {
                    ((w0) jVarH).l(th2);
                } catch (Throwable th3) {
                    if (nVar != null) {
                        ir.f0.c(nVar, th3);
                    } else {
                        nVar = new bf.n("Exception in completion handler " + jVarH + " for " + this, th3);
                    }
                }
            }
        }
        if (nVar != null) {
            E(nVar);
        }
        r(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [wt.o0] */
    public final void P(f0 f0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = new e1();
        if (!f0Var.f24614a) {
            e1Var = new o0(e1Var);
        }
        do {
            atomicReferenceFieldUpdater = f24604a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f0Var, e1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f0Var);
    }

    public final void Q(w0 w0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = new e1();
        w0Var.getClass();
        bu.j.f2972d.set(e1Var, w0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bu.j.f2971a;
        atomicReferenceFieldUpdater2.set(e1Var, w0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(w0Var) == w0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w0Var, w0Var, e1Var)) {
                    if (atomicReferenceFieldUpdater2.get(w0Var) != w0Var) {
                        break;
                    }
                }
                e1Var.g(w0Var);
                break loop0;
            }
            break;
        }
        bu.j jVarH = w0Var.h();
        do {
            atomicReferenceFieldUpdater = f24604a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w0Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w0Var);
    }

    @Override // wt.t0
    public final e0 R(ar.k kVar) {
        return G(true, new s0(0, kVar));
    }

    public final int S(Object obj) {
        boolean z10 = obj instanceof f0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24604a;
        if (z10) {
            if (((f0) obj).f24614a) {
                return 0;
            }
            f0 f0Var = w.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            O();
            return 1;
        }
        if (!(obj instanceof o0)) {
            return 0;
        }
        e1 e1Var = ((o0) obj).f24645a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        O();
        return 1;
    }

    public final Object U(Object obj, Object obj2) {
        if (!(obj instanceof p0)) {
            return w.f24665d;
        }
        if (((obj instanceof f0) || (obj instanceof w0)) && !(obj instanceof k) && !(obj2 instanceof o)) {
            p0 p0Var = (p0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24604a;
            Object q0Var = obj2 instanceof p0 ? new q0((p0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, p0Var, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                    return w.f24667f;
                }
            }
            N(obj2);
            u(p0Var, obj2);
            return obj2;
        }
        p0 p0Var2 = (p0) obj;
        e1 e1VarC = C(p0Var2);
        if (e1VarC == null) {
            return w.f24667f;
        }
        z0 z0Var = p0Var2 instanceof z0 ? (z0) p0Var2 : null;
        if (z0Var == null) {
            z0Var = new z0(e1VarC, null);
        }
        synchronized (z0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z0.f24676d;
            if (atomicIntegerFieldUpdater.get(z0Var) != 0) {
                return w.f24665d;
            }
            atomicIntegerFieldUpdater.set(z0Var, 1);
            if (z0Var != p0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24604a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, p0Var2, z0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != p0Var2) {
                        return w.f24667f;
                    }
                }
            }
            boolean zE = z0Var.e();
            o oVar = obj2 instanceof o ? (o) obj2 : null;
            if (oVar != null) {
                z0Var.a(oVar.f24644a);
            }
            Throwable thC = zE ? null : z0Var.c();
            if (thC != null) {
                M(e1VarC, thC);
            }
            k kVarK = K(e1VarC);
            if (kVarK != null && W(z0Var, kVarK, obj2)) {
                return w.f24666e;
            }
            e1VarC.e(new bu.h(2), 2);
            k kVarK2 = K(e1VarC);
            return (kVarK2 == null || !W(z0Var, kVarK2, obj2)) ? x(z0Var, obj2) : w.f24666e;
        }
    }

    @Override // wt.t0
    public final Object V(rq.c cVar) {
        Object obj;
        lq.b0 b0Var;
        do {
            obj = f24604a.get(this);
            boolean z10 = obj instanceof p0;
            b0Var = lq.b0.f15562a;
            if (!z10) {
                w.i(cVar.m());
                return b0Var;
            }
        } while (S(obj) < 0);
        g gVar = new g(1, xu.l.D(cVar));
        gVar.v();
        gVar.y(new e(2, w.p(this, true, new i(gVar, 1))));
        Object objU = gVar.u();
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        if (objU != aVar) {
            objU = b0Var;
        }
        return objU == aVar ? objU : b0Var;
    }

    public final boolean W(z0 z0Var, k kVar, Object obj) {
        while (w.p(kVar.f24627x, false, new y0(this, z0Var, kVar, obj)) == f1.f24615a) {
            kVar = K(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // pq.h
    public final pq.f Y(pq.g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(ar.n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    @Override // wt.t0
    public boolean b() {
        Object obj = f24604a.get(this);
        return (obj instanceof p0) && ((p0) obj).b();
    }

    @Override // wt.t0
    public final st.j f() {
        return new mq.n(new a1(this, null));
    }

    @Override // wt.t0
    public final j f0(b1 b1Var) {
        k kVar = new k(b1Var);
        kVar.f24671r = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24604a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (f0Var.f24614a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                P(f0Var);
            } else {
                boolean z10 = obj instanceof p0;
                f1 f1Var = f1.f24615a;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    o oVar = obj2 instanceof o ? (o) obj2 : null;
                    kVar.l(oVar != null ? oVar.f24644a : null);
                    return f1Var;
                }
                e1 e1VarD = ((p0) obj).d();
                if (e1VarD == null) {
                    Q((w0) obj);
                } else if (!e1VarD.e(kVar, 7)) {
                    boolean zE = e1VarD.e(kVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof z0) {
                        thC = ((z0) obj3).c();
                    } else {
                        o oVar2 = obj3 instanceof o ? (o) obj3 : null;
                        if (oVar2 != null) {
                            thC = oVar2.f24644a;
                        }
                    }
                    kVar.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return f1Var;
                }
            }
        }
        return kVar;
    }

    @Override // pq.f
    public final pq.g getKey() {
        return r.f24653d;
    }

    @Override // wt.t0
    public void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new u0(s(), null, this);
        }
        p(cancellationException);
    }

    @Override // pq.h
    public final pq.h i0(pq.h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // wt.t0
    public final boolean isCancelled() {
        Object obj = f24604a.get(this);
        if (obj instanceof o) {
            return true;
        }
        return (obj instanceof z0) && ((z0) obj).e();
    }

    public void l(Object obj) {
        d(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.b1.o(java.lang.Object):boolean");
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    @Override // pq.h
    public final pq.h q(pq.g gVar) {
        return se.b.L(this, gVar);
    }

    public final boolean r(Throwable th2) {
        if (H()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        j jVar = (j) f24605d.get(this);
        return (jVar == null || jVar == f1.f24615a) ? z10 : jVar.c(th2) || z10;
    }

    public String s() {
        return "Job was cancelled";
    }

    @Override // wt.t0
    public final boolean start() {
        int iS;
        do {
            iS = S(f24604a.get(this));
            if (iS == 0) {
                return false;
            }
        } while (iS != 1);
        return true;
    }

    public boolean t(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return o(th2) && A();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName() + '{' + T(f24604a.get(this)) + '}');
        sb2.append('@');
        sb2.append(w.l(this));
        return sb2.toString();
    }

    public final void u(p0 p0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24605d;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        if (jVar != null) {
            jVar.a();
            atomicReferenceFieldUpdater.set(this, f1.f24615a);
        }
        bf.n nVar = null;
        o oVar = obj instanceof o ? (o) obj : null;
        Throwable th2 = oVar != null ? oVar.f24644a : null;
        if (p0Var instanceof w0) {
            try {
                ((w0) p0Var).l(th2);
                return;
            } catch (Throwable th3) {
                E(new bf.n("Exception in completion handler " + p0Var + " for " + this, th3));
                return;
            }
        }
        e1 e1VarD = p0Var.d();
        if (e1VarD != null) {
            e1VarD.e(new bu.h(1), 1);
            Object obj2 = bu.j.f2971a.get(e1VarD);
            br.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (bu.j jVarH = (bu.j) obj2; !jVarH.equals(e1VarD); jVarH = jVarH.h()) {
                if (jVarH instanceof w0) {
                    try {
                        ((w0) jVarH).l(th2);
                    } catch (Throwable th4) {
                        if (nVar != null) {
                            ir.f0.c(nVar, th4);
                        } else {
                            nVar = new bf.n("Exception in completion handler " + jVarH + " for " + this, th4);
                        }
                    }
                }
            }
            if (nVar != null) {
                E(nVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable v(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b1 b1Var = (b1) ((h1) obj);
        Object obj2 = f24604a.get(b1Var);
        if (obj2 instanceof z0) {
            cancellationExceptionC = ((z0) obj2).c();
        } else if (obj2 instanceof o) {
            cancellationExceptionC = ((o) obj2).f24644a;
        } else {
            if (obj2 instanceof p0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new u0("Parent job is ".concat(T(obj2)), cancellationExceptionC, b1Var) : cancellationException;
    }

    @Override // wt.t0
    public final e0 w(boolean z10, boolean z11, bq.g gVar) {
        return G(z11, z10 ? new r0(gVar) : new s0(0, gVar));
    }

    public final Object x(z0 z0Var, Object obj) {
        Throwable thZ;
        o oVar = obj instanceof o ? (o) obj : null;
        Throwable th2 = oVar != null ? oVar.f24644a : null;
        synchronized (z0Var) {
            z0Var.e();
            ArrayList<Throwable> arrayListF = z0Var.f(th2);
            thZ = z(z0Var, arrayListF);
            if (thZ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th3 : arrayListF) {
                    if (th3 != thZ && th3 != thZ && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        ir.f0.c(thZ, th3);
                    }
                }
            }
        }
        if (thZ != null && thZ != th2) {
            obj = new o(thZ, false);
        }
        if (thZ != null && (r(thZ) || D(thZ))) {
            br.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            o.f24643b.compareAndSet((o) obj, 0, 1);
        }
        N(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24604a;
        Object q0Var = obj instanceof p0 ? new q0((p0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z0Var, q0Var) && atomicReferenceFieldUpdater.get(this) == z0Var) {
        }
        u(z0Var, obj);
        return obj;
    }

    @Override // wt.t0
    public final CancellationException y() {
        CancellationException cancellationException;
        Object obj = f24604a.get(this);
        if (!(obj instanceof z0)) {
            if (obj instanceof p0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof o)) {
                return new u0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((o) obj).f24644a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new u0(s(), th2, this) : cancellationException;
        }
        Throwable thC = ((z0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = s();
        }
        return new u0(strConcat, thC, this);
    }

    public final Throwable z(z0 z0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (z0Var.e()) {
                return new u0(s(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof m1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof m1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public void O() {
    }

    public void E(bf.n nVar) {
        throw nVar;
    }

    public void N(Object obj) {
    }

    public void d(Object obj) {
    }
}
