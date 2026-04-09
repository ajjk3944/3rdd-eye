package wt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class j0 extends k0 implements a0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wt.j0.B
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = wt.j0.E
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
            boolean r4 = r1 instanceof bu.m
            if (r4 == 0) goto L47
            r4 = r1
            bu.m r4 = (bu.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            bu.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            bu.t r4 = wt.w.f24664c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            bu.m r3 = new bu.m
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
        throw new UnsupportedOperationException("Method not decompiled: wt.j0.A0(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B0() {
        /*
            r7 = this;
            mq.k r0 = r7.f24631x
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wt.j0.D
            java.lang.Object r0 = r0.get(r7)
            wt.i0 r0 = (wt.i0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = bu.v.f2992b
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wt.j0.B
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof bu.m
            if (r3 == 0) goto L4f
            bu.m r0 = (bu.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = bu.m.f2977f
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
            bu.t r3 = wt.w.f24664c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.j0.B0():boolean");
    }

    public final void C0(long j, h0 h0Var) {
        int iB;
        Thread threadT0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        if (E.get(this) != 0) {
            iB = 1;
        } else {
            i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
            if (i0Var == null) {
                i0 i0Var2 = new i0();
                i0Var2.f24626c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, i0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                br.l.b(obj);
                i0Var = (i0) obj;
            }
            iB = h0Var.b(j, i0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                x0(j, h0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        i0 i0Var3 = (i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var3 != null) {
            synchronized (i0Var3) {
                h0[] h0VarArr = i0Var3.f2993a;
                h0Var = h0VarArr != null ? h0VarArr[0] : null;
            }
        }
        if (h0Var != h0Var || Thread.currentThread() == (threadT0 = t0())) {
            return;
        }
        LockSupport.unpark(threadT0);
    }

    @Override // wt.a0
    public final void G(long j, g gVar) {
        long j7 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j7 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            g0 g0Var = new g0(this, j7 + jNanoTime, gVar);
            C0(jNanoTime, g0Var);
            gVar.y(new e(2, g0Var));
        }
    }

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        y0(runnable);
    }

    @Override // wt.k0
    public void shutdown() {
        h0 h0VarB;
        k1.f24632a.set(null);
        E.set(this, 1);
        bu.t tVar = w.f24664c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof bu.m)) {
                    if (obj != tVar) {
                        bu.m mVar = new bu.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((bu.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (v0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            i0 i0Var = (i0) D.get(this);
            if (i0Var == null) {
                return;
            }
            synchronized (i0Var) {
                h0VarB = bu.v.f2992b.get(i0Var) > 0 ? i0Var.b(0) : null;
            }
            if (h0VarB == null) {
                return;
            } else {
                x0(jNanoTime, h0VarB);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // wt.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long v0() {
        /*
            r10 = this;
            bu.t r0 = wt.w.f24664c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = wt.j0.B
            boolean r2 = r10.w0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.z0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof bu.m
            if (r6 == 0) goto L3e
            r6 = r2
            bu.m r6 = (bu.m) r6
            java.lang.Object r7 = r6.d()
            bu.t r8 = bu.m.f2978g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            bu.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            mq.k r2 = r10.f24631x
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof bu.m
            if (r2 == 0) goto L8d
            bu.m r1 = (bu.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = bu.m.f2977f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wt.j0.D
            java.lang.Object r0 = r0.get(r10)
            wt.i0 r0 = (wt.i0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            wt.h0[] r1 = r0.f2993a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f24622a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.j0.v0():long");
    }

    public void y0(Runnable runnable) {
        z0();
        if (!A0(runnable)) {
            x.F.y0(runnable);
            return;
        }
        Thread threadT0 = t0();
        if (Thread.currentThread() != threadT0) {
            LockSupport.unpark(threadT0);
        }
    }

    public final void z0() {
        h0 h0VarB;
        i0 i0Var = (i0) D.get(this);
        if (i0Var == null || bu.v.f2992b.get(i0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (i0Var) {
                try {
                    h0[] h0VarArr = i0Var.f2993a;
                    h0 h0Var = h0VarArr != null ? h0VarArr[0] : null;
                    if (h0Var != null) {
                        h0VarB = ((jNanoTime - h0Var.f24622a) > 0L ? 1 : ((jNanoTime - h0Var.f24622a) == 0L ? 0 : -1)) >= 0 ? A0(h0Var) : false ? i0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (h0VarB != null);
    }
}
