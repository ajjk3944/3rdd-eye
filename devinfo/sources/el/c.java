package el;

import cl.q;
import cl.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23552h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23553i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final u f23554k = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f23555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23557c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f23558d;

    /* renamed from: e, reason: collision with root package name */
    public final f f23559e;

    /* renamed from: f, reason: collision with root package name */
    public final f f23560f;
    public final q g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i4, long j8, int i10, String str) {
        this.f23555a = i4;
        this.f23556b = i10;
        this.f23557c = j8;
        this.f23558d = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(r5.c.h(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i4) {
            throw new IllegalArgumentException(a0.g.i(i10, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(r5.c.h(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f23559e = new f();
        this.f23560f = new f();
        this.g = new q((i4 + 1) * 2);
        this.controlState$volatile = i4 << 42;
    }

    public static /* synthetic */ void g(c cVar, Runnable runnable, int i4) {
        cVar.e(runnable, false, (i4 & 4) == 0);
    }

    public final int c() {
        synchronized (this.g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f23553i;
                long j8 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j8 & 2097151);
                int i10 = i4 - ((int) ((j8 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f23555a) {
                    return 0;
                }
                if (i4 >= this.f23556b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.g.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = el.c.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof el.a
            r3 = 0
            if (r1 == 0) goto L17
            el.a r0 = (el.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            el.c r1 = r0.f23545h
            boolean r1 = nk.k.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            cl.q r1 = r8.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = el.c.f23553i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            cl.q r5 = r8.g
            java.lang.Object r5 = r5.b(r1)
            nk.k.b(r5)
            el.a r5 = (el.a) r5
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
            el.m r5 = r5.f23539a
            el.f r6 = r8.f23560f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = el.m.f23576b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            el.i r7 = (el.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            el.i r7 = r5.b()
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
            el.f r1 = r8.f23560f
            r1.b()
            el.f r1 = r8.f23559e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            el.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            el.f r1 = r8.f23559e
            java.lang.Object r1 = r1.d()
            el.i r1 = (el.i) r1
            if (r1 != 0) goto Lb2
            el.f r1 = r8.f23560f
            java.lang.Object r1 = r1.d()
            el.i r1 = (el.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            el.b r1 = el.b.f23550e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = el.c.f23552h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = el.c.f23553i
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
        throw new UnsupportedOperationException("Method not decompiled: el.c.close():void");
    }

    public final void e(Runnable runnable, boolean z3, boolean z10) {
        i jVar;
        b bVar;
        k.f23574f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f23566a = jNanoTime;
            jVar.f23567b = z3;
        } else {
            jVar = new j(runnable, jNanoTime, z3);
        }
        boolean z11 = jVar.f23567b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23553i;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !nk.k.a(aVar.f23545h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f23541c) != b.f23550e && (jVar.f23567b || bVar != b.f23547b)) {
            aVar.g = true;
            m mVar = aVar.f23539a;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f23576b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f23567b ? this.f23560f.a(jVar) : this.f23559e.a(jVar))) {
                throw new RejectedExecutionException(d.h.w(new StringBuilder(), this.f23558d, " was terminated"));
            }
        }
        if (z11) {
            if (v() || p(jAddAndGet)) {
                return;
            }
            v();
            return;
        }
        if (v() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        v();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void m(a aVar, int i4, int i10) {
        while (true) {
            long j8 = f23552h.get(this);
            int i11 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (i11 == i4) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f23554k) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f23552h.compareAndSet(this, j8, i11 | j9)) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j8) {
        int i4 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i10 = this.f23555a;
        if (i4 < i10) {
            int iC = c();
            if (iC == 1 && i10 > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.g;
        int iA = qVar.a();
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) qVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f23539a;
                mVar.getClass();
                int i15 = m.f23576b.get(mVar) != null ? (m.f23577c.get(mVar) - m.f23578d.get(mVar)) + 1 : m.f23577c.get(mVar) - m.f23578d.get(mVar);
                int iOrdinal = aVar.f23541c.ordinal();
                if (iOrdinal == 0) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new ac.m();
                    }
                    i13++;
                }
            }
        }
        long j8 = f23553i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f23558d);
        sb5.append('@');
        sb5.append(x.n(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f23555a;
        sb5.append(i16);
        sb5.append(", max = ");
        je.u.x(this.f23556b, i4, "}, Worker States {CPU = ", ", blocking = ", sb5);
        je.u.x(i10, i11, ", parked = ", ", dormant = ", sb5);
        je.u.x(i12, i13, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f23559e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f23560f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j8));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j8) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean v() {
        u uVar;
        int iB;
        while (true) {
            long j8 = f23552h.get(this);
            a aVar = (a) this.g.b((int) (2097151 & j8));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (2097152 + j8) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    uVar = f23554k;
                    if (objC == uVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f23552h.compareAndSet(this, j8, iB | j9)) {
                        aVar.g(uVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f23538i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
