package yl;

import a0.x0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import i.e0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f37722z;

    /* renamed from: a, reason: collision with root package name */
    public final n f37723a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37724b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f37725c;

    /* renamed from: d, reason: collision with root package name */
    public int f37726d;

    /* renamed from: e, reason: collision with root package name */
    public int f37727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37728f;
    public final ul.d g;

    /* renamed from: h, reason: collision with root package name */
    public final ul.c f37729h;

    /* renamed from: i, reason: collision with root package name */
    public final ul.c f37730i;
    public final ul.c j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f37731k;

    /* renamed from: l, reason: collision with root package name */
    public long f37732l;

    /* renamed from: m, reason: collision with root package name */
    public long f37733m;

    /* renamed from: n, reason: collision with root package name */
    public long f37734n;

    /* renamed from: o, reason: collision with root package name */
    public long f37735o;

    /* renamed from: p, reason: collision with root package name */
    public final c f37736p;

    /* renamed from: q, reason: collision with root package name */
    public final c0 f37737q;

    /* renamed from: r, reason: collision with root package name */
    public c0 f37738r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f37739s;

    /* renamed from: t, reason: collision with root package name */
    public long f37740t;

    /* renamed from: u, reason: collision with root package name */
    public long f37741u;

    /* renamed from: v, reason: collision with root package name */
    public final i0.f f37742v;

    /* renamed from: w, reason: collision with root package name */
    public final z f37743w;

    /* renamed from: x, reason: collision with root package name */
    public final p f37744x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f37745y;

    static {
        c0 c0Var = new c0();
        c0Var.c(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        c0Var.c(5, Http2.INITIAL_MAX_FRAME_SIZE);
        f37722z = c0Var;
    }

    public q(z6.l lVar) {
        this.f37723a = (n) lVar.f37972d;
        String str = (String) lVar.f37971c;
        if (str == null) {
            nk.k.k("connectionName");
            throw null;
        }
        this.f37725c = str;
        this.f37727e = 3;
        ul.d dVar = (ul.d) lVar.f37969a;
        this.g = dVar;
        this.f37729h = dVar.d();
        this.f37730i = dVar.d();
        this.j = dVar.d();
        this.f37731k = b0.f37671a;
        this.f37736p = (c) lVar.f37973e;
        c0 c0Var = new c0();
        c0Var.c(4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        this.f37737q = c0Var;
        this.f37738r = f37722z;
        this.f37739s = new e0(0);
        this.f37741u = r0.a();
        i0.f fVar = (i0.f) lVar.f37970b;
        if (fVar == null) {
            nk.k.k("socket");
            throw null;
        }
        this.f37742v = fVar;
        this.f37743w = new z((hm.p) fVar.f25418d);
        this.f37744x = new p(this, new u((hm.q) fVar.f25417c));
        this.f37745y = new LinkedHashSet();
    }

    public final void A(final int i4, final long j) {
        ul.c.c(this.f37729h, this.f37725c + '[' + i4 + "] windowUpdate", new mk.a() { // from class: yl.i
            @Override // mk.a
            public final Object invoke() throws IOException {
                q qVar = this.f37703a;
                try {
                    qVar.f37743w.A(i4, j);
                } catch (IOException e2) {
                    b bVar = b.PROTOCOL_ERROR;
                    qVar.c(bVar, bVar, e2);
                }
                return yj.u.f37649a;
            }
        });
    }

    public final void c(b bVar, b bVar2, IOException iOException) throws IOException {
        int i4;
        Object[] array;
        TimeZone timeZone = sl.h.f33837a;
        try {
            p(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f37724b.isEmpty()) {
                array = null;
            } else {
                array = this.f37724b.values().toArray(new y[0]);
                this.f37724b.clear();
            }
        }
        y[] yVarArr = (y[]) array;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f37743w.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((x0) this.f37742v.f25416b).f148e).close();
        } catch (IOException unused4) {
        }
        this.f37729h.f();
        this.f37730i.f();
        this.j.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c(b.NO_ERROR, b.CANCEL, null);
    }

    public final y e(int i4) {
        y yVar;
        synchronized (this) {
            yVar = (y) this.f37724b.get(Integer.valueOf(i4));
        }
        return yVar;
    }

    public final void flush() {
        this.f37743w.flush();
    }

    public final boolean g(long j) {
        synchronized (this) {
            if (this.f37728f) {
                return false;
            }
            if (this.f37734n < this.f37733m) {
                if (j >= this.f37735o) {
                    return false;
                }
            }
            return true;
        }
    }

    public final y m(int i4) {
        y yVar;
        synchronized (this) {
            yVar = (y) this.f37724b.remove(Integer.valueOf(i4));
            notifyAll();
        }
        return yVar;
    }

    public final void p(b bVar) {
        synchronized (this.f37743w) {
            synchronized (this) {
                if (this.f37728f) {
                    return;
                }
                this.f37728f = true;
                this.f37743w.m(this.f37726d, bVar, sl.f.f33832a);
            }
        }
    }

    public final void v(long j) {
        synchronized (this) {
            try {
                e0.c(this.f37739s, j, 0L, 2);
                long jB = this.f37739s.b();
                if (jB >= this.f37737q.a() / 2) {
                    A(0, jB);
                    e0.c(this.f37739s, 0L, jB, 1);
                }
                c cVar = this.f37736p;
                e0 e0Var = this.f37739s;
                cVar.getClass();
                nk.k.e(e0Var, "windowCounter");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f37743w.f37788c);
        r6 = r2;
        r8.f37740t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(int r9, boolean r10, hm.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            yl.z r12 = r8.f37743w
            r12.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f37740t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f37741u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f37724b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            yl.z r4 = r8.f37743w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f37788c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f37740t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f37740t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            yl.z r4 = r8.f37743w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.q.w(int, boolean, hm.e, long):void");
    }

    public final void y(final int i4, final b bVar) {
        ul.c.c(this.f37729h, this.f37725c + '[' + i4 + "] writeSynReset", new mk.a() { // from class: yl.j
            @Override // mk.a
            public final Object invoke() throws IOException {
                q qVar = this.f37706a;
                try {
                    qVar.f37743w.w(i4, bVar);
                } catch (IOException e2) {
                    b bVar2 = b.PROTOCOL_ERROR;
                    qVar.c(bVar2, bVar2, e2);
                }
                return yj.u.f37649a;
            }
        });
    }
}
