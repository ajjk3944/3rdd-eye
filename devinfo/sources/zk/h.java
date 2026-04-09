package zk;

import com.google.android.gms.internal.ads.ay1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f38337b = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f38338c = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f38339d = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f38340e = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38341f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38342h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38343i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f38344a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public h(int i4) {
        this.f38344a = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        p pVar = j.f38346a;
        this.bufferEnd$volatile = i4 != 0 ? i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f38339d.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (A()) {
            pVar2 = j.f38346a;
            nk.k.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.f38362s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object D(zk.h r13, ek.c r14) {
        /*
            boolean r0 = r14 instanceof zk.f
            if (r0 == 0) goto L14
            r0 = r14
            zk.f r0 = (zk.f) r0
            int r1 = r0.f38333c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f38333c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zk.f r0 = new zk.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f38331a
            int r0 = r6.f38333c
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            ci.b.D(r14)
            zk.o r14 = (zk.o) r14
            java.lang.Object r13 = r14.f38368a
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            ci.b.D(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = zk.h.g
            java.lang.Object r14 = r14.get(r13)
            zk.p r14 = (zk.p) r14
        L3e:
            boolean r0 = r13.x()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.r()
            zk.m r14 = new zk.m
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = zk.h.f38338c
            long r4 = r0.getAndIncrement(r13)
            int r0 = zk.j.f38347b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f2939c
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            zk.p r0 = r13.q(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.I(r8, r9, r10, r12)
            cl.u r14 = zk.j.f38356m
            if (r13 == r14) goto La0
            cl.u r14 = zk.j.f38358o
            if (r13 != r14) goto L8b
            long r13 = r7.u()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.a()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            cl.u r14 = zk.j.f38357n
            if (r13 != r14) goto L9c
            r6.f38333c = r1
            r1 = r7
            java.lang.Object r13 = r1.E(r2, r3, r4, r6)
            dk.a r14 = dk.a.f22275a
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.D(zk.h, ek.c):java.lang.Object");
    }

    public static final p c(h hVar, long j8, p pVar) {
        Object objB;
        h hVar2;
        p pVar2 = j.f38346a;
        i iVar = i.f38345i;
        loop0: while (true) {
            objB = cl.b.b(pVar, j8, iVar);
            if (!cl.b.e(objB)) {
                cl.s sVarC = cl.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38341f;
                    cl.s sVar = (cl.s) atomicReferenceFieldUpdater.get(hVar);
                    if (sVar.f2939c >= sVarC.f2939c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = cl.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38338c;
        if (zE) {
            hVar.y();
            if (pVar.f2939c * j.f38347b < atomicLongFieldUpdater.get(hVar)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) cl.b.c(objB);
            long j9 = pVar3.f2939c;
            if (j9 <= j8) {
                return pVar3;
            }
            long j10 = j.f38347b * j9;
            while (true) {
                long j11 = f38337b.get(hVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (f38337b.compareAndSet(hVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j9 * j.f38347b < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.a();
            }
        }
        return null;
    }

    public static final void f(h hVar, Object obj, xk.h hVar2) {
        hVar2.resumeWith(ci.b.h(hVar.t()));
    }

    public static final int g(h hVar, p pVar, int i4, Object obj, long j8, Object obj2, boolean z3) {
        pVar.n(i4, obj);
        if (z3) {
            return hVar.J(pVar, i4, obj, j8, obj2, z3);
        }
        Object objL = pVar.l(i4);
        if (objL == null) {
            if (hVar.i(j8)) {
                if (pVar.k(i4, null, j.f38349d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof u1) {
            pVar.n(i4, null);
            if (hVar.G(objL, obj)) {
                pVar.o(i4, j.f38353i);
                return 0;
            }
            cl.u uVar = j.f38354k;
            if (pVar.f38370f.getAndSet((i4 * 2) + 1, uVar) == uVar) {
                return 5;
            }
            pVar.m(i4, true);
            return 5;
        }
        return hVar.J(pVar, i4, obj, j8, obj2, z3);
    }

    public static void v(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38340e;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j8 = f38339d.get(this);
        return j8 == 0 || j8 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(long r5, zk.p r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f2939c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            cl.c r0 = r7.c()
            zk.p r0 = (zk.p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            cl.c r5 = r7.c()
            zk.p r5 = (zk.p) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = zk.h.f38342h
            java.lang.Object r6 = r5.get(r4)
            cl.s r6 = (cl.s) r6
            long r0 = r6.f2939c
            long r2 = r7.f2939c
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
        throw new UnsupportedOperationException("Method not decompiled: zk.h.B(long, zk.p):void");
    }

    public final Object C(ck.c cVar, Object obj) {
        xk.h hVar = new xk.h(1, a.a.r(cVar));
        hVar.s();
        hVar.resumeWith(ci.b.h(t()));
        Object objR = hVar.r();
        return objR == dk.a.f22275a ? objR : yj.u.f37649a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(zk.p r14, int r15, long r16, ek.c r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.E(zk.p, int, long, ek.c):java.lang.Object");
    }

    public final void F(u1 u1Var, boolean z3) {
        if (u1Var instanceof xk.g) {
            ((ck.c) u1Var).resumeWith(ci.b.h(z3 ? s() : t()));
            return;
        }
        if (u1Var instanceof v) {
            ((v) u1Var).f38376a.resumeWith(new o(new m(r())));
            return;
        }
        if (!(u1Var instanceof c)) {
            if (u1Var instanceof fl.f) {
                ((fl.e) ((fl.f) u1Var)).g(this, j.f38355l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + u1Var).toString());
            }
        }
        c cVar = (c) u1Var;
        xk.h hVar = cVar.f38327b;
        nk.k.b(hVar);
        cVar.f38327b = null;
        cVar.f38326a = j.f38355l;
        Throwable thR = cVar.f38328c.r();
        if (thR == null) {
            hVar.resumeWith(Boolean.FALSE);
        } else {
            hVar.resumeWith(ci.b.h(thR));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (obj instanceof fl.f) {
            return ((fl.e) ((fl.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof v) {
            return j.a(((v) obj).f38376a, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof xk.g) {
                return j.a((xk.g) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        c cVar = (c) obj;
        xk.h hVar = cVar.f38327b;
        nk.k.b(hVar);
        cVar.f38327b = null;
        cVar.f38326a = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.f38328c.getClass();
        return j.a(hVar, bool, null);
    }

    public final boolean H(Object obj, p pVar, int i4) {
        fl.i iVar;
        boolean z3 = obj instanceof xk.g;
        yj.u uVar = yj.u.f37649a;
        if (z3) {
            return j.a((xk.g) obj, uVar, null);
        }
        if (!(obj instanceof fl.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iG = ((fl.e) obj).g(this, uVar);
        fl.i iVar2 = fl.i.f24086a;
        fl.i iVar3 = fl.i.f24087b;
        if (iG == 0) {
            iVar = iVar2;
        } else if (iG == 1) {
            iVar = iVar3;
        } else if (iG == 2) {
            iVar = fl.i.f24088c;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            iVar = fl.i.f24089d;
        }
        if (iVar == iVar3) {
            pVar.n(i4, null);
        }
        return iVar == iVar2;
    }

    public final Object I(p pVar, int i4, long j8, Object obj) {
        Object objL = pVar.l(i4);
        AtomicReferenceArray atomicReferenceArray = pVar.f38370f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38337b;
        if (objL == null) {
            if (j8 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f38357n;
                }
                if (pVar.k(i4, objL, obj)) {
                    p();
                    return j.f38356m;
                }
            }
        } else if (objL == j.f38349d && pVar.k(i4, objL, j.f38353i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            pVar.n(i4, null);
            return obj2;
        }
        while (true) {
            Object objL2 = pVar.l(i4);
            if (objL2 == null || objL2 == j.f38350e) {
                if (j8 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i4, objL2, j.f38352h)) {
                        p();
                        return j.f38358o;
                    }
                } else {
                    if (obj == null) {
                        return j.f38357n;
                    }
                    if (pVar.k(i4, objL2, obj)) {
                        p();
                        return j.f38356m;
                    }
                }
            } else if (objL2 != j.f38349d) {
                cl.u uVar = j.j;
                if (objL2 == uVar) {
                    return j.f38358o;
                }
                if (objL2 == j.f38352h) {
                    return j.f38358o;
                }
                if (objL2 == j.f38355l) {
                    p();
                    return j.f38358o;
                }
                if (objL2 != j.g && pVar.k(i4, objL2, j.f38351f)) {
                    boolean z3 = objL2 instanceof y;
                    if (z3) {
                        objL2 = ((y) objL2).f38377a;
                    }
                    if (H(objL2, pVar, i4)) {
                        pVar.o(i4, j.f38353i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i4 * 2);
                        pVar.n(i4, null);
                        return obj3;
                    }
                    pVar.o(i4, uVar);
                    pVar.i();
                    if (z3) {
                        p();
                    }
                    return j.f38358o;
                }
            } else if (pVar.k(i4, objL2, j.f38353i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i4 * 2);
                pVar.n(i4, null);
                return obj4;
            }
        }
    }

    public final int J(p pVar, int i4, Object obj, long j8, Object obj2, boolean z3) {
        while (true) {
            Object objL = pVar.l(i4);
            if (objL == null) {
                if (!i(j8) || z3) {
                    if (z3) {
                        if (pVar.k(i4, null, j.j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i4, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i4, null, j.f38349d)) {
                    break;
                }
            } else {
                if (objL != j.f38350e) {
                    cl.u uVar = j.f38354k;
                    if (objL == uVar) {
                        pVar.n(i4, null);
                        return 5;
                    }
                    if (objL == j.f38352h) {
                        pVar.n(i4, null);
                        return 5;
                    }
                    if (objL == j.f38355l) {
                        pVar.n(i4, null);
                        y();
                        return 4;
                    }
                    pVar.n(i4, null);
                    if (objL instanceof y) {
                        objL = ((y) objL).f38377a;
                    }
                    if (G(objL, obj)) {
                        pVar.o(i4, j.f38353i);
                        return 0;
                    }
                    if (pVar.f38370f.getAndSet((i4 * 2) + 1, uVar) != uVar) {
                        pVar.m(i4, true);
                    }
                    return 5;
                }
                if (pVar.k(i4, objL, j.f38349d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f38339d;
            if (atomicLongFieldUpdater.get(hVar) > j8) {
                break;
            } else {
                hVar = this;
            }
        }
        int i4 = j.f38348c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f38340e;
            if (i10 < i4) {
                long j9 = atomicLongFieldUpdater.get(hVar);
                if (j9 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j9 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(hVar);
                    long j12 = atomicLongFieldUpdater2.get(hVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z3 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z3) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // zk.w
    public final yb.i a() {
        nk.x.d(3, d.f38329i);
        nk.x.d(3, e.f38330i);
        return new yb.i(this, (b) null);
    }

    @Override // zk.w
    public final Object b() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38338c;
        long j8 = atomicLongFieldUpdater.get(this);
        long j9 = f38337b.get(this);
        if (w(j9, true)) {
            return new m(r());
        }
        long j10 = j9 & 1152921504606846975L;
        n nVar = o.f38367b;
        if (j8 >= j10) {
            return nVar;
        }
        Object obj = j.f38354k;
        p pVar2 = (p) g.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = j.f38347b;
            long j12 = andIncrement / j11;
            int i4 = (int) (andIncrement % j11);
            if (pVar2.f2939c != j12) {
                p pVarQ = q(j12, pVar2);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar2;
            }
            Object objI = I(pVar, i4, andIncrement, obj);
            p pVar3 = pVar;
            if (objI == j.f38356m) {
                u1 u1Var = obj instanceof u1 ? (u1) obj : null;
                if (u1Var != null) {
                    u1Var.a(pVar3, i4);
                }
                K(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (objI != j.f38358o) {
                if (objI == j.f38357n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                return objI;
            }
            if (andIncrement < u()) {
                pVar3.a();
            }
            pVar2 = pVar3;
        }
        return new m(r());
    }

    @Override // zk.w
    public final Object d(bl.p pVar) {
        return D(this, pVar);
    }

    @Override // zk.w
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // zk.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(ck.c r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.h(ck.c, java.lang.Object):java.lang.Object");
    }

    public final boolean i(long j8) {
        return j8 < f38339d.get(this) || j8 < f38338c.get(this) + ((long) this.f38344a);
    }

    @Override // zk.w
    public final c iterator() {
        return new c(this);
    }

    public final boolean j(Throwable th2) {
        return m(th2, false);
    }

    @Override // zk.w
    public final Object k(ek.j jVar) {
        p pVar;
        Throwable th2;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f38338c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = j.f38347b;
            long j9 = andIncrement / j8;
            int i4 = (int) (andIncrement % j8);
            if (pVar3.f2939c != j9) {
                p pVarQ = q(j9, pVar3);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar3;
            }
            Object objI = I(pVar, i4, andIncrement, null);
            cl.u uVar = j.f38356m;
            if (objI == uVar) {
                throw new IllegalStateException("unexpected");
            }
            cl.u uVar2 = j.f38358o;
            if (objI == uVar2) {
                if (andIncrement < u()) {
                    pVar.a();
                }
                pVar3 = pVar;
            } else {
                if (objI != j.f38357n) {
                    pVar.a();
                    return objI;
                }
                xk.h hVarP = xk.x.p(a.a.r(jVar));
                h hVar = this;
                try {
                    Object objI2 = hVar.I(pVar, i4, andIncrement, hVarP);
                    if (objI2 == uVar) {
                        hVarP.a(pVar, i4);
                    } else {
                        if (objI2 == uVar2) {
                            if (andIncrement < u()) {
                                pVar.a();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (x()) {
                                    hVarP.resumeWith(ci.b.h(s()));
                                    break;
                                }
                                xk.h hVar2 = hVarP;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j10 = j.f38347b;
                                    long j11 = andIncrement2 / j10;
                                    int i10 = (int) (andIncrement2 % j10);
                                    if (pVar4.f2939c != j11) {
                                        try {
                                            p pVarQ2 = q(j11, pVar4);
                                            if (pVarQ2 == null) {
                                                hVarP = hVar2;
                                            } else {
                                                pVar2 = pVarQ2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            hVarP = hVar2;
                                            hVarP.A();
                                            throw th2;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    objI2 = hVar.I(pVar2, i10, andIncrement2, hVar2);
                                    p pVar5 = pVar2;
                                    hVarP = hVar2;
                                    if (objI2 == j.f38356m) {
                                        hVarP.a(pVar5, i10);
                                        break;
                                    }
                                    if (objI2 == j.f38358o) {
                                        if (andIncrement2 < u()) {
                                            pVar5.a();
                                        }
                                        hVar = this;
                                        pVar4 = pVar5;
                                    } else {
                                        if (objI2 == j.f38357n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.a();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    hVarP = hVar2;
                                    th2 = th;
                                    hVarP.A();
                                    throw th2;
                                }
                            }
                        } else {
                            pVar.a();
                        }
                        hVarP.f(objI2, null);
                    }
                    return hVarP.r();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thS = s();
        int i11 = cl.t.f2940a;
        throw thS;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // zk.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = zk.h.f38337b
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
            boolean r1 = r15.i(r1)
            r1 = r1 ^ r10
        L1b:
            zk.n r13 = zk.o.f38367b
            if (r1 == 0) goto L20
            return r13
        L20:
            cl.u r6 = zk.j.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = zk.h.f38341f
            java.lang.Object r1 = r1.get(r15)
            zk.p r1 = (zk.p) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.w(r2, r9)
            int r14 = zk.j.f38347b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f2939c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            zk.p r3 = c(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
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
            yj.u r3 = yj.u.f37649a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = zk.h.f38338c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof xk.u1
            if (r3 == 0) goto Lb2
            xk.u1 r6 = (xk.u1) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.l(java.lang.Object):java.lang.Object");
    }

    public final boolean m(Throwable th2, boolean z3) {
        h hVar;
        boolean z10;
        long j8;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38337b;
        if (!z3) {
            hVar = this;
            break;
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (((int) (j12 >> 60)) != 0) {
                hVar = this;
                break;
            }
            p pVar = j.f38346a;
            hVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(hVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
        cl.u uVar = j.f38362s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38343i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                z10 = false;
                break;
            }
        }
        if (z3) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
        } else {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j8 >> 60);
                if (i4 == 0) {
                    j9 = j8 & 1152921504606846975L;
                    j10 = 2;
                } else {
                    if (i4 != 1) {
                        break;
                    }
                    j9 = j8 & 1152921504606846975L;
                    j10 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j8, (j10 << 60) + j9));
        }
        y();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                obj = atomicReferenceFieldUpdater2.get(this);
                cl.u uVar2 = obj == null ? j.f38360q : j.f38361r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, uVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                nk.x.d(1, obj);
                ((mk.c) obj).invoke(r());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (zk.p) ((cl.c) cl.c.f2909b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zk.p n(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.n(long):zk.p");
    }

    public final void o(long j8) {
        p pVar = (p) g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f38338c;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f38344a + j9, f38339d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, 1 + j9)) {
                long j10 = j.f38347b;
                long j11 = j9 / j10;
                int i4 = (int) (j9 % j10);
                if (pVar.f2939c != j11) {
                    p pVarQ = q(j11, pVar);
                    if (pVarQ != null) {
                        pVar = pVarQ;
                    }
                }
                p pVar2 = pVar;
                if (I(pVar2, i4, j9, null) != j.f38358o || j9 < u()) {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: zk.h.p():void");
    }

    public final p q(long j8, p pVar) {
        Object objB;
        long j9;
        p pVar2 = j.f38346a;
        i iVar = i.f38345i;
        loop0: while (true) {
            objB = cl.b.b(pVar, j8, iVar);
            if (!cl.b.e(objB)) {
                cl.s sVarC = cl.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    cl.s sVar = (cl.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f2939c >= sVarC.f2939c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (cl.b.e(objB)) {
            y();
            if (pVar.f2939c * j.f38347b < u()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) cl.b.c(objB);
            long j10 = pVar3.f2939c;
            if (!A() && j8 <= f38339d.get(this) / j.f38347b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f38342h;
                    cl.s sVar2 = (cl.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f2939c >= j10 || !pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (sVar2.f()) {
                        sVar2.e();
                    }
                }
            }
            if (j10 <= j8) {
                return pVar3;
            }
            long j11 = j10 * j.f38347b;
            do {
                j9 = f38338c.get(this);
                if (j9 >= j11) {
                    break;
                }
            } while (!f38338c.compareAndSet(this, j9, j11));
            if (j10 * j.f38347b < u()) {
                pVar3.a();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) f38343i.get(this);
    }

    public final Throwable s() {
        Throwable thR = r();
        return thR == null ? new q("Channel was closed") : thR;
    }

    public final Throwable t() {
        Throwable thR = r();
        return thR == null ? new ay1("Channel was closed") : thR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        r16 = r7;
        r3 = (zk.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.toString():java.lang.String");
    }

    public final long u() {
        return f38337b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (zk.p) ((cl.c) cl.c.f2909b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.h.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(f38337b.get(this), true);
    }

    public final boolean y() {
        return w(f38337b.get(this), false);
    }

    public boolean z() {
        return false;
    }
}
