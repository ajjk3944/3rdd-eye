package G5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q5.o;

/* loaded from: classes3.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1682b;

    /* renamed from: c, reason: collision with root package name */
    public b f1683c;

    /* renamed from: d, reason: collision with root package name */
    public long f1684d;

    /* renamed from: e, reason: collision with root package name */
    public long f1685e;

    /* renamed from: f, reason: collision with root package name */
    public int f1686f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f1688h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f1688h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f1681a = new m();
        this.f1682b = new o();
        this.f1683c = b.f1692d;
        this.nextParkedWorker = c.f1697k;
        t5.a aVar = t5.d.f23679a;
        this.f1686f = t5.d.f23679a.b().nextInt();
        f(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r12 = G5.m.f1724d.get(r9);
        r0 = G5.m.f1723c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (G5.m.f1725e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r9.b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final G5.i a(boolean r12) {
        /*
            r11 = this;
            G5.b r0 = r11.f1683c
            G5.c r2 = r11.f1688h
            r7 = 0
            r8 = 1
            G5.m r9 = r11.f1681a
            G5.b r10 = G5.b.f1689a
            if (r0 != r10) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = G5.c.i
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L75
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = G5.m.f1722b
            java.lang.Object r0 = r12.get(r9)
            G5.i r0 = (G5.i) r0
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            V0.m r1 = r0.f1711b
            int r1 = r1.f3830b
            if (r1 != r8) goto L43
        L34:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3c
            r7 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L34
            goto L23
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = G5.m.f1724d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = G5.m.f1723c
            int r0 = r0.get(r9)
        L4f:
            if (r12 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = G5.m.f1725e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            G5.i r1 = r9.b(r0, r8)
            if (r1 == 0) goto L4f
            r7 = r1
        L63:
            if (r7 != 0) goto L74
            G5.f r12 = r2.f1703f
            java.lang.Object r12 = r12.d()
            G5.i r12 = (G5.i) r12
            if (r12 != 0) goto L73
            G5.i r12 = r11.i(r8)
        L73:
            return r12
        L74:
            return r7
        L75:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = G5.c.i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f1683c = r10
        L86:
            if (r12 == 0) goto Lba
            int r12 = r2.f1698a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r8 = 0
        L94:
            if (r8 == 0) goto L9d
            G5.i r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = G5.m.f1722b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            G5.i r12 = (G5.i) r12
            if (r12 != 0) goto Lae
            G5.i r12 = r9.a()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r8 != 0) goto Lc1
            G5.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            G5.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            G5.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.a.a(boolean):G5.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i6 = this.f1686f;
        int i7 = i6 ^ (i6 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f1686f = i9;
        int i10 = i3 - 1;
        return (i10 & i3) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i3;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f1688h;
        if (iD == 0) {
            i iVar = (i) cVar.f1702e.d();
            return iVar != null ? iVar : (i) cVar.f1703f.d();
        }
        i iVar2 = (i) cVar.f1703f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f1702e.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1688h.f1701d);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f1683c;
        boolean z6 = bVar2 == b.f1689a;
        if (z6) {
            c.i.addAndGet(this.f1688h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f1683c = bVar;
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final G5.i i(int r26) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.a.i(int):G5.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.a.run():void");
    }
}
