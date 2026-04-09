package I9;

import A9.I;
import F9.u;
import F9.y;
import N7.C1094a9;
import N7.H7;
import g0.C4356c;
import i9.InterfaceC4463a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.w;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2604j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2605k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final y f2606l = new y("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2608c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2610e;

    /* renamed from: f, reason: collision with root package name */
    public final d f2611f;

    /* renamed from: g, reason: collision with root package name */
    public final d f2612g;

    /* renamed from: h, reason: collision with root package name */
    public final u<b> f2613h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: I9.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0045a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2614a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2614a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class b extends Thread {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f2615j = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

        /* renamed from: b, reason: collision with root package name */
        public final m f2616b;

        /* renamed from: c, reason: collision with root package name */
        public final w<h> f2617c;

        /* renamed from: d, reason: collision with root package name */
        public c f2618d;

        /* renamed from: e, reason: collision with root package name */
        public long f2619e;

        /* renamed from: f, reason: collision with root package name */
        public long f2620f;

        /* renamed from: g, reason: collision with root package name */
        public int f2621g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2622h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public b() {
            throw null;
        }

        public b(int i) {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f2616b = new m();
            this.f2617c = new w<>();
            this.f2618d = c.DORMANT;
            this.nextParkedWorker = a.f2606l;
            int iNanoTime = (int) System.nanoTime();
            this.f2621g = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            r13 = I9.m.f2643d.get(r3);
            r0 = I9.m.f2642c.get(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r13 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (I9.m.f2644e.get(r3) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        
            r0 = r0 - 1;
            r1 = r3.c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            r2 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final I9.h a(boolean r13) {
            /*
                r12 = this;
                I9.a$c r0 = r12.f2618d
                I9.a$c r1 = I9.a.c.CPU_ACQUIRED
                r2 = 0
                I9.m r3 = r12.f2616b
                r4 = 1
                I9.a r5 = I9.a.this
                if (r0 != r1) goto Le
                goto L8a
            Le:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = I9.a.f2604j
            L10:
                I9.a r7 = I9.a.this
                long r8 = r0.get(r7)
                r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r10 = r10 & r8
                r1 = 42
                long r10 = r10 >> r1
                int r1 = (int) r10
                if (r1 != 0) goto L77
                r3.getClass()
            L25:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = I9.m.f2641b
                java.lang.Object r0 = r13.get(r3)
                I9.h r0 = (I9.h) r0
                if (r0 != 0) goto L30
                goto L45
            L30:
                I9.i r1 = r0.f2629c
                int r1 = r1.f2630a
                if (r1 != r4) goto L45
            L36:
                boolean r1 = r13.compareAndSet(r3, r0, r2)
                if (r1 == 0) goto L3e
                r2 = r0
                goto L65
            L3e:
                java.lang.Object r1 = r13.get(r3)
                if (r1 == r0) goto L36
                goto L25
            L45:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = I9.m.f2643d
                int r13 = r13.get(r3)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = I9.m.f2642c
                int r0 = r0.get(r3)
            L51:
                if (r13 == r0) goto L65
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = I9.m.f2644e
                int r1 = r1.get(r3)
                if (r1 != 0) goto L5c
                goto L65
            L5c:
                int r0 = r0 + (-1)
                I9.h r1 = r3.c(r0, r4)
                if (r1 == 0) goto L51
                r2 = r1
            L65:
                if (r2 != 0) goto L76
                I9.d r13 = r5.f2612g
                java.lang.Object r13 = r13.d()
                I9.h r13 = (I9.h) r13
                if (r13 != 0) goto L75
                I9.h r13 = r12.i(r4)
            L75:
                return r13
            L76:
                return r2
            L77:
                r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r10 = r8 - r10
                java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = I9.a.f2604j
                boolean r1 = r6.compareAndSet(r7, r8, r10)
                if (r1 == 0) goto L10
                I9.a$c r0 = I9.a.c.CPU_ACQUIRED
                r12.f2618d = r0
            L8a:
                if (r13 == 0) goto Lbe
                int r13 = r5.f2607b
                int r13 = r13 * 2
                int r13 = r12.d(r13)
                if (r13 != 0) goto L97
                goto L98
            L97:
                r4 = 0
            L98:
                if (r4 == 0) goto La1
                I9.h r13 = r12.e()
                if (r13 == 0) goto La1
                return r13
            La1:
                r3.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = I9.m.f2641b
                java.lang.Object r13 = r13.getAndSet(r3, r2)
                I9.h r13 = (I9.h) r13
                if (r13 != 0) goto Lb2
                I9.h r13 = r3.b()
            Lb2:
                if (r13 == 0) goto Lb5
                return r13
            Lb5:
                if (r4 != 0) goto Lc5
                I9.h r13 = r12.e()
                if (r13 == 0) goto Lc5
                return r13
            Lbe:
                I9.h r13 = r12.e()
                if (r13 == 0) goto Lc5
                return r13
            Lc5:
                r13 = 3
                I9.h r13 = r12.i(r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.a.b.a(boolean):I9.h");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i10 = this.f2621g;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.f2621g = i13;
            int i14 = i - 1;
            return (i14 & i) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i;
        }

        public final h e() {
            int iD = d(2);
            a aVar = a.this;
            if (iD == 0) {
                h hVarD = aVar.f2611f.d();
                return hVarD != null ? hVarD : aVar.f2612g.d();
            }
            h hVarD2 = aVar.f2612g.d();
            return hVarD2 != null ? hVarD2 : aVar.f2611f.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f2610e);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(c cVar) {
            c cVar2 = this.f2618d;
            boolean z10 = cVar2 == c.CPU_ACQUIRED;
            if (z10) {
                a.f2604j.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f2618d = cVar;
            }
            return z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
        
            r7 = -2;
            r23 = r6;
            r5 = r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [I9.h, T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v14, types: [I9.h] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [I9.h] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final I9.h i(int r26) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.a.b.i(int):I9.h");
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.a.b.run():void");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoroutineScheduler.kt */
    public static final class c {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c CPU_ACQUIRED = new c("CPU_ACQUIRED", 0);
        public static final c BLOCKING = new c("BLOCKING", 1);
        public static final c PARKING = new c("PARKING", 2);
        public static final c DORMANT = new c("DORMANT", 3);
        public static final c TERMINATED = new c("TERMINATED", 4);

        private static final /* synthetic */ c[] $values() {
            return new c[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
        }

        private c(String str, int i) {
        }

        public static InterfaceC4463a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public a(int i10, int i11, String str, long j4) {
        this.f2607b = i10;
        this.f2608c = i11;
        this.f2609d = j4;
        this.f2610e = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(C4356c.i(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(H7.n(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(C4356c.i(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f2611f = new d();
        this.f2612g = new d();
        this.f2613h = new u<>((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void e(a aVar, Runnable runnable, int i10) {
        aVar.c(runnable, k.f2638g, (i10 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f2613h) {
            try {
                if (f2605k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2604j;
                long j4 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j4 & 2097151);
                int i11 = i10 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f2607b) {
                    return 0;
                }
                if (i10 >= this.f2608c) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f2613h.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(i12);
                this.f2613h.c(i12, bVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                bVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, i iVar, boolean z10) {
        h jVar;
        c cVar;
        k.f2637f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f2628b = jNanoTime;
            jVar.f2629c = iVar;
        } else {
            jVar = new j(runnable, jNanoTime, iVar);
        }
        boolean z11 = false;
        boolean z12 = jVar.f2629c.f2630a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2604j;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !kotlin.jvm.internal.l.b(a.this, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f2618d) != c.TERMINATED && (jVar.f2629c.f2630a != 0 || cVar != c.BLOCKING)) {
            bVar.f2622h = true;
            m mVar = bVar.f2616b;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f2641b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f2629c.f2630a == 1 ? this.f2612g.a(jVar) : this.f2611f.a(jVar))) {
                throw new RejectedExecutionException(B4.f.c(new StringBuilder(), this.f2610e, " was terminated"));
            }
        }
        if (z10 && bVar != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || n() || l(jAddAndGet)) {
                return;
            }
            n();
            return;
        }
        if (z11 || n() || l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = I9.a.f2605k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof I9.a.b
            r3 = 0
            if (r1 == 0) goto L17
            I9.a$b r0 = (I9.a.b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            I9.a r1 = I9.a.this
            boolean r1 = kotlin.jvm.internal.l.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            F9.u<I9.a$b> r1 = r8.f2613h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = I9.a.f2604j     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            F9.u<I9.a$b> r5 = r8.f2613h
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.l.c(r5)
            I9.a$b r5 = (I9.a.b) r5
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
            I9.m r5 = r5.f2616b
            I9.d r6 = r8.f2612g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = I9.m.f2641b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            I9.h r7 = (I9.h) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            I9.h r7 = r5.b()
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
            I9.d r1 = r8.f2612g
            r1.b()
            I9.d r1 = r8.f2611f
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            I9.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            I9.d r1 = r8.f2611f
            java.lang.Object r1 = r1.d()
            I9.h r1 = (I9.h) r1
            if (r1 != 0) goto Lb2
            I9.d r1 = r8.f2612g
            java.lang.Object r1 = r1.d()
            I9.h r1 = (I9.h) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            I9.a$c r1 = I9.a.c.TERMINATED
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = I9.a.i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = I9.a.f2604j
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
        throw new UnsupportedOperationException("Method not decompiled: I9.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void k(b bVar, int i10, int i11) {
        while (true) {
            long j4 = i.get(this);
            int i12 = (int) (2097151 & j4);
            long j10 = (2097152 + j4) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == f2606l) {
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
                if (i.compareAndSet(this, j4, i12 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean l(long j4) {
        int i10 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f2607b;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        y yVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long j4 = atomicLongFieldUpdater.get(this);
            b bVarB = this.f2613h.b((int) (2097151 & j4));
            if (bVarB == null) {
                bVarB = null;
            } else {
                long j10 = (2097152 + j4) & (-2097152);
                Object objC = bVarB.c();
                while (true) {
                    yVar = f2606l;
                    if (objC == yVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar = (b) objC;
                    iB = bVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j10 | iB)) {
                    bVarB.g(yVar);
                }
            }
            if (bVarB == null) {
                return false;
            }
            if (b.f2615j.compareAndSet(bVarB, -1, 0)) {
                LockSupport.unpark(bVarB);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        u<b> uVar = this.f2613h;
        int iA = uVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            b bVarB = uVar.b(i15);
            if (bVarB != null) {
                m mVar = bVarB.f2616b;
                mVar.getClass();
                int i16 = m.f2641b.get(mVar) != null ? (m.f2642c.get(mVar) - m.f2643d.get(mVar)) + 1 : m.f2642c.get(mVar) - m.f2643d.get(mVar);
                int i17 = C0045a.f2614a[bVarB.f2618d.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i17 == 5) {
                    i14++;
                }
            }
        }
        long j4 = f2604j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2610e);
        sb4.append('@');
        sb4.append(I.x(this));
        sb4.append("[Pool Size {core = ");
        int i18 = this.f2607b;
        sb4.append(i18);
        sb4.append(", max = ");
        C1094a9.k(sb4, this.f2608c, "}, Worker States {CPU = ", i10, ", blocking = ");
        C1094a9.k(sb4, i11, ", parked = ", i12, ", dormant = ");
        C1094a9.k(sb4, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2611f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2612g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i18 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
