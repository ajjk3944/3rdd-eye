package xk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class f1 implements y0, l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37187a = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37188b = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f1(boolean z3) {
        this._state$volatile = z3 ? x.j : x.f37257i;
    }

    public static l W(cl.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cl.k.f2925b;
            cl.k kVarF = kVar.f();
            if (kVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (cl.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarF;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof l) {
                    return (l) kVar;
                }
                if (kVar instanceof h1) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof e1)) {
            return obj instanceof v0 ? ((v0) obj).c() ? "Active" : "New" : obj instanceof p ? "Cancelled" : "Completed";
        }
        e1 e1Var = (e1) obj;
        return e1Var.e() ? "Cancelling" : e1.f37183b.get(e1Var) == 1 ? "Completing" : "Active";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable B(Object obj) {
        CancellationException cancellationExceptionB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        f1 f1Var = (f1) ((l1) obj);
        Object obj2 = f37187a.get(f1Var);
        if (obj2 instanceof e1) {
            cancellationExceptionB = ((e1) obj2).b();
        } else if (obj2 instanceof p) {
            cancellationExceptionB = ((p) obj2).f37219a;
        } else {
            if (obj2 instanceof v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException cancellationException = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        return cancellationException == null ? new z0("Parent job is ".concat(d0(obj2)), cancellationExceptionB, f1Var) : cancellationException;
    }

    public final Object C(e1 e1Var, Object obj) {
        Throwable thF;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th2 = pVar != null ? pVar.f37219a : null;
        synchronized (e1Var) {
            e1Var.e();
            ArrayList arrayListF = e1Var.f(th2);
            thF = F(e1Var, arrayListF);
            if (thF != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayListF.get(i4);
                    i4++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != thF && th3 != thF && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        wd.b.a(thF, th3);
                    }
                }
            }
        }
        if (thF != null && thF != th2) {
            obj = new p(thF, false);
        }
        if (thF != null && (t(thF) || K(thF))) {
            nk.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            p.f37218b.compareAndSet((p) obj, 0, 1);
        }
        Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37187a;
        Object w0Var = obj instanceof v0 ? new w0((v0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e1Var, w0Var) && atomicReferenceFieldUpdater.get(this) == e1Var) {
        }
        z(e1Var, obj);
        return obj;
    }

    public final Object D() throws Throwable {
        Object obj = f37187a.get(this);
        if (obj instanceof v0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof p) {
            throw ((p) obj).f37219a;
        }
        return x.C(obj);
    }

    public final Throwable F(e1 e1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e1Var.e()) {
                return new z0(u(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof o1) {
            int size2 = arrayList.size();
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i4);
                i4++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof o1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof n;
    }

    public final h1 J(v0 v0Var) {
        h1 h1VarD = v0Var.d();
        if (h1VarD != null) {
            return h1VarD;
        }
        if (v0Var instanceof k0) {
            return new h1();
        }
        if (v0Var instanceof b1) {
            b0((b1) v0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + v0Var).toString());
    }

    public boolean K(Throwable th2) {
        return false;
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // xk.y0
    public final k N(f1 f1Var) {
        l lVar = new l(f1Var);
        lVar.f37171d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37187a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (k0Var.f37203a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0(k0Var);
            } else {
                boolean z3 = obj instanceof v0;
                j1 j1Var = j1.f37202a;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    p pVar = obj2 instanceof p ? (p) obj2 : null;
                    lVar.l(pVar != null ? pVar.f37219a : null);
                    return j1Var;
                }
                h1 h1VarD = ((v0) obj).d();
                if (h1VarD == null) {
                    b0((b1) obj);
                } else if (!h1VarD.e(lVar, 7)) {
                    boolean zE = h1VarD.e(lVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof e1) {
                        thB = ((e1) obj3).b();
                    } else {
                        p pVar2 = obj3 instanceof p ? (p) obj3 : null;
                        if (pVar2 != null) {
                            thB = pVar2.f37219a;
                        }
                    }
                    lVar.l(thB);
                    if (zE) {
                        break loop0;
                    }
                    return j1Var;
                }
            }
        }
        return lVar;
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        return wd.b.p(this, gVar);
    }

    public final void P(y0 y0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37188b;
        j1 j1Var = j1.f37202a;
        if (y0Var == null) {
            atomicReferenceFieldUpdater.set(this, j1Var);
            return;
        }
        y0Var.start();
        k kVarN = y0Var.N(this);
        atomicReferenceFieldUpdater.set(this, kVarN);
        if (R()) {
            kVarN.a();
            atomicReferenceFieldUpdater.set(this, j1Var);
        }
    }

    public final i0 Q(boolean z3, b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        boolean z10;
        boolean zE;
        b1Var.f37171d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f37187a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof k0;
            j1Var = j1.f37202a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof v0)) {
                    z10 = false;
                    break;
                }
                v0 v0Var = (v0) obj;
                h1 h1VarD = v0Var.d();
                if (h1VarD == null) {
                    b0((b1) obj);
                } else {
                    if (b1Var.k()) {
                        e1 e1Var = v0Var instanceof e1 ? (e1) v0Var : null;
                        Throwable thB = e1Var != null ? e1Var.b() : null;
                        if (thB == null) {
                            zE = h1VarD.e(b1Var, 5);
                        } else if (z3) {
                            b1Var.l(thB);
                            return j1Var;
                        }
                    } else {
                        zE = h1VarD.e(b1Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                k0 k0Var = (k0) obj;
                if (k0Var.f37203a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0(k0Var);
            }
        }
        if (z10) {
            return b1Var;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            b1Var.l(pVar != null ? pVar.f37219a : null);
        }
        return j1Var;
    }

    public final boolean R() {
        return !(f37187a.get(this) instanceof v0);
    }

    public boolean S() {
        return this instanceof c;
    }

    public final boolean T(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f37187a.get(this), obj);
            if (objE0 == x.f37253d) {
                return false;
            }
            if (objE0 == x.f37254e) {
                return true;
            }
        } while (objE0 == x.f37255f);
        o(objE0);
        return true;
    }

    public final Object U(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f37187a.get(this), obj);
            if (objE0 == x.f37253d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p pVar = obj instanceof p ? (p) obj : null;
                throw new IllegalStateException(str, pVar != null ? pVar.f37219a : null);
            }
        } while (objE0 == x.f37255f);
        return objE0;
    }

    public String V() {
        return getClass().getSimpleName();
    }

    public final void X(h1 h1Var, Throwable th2) {
        h1Var.e(new cl.i(4), 4);
        Object obj = cl.k.f2924a.get(h1Var);
        nk.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        ac.m mVar = null;
        for (cl.k kVarH = (cl.k) obj; !kVarH.equals(h1Var); kVarH = kVarH.h()) {
            if ((kVarH instanceof b1) && ((b1) kVarH).k()) {
                try {
                    ((b1) kVarH).l(th2);
                } catch (Throwable th3) {
                    if (mVar != null) {
                        wd.b.a(mVar, th3);
                    } else {
                        mVar = new ac.m("Exception in completion handler " + kVarH + " for " + this, th3);
                    }
                }
            }
        }
        if (mVar != null) {
            M(mVar);
        }
        t(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xk.u0] */
    public final void a0(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = new h1();
        if (!k0Var.f37203a) {
            h1Var = new u0(h1Var);
        }
        do {
            atomicReferenceFieldUpdater = f37187a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, h1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    public final void b0(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = new h1();
        b1Var.getClass();
        cl.k.f2925b.set(h1Var, b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = cl.k.f2924a;
        atomicReferenceFieldUpdater2.set(h1Var, b1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b1Var) == b1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b1Var, b1Var, h1Var)) {
                    if (atomicReferenceFieldUpdater2.get(b1Var) != b1Var) {
                        break;
                    }
                }
                h1Var.g(b1Var);
                break loop0;
            }
            break;
        }
        cl.k kVarH = b1Var.h();
        do {
            atomicReferenceFieldUpdater = f37187a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, kVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b1Var);
    }

    @Override // xk.y0
    public boolean c() {
        Object obj = f37187a.get(this);
        return (obj instanceof v0) && ((v0) obj).c();
    }

    public final int c0(Object obj) {
        boolean z3 = obj instanceof k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37187a;
        if (z3) {
            if (((k0) obj).f37203a) {
                return 0;
            }
            k0 k0Var = x.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Z();
            return 1;
        }
        if (!(obj instanceof u0)) {
            return 0;
        }
        h1 h1Var = ((u0) obj).f37242a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Z();
        return 1;
    }

    @Override // xk.y0
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new z0(u(), null, this);
        }
        s(cancellationException);
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof v0)) {
            return x.f37253d;
        }
        if (((obj instanceof k0) || (obj instanceof b1)) && !(obj instanceof l) && !(obj2 instanceof p)) {
            v0 v0Var = (v0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37187a;
            Object w0Var = obj2 instanceof v0 ? new w0((v0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v0Var, w0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != v0Var) {
                    return x.f37255f;
                }
            }
            Y(obj2);
            z(v0Var, obj2);
            return obj2;
        }
        v0 v0Var2 = (v0) obj;
        h1 h1VarJ = J(v0Var2);
        if (h1VarJ == null) {
            return x.f37255f;
        }
        e1 e1Var = v0Var2 instanceof e1 ? (e1) v0Var2 : null;
        if (e1Var == null) {
            e1Var = new e1(h1VarJ, null);
        }
        synchronized (e1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e1.f37183b;
            if (atomicIntegerFieldUpdater.get(e1Var) == 1) {
                return x.f37253d;
            }
            atomicIntegerFieldUpdater.set(e1Var, 1);
            if (e1Var != v0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f37187a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, v0Var2, e1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != v0Var2) {
                        return x.f37255f;
                    }
                }
            }
            boolean zE = e1Var.e();
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            if (pVar != null) {
                e1Var.a(pVar.f37219a);
            }
            Throwable thB = zE ? null : e1Var.b();
            if (thB != null) {
                X(h1VarJ, thB);
            }
            l lVarW = W(h1VarJ);
            if (lVarW != null && f0(e1Var, lVarW, obj2)) {
                return x.f37254e;
            }
            h1VarJ.e(new cl.i(2), 2);
            l lVarW2 = W(h1VarJ);
            return (lVarW2 == null || !f0(e1Var, lVarW2, obj2)) ? C(e1Var, obj2) : x.f37254e;
        }
    }

    public final boolean f0(e1 e1Var, l lVar, Object obj) {
        while (x.r(lVar.f37204e, false, new d1(this, e1Var, lVar, obj)) == j1.f37202a) {
            lVar = W(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // xk.y0
    public final Object g(ek.c cVar) {
        Object obj;
        yj.u uVar;
        do {
            obj = f37187a.get(this);
            boolean z3 = obj instanceof v0;
            uVar = yj.u.f37649a;
            if (!z3) {
                x.j(cVar.getContext());
                return uVar;
            }
        } while (c0(obj) < 0);
        h hVar = new h(1, a.a.r(cVar));
        hVar.s();
        hVar.v(new e(2, x.r(this, true, new j(hVar, 1))));
        Object objR = hVar.r();
        dk.a aVar = dk.a.f22275a;
        if (objR != aVar) {
            objR = uVar;
        }
        return objR == aVar ? objR : uVar;
    }

    @Override // ck.f
    public final ck.g getKey() {
        return s.f37235b;
    }

    @Override // xk.y0
    public final boolean isCancelled() {
        Object obj = f37187a.get(this);
        if (obj instanceof p) {
            return true;
        }
        return (obj instanceof e1) && ((e1) obj).e();
    }

    @Override // xk.y0
    public final i0 m(mk.c cVar) {
        return Q(true, new j0(1, cVar));
    }

    @Override // xk.y0
    public final CancellationException p() {
        CancellationException cancellationException;
        Object obj = f37187a.get(this);
        if (!(obj instanceof e1)) {
            if (obj instanceof v0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof p)) {
                return new z0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((p) obj).f37219a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new z0(u(), th2, this) : cancellationException;
        }
        Throwable thB = ((e1) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = u();
        }
        return new z0(strConcat, thB, this);
    }

    public void q(Object obj) {
        o(obj);
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
    public final boolean r(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.f1.r(java.lang.Object):boolean");
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    @Override // xk.y0
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(f37187a.get(this));
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    public final boolean t(Throwable th2) {
        if (S()) {
            return true;
        }
        boolean z3 = th2 instanceof CancellationException;
        k kVar = (k) f37188b.get(this);
        return (kVar == null || kVar == j1.f37202a) ? z3 : kVar.b(th2) || z3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(V() + '{' + d0(f37187a.get(this)) + '}');
        sb2.append('@');
        sb2.append(x.n(this));
        return sb2.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    @Override // xk.y0
    public final i0 w(boolean z3, boolean z10, c0.a aVar) {
        return Q(z10, z3 ? new x0(aVar) : new j0(1, aVar));
    }

    public boolean x(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return r(th2) && H();
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }

    public final void z(v0 v0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37188b;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.a();
            atomicReferenceFieldUpdater.set(this, j1.f37202a);
        }
        ac.m mVar = null;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th2 = pVar != null ? pVar.f37219a : null;
        if (v0Var instanceof b1) {
            try {
                ((b1) v0Var).l(th2);
                return;
            } catch (Throwable th3) {
                M(new ac.m("Exception in completion handler " + v0Var + " for " + this, th3));
                return;
            }
        }
        h1 h1VarD = v0Var.d();
        if (h1VarD != null) {
            h1VarD.e(new cl.i(1), 1);
            Object obj2 = cl.k.f2924a.get(h1VarD);
            nk.k.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (cl.k kVarH = (cl.k) obj2; !kVarH.equals(h1VarD); kVarH = kVarH.h()) {
                if (kVarH instanceof b1) {
                    try {
                        ((b1) kVarH).l(th2);
                    } catch (Throwable th4) {
                        if (mVar != null) {
                            wd.b.a(mVar, th4);
                        } else {
                            mVar = new ac.m("Exception in completion handler " + kVarH + " for " + this, th4);
                        }
                    }
                }
            }
            if (mVar != null) {
                M(mVar);
            }
        }
    }

    public void Z() {
    }

    public void M(ac.m mVar) {
        throw mVar;
    }

    public void Y(Object obj) {
    }

    public void o(Object obj) {
    }
}
