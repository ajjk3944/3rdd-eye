package com.yandex.mobile.ads.impl;

import b9.C1992A;
import ia.C4466b;
import ia.C4468d;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zg0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f36469a;

    /* renamed from: b, reason: collision with root package name */
    private final sg0 f36470b;

    /* renamed from: c, reason: collision with root package name */
    private long f36471c;

    /* renamed from: d, reason: collision with root package name */
    private long f36472d;

    /* renamed from: e, reason: collision with root package name */
    private long f36473e;

    /* renamed from: f, reason: collision with root package name */
    private long f36474f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<kf0> f36475g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36476h;
    private final b i;

    /* renamed from: j, reason: collision with root package name */
    private final a f36477j;

    /* renamed from: k, reason: collision with root package name */
    private final c f36478k;

    /* renamed from: l, reason: collision with root package name */
    private final c f36479l;

    /* renamed from: m, reason: collision with root package name */
    private o50 f36480m;

    /* renamed from: n, reason: collision with root package name */
    private IOException f36481n;

    public final class b implements ia.C {

        /* renamed from: a, reason: collision with root package name */
        private final long f36486a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36487b;

        /* renamed from: c, reason: collision with root package name */
        private final C4468d f36488c = new C4468d();

        /* renamed from: d, reason: collision with root package name */
        private final C4468d f36489d = new C4468d();

        /* renamed from: e, reason: collision with root package name */
        private boolean f36490e;

        public b(long j4, boolean z10) {
            this.f36486a = j4;
            this.f36487b = z10;
        }

        public final boolean a() {
            return this.f36490e;
        }

        public final boolean b() {
            return this.f36487b;
        }

        public final void c() {
            this.f36487b = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j4;
            zg0 zg0Var = zg0.this;
            synchronized (zg0Var) {
                this.f36490e = true;
                C4468d c4468d = this.f36489d;
                j4 = c4468d.f38643c;
                c4468d.a();
                zg0Var.notifyAll();
                C1992A c1992a = C1992A.f18074a;
            }
            if (j4 > 0) {
                a(j4);
            }
            zg0.this.a();
        }

        @Override // ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            IOException iOExceptionE;
            boolean z10;
            long j10;
            kotlin.jvm.internal.l.f(sink, "sink");
            long j11 = 0;
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            while (true) {
                zg0 zg0Var = zg0.this;
                synchronized (zg0Var) {
                    zg0Var.i().enter();
                    try {
                        if (zg0Var.d() != null) {
                            iOExceptionE = zg0Var.e();
                            if (iOExceptionE == null) {
                                o50 o50VarD = zg0Var.d();
                                kotlin.jvm.internal.l.c(o50VarD);
                                iOExceptionE = new n22(o50VarD);
                            }
                        } else {
                            iOExceptionE = null;
                        }
                        if (this.f36490e) {
                            throw new IOException("stream closed");
                        }
                        C4468d c4468d = this.f36489d;
                        long j12 = c4468d.f38643c;
                        z10 = false;
                        if (j12 > j11) {
                            j10 = c4468d.read(sink, Math.min(j4, j12));
                            zg0Var.c(zg0Var.h() + j10);
                            long jH = zg0Var.h() - zg0Var.g();
                            if (iOExceptionE == null && jH >= zg0Var.c().g().b() / 2) {
                                zg0Var.c().a(zg0Var.f(), jH);
                                zg0Var.b(zg0Var.h());
                            }
                        } else {
                            if (!this.f36487b && iOExceptionE == null) {
                                zg0Var.t();
                                z10 = true;
                            }
                            j10 = -1;
                        }
                        zg0Var.i().a();
                        C1992A c1992a = C1992A.f18074a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (j10 != -1) {
                        a(j10);
                        return j10;
                    }
                    if (iOExceptionE == null) {
                        return -1L;
                    }
                    throw iOExceptionE;
                }
                j11 = 0;
            }
        }

        @Override // ia.C
        public final ia.D timeout() {
            return zg0.this.i();
        }

        public final void a(ia.g source, long j4) throws IOException {
            boolean z10;
            boolean z11;
            long j10;
            kotlin.jvm.internal.l.f(source, "source");
            zg0 zg0Var = zg0.this;
            if (t82.f33485f && Thread.holdsLock(zg0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zg0Var);
            }
            while (j4 > 0) {
                synchronized (zg0.this) {
                    z10 = this.f36487b;
                    z11 = this.f36489d.f38643c + j4 > this.f36486a;
                    C1992A c1992a = C1992A.f18074a;
                }
                if (z11) {
                    source.skip(j4);
                    zg0.this.a(o50.f31189g);
                    return;
                }
                if (z10) {
                    source.skip(j4);
                    return;
                }
                long j11 = source.read(this.f36488c, j4);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j4 -= j11;
                zg0 zg0Var2 = zg0.this;
                synchronized (zg0Var2) {
                    try {
                        if (this.f36490e) {
                            C4468d c4468d = this.f36488c;
                            j10 = c4468d.f38643c;
                            c4468d.a();
                        } else {
                            C4468d c4468d2 = this.f36489d;
                            boolean z12 = c4468d2.f38643c == 0;
                            c4468d2.X(this.f36488c);
                            if (z12) {
                                zg0Var2.notifyAll();
                            }
                            j10 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (j10 > 0) {
                    a(j10);
                }
            }
        }

        private final void a(long j4) {
            zg0 zg0Var = zg0.this;
            if (t82.f33485f && Thread.holdsLock(zg0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zg0Var);
            }
            zg0.this.c().b(j4);
        }
    }

    public final class c extends C4466b {
        public c() {
        }

        public final void a() throws IOException {
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
            zg0.this.a(o50.i);
            zg0.this.c().l();
        }
    }

    public zg0(int i, sg0 connection, boolean z10, boolean z11, kf0 kf0Var) {
        kotlin.jvm.internal.l.f(connection, "connection");
        this.f36469a = i;
        this.f36470b = connection;
        this.f36474f = connection.h().b();
        ArrayDeque<kf0> arrayDeque = new ArrayDeque<>();
        this.f36475g = arrayDeque;
        this.i = new b(connection.g().b(), z11);
        this.f36477j = new a(z10);
        this.f36478k = new c();
        this.f36479l = new c();
        if (kf0Var == null) {
            if (!p()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (p()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kf0Var);
        }
    }

    public final void a(long j4) {
        this.f36474f += j4;
        if (j4 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        if (this.f36477j.a()) {
            throw new IOException("stream closed");
        }
        if (this.f36477j.b()) {
            throw new IOException("stream finished");
        }
        if (this.f36480m != null) {
            IOException iOException = this.f36481n;
            if (iOException != null) {
                throw iOException;
            }
            o50 o50Var = this.f36480m;
            kotlin.jvm.internal.l.c(o50Var);
            throw new n22(o50Var);
        }
    }

    public final sg0 c() {
        return this.f36470b;
    }

    public final synchronized o50 d() {
        return this.f36480m;
    }

    public final IOException e() {
        return this.f36481n;
    }

    public final int f() {
        return this.f36469a;
    }

    public final long g() {
        return this.f36472d;
    }

    public final long h() {
        return this.f36471c;
    }

    public final c i() {
        return this.f36478k;
    }

    public final a j() {
        synchronized (this) {
            try {
                if (!this.f36476h && !p()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f36477j;
    }

    public final a k() {
        return this.f36477j;
    }

    public final b l() {
        return this.i;
    }

    public final long m() {
        return this.f36474f;
    }

    public final long n() {
        return this.f36473e;
    }

    public final c o() {
        return this.f36479l;
    }

    public final boolean p() {
        return this.f36470b.b() == ((this.f36469a & 1) == 1);
    }

    public final synchronized boolean q() {
        try {
            if (this.f36480m != null) {
                return false;
            }
            if (this.i.b() || this.i.a()) {
                if (this.f36477j.b() || this.f36477j.a()) {
                    if (this.f36476h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c r() {
        return this.f36478k;
    }

    public final synchronized kf0 s() throws IOException {
        kf0 kf0VarRemoveFirst;
        this.f36478k.enter();
        while (this.f36475g.isEmpty() && this.f36480m == null) {
            try {
                t();
            } catch (Throwable th) {
                this.f36478k.a();
                throw th;
            }
        }
        this.f36478k.a();
        if (this.f36475g.isEmpty()) {
            IOException iOException = this.f36481n;
            if (iOException != null) {
                throw iOException;
            }
            o50 o50Var = this.f36480m;
            kotlin.jvm.internal.l.c(o50Var);
            throw new n22(o50Var);
        }
        kf0VarRemoveFirst = this.f36475g.removeFirst();
        kotlin.jvm.internal.l.e(kf0VarRemoveFirst, "removeFirst(...)");
        return kf0VarRemoveFirst;
    }

    public final void t() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final c u() {
        return this.f36479l;
    }

    public final void c(long j4) {
        this.f36471c = j4;
    }

    public final void d(long j4) {
        this.f36473e = j4;
    }

    public final void a(o50 rstStatusCode, IOException iOException) throws IOException {
        kotlin.jvm.internal.l.f(rstStatusCode, "rstStatusCode");
        if (b(rstStatusCode, iOException)) {
            this.f36470b.b(this.f36469a, rstStatusCode);
        }
    }

    public final void a(o50 errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (b(errorCode, null)) {
            this.f36470b.c(this.f36469a, errorCode);
        }
    }

    public final synchronized void b(o50 errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (this.f36480m == null) {
            this.f36480m = errorCode;
            notifyAll();
        }
    }

    public final void a(ia.g source, int i) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.i.a(source, i);
    }

    public final void b(long j4) {
        this.f36472d = j4;
    }

    private final boolean b(o50 o50Var, IOException iOException) {
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f36480m != null) {
                return false;
            }
            if (this.i.b() && this.f36477j.b()) {
                return false;
            }
            this.f36480m = o50Var;
            this.f36481n = iOException;
            notifyAll();
            C1992A c1992a = C1992A.f18074a;
            this.f36470b.c(this.f36469a);
            return true;
        }
    }

    public final void a(kf0 headers, boolean z10) {
        boolean zQ;
        kotlin.jvm.internal.l.f(headers, "headers");
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f36476h && z10) {
                    this.i.getClass();
                } else {
                    this.f36476h = true;
                    this.f36475g.add(headers);
                }
                if (z10) {
                    this.i.c();
                }
                zQ = q();
                notifyAll();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zQ) {
            return;
        }
        this.f36470b.c(this.f36469a);
    }

    public final class a implements ia.A {

        /* renamed from: a, reason: collision with root package name */
        private boolean f36482a;

        /* renamed from: b, reason: collision with root package name */
        private final C4468d f36483b = new C4468d();

        /* renamed from: c, reason: collision with root package name */
        private boolean f36484c;

        public a(boolean z10) {
            this.f36482a = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            zg0 zg0Var = zg0.this;
            synchronized (zg0Var) {
                try {
                    zg0Var.o().enter();
                    while (zg0Var.n() >= zg0Var.m() && !this.f36482a && !this.f36484c && zg0Var.d() == null) {
                        try {
                            zg0Var.t();
                        } catch (Throwable th) {
                            zg0Var.o().a();
                            throw th;
                        }
                    }
                    zg0Var.o().a();
                    zg0Var.b();
                    jMin = Math.min(zg0Var.m() - zg0Var.n(), this.f36483b.f38643c);
                    zg0Var.d(zg0Var.n() + jMin);
                    z11 = z10 && jMin == this.f36483b.f38643c;
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zg0.this.o().enter();
            try {
                zg0.this.c().a(zg0.this.f(), z11, this.f36483b, jMin);
            } finally {
                zg0.this.o().a();
            }
        }

        public final boolean b() {
            return this.f36482a;
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            zg0 zg0Var = zg0.this;
            if (t82.f33485f && Thread.holdsLock(zg0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zg0Var);
            }
            zg0 zg0Var2 = zg0.this;
            synchronized (zg0Var2) {
                if (this.f36484c) {
                    return;
                }
                boolean z10 = zg0Var2.d() == null;
                C1992A c1992a = C1992A.f18074a;
                if (!zg0.this.k().f36482a) {
                    if (this.f36483b.f38643c > 0) {
                        while (this.f36483b.f38643c > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        zg0.this.c().a(zg0.this.f(), true, (C4468d) null, 0L);
                    }
                }
                synchronized (zg0.this) {
                    this.f36484c = true;
                    C1992A c1992a2 = C1992A.f18074a;
                }
                zg0.this.c().flush();
                zg0.this.a();
            }
        }

        @Override // ia.A, java.io.Flushable
        public final void flush() throws IOException {
            zg0 zg0Var = zg0.this;
            if (t82.f33485f && Thread.holdsLock(zg0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zg0Var);
            }
            zg0 zg0Var2 = zg0.this;
            synchronized (zg0Var2) {
                zg0Var2.b();
                C1992A c1992a = C1992A.f18074a;
            }
            while (this.f36483b.f38643c > 0) {
                a(false);
                zg0.this.c().flush();
            }
        }

        @Override // ia.A
        public final ia.D timeout() {
            return zg0.this.o();
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            zg0 zg0Var = zg0.this;
            if (!t82.f33485f || !Thread.holdsLock(zg0Var)) {
                this.f36483b.write(source, j4);
                while (this.f36483b.f38643c >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zg0Var);
            }
        }

        public final boolean a() {
            return this.f36484c;
        }
    }

    public final void a() throws IOException {
        boolean z10;
        boolean zQ;
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.i.b() && this.i.a() && (this.f36477j.b() || this.f36477j.a());
                zQ = q();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            if (zQ) {
                return;
            }
            this.f36470b.c(this.f36469a);
        } else {
            o50 rstStatusCode = o50.i;
            kotlin.jvm.internal.l.f(rstStatusCode, "rstStatusCode");
            if (b(rstStatusCode, null)) {
                this.f36470b.b(this.f36469a, rstStatusCode);
            }
        }
    }
}
