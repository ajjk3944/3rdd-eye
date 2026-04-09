package du;

import bu.p;
import bu.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import wt.w;

/* loaded from: classes.dex */
public final class d implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");
    public static final t G = new t("NOT_IN_STACK", 0);
    public final p B;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f7564a;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f7565d;

    /* renamed from: g, reason: collision with root package name */
    public final long f7566g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final String f7567r;

    /* renamed from: x, reason: collision with root package name */
    public final g f7568x;

    /* renamed from: y, reason: collision with root package name */
    public final g f7569y;

    public d(String str, int i10, long j, int i11) {
        this.f7564a = i10;
        this.f7565d = i11;
        this.f7566g = j;
        this.f7567r = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(h0.b.m("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(h0.b.l("Max pool size ", i11, i10, " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(h0.b.m("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7568x = new g();
        this.f7569y = new g();
        this.B = new p((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void h(d dVar, Runnable runnable, int i10) {
        dVar.f(runnable, false, (i10 & 4) == 0);
    }

    public final int b() {
        synchronized (this.B) {
            try {
                if (F.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = E;
                long j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j & 2097151);
                int i11 = i10 - ((int) ((j & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f7564a) {
                    return 0;
                }
                if (i10 >= this.f7565d) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.B.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(this, i12);
                this.B.c(i12, bVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                bVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = du.d.F
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof du.b
            r3 = 0
            if (r1 == 0) goto L17
            du.b r0 = (du.b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            du.d r1 = r0.D
            boolean r1 = br.l.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            bu.p r1 = r8.B
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = du.d.E     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            bu.p r5 = r8.B
            java.lang.Object r5 = r5.b(r1)
            br.l.b(r5)
            du.b r5 = (du.b) r5
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
            du.n r5 = r5.f7558a
            du.g r6 = r8.f7569y
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = du.n.f7585b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            du.j r7 = (du.j) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            du.j r7 = r5.b()
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
            du.g r1 = r8.f7569y
            r1.b()
            du.g r1 = r8.f7568x
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            du.j r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            du.g r1 = r8.f7568x
            java.lang.Object r1 = r1.d()
            du.j r1 = (du.j) r1
            if (r1 != 0) goto Lb2
            du.g r1 = r8.f7569y
            java.lang.Object r1 = r1.d()
            du.j r1 = (du.j) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            du.c r1 = du.c.TERMINATED
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = du.d.D
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = du.d.E
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
        throw new UnsupportedOperationException("Method not decompiled: du.d.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, 6);
    }

    public final void f(Runnable runnable, boolean z10, boolean z11) {
        j kVar;
        c cVar;
        l.f7583f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f7575a = jNanoTime;
            kVar.f7576d = z10;
        } else {
            kVar = new k(runnable, jNanoTime, z10);
        }
        boolean z12 = kVar.f7576d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !br.l.a(bVar.D, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f7560g) != c.TERMINATED && (kVar.f7576d || cVar != c.BLOCKING)) {
            bVar.B = true;
            n nVar = bVar.f7558a;
            if (z11) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f7585b.getAndSet(nVar, kVar);
                kVar = jVar == null ? null : nVar.a(jVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f7576d ? this.f7569y.a(kVar) : this.f7568x.a(kVar))) {
                throw new RejectedExecutionException(w.g.j(new StringBuilder(), this.f7567r, " was terminated"));
            }
        }
        boolean z13 = z11 && bVar != null;
        if (z12) {
            if (z13 || w() || q(jAddAndGet)) {
                return;
            }
            w();
            return;
        }
        if (z13 || w() || q(atomicLongFieldUpdater.get(this))) {
            return;
        }
        w();
    }

    public final void i(b bVar, int i10, int i11) {
        while (true) {
            long j = D.get(this);
            int i12 = (int) (2097151 & j);
            long j7 = (2097152 + j) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == G) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        b bVar2 = (b) objC;
                        int iB = bVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = bVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (D.compareAndSet(this, j, i12 | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean q(long j) {
        int i10 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f7564a;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.B;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            b bVar = (b) pVar.b(i15);
            if (bVar != null) {
                n nVar = bVar.f7558a;
                nVar.getClass();
                int i16 = n.f7585b.get(nVar) != null ? (n.f7586c.get(nVar) - n.f7587d.get(nVar)) + 1 : n.f7586c.get(nVar) - n.f7587d.get(nVar);
                int i17 = a.f7557a[bVar.f7560g.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new bf.n();
                    }
                    i14++;
                }
            }
        }
        long j = E.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7567r);
        sb5.append('@');
        sb5.append(w.l(this));
        sb5.append("[Pool Size {core = ");
        int i18 = this.f7564a;
        sb5.append(i18);
        sb5.append(", max = ");
        sb5.append(this.f7565d);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f7568x.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f7569y.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i18 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean w() {
        t tVar;
        int iB;
        while (true) {
            long j = D.get(this);
            b bVar = (b) this.B.b((int) (2097151 & j));
            if (bVar == null) {
                bVar = null;
            } else {
                long j7 = (2097152 + j) & (-2097152);
                Object objC = bVar.c();
                while (true) {
                    tVar = G;
                    if (objC == tVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar2 = (b) objC;
                    iB = bVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar2.c();
                }
                if (iB >= 0) {
                    if (D.compareAndSet(this, j, iB | j7)) {
                        bVar.g(tVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.E.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }
}
