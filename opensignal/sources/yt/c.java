package yt;

import androidx.media3.common.u;
import bu.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lf.t1;
import lq.b0;
import wt.q1;

/* loaded from: classes.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f26427a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26422d = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26423g = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26424r = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26425x = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26426y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i10) {
        this.f26427a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Invalid channel capacity: ", i10, ", should be >=0").toString());
        }
        k kVar = e.f26428a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f26424r.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f26428a;
            br.l.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f26444s;
    }

    public static final k b(c cVar, long j, k kVar) {
        Object objB;
        c cVar2;
        k kVar2 = e.f26428a;
        d dVar = d.E;
        loop0: while (true) {
            objB = bu.a.b(kVar, j, dVar);
            if (!bu.a.e(objB)) {
                bu.r rVarC = bu.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26426y;
                    bu.r rVar = (bu.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f2987c >= rVarC.f2987c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = bu.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26423g;
        if (zE) {
            cVar.j();
            if (kVar.f2987c * e.f26429b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) bu.a.c(objB);
            long j7 = kVar3.f2987c;
            if (j7 <= j) {
                return kVar3;
            }
            long j10 = e.f26429b * j7;
            while (true) {
                long j11 = f26422d.get(cVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f26422d.compareAndSet(cVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j7 * e.f26429b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, wt.g gVar) {
        gVar.g(t1.k(cVar.p()));
    }

    public static final int e(c cVar, k kVar, int i10, Object obj, long j, Object obj2, boolean z10) {
        kVar.m(i10, obj);
        if (z10) {
            return cVar.B(kVar, i10, obj, j, obj2, z10);
        }
        Object objK = kVar.k(i10);
        if (objK == null) {
            if (cVar.f(j)) {
                if (kVar.j(null, i10, e.f26431d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(null, i10, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof q1) {
            kVar.m(i10, null);
            if (cVar.y(objK, obj)) {
                kVar.n(i10, e.f26436i);
                return 0;
            }
            t tVar = e.k;
            if (kVar.f26451f.getAndSet((i10 * 2) + 1, tVar) == tVar) {
                return 5;
            }
            kVar.l(i10, true);
            return 5;
        }
        return cVar.B(kVar, i10, obj, j, obj2, z10);
    }

    public static void r(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26425x;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof wt.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        wt.f fVar = (wt.f) obj;
        k kVar = e.f26428a;
        t tVarK = fVar.k(b0.f15562a, null);
        if (tVarK == null) {
            return false;
        }
        fVar.n(tVarK);
        return true;
    }

    public final Object A(k kVar, int i10, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f26451f;
        Object objK = kVar.k(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26422d;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f26439n;
                }
                if (kVar.j(objK, i10, obj)) {
                    l();
                    return e.f26438m;
                }
            }
        } else if (objK == e.f26431d && kVar.j(objK, i10, e.f26436i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            kVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object objK2 = kVar.k(i10);
            if (objK2 == null || objK2 == e.f26432e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(objK2, i10, e.f26435h)) {
                        l();
                        return e.f26440o;
                    }
                } else {
                    if (obj == null) {
                        return e.f26439n;
                    }
                    if (kVar.j(objK2, i10, obj)) {
                        l();
                        return e.f26438m;
                    }
                }
            } else if (objK2 != e.f26431d) {
                t tVar = e.j;
                if (objK2 == tVar) {
                    return e.f26440o;
                }
                if (objK2 == e.f26435h) {
                    return e.f26440o;
                }
                if (objK2 == e.f26437l) {
                    l();
                    return e.f26440o;
                }
                if (objK2 != e.f26434g && kVar.j(objK2, i10, e.f26433f)) {
                    boolean z10 = objK2 instanceof s;
                    if (z10) {
                        objK2 = ((s) objK2).f26456a;
                    }
                    if (z(objK2)) {
                        kVar.n(i10, e.f26436i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        kVar.m(i10, null);
                        return obj3;
                    }
                    kVar.n(i10, tVar);
                    kVar.h();
                    if (z10) {
                        l();
                    }
                    return e.f26440o;
                }
            } else if (kVar.j(objK2, i10, e.f26436i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                kVar.m(i10, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i10, Object obj, long j, Object obj2, boolean z10) {
        while (true) {
            Object objK = kVar.k(i10);
            if (objK == null) {
                if (!f(j) || z10) {
                    if (z10) {
                        if (kVar.j(null, i10, e.j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, i10, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, i10, e.f26431d)) {
                    break;
                }
            } else {
                if (objK != e.f26432e) {
                    t tVar = e.k;
                    if (objK == tVar) {
                        kVar.m(i10, null);
                        return 5;
                    }
                    if (objK == e.f26435h) {
                        kVar.m(i10, null);
                        return 5;
                    }
                    if (objK == e.f26437l) {
                        kVar.m(i10, null);
                        j();
                        return 4;
                    }
                    kVar.m(i10, null);
                    if (objK instanceof s) {
                        objK = ((s) objK).f26456a;
                    }
                    if (y(objK, obj)) {
                        kVar.n(i10, e.f26436i);
                        return 0;
                    }
                    if (kVar.f26451f.getAndSet((i10 * 2) + 1, tVar) != tVar) {
                        kVar.l(i10, true);
                    }
                    return 5;
                }
                if (kVar.j(objK, i10, e.f26431d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f26424r;
            if (atomicLongFieldUpdater.get(cVar) > j) {
                break;
            } else {
                cVar = this;
            }
        }
        int i10 = e.f26430c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f26425x;
            if (i11 < i10) {
                long j7 = atomicLongFieldUpdater.get(cVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j7 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z10 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z10) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // yt.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r24, pq.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.a(java.lang.Object, pq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // yt.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = yt.c.f26422d
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.s(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            yt.i r13 = yt.j.f26448b
            if (r1 == 0) goto L20
            return r13
        L20:
            bu.t r6 = yt.e.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = yt.c.f26426y
            java.lang.Object r1 = r1.get(r15)
            yt.k r1 = (yt.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.s(r2, r9)
            int r14 = yt.e.f26429b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f2987c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            yt.k r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.p()
            yt.h r2 = new yt.h
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
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            lq.b0 r3 = lq.b0.f15562a
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = yt.c.f26423g
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.p()
            yt.h r2 = new yt.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.h()
            java.lang.Throwable r1 = r15.p()
            yt.h r2 = new yt.h
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof wt.q1
            if (r3 == 0) goto Lb2
            wt.q1 r6 = (wt.q1) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.h()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.c(java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j) {
        return j < f26424r.get(this) || j < f26423g.get(this) + ((long) this.f26427a);
    }

    public final boolean g(Throwable th2, boolean z10) {
        c cVar;
        boolean z11;
        long j;
        long j7;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26422d;
        if (!z10) {
            cVar = this;
            break;
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (((int) (j12 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f26428a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
        t tVar = e.f26444s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, th2)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j >> 60);
                if (i10 == 0) {
                    j7 = j & 1152921504606846975L;
                    j10 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j7 = j & 1152921504606846975L;
                    j10 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j, (j10 << 60) + j7));
        }
        j();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F;
                obj = atomicReferenceFieldUpdater2.get(this);
                t tVar2 = obj == null ? e.f26442q : e.f26443r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                br.b0.c(1, obj);
                ((ar.k) obj).a(n());
                return z11;
            }
        }
        return z11;
    }

    @Override // yt.q
    public final void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (yt.k) ((bu.b) bu.b.f2959b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yt.k i(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.i(long):yt.k");
    }

    public final void j() {
        s(f26422d.get(this), false);
    }

    public final void k(long j) {
        k kVar = (k) B.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f26423g;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f26427a + j7, f26424r.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j10 = e.f26429b;
                long j11 = j7 / j10;
                int i10 = (int) (j7 % j10);
                if (kVar.f2987c != j11) {
                    k kVarM = m(j11, kVar);
                    if (kVarM != null) {
                        kVar = kVarM;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i10, j7, null) != e.f26440o || j7 < q()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.l():void");
    }

    public final k m(long j, k kVar) {
        Object objB;
        long j7;
        k kVar2 = e.f26428a;
        d dVar = d.E;
        loop0: while (true) {
            objB = bu.a.b(kVar, j, dVar);
            if (!bu.a.e(objB)) {
                bu.r rVarC = bu.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                    bu.r rVar = (bu.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2987c >= rVarC.f2987c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (bu.a.e(objB)) {
            j();
            if (kVar.f2987c * e.f26429b < q()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) bu.a.c(objB);
            long j10 = kVar3.f2987c;
            if (!u() && j <= f26424r.get(this) / e.f26429b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                    bu.r rVar2 = (bu.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f2987c >= j10 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (rVar2.e()) {
                        rVar2.d();
                    }
                }
            }
            if (j10 <= j) {
                return kVar3;
            }
            long j11 = j10 * e.f26429b;
            do {
                j7 = f26423g.get(this);
                if (j7 >= j11) {
                    break;
                }
            } while (!f26423g.compareAndSet(this, j7, j11));
            if (j10 * e.f26429b < q()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) E.get(this);
    }

    public final Throwable o() {
        Throwable thN = n();
        return thN == null ? new l("Channel was closed") : thN;
    }

    public final Throwable p() {
        Throwable thN = n();
        return thN == null ? new u("Channel was closed") : thN;
    }

    public final long q() {
        return f26422d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (yt.k) ((bu.b) bu.b.f2959b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.s(long, boolean):boolean");
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (yt.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.toString():java.lang.String");
    }

    public final boolean u() {
        long j = f26424r.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(long r5, yt.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f2987c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            bu.b r0 = r7.b()
            yt.k r0 = (yt.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            bu.b r5 = r7.b()
            yt.k r5 = (yt.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = yt.c.D
            java.lang.Object r6 = r5.get(r4)
            bu.r r6 = (bu.r) r6
            long r0 = r6.f2987c
            long r2 = r7.f2987c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.c.v(long, yt.k):void");
    }

    public final Object w(Object obj, pq.c cVar) {
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        gVar.g(t1.k(p()));
        Object objU = gVar.u();
        return objU == qq.a.COROUTINE_SUSPENDED ? objU : b0.f15562a;
    }

    public final void x(q1 q1Var, boolean z10) {
        if (q1Var instanceof wt.f) {
            ((pq.c) q1Var).g(t1.k(z10 ? o() : p()));
            return;
        }
        if (!(q1Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + q1Var).toString());
        }
        b bVar = (b) q1Var;
        wt.g gVar = bVar.f26420d;
        br.l.b(gVar);
        bVar.f26420d = null;
        bVar.f26419a = e.f26437l;
        Throwable thN = bVar.f26421g.n();
        if (thN == null) {
            gVar.g(Boolean.FALSE);
        } else {
            gVar.g(t1.k(thN));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof wt.f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            wt.f fVar = (wt.f) obj;
            k kVar = e.f26428a;
            t tVarK = fVar.k(obj2, null);
            if (tVarK == null) {
                return false;
            }
            fVar.n(tVarK);
            return true;
        }
        b bVar = (b) obj;
        wt.g gVar = bVar.f26420d;
        br.l.b(gVar);
        bVar.f26420d = null;
        bVar.f26419a = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f26421g.getClass();
        k kVar2 = e.f26428a;
        t tVarK2 = gVar.k(bool, null);
        if (tVarK2 == null) {
            return false;
        }
        gVar.n(tVarK2);
        return true;
    }
}
