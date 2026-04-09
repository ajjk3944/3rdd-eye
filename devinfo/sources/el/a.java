package el;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nk.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23538i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f23539a;

    /* renamed from: b, reason: collision with root package name */
    public final u f23540b;

    /* renamed from: c, reason: collision with root package name */
    public b f23541c;

    /* renamed from: d, reason: collision with root package name */
    public long f23542d;

    /* renamed from: e, reason: collision with root package name */
    public long f23543e;

    /* renamed from: f, reason: collision with root package name */
    public int f23544f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f23545h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i4) {
        this.f23545h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f23539a = new m();
        this.f23540b = new u();
        this.f23541c = b.f23549d;
        this.nextParkedWorker = c.f23554k;
        int iNanoTime = (int) System.nanoTime();
        this.f23544f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = el.m.f23578d.get(r9);
        r0 = el.m.f23577c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (el.m.f23579e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final el.i a(boolean r12) {
        /*
            r11 = this;
            el.b r0 = r11.f23541c
            el.c r2 = r11.f23545h
            r7 = 0
            r8 = 1
            el.m r9 = r11.f23539a
            el.b r10 = el.b.f23546a
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = el.c.f23553i
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = el.m.f23576b
            java.lang.Object r0 = r12.get(r9)
            el.i r0 = (el.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f23567b
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = el.m.f23578d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = el.m.f23577c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = el.m.f23579e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            el.i r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            el.f r12 = r2.f23560f
            java.lang.Object r12 = r12.d()
            el.i r12 = (el.i) r12
            if (r12 != 0) goto L71
            el.i r12 = r11.i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = el.c.f23553i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f23541c = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f23555a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            el.i r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = el.m.f23576b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            el.i r12 = (el.i) r12
            if (r12 != 0) goto Lac
            el.i r12 = r9.b()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            el.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            el.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            el.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.a(boolean):el.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i10 = this.f23544f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f23544f = i13;
        int i14 = i4 - 1;
        return (i14 & i4) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i4;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f23545h;
        if (iD == 0) {
            i iVar = (i) cVar.f23559e.d();
            return iVar != null ? iVar : (i) cVar.f23560f.d();
        }
        i iVar2 = (i) cVar.f23560f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f23559e.d();
    }

    public final void f(int i4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23545h.f23558d);
        sb2.append("-worker-");
        sb2.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb2.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f23541c;
        boolean z3 = bVar2 == b.f23546a;
        if (z3) {
            c.f23553i.addAndGet(this.f23545h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f23541c = bVar;
        }
        return z3;
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
    public final el.i i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.a.i(int):el.i");
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
        throw new UnsupportedOperationException("Method not decompiled: el.a.run():void");
    }
}
