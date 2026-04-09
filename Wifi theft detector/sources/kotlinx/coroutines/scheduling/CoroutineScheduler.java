package kotlinx.coroutines.scheduling;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.random.Random;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.l0;
import org.jetbrains.annotations.Nullable;
import q9.e;
import w9.g;
import w9.h;
import w9.j;
import w9.k;
import w9.m;
import y8.s;

/* loaded from: classes4.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final a f22599h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22600i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22601j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22602k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f22603l = new c0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f22604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22606c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f22607d;

    /* renamed from: e, reason: collision with root package name */
    public final w9.c f22608e;

    /* renamed from: f, reason: collision with root package name */
    public final w9.c f22609f;

    /* renamed from: g, reason: collision with root package name */
    public final x f22610g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WorkerState {

        /* renamed from: a, reason: collision with root package name */
        public static final WorkerState f22611a = new WorkerState("CPU_ACQUIRED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final WorkerState f22612b = new WorkerState("BLOCKING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final WorkerState f22613c = new WorkerState("PARKING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final WorkerState f22614d = new WorkerState("DORMANT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final WorkerState f22615e = new WorkerState("TERMINATED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ WorkerState[] f22616f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ e9.a f22617g;

        static {
            WorkerState[] workerStateArrD = d();
            f22616f = workerStateArrD;
            f22617g = kotlin.enums.a.a(workerStateArrD);
        }

        public WorkerState(String str, int i10) {
        }

        public static final /* synthetic */ WorkerState[] d() {
            return new WorkerState[]{f22611a, f22612b, f22613c, f22614d, f22615e};
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f22616f.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22618a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.f22613c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.f22612b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.f22611a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.f22614d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.f22615e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f22618a = iArr;
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.f22604a = i10;
        this.f22605b = i11;
        this.f22606c = j10;
        this.f22607d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f22608e = new w9.c();
        this.f22609f = new w9.c();
        this.f22610g = new x((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ boolean b0(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f22601j.get(coroutineScheduler);
        }
        return coroutineScheduler.a0(j10);
    }

    public static /* synthetic */ void o(CoroutineScheduler coroutineScheduler, Runnable runnable, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = k.f24861g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.m(runnable, hVar, z10);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater p() {
        return f22601j;
    }

    public final c I() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22600i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f22610g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            int iT = t(cVar);
            if (iT >= 0 && f22600i.compareAndSet(this, j10, iT | j11)) {
                cVar.r(f22603l);
                return cVar;
            }
        }
    }

    public final boolean P(c cVar) {
        long j10;
        long j11;
        int iH;
        if (cVar.i() != f22603l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22600i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            iH = cVar.h();
            cVar.r(this.f22610g.b((int) (2097151 & j10)));
        } while (!f22600i.compareAndSet(this, j10, j11 | iH));
        return true;
    }

    public final void U(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f22600i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iT = (int) (2097151 & j10);
            long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            if (iT == i10) {
                iT = i11 == 0 ? t(cVar) : i11;
            }
            if (iT >= 0) {
                if (f22600i.compareAndSet(this, j10, j11 | iT)) {
                    return;
                }
            }
        }
    }

    public final void V(g gVar) {
        try {
            gVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                kotlinx.coroutines.c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.l()
            kotlinx.coroutines.internal.x r1 = r7.f22610g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = d()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            kotlinx.coroutines.internal.x r4 = r7.f22610g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.p.b(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            w9.m r4 = r4.f22620a
            w9.c r5 = r7.f22609f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            w9.c r8 = r7.f22609f
            r8.b()
            w9.c r8 = r7.f22608e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            w9.g r8 = r0.g(r2)
            if (r8 != 0) goto L8b
        L5f:
            w9.c r8 = r7.f22608e
            java.lang.Object r8 = r8.e()
            w9.g r8 = (w9.g) r8
            if (r8 != 0) goto L8b
            w9.c r8 = r7.f22609f
            java.lang.Object r8 = r8.e()
            w9.g r8 = (w9.g) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f22615e
            r0.u(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = q()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = p()
            r8.set(r7, r0)
            return
        L8b:
            r7.V(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.W(long):void");
    }

    public final void X(long j10, boolean z10) {
        if (z10 || c0() || a0(j10)) {
            return;
        }
        c0();
    }

    public final void Y() {
        if (c0() || b0(this, 0L, 1, null)) {
            return;
        }
        c0();
    }

    public final g Z(c cVar, g gVar, boolean z10) {
        if (cVar == null || cVar.f22622c == WorkerState.f22615e) {
            return gVar;
        }
        if (gVar.f24852b.b() == 0 && cVar.f22622c == WorkerState.f22612b) {
            return gVar;
        }
        cVar.f22626g = true;
        return cVar.f22620a.a(gVar, z10);
    }

    public final boolean a0(long j10) {
        if (e.b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f22604a) {
            int iH = h();
            if (iH == 1 && this.f22604a > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c0() {
        c cVarI;
        do {
            cVarI = I();
            if (cVarI == null) {
                return false;
            }
        } while (!c.f22619i.compareAndSet(cVarI, -1, 0));
        LockSupport.unpark(cVarI);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        W(10000L);
    }

    public final boolean e(g gVar) {
        return gVar.f24852b.b() == 1 ? this.f22609f.a(gVar) : this.f22608e.a(gVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        o(this, runnable, null, false, 6, null);
    }

    public final int h() {
        synchronized (this.f22610g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f22601j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iB = e.b(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iB >= this.f22604a) {
                    return 0;
                }
                if (i10 >= this.f22605b) {
                    return 0;
                }
                int i11 = ((int) (p().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f22610g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f22610g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f22601j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iB + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isTerminated() {
        return f22602k.get(this) != 0;
    }

    public final g j(Runnable runnable, h hVar) {
        long jA = k.f24860f.a();
        if (!(runnable instanceof g)) {
            return new j(runnable, jA, hVar);
        }
        g gVar = (g) runnable;
        gVar.f24851a = jA;
        gVar.f24852b = hVar;
        return gVar;
    }

    public final c l() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !p.a(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void m(Runnable runnable, h hVar, boolean z10) {
        kotlinx.coroutines.c.a();
        g gVarJ = j(runnable, hVar);
        boolean z11 = false;
        boolean z12 = gVarJ.f24852b.b() == 1;
        long jAddAndGet = z12 ? f22601j.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) : 0L;
        c cVarL = l();
        g gVarZ = Z(cVarL, gVarJ, z10);
        if (gVarZ != null && !e(gVarZ)) {
            throw new RejectedExecutionException(this.f22607d + " was terminated");
        }
        if (z10 && cVarL != null) {
            z11 = true;
        }
        if (z12) {
            X(jAddAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            Y();
        }
    }

    public final int t(c cVar) {
        Object objI = cVar.i();
        while (objI != f22603l) {
            if (objI == null) {
                return 0;
            }
            c cVar2 = (c) objI;
            int iH = cVar2.h();
            if (iH != 0) {
                return iH;
            }
            objI = cVar2.i();
        }
        return -1;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f22610g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f22610g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f22620a.i();
                int i17 = b.f22618a[cVar.f22622c.ordinal()];
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
        long j10 = f22601j.get(this);
        return this.f22607d + '@' + l0.b(this) + "[Pool Size {core = " + this.f22604a + ", max = " + this.f22605b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f22608e.c() + ", global blocking queue size = " + this.f22609f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f22604a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f22619i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final m f22620a;

        /* renamed from: b, reason: collision with root package name */
        public final Ref$ObjectRef f22621b;

        /* renamed from: c, reason: collision with root package name */
        public WorkerState f22622c;

        /* renamed from: d, reason: collision with root package name */
        public long f22623d;

        /* renamed from: e, reason: collision with root package name */
        public long f22624e;

        /* renamed from: f, reason: collision with root package name */
        public int f22625f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22626g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f22620a = new m();
            this.f22621b = new Ref$ObjectRef();
            this.f22622c = WorkerState.f22614d;
            this.nextParkedWorker = CoroutineScheduler.f22603l;
            this.f22625f = Random.f22054a.g();
        }

        public final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            CoroutineScheduler.p().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f22622c != WorkerState.f22615e) {
                this.f22622c = WorkerState.f22614d;
            }
        }

        public final void c(int i10) {
            if (i10 != 0 && u(WorkerState.f22612b)) {
                CoroutineScheduler.this.Y();
            }
        }

        public final void d(g gVar) {
            int iB = gVar.f24852b.b();
            k(iB);
            c(iB);
            CoroutineScheduler.this.V(gVar);
            b(iB);
        }

        public final g e(boolean z10) {
            g gVarO;
            g gVarO2;
            if (z10) {
                boolean z11 = m(CoroutineScheduler.this.f22604a * 2) == 0;
                if (z11 && (gVarO2 = o()) != null) {
                    return gVarO2;
                }
                g gVarK = this.f22620a.k();
                if (gVarK != null) {
                    return gVarK;
                }
                if (!z11 && (gVarO = o()) != null) {
                    return gVarO;
                }
            } else {
                g gVarO3 = o();
                if (gVarO3 != null) {
                    return gVarO3;
                }
            }
            return v(3);
        }

        public final g f() {
            g gVarL = this.f22620a.l();
            if (gVarL != null) {
                return gVarL;
            }
            g gVar = (g) CoroutineScheduler.this.f22609f.e();
            return gVar == null ? v(1) : gVar;
        }

        public final g g(boolean z10) {
            return s() ? e(z10) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i10) {
            this.f22623d = 0L;
            if (this.f22622c == WorkerState.f22613c) {
                this.f22622c = WorkerState.f22612b;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != CoroutineScheduler.f22603l;
        }

        public final int m(int i10) {
            int i11 = this.f22625f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f22625f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void n() {
            if (this.f22623d == 0) {
                this.f22623d = System.nanoTime() + CoroutineScheduler.this.f22606c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f22606c);
            if (System.nanoTime() - this.f22623d >= 0) {
                this.f22623d = 0L;
                w();
            }
        }

        public final g o() {
            if (m(2) == 0) {
                g gVar = (g) CoroutineScheduler.this.f22608e.e();
                return gVar != null ? gVar : (g) CoroutineScheduler.this.f22609f.e();
            }
            g gVar2 = (g) CoroutineScheduler.this.f22609f.e();
            return gVar2 != null ? gVar2 : (g) CoroutineScheduler.this.f22608e.e();
        }

        public final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f22622c != WorkerState.f22615e) {
                    g gVarG = g(this.f22626g);
                    if (gVarG != null) {
                        this.f22624e = 0L;
                        d(gVarG);
                    } else {
                        this.f22626g = false;
                        if (this.f22624e == 0) {
                            t();
                        } else if (z10) {
                            u(WorkerState.f22613c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f22624e);
                            this.f22624e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            u(WorkerState.f22615e);
        }

        public final void q(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f22607d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j10;
            if (this.f22622c == WorkerState.f22611a) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterP = CoroutineScheduler.p();
            do {
                j10 = atomicLongFieldUpdaterP.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.p().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.f22622c = WorkerState.f22611a;
            return true;
        }

        public final void t() {
            if (!l()) {
                CoroutineScheduler.this.P(this);
                return;
            }
            f22619i.set(this, -1);
            while (l() && f22619i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f22622c != WorkerState.f22615e) {
                u(WorkerState.f22613c);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(WorkerState workerState) {
            WorkerState workerState2 = this.f22622c;
            boolean z10 = workerState2 == WorkerState.f22611a;
            if (z10) {
                CoroutineScheduler.p().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f22622c = workerState;
            }
            return z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final g v(int i10) {
            int i11 = (int) (CoroutineScheduler.p().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM = m(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM++;
                if (iM > i11) {
                    iM = 1;
                }
                c cVar = (c) coroutineScheduler.f22610g.b(iM);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f22620a.r(i10, this.f22621b);
                    if (jR == -1) {
                        Ref$ObjectRef ref$ObjectRef = this.f22621b;
                        g gVar = (g) ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return gVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f22624e = jMin;
            return null;
        }

        public final void w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f22610g) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.p().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f22604a) {
                        return;
                    }
                    if (f22619i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        q(0);
                        coroutineScheduler.U(this, i10, 0);
                        int andDecrement = (int) (2097151 & CoroutineScheduler.p().getAndDecrement(coroutineScheduler));
                        if (andDecrement != i10) {
                            Object objB = coroutineScheduler.f22610g.b(andDecrement);
                            p.b(objB);
                            c cVar = (c) objB;
                            coroutineScheduler.f22610g.c(i10, cVar);
                            cVar.q(i10);
                            coroutineScheduler.U(cVar, andDecrement, i10);
                        }
                        coroutineScheduler.f22610g.c(andDecrement, null);
                        s sVar = s.f25199a;
                        this.f22622c = WorkerState.f22615e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            q(i10);
        }
    }
}
