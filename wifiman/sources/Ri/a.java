package Ri;

import Ii.AbstractC3047c;
import Ii.S;
import Ni.C;
import Ni.x;
import Yg.J;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0724a f19955h = new C0724a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19956i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19957j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19958k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final C f19959l = new C("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f19960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19961b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19962c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f19963d;

    /* renamed from: e, reason: collision with root package name */
    public final Ri.d f19964e;

    /* renamed from: f, reason: collision with root package name */
    public final Ri.d f19965f;

    /* renamed from: g, reason: collision with root package name */
    public final x f19966g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: Ri.a$a, reason: collision with other inner class name */
    public static final class C0724a {
        public /* synthetic */ C0724a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0724a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19967a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19967a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d CPU_ACQUIRED = new d("CPU_ACQUIRED", 0);
        public static final d BLOCKING = new d("BLOCKING", 1);
        public static final d PARKING = new d("PARKING", 2);
        public static final d DORMANT = new d("DORMANT", 3);
        public static final d TERMINATED = new d("TERMINATED", 4);

        private static final /* synthetic */ d[] $values() {
            return new d[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            d[] dVarArr$values = $values();
            $VALUES = dVarArr$values;
            $ENTRIES = AbstractC5827b.a(dVarArr$values);
        }

        private d(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f19960a = i10;
        this.f19961b = i11;
        this.f19962c = j10;
        this.f19963d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f19964e = new Ri.d();
            this.f19965f = new Ri.d();
            this.f19966g = new x((i10 + 1) * 2);
            this.controlState$volatile = i10 << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater C() {
        return f19957j;
    }

    private final int T(c cVar) {
        Object objG = cVar.g();
        while (objG != f19959l) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final c Y() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19956i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f19966g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iT = T(cVar);
            if (iT >= 0 && f19956i.compareAndSet(this, j10, iT | j11)) {
                cVar.o(f19959l);
                return cVar;
            }
        }
    }

    private final boolean h(h hVar) {
        return hVar.f19987b ? this.f19965f.a(hVar) : this.f19964e.a(hVar);
    }

    private final int j() {
        synchronized (this.f19966g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f19957j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iD = AbstractC7978m.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iD >= this.f19960a) {
                    return 0;
                }
                if (i10 >= this.f19961b) {
                    return 0;
                }
                int i11 = ((int) (C().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f19966g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f19966g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f19957j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iD + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void n0(long j10) {
        if (s0() || q0(j10)) {
            return;
        }
        s0();
    }

    private final h p0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f19971c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f19987b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f19975g = true;
        return cVar.f19969a.a(hVar, z10);
    }

    private final boolean q0(long j10) {
        if (AbstractC7978m.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f19960a) {
            int iJ = j();
            if (iJ == 1 && this.f19960a > 1) {
                j();
            }
            if (iJ > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean r0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f19957j.get(aVar);
        }
        return aVar.q0(j10);
    }

    private final c s() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC6492s.d(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean s0() {
        c cVarY;
        do {
            cVarY = Y();
            if (cVarY == null) {
                return false;
            }
        } while (!c.f19968i.compareAndSet(cVarY, -1, 0));
        LockSupport.unpark(cVarY);
        return true;
    }

    public static /* synthetic */ void y(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.v(runnable, z10, z11);
    }

    public final boolean b0(c cVar) {
        long j10;
        int iF;
        if (cVar.g() != f19959l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19956i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f19966g.b((int) (2097151 & j10)));
        } while (!f19956i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | iF));
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m0(10000L);
    }

    public final void d0(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19956i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iT = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iT == i10) {
                iT = i11 == 0 ? T(cVar) : i11;
            }
            if (iT >= 0 && f19956i.compareAndSet(this, j10, j11 | iT)) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        y(this, runnable, false, false, 6, null);
    }

    public final void f0(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean isTerminated() {
        return f19958k.get(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = S()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            Ri.a$c r0 = r7.s()
            Ni.x r1 = r7.f19966g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            Ni.x r4 = r7.f19966g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.AbstractC6492s.f(r4)
            Ri.a$c r4 = (Ri.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            Ri.l r4 = r4.f19969a
            Ri.d r5 = r7.f19965f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            Ri.d r8 = r7.f19965f
            r8.b()
            Ri.d r8 = r7.f19964e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            Ri.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            Ri.d r8 = r7.f19964e
            java.lang.Object r8 = r8.e()
            Ri.h r8 = (Ri.h) r8
            if (r8 != 0) goto L8b
            Ri.d r8 = r7.f19965f
            java.lang.Object r8 = r8.e()
            Ri.h r8 = (Ri.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            Ri.a$d r8 = Ri.a.d.TERMINATED
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = J()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = C()
            r8.set(r7, r0)
            return
        L8b:
            r7.f0(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ri.a.m0(long):void");
    }

    public final void o0() {
        if (s0() || r0(this, 0L, 1, null)) {
            return;
        }
        s0();
    }

    public final h p(Runnable runnable, boolean z10) {
        long jA = j.f19994f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f19986a = jA;
        hVar.f19987b = z10;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f19966g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f19966g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f19969a.i();
                int i17 = b.f19967a[cVar.f19971c.ordinal()];
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
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f19957j.get(this);
        return this.f19963d + '@' + S.b(this) + "[Pool Size {core = " + this.f19960a + ", max = " + this.f19961b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f19964e.c() + ", global blocking queue size = " + this.f19965f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f19960a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void v(Runnable runnable, boolean z10, boolean z11) {
        AbstractC3047c.a();
        h hVarP = p(runnable, z10);
        boolean z12 = hVarP.f19987b;
        long jAddAndGet = z12 ? f19957j.addAndGet(this, 2097152L) : 0L;
        h hVarP0 = p0(s(), hVarP, z11);
        if (hVarP0 != null && !h(hVarP0)) {
            throw new RejectedExecutionException(this.f19963d + " was terminated");
        }
        if (z12) {
            n0(jAddAndGet);
        } else {
            o0();
        }
    }

    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f19968i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final l f19969a;

        /* renamed from: b, reason: collision with root package name */
        private final N f19970b;

        /* renamed from: c, reason: collision with root package name */
        public d f19971c;

        /* renamed from: d, reason: collision with root package name */
        private long f19972d;

        /* renamed from: e, reason: collision with root package name */
        private long f19973e;

        /* renamed from: f, reason: collision with root package name */
        private int f19974f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f19975g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f19969a = new l();
            this.f19970b = new N();
            this.f19971c = d.DORMANT;
            this.nextParkedWorker = a.f19959l;
            int iNanoTime = (int) System.nanoTime();
            this.f19974f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f19972d = 0L;
            if (this.f19971c == d.PARKING) {
                this.f19971c = d.BLOCKING;
            }
            if (!hVar.f19987b) {
                a.this.f0(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.o0();
            }
            a.this.f0(hVar);
            a.C().addAndGet(a.this, -2097152L);
            if (this.f19971c != d.TERMINATED) {
                this.f19971c = d.DORMANT;
            }
        }

        private final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f19960a * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f19969a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f19969a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f19965f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f19959l;
        }

        private final void k() {
            if (this.f19972d == 0) {
                this.f19972d = System.nanoTime() + a.this.f19962c;
            }
            LockSupport.parkNanos(a.this.f19962c);
            if (System.nanoTime() - this.f19972d >= 0) {
                this.f19972d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f19964e.e();
                return hVar != null ? hVar : (h) a.this.f19965f.e();
            }
            h hVar2 = (h) a.this.f19965f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f19964e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f19971c != d.TERMINATED) {
                    h hVarE = e(this.f19975g);
                    if (hVarE != null) {
                        this.f19973e = 0L;
                        b(hVarE);
                    } else {
                        this.f19975g = false;
                        if (this.f19973e == 0) {
                            q();
                        } else if (z10) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f19973e);
                            this.f19973e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j10;
            if (this.f19971c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterC = a.C();
            do {
                j10 = atomicLongFieldUpdaterC.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.C().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f19971c = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.b0(this);
                return;
            }
            f19968i.set(this, -1);
            while (i() && f19968i.get(this) == -1 && !a.this.isTerminated() && this.f19971c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.C().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f19966g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f19969a.r(i10, this.f19970b);
                    if (jR == -1) {
                        N n10 = this.f19970b;
                        h hVar = (h) n10.f51689a;
                        n10.f51689a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f19973e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f19966g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.C().get(aVar) & 2097151)) <= aVar.f19960a) {
                        return;
                    }
                    if (f19968i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.d0(this, i10, 0);
                        int andDecrement = (int) (a.C().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f19966g.b(andDecrement);
                            AbstractC6492s.f(objB);
                            c cVar = (c) objB;
                            aVar.f19966g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.d0(cVar, andDecrement, i10);
                        }
                        aVar.f19966g.c(andDecrement, null);
                        J j10 = J.f24997a;
                        this.f19971c = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f19974f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f19974f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & MPv3.MAX_MESSAGE_ID) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f19963d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f19971c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.C().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f19971c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
