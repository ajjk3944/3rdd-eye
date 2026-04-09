package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class bc {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(bc.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(bc.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(bc.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(bc.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(bc.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(bc.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(bc.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(bc.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(bc.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public bc(int i2) {
        this.a = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        he heVar = dc.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        he heVar2 = new he(0L, null, this, 3);
        this.sendSegment$volatile = heVar2;
        this.receiveSegment$volatile = heVar2;
        if (j()) {
            heVar2 = dc.a;
            i30.k(heVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = heVar2;
        this._closeCause$volatile = dc.r;
    }

    public static void h(bc bcVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bcVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bcVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof jd)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        jd jdVar = (jd) obj;
        he heVar = dc.a;
        gs3 gs3VarL = jdVar.l(z31.a, null);
        if (gs3VarL == null) {
            return false;
        }
        jdVar.j(gs3VarL);
        return true;
    }

    public final boolean a(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    public final he b(long j2) {
        Object objS;
        Object obj = h.get(this);
        he heVar = (he) f.get(this);
        if (heVar.c > ((he) obj).c) {
            obj = heVar;
        }
        he heVar2 = (he) g.get(this);
        if (heVar2.c > ((he) obj).c) {
            obj = heVar2;
        }
        nh nhVar = (nh) obj;
        loop0: while (true) {
            nhVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nh.a;
            Object obj2 = atomicReferenceFieldUpdater.get(nhVar);
            gs3 gs3Var = i41.h;
            objS = null;
            if (obj2 == gs3Var) {
                break;
            }
            nh nhVar2 = (nh) obj2;
            if (nhVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(nhVar, null, gs3Var)) {
                    if (atomicReferenceFieldUpdater.get(nhVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            nhVar = nhVar2;
        }
        he heVar3 = (he) nhVar;
        loop2: for (he heVar4 = heVar3; heVar4 != null; heVar4 = (he) ((nh) nh.b.get(heVar4))) {
            for (int i2 = dc.b - 1; -1 < i2; i2--) {
                if ((heVar4.c * dc.b) + i2 < j2) {
                    break loop2;
                }
                while (true) {
                    Object objK = heVar4.k(i2);
                    if (objK != null && objK != dc.e) {
                        if (!(objK instanceof x71)) {
                            if (!(objK instanceof w71)) {
                                break;
                            }
                            if (heVar4.j(i2, objK, dc.l)) {
                                objS = gi2.s(objS, objK);
                                heVar4.l(i2, true);
                                break;
                            }
                        } else {
                            if (heVar4.j(i2, objK, dc.l)) {
                                objS = gi2.s(objS, ((x71) objK).a);
                                heVar4.l(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (heVar4.j(i2, objK, dc.l)) {
                            heVar4.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objS != null) {
            if (!(objS instanceof ArrayList)) {
                l((w71) objS, true);
                return heVar3;
            }
            ArrayList arrayList = (ArrayList) objS;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((w71) arrayList.get(size), true);
            }
        }
        return heVar3;
    }

    public final void c() {
        i(b.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        h(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.d():void");
    }

    public final he e(long j2, he heVar) {
        Object objF;
        long j3;
        he heVar2 = dc.a;
        cc ccVar = cc.n;
        loop0: while (true) {
            objF = i41.f(heVar, j2, ccVar);
            if (!um.p(objF)) {
                yt0 yt0VarM = um.m(objF);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    yt0 yt0Var = (yt0) atomicReferenceFieldUpdater.get(this);
                    if (yt0Var.c >= yt0VarM.c) {
                        break loop0;
                    }
                    if (!yt0VarM.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yt0Var, yt0VarM)) {
                        if (atomicReferenceFieldUpdater.get(this) != yt0Var) {
                            if (yt0VarM.e()) {
                                yt0VarM.d();
                            }
                        }
                    }
                    if (yt0Var.e()) {
                        yt0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        if (um.p(objF)) {
            c();
            if (heVar.c * dc.b < g()) {
                heVar.a();
                return null;
            }
        } else {
            he heVar3 = (he) um.m(objF);
            long j4 = heVar3.c;
            if (!j() && j2 <= d.get(this) / dc.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    yt0 yt0Var2 = (yt0) atomicReferenceFieldUpdater2.get(this);
                    if (yt0Var2.c >= j4 || !heVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, yt0Var2, heVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != yt0Var2) {
                            if (heVar3.e()) {
                                heVar3.d();
                            }
                        }
                    }
                    if (yt0Var2.e()) {
                        yt0Var2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return heVar3;
            }
            long j5 = j4 * dc.b;
            do {
                j3 = c.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!c.compareAndSet(this, j3, j5));
            if (j4 * dc.b < g()) {
                heVar3.a();
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th = (Throwable) i.get(this);
        return th == null ? new vf("Channel was closed") : th;
    }

    public final long g() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.he) ((defpackage.nh) defpackage.nh.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r5, defpackage.he r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            nh r0 = r7.b()
            he r0 = (defpackage.he) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            nh r5 = r7.b()
            he r5 = (defpackage.he) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.bc.h
            java.lang.Object r6 = r5.get(r4)
            yt0 r6 = (defpackage.yt0) r6
            long r0 = r6.c
            long r2 = r7.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.k(long, he):void");
    }

    public final void l(w71 w71Var, boolean z) {
        Throwable thF;
        if (!(w71Var instanceof jd)) {
            throw new IllegalStateException(("Unexpected waiter: " + w71Var).toString());
        }
        oj ojVar = (oj) w71Var;
        if (z) {
            thF = (Throwable) i.get(this);
            if (thF == null) {
                thF = new uf("Channel was closed");
            }
        } else {
            thF = f();
        }
        ojVar.e(bd2.k(thF));
    }

    public final boolean m(Object obj, jw0 jw0Var) {
        if (!(obj instanceof jd)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        jd jdVar = (jd) obj;
        he heVar = dc.a;
        gs3 gs3VarL = jdVar.l(jw0Var, null);
        if (gs3VarL == null) {
            return false;
        }
        jdVar.j(gs3VarL);
        return true;
    }

    public final Object o(he heVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = heVar.f;
        Object objK = heVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return dc.n;
                }
                if (heVar.j(i2, objK, obj)) {
                    d();
                    return dc.m;
                }
            }
        } else if (objK == dc.d && heVar.j(i2, objK, dc.i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            heVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = heVar.k(i2);
            if (objK2 == null || objK2 == dc.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (heVar.j(i2, objK2, dc.h)) {
                        d();
                        return dc.o;
                    }
                } else {
                    if (obj == null) {
                        return dc.n;
                    }
                    if (heVar.j(i2, objK2, obj)) {
                        d();
                        return dc.m;
                    }
                }
            } else if (objK2 != dc.d) {
                gs3 gs3Var = dc.j;
                if (objK2 == gs3Var) {
                    return dc.o;
                }
                if (objK2 == dc.h) {
                    return dc.o;
                }
                if (objK2 == dc.l) {
                    d();
                    return dc.o;
                }
                if (objK2 != dc.g && heVar.j(i2, objK2, dc.f)) {
                    boolean z = objK2 instanceof x71;
                    if (z) {
                        objK2 = ((x71) objK2).a;
                    }
                    if (n(objK2)) {
                        heVar.n(i2, dc.i);
                        d();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        heVar.m(i2, null);
                        return obj3;
                    }
                    heVar.n(i2, gs3Var);
                    heVar.h();
                    if (z) {
                        d();
                    }
                    return dc.o;
                }
            } else if (heVar.j(i2, objK2, dc.i)) {
                d();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                heVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int p(he heVar, int i2, jw0 jw0Var, long j2, Object obj, boolean z) {
        while (true) {
            Object objK = heVar.k(i2);
            if (objK == null) {
                if (!a(j2) || z) {
                    if (z) {
                        if (heVar.j(i2, null, dc.j)) {
                            heVar.h();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (heVar.j(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (heVar.j(i2, null, dc.d)) {
                    break;
                }
            } else {
                if (objK != dc.e) {
                    gs3 gs3Var = dc.k;
                    if (objK == gs3Var) {
                        heVar.m(i2, null);
                        return 5;
                    }
                    if (objK == dc.h) {
                        heVar.m(i2, null);
                        return 5;
                    }
                    if (objK == dc.l) {
                        heVar.m(i2, null);
                        c();
                        return 4;
                    }
                    heVar.m(i2, null);
                    if (objK instanceof x71) {
                        objK = ((x71) objK).a;
                    }
                    if (m(objK, jw0Var)) {
                        heVar.n(i2, dc.i);
                        return 0;
                    }
                    if (heVar.f.getAndSet((i2 * 2) + 1, gs3Var) != gs3Var) {
                        heVar.l(i2, true);
                    }
                    return 5;
                }
                if (heVar.j(i2, objK, dc.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void q(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        bc bcVar = this;
        if (bcVar.j()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(bcVar) > j2) {
                break;
            } else {
                bcVar = this;
            }
        }
        int i2 = dc.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(bcVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(bcVar)) && j3 == atomicLongFieldUpdater.get(bcVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(bcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bcVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bcVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(bcVar);
                    long j6 = atomicLongFieldUpdater2.get(bcVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bcVar)) {
                        break;
                    }
                    if (z) {
                        bcVar = this;
                    } else {
                        bcVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bcVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bcVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        bcVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
    
        r16 = r7;
        r3 = (defpackage.he) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.toString():java.lang.String");
    }
}
