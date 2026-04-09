package B5;

import E5.t;
import a0.AbstractC0258l;
import c5.C0412i;
import h5.InterfaceC2370d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.InterfaceC3029e;
import z5.n0;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f768b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f769c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f770d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f771e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f772f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f773g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f774h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f775j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f776a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public b(int i3) {
        this.f776a = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(A.f.h(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        h hVar = d.f777a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f770d.get(this);
        h hVar2 = new h(0L, null, this, 3);
        this.sendSegment$volatile = hVar2;
        this.receiveSegment$volatile = hVar2;
        if (j()) {
            hVar2 = d.f777a;
            q5.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = hVar2;
        this._closeCause$volatile = d.f793r;
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f771e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof InterfaceC3029e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        q5.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC3029e interfaceC3029e = (InterfaceC3029e) obj;
        h hVar = d.f777a;
        B2.a aVarG = interfaceC3029e.g(C0412i.f5929a, null);
        if (aVarG == null) {
            return false;
        }
        interfaceC3029e.i(aVarG);
        return true;
    }

    public final boolean a(long j6) {
        return j6 < f770d.get(this) || j6 < f769c.get(this) + ((long) this.f776a);
    }

    public final h b(long j6) {
        Object objE;
        Object obj = f774h.get(this);
        h hVar = (h) f772f.get(this);
        if (hVar.f1413c > ((h) obj).f1413c) {
            obj = hVar;
        }
        h hVar2 = (h) f773g.get(this);
        if (hVar2.f1413c > ((h) obj).f1413c) {
            obj = hVar2;
        }
        E5.d dVar = (E5.d) obj;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.d.f1380a;
            Object obj2 = atomicReferenceFieldUpdater.get(dVar);
            B2.a aVar = E5.a.f1373b;
            objE = null;
            if (obj2 == aVar) {
                break;
            }
            E5.d dVar2 = (E5.d) obj2;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        h hVar3 = (h) dVar;
        loop2: for (h hVar4 = hVar3; hVar4 != null; hVar4 = (h) ((E5.d) E5.d.f1381b.get(hVar4))) {
            for (int i3 = d.f778b - 1; -1 < i3; i3--) {
                if ((hVar4.f1413c * d.f778b) + i3 < j6) {
                    break loop2;
                }
                while (true) {
                    Object objK = hVar4.k(i3);
                    if (objK != null && objK != d.f781e) {
                        if (!(objK instanceof k)) {
                            if (!(objK instanceof n0)) {
                                break;
                            }
                            if (hVar4.j(objK, i3, d.f787l)) {
                                objE = E5.a.e(objE, objK);
                                hVar4.l(i3, true);
                                break;
                            }
                        } else {
                            if (hVar4.j(objK, i3, d.f787l)) {
                                objE = E5.a.e(objE, ((k) objK).f799a);
                                hVar4.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar4.j(objK, i3, d.f787l)) {
                            hVar4.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objE != null) {
            if (!(objE instanceof ArrayList)) {
                l((n0) objE, true);
                return hVar3;
            }
            ArrayList arrayList = (ArrayList) objE;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((n0) arrayList.get(size), true);
            }
        }
        return hVar3;
    }

    public final void c() {
        i(f768b.get(this), false);
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
        throw new UnsupportedOperationException("Method not decompiled: B5.b.d():void");
    }

    public final h e(long j6, h hVar) {
        Object objA;
        long j7;
        h hVar2 = d.f777a;
        c cVar = c.i;
        loop0: while (true) {
            objA = E5.a.a(hVar, j6, cVar);
            if (!E5.a.d(objA)) {
                t tVarB = E5.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f773g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f1413c >= tVarB.f1413c) {
                        break loop0;
                    }
                    if (!tVarB.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarB.e()) {
                                tVarB.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (E5.a.d(objA)) {
            c();
            if (hVar.f1413c * d.f778b < g()) {
                hVar.a();
                return null;
            }
        } else {
            h hVar3 = (h) E5.a.b(objA);
            long j8 = hVar3.f1413c;
            if (!j() && j6 <= f770d.get(this) / d.f778b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f774h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f1413c >= j8 || !hVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, hVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (hVar3.e()) {
                                hVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j8 <= j6) {
                return hVar3;
            }
            long j9 = j8 * d.f778b;
            do {
                j7 = f769c.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!f769c.compareAndSet(this, j7, j9));
            if (j8 * d.f778b < g()) {
                hVar3.a();
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th = (Throwable) i.get(this);
        return th == null ? new j("Channel was closed") : th;
    }

    public final long g() {
        return f768b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (B5.h) ((E5.d) E5.d.f1381b.get(r0));
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
        throw new UnsupportedOperationException("Method not decompiled: B5.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j6 = f770d.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r5, B5.h r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f1413c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            E5.d r0 = r7.b()
            B5.h r0 = (B5.h) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            E5.d r5 = r7.b()
            B5.h r5 = (B5.h) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = B5.b.f774h
            java.lang.Object r6 = r5.get(r4)
            E5.t r6 = (E5.t) r6
            long r0 = r6.f1413c
            long r2 = r7.f1413c
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
        throw new UnsupportedOperationException("Method not decompiled: B5.b.k(long, B5.h):void");
    }

    public final void l(n0 n0Var, boolean z6) {
        Throwable thF;
        if (!(n0Var instanceof InterfaceC3029e)) {
            throw new IllegalStateException(("Unexpected waiter: " + n0Var).toString());
        }
        InterfaceC2370d interfaceC2370d = (InterfaceC2370d) n0Var;
        if (z6) {
            thF = (Throwable) i.get(this);
            if (thF == null) {
                thF = new i("Channel was closed");
            }
        } else {
            thF = f();
        }
        interfaceC2370d.e(R2.a.d(thF));
    }

    public final boolean m(Object obj, AbstractC0258l abstractC0258l) {
        if (!(obj instanceof InterfaceC3029e)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        q5.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC3029e interfaceC3029e = (InterfaceC3029e) obj;
        h hVar = d.f777a;
        B2.a aVarG = interfaceC3029e.g(abstractC0258l, null);
        if (aVarG == null) {
            return false;
        }
        interfaceC3029e.i(aVarG);
        return true;
    }

    public final Object o(h hVar, int i3, long j6, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f797f;
        Object objK = hVar.k(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f768b;
        if (objK == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f789n;
                }
                if (hVar.j(objK, i3, obj)) {
                    d();
                    return d.f788m;
                }
            }
        } else if (objK == d.f780d && hVar.j(objK, i3, d.i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            hVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object objK2 = hVar.k(i3);
            if (objK2 == null || objK2 == d.f781e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hVar.j(objK2, i3, d.f784h)) {
                        d();
                        return d.f790o;
                    }
                } else {
                    if (obj == null) {
                        return d.f789n;
                    }
                    if (hVar.j(objK2, i3, obj)) {
                        d();
                        return d.f788m;
                    }
                }
            } else if (objK2 != d.f780d) {
                B2.a aVar = d.f785j;
                if (objK2 == aVar) {
                    return d.f790o;
                }
                if (objK2 == d.f784h) {
                    return d.f790o;
                }
                if (objK2 == d.f787l) {
                    d();
                    return d.f790o;
                }
                if (objK2 != d.f783g && hVar.j(objK2, i3, d.f782f)) {
                    boolean z6 = objK2 instanceof k;
                    if (z6) {
                        objK2 = ((k) objK2).f799a;
                    }
                    if (n(objK2)) {
                        hVar.n(i3, d.i);
                        d();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        hVar.m(i3, null);
                        return obj3;
                    }
                    hVar.n(i3, aVar);
                    hVar.h();
                    if (z6) {
                        d();
                    }
                    return d.f790o;
                }
            } else if (hVar.j(objK2, i3, d.i)) {
                d();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                hVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int p(h hVar, int i3, AbstractC0258l abstractC0258l, long j6, Object obj, boolean z6) {
        while (true) {
            Object objK = hVar.k(i3);
            if (objK == null) {
                if (!a(j6) || z6) {
                    if (z6) {
                        if (hVar.j(null, i3, d.f785j)) {
                            hVar.h();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (hVar.j(null, i3, obj)) {
                            return 2;
                        }
                    }
                } else if (hVar.j(null, i3, d.f780d)) {
                    break;
                }
            } else {
                if (objK != d.f781e) {
                    B2.a aVar = d.f786k;
                    if (objK == aVar) {
                        hVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f784h) {
                        hVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f787l) {
                        hVar.m(i3, null);
                        c();
                        return 4;
                    }
                    hVar.m(i3, null);
                    if (objK instanceof k) {
                        objK = ((k) objK).f799a;
                    }
                    if (m(objK, abstractC0258l)) {
                        hVar.n(i3, d.i);
                        return 0;
                    }
                    if (hVar.f797f.getAndSet((i3 * 2) + 1, aVar) != aVar) {
                        hVar.l(i3, true);
                    }
                    return 5;
                }
                if (hVar.j(objK, i3, d.f780d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void q(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.j()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f770d;
            if (atomicLongFieldUpdater.get(bVar) > j6) {
                break;
            } else {
                bVar = this;
            }
        }
        int i3 = d.f779c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f771e;
            if (i6 < i3) {
                long j7 = atomicLongFieldUpdater.get(bVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j7 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j8, (j8 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater.get(bVar);
                    long j10 = atomicLongFieldUpdater2.get(bVar);
                    long j11 = j10 & 4611686018427387903L;
                    boolean z6 = (j10 & 4611686018427387904L) != 0;
                    if (j9 == j11 && j9 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z6) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j10, 4611686018427387904L + j11);
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j12, j12 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
    
        r16 = r7;
        r3 = (B5.h) r3.b();
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
        throw new UnsupportedOperationException("Method not decompiled: B5.b.toString():java.lang.String");
    }
}
