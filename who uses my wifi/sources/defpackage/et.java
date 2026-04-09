package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class et extends ft implements zn {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(et.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(et.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(et.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public jp c(long j, u11 u11Var, hk hkVar) {
        return bn.a.c(j, u11Var, hkVar);
    }

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) {
        r(runnable);
    }

    public void r(Runnable runnable) {
        if (!s(runnable)) {
            an.n.r(runnable);
            return;
        }
        Thread threadN = n();
        if (Thread.currentThread() != threadN) {
            LockSupport.unpark(threadN);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.et.k
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.et.m
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.e80
            if (r4 == 0) goto L47
            r4 = r1
            e80 r4 = (defpackage.e80) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            e80 r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            gs3 r4 = defpackage.bd2.h
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            e80 r3 = new e80
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.s(java.lang.Runnable):boolean");
    }

    @Override // defpackage.ft
    public void shutdown() {
        ct ctVarB;
        p11.a.set(null);
        m.set(this, 1);
        gs3 gs3Var = bd2.h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof e80)) {
                    if (obj != gs3Var) {
                        e80 e80Var = new e80(8, true);
                        e80Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e80Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((e80) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, gs3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (u() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            dt dtVar = (dt) l.get(this);
            if (dtVar == null) {
                return;
            }
            synchronized (dtVar) {
                ctVarB = q11.b.get(dtVar) > 0 ? dtVar.b(0) : null;
            }
            if (ctVarB == null) {
                return;
            } else {
                q(jNanoTime, ctVarB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t() {
        /*
            r7 = this;
            l8 r0 = r7.j
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.et.l
            java.lang.Object r0 = r0.get(r7)
            dt r0 = (defpackage.dt) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.q11.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.et.k
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof defpackage.e80
            if (r3 == 0) goto L4f
            e80 r0 = (defpackage.e80) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.e80.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            gs3 r3 = defpackage.bd2.h
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.t():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.u():long");
    }

    public final void v(long j, ct ctVar) {
        int iA;
        Thread threadN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        if (m.get(this) != 0) {
            iA = 1;
        } else {
            dt dtVar = (dt) atomicReferenceFieldUpdater.get(this);
            if (dtVar == null) {
                dt dtVar2 = new dt();
                dtVar2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dtVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                i30.j(obj);
                dtVar = (dt) obj;
            }
            iA = ctVar.a(j, dtVar, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                q(j, ctVar);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        dt dtVar3 = (dt) atomicReferenceFieldUpdater.get(this);
        if (dtVar3 != null) {
            synchronized (dtVar3) {
                ct[] ctVarArr = dtVar3.a;
                ctVar = ctVarArr != null ? ctVarArr[0] : null;
            }
        }
        if (ctVar != ctVar || Thread.currentThread() == (threadN = n())) {
            return;
        }
        LockSupport.unpark(threadN);
    }
}
