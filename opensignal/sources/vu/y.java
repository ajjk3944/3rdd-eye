package vu;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f24063a;

    /* renamed from: b, reason: collision with root package name */
    public final q f24064b;

    /* renamed from: c, reason: collision with root package name */
    public long f24065c;

    /* renamed from: d, reason: collision with root package name */
    public long f24066d;

    /* renamed from: e, reason: collision with root package name */
    public long f24067e;

    /* renamed from: f, reason: collision with root package name */
    public long f24068f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f24069g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24070h;

    /* renamed from: i, reason: collision with root package name */
    public final w f24071i;
    public final v j;
    public final x k;

    /* renamed from: l, reason: collision with root package name */
    public final x f24072l;

    /* renamed from: m, reason: collision with root package name */
    public c f24073m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f24074n;

    public y(int i10, q qVar, boolean z10, boolean z11, ou.s sVar) {
        br.l.e(qVar, "connection");
        this.f24063a = i10;
        this.f24064b = qVar;
        this.f24068f = qVar.M.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f24069g = arrayDeque;
        this.f24071i = new w(this, qVar.L.a(), z11);
        this.j = new v(this, z10);
        this.k = new x(this);
        this.f24072l = new x(this);
        if (sVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(sVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = pu.b.f20645a
            monitor-enter(r2)
            vu.w r0 = r2.f24071i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f24057d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f24060x     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            vu.v r0 = r2.j     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f24052a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f24054g     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            vu.c r0 = vu.c.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            vu.q r0 = r2.f24064b
            int r1 = r2.f24063a
            r0.i(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.y.a():void");
    }

    public final void b() throws IOException {
        v vVar = this.j;
        if (vVar.f24054g) {
            throw new IOException("stream closed");
        }
        if (vVar.f24052a) {
            throw new IOException("stream finished");
        }
        if (this.f24073m != null) {
            IOException iOException = this.f24074n;
            if (iOException != null) {
                throw iOException;
            }
            c cVar = this.f24073m;
            br.l.b(cVar);
            throw new d0(cVar);
        }
    }

    public final void c(c cVar, IOException iOException) {
        br.l.e(cVar, "rstStatusCode");
        if (d(cVar, iOException)) {
            q qVar = this.f24064b;
            qVar.getClass();
            qVar.S.y(this.f24063a, cVar);
        }
    }

    public final boolean d(c cVar, IOException iOException) {
        byte[] bArr = pu.b.f20645a;
        synchronized (this) {
            if (this.f24073m != null) {
                return false;
            }
            this.f24073m = cVar;
            this.f24074n = iOException;
            notifyAll();
            if (this.f24071i.f24057d) {
                if (this.j.f24052a) {
                    return false;
                }
            }
            this.f24064b.i(this.f24063a);
            return true;
        }
    }

    public final void e(c cVar) {
        br.l.e(cVar, "errorCode");
        if (d(cVar, null)) {
            this.f24064b.G(this.f24063a, cVar);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.f24070h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z10 = (this.f24063a & 1) == 1;
        this.f24064b.getClass();
        return true == z10;
    }

    public final synchronized boolean h() {
        try {
            if (this.f24073m != null) {
                return false;
            }
            w wVar = this.f24071i;
            if (wVar.f24057d || wVar.f24060x) {
                v vVar = this.j;
                if (vVar.f24052a || vVar.f24054g) {
                    if (this.f24070h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(ou.s sVar, boolean z10) {
        boolean zH;
        br.l.e(sVar, "headers");
        byte[] bArr = pu.b.f20645a;
        synchronized (this) {
            try {
                if (this.f24070h && z10) {
                    this.f24071i.getClass();
                } else {
                    this.f24070h = true;
                    this.f24069g.add(sVar);
                }
                if (z10) {
                    this.f24071i.f24057d = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f24064b.i(this.f24063a);
    }

    public final synchronized void j(c cVar) {
        br.l.e(cVar, "errorCode");
        if (this.f24073m == null) {
            this.f24073m = cVar;
            notifyAll();
        }
    }
}
