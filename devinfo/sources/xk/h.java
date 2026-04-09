package xk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h extends e0 implements g, ek.d, u1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37191f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37192h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final ck.c f37193d;

    /* renamed from: e, reason: collision with root package name */
    public final ck.h f37194e;

    public h(int i4, ck.c cVar) {
        super(i4);
        this.f37193d = cVar;
        this.f37194e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f37170a;
    }

    public static Object D(k1 k1Var, Object obj, int i4, mk.f fVar) {
        if (obj instanceof p) {
            return obj;
        }
        if (i4 != 1 && i4 != 2) {
            return obj;
        }
        if (fVar != null || (k1Var instanceof f)) {
            return new o(obj, k1Var instanceof f ? (f) k1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        ck.c cVar = this.f37193d;
        Throwable th2 = null;
        cl.g gVar = cVar instanceof cl.g ? (cl.g) cVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cl.g.f2913h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                cl.u uVar = cl.b.f2904c;
                if (obj == uVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            o();
            i(th2);
        }
    }

    public final void B(Object obj, int i4, mk.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k1) {
                Object objD = D((k1) obj2, obj, i4, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i4);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f37196c.compareAndSet(iVar, 0, 1)) {
                    if (fVar != null) {
                        l(fVar, iVar.f37219a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(r rVar) {
        ck.c cVar = this.f37193d;
        cl.g gVar = cVar instanceof cl.g ? (cl.g) cVar : null;
        B(yj.u.f37649a, (gVar != null ? gVar.f2914d : null) == rVar ? 4 : this.f37182c, null);
    }

    @Override // xk.u1
    public final void a(cl.s sVar, int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f37191f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i4));
        v(sVar);
    }

    @Override // xk.e0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof p) {
                return;
            }
            if (!(obj instanceof o)) {
                cancellationException2 = cancellationException;
                o oVar = new o(obj, (f) null, (mk.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            o oVar2 = (o) obj;
            if (oVar2.f37215e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            o oVarA = o.a(oVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            f fVar = oVar2.f37212b;
            if (fVar != null) {
                k(fVar, cancellationException);
            }
            mk.f fVar2 = oVar2.f37213c;
            if (fVar2 != null) {
                l(fVar2, cancellationException, oVar2.f37211a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // xk.e0
    public final ck.c c() {
        return this.f37193d;
    }

    @Override // xk.e0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // xk.e0
    public final Object e(Object obj) {
        return obj instanceof o ? ((o) obj).f37211a : obj;
    }

    @Override // xk.g
    public final void f(Object obj, mk.f fVar) {
        B(obj, this.f37182c, fVar);
    }

    @Override // ek.d
    public final ek.d getCallerFrame() {
        ck.c cVar = this.f37193d;
        if (cVar instanceof ek.d) {
            return (ek.d) cVar;
        }
        return null;
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f37194e;
    }

    @Override // xk.e0
    public final Object h() {
        return g.get(this);
    }

    @Override // xk.g
    public final boolean i(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k1)) {
                return false;
            }
            boolean z3 = (obj instanceof f) || (obj instanceof cl.s);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            i iVar = new i(cancellationException, z3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k1 k1Var = (k1) obj;
            if (k1Var instanceof f) {
                k((f) obj, th2);
            } else if (k1Var instanceof cl.s) {
                m((cl.s) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f37182c);
            return true;
        }
    }

    @Override // xk.g
    public final cl.u j(Object obj, mk.f fVar) {
        cl.u uVar = x.f37250a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k1)) {
                return null;
            }
            Object objD = D((k1) obj2, obj, this.f37182c, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return uVar;
        }
    }

    public final void k(f fVar, Throwable th2) {
        try {
            fVar.b(th2);
        } catch (Throwable th3) {
            x.q(this.f37194e, new ac.m("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(mk.f fVar, Throwable th2, Object obj) {
        ck.h hVar = this.f37194e;
        try {
            fVar.a(th2, obj, hVar);
        } catch (Throwable th3) {
            x.q(hVar, new ac.m("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(cl.s sVar, Throwable th2) {
        ck.h hVar = this.f37194e;
        int i4 = f37191f.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i4, hVar);
        } catch (Throwable th3) {
            x.q(hVar, new ac.m("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // xk.g
    public final void n(Object obj) {
        p(this.f37182c);
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37192h;
        i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var == null) {
            return;
        }
        i0Var.a();
        atomicReferenceFieldUpdater.set(this, j1.f37202a);
    }

    public final void p(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f37191f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i4 == 4;
                ck.c cVar = this.f37193d;
                if (!z3 && (cVar instanceof cl.g)) {
                    boolean z10 = i4 == 1 || i4 == 2;
                    int i12 = this.f37182c;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        cl.g gVar = (cl.g) cVar;
                        r rVar = gVar.f2914d;
                        ck.h context = gVar.f2915e.getContext();
                        if (cl.b.j(rVar, context)) {
                            cl.b.i(rVar, context, this);
                            return;
                        }
                        q0 q0VarA = n1.a();
                        if (q0VarA.f37226c >= 4294967296L) {
                            q0VarA.Y(this);
                            return;
                        }
                        q0VarA.a0(true);
                        try {
                            x.y(this, cVar, true);
                            do {
                            } while (q0VarA.c0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                x.y(this, cVar, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(f1 f1Var) {
        return f1Var.p();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        y0 y0Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f37191f;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i10 = i4 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = g.get(this);
                if (obj instanceof p) {
                    throw ((p) obj).f37219a;
                }
                int i11 = this.f37182c;
                if ((i11 != 1 && i11 != 2) || (y0Var = (y0) this.f37194e.O(s.f37235b)) == null || y0Var.c()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionP = y0Var.p();
                b(cancellationExceptionP);
                throw cancellationExceptionP;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((i0) f37192h.get(this)) == null) {
            t();
        }
        if (zX) {
            A();
        }
        return dk.a.f22275a;
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        Throwable thA = yj.l.a(obj);
        if (thA != null) {
            obj = new p(thA, false);
        }
        B(obj, this.f37182c, null);
    }

    public final void s() {
        i0 i0VarT = t();
        if (i0VarT == null || (g.get(this) instanceof k1)) {
            return;
        }
        i0VarT.a();
        f37192h.set(this, j1.f37202a);
    }

    public final i0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y0 y0Var = (y0) this.f37194e.O(s.f37235b);
        if (y0Var == null) {
            return null;
        }
        i0 i0VarR = x.r(y0Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = f37192h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, i0VarR)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return i0VarR;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(x.B(this.f37193d));
        sb2.append("){");
        Object obj = g.get(this);
        sb2.append(obj instanceof k1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(x.n(this));
        return sb2.toString();
    }

    public final void u(mk.c cVar) {
        v(new e(1, cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(xk.k1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = xk.h.g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof xk.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La5
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof xk.f
            r3 = 0
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof cl.s
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof xk.p
            if (r1 == 0) goto L52
            r0 = r2
            xk.p r0 = (xk.p) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xk.p.f37218b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof xk.i
            if (r1 == 0) goto La5
            java.lang.Throwable r0 = r0.f37219a
            boolean r1 = r8 instanceof xk.f
            if (r1 == 0) goto L43
            xk.f r8 = (xk.f) r8
            r7.k(r8, r0)
            return
        L43:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            nk.k.c(r8, r1)
            cl.s r8 = (cl.s) r8
            r7.m(r8, r0)
            return
        L4e:
            y(r8, r2)
            throw r3
        L52:
            boolean r1 = r2 instanceof xk.o
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L8b
            r1 = r2
            xk.o r1 = (xk.o) r1
            xk.f r5 = r1.f37212b
            if (r5 != 0) goto L87
            boolean r5 = r8 instanceof cl.s
            if (r5 == 0) goto L64
            return
        L64:
            nk.k.c(r8, r4)
            r4 = r8
            xk.f r4 = (xk.f) r4
            java.lang.Throwable r5 = r1.f37215e
            if (r5 == 0) goto L72
            r7.k(r4, r5)
            return
        L72:
            r5 = 29
            xk.o r1 = xk.o.a(r1, r4, r3, r5)
        L78:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7f
            goto La5
        L7f:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L78
            goto L0
        L87:
            y(r8, r2)
            throw r3
        L8b:
            boolean r1 = r8 instanceof cl.s
            if (r1 == 0) goto L90
            return
        L90:
            nk.k.c(r8, r4)
            r3 = r8
            xk.f r3 = (xk.f) r3
            xk.o r1 = new xk.o
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9f:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La6
        La5:
            return
        La6:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9f
            goto L0
        Lae:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.h.v(xk.k1):void");
    }

    public final boolean w() {
        return g.get(this) instanceof k1;
    }

    public final boolean x() {
        if (this.f37182c != 2) {
            return false;
        }
        ck.c cVar = this.f37193d;
        nk.k.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return cl.g.f2913h.get((cl.g) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
