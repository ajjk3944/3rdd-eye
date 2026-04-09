package z5;

import c5.C0409f;
import c5.C0412i;
import d5.C2280h;
import h5.InterfaceC2370d;
import h5.InterfaceC2375i;
import i5.EnumC2380a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: z5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3030f extends C implements InterfaceC3029e, j5.c, n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24528f = AtomicIntegerFieldUpdater.newUpdater(C3030f.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24529g = AtomicReferenceFieldUpdater.newUpdater(C3030f.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24530h = AtomicReferenceFieldUpdater.newUpdater(C3030f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2370d f24531d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2375i f24532e;

    public C3030f(int i, InterfaceC2370d interfaceC2370d) {
        super(i);
        this.f24531d = interfaceC2370d;
        this.f24532e = interfaceC2370d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3026b.f24518a;
    }

    public static Object E(f0 f0Var, Object obj, int i, p5.l lVar) {
        if (obj instanceof C3038n) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (lVar != null || (f0Var instanceof C3028d)) {
            return new C3037m(obj, f0Var instanceof C3028d ? (C3028d) f0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        InterfaceC2370d interfaceC2370d = this.f24531d;
        Throwable th = null;
        E5.h hVar = interfaceC2370d instanceof E5.h ? (E5.h) interfaceC2370d : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.h.f1385h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B2.a aVar = E5.a.f1375d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            o(th);
        }
    }

    public final void B(Object obj, p5.l lVar) {
        C(this.f24484c, obj, lVar);
    }

    public final void C(int i, Object obj, p5.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24529g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f0) {
                Object objE = E((f0) obj2, obj, i, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i);
                return;
            }
            if (obj2 instanceof C3031g) {
                C3031g c3031g = (C3031g) obj2;
                c3031g.getClass();
                if (C3031g.f24533c.compareAndSet(c3031g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c3031g.f24546a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(AbstractC3042s abstractC3042s) {
        InterfaceC2370d interfaceC2370d = this.f24531d;
        E5.h hVar = interfaceC2370d instanceof E5.h ? (E5.h) interfaceC2370d : null;
        C((hVar != null ? hVar.f1386d : null) == abstractC3042s ? 4 : this.f24484c, C0412i.f5929a, null);
    }

    @Override // z5.n0
    public final void a(E5.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f24528f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i));
        w(tVar);
    }

    @Override // z5.C
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24529g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C3038n) {
                return;
            }
            if (!(obj2 instanceof C3037m)) {
                cancellationException2 = cancellationException;
                C3037m c3037m = new C3037m(obj2, (C3028d) null, (p5.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c3037m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C3037m c3037m2 = (C3037m) obj2;
            if (c3037m2.f24543e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C3037m c3037mA = C3037m.a(c3037m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c3037mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C3028d c3028d = c3037m2.f24540b;
            if (c3028d != null) {
                l(c3028d, cancellationException);
            }
            p5.l lVar = c3037m2.f24541c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // z5.C
    public final InterfaceC2370d c() {
        return this.f24531d;
    }

    @Override // j5.c
    public final j5.c d() {
        InterfaceC2370d interfaceC2370d = this.f24531d;
        if (interfaceC2370d instanceof j5.c) {
            return (j5.c) interfaceC2370d;
        }
        return null;
    }

    @Override // h5.InterfaceC2370d
    public final void e(Object obj) {
        Throwable thA = C0409f.a(obj);
        if (thA != null) {
            obj = new C3038n(thA, false);
        }
        C(this.f24484c, obj, null);
    }

    @Override // z5.C
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // z5.InterfaceC3029e
    public final B2.a g(Object obj, p5.l lVar) {
        B2.a aVar = AbstractC3046w.f24558a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24529g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof f0)) {
                return null;
            }
            Object objE = E((f0) obj2, obj, this.f24484c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return aVar;
        }
    }

    @Override // h5.InterfaceC2370d
    public final InterfaceC2375i getContext() {
        return this.f24532e;
    }

    @Override // z5.C
    public final Object h(Object obj) {
        return obj instanceof C3037m ? ((C3037m) obj).f24539a : obj;
    }

    @Override // z5.InterfaceC3029e
    public final void i(Object obj) {
        q(this.f24484c);
    }

    @Override // z5.C
    public final Object k() {
        return f24529g.get(this);
    }

    public final void l(C3028d c3028d, Throwable th) {
        try {
            c3028d.a(th);
        } catch (Throwable th2) {
            AbstractC3046w.j(this.f24532e, new J0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(p5.l lVar, Throwable th) {
        try {
            lVar.f(th);
        } catch (Throwable th2) {
            AbstractC3046w.j(this.f24532e, new J0.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(E5.t tVar, Throwable th) {
        InterfaceC2375i interfaceC2375i = this.f24532e;
        int i = f24528f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, interfaceC2375i);
        } catch (Throwable th2) {
            AbstractC3046w.j(interfaceC2375i, new J0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24529g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof f0) {
                C3031g c3031g = new C3031g(this, th, (obj instanceof C3028d) || (obj instanceof E5.t));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3031g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                f0 f0Var = (f0) obj;
                if (f0Var instanceof C3028d) {
                    l((C3028d) obj, th);
                } else if (f0Var instanceof E5.t) {
                    n((E5.t) obj, th);
                }
                if (!x()) {
                    p();
                }
                q(this.f24484c);
                return;
            }
            return;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24530h;
        E e6 = (E) atomicReferenceFieldUpdater.get(this);
        if (e6 == null) {
            return;
        }
        e6.g();
        atomicReferenceFieldUpdater.set(this, e0.f24527a);
    }

    public final void q(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f24528f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i6 = i3 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i == 4;
                InterfaceC2370d interfaceC2370d = this.f24531d;
                if (!z6 && (interfaceC2370d instanceof E5.h)) {
                    boolean z7 = i == 1 || i == 2;
                    int i7 = this.f24484c;
                    if (z7 == (i7 == 1 || i7 == 2)) {
                        AbstractC3042s abstractC3042s = ((E5.h) interfaceC2370d).f1386d;
                        InterfaceC2375i context = ((E5.h) interfaceC2370d).f1387e.getContext();
                        if (abstractC3042s.e()) {
                            abstractC3042s.d(context, this);
                            return;
                        }
                        K kA = j0.a();
                        if (kA.f24496c >= 4294967296L) {
                            C2280h c2280h = kA.f24498e;
                            if (c2280h == null) {
                                c2280h = new C2280h();
                                kA.f24498e = c2280h;
                            }
                            c2280h.addLast(this);
                            return;
                        }
                        kA.q(true);
                        try {
                            AbstractC3046w.n(this, interfaceC2370d, true);
                            do {
                            } while (kA.r());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC3046w.n(this, interfaceC2370d, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable r(c0 c0Var) {
        return c0Var.u();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        T t6;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f24528f;
            i = atomicIntegerFieldUpdater.get(this);
            int i3 = i >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f24529g.get(this);
                if (obj instanceof C3038n) {
                    throw ((C3038n) obj).f24546a;
                }
                int i6 = this.f24484c;
                if ((i6 != 1 && i6 != 2) || (t6 = (T) this.f24532e.h(C3043t.f24555b)) == null || t6.a()) {
                    return h(obj);
                }
                CancellationException cancellationExceptionU = ((c0) t6).u();
                b(obj, cancellationExceptionU);
                throw cancellationExceptionU;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((E) f24530h.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return EnumC2380a.f20635a;
    }

    public final void t() {
        E eU = u();
        if (eU == null || (f24529g.get(this) instanceof f0)) {
            return;
        }
        eU.g();
        f24530h.set(this, e0.f24527a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC3046w.o(this.f24531d));
        sb.append("){");
        Object obj = f24529g.get(this);
        sb.append(obj instanceof f0 ? "Active" : obj instanceof C3031g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC3046w.h(this));
        return sb.toString();
    }

    public final E u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t6 = (T) this.f24532e.h(C3043t.f24555b);
        if (t6 == null) {
            return null;
        }
        E eC = ((c0) t6).C((2 & 1) == 0, (2 & 2) != 0, new C3032h(this));
        do {
            atomicReferenceFieldUpdater = f24530h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, eC)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return eC;
    }

    public final void v(p5.l lVar) {
        w(lVar instanceof C3028d ? (C3028d) lVar : new C3028d(2, lVar));
    }

    public final void w(f0 f0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24529g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3026b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C3028d ? true : obj instanceof E5.t) {
                y(f0Var, obj);
                throw null;
            }
            if (obj instanceof C3038n) {
                C3038n c3038n = (C3038n) obj;
                c3038n.getClass();
                if (!C3038n.f24545b.compareAndSet(c3038n, 0, 1)) {
                    y(f0Var, obj);
                    throw null;
                }
                if (obj instanceof C3031g) {
                    if (!(((C3038n) obj) != null)) {
                        c3038n = null;
                    }
                    Throwable th = c3038n != null ? c3038n.f24546a : null;
                    if (f0Var instanceof C3028d) {
                        l((C3028d) f0Var, th);
                        return;
                    } else {
                        q5.i.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((E5.t) f0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof C3037m) {
                C3037m c3037m = (C3037m) obj;
                if (c3037m.f24540b != null) {
                    y(f0Var, obj);
                    throw null;
                }
                if (f0Var instanceof E5.t) {
                    return;
                }
                q5.i.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C3028d c3028d = (C3028d) f0Var;
                Throwable th2 = c3037m.f24543e;
                if (th2 != null) {
                    l(c3028d, th2);
                    return;
                }
                C3037m c3037mA = C3037m.a(c3037m, c3028d, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3037mA)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (f0Var instanceof E5.t) {
                    return;
                }
                q5.i.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C3037m c3037m2 = new C3037m(obj, (C3028d) f0Var, (p5.l) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3037m2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final boolean x() {
        if (this.f24484c != 2) {
            return false;
        }
        InterfaceC2370d interfaceC2370d = this.f24531d;
        q5.i.c(interfaceC2370d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return E5.h.f1385h.get((E5.h) interfaceC2370d) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
