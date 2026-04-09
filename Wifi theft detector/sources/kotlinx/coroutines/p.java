package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public class p extends t0 implements o, d9.c, u2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22582f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22583g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22584h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final c9.c f22585d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.d f22586e;

    public p(c9.c cVar, int i10) {
        super(i10);
        this.f22585d = cVar;
        this.f22586e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f22301a;
    }

    public static /* synthetic */ void Q(p pVar, Object obj, int i10, l9.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        pVar.P(obj, i10, lVar);
    }

    public final String A() {
        Object objX = x();
        return objX instanceof g2 ? "Active" : objX instanceof s ? "Cancelled" : "Completed";
    }

    @Override // kotlinx.coroutines.o
    public void C(Object obj) {
        t(this.f22692c);
    }

    public void F() {
        y0 y0VarG = G();
        if (y0VarG != null && d()) {
            y0VarG.d();
            f22584h.set(this, f2.f22359a);
        }
    }

    public final y0 G() {
        r1 r1Var = (r1) getContext().get(r1.H8);
        if (r1Var == null) {
            return null;
        }
        y0 y0VarD = r1.a.d(r1Var, true, false, new t(this), 2, null);
        t.a.a(f22584h, this, null, y0VarD);
        return y0VarD;
    }

    public final void H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22583g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d)) {
                if (obj2 instanceof m ? true : obj2 instanceof kotlinx.coroutines.internal.z) {
                    K(obj, obj2);
                } else {
                    if (obj2 instanceof c0) {
                        c0 c0Var = (c0) obj2;
                        if (!c0Var.c()) {
                            K(obj, obj2);
                        }
                        if (obj2 instanceof s) {
                            if (!androidx.activity.o.a(obj2)) {
                                c0Var = null;
                            }
                            Throwable th = c0Var != null ? c0Var.f22236a : null;
                            if (obj instanceof m) {
                                m((m) obj, th);
                                return;
                            } else {
                                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                o((kotlinx.coroutines.internal.z) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof b0) {
                        b0 b0Var = (b0) obj2;
                        if (b0Var.f22229b != null) {
                            K(obj, obj2);
                        }
                        if (obj instanceof kotlinx.coroutines.internal.z) {
                            return;
                        }
                        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        m mVar = (m) obj;
                        if (b0Var.c()) {
                            m(mVar, b0Var.f22232e);
                            return;
                        } else {
                            if (t.a.a(f22583g, this, obj2, b0.b(b0Var, null, mVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof kotlinx.coroutines.internal.z) {
                            return;
                        }
                        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (t.a.a(f22583g, this, obj2, new b0(obj2, (m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (t.a.a(f22583g, this, obj2, obj)) {
                return;
            }
        }
    }

    public final boolean I() {
        if (!u0.c(this.f22692c)) {
            return false;
        }
        c9.c cVar = this.f22585d;
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.i) cVar).q();
    }

    public final m J(l9.l lVar) {
        return lVar instanceof m ? (m) lVar : new o1(lVar);
    }

    public final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th) {
        if (p(th)) {
            return;
        }
        k(th);
        r();
    }

    public final void N() {
        Throwable thU;
        c9.c cVar = this.f22585d;
        kotlinx.coroutines.internal.i iVar = cVar instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) cVar : null;
        if (iVar == null || (thU = iVar.u(this)) == null) {
            return;
        }
        q();
        k(thU);
    }

    public final boolean O() {
        Object obj = f22583g.get(this);
        if ((obj instanceof b0) && ((b0) obj).f22231d != null) {
            q();
            return false;
        }
        f22582f.set(this, 536870911);
        f22583g.set(this, d.f22301a);
        return true;
    }

    public final void P(Object obj, int i10, l9.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22583g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g2)) {
                Object obj3 = obj;
                l9.l lVar2 = lVar;
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.e()) {
                        if (lVar2 != null) {
                            n(lVar2, sVar.f22236a);
                            return;
                        }
                        return;
                    }
                }
                l(obj3);
                throw new KotlinNothingValueException();
            }
            Object obj4 = obj;
            int i11 = i10;
            l9.l lVar3 = lVar;
            if (t.a.a(f22583g, this, obj2, R((g2) obj2, obj4, i11, lVar3, null))) {
                r();
                t(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                lVar = lVar3;
            }
        }
    }

    public final Object R(g2 g2Var, Object obj, int i10, l9.l lVar, Object obj2) {
        if (obj instanceof c0) {
            return obj;
        }
        if ((u0.b(i10) || obj2 != null) && !(lVar == null && !(g2Var instanceof m) && obj2 == null)) {
            return new b0(obj, g2Var instanceof m ? (m) g2Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean S() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22582f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f22582f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    public final kotlinx.coroutines.internal.c0 T(Object obj, Object obj2, l9.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22583g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof g2)) {
                Object obj4 = obj2;
                if ((obj3 instanceof b0) && obj4 != null && ((b0) obj3).f22231d == obj4) {
                    return q.f22591a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            l9.l lVar2 = lVar;
            if (t.a.a(f22583g, this, obj3, R((g2) obj3, obj5, this.f22692c, lVar2, obj6))) {
                r();
                return q.f22591a;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    public final boolean U() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22582f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f22582f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // kotlinx.coroutines.u2
    public void a(kotlinx.coroutines.internal.z zVar, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22582f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        H(zVar);
    }

    @Override // kotlinx.coroutines.t0
    public void b(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22583g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof c0) {
                return;
            }
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (b0Var.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (t.a.a(f22583g, this, obj2, b0.b(b0Var, null, null, null, null, th3, 15, null))) {
                    b0Var.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (t.a.a(f22583g, this, obj2, new b0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // kotlinx.coroutines.t0
    public final c9.c c() {
        return this.f22585d;
    }

    @Override // kotlinx.coroutines.o
    public boolean d() {
        return !(x() instanceof g2);
    }

    @Override // kotlinx.coroutines.o
    public void e(l9.l lVar) {
        H(J(lVar));
    }

    @Override // kotlinx.coroutines.t0
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // kotlinx.coroutines.t0
    public Object g(Object obj) {
        return obj instanceof b0 ? ((b0) obj).f22228a : obj;
    }

    @Override // d9.c
    public d9.c getCallerFrame() {
        c9.c cVar = this.f22585d;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return this.f22586e;
    }

    @Override // kotlinx.coroutines.o
    public Object i(Throwable th) {
        return T(new c0(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.o
    public boolean isActive() {
        return x() instanceof g2;
    }

    @Override // kotlinx.coroutines.t0
    public Object j() {
        return x();
    }

    @Override // kotlinx.coroutines.o
    public boolean k(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22583g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g2)) {
                return false;
            }
        } while (!t.a.a(f22583g, this, obj, new s(this, th, (obj instanceof m) || (obj instanceof kotlinx.coroutines.internal.z))));
        g2 g2Var = (g2) obj;
        if (g2Var instanceof m) {
            m((m) obj, th);
        } else if (g2Var instanceof kotlinx.coroutines.internal.z) {
            o((kotlinx.coroutines.internal.z) obj, th);
        }
        r();
        t(this.f22692c);
        return true;
    }

    public final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void m(m mVar, Throwable th) {
        try {
            mVar.i(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(l9.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(kotlinx.coroutines.internal.z zVar, Throwable th) {
        int i10 = f22582f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            zVar.r(i10, th, getContext());
        } catch (Throwable th2) {
            h0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean p(Throwable th) {
        if (!I()) {
            return false;
        }
        c9.c cVar = this.f22585d;
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.i) cVar).r(th);
    }

    public final void q() {
        y0 y0VarV = v();
        if (y0VarV == null) {
            return;
        }
        y0VarV.d();
        f22584h.set(this, f2.f22359a);
    }

    public final void r() {
        if (I()) {
            return;
        }
        q();
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        Q(this, f0.b(obj, this), this.f22692c, null, 4, null);
    }

    @Override // kotlinx.coroutines.o
    public Object s(Object obj, Object obj2, l9.l lVar) {
        return T(obj, obj2, lVar);
    }

    public final void t(int i10) {
        if (S()) {
            return;
        }
        u0.a(this, i10);
    }

    public String toString() {
        return L() + '(' + l0.c(this.f22585d) + "){" + A() + "}@" + l0.b(this);
    }

    public Throwable u(r1 r1Var) {
        return r1Var.m();
    }

    public final y0 v() {
        return (y0) f22584h.get(this);
    }

    public final Object w() {
        r1 r1Var;
        boolean zI = I();
        if (U()) {
            if (v() == null) {
                G();
            }
            if (zI) {
                N();
            }
            return kotlin.coroutines.intrinsics.a.f();
        }
        if (zI) {
            N();
        }
        Object objX = x();
        if (objX instanceof c0) {
            throw ((c0) objX).f22236a;
        }
        if (!u0.b(this.f22692c) || (r1Var = (r1) getContext().get(r1.H8)) == null || r1Var.isActive()) {
            return g(objX);
        }
        CancellationException cancellationExceptionM = r1Var.m();
        b(objX, cancellationExceptionM);
        throw cancellationExceptionM;
    }

    public final Object x() {
        return f22583g.get(this);
    }

    @Override // kotlinx.coroutines.o
    public void y(Object obj, l9.l lVar) {
        P(obj, this.f22692c, lVar);
    }

    @Override // kotlinx.coroutines.o
    public void z(CoroutineDispatcher coroutineDispatcher, Object obj) {
        c9.c cVar = this.f22585d;
        kotlinx.coroutines.internal.i iVar = cVar instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) cVar : null;
        Q(this, obj, (iVar != null ? iVar.f22535d : null) == coroutineDispatcher ? 4 : this.f22692c, null, 4, null);
    }
}
