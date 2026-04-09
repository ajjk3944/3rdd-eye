package G5;

import E5.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import z5.AbstractC3046w;

/* loaded from: classes3.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1695h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1696j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final B2.a f1697k = new B2.a("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f1698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1700c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f1701d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1702e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1703f;

    /* renamed from: g, reason: collision with root package name */
    public final r f1704g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i3, long j6, int i6, String str) {
        this.f1698a = i3;
        this.f1699b = i6;
        this.f1700c = j6;
        this.f1701d = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(A.f.h(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i6 < i3) {
            throw new IllegalArgumentException(A.f.g(i6, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i6 > 2097150) {
            throw new IllegalArgumentException(A.f.h(i6, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f1702e = new f();
        this.f1703f = new f();
        this.f1704g = new r((i3 + 1) * 2);
        this.controlState$volatile = i3 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f1704g) {
            try {
                if (f1696j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j6 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j6 & 2097151);
                int i6 = i3 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= this.f1698a) {
                    return 0;
                }
                if (i3 >= this.f1699b) {
                    return 0;
                }
                int i7 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i7 <= 0 || this.f1704g.b(i7) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i7);
                this.f1704g.c(i7, aVar);
                if (i7 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i8 = i6 + 1;
                aVar.start();
                return i8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, V0.m mVar) {
        i jVar;
        b bVar;
        k.f1718f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f1710a = jNanoTime;
            jVar.f1711b = mVar;
        } else {
            jVar = new j(runnable, jNanoTime, mVar);
        }
        boolean z6 = jVar.f1711b.f3830b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !q5.i.a(aVar.f1688h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f1683c) != b.f1693e && (jVar.f1711b.f3830b != 0 || bVar != b.f1690b)) {
            aVar.f1687g = true;
            m mVar2 = aVar.f1681a;
            mVar2.getClass();
            jVar = (i) m.f1722b.getAndSet(mVar2, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar2.f1726a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f1723c;
                if (atomicIntegerFieldUpdater.get(mVar2) - m.f1724d.get(mVar2) != 127) {
                    if (jVar.f1711b.f3830b == 1) {
                        m.f1725e.incrementAndGet(mVar2);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(mVar2) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar2);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f1711b.f3830b == 1 ? this.f1703f.a(jVar) : this.f1702e.a(jVar))) {
                throw new RejectedExecutionException(A.f.p(new StringBuilder(), this.f1701d, " was terminated"));
            }
        }
        if (z6) {
            if (h() || e(jAddAndGet)) {
                return;
            }
            h();
            return;
        }
        if (h() || e(atomicLongFieldUpdater.get(this))) {
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = G5.c.f1696j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof G5.a
            r3 = 0
            if (r1 == 0) goto L17
            G5.a r0 = (G5.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            G5.c r1 = r0.f1688h
            boolean r1 = q5.i.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            E5.r r1 = r8.f1704g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = G5.c.i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            E5.r r5 = r8.f1704g
            java.lang.Object r5 = r5.b(r1)
            q5.i.b(r5)
            G5.a r5 = (G5.a) r5
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
            G5.m r5 = r5.f1681a
            G5.f r6 = r8.f1703f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = G5.m.f1722b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            G5.i r7 = (G5.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            G5.i r7 = r5.a()
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
            G5.f r1 = r8.f1703f
            r1.b()
            G5.f r1 = r8.f1702e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            G5.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            G5.f r1 = r8.f1702e
            java.lang.Object r1 = r1.d()
            G5.i r1 = (G5.i) r1
            if (r1 != 0) goto Lb2
            G5.f r1 = r8.f1703f
            java.lang.Object r1 = r1.d()
            G5.i r1 = (G5.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            G5.b r1 = G5.b.f1693e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = G5.c.f1695h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = G5.c.i
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
        throw new UnsupportedOperationException("Method not decompiled: G5.c.close():void");
    }

    public final void d(a aVar, int i3, int i6) {
        while (true) {
            long j6 = f1695h.get(this);
            int i7 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & (-2097152);
            if (i7 == i3) {
                if (i6 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f1697k) {
                            i7 = -1;
                            break;
                        }
                        if (objC == null) {
                            i7 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i7 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i7 = i6;
                }
            }
            if (i7 >= 0) {
                if (f1695h.compareAndSet(this, j6, i7 | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j6) {
        int i3 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i6 = this.f1698a;
        if (i3 < i6) {
            int iA = a();
            if (iA == 1 && i6 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f1719g);
    }

    public final boolean h() {
        B2.a aVar;
        int iB;
        while (true) {
            long j6 = f1695h.get(this);
            a aVar2 = (a) this.f1704g.b((int) (2097151 & j6));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j7 = (2097152 + j6) & (-2097152);
                Object objC = aVar2.c();
                while (true) {
                    aVar = f1697k;
                    if (objC == aVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar3 = (a) objC;
                    iB = aVar3.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar3.c();
                }
                if (iB >= 0) {
                    if (f1695h.compareAndSet(this, j6, iB | j7)) {
                        aVar2.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.i.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f1704g;
        int iA = rVar.a();
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < iA; i10++) {
            a aVar = (a) rVar.b(i10);
            if (aVar != null) {
                m mVar = aVar.f1681a;
                mVar.getClass();
                int i11 = m.f1722b.get(mVar) != null ? (m.f1723c.get(mVar) - m.f1724d.get(mVar)) + 1 : m.f1723c.get(mVar) - m.f1724d.get(mVar);
                int iOrdinal = aVar.f1683c.ordinal();
                if (iOrdinal == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i11);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i6++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i7++;
                } else if (iOrdinal == 3) {
                    i8++;
                    if (i11 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i11);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i9++;
                }
            }
        }
        long j6 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1701d);
        sb4.append('@');
        sb4.append(AbstractC3046w.h(this));
        sb4.append("[Pool Size {core = ");
        int i12 = this.f1698a;
        sb4.append(i12);
        sb4.append(", max = ");
        sb4.append(this.f1699b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i6);
        sb4.append(", parked = ");
        sb4.append(i7);
        sb4.append(", dormant = ");
        sb4.append(i8);
        sb4.append(", terminated = ");
        sb4.append(i9);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1702e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1703f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i12 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
