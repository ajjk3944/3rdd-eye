package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class g40 implements w30, ik0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(g40.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(g40.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public g40(boolean z) {
        this._state$volatile = z ? wl2.h : wl2.g;
    }

    public static te I(b80 b80Var) {
        while (b80Var.j()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b80.g;
            b80 b80VarF = b80Var.f();
            if (b80VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(b80Var);
                while (true) {
                    b80Var = (b80) obj;
                    if (!b80Var.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(b80Var);
                }
            } else {
                b80Var = b80VarF;
            }
        }
        while (true) {
            b80Var = b80Var.i();
            if (!b80Var.j()) {
                if (b80Var instanceof te) {
                    return (te) b80Var;
                }
                if (b80Var instanceof oh0) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof e40)) {
            return obj instanceof l20 ? ((l20) obj).a() ? "Active" : "New" : obj instanceof pg ? "Cancelled" : "Completed";
        }
        e40 e40Var = (e40) obj;
        return e40Var.d() ? "Cancelling" : e40Var.f() ? "Completing" : "Active";
    }

    public final Object A() {
        while (true) {
            Object obj = f.get(this);
            if (!(obj instanceof nj0)) {
                return obj;
            }
            ((nj0) obj).a(this);
        }
    }

    public boolean B(Throwable th) {
        return false;
    }

    public final void D(w30 w30Var) {
        int iN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        ph0 ph0Var = ph0.f;
        if (w30Var == null) {
            atomicReferenceFieldUpdater.set(this, ph0Var);
            return;
        }
        g40 g40Var = (g40) w30Var;
        do {
            iN = g40Var.N(g40Var.A());
            if (iN == 0) {
                break;
            }
        } while (iN != 1);
        se seVar = (se) wl2.o(g40Var, true, new te(this), 2);
        atomicReferenceFieldUpdater.set(this, seVar);
        if (A() instanceof l20) {
            return;
        }
        seVar.b();
        atomicReferenceFieldUpdater.set(this, ph0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jp E(boolean r9, boolean r10, defpackage.f30 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g40.E(boolean, boolean, f30):jp");
    }

    public boolean F() {
        return false;
    }

    public final Object G(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objP;
        do {
            objP = P(A(), obj);
            if (objP == wl2.b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                pg pgVar = obj instanceof pg ? (pg) obj : null;
                throw new IllegalStateException(str, pgVar != null ? pgVar.a : null);
            }
        } while (objP == wl2.d);
        return objP;
    }

    public String H() {
        return getClass().getSimpleName();
    }

    public final void J(oh0 oh0Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objH = oh0Var.h();
        i30.k(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        rg rgVar = null;
        for (b80 b80VarI = (b80) objH; !b80VarI.equals(oh0Var); b80VarI = b80VarI.i()) {
            if (b80VarI instanceof y30) {
                b40 b40Var = (b40) b80VarI;
                try {
                    b40Var.d(th);
                } catch (Throwable th2) {
                    if (rgVar != null) {
                        gi2.a(rgVar, th2);
                    } else {
                        rgVar = new rg("Exception in completion handler " + b40Var + " for " + this, th2);
                    }
                }
            }
        }
        if (rgVar != null) {
            C(rgVar);
        }
        p(th);
    }

    public final void M(b40 b40Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        oh0 oh0Var = new oh0();
        b40Var.getClass();
        b80.g.set(oh0Var, b40Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b80.f;
        atomicReferenceFieldUpdater2.set(oh0Var, b40Var);
        loop0: while (true) {
            if (b40Var.h() == b40Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b40Var, b40Var, oh0Var)) {
                    if (atomicReferenceFieldUpdater2.get(b40Var) != b40Var) {
                        break;
                    }
                }
                oh0Var.g(b40Var);
                break loop0;
            }
            break;
        }
        b80 b80VarI = b40Var.i();
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b40Var, b80VarI)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b40Var);
    }

    public final int N(Object obj) {
        boolean z = obj instanceof js;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z) {
            if (((js) obj).f) {
                return 0;
            }
            js jsVar = wl2.h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jsVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof k20)) {
            return 0;
        }
        oh0 oh0Var = ((k20) obj).f;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oh0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object P(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!(obj instanceof l20)) {
            return wl2.b;
        }
        if (((obj instanceof js) || (obj instanceof b40)) && !(obj instanceof te) && !(obj2 instanceof pg)) {
            l20 l20Var = (l20) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object m20Var = obj2 instanceof l20 ? new m20((l20) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, l20Var, m20Var)) {
                if (atomicReferenceFieldUpdater.get(this) != l20Var) {
                    return wl2.d;
                }
            }
            K(obj2);
            s(l20Var, obj2);
            return obj2;
        }
        l20 l20Var2 = (l20) obj;
        oh0 oh0VarZ = z(l20Var2);
        if (oh0VarZ == null) {
            return wl2.d;
        }
        te teVarI = null;
        e40 e40Var = l20Var2 instanceof e40 ? (e40) l20Var2 : null;
        if (e40Var == null) {
            e40Var = new e40(oh0VarZ, null);
        }
        synchronized (e40Var) {
            if (e40Var.f()) {
                return wl2.b;
            }
            e40.g.set(e40Var, 1);
            if (e40Var != l20Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l20Var2, e40Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l20Var2) {
                        return wl2.d;
                    }
                }
            }
            boolean zD = e40Var.d();
            pg pgVar = obj2 instanceof pg ? (pg) obj2 : null;
            if (pgVar != null) {
                e40Var.b(pgVar.a);
            }
            Throwable thC = e40Var.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                J(oh0VarZ, thC);
            }
            te teVar = l20Var2 instanceof te ? (te) l20Var2 : null;
            if (teVar == null) {
                oh0 oh0VarE = l20Var2.e();
                if (oh0VarE != null) {
                    teVarI = I(oh0VarE);
                }
            } else {
                teVarI = teVar;
            }
            if (teVarI != null) {
                while (wl2.o(teVarI.j, false, new d40(this, e40Var, teVarI, obj2), 1) == ph0.f) {
                    teVarI = I(teVarI);
                    if (teVarI == null) {
                    }
                }
                return wl2.c;
            }
            return u(e40Var, obj2);
        }
    }

    @Override // defpackage.w30
    public boolean a() {
        Object objA = A();
        return (objA instanceof l20) && ((l20) objA).a();
    }

    public final boolean d(l20 l20Var, oh0 oh0Var, b40 b40Var) {
        b80 b80VarF;
        f40 f40Var = new f40(b40Var, this, l20Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b80.g;
            b80VarF = oh0Var.f();
            if (b80VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(oh0Var);
                while (true) {
                    b80VarF = (b80) obj;
                    if (!b80VarF.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(b80VarF);
                }
            }
            b80.g.set(b40Var, b80VarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b80.f;
            atomicReferenceFieldUpdater2.set(b40Var, oh0Var);
            f40Var.c = oh0Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(b80VarF, oh0Var, f40Var)) {
                if (atomicReferenceFieldUpdater2.get(b80VarF) != oh0Var) {
                    break;
                }
            }
        }
        return f40Var.a(b80VarF) == null;
    }

    @Override // defpackage.hk
    public final Object f(Object obj, hy hyVar) {
        return hyVar.f(obj, this);
    }

    @Override // defpackage.hk
    public final hk g(hk hkVar) {
        i30.m(hkVar, "context");
        return hkVar == ls.f ? this : (hk) hkVar.f(this, new ig(1));
    }

    @Override // defpackage.fk
    public final gk getKey() {
        return fr.j;
    }

    @Override // defpackage.hk
    public final fk h(gk gkVar) {
        i30.m(gkVar, "key");
        if (i30.c(fr.j, gkVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.hk
    public final hk i(gk gkVar) {
        return g82.n(this, gkVar);
    }

    public void n(Object obj) {
        m(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(java.lang.Object r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g40.o(java.lang.Object):boolean");
    }

    public final boolean p(Throwable th) {
        if (F()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        se seVar = (se) g.get(this);
        return (seVar == null || seVar == ph0.f) ? z : seVar.c(th) || z;
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && x();
    }

    public final void s(l20 l20Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        se seVar = (se) atomicReferenceFieldUpdater.get(this);
        if (seVar != null) {
            seVar.b();
            atomicReferenceFieldUpdater.set(this, ph0.f);
        }
        rg rgVar = null;
        pg pgVar = obj instanceof pg ? (pg) obj : null;
        Throwable th = pgVar != null ? pgVar.a : null;
        if (l20Var instanceof b40) {
            try {
                ((b40) l20Var).d(th);
                return;
            } catch (Throwable th2) {
                C(new rg("Exception in completion handler " + l20Var + " for " + this, th2));
                return;
            }
        }
        oh0 oh0VarE = l20Var.e();
        if (oh0VarE != null) {
            Object objH = oh0VarE.h();
            i30.k(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (b80 b80VarI = (b80) objH; !b80VarI.equals(oh0VarE); b80VarI = b80VarI.i()) {
                if (b80VarI instanceof b40) {
                    b40 b40Var = (b40) b80VarI;
                    try {
                        b40Var.d(th);
                    } catch (Throwable th3) {
                        if (rgVar != null) {
                            gi2.a(rgVar, th3);
                        } else {
                            rgVar = new rg("Exception in completion handler " + b40Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (rgVar != null) {
                C(rgVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable t(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        g40 g40Var = (g40) ((ik0) obj);
        Object objA = g40Var.A();
        if (objA instanceof e40) {
            cancellationExceptionC = ((e40) objA).c();
        } else if (objA instanceof pg) {
            cancellationExceptionC = ((pg) objA).a;
        } else {
            if (objA instanceof l20) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objA).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new x30("Parent job is ".concat(O(objA)), cancellationExceptionC, g40Var) : cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H() + '{' + O(A()) + '}');
        sb.append('@');
        sb.append(um.k(this));
        return sb.toString();
    }

    public final Object u(e40 e40Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thW;
        pg pgVar = obj instanceof pg ? (pg) obj : null;
        Throwable th = pgVar != null ? pgVar.a : null;
        synchronized (e40Var) {
            e40Var.d();
            ArrayList arrayListG = e40Var.g(th);
            thW = w(e40Var, arrayListG);
            if (thW != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                int size = arrayListG.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListG.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thW && th2 != thW && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        gi2.a(thW, th2);
                    }
                }
            }
        }
        if (thW != null && thW != th) {
            obj = new pg(thW, false);
        }
        if (thW != null && (p(thW) || B(thW))) {
            i30.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            pg.b.compareAndSet((pg) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object m20Var = obj instanceof l20 ? new m20((l20) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e40Var, m20Var) && atomicReferenceFieldUpdater.get(this) == e40Var) {
        }
        s(e40Var, obj);
        return obj;
    }

    public final CancellationException v() {
        CancellationException cancellationException;
        Object objA = A();
        if (!(objA instanceof e40)) {
            if (objA instanceof l20) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objA instanceof pg)) {
                return new x30(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((pg) objA).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new x30(q(), th, this) : cancellationException;
        }
        Throwable thC = ((e40) objA).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = q();
        }
        return new x30(strConcat, thC, this);
    }

    public final Throwable w(e40 e40Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e40Var.d()) {
                return new x30(q(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof t11) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof t11)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof mg;
    }

    public final oh0 z(l20 l20Var) {
        oh0 oh0VarE = l20Var.e();
        if (oh0VarE != null) {
            return oh0VarE;
        }
        if (l20Var instanceof js) {
            return new oh0();
        }
        if (l20Var instanceof b40) {
            M((b40) l20Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l20Var).toString());
    }

    public void L() {
    }

    public void C(rg rgVar) {
        throw rgVar;
    }

    public void K(Object obj) {
    }

    public void m(Object obj) {
    }
}
