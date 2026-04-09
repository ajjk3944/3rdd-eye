package Ii;

import Ii.InterfaceC3067m;
import Ni.C3405g;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.coroutines.CompletionHandlerException;
import mh.InterfaceC6835l;

/* renamed from: Ii.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3073p extends AbstractC3044a0 implements InterfaceC3069n, kotlin.coroutines.jvm.internal.e, a1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9346f = AtomicIntegerFieldUpdater.newUpdater(C3073p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9347g = AtomicReferenceFieldUpdater.newUpdater(C3073p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9348h = AtomicReferenceFieldUpdater.newUpdater(C3073p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5380e f9349d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5384i f9350e;

    public C3073p(InterfaceC5380e interfaceC5380e, int i10) {
        super(i10);
        this.f9349d = interfaceC5380e;
        this.f9350e = interfaceC5380e.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3049d.f9305a;
    }

    private final InterfaceC3052e0 C() {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) getContext().get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 == null) {
            return null;
        }
        InterfaceC3052e0 interfaceC3052e0O = B0.o(interfaceC3091y0, false, new C3080t(this), 1, null);
        androidx.concurrent.futures.b.a(f9348h, this, null, interfaceC3052e0O);
        return interfaceC3052e0O;
    }

    private final void D(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9347g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3049d) {
                if (androidx.concurrent.futures.b.a(f9347g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC3067m) || (obj2 instanceof Ni.z)) {
                G(obj, obj2);
            } else {
                if (obj2 instanceof C) {
                    C c10 = (C) obj2;
                    if (!c10.c()) {
                        G(obj, obj2);
                    }
                    if (obj2 instanceof C3078s) {
                        if (!(obj2 instanceof C)) {
                            c10 = null;
                        }
                        Throwable th2 = c10 != null ? c10.f9236a : null;
                        if (obj instanceof InterfaceC3067m) {
                            j((InterfaceC3067m) obj, th2);
                            return;
                        } else {
                            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            l((Ni.z) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (b10.f9231b != null) {
                        G(obj, obj2);
                    }
                    if (obj instanceof Ni.z) {
                        return;
                    }
                    AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC3067m interfaceC3067m = (InterfaceC3067m) obj;
                    if (b10.c()) {
                        j(interfaceC3067m, b10.f9234e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f9347g, this, obj2, B.b(b10, null, interfaceC3067m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Ni.z) {
                        return;
                    }
                    AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f9347g, this, obj2, new B(obj2, (InterfaceC3067m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (AbstractC3046b0.c(this.f9299c)) {
            InterfaceC5380e interfaceC5380e = this.f9349d;
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C3405g) interfaceC5380e).m()) {
                return true;
            }
        }
        return false;
    }

    private final void G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J N(InterfaceC6835l interfaceC6835l, Throwable th2, Object obj, InterfaceC5384i interfaceC5384i) {
        interfaceC6835l.invoke(th2);
        return Yg.J.f24997a;
    }

    public static /* synthetic */ void P(C3073p c3073p, Object obj, int i10, mh.q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        c3073p.O(obj, i10, qVar);
    }

    private final Object Q(L0 l02, Object obj, int i10, mh.q qVar, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if (!AbstractC3046b0.b(i10) && obj2 == null) {
            return obj;
        }
        if (qVar == null && !(l02 instanceof InterfaceC3067m) && obj2 == null) {
            return obj;
        }
        return new B(obj, l02 instanceof InterfaceC3067m ? (InterfaceC3067m) l02 : null, qVar, obj2, null, 16, null);
    }

    private final boolean R() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9346f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9346f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final Ni.C S(Object obj, Object obj2, mh.q qVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9347g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof L0)) {
                if ((obj3 instanceof B) && obj2 != null && ((B) obj3).f9233d == obj2) {
                    return AbstractC3075q.f9352a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f9347g, this, obj3, Q((L0) obj3, obj, this.f9299c, qVar, obj2)));
        o();
        return AbstractC3075q.f9352a;
    }

    private final boolean T() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9346f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9346f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void l(Ni.z zVar, Throwable th2) {
        int i10 = f9346f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            zVar.s(i10, th2, getContext());
        } catch (Throwable th3) {
            L.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean m(Throwable th2) {
        if (!F()) {
            return false;
        }
        InterfaceC5380e interfaceC5380e = this.f9349d;
        AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3405g) interfaceC5380e).n(th2);
    }

    private final void o() {
        if (F()) {
            return;
        }
        n();
    }

    private final void q(int i10) {
        if (R()) {
            return;
        }
        AbstractC3046b0.a(this, i10);
    }

    private final InterfaceC3052e0 t() {
        return (InterfaceC3052e0) f9348h.get(this);
    }

    private final String w() {
        Object objV = v();
        return objV instanceof L0 ? "Active" : objV instanceof C3078s ? "Cancelled" : "Completed";
    }

    public void A() {
        InterfaceC3052e0 interfaceC3052e0C = C();
        if (interfaceC3052e0C != null && isCompleted()) {
            interfaceC3052e0C.dispose();
            f9348h.set(this, K0.f9274a);
        }
    }

    @Override // Ii.InterfaceC3069n
    public void B(InterfaceC6835l interfaceC6835l) {
        r.c(this, new InterfaceC3067m.a(interfaceC6835l));
    }

    @Override // Ii.InterfaceC3069n
    public void C0(Object obj) {
        q(this.f9299c);
    }

    public final void E(InterfaceC3067m interfaceC3067m) {
        D(interfaceC3067m);
    }

    protected String H() {
        return "CancellableContinuation";
    }

    public final void I(Throwable th2) {
        if (m(th2)) {
            return;
        }
        cancel(th2);
        o();
    }

    @Override // Ii.InterfaceC3069n
    public void J(J j10, Object obj) {
        InterfaceC5380e interfaceC5380e = this.f9349d;
        C3405g c3405g = interfaceC5380e instanceof C3405g ? (C3405g) interfaceC5380e : null;
        P(this, obj, (c3405g != null ? c3405g.f16592d : null) == j10 ? 4 : this.f9299c, null, 4, null);
    }

    public final void K() {
        Throwable thQ;
        InterfaceC5380e interfaceC5380e = this.f9349d;
        C3405g c3405g = interfaceC5380e instanceof C3405g ? (C3405g) interfaceC5380e : null;
        if (c3405g == null || (thQ = c3405g.q(this)) == null) {
            return;
        }
        n();
        cancel(thQ);
    }

    public final boolean L() {
        Object obj = f9347g.get(this);
        if ((obj instanceof B) && ((B) obj).f9233d != null) {
            n();
            return false;
        }
        f9346f.set(this, 536870911);
        f9347g.set(this, C3049d.f9305a);
        return true;
    }

    public void M(Object obj, final InterfaceC6835l interfaceC6835l) {
        O(obj, this.f9299c, interfaceC6835l != null ? new mh.q() { // from class: Ii.o
            @Override // mh.q
            public final Object s(Object obj2, Object obj3, Object obj4) {
                return C3073p.N(interfaceC6835l, (Throwable) obj2, obj3, (InterfaceC5384i) obj4);
            }
        } : null);
    }

    public final void O(Object obj, int i10, mh.q qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9347g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof L0)) {
                if (obj2 instanceof C3078s) {
                    C3078s c3078s = (C3078s) obj2;
                    if (c3078s.e()) {
                        if (qVar != null) {
                            k(qVar, c3078s.f9236a, obj);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f9347g, this, obj2, Q((L0) obj2, obj, i10, qVar, null)));
        o();
        q(i10);
    }

    @Override // Ii.AbstractC3044a0
    public void a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9347g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof L0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b10 = (B) obj2;
                if (b10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.b.a(f9347g, this, obj2, B.b(b10, null, null, null, null, th2, 15, null))) {
                    b10.d(this, th2);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f9347g, this, obj2, new B(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // Ii.a1
    public void b(Ni.z zVar, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9346f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        D(zVar);
    }

    @Override // Ii.InterfaceC3069n
    public void b0(Object obj, mh.q qVar) {
        O(obj, this.f9299c, qVar);
    }

    @Override // Ii.AbstractC3044a0
    public final InterfaceC5380e c() {
        return this.f9349d;
    }

    @Override // Ii.InterfaceC3069n
    public boolean cancel(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9347g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof L0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f9347g, this, obj, new C3078s(this, th2, (obj instanceof InterfaceC3067m) || (obj instanceof Ni.z))));
        L0 l02 = (L0) obj;
        if (l02 instanceof InterfaceC3067m) {
            j((InterfaceC3067m) obj, th2);
        } else if (l02 instanceof Ni.z) {
            l((Ni.z) obj, th2);
        }
        o();
        q(this.f9299c);
        return true;
    }

    @Override // Ii.AbstractC3044a0
    public Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // Ii.AbstractC3044a0
    public Object e(Object obj) {
        return obj instanceof B ? ((B) obj).f9230a : obj;
    }

    @Override // Ii.AbstractC3044a0
    public Object g() {
        return v();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f9349d;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return this.f9350e;
    }

    @Override // Ii.InterfaceC3069n
    public boolean isCompleted() {
        return !(v() instanceof L0);
    }

    public final void j(InterfaceC3067m interfaceC3067m, Throwable th2) {
        try {
            interfaceC3067m.a(th2);
        } catch (Throwable th3) {
            L.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void k(mh.q qVar, Throwable th2, Object obj) {
        try {
            qVar.s(th2, obj, getContext());
        } catch (Throwable th3) {
            L.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void n() {
        InterfaceC3052e0 interfaceC3052e0T = t();
        if (interfaceC3052e0T == null) {
            return;
        }
        interfaceC3052e0T.dispose();
        f9348h.set(this, K0.f9274a);
    }

    @Override // Ii.InterfaceC3069n
    public Object p(Object obj, Object obj2, mh.q qVar) {
        return S(obj, obj2, qVar);
    }

    @Override // Ii.InterfaceC3069n
    public Object r(Throwable th2) {
        return S(new C(th2, false, 2, null), null, null);
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        P(this, D.c(obj, this), this.f9299c, null, 4, null);
    }

    public Throwable s(InterfaceC3091y0 interfaceC3091y0) {
        return interfaceC3091y0.getCancellationException();
    }

    public String toString() {
        return H() + '(' + S.c(this.f9349d) + "){" + w() + "}@" + S.b(this);
    }

    public final Object u() {
        InterfaceC3091y0 interfaceC3091y0;
        boolean zF = F();
        if (T()) {
            if (t() == null) {
                C();
            }
            if (zF) {
                K();
            }
            return AbstractC5467b.g();
        }
        if (zF) {
            K();
        }
        Object objV = v();
        if (objV instanceof C) {
            throw ((C) objV).f9236a;
        }
        if (!AbstractC3046b0.b(this.f9299c) || (interfaceC3091y0 = (InterfaceC3091y0) getContext().get(InterfaceC3091y0.f9363O)) == null || interfaceC3091y0.isActive()) {
            return e(objV);
        }
        CancellationException cancellationException = interfaceC3091y0.getCancellationException();
        a(objV, cancellationException);
        throw cancellationException;
    }

    public final Object v() {
        return f9347g.get(this);
    }
}
