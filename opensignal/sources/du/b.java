package du;

import br.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class b extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");
    public boolean B;
    public final /* synthetic */ d D;

    /* renamed from: a, reason: collision with root package name */
    public final n f7558a;

    /* renamed from: d, reason: collision with root package name */
    public final w f7559d;

    /* renamed from: g, reason: collision with root package name */
    public c f7560g;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: r, reason: collision with root package name */
    public long f7561r;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public long f7562x;

    /* renamed from: y, reason: collision with root package name */
    public int f7563y;

    public b(d dVar, int i10) {
        this.D = dVar;
        setDaemon(true);
        setContextClassLoader(d.class.getClassLoader());
        this.f7558a = new n();
        this.f7559d = new w();
        this.f7560g = c.DORMANT;
        this.nextParkedWorker = d.G;
        int iNanoTime = (int) System.nanoTime();
        this.f7563y = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = du.n.f7587d.get(r10);
        r0 = du.n.f7586c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (du.n.f7588e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final du.j a(boolean r12) {
        /*
            r11 = this;
            du.c r0 = r11.f7560g
            du.c r1 = du.c.CPU_ACQUIRED
            du.d r3 = r11.D
            r8 = 0
            r9 = 1
            du.n r10 = r11.f7558a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = du.d.E
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = du.n.f7585b
            java.lang.Object r0 = r12.get(r10)
            du.j r0 = (du.j) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f7576d
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = du.n.f7587d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = du.n.f7586c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = du.n.f7588e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            du.j r1 = r10.c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            du.g r12 = r3.f7569y
            java.lang.Object r12 = r12.d()
            du.j r12 = (du.j) r12
            if (r12 != 0) goto L71
            du.j r12 = r11.i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = du.d.E
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            du.c r0 = du.c.CPU_ACQUIRED
            r11.f7560g = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f7564a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            du.j r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = du.n.f7585b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            du.j r12 = (du.j) r12
            if (r12 != 0) goto Lae
            du.j r12 = r10.b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            du.j r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            du.j r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            du.j r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: du.b.a(boolean):du.j");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f7563y;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f7563y = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final j e() {
        int iD = d(2);
        d dVar = this.D;
        if (iD == 0) {
            j jVar = (j) dVar.f7568x.d();
            return jVar != null ? jVar : (j) dVar.f7569y.d();
        }
        j jVar2 = (j) dVar.f7569y.d();
        return jVar2 != null ? jVar2 : (j) dVar.f7568x.d();
    }

    public final void f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.D.f7567r);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        c cVar2 = this.f7560g;
        boolean z10 = cVar2 == c.CPU_ACQUIRED;
        if (z10) {
            d.E.addAndGet(this.D, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f7560g = cVar;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final du.j i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: du.b.i(int):du.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: du.b.run():void");
    }
}
