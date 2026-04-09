package C9;

import A9.C0583j;
import A9.InterfaceC0581i;
import A9.U0;
import C9.k;
import D9.C0646h;
import F9.C0661d;
import J9.d;
import T1.B;
import b9.C1992A;
import f9.InterfaceC4347e;
import g0.C4356c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.z;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes3.dex */
public class b<E> implements g<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f963c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f964d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f965e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f966f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f967g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f968h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f969j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f970k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f971b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: BufferedChannel.kt */
    public final class a implements i<E>, U0 {

        /* renamed from: b, reason: collision with root package name */
        public Object f972b = f.f996p;

        /* renamed from: c, reason: collision with root package name */
        public C0583j<? super Boolean> f973c;

        public a() {
        }

        @Override // C9.i
        public final Object a(C0646h.a aVar) throws Throwable {
            l<E> lVarQ;
            Boolean bool;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f968h;
            b<E> bVar = b.this;
            l<E> lVar = (l) atomicReferenceFieldUpdater.get(bVar);
            while (!bVar.x()) {
                long andIncrement = b.f964d.getAndIncrement(bVar);
                long j4 = f.f983b;
                long j10 = andIncrement / j4;
                int i = (int) (andIncrement % j4);
                if (lVar.f1786d != j10) {
                    lVarQ = bVar.q(j10, lVar);
                    if (lVarQ == null) {
                        continue;
                    }
                } else {
                    lVarQ = lVar;
                }
                Object objI = bVar.I(lVarQ, i, andIncrement, null);
                F9.y yVar = f.f993m;
                if (objI == yVar) {
                    throw new IllegalStateException("unreachable");
                }
                F9.y yVar2 = f.f995o;
                if (objI != yVar2) {
                    if (objI != f.f994n) {
                        lVarQ.b();
                        this.f972b = objI;
                        return Boolean.TRUE;
                    }
                    b<E> bVar2 = b.this;
                    C0583j<? super Boolean> c0583jL = B.l(com.google.gson.internal.c.r(aVar));
                    try {
                        this.f973c = c0583jL;
                        Object objI2 = bVar2.I(lVarQ, i, andIncrement, this);
                        if (objI2 == yVar) {
                            c(lVarQ, i);
                        } else {
                            if (objI2 == yVar2) {
                                if (andIncrement < bVar2.u()) {
                                    lVarQ.b();
                                }
                                l<E> lVar2 = (l) b.f968h.get(bVar2);
                                while (true) {
                                    if (bVar2.x()) {
                                        C0583j<? super Boolean> c0583j = this.f973c;
                                        kotlin.jvm.internal.l.c(c0583j);
                                        this.f973c = null;
                                        this.f972b = f.f992l;
                                        Throwable thR = bVar.r();
                                        if (thR == null) {
                                            c0583j.resumeWith(Boolean.FALSE);
                                        } else {
                                            c0583j.resumeWith(b9.n.a(thR));
                                        }
                                    } else {
                                        long andIncrement2 = b.f964d.getAndIncrement(bVar2);
                                        long j11 = f.f983b;
                                        long j12 = andIncrement2 / j11;
                                        int i10 = (int) (andIncrement2 % j11);
                                        if (lVar2.f1786d != j12) {
                                            l<E> lVarQ2 = bVar2.q(j12, lVar2);
                                            if (lVarQ2 != null) {
                                                lVar2 = lVarQ2;
                                            }
                                        }
                                        Object objI3 = bVar2.I(lVar2, i10, andIncrement2, this);
                                        if (objI3 == f.f993m) {
                                            c(lVar2, i10);
                                            break;
                                        }
                                        if (objI3 == f.f995o) {
                                            if (andIncrement2 < bVar2.u()) {
                                                lVar2.b();
                                            }
                                        } else {
                                            if (objI3 == f.f994n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            lVar2.b();
                                            this.f972b = objI3;
                                            this.f973c = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                }
                            } else {
                                lVarQ.b();
                                this.f972b = objI2;
                                this.f973c = null;
                                bool = Boolean.TRUE;
                            }
                            c0583jL.g(bool, null);
                        }
                        Object objR = c0583jL.r();
                        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
                        return objR;
                    } catch (Throwable th) {
                        c0583jL.z();
                        throw th;
                    }
                }
                if (andIncrement < bVar.u()) {
                    lVarQ.b();
                }
                lVar = lVarQ;
            }
            this.f972b = f.f992l;
            Throwable thR2 = bVar.r();
            if (thR2 == null) {
                return Boolean.FALSE;
            }
            int i11 = F9.x.f1787a;
            throw thR2;
        }

        @Override // A9.U0
        public final void c(F9.w<?> wVar, int i) {
            C0583j<? super Boolean> c0583j = this.f973c;
            if (c0583j != null) {
                c0583j.c(wVar, i);
            }
        }

        @Override // C9.i
        public final E next() throws Throwable {
            E e4 = (E) this.f972b;
            F9.y yVar = f.f996p;
            if (e4 == yVar) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f972b = yVar;
            if (e4 != f.f992l) {
                return e4;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f963c;
            Throwable thS = b.this.s();
            int i = F9.x.f1787a;
            throw thS;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* renamed from: C9.b$b, reason: collision with other inner class name */
    public static final class C0007b implements U0 {
        @Override // A9.U0
        public final void c(F9.w<?> wVar, int i) {
            throw null;
        }
    }

    public b(int i10) {
        this.f971b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(C4356c.i(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        l<Object> lVar = f.f982a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f965e.get(this);
        l<Object> lVar2 = new l<>(0L, null, this, 3);
        this.sendSegment$volatile = lVar2;
        this.receiveSegment$volatile = lVar2;
        if (z()) {
            lVar2 = f.f982a;
            kotlin.jvm.internal.l.d(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar2;
        this._closeCause$volatile = f.f999s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object D(C9.b r13, h9.c r14) {
        /*
            boolean r0 = r14 instanceof C9.c
            if (r0 == 0) goto L14
            r0 = r14
            C9.c r0 = (C9.c) r0
            int r1 = r0.f977n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f977n = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            C9.c r0 = new C9.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f975l
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f977n
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            b9.n.b(r14)
            C9.k r14 = (C9.k) r14
            java.lang.Object r13 = r14.f1005a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            b9.n.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = C9.b.f968h
            java.lang.Object r14 = r14.get(r13)
            C9.l r14 = (C9.l) r14
        L40:
            boolean r1 = r13.x()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.r()
            C9.k$a r14 = new C9.k$a
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = C9.b.f964d
            long r4 = r1.getAndIncrement(r13)
            int r1 = C9.f.f983b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f1786d
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            C9.l r1 = r13.q(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.I(r8, r9, r10, r12)
            r1 = r7
            F9.y r14 = C9.f.f993m
            if (r13 == r14) goto La0
            F9.y r14 = C9.f.f995o
            if (r13 != r14) goto L8d
            long r13 = r1.u()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.b()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            F9.y r14 = C9.f.f994n
            if (r13 != r14) goto L9c
            r6.f977n = r2
            r2 = r8
            java.lang.Object r13 = r1.E(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.b()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.D(C9.b, h9.c):java.lang.Object");
    }

    public static final l a(b bVar, long j4, l lVar) {
        Object objA;
        b bVar2;
        bVar.getClass();
        l<Object> lVar2 = f.f982a;
        e eVar = e.f981b;
        loop0: while (true) {
            objA = C0661d.a(lVar, j4, eVar);
            if (!C0661d.c(objA)) {
                F9.w wVarB = C0661d.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f967g;
                    F9.w wVar = (F9.w) atomicReferenceFieldUpdater.get(bVar);
                    if (wVar.f1786d >= wVarB.f1786d) {
                        break loop0;
                    }
                    if (!wVarB.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, wVar, wVarB)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != wVar) {
                            if (wVarB.f()) {
                                wVarB.e();
                            }
                        }
                    }
                    if (wVar.f()) {
                        wVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zC = C0661d.c(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f964d;
        if (zC) {
            bVar.o();
            if (lVar.f1786d * f.f983b < atomicLongFieldUpdater.get(bVar)) {
                lVar.b();
                return null;
            }
        } else {
            l lVar3 = (l) C0661d.b(objA);
            long j10 = lVar3.f1786d;
            if (j10 <= j4) {
                return lVar3;
            }
            long j11 = f.f983b * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f963c;
                long j12 = atomicLongFieldUpdater2.get(bVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (atomicLongFieldUpdater2.compareAndSet(bVar2, j12, j13 + (((int) (j12 >> 60)) << 60))) {
                    break;
                }
                bVar = bVar2;
            }
            if (j10 * f.f983b < atomicLongFieldUpdater.get(bVar2)) {
                lVar3.b();
            }
        }
        return null;
    }

    public static final void e(b bVar, Object obj, C0583j c0583j) {
        bVar.getClass();
        c0583j.resumeWith(b9.n.a(bVar.t()));
    }

    public static final int g(b bVar, l lVar, int i10, Object obj, long j4, Object obj2, boolean z10) {
        bVar.getClass();
        lVar.n(i10, obj);
        if (z10) {
            return bVar.J(lVar, i10, obj, j4, obj2, z10);
        }
        Object objL = lVar.l(i10);
        if (objL == null) {
            if (bVar.j(j4)) {
                if (lVar.k(i10, null, f.f985d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof U0) {
            lVar.n(i10, null);
            if (bVar.G(objL, obj)) {
                lVar.o(i10, f.i);
                return 0;
            }
            F9.y yVar = f.f991k;
            if (lVar.f1008g.getAndSet((i10 * 2) + 1, yVar) == yVar) {
                return 5;
            }
            lVar.m(i10, true);
            return 5;
        }
        return bVar.J(lVar, i10, obj, j4, obj2, z10);
    }

    public static void v(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f966f;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(long r5, C9.l<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f1786d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            F9.e r0 = r7.c()
            C9.l r0 = (C9.l) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            F9.e r5 = r7.c()
            C9.l r5 = (C9.l) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = C9.b.i
            java.lang.Object r6 = r5.get(r4)
            F9.w r6 = (F9.w) r6
            long r0 = r6.f1786d
            long r2 = r7.f1786d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.A(long, C9.l):void");
    }

    public final Object C(InterfaceC4347e interfaceC4347e, Object obj) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        c0583j.resumeWith(b9.n.a(t()));
        Object objR = c0583j.r();
        return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(C9.l r15, int r16, long r17, h9.c r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.E(C9.l, int, long, h9.c):java.lang.Object");
    }

    public final void F(U0 u02, boolean z10) {
        if (u02 instanceof C0007b) {
            ((C0007b) u02).getClass();
            throw null;
        }
        if (u02 instanceof InterfaceC0581i) {
            ((InterfaceC4347e) u02).resumeWith(b9.n.a(z10 ? s() : t()));
            return;
        }
        if (u02 instanceof v) {
            ((v) u02).f1017b.resumeWith(new k(new k.a(r())));
            return;
        }
        if (!(u02 instanceof a)) {
            if (u02 instanceof J9.c) {
                ((J9.c) u02).d(this, f.f992l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + u02).toString());
            }
        }
        a aVar = (a) u02;
        C0583j<? super Boolean> c0583j = aVar.f973c;
        kotlin.jvm.internal.l.c(c0583j);
        aVar.f973c = null;
        aVar.f972b = f.f992l;
        Throwable thR = b.this.r();
        if (thR == null) {
            c0583j.resumeWith(Boolean.FALSE);
        } else {
            c0583j.resumeWith(b9.n.a(thR));
        }
    }

    public final boolean G(Object obj, E e4) {
        if (obj instanceof J9.c) {
            return ((J9.c) obj).d(this, e4);
        }
        if (obj instanceof v) {
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return f.a(((v) obj).f1017b, new k(e4), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0581i) {
                kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return f.a((InterfaceC0581i) obj, e4, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0583j<? super Boolean> c0583j = aVar.f973c;
        kotlin.jvm.internal.l.c(c0583j);
        aVar.f973c = null;
        aVar.f972b = e4;
        Boolean bool = Boolean.TRUE;
        b.this.getClass();
        return f.a(c0583j, bool, null);
    }

    public final boolean H(Object obj, l<E> lVar, int i10) {
        J9.e eVar;
        if (obj instanceof InterfaceC0581i) {
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.a((InterfaceC0581i) obj, C1992A.f18074a, null);
        }
        if (!(obj instanceof J9.c)) {
            if (obj instanceof C0007b) {
                ((C0007b) obj).getClass();
                f.a(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iJ = ((J9.a) obj).j(this, C1992A.f18074a);
        d.a aVar = J9.d.f2929a;
        if (iJ == 0) {
            eVar = J9.e.SUCCESSFUL;
        } else if (iJ == 1) {
            eVar = J9.e.REREGISTER;
        } else if (iJ == 2) {
            eVar = J9.e.CANCELLED;
        } else {
            if (iJ != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iJ).toString());
            }
            eVar = J9.e.ALREADY_SELECTED;
        }
        if (eVar == J9.e.REREGISTER) {
            lVar.n(i10, null);
        }
        return eVar == J9.e.SUCCESSFUL;
    }

    public final Object I(l<E> lVar, int i10, long j4, Object obj) {
        Object objL = lVar.l(i10);
        AtomicReferenceArray atomicReferenceArray = lVar.f1008g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f963c;
        if (objL == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f994n;
                }
                if (lVar.k(i10, objL, obj)) {
                    p();
                    return f.f993m;
                }
            }
        } else if (objL == f.f985d && lVar.k(i10, objL, f.i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            lVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = lVar.l(i10);
            if (objL2 == null || objL2 == f.f986e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (lVar.k(i10, objL2, f.f989h)) {
                        p();
                        return f.f995o;
                    }
                } else {
                    if (obj == null) {
                        return f.f994n;
                    }
                    if (lVar.k(i10, objL2, obj)) {
                        p();
                        return f.f993m;
                    }
                }
            } else if (objL2 != f.f985d) {
                F9.y yVar = f.f990j;
                if (objL2 == yVar) {
                    return f.f995o;
                }
                if (objL2 == f.f989h) {
                    return f.f995o;
                }
                if (objL2 == f.f992l) {
                    p();
                    return f.f995o;
                }
                if (objL2 != f.f988g && lVar.k(i10, objL2, f.f987f)) {
                    boolean z10 = objL2 instanceof y;
                    if (z10) {
                        objL2 = ((y) objL2).f1018a;
                    }
                    if (H(objL2, lVar, i10)) {
                        lVar.o(i10, f.i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        lVar.n(i10, null);
                        return obj3;
                    }
                    lVar.o(i10, yVar);
                    lVar.i();
                    if (z10) {
                        p();
                    }
                    return f.f995o;
                }
            } else if (lVar.k(i10, objL2, f.i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                lVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int J(l<E> lVar, int i10, E e4, long j4, Object obj, boolean z10) {
        while (true) {
            Object objL = lVar.l(i10);
            if (objL == null) {
                if (!j(j4) || z10) {
                    if (z10) {
                        if (lVar.k(i10, null, f.f990j)) {
                            lVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (lVar.k(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (lVar.k(i10, null, f.f985d)) {
                    break;
                }
            } else {
                if (objL != f.f986e) {
                    F9.y yVar = f.f991k;
                    if (objL == yVar) {
                        lVar.n(i10, null);
                        return 5;
                    }
                    if (objL == f.f989h) {
                        lVar.n(i10, null);
                        return 5;
                    }
                    if (objL == f.f992l) {
                        lVar.n(i10, null);
                        o();
                        return 4;
                    }
                    lVar.n(i10, null);
                    if (objL instanceof y) {
                        objL = ((y) objL).f1018a;
                    }
                    if (G(objL, e4)) {
                        lVar.o(i10, f.i);
                        return 0;
                    }
                    if (lVar.f1008g.getAndSet((i10 * 2) + 1, yVar) != yVar) {
                        lVar.m(i10, true);
                    }
                    return 5;
                }
                if (lVar.k(i10, objL, f.f985d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b<E> bVar = this;
        if (bVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f965e;
            if (atomicLongFieldUpdater.get(bVar) > j4) {
                break;
            } else {
                bVar = this;
            }
        }
        int i10 = f.f984c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f966f;
            if (i11 < i10) {
                long j10 = atomicLongFieldUpdater.get(bVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j10 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(bVar);
                    long j13 = atomicLongFieldUpdater2.get(bVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z10 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (!z10) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + j14);
                    }
                    bVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // C9.x
    public final void b(p9.l<? super Throwable, C1992A> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f970k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F9.y yVar = f.f997q;
            if (obj != yVar) {
                if (obj == f.f998r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            F9.y yVar2 = f.f998r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, yVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != yVar) {
                    break;
                }
            }
            lVar.invoke(r());
            return;
        }
    }

    @Override // C9.w
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(true, cancellationException);
    }

    @Override // C9.w
    public final Object d() {
        l<E> lVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f964d;
        long j4 = atomicLongFieldUpdater.get(this);
        long j10 = f963c.get(this);
        if (w(j10, true)) {
            return new k.a(r());
        }
        long j11 = j10 & 1152921504606846975L;
        k.b bVar = k.f1004b;
        if (j4 >= j11) {
            return bVar;
        }
        Object obj = f.f991k;
        l<E> lVar2 = (l) f968h.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = f.f983b;
            long j13 = andIncrement / j12;
            int i10 = (int) (andIncrement % j12);
            if (lVar2.f1786d != j13) {
                l<E> lVarQ = q(j13, lVar2);
                if (lVarQ == null) {
                    continue;
                } else {
                    lVar = lVarQ;
                }
            } else {
                lVar = lVar2;
            }
            Object objI = I(lVar, i10, andIncrement, obj);
            l<E> lVar3 = lVar;
            if (objI == f.f993m) {
                U0 u02 = obj instanceof U0 ? (U0) obj : null;
                if (u02 != null) {
                    u02.c(lVar3, i10);
                }
                K(andIncrement);
                lVar3.i();
                return bVar;
            }
            if (objI != f.f995o) {
                if (objI == f.f994n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar3.b();
                return objI;
            }
            if (andIncrement < u()) {
                lVar3.b();
            }
            lVar2 = lVar3;
        }
        return new k.a(r());
    }

    @Override // C9.w
    public final Object f(h9.i iVar) {
        return D(this, iVar);
    }

    @Override // C9.x
    public final boolean h(Throwable th) {
        return k(false, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    @Override // C9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(E r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = C9.b.f963c
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.w(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.j(r1)
            r1 = r1 ^ r10
        L1b:
            C9.k$b r13 = C9.k.f1004b
            if (r1 == 0) goto L20
            return r13
        L20:
            F9.y r6 = C9.f.f990j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = C9.b.f967g
            java.lang.Object r1 = r1.get(r15)
            C9.l r1 = (C9.l) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.w(r2, r9)
            int r14 = C9.f.f983b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f1786d
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            C9.l r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.t()
            C9.k$a r2 = new C9.k$a
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = g(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbf
            r3 = 1
            if (r9 == r3) goto Lbc
            r10 = 2
            if (r9 == r10) goto L9b
            r2 = 3
            if (r9 == r2) goto L93
            r2 = 4
            if (r9 == r2) goto L7c
            r2 = 5
            if (r9 == r2) goto L76
            goto L79
        L76:
            r1.b()
        L79:
            r10 = r3
            r9 = 0
            goto L56
        L7c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = C9.b.f964d
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L89
            r1.b()
        L89:
            java.lang.Throwable r1 = r15.t()
            C9.k$a r2 = new C9.k$a
            r2.<init>(r1)
            return r2
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9b:
            if (r7 == 0) goto Laa
            r1.i()
            java.lang.Throwable r1 = r15.t()
            C9.k$a r2 = new C9.k$a
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof A9.U0
            if (r3 == 0) goto Lb1
            A9.U0 r6 = (A9.U0) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.c(r1, r2)
        Lb8:
            r1.i()
            return r13
        Lbc:
            b9.A r1 = b9.C1992A.f18074a
            return r1
        Lbf:
            r1.b()
            b9.A r1 = b9.C1992A.f18074a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.i(java.lang.Object):java.lang.Object");
    }

    @Override // C9.w
    public final i<E> iterator() {
        return new a();
    }

    public final boolean j(long j4) {
        return j4 < f965e.get(this) || j4 < f964d.get(this) + ((long) this.f971b);
    }

    public final boolean k(boolean z10, Throwable th) {
        b<E> bVar;
        boolean z11;
        long j4;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f963c;
        if (!z10) {
            bVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                bVar = this;
                break;
            }
            l<Object> lVar = f.f982a;
            bVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j13, (j13 & 1152921504606846975L) + (1 << 60)));
        F9.y yVar = f.f999s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f969j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, yVar, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != yVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j4 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j4 >> 60);
                if (i10 == 0) {
                    j10 = j4 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j10 = j4 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, (j11 << 60) + j10));
        }
        o();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f970k;
                obj = atomicReferenceFieldUpdater2.get(this);
                F9.y yVar2 = obj == null ? f.f997q : f.f998r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, yVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                z.b(1, obj);
                ((p9.l) obj).invoke(r());
                return z11;
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (C9.l) ((F9.AbstractC0662e) F9.AbstractC0662e.f1751c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final C9.l<E> l(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.l(long):C9.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x018d, code lost:
    
        return b9.C1992A.f18074a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171 A[RETURN] */
    @Override // C9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(f9.InterfaceC4347e r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.m(f9.e, java.lang.Object):java.lang.Object");
    }

    public final void n(long j4) {
        l<E> lVar = (l) f968h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f964d;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f971b + j10, f965e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = f.f983b;
                long j12 = j10 / j11;
                int i10 = (int) (j10 % j11);
                if (lVar.f1786d != j12) {
                    l<E> lVarQ = q(j12, lVar);
                    if (lVarQ != null) {
                        lVar = lVarQ;
                    }
                }
                l<E> lVar2 = lVar;
                if (I(lVar2, i10, j10, null) != f.f995o || j10 < u()) {
                    lVar2.b();
                }
                lVar = lVar2;
            }
        }
    }

    @Override // C9.x
    public final boolean o() {
        return w(f963c.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        v(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.p():void");
    }

    public final l<E> q(long j4, l<E> lVar) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        l<Object> lVar2 = f.f982a;
        e eVar = e.f981b;
        loop0: while (true) {
            objA = C0661d.a(lVar, j4, eVar);
            if (!C0661d.c(objA)) {
                F9.w wVarB = C0661d.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f968h;
                    F9.w wVar = (F9.w) atomicReferenceFieldUpdater.get(this);
                    if (wVar.f1786d >= wVarB.f1786d) {
                        break loop0;
                    }
                    if (!wVarB.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, wVarB)) {
                        if (atomicReferenceFieldUpdater.get(this) != wVar) {
                            if (wVarB.f()) {
                                wVarB.e();
                            }
                        }
                    }
                    if (wVar.f()) {
                        wVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (C0661d.c(objA)) {
            o();
            if (lVar.f1786d * f.f983b < u()) {
                lVar.b();
                return null;
            }
        } else {
            l<E> lVar3 = (l) C0661d.b(objA);
            boolean z10 = z();
            long j11 = lVar3.f1786d;
            if (!z10 && j4 <= f965e.get(this) / f.f983b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                    F9.w wVar2 = (F9.w) atomicReferenceFieldUpdater2.get(this);
                    if (wVar2.f1786d >= j11 || !lVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, wVar2, lVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != wVar2) {
                            if (lVar3.f()) {
                                lVar3.e();
                            }
                        }
                    }
                    if (wVar2.f()) {
                        wVar2.e();
                    }
                }
            }
            if (j11 <= j4) {
                return lVar3;
            }
            long j12 = j11 * f.f983b;
            do {
                atomicLongFieldUpdater = f964d;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * f.f983b < u()) {
                lVar3.b();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) f969j.get(this);
    }

    public final Throwable s() {
        Throwable thR = r();
        return thR == null ? new m("Channel was closed") : thR;
    }

    public final Throwable t() {
        Throwable thR = r();
        return thR == null ? new n("Channel was closed") : thR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r16 = r7;
        r3 = (C9.l) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
    
        if (r3 != null) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.toString():java.lang.String");
    }

    public final long u() {
        return f963c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (C9.l) ((F9.AbstractC0662e) F9.AbstractC0662e.f1751c.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.b.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(f963c.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j4 = f965e.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }
}
