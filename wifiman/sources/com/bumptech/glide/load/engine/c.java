package com.bumptech.glide.load.engine;

import I2.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class c implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f34311a;

    /* renamed from: b, reason: collision with root package name */
    private final g f34312b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f34313c;

    /* renamed from: d, reason: collision with root package name */
    private int f34314d;

    /* renamed from: e, reason: collision with root package name */
    private C2.e f34315e;

    /* renamed from: f, reason: collision with root package name */
    private List f34316f;

    /* renamed from: g, reason: collision with root package name */
    private int f34317g;

    /* renamed from: h, reason: collision with root package name */
    private volatile n.a f34318h;

    /* renamed from: i, reason: collision with root package name */
    private File f34319i;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f34317g < this.f34316f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f34316f;
        r3 = r7.f34317g;
        r7.f34317g = r3 + 1;
        r7.f34318h = ((I2.n) r0.get(r3)).a(r7.f34319i, r7.f34312b.t(), r7.f34312b.f(), r7.f34312b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f34318h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f34312b.u(r7.f34318h.f8513c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f34318h.f8513c.e(r7.f34312b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f34318h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            X2.b.a(r0)
        L5:
            java.util.List r0 = r7.f34316f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f34318h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f34316f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f34317g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f34317g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            I2.n r0 = (I2.n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f34319i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r4 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r5 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r6 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            C2.g r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            I2.n$a r0 = r0.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f34318h = r0     // Catch: java.lang.Throwable -> L68
            I2.n$a r0 = r7.f34318h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g r0 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            I2.n$a r3 = r7.f34318h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f8513c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            I2.n$a r0 = r7.f34318h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f8513c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r2 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            X2.b.e()
            return r2
        L6e:
            int r0 = r7.f34314d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f34314d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f34311a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            X2.b.e()
            return r2
        L7f:
            java.util.List r0 = r7.f34311a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f34314d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            C2.e r0 = (C2.e) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r3 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            C2.e r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r3 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            G2.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f34319i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f34315e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r0 = r7.f34312b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f34316f = r0     // Catch: java.lang.Throwable -> L68
            r7.f34317g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            X2.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f34313c.c(this.f34315e, exc, this.f34318h.f8513c, C2.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f34318h;
        if (aVar != null) {
            aVar.f8513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f34313c.a(this.f34315e, obj, this.f34318h.f8513c, C2.a.DATA_DISK_CACHE, this.f34315e);
    }

    c(List list, g gVar, f.a aVar) {
        this.f34314d = -1;
        this.f34311a = list;
        this.f34312b = gVar;
        this.f34313c = aVar;
    }
}
