package ba;

import b9.C1992A;
import ia.A;
import ia.C;
import ia.C4466b;
import ia.C4468d;
import ia.D;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;

/* compiled from: Http2Stream.kt */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f18223a;

    /* renamed from: b, reason: collision with root package name */
    public final f f18224b;

    /* renamed from: c, reason: collision with root package name */
    public long f18225c;

    /* renamed from: d, reason: collision with root package name */
    public long f18226d;

    /* renamed from: e, reason: collision with root package name */
    public long f18227e;

    /* renamed from: f, reason: collision with root package name */
    public long f18228f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<U9.s> f18229g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18230h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final a f18231j;

    /* renamed from: k, reason: collision with root package name */
    public final c f18232k;

    /* renamed from: l, reason: collision with root package name */
    public final c f18233l;

    /* renamed from: m, reason: collision with root package name */
    public ba.b f18234m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f18235n;

    /* compiled from: Http2Stream.kt */
    public final class a implements A {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18236b;

        /* renamed from: c, reason: collision with root package name */
        public final C4468d f18237c = new C4468d();

        /* renamed from: d, reason: collision with root package name */
        public boolean f18238d;

        public a(boolean z10) {
            this.f18236b = z10;
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            p pVar = p.this;
            synchronized (pVar) {
                try {
                    pVar.f18233l.enter();
                    while (pVar.f18227e >= pVar.f18228f && !this.f18236b && !this.f18238d && pVar.f() == null) {
                        try {
                            pVar.l();
                        } catch (Throwable th) {
                            pVar.f18233l.b();
                            throw th;
                        }
                    }
                    pVar.f18233l.b();
                    pVar.b();
                    jMin = Math.min(pVar.f18228f - pVar.f18227e, this.f18237c.f38643c);
                    pVar.f18227e += jMin;
                    z11 = z10 && jMin == this.f18237c.f38643c;
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p.this.f18233l.enter();
            try {
                p pVar2 = p.this;
                pVar2.f18224b.A(pVar2.f18223a, z11, this.f18237c, jMin);
            } finally {
                p.this.f18233l.b();
            }
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            p pVar = p.this;
            byte[] bArr = V9.b.f13053a;
            synchronized (pVar) {
                if (this.f18238d) {
                    return;
                }
                boolean z10 = pVar.f() == null;
                C1992A c1992a = C1992A.f18074a;
                p pVar2 = p.this;
                if (!pVar2.f18231j.f18236b) {
                    if (this.f18237c.f38643c > 0) {
                        while (this.f18237c.f38643c > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        pVar2.f18224b.A(pVar2.f18223a, true, null, 0L);
                    }
                }
                synchronized (p.this) {
                    this.f18238d = true;
                    C1992A c1992a2 = C1992A.f18074a;
                }
                p.this.f18224b.flush();
                p.this.a();
            }
        }

        @Override // ia.A, java.io.Flushable
        public final void flush() throws IOException {
            p pVar = p.this;
            byte[] bArr = V9.b.f13053a;
            synchronized (pVar) {
                pVar.b();
                C1992A c1992a = C1992A.f18074a;
            }
            while (this.f18237c.f38643c > 0) {
                a(false);
                p.this.f18224b.flush();
            }
        }

        @Override // ia.A
        public final D timeout() {
            return p.this.f18233l;
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            byte[] bArr = V9.b.f13053a;
            C4468d c4468d = this.f18237c;
            c4468d.write(source, j4);
            while (c4468d.f38643c >= 16384) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class b implements C {

        /* renamed from: b, reason: collision with root package name */
        public final long f18240b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18241c;

        /* renamed from: d, reason: collision with root package name */
        public final C4468d f18242d = new C4468d();

        /* renamed from: e, reason: collision with root package name */
        public final C4468d f18243e = new C4468d();

        /* renamed from: f, reason: collision with root package name */
        public boolean f18244f;

        public b(long j4, boolean z10) {
            this.f18240b = j4;
            this.f18241c = z10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j4;
            p pVar = p.this;
            synchronized (pVar) {
                this.f18244f = true;
                C4468d c4468d = this.f18243e;
                j4 = c4468d.f38643c;
                c4468d.a();
                pVar.notifyAll();
                C1992A c1992a = C1992A.f18074a;
            }
            if (j4 > 0) {
                byte[] bArr = V9.b.f13053a;
                p.this.f18224b.n(j4);
            }
            p.this.a();
        }

        @Override // ia.C
        public final long read(C4468d sink, long j4) throws Throwable {
            Throwable uVar;
            boolean z10;
            long j10;
            kotlin.jvm.internal.l.f(sink, "sink");
            long j11 = 0;
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            while (true) {
                p pVar = p.this;
                synchronized (pVar) {
                    pVar.f18232k.enter();
                    try {
                        if (pVar.f() == null || this.f18241c) {
                            uVar = null;
                        } else {
                            uVar = pVar.f18235n;
                            if (uVar == null) {
                                ba.b bVarF = pVar.f();
                                kotlin.jvm.internal.l.c(bVarF);
                                uVar = new u(bVarF);
                            }
                        }
                        if (this.f18244f) {
                            throw new IOException("stream closed");
                        }
                        C4468d c4468d = this.f18243e;
                        long j12 = c4468d.f38643c;
                        z10 = false;
                        if (j12 > j11) {
                            j10 = c4468d.read(sink, Math.min(j4, j12));
                            long j13 = pVar.f18225c + j10;
                            pVar.f18225c = j13;
                            long j14 = j13 - pVar.f18226d;
                            if (uVar == null && j14 >= pVar.f18224b.f18158q.a() / 2) {
                                pVar.f18224b.D(pVar.f18223a, j14);
                                pVar.f18226d = pVar.f18225c;
                            }
                        } else {
                            if (!this.f18241c && uVar == null) {
                                pVar.l();
                                z10 = true;
                            }
                            j10 = -1;
                        }
                        pVar.f18232k.b();
                        C1992A c1992a = C1992A.f18074a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (j10 != -1) {
                        return j10;
                    }
                    if (uVar == null) {
                        return -1L;
                    }
                    throw uVar;
                }
                j11 = 0;
            }
        }

        @Override // ia.C
        public final D timeout() {
            return p.this.f18232k;
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class c extends C4466b {
        public c() {
        }

        public final void b() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // ia.C4466b
        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // ia.C4466b
        public final void timedOut() {
            p.this.e(ba.b.CANCEL);
            f fVar = p.this.f18224b;
            synchronized (fVar) {
                long j4 = fVar.f18156o;
                long j10 = fVar.f18155n;
                if (j4 < j10) {
                    return;
                }
                fVar.f18155n = j10 + 1;
                fVar.f18157p = System.nanoTime() + 1000000000;
                C1992A c1992a = C1992A.f18074a;
                fVar.i.c(new Y9.i(B4.f.c(new StringBuilder(), fVar.f18146d, " ping"), fVar), 0L);
            }
        }
    }

    public p(int i, f connection, boolean z10, boolean z11, U9.s sVar) {
        kotlin.jvm.internal.l.f(connection, "connection");
        this.f18223a = i;
        this.f18224b = connection;
        this.f18228f = connection.f18159r.a();
        ArrayDeque<U9.s> arrayDeque = new ArrayDeque<>();
        this.f18229g = arrayDeque;
        this.i = new b(connection.f18158q.a(), z11);
        this.f18231j = new a(z10);
        this.f18232k = new c();
        this.f18233l = new c();
        if (sVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(sVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.io.IOException {
        /*
            r3 = this;
            byte[] r0 = V9.b.f13053a
            monitor-enter(r3)
            ba.p$b r0 = r3.i     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f18241c     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f18244f     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            ba.p$a r0 = r3.f18231j     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f18236b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f18238d     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L36
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r3.i()     // Catch: java.lang.Throwable -> L19
            b9.A r2 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            if (r0 == 0) goto L2c
            ba.b r0 = ba.b.CANCEL
            r1 = 0
            r3.c(r0, r1)
            return
        L2c:
            if (r1 != 0) goto L35
            ba.f r0 = r3.f18224b
            int r1 = r3.f18223a
            r0.k(r1)
        L35:
            return
        L36:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.p.a():void");
    }

    public final void b() throws IOException {
        a aVar = this.f18231j;
        if (aVar.f18238d) {
            throw new IOException("stream closed");
        }
        if (aVar.f18236b) {
            throw new IOException("stream finished");
        }
        if (this.f18234m != null) {
            IOException iOException = this.f18235n;
            if (iOException != null) {
                throw iOException;
            }
            ba.b bVar = this.f18234m;
            kotlin.jvm.internal.l.c(bVar);
            throw new u(bVar);
        }
    }

    public final void c(ba.b rstStatusCode, IOException iOException) throws IOException {
        kotlin.jvm.internal.l.f(rstStatusCode, "rstStatusCode");
        if (d(rstStatusCode, iOException)) {
            f fVar = this.f18224b;
            fVar.getClass();
            fVar.f18165x.n(this.f18223a, rstStatusCode);
        }
    }

    public final boolean d(ba.b bVar, IOException iOException) {
        byte[] bArr = V9.b.f13053a;
        synchronized (this) {
            if (this.f18234m != null) {
                return false;
            }
            this.f18234m = bVar;
            this.f18235n = iOException;
            notifyAll();
            if (this.i.f18241c && this.f18231j.f18236b) {
                return false;
            }
            C1992A c1992a = C1992A.f18074a;
            this.f18224b.k(this.f18223a);
            return true;
        }
    }

    public final void e(ba.b errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f18224b.B(this.f18223a, errorCode);
        }
    }

    public final synchronized ba.b f() {
        return this.f18234m;
    }

    public final a g() {
        synchronized (this) {
            try {
                if (!this.f18230h && !h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f18231j;
    }

    public final boolean h() {
        boolean z10 = (this.f18223a & 1) == 1;
        this.f18224b.getClass();
        return true == z10;
    }

    public final synchronized boolean i() {
        if (this.f18234m != null) {
            return false;
        }
        b bVar = this.i;
        if (bVar.f18241c || bVar.f18244f) {
            a aVar = this.f18231j;
            if (aVar.f18236b || aVar.f18238d) {
                if (this.f18230h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(U9.s headers, boolean z10) {
        boolean zI;
        kotlin.jvm.internal.l.f(headers, "headers");
        byte[] bArr = V9.b.f13053a;
        synchronized (this) {
            try {
                if (this.f18230h && z10) {
                    this.i.getClass();
                } else {
                    this.f18230h = true;
                    this.f18229g.add(headers);
                }
                if (z10) {
                    this.i.f18241c = true;
                }
                zI = i();
                notifyAll();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.f18224b.k(this.f18223a);
    }

    public final synchronized void k(ba.b errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (this.f18234m == null) {
            this.f18234m = errorCode;
            notifyAll();
        }
    }

    public final void l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
