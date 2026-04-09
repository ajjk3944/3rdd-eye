package xk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p0 extends q0 implements b0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37220h = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37221i = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // xk.b0
    public final void A(long j, h hVar) {
        long j8 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j8 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            l0 l0Var = new l0(this, j8 + jNanoTime, hVar);
            i0(jNanoTime, l0Var);
            hVar.v(new e(2, l0Var));
        }
    }

    @Override // xk.b0
    public i0 F(long j, Runnable runnable, ck.h hVar) {
        return z.f37261a.F(j, runnable, hVar);
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        e0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // xk.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b0() {
        /*
            r10 = this;
            cl.u r0 = xk.x.f37252c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = xk.p0.g
            boolean r2 = r10.c0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.f0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof cl.n
            if (r6 == 0) goto L3e
            r6 = r2
            cl.n r6 = (cl.n) r6
            java.lang.Object r7 = r6.d()
            cl.u r8 = cl.n.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            cl.n r6 = r6.c()
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
            zj.l r2 = r10.f37228e
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
            boolean r2 = r1 instanceof cl.n
            if (r2 == 0) goto L8d
            cl.n r1 = (cl.n) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = cl.n.f2930f
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = xk.p0.f37220h
            java.lang.Object r0 = r0.get(r10)
            xk.o0 r0 = (xk.o0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            xk.n0[] r1 = r0.f2949a     // Catch: java.lang.Throwable -> La3
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
            long r0 = r5.f37208a
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
        throw new UnsupportedOperationException("Method not decompiled: xk.p0.b0():long");
    }

    public void e0(Runnable runnable) {
        f0();
        if (!g0(runnable)) {
            y.j.e0(runnable);
            return;
        }
        Thread threadZ = Z();
        if (Thread.currentThread() != threadZ) {
            LockSupport.unpark(threadZ);
        }
    }

    public final void f0() {
        n0 n0VarC;
        o0 o0Var = (o0) f37220h.get(this);
        if (o0Var == null || cl.y.f2948b.get(o0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (o0Var) {
                try {
                    n0[] n0VarArr = o0Var.f2949a;
                    n0 n0Var = n0VarArr != null ? n0VarArr[0] : null;
                    if (n0Var != null) {
                        n0VarC = ((jNanoTime - n0Var.f37208a) > 0L ? 1 : ((jNanoTime - n0Var.f37208a) == 0L ? 0 : -1)) >= 0 ? g0(n0Var) : false ? o0Var.c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (n0VarC != null);
    }

    public final boolean g0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f37221i.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof cl.n)) {
                        if (obj != x.f37252c) {
                            cl.n nVar = new cl.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    cl.n nVar2 = (cl.n) obj;
                    int iA = nVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        cl.n nVarC = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h0() {
        /*
            r7 = this;
            zj.l r0 = r7.f37228e
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = xk.p0.f37220h
            java.lang.Object r0 = r0.get(r7)
            xk.o0 r0 = (xk.o0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = cl.y.f2948b
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = xk.p0.g
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof cl.n
            if (r3 == 0) goto L4f
            cl.n r0 = (cl.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = cl.n.f2930f
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
            cl.u r3 = xk.x.f37252c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.p0.h0():boolean");
    }

    public final void i0(long j, n0 n0Var) {
        int iD;
        Thread threadZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37220h;
        if (f37221i.get(this) == 1) {
            iD = 1;
        } else {
            o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
            if (o0Var == null) {
                o0 o0Var2 = new o0();
                o0Var2.f37216c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, o0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                nk.k.b(obj);
                o0Var = (o0) obj;
            }
            iD = n0Var.d(j, o0Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                d0(j, n0Var);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        o0 o0Var3 = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var3 != null) {
            synchronized (o0Var3) {
                n0[] n0VarArr = o0Var3.f2949a;
                n0Var = n0VarArr != null ? n0VarArr[0] : null;
            }
        }
        if (n0Var != n0Var || Thread.currentThread() == (threadZ = Z())) {
            return;
        }
        LockSupport.unpark(threadZ);
    }

    @Override // xk.q0
    public void shutdown() {
        n0 n0VarC;
        n1.f37210a.set(null);
        f37221i.set(this, 1);
        cl.u uVar = x.f37252c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof cl.n)) {
                    if (obj != uVar) {
                        cl.n nVar = new cl.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((cl.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (b0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            o0 o0Var = (o0) f37220h.get(this);
            if (o0Var == null) {
                return;
            }
            synchronized (o0Var) {
                n0VarC = cl.y.f2948b.get(o0Var) > 0 ? o0Var.c(0) : null;
            }
            if (n0VarC == null) {
                return;
            } else {
                d0(jNanoTime, n0VarC);
            }
        }
    }
}
