package yl;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import i.e0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y implements hm.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f37774a;

    /* renamed from: b, reason: collision with root package name */
    public final q f37775b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f37776c;

    /* renamed from: d, reason: collision with root package name */
    public long f37777d;

    /* renamed from: e, reason: collision with root package name */
    public long f37778e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f37779f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final w f37780h;

    /* renamed from: i, reason: collision with root package name */
    public final v f37781i;
    public final x j;

    /* renamed from: k, reason: collision with root package name */
    public final x f37782k;

    /* renamed from: l, reason: collision with root package name */
    public b f37783l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f37784m;

    public y(int i4, q qVar, boolean z3, boolean z10, rl.m mVar) {
        nk.k.e(qVar, "connection");
        this.f37774a = i4;
        this.f37775b = qVar;
        this.f37776c = new e0(i4);
        this.f37778e = qVar.f37738r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f37779f = arrayDeque;
        this.f37780h = new w(this, qVar.f37737q.a(), z10);
        this.f37781i = new v(this, z3);
        this.j = new x(this);
        this.f37782k = new x(this);
        if (mVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
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
            java.util.TimeZone r0 = sl.h.f33837a
            monitor-enter(r2)
            yl.w r0 = r2.f37780h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f37768b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f37771e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            yl.v r0 = r2.f37781i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f37763a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f37765c     // Catch: java.lang.Throwable -> L18
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
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            yl.b r0 = yl.b.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            yl.q r0 = r2.f37775b
            int r1 = r2.f37774a
            r0.m(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.y.a():void");
    }

    public final void b() throws IOException {
        v vVar = this.f37781i;
        if (vVar.f37765c) {
            throw new IOException("stream closed");
        }
        if (vVar.f37763a) {
            throw new IOException("stream finished");
        }
        if (g() != null) {
            IOException iOException = this.f37784m;
            if (iOException != null) {
                throw iOException;
            }
            b bVarG = g();
            nk.k.b(bVarG);
            throw new d0(bVarG);
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            this.f37775b.f37743w.w(this.f37774a, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        TimeZone timeZone = sl.h.f33837a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.f37783l = bVar;
            this.f37784m = iOException;
            notifyAll();
            if (this.f37780h.f37768b) {
                if (this.f37781i.f37763a) {
                    return false;
                }
            }
            this.f37775b.m(this.f37774a);
            return true;
        }
    }

    @Override // hm.v
    public final hm.w e() {
        return this.f37780h;
    }

    public final void f(b bVar) {
        if (d(bVar, null)) {
            this.f37775b.y(this.f37774a, bVar);
        }
    }

    public final b g() {
        b bVar;
        synchronized (this) {
            bVar = this.f37783l;
        }
        return bVar;
    }

    public final boolean h() {
        boolean z3 = (this.f37774a & 1) == 1;
        this.f37775b.getClass();
        return true == z3;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                w wVar = this.f37780h;
                if (wVar.f37768b || wVar.f37771e) {
                    v vVar = this.f37781i;
                    if (vVar.f37763a || vVar.f37765c) {
                        if (this.g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(rl.m mVar, boolean z3) {
        boolean zI;
        nk.k.e(mVar, "headers");
        TimeZone timeZone = sl.h.f33837a;
        synchronized (this) {
            try {
                if (this.g && mVar.a(Header.RESPONSE_STATUS_UTF8) == null && mVar.a(Header.TARGET_METHOD_UTF8) == null) {
                    this.f37780h.getClass();
                } else {
                    this.g = true;
                    this.f37779f.add(mVar);
                }
                if (z3) {
                    this.f37780h.f37768b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zI) {
            return;
        }
        this.f37775b.m(this.f37774a);
    }

    public final void k(b bVar) {
        synchronized (this) {
            if (g() == null) {
                this.f37783l = bVar;
                notifyAll();
            }
        }
    }

    @Override // hm.v
    public final hm.u s() {
        return this.f37781i;
    }
}
