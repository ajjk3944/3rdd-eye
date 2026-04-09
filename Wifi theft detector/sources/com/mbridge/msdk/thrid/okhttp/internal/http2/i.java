package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f17902l = true;

    /* renamed from: a, reason: collision with root package name */
    long f17903a = 0;

    /* renamed from: b, reason: collision with root package name */
    long f17904b;

    /* renamed from: c, reason: collision with root package name */
    final int f17905c;

    /* renamed from: d, reason: collision with root package name */
    final g f17906d;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<r> f17907e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17908f;

    /* renamed from: g, reason: collision with root package name */
    private final b f17909g;

    /* renamed from: h, reason: collision with root package name */
    final a f17910h;

    /* renamed from: i, reason: collision with root package name */
    final c f17911i;

    /* renamed from: j, reason: collision with root package name */
    final c f17912j;

    /* renamed from: k, reason: collision with root package name */
    com.mbridge.msdk.thrid.okhttp.internal.http2.b f17913k;

    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f17906d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    public i(int i10, g gVar, boolean z10, boolean z11, @Nullable r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f17907e = arrayDeque;
        this.f17911i = new c();
        this.f17912j = new c();
        this.f17913k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f17905c = i10;
        this.f17906d = gVar;
        this.f17904b = gVar.f17842u.c();
        b bVar = new b(gVar.f17841t.c());
        this.f17909g = bVar;
        a aVar = new a();
        this.f17910h = aVar;
        bVar.f17924e = z11;
        aVar.f17917c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f17905c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            try {
                if (!this.f17908f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f17910h;
    }

    public s e() {
        return this.f17909g;
    }

    public boolean f() {
        return this.f17906d.f17822a == ((this.f17905c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.f17913k != null) {
                return false;
            }
            b bVar = this.f17909g;
            if (bVar.f17924e || bVar.f17923d) {
                a aVar = this.f17910h;
                if (aVar.f17917c || aVar.f17916b) {
                    if (this.f17908f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public t h() {
        return this.f17911i;
    }

    public void i() {
        boolean zG;
        if (!f17902l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f17909g.f17924e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f17906d.c(this.f17905c);
    }

    public synchronized r j() throws IOException {
        this.f17911i.h();
        while (this.f17907e.isEmpty() && this.f17913k == null) {
            try {
                k();
            } catch (Throwable th) {
                this.f17911i.k();
                throw th;
            }
        }
        this.f17911i.k();
        if (this.f17907e.isEmpty()) {
            throw new n(this.f17913k);
        }
        return this.f17907e.removeFirst();
    }

    public void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f17912j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f17902l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f17913k != null) {
                    return false;
                }
                if (this.f17909g.f17924e && this.f17910h.f17917c) {
                    return false;
                }
                this.f17913k = bVar;
                notifyAll();
                this.f17906d.c(this.f17905c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f17906d.b(this.f17905c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f17906d.c(this.f17905c, bVar);
        }
    }

    public final class a implements com.mbridge.msdk.thrid.okio.r {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f17914e = true;

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f17915a = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: b, reason: collision with root package name */
        boolean f17916b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17917c;

        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f17914e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f17915a.a(cVar, j10);
            while (this.f17915a.size() >= 16384) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f17912j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f17914e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.f17916b) {
                        return;
                    }
                    if (!i.this.f17910h.f17917c) {
                        if (this.f17915a.size() > 0) {
                            while (this.f17915a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f17906d.a(iVar.f17905c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f17916b = true;
                    }
                    i.this.f17906d.flush();
                    i.this.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f17914e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f17915a.size() > 0) {
                a(false);
                i.this.f17906d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f17912j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f17904b > 0 || this.f17917c || this.f17916b || iVar.f17913k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                        i.this.f17912j.k();
                    }
                }
                iVar.f17912j.k();
                i.this.b();
                jMin = Math.min(i.this.f17904b, this.f17915a.size());
                iVar2 = i.this;
                iVar2.f17904b -= jMin;
            }
            iVar2.f17912j.h();
            try {
                i iVar3 = i.this;
                iVar3.f17906d.a(iVar3.f17905c, z10 && jMin == this.f17915a.size(), this.f17915a, jMin);
                i.this.f17912j.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f17902l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f17908f = true;
            this.f17907e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f17906d.c(this.f17905c);
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f17913k == null) {
            this.f17913k = bVar;
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!f17902l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f17909g.a(eVar, i10);
    }

    public void b() throws IOException {
        a aVar = this.f17910h;
        if (!aVar.f17916b) {
            if (!aVar.f17917c) {
                if (this.f17913k != null) {
                    throw new n(this.f17913k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.f17902l
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$b r0 = r2.f17909g     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f17924e     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2b
            boolean r0 = r0.f17923d     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$a r0 = r2.f17910h     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f17917c     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            boolean r0 = r0.f17916b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            goto L29
        L27:
            r0 = move-exception
            goto L43
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L39
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL
            r2.a(r0)
            return
        L39:
            if (r1 != 0) goto L42
            com.mbridge.msdk.thrid.okhttp.internal.http2.g r0 = r2.f17906d
            int r1 = r2.f17905c
            r0.c(r1)
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.a():void");
    }

    public final class b implements s {

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f17919g = true;

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f17920a = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f17921b = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: c, reason: collision with root package name */
        private final long f17922c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17923d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17924e;

        public b(long j10) {
            this.f17922c = j10;
        }

        private void f(long j10) {
            if (!f17919g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f17906d.g(j10);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            long size;
            if (!f17919g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f17924e;
                    z11 = this.f17921b.size() + j10 > this.f17922c;
                }
                if (z11) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f17920a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    try {
                        if (this.f17923d) {
                            size = this.f17920a.size();
                            this.f17920a.k();
                        } else {
                            boolean z12 = this.f17921b.size() == 0;
                            this.f17921b.a(this.f17920a);
                            if (z12) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } finally {
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
        @Override // com.mbridge.msdk.thrid.okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long b(com.mbridge.msdk.thrid.okio.c r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb3
            L6:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this
                monitor-enter(r2)
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r3 = r3.f17911i     // Catch: java.lang.Throwable -> L85
                r3.h()     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.b r4 = r3.f17913k     // Catch: java.lang.Throwable -> L2c
                if (r4 == 0) goto L17
                goto L18
            L17:
                r4 = 0
            L18:
                boolean r5 = r11.f17923d     // Catch: java.lang.Throwable -> L2c
                if (r5 != 0) goto La1
                java.util.Deque r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.a(r3)     // Catch: java.lang.Throwable -> L2c
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L2f
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i.b(r3)     // Catch: java.lang.Throwable -> L2c
                goto L2f
            L2c:
                r12 = move-exception
                goto La9
            L2f:
                com.mbridge.msdk.thrid.okio.c r3 = r11.f17921b     // Catch: java.lang.Throwable -> L2c
                long r5 = r3.size()     // Catch: java.lang.Throwable -> L2c
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                r5 = -1
                if (r3 <= 0) goto L71
                com.mbridge.msdk.thrid.okio.c r3 = r11.f17921b     // Catch: java.lang.Throwable -> L2c
                long r7 = r3.size()     // Catch: java.lang.Throwable -> L2c
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> L2c
                long r12 = r3.b(r12, r13)     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                long r7 = r14.f17903a     // Catch: java.lang.Throwable -> L2c
                long r7 = r7 + r12
                r14.f17903a = r7     // Catch: java.lang.Throwable -> L2c
                if (r4 != 0) goto L88
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r14 = r14.f17906d     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.m r14 = r14.f17841t     // Catch: java.lang.Throwable -> L2c
                int r14 = r14.c()     // Catch: java.lang.Throwable -> L2c
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L2c
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L88
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r3 = r14.f17906d     // Catch: java.lang.Throwable -> L2c
                int r7 = r14.f17905c     // Catch: java.lang.Throwable -> L2c
                long r8 = r14.f17903a     // Catch: java.lang.Throwable -> L2c
                r3.a(r7, r8)     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                r14.f17903a = r0     // Catch: java.lang.Throwable -> L2c
                goto L88
            L71:
                boolean r3 = r11.f17924e     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L87
                if (r4 != 0) goto L87
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                r3.k()     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r3 = r3.f17911i     // Catch: java.lang.Throwable -> L85
                r3.k()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                goto L6
            L85:
                r12 = move-exception
                goto Lb1
            L87:
                r12 = r5
            L88:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r14 = r14.f17911i     // Catch: java.lang.Throwable -> L85
                r14.k()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L98
                r11.f(r12)
                return r12
            L98:
                if (r4 != 0) goto L9b
                return r5
            L9b:
                com.mbridge.msdk.thrid.okhttp.internal.http2.n r12 = new com.mbridge.msdk.thrid.okhttp.internal.http2.n
                r12.<init>(r4)
                throw r12
            La1:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L2c
                throw r12     // Catch: java.lang.Throwable -> L2c
            La9:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r13 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r13 = r13.f17911i     // Catch: java.lang.Throwable -> L85
                r13.k()     // Catch: java.lang.Throwable -> L85
                throw r12     // Catch: java.lang.Throwable -> L85
            Lb1:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                throw r12
            Lb3:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.b.b(com.mbridge.msdk.thrid.okio.c, long):long");
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                try {
                    this.f17923d = true;
                    size = this.f17921b.size();
                    this.f17921b.k();
                    if (!i.this.f17907e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f17911i;
        }
    }

    public void a(long j10) {
        this.f17904b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }
}
