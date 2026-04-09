package eb;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class c implements f, z9.a, n6.c, c5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8071a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8072b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f8073c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f8074d;

    /* renamed from: e, reason: collision with root package name */
    public int f8075e;

    /* renamed from: f, reason: collision with root package name */
    public int f8076f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8078h;

    /* renamed from: i, reason: collision with root package name */
    public final Thread f8079i;
    public final Object[] j;
    public final Object[] k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8080l;

    /* renamed from: m, reason: collision with root package name */
    public Exception f8081m;

    public c(int i10) {
        this.f8071a = i10;
        switch (i10) {
            case 1:
                n6.a[] aVarArr = new n6.a[2];
                this.f8072b = new Object();
                this.f8073c = new ArrayDeque();
                this.f8074d = new ArrayDeque();
                this.j = new n6.e[2];
                this.f8075e = 2;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f8075e) {
                        this.k = aVarArr;
                        this.f8076f = 2;
                        for (int i12 = 0; i12 < this.f8076f; i12++) {
                            ((n6.a[]) this.k)[i12] = new n6.a(this, 0);
                        }
                        c5.h hVar = new c5.h(this, 0);
                        this.f8079i = hVar;
                        hVar.start();
                        int i13 = this.f8075e;
                        c5.g[] gVarArr = (c5.g[]) this.j;
                        a5.a.i(i13 == gVarArr.length);
                        for (c5.g gVar : gVarArr) {
                            gVar.r(1024);
                        }
                        break;
                    } else {
                        ((c5.g[]) this.j)[i11] = new n6.e(1);
                        i11++;
                    }
                }
            default:
                j[] jVarArr = new j[2];
                this.f8072b = new Object();
                this.f8073c = new ArrayDeque();
                this.f8074d = new ArrayDeque();
                this.j = new i[2];
                this.f8075e = 2;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f8075e) {
                        this.k = jVarArr;
                        this.f8076f = 2;
                        for (int i15 = 0; i15 < this.f8076f; i15++) {
                            ((z9.f[]) this.k)[i15] = new d(new bf.a(15, this));
                        }
                        c5.h hVar2 = new c5.h(this, 3);
                        this.f8079i = hVar2;
                        hVar2.start();
                        int i16 = this.f8075e;
                        z9.d[] dVarArr = (z9.d[]) this.j;
                        qb.b.j(i16 == dVarArr.length);
                        for (z9.d dVar : dVarArr) {
                            dVar.r(1024);
                        }
                        break;
                    } else {
                        ((z9.d[]) this.j)[i14] = new i(1);
                        i14++;
                    }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean k() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8072b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f8078h     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r8.f8073c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r8.f8076f     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r8.f8072b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r1 = move-exception
            goto Lae
        L23:
            boolean r1 = r8.f8078h     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r3
        L29:
            java.util.ArrayDeque r1 = r8.f8073c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            z9.d r1 = (z9.d) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r4 = r8.k     // Catch: java.lang.Throwable -> L20
            z9.f[] r4 = (z9.f[]) r4     // Catch: java.lang.Throwable -> L20
            int r5 = r8.f8076f     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r2
            r8.f8076f = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r8.f8077g     // Catch: java.lang.Throwable -> L20
            r8.f8077g = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 4
            boolean r6 = r1.g(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L50
            int r3 = r4.f3295d
            r0 = r0 | r3
            r4.f3295d = r0
            goto L7f
        L50:
            boolean r0 = r1.g(r7)
            if (r0 == 0) goto L5b
            int r0 = r4.f3295d
            r0 = r0 | r7
            r4.f3295d = r0
        L5b:
            eb.g r0 = r8.g(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L60 java.lang.RuntimeException -> L6a
            goto L73
        L60:
            r0 = move-exception
            eb.g r5 = new eb.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L68:
            r0 = r5
            goto L73
        L6a:
            r0 = move-exception
            eb.g r5 = new eb.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L68
        L73:
            if (r0 == 0) goto L7f
            java.lang.Object r5 = r8.f8072b
            monitor-enter(r5)
            r8.f8081m = r0     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7c
            return r3
        L7c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7c
            throw r0
        L7f:
            java.lang.Object r3 = r8.f8072b
            monitor-enter(r3)
            boolean r0 = r8.f8077g     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L8c
            r4.p()     // Catch: java.lang.Throwable -> L8a
            goto L9b
        L8a:
            r0 = move-exception
            goto Lac
        L8c:
            boolean r0 = r4.g(r7)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L96
            r4.p()     // Catch: java.lang.Throwable -> L8a
            goto L9b
        L96:
            java.util.ArrayDeque r0 = r8.f8074d     // Catch: java.lang.Throwable -> L8a
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L8a
        L9b:
            r1.p()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object[] r0 = r8.j     // Catch: java.lang.Throwable -> L8a
            z9.d[] r0 = (z9.d[]) r0     // Catch: java.lang.Throwable -> L8a
            int r4 = r8.f8075e     // Catch: java.lang.Throwable -> L8a
            int r5 = r4 + 1
            r8.f8075e = r5     // Catch: java.lang.Throwable -> L8a
            r0[r4] = r1     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            return r2
        Lac:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            throw r0
        Lae:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.k():boolean");
    }

    @Override // eb.f, n6.c
    public final void a(long j) {
        int i10 = this.f8071a;
    }

    @Override // z9.a
    public Object b() {
        synchronized (this.f8072b) {
            try {
                g gVar = (g) this.f8081m;
                if (gVar != null) {
                    throw gVar;
                }
                if (this.f8074d.isEmpty()) {
                    return null;
                }
                return (z9.f) this.f8074d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z9.a, c5.d
    public final Object c() {
        z9.d dVar;
        c5.g gVar;
        switch (this.f8071a) {
            case 0:
                synchronized (this.f8072b) {
                    try {
                        g gVar2 = (g) this.f8081m;
                        if (gVar2 != null) {
                            throw gVar2;
                        }
                        qb.b.j(((z9.d) this.f8080l) == null);
                        int i10 = this.f8075e;
                        if (i10 == 0) {
                            dVar = null;
                        } else {
                            z9.d[] dVarArr = (z9.d[]) this.j;
                            int i11 = i10 - 1;
                            this.f8075e = i11;
                            dVar = dVarArr[i11];
                        }
                        this.f8080l = dVar;
                    } finally {
                    }
                }
                return dVar;
            default:
                synchronized (this.f8072b) {
                    try {
                        n6.d dVar2 = (n6.d) this.f8081m;
                        if (dVar2 != null) {
                            throw dVar2;
                        }
                        a5.a.i(((c5.g) this.f8080l) == null);
                        int i12 = this.f8075e;
                        if (i12 == 0) {
                            gVar = null;
                        } else {
                            c5.g[] gVarArr = (c5.g[]) this.j;
                            int i13 = i12 - 1;
                            this.f8075e = i13;
                            gVar = gVarArr[i13];
                        }
                        this.f8080l = gVar;
                    } finally {
                    }
                }
                return gVar;
        }
    }

    @Override // z9.a
    public void d(i iVar) {
        synchronized (this.f8072b) {
            try {
                g gVar = (g) this.f8081m;
                if (gVar != null) {
                    throw gVar;
                }
                qb.b.g(iVar == ((z9.d) this.f8080l));
                this.f8073c.addLast(iVar);
                if (!this.f8073c.isEmpty() && this.f8076f > 0) {
                    this.f8072b.notify();
                }
                this.f8080l = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c5.d
    public void e(n6.e eVar) {
        synchronized (this.f8072b) {
            try {
                n6.d dVar = (n6.d) this.f8081m;
                if (dVar != null) {
                    throw dVar;
                }
                a5.a.e(eVar == ((c5.g) this.f8080l));
                this.f8073c.addLast(eVar);
                if (!this.f8073c.isEmpty() && this.f8076f > 0) {
                    this.f8072b.notify();
                }
                this.f8080l = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract e f(byte[] bArr, int i10, boolean z10);

    @Override // z9.a, c5.d
    public final void flush() {
        switch (this.f8071a) {
            case 0:
                synchronized (this.f8072b) {
                    try {
                        this.f8077g = true;
                        z9.d dVar = (z9.d) this.f8080l;
                        if (dVar != null) {
                            dVar.p();
                            z9.d[] dVarArr = (z9.d[]) this.j;
                            int i10 = this.f8075e;
                            this.f8075e = i10 + 1;
                            dVarArr[i10] = dVar;
                            this.f8080l = null;
                        }
                        while (!this.f8073c.isEmpty()) {
                            z9.d dVar2 = (z9.d) this.f8073c.removeFirst();
                            dVar2.p();
                            z9.d[] dVarArr2 = (z9.d[]) this.j;
                            int i11 = this.f8075e;
                            this.f8075e = i11 + 1;
                            dVarArr2[i11] = dVar2;
                        }
                        while (!this.f8074d.isEmpty()) {
                            ((z9.f) this.f8074d.removeFirst()).p();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f8072b) {
                    try {
                        this.f8077g = true;
                        c5.g gVar = (c5.g) this.f8080l;
                        if (gVar != null) {
                            gVar.p();
                            c5.g[] gVarArr = (c5.g[]) this.j;
                            int i12 = this.f8075e;
                            this.f8075e = i12 + 1;
                            gVarArr[i12] = gVar;
                            this.f8080l = null;
                        }
                        while (!this.f8073c.isEmpty()) {
                            c5.g gVar2 = (c5.g) this.f8073c.removeFirst();
                            gVar2.p();
                            c5.g[] gVarArr2 = (c5.g[]) this.j;
                            int i13 = this.f8075e;
                            this.f8075e = i13 + 1;
                            gVarArr2[i13] = gVar2;
                        }
                        while (!this.f8074d.isEmpty()) {
                            ((n6.a) this.f8074d.removeFirst()).p();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public g g(z9.d dVar, z9.f fVar, boolean z10) {
        i iVar = (i) dVar;
        j jVar = (j) fVar;
        try {
            ByteBuffer byteBuffer = iVar.f26791r;
            byteBuffer.getClass();
            e eVarF = f(byteBuffer.array(), byteBuffer.limit(), z10);
            long j = iVar.f26793y;
            long j7 = iVar.E;
            jVar.f26799g = j;
            jVar.f8084r = eVarF;
            if (j7 != Long.MAX_VALUE) {
                j = j7;
            }
            jVar.f8085x = j;
            jVar.f3295d &= Integer.MAX_VALUE;
            return null;
        } catch (g e4) {
            return e4;
        }
    }

    public abstract n6.b h(byte[] bArr, int i10, boolean z10);

    public n6.d i(c5.g gVar, n6.a aVar, boolean z10) {
        n6.e eVar = (n6.e) gVar;
        try {
            ByteBuffer byteBuffer = eVar.f3306r;
            byteBuffer.getClass();
            aVar.q(eVar.f3308y, h(byteBuffer.array(), byteBuffer.limit(), z10), eVar.E);
            aVar.f3295d &= Integer.MAX_VALUE;
            return null;
        } catch (n6.d e4) {
            return e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c A[Catch: all -> 0x0025, DONT_GENERATE, TryCatch #1 {all -> 0x0025, blocks: (B:6:0x0008, B:8:0x000e, B:10:0x0016, B:15:0x001f, B:18:0x0028, B:20:0x002c, B:22:0x0030, B:23:0x0047), top: B:69:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[Catch: all -> 0x0025, TryCatch #1 {all -> 0x0025, blocks: (B:6:0x0008, B:8:0x000e, B:10:0x0016, B:15:0x001f, B:18:0x0028, B:20:0x002c, B:22:0x0030, B:23:0x0047), top: B:69:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.j():boolean");
    }

    @Override // z9.a, c5.d
    public final void release() throws InterruptedException {
        switch (this.f8071a) {
            case 0:
                synchronized (this.f8072b) {
                    this.f8078h = true;
                    this.f8072b.notify();
                }
                try {
                    ((c5.h) this.f8079i).join();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            default:
                synchronized (this.f8072b) {
                    this.f8078h = true;
                    this.f8072b.notify();
                }
                try {
                    ((c5.h) this.f8079i).join();
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
        }
    }

    @Override // z9.a
    public n6.a b() {
        synchronized (this.f8072b) {
            try {
                n6.d dVar = (n6.d) this.f8081m;
                if (dVar == null) {
                    if (this.f8074d.isEmpty()) {
                        return null;
                    }
                    return (n6.a) this.f8074d.removeFirst();
                }
                throw dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void l(long j) {
    }

    private final void m(long j) {
    }
}
