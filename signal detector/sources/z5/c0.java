package z5;

import h5.C2368b;
import h5.C2376j;
import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import h5.InterfaceC2375i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class c0 implements T, g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24523a = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24524b = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public c0(boolean z6) {
        this._state$volatile = z6 ? AbstractC3046w.f24566j : AbstractC3046w.i;
    }

    public static C3034j F(E5.k kVar) {
        while (kVar.m()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.k.f1398b;
            E5.k kVarI = kVar.i();
            if (kVarI == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (E5.k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarI;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C3034j) {
                    return (C3034j) kVar;
                }
                if (kVar instanceof d0) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof a0)) {
            return obj instanceof O ? ((O) obj).a() ? "Active" : "New" : obj instanceof C3038n ? "Cancelled" : "Completed";
        }
        a0 a0Var = (a0) obj;
        return a0Var.d() ? "Cancelling" : a0Var.f() ? "Completing" : "Active";
    }

    public final void B(T t6) {
        int iK;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24524b;
        e0 e0Var = e0.f24527a;
        if (t6 == null) {
            atomicReferenceFieldUpdater.set(this, e0Var);
            return;
        }
        c0 c0Var = (c0) t6;
        do {
            iK = c0Var.K(c0Var.y());
            if (iK == 0) {
                break;
            }
        } while (iK != 1);
        InterfaceC3033i interfaceC3033i = (InterfaceC3033i) c0Var.C((2 & 1) == 0, (2 & 2) != 0, new C3034j(this));
        atomicReferenceFieldUpdater.set(this, interfaceC3033i);
        if (y() instanceof O) {
            return;
        }
        interfaceC3033i.g();
        atomicReferenceFieldUpdater.set(this, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z5.E C(boolean r8, boolean r9, p5.l r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c0.C(boolean, boolean, p5.l):z5.E");
    }

    public boolean D() {
        return false;
    }

    public final Object E(Object obj) {
        Object objM;
        do {
            objM = M(y(), obj);
            if (objM == AbstractC3046w.f24561d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C3038n c3038n = obj instanceof C3038n ? (C3038n) obj : null;
                throw new IllegalStateException(str, c3038n != null ? c3038n.f24546a : null);
            }
        } while (objM == AbstractC3046w.f24563f);
        return objM;
    }

    public final void G(d0 d0Var, Throwable th) {
        Object objK = d0Var.k();
        q5.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        J0.c cVar = null;
        for (E5.k kVarL = (E5.k) objK; !kVarL.equals(d0Var); kVarL = kVarL.l()) {
            if (kVarL instanceof V) {
                X x6 = (X) kVarL;
                try {
                    x6.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        com.bumptech.glide.e.b(cVar, th2);
                    } else {
                        cVar = new J0.c("Exception in completion handler " + x6 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            A(cVar);
        }
        l(th);
    }

    public final void J(X x6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 d0Var = new d0();
        x6.getClass();
        E5.k.f1398b.set(d0Var, x6);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E5.k.f1397a;
        atomicReferenceFieldUpdater2.set(d0Var, x6);
        loop0: while (true) {
            if (x6.k() == x6) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(x6, x6, d0Var)) {
                    if (atomicReferenceFieldUpdater2.get(x6) != x6) {
                        break;
                    }
                }
                d0Var.j(x6);
                break loop0;
            }
            break;
        }
        E5.k kVarL = x6.l();
        do {
            atomicReferenceFieldUpdater = f24523a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x6, kVarL)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x6);
    }

    public final int K(Object obj) {
        boolean z6 = obj instanceof F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24523a;
        if (z6) {
            if (((F) obj).f24487a) {
                return 0;
            }
            F f2 = AbstractC3046w.f24566j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof N)) {
            return 0;
        }
        d0 d0Var = ((N) obj).f24500a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object M(Object obj, Object obj2) {
        if (!(obj instanceof O)) {
            return AbstractC3046w.f24561d;
        }
        if (((obj instanceof F) || (obj instanceof X)) && !(obj instanceof C3034j) && !(obj2 instanceof C3038n)) {
            O o5 = (O) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24523a;
            Object p6 = obj2 instanceof O ? new P((O) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, o5, p6)) {
                if (atomicReferenceFieldUpdater.get(this) != o5) {
                    return AbstractC3046w.f24563f;
                }
            }
            H(obj2);
            r(o5, obj2);
            return obj2;
        }
        O o6 = (O) obj;
        d0 d0VarX = x(o6);
        if (d0VarX == null) {
            return AbstractC3046w.f24563f;
        }
        C3034j c3034jF = null;
        a0 a0Var = o6 instanceof a0 ? (a0) o6 : null;
        if (a0Var == null) {
            a0Var = new a0(d0VarX, null);
        }
        synchronized (a0Var) {
            if (a0Var.f()) {
                return AbstractC3046w.f24561d;
            }
            a0.f24514b.set(a0Var, 1);
            if (a0Var != o6) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24523a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, o6, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != o6) {
                        return AbstractC3046w.f24563f;
                    }
                }
            }
            boolean zD = a0Var.d();
            C3038n c3038n = obj2 instanceof C3038n ? (C3038n) obj2 : null;
            if (c3038n != null) {
                a0Var.b(c3038n.f24546a);
            }
            Throwable thC = a0Var.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                G(d0VarX, thC);
            }
            C3034j c3034j = o6 instanceof C3034j ? (C3034j) o6 : null;
            if (c3034j == null) {
                d0 d0VarE = o6.e();
                if (d0VarE != null) {
                    c3034jF = F(d0VarE);
                }
            } else {
                c3034jF = c3034j;
            }
            if (c3034jF != null) {
                while (c3034jF.f24535e.C((2 & 1) == 0, (2 & 2) != 0, new Z(this, a0Var, c3034jF, obj2)) == e0.f24527a) {
                    c3034jF = F(c3034jF);
                    if (c3034jF == null) {
                    }
                }
                return AbstractC3046w.f24562e;
            }
            return t(a0Var, obj2);
        }
    }

    @Override // z5.T
    public boolean a() {
        Object objY = y();
        return (objY instanceof O) && ((O) objY).a();
    }

    public final boolean b(O o5, d0 d0Var, X x6) {
        char c6;
        b0 b0Var = new b0(x6, this, o5);
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.k.f1398b;
            E5.k kVarI = d0Var.i();
            if (kVarI == null) {
                Object obj = atomicReferenceFieldUpdater.get(d0Var);
                while (true) {
                    kVarI = (E5.k) obj;
                    if (!kVarI.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarI);
                }
            }
            E5.k.f1398b.set(x6, kVarI);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E5.k.f1397a;
            atomicReferenceFieldUpdater2.set(x6, d0Var);
            b0Var.f24520c = d0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarI, d0Var, b0Var)) {
                    c6 = b0Var.a(kVarI) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(kVarI) != d0Var) {
                    c6 = 0;
                    break;
                }
            }
            if (c6 == 1) {
                return true;
            }
        } while (c6 != 2);
        return false;
    }

    public void f(Object obj) {
        c(obj);
    }

    @Override // h5.InterfaceC2373g
    public final InterfaceC2374h getKey() {
        return C3043t.f24555b;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        if (q5.i.a(C3043t.f24555b, interfaceC2374h)) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c0.j(java.lang.Object):boolean");
    }

    public final boolean l(Throwable th) {
        if (D()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC3033i interfaceC3033i = (InterfaceC3033i) f24524b.get(this);
        return (interfaceC3033i == null || interfaceC3033i == e0.f24527a) ? z6 : interfaceC3033i.d(th) || z6;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i m(InterfaceC2375i interfaceC2375i) {
        q5.i.e(interfaceC2375i, "context");
        return interfaceC2375i == C2376j.f20486a ? this : (InterfaceC2375i) interfaceC2375i.o(this, new C2368b(1));
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        return a4.p.m(this, interfaceC2374h);
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p5.p pVar) {
        return pVar.h(obj, this);
    }

    public String p() {
        return "Job was cancelled";
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j(th) && v();
    }

    public final void r(O o5, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24524b;
        InterfaceC3033i interfaceC3033i = (InterfaceC3033i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3033i != null) {
            interfaceC3033i.g();
            atomicReferenceFieldUpdater.set(this, e0.f24527a);
        }
        J0.c cVar = null;
        C3038n c3038n = obj instanceof C3038n ? (C3038n) obj : null;
        Throwable th = c3038n != null ? c3038n.f24546a : null;
        if (o5 instanceof X) {
            try {
                ((X) o5).o(th);
                return;
            } catch (Throwable th2) {
                A(new J0.c("Exception in completion handler " + o5 + " for " + this, th2));
                return;
            }
        }
        d0 d0VarE = o5.e();
        if (d0VarE != null) {
            Object objK = d0VarE.k();
            q5.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (E5.k kVarL = (E5.k) objK; !kVarL.equals(d0VarE); kVarL = kVarL.l()) {
                if (kVarL instanceof X) {
                    X x6 = (X) kVarL;
                    try {
                        x6.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            com.bumptech.glide.e.b(cVar, th3);
                        } else {
                            cVar = new J0.c("Exception in completion handler " + x6 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                A(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        c0 c0Var = (c0) ((g0) obj);
        Object objY = c0Var.y();
        if (objY instanceof a0) {
            cancellationExceptionC = ((a0) objY).c();
        } else if (objY instanceof C3038n) {
            cancellationExceptionC = ((C3038n) objY).f24546a;
        } else {
            if (objY instanceof O) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objY).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new U("Parent job is ".concat(L(objY)), cancellationExceptionC, c0Var) : cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(a0 a0Var, Object obj) {
        Throwable u6 = null;
        C3038n c3038n = obj instanceof C3038n ? (C3038n) obj : null;
        Throwable th = c3038n != null ? c3038n.f24546a : null;
        synchronized (a0Var) {
            a0Var.d();
            ArrayList arrayListG = a0Var.g(th);
            if (!arrayListG.isEmpty()) {
                int size = arrayListG.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj2 = arrayListG.get(i);
                    i++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        u6 = obj2;
                        break;
                    }
                }
                u6 = u6;
                if (u6 == null) {
                    u6 = (Throwable) arrayListG.get(0);
                }
            } else if (a0Var.d()) {
                u6 = new U(p(), null, this);
            }
            if (u6 != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                int size2 = arrayListG.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayListG.get(i3);
                    i3++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != u6 && th2 != u6 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        com.bumptech.glide.e.b(u6, th2);
                    }
                }
            }
        }
        if (u6 != null && u6 != th) {
            obj = new C3038n(u6, false);
        }
        if (u6 != null && (l(u6) || z(u6))) {
            q5.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C3038n.f24545b.compareAndSet((C3038n) obj, 0, 1);
        }
        H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24523a;
        Object p6 = obj instanceof O ? new P((O) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, a0Var, p6) && atomicReferenceFieldUpdater.get(this) == a0Var) {
        }
        r(a0Var, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + L(y()) + '}');
        sb.append('@');
        sb.append(AbstractC3046w.h(this));
        return sb.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object objY = y();
        if (!(objY instanceof a0)) {
            if (objY instanceof O) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objY instanceof C3038n)) {
                return new U(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C3038n) objY).f24546a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new U(p(), th, this) : cancellationException;
        }
        Throwable thC = ((a0) objY).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = p();
        }
        return new U(strConcat, thC, this);
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return this instanceof C3036l;
    }

    public final d0 x(O o5) {
        d0 d0VarE = o5.e();
        if (d0VarE != null) {
            return d0VarE;
        }
        if (o5 instanceof F) {
            return new d0();
        }
        if (o5 instanceof X) {
            J((X) o5);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o5).toString());
    }

    public final Object y() {
        while (true) {
            Object obj = f24523a.get(this);
            if (!(obj instanceof E5.p)) {
                return obj;
            }
            ((E5.p) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void I() {
    }

    public void A(J0.c cVar) {
        throw cVar;
    }

    public void H(Object obj) {
    }

    public void c(Object obj) {
    }
}
