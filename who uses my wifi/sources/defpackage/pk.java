package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pk implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(pk.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(pk.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(pk.class, "_isTerminated$volatile");
    public static final gs3 p = new gs3("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final bz j;
    public final bz k;
    public final sp0 l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public pk(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.j = new bz();
        this.k = new bz();
        this.l = new sp0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.l) {
            try {
                if (o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = n;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f) {
                    return 0;
                }
                if (i >= this.g) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.l.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                nk nkVar = new nk(this, i3);
                this.l.c(i3, nkVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                nkVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, h80 h80Var) {
        j01 n01Var;
        ok okVar;
        o01.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j01) {
            n01Var = (j01) runnable;
            n01Var.f = jNanoTime;
            n01Var.g = h80Var;
        } else {
            n01Var = new n01(runnable, jNanoTime, h80Var);
        }
        boolean z = n01Var.g.g == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long jAddAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        nk nkVar = threadCurrentThread instanceof nk ? (nk) threadCurrentThread : null;
        if (nkVar == null || !i30.c(nkVar.m, this)) {
            nkVar = null;
        }
        if (nkVar != null && (okVar = nkVar.h) != ok.j && (n01Var.g.g != 0 || okVar != ok.g)) {
            nkVar.l = true;
            ma1 ma1Var = nkVar.f;
            ma1Var.getClass();
            n01Var = (j01) ma1.b.getAndSet(ma1Var, n01Var);
            if (n01Var == null) {
                n01Var = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = ma1Var.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ma1.c;
                if (atomicIntegerFieldUpdater.get(ma1Var) - ma1.d.get(ma1Var) != 127) {
                    if (n01Var.g.g == 1) {
                        ma1.e.incrementAndGet(ma1Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(ma1Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, n01Var);
                    atomicIntegerFieldUpdater.incrementAndGet(ma1Var);
                    n01Var = null;
                }
            }
        }
        if (n01Var != null) {
            if (!(n01Var.g.g == 1 ? this.k.a(n01Var) : this.j.a(n01Var))) {
                throw new RejectedExecutionException(ex0.k(new StringBuilder(), this.i, " was terminated"));
            }
        }
        if (z) {
            if (h() || g(jAddAndGet)) {
                return;
            }
            h();
            return;
        }
        if (h() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.pk.o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.nk
            r3 = 0
            if (r1 == 0) goto L17
            nk r0 = (defpackage.nk) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            pk r1 = r0.m
            boolean r1 = defpackage.i30.c(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            sp0 r1 = r8.l
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.pk.n     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            sp0 r5 = r8.l
            java.lang.Object r5 = r5.b(r1)
            defpackage.i30.j(r5)
            nk r5 = (defpackage.nk) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            ma1 r5 = r5.f
            bz r6 = r8.k
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.ma1.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            j01 r7 = (defpackage.j01) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            j01 r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            bz r1 = r8.k
            r1.b()
            bz r1 = r8.j
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            j01 r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            bz r1 = r8.j
            java.lang.Object r1 = r1.d()
            j01 r1 = (defpackage.j01) r1
            if (r1 != 0) goto Lb2
            bz r1 = r8.k
            java.lang.Object r1 = r1.d()
            j01 r1 = (defpackage.j01) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            ok r1 = defpackage.ok.j
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.pk.m
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.pk.n
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, o01.g);
    }

    public final void f(nk nkVar, int i, int i2) {
        while (true) {
            long j = m.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = nkVar.c();
                    while (true) {
                        if (objC == p) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        nk nkVar2 = (nk) objC;
                        int iB = nkVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = nkVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (m.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean g(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        gs3 gs3Var;
        int iB;
        while (true) {
            long j = m.get(this);
            nk nkVar = (nk) this.l.b((int) (2097151 & j));
            if (nkVar == null) {
                nkVar = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = nkVar.c();
                while (true) {
                    gs3Var = p;
                    if (objC == gs3Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    nk nkVar2 = (nk) objC;
                    iB = nkVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = nkVar2.c();
                }
                if (iB >= 0) {
                    if (m.compareAndSet(this, j, iB | j2)) {
                        nkVar.g(gs3Var);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (nkVar == null) {
                return false;
            }
            if (nk.n.compareAndSet(nkVar, -1, 0)) {
                LockSupport.unpark(nkVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        sp0 sp0Var = this.l;
        int iA = sp0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            nk nkVar = (nk) sp0Var.b(i6);
            if (nkVar != null) {
                ma1 ma1Var = nkVar.f;
                ma1Var.getClass();
                int i7 = ma1.b.get(ma1Var) != null ? (ma1.c.get(ma1Var) - ma1.d.get(ma1Var)) + 1 : ma1.c.get(ma1Var) - ma1.d.get(ma1Var);
                int iOrdinal = nkVar.h.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i5++;
                }
            }
        }
        long j = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(um.k(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
