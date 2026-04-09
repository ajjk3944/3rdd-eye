package A9;

import A9.InterfaceC0579h;
import A9.InterfaceC0594o0;
import F9.C0658a;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: A9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0583j<T> extends S<T> implements InterfaceC0581i<T>, h9.d, U0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f250g = AtomicIntegerFieldUpdater.newUpdater(C0583j.class, "_decisionAndIndex$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f251h = AtomicReferenceFieldUpdater.newUpdater(C0583j.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C0583j.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4347e<T> f252e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4350h f253f;

    public C0583j(int i10, InterfaceC4347e interfaceC4347e) {
        super(i10);
        this.f252e = interfaceC4347e;
        this.f253f = interfaceC4347e.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0567b.f224b;
    }

    public static Object C(F0 f02, Object obj, int i10, p9.l lVar) {
        if (obj instanceof C0602t) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar != null || (f02 instanceof InterfaceC0579h)) {
            return new C0600s(obj, f02 instanceof InterfaceC0579h ? (InterfaceC0579h) f02 : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(F0 f02, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f02 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i10, p9.l<? super Throwable, C1992A> lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f251h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof F0) {
                Object objC = C((F0) obj2, obj, i10, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    n();
                }
                o(i10);
                return;
            }
            if (obj2 instanceof C0587l) {
                C0587l c0587l = (C0587l) obj2;
                c0587l.getClass();
                if (C0587l.f256c.compareAndSet(c0587l, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0587l.f272a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(A a10, C1992A c1992a) {
        InterfaceC4347e<T> interfaceC4347e = this.f252e;
        F9.i iVar = interfaceC4347e instanceof F9.i ? (F9.i) interfaceC4347e : null;
        A(c1992a, (iVar != null ? iVar.f1755e : null) == a10 ? 4 : this.f207d, null);
    }

    public final F9.y D(Object obj, p9.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f251h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj2 instanceof F0;
            F9.y yVar = C0585k.f254a;
            if (!z10) {
                boolean z11 = obj2 instanceof C0600s;
                return null;
            }
            Object objC = C((F0) obj2, obj, this.f207d, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                n();
            }
            return yVar;
        }
    }

    @Override // A9.S
    public final void a(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f251h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof F0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0602t) {
                return;
            }
            if (!(obj2 instanceof C0600s)) {
                cancellationException2 = cancellationException;
                C0600s c0600s = new C0600s(obj2, (InterfaceC0579h) null, (p9.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0600s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0600s c0600s2 = (C0600s) obj2;
            if (c0600s2.f270e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0600s c0600sA = C0600s.a(c0600s2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0600sA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC0579h interfaceC0579h = c0600s2.f267b;
            if (interfaceC0579h != null) {
                i(interfaceC0579h, cancellationException);
            }
            p9.l<Throwable, C1992A> lVar = c0600s2.f268c;
            if (lVar != null) {
                k(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // A9.S
    public final InterfaceC4347e<T> b() {
        return this.f252e;
    }

    @Override // A9.U0
    public final void c(F9.w<?> wVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f250g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(wVar);
    }

    @Override // A9.S
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A9.S
    public final <T> T e(Object obj) {
        return obj instanceof C0600s ? (T) ((C0600s) obj).f266a : obj;
    }

    @Override // A9.InterfaceC0581i
    public final void g(T t10, p9.l<? super Throwable, C1992A> lVar) {
        A(t10, this.f207d, lVar);
    }

    @Override // h9.d
    public final h9.d getCallerFrame() {
        InterfaceC4347e<T> interfaceC4347e = this.f252e;
        if (interfaceC4347e instanceof h9.d) {
            return (h9.d) interfaceC4347e;
        }
        return null;
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return this.f253f;
    }

    @Override // A9.S
    public final Object h() {
        return f251h.get(this);
    }

    public final void i(InterfaceC0579h interfaceC0579h, Throwable th) {
        try {
            interfaceC0579h.a(th);
        } catch (Throwable th2) {
            C.a(this.f253f, new C0606v("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // A9.InterfaceC0581i
    public final boolean isActive() {
        return f251h.get(this) instanceof F0;
    }

    @Override // A9.InterfaceC0581i
    public final F9.y j(Object obj, p9.l lVar) {
        return D(obj, lVar);
    }

    public final void k(p9.l<? super Throwable, C1992A> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C.a(this.f253f, new C0606v("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(F9.w<?> wVar, Throwable th) {
        InterfaceC4350h interfaceC4350h = this.f253f;
        int i10 = f250g.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            wVar.h(i10, interfaceC4350h);
        } catch (Throwable th2) {
            C.a(interfaceC4350h, new C0606v("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f251h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof F0)) {
                return false;
            }
            C0587l c0587l = new C0587l(this, th, (obj instanceof InterfaceC0579h) || (obj instanceof F9.w));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0587l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            F0 f02 = (F0) obj;
            if (f02 instanceof InterfaceC0579h) {
                i((InterfaceC0579h) obj, th);
            } else if (f02 instanceof F9.w) {
                l((F9.w) obj, th);
            }
            if (!w()) {
                n();
            }
            o(this.f207d);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        W w10 = (W) atomicReferenceFieldUpdater.get(this);
        if (w10 == null) {
            return;
        }
        w10.dispose();
        atomicReferenceFieldUpdater.set(this, E0.f187b);
    }

    public final void o(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f250g;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                InterfaceC4347e<T> interfaceC4347e = this.f252e;
                if (!z10 && (interfaceC4347e instanceof F9.i)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f207d;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        A a10 = ((F9.i) interfaceC4347e).f1755e;
                        InterfaceC4350h context = ((F9.i) interfaceC4347e).f1756f.getContext();
                        if (a10.P0(context)) {
                            a10.N0(context, this);
                            return;
                        }
                        AbstractC0566a0 abstractC0566a0A = N0.a();
                        if (abstractC0566a0A.f221c >= 4294967296L) {
                            abstractC0566a0A.S0(this);
                            return;
                        }
                        abstractC0566a0A.T0(true);
                        try {
                            C0575f.f(this, interfaceC4347e, true);
                            do {
                            } while (abstractC0566a0A.V0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                C0575f.f(this, interfaceC4347e, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    @Override // A9.InterfaceC0581i
    public final void p(Object obj) {
        o(this.f207d);
    }

    public Throwable q(C0605u0 c0605u0) {
        return c0605u0.A();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f250g;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f251h.get(this);
                if (obj instanceof C0602t) {
                    throw ((C0602t) obj).f272a;
                }
                int i12 = this.f207d;
                if (i12 == 1 || i12 == 2) {
                    InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) this.f253f.get(InterfaceC0594o0.a.f263b);
                    if (interfaceC0594o0 != null && !interfaceC0594o0.isActive()) {
                        CancellationException cancellationExceptionA = interfaceC0594o0.A();
                        a(obj, cancellationExceptionA);
                        throw cancellationExceptionA;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((W) i.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return g9.a.COROUTINE_SUSPENDED;
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        Throwable thA = b9.m.a(obj);
        if (thA != null) {
            obj = new C0602t(false, thA);
        }
        A(obj, this.f207d, null);
    }

    public final void s() {
        W wT = t();
        if (wT == null || (f251h.get(this) instanceof F0)) {
            return;
        }
        wT.dispose();
        i.set(this, E0.f187b);
    }

    public final W t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) this.f253f.get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 == null) {
            return null;
        }
        W wD = C0572d0.d(interfaceC0594o0, true, new C0589m(this), 2);
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, wD)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return wD;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(I.F(this.f252e));
        sb.append("){");
        Object obj = f251h.get(this);
        sb.append(obj instanceof F0 ? "Active" : obj instanceof C0587l ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(I.x(this));
        return sb.toString();
    }

    public final void u(p9.l<? super Throwable, C1992A> lVar) {
        v(new InterfaceC0579h.a(lVar));
    }

    public final void v(F0 f02) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f251h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0567b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC0579h ? true : obj instanceof F9.w) {
                x(f02, obj);
                throw null;
            }
            if (obj instanceof C0602t) {
                C0602t c0602t = (C0602t) obj;
                c0602t.getClass();
                if (!C0602t.f271b.compareAndSet(c0602t, 0, 1)) {
                    x(f02, obj);
                    throw null;
                }
                if (obj instanceof C0587l) {
                    if (((C0602t) obj) == null) {
                        c0602t = null;
                    }
                    Throwable th = c0602t != null ? c0602t.f272a : null;
                    if (f02 instanceof InterfaceC0579h) {
                        i((InterfaceC0579h) f02, th);
                        return;
                    } else {
                        kotlin.jvm.internal.l.d(f02, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((F9.w) f02, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0600s)) {
                if (f02 instanceof F9.w) {
                    return;
                }
                kotlin.jvm.internal.l.d(f02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0600s c0600s = new C0600s(obj, (InterfaceC0579h) f02, (p9.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0600s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0600s c0600s2 = (C0600s) obj;
            if (c0600s2.f267b != null) {
                x(f02, obj);
                throw null;
            }
            if (f02 instanceof F9.w) {
                return;
            }
            kotlin.jvm.internal.l.d(f02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC0579h interfaceC0579h = (InterfaceC0579h) f02;
            Throwable th2 = c0600s2.f270e;
            if (th2 != null) {
                i(interfaceC0579h, th2);
                return;
            }
            C0600s c0600sA = C0600s.a(c0600s2, interfaceC0579h, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0600sA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f207d != 2) {
            return false;
        }
        InterfaceC4347e<T> interfaceC4347e = this.f252e;
        kotlin.jvm.internal.l.d(interfaceC4347e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return F9.i.i.get((F9.i) interfaceC4347e) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC4347e<T> interfaceC4347e = this.f252e;
        Throwable th = null;
        F9.i iVar = interfaceC4347e instanceof F9.i ? (F9.i) interfaceC4347e : null;
        if (iVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F9.i.i;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                F9.y yVar = C0658a.f1746c;
                if (obj == yVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, yVar, this)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != yVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            m(th);
        }
    }
}
