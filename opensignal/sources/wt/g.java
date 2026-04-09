package wt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class g extends c0 implements f, rq.d, q1 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final pq.c f24617r;

    /* renamed from: x, reason: collision with root package name */
    public final pq.h f24618x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24616y = AtomicIntegerFieldUpdater.newUpdater(g.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_parentHandle$volatile");

    public g(int i10, pq.c cVar) {
        super(i10);
        this.f24617r = cVar;
        this.f24618x = cVar.m();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f24602a;
    }

    public static void A(g1 g1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + g1Var + ", already has " + obj).toString());
    }

    public static Object F(g1 g1Var, Object obj, int i10, ar.o oVar) {
        if (obj instanceof o) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (oVar != null || (g1Var instanceof e)) {
            return new n(obj, g1Var instanceof e ? (e) g1Var : null, oVar, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        pq.c cVar = this.f24617r;
        Throwable th2 = null;
        bu.f fVar = cVar instanceof bu.f ? (bu.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bu.f.D;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                bu.t tVar = bu.a.f2953c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            r();
            q(th2);
        }
    }

    public final void D(Object obj, int i10, ar.o oVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g1) {
                Object objF = F((g1) obj2, obj, i10, oVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    r();
                }
                s(i10);
                return;
            }
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                if (h.f24621c.compareAndSet(hVar, 0, 1)) {
                    if (oVar != null) {
                        o(oVar, hVar.f24644a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(q qVar) {
        pq.c cVar = this.f24617r;
        bu.f fVar = cVar instanceof bu.f ? (bu.f) cVar : null;
        D(lq.b0.f15562a, (fVar != null ? fVar.f2963r : null) == qVar ? 4 : this.f24608g, null);
    }

    @Override // wt.q1
    public final void a(bu.r rVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f24616y;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        y(rVar);
    }

    @Override // wt.c0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof o) {
                return;
            }
            if (!(obj instanceof n)) {
                cancellationException2 = cancellationException;
                n nVar = new n(obj, (e) null, (ar.o) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            n nVar2 = (n) obj;
            if (nVar2.f24640e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            n nVarA = n.a(nVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = nVar2.f24637b;
            if (eVar != null) {
                l(eVar, cancellationException);
            }
            ar.o oVar = nVar2.f24638c;
            if (oVar != null) {
                o(oVar, cancellationException, nVar2.f24636a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // wt.c0
    public final pq.c c() {
        return this.f24617r;
    }

    @Override // wt.c0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // rq.d
    public final rq.d e() {
        pq.c cVar = this.f24617r;
        if (cVar instanceof rq.d) {
            return (rq.d) cVar;
        }
        return null;
    }

    @Override // wt.c0
    public final Object f(Object obj) {
        return obj instanceof n ? ((n) obj).f24636a : obj;
    }

    @Override // pq.c
    public final void g(Object obj) {
        Throwable thA = lq.o.a(obj);
        if (thA != null) {
            obj = new o(thA, false);
        }
        D(obj, this.f24608g, null);
    }

    @Override // wt.c0
    public final Object i() {
        return B.get(this);
    }

    @Override // wt.f
    public final void j(Object obj, ar.o oVar) {
        D(obj, this.f24608g, oVar);
    }

    @Override // wt.f
    public final bu.t k(Object obj, ar.o oVar) {
        bu.t tVar = w.f24662a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g1)) {
                return null;
            }
            Object objF = F((g1) obj2, obj, this.f24608g, oVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!z()) {
                r();
            }
            return tVar;
        }
    }

    public final void l(e eVar, Throwable th2) {
        try {
            switch (eVar.f24612a) {
                case 0:
                    ((ScheduledFuture) eVar.f24613b).cancel(false);
                    break;
                case 1:
                    ((ar.k) eVar.f24613b).a(th2);
                    break;
                default:
                    ((e0) eVar.f24613b).a();
                    break;
            }
        } catch (Throwable th3) {
            w.o(new bf.n("Exception in invokeOnCancellation handler for " + this, th3), this.f24618x);
        }
    }

    @Override // pq.c
    public final pq.h m() {
        return this.f24618x;
    }

    @Override // wt.f
    public final void n(Object obj) {
        s(this.f24608g);
    }

    public final void o(ar.o oVar, Throwable th2, Object obj) {
        pq.h hVar = this.f24618x;
        try {
            oVar.h(th2, obj, hVar);
        } catch (Throwable th3) {
            w.o(new bf.n("Exception in resume onCancellation handler for " + this, th3), hVar);
        }
    }

    public final void p(bu.r rVar, Throwable th2) {
        pq.h hVar = this.f24618x;
        int i10 = f24616y.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i10, hVar);
        } catch (Throwable th3) {
            w.o(new bf.n("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    public final boolean q(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g1)) {
                return false;
            }
            h hVar = new h(this, th2, (obj instanceof e) || (obj instanceof bu.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            g1 g1Var = (g1) obj;
            if (g1Var instanceof e) {
                l((e) obj, th2);
            } else if (g1Var instanceof bu.r) {
                p((bu.r) obj, th2);
            }
            if (!z()) {
                r();
            }
            s(this.f24608g);
            return true;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
        if (e0Var == null) {
            return;
        }
        e0Var.a();
        atomicReferenceFieldUpdater.set(this, f1.f24615a);
    }

    public final void s(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f24616y;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                pq.c cVar = this.f24617r;
                if (!z10 && (cVar instanceof bu.f)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f24608g;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        bu.f fVar = (bu.f) cVar;
                        q qVar = fVar.f2963r;
                        pq.h hVarM = fVar.f2964x.m();
                        if (qVar.p0(hVarM)) {
                            qVar.n0(hVarM, this);
                            return;
                        }
                        k0 k0VarA = k1.a();
                        if (k0VarA.f24629g >= 4294967296L) {
                            k0VarA.s0(this);
                            return;
                        }
                        k0VarA.u0(true);
                        try {
                            w.v(this, cVar, true);
                            do {
                            } while (k0VarA.w0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                w.v(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable t(b1 b1Var) {
        return b1Var.y();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(B());
        sb2.append('(');
        sb2.append(w.y(this.f24617r));
        sb2.append("){");
        Object obj = B.get(this);
        sb2.append(obj instanceof g1 ? "Active" : obj instanceof h ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(w.l(this));
        return sb2.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        t0 t0Var;
        boolean z10 = z();
        do {
            atomicIntegerFieldUpdater = f24616y;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (z10) {
                    C();
                }
                Object obj = B.get(this);
                if (obj instanceof o) {
                    throw ((o) obj).f24644a;
                }
                int i12 = this.f24608g;
                if ((i12 != 1 && i12 != 2) || (t0Var = (t0) this.f24618x.Y(r.f24653d)) == null || t0Var.b()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionY = t0Var.y();
                b(cancellationExceptionY);
                throw cancellationExceptionY;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((e0) D.get(this)) == null) {
            w();
        }
        if (z10) {
            C();
        }
        return qq.a.COROUTINE_SUSPENDED;
    }

    public final void v() {
        e0 e0VarW = w();
        if (e0VarW == null || (B.get(this) instanceof g1)) {
            return;
        }
        e0VarW.a();
        D.set(this, f1.f24615a);
    }

    public final e0 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t0 t0Var = (t0) this.f24618x.Y(r.f24653d);
        if (t0Var == null) {
            return null;
        }
        e0 e0VarP = w.p(t0Var, true, new i(this, 0));
        do {
            atomicReferenceFieldUpdater = D;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e0VarP)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e0VarP;
    }

    public final void x(ar.k kVar) {
        y(new e(1, kVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(wt.g1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wt.g.B
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof wt.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof wt.e
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof bu.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof wt.o
            if (r1 == 0) goto L4d
            r0 = r2
            wt.o r0 = (wt.o) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = wt.o.f24643b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof wt.h
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f24644a
            boolean r1 = r8 instanceof wt.e
            if (r1 == 0) goto L43
            wt.e r8 = (wt.e) r8
            r7.l(r8, r0)
            return
        L43:
            bu.r r8 = (bu.r) r8
            r7.p(r8, r0)
            return
        L49:
            A(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof wt.n
            if (r1 == 0) goto L80
            r1 = r2
            wt.n r1 = (wt.n) r1
            wt.e r4 = r1.f24637b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof bu.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            wt.e r4 = (wt.e) r4
            java.lang.Throwable r5 = r1.f24640e
            if (r5 == 0) goto L68
            r7.l(r4, r5)
            return
        L68:
            r5 = 29
            wt.n r1 = wt.n.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            A(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof bu.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            wt.e r3 = (wt.e) r3
            wt.n r1 = new wt.n
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            A(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.g.y(wt.g1):void");
    }

    public final boolean z() {
        if (this.f24608g != 2) {
            return false;
        }
        pq.c cVar = this.f24617r;
        br.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return bu.f.D.get((bu.f) cVar) != null;
    }
}
