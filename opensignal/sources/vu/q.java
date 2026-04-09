package vu;

import h9.r2;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class q implements Closeable {
    public static final c0 V;
    public final ru.c B;
    public final ru.b D;
    public final ru.b E;
    public final ru.b F;
    public final b0 G;
    public long H;
    public long I;
    public long J;
    public long K;
    public final c0 L;
    public c0 M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public final Socket R;
    public final z S;
    public final ur.g T;
    public final LinkedHashSet U;

    /* renamed from: a, reason: collision with root package name */
    public final j f24028a;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24029d = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final String f24030g;

    /* renamed from: r, reason: collision with root package name */
    public int f24031r;

    /* renamed from: x, reason: collision with root package name */
    public int f24032x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24033y;

    static {
        c0 c0Var = new c0();
        c0Var.c(7, 65535);
        c0Var.c(5, 16384);
        V = c0Var;
    }

    public q(r2 r2Var) {
        this.f24028a = (j) r2Var.f10475y;
        String str = (String) r2Var.f10472g;
        if (str == null) {
            br.l.l("connectionName");
            throw null;
        }
        this.f24030g = str;
        this.f24032x = 3;
        ru.c cVar = (ru.c) r2Var.f10470a;
        this.B = cVar;
        this.D = cVar.e();
        this.E = cVar.e();
        this.F = cVar.e();
        this.G = b0.f23974a;
        c0 c0Var = new c0();
        c0Var.c(7, 16777216);
        this.L = c0Var;
        this.M = V;
        this.Q = r0.a();
        Socket socket = (Socket) r2Var.f10471d;
        if (socket == null) {
            br.l.l("socket");
            throw null;
        }
        this.R = socket;
        cv.y yVar = (cv.y) r2Var.f10474x;
        if (yVar == null) {
            br.l.l("sink");
            throw null;
        }
        this.S = new z(yVar);
        cv.z zVar = (cv.z) r2Var.f10473r;
        if (zVar == null) {
            br.l.l("source");
            throw null;
        }
        this.T = new ur.g(this, 2, new u(zVar));
        this.U = new LinkedHashSet();
    }

    public final void G(int i10, c cVar) {
        br.l.e(cVar, "errorCode");
        this.D.c(new o(this.f24030g + '[' + i10 + "] writeSynReset", this, i10, cVar), 0L);
    }

    public final void L(int i10, long j) {
        this.D.c(new p(this.f24030g + '[' + i10 + "] windowUpdate", this, i10, j), 0L);
    }

    public final void b(c cVar, c cVar2, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        br.l.e(cVar, "connectionCode");
        br.l.e(cVar2, "streamCode");
        byte[] bArr = pu.b.f20645a;
        try {
            q(cVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f24029d.isEmpty()) {
                array = null;
            } else {
                array = this.f24029d.values().toArray(new y[0]);
                this.f24029d.clear();
            }
        }
        y[] yVarArr = (y[]) array;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(cVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.S.close();
        } catch (IOException unused3) {
        }
        try {
            this.R.close();
        } catch (IOException unused4) {
        }
        this.D.f();
        this.E.f();
        this.F.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b(c.NO_ERROR, c.CANCEL, null);
    }

    public final void f(IOException iOException) throws IOException {
        c cVar = c.PROTOCOL_ERROR;
        b(cVar, cVar, iOException);
    }

    public final void flush() {
        this.S.flush();
    }

    public final synchronized y h(int i10) {
        return (y) this.f24029d.get(Integer.valueOf(i10));
    }

    public final synchronized y i(int i10) {
        y yVar;
        yVar = (y) this.f24029d.remove(Integer.valueOf(i10));
        notifyAll();
        return yVar;
    }

    public final void q(c cVar) {
        br.l.e(cVar, "statusCode");
        synchronized (this.S) {
            synchronized (this) {
                if (this.f24033y) {
                    return;
                }
                this.f24033y = true;
                this.S.i(this.f24031r, cVar, pu.b.f20645a);
            }
        }
    }

    public final synchronized void w(long j) {
        long j7 = this.N + j;
        this.N = j7;
        long j10 = j7 - this.O;
        if (j10 >= this.L.a() / 2) {
            L(0, j10);
            this.O += j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.S.f24078g);
        r6 = r2;
        r8.P += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(int r9, boolean r10, cv.g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            vu.z r12 = r8.S
            r12.f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.P     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.Q     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f24029d     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
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
            vu.z r4 = r8.S     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f24078g     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.P     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.P = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            vu.z r4 = r8.S
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.f(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: vu.q.y(int, boolean, cv.g, long):void");
    }
}
