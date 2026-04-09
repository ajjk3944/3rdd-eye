package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pq1;
import ia.C4468d;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class w50 {

    /* renamed from: a, reason: collision with root package name */
    private final tn1 f34811a;

    /* renamed from: b, reason: collision with root package name */
    private final r50 f34812b;

    /* renamed from: c, reason: collision with root package name */
    private final y50 f34813c;

    /* renamed from: d, reason: collision with root package name */
    private final x50 f34814d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34815e;

    /* renamed from: f, reason: collision with root package name */
    private final un1 f34816f;

    public final class a extends ia.j {

        /* renamed from: a, reason: collision with root package name */
        private final long f34817a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34818b;

        /* renamed from: c, reason: collision with root package name */
        private long f34819c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w50 f34821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w50 w50Var, ia.A delegate, long j4) {
            super(delegate);
            kotlin.jvm.internal.l.f(delegate, "delegate");
            this.f34821e = w50Var;
            this.f34817a = j4;
        }

        @Override // ia.j, ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f34820d) {
                return;
            }
            this.f34820d = true;
            long j4 = this.f34817a;
            if (j4 != -1 && this.f34819c != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.f34818b) {
                    return;
                }
                this.f34818b = true;
                this.f34821e.a(false, true, null);
            } catch (IOException e4) {
                if (this.f34818b) {
                    throw e4;
                }
                this.f34818b = true;
                throw this.f34821e.a(false, true, e4);
            }
        }

        @Override // ia.j, ia.A, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                if (this.f34818b) {
                    throw e4;
                }
                this.f34818b = true;
                throw this.f34821e.a(false, true, e4);
            }
        }

        @Override // ia.j, ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.f34820d) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f34817a;
            if (j10 != -1 && this.f34819c + j4 > j10) {
                long j11 = this.f34817a;
                long j12 = this.f34819c + j4;
                StringBuilder sbJ = androidx.work.s.j("expected ", " bytes but received ", j11);
                sbJ.append(j12);
                throw new ProtocolException(sbJ.toString());
            }
            try {
                super.write(source, j4);
                this.f34819c += j4;
            } catch (IOException e4) {
                if (this.f34818b) {
                    throw e4;
                }
                this.f34818b = true;
                throw this.f34821e.a(false, true, e4);
            }
        }
    }

    public final class b extends ia.k {

        /* renamed from: a, reason: collision with root package name */
        private final long f34822a;

        /* renamed from: b, reason: collision with root package name */
        private long f34823b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34824c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34825d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f34826e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w50 f34827f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w50 w50Var, ia.C delegate, long j4) {
            super(delegate);
            kotlin.jvm.internal.l.f(delegate, "delegate");
            this.f34827f = w50Var;
            this.f34822a = j4;
            this.f34824c = true;
            if (j4 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e4) {
            if (this.f34825d) {
                return e4;
            }
            this.f34825d = true;
            if (e4 == null && this.f34824c) {
                this.f34824c = false;
                r50 r50VarG = this.f34827f.g();
                tn1 call = this.f34827f.e();
                r50VarG.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            }
            return (E) this.f34827f.a(true, false, e4);
        }

        @Override // ia.k, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f34826e) {
                return;
            }
            this.f34826e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // ia.k, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (this.f34826e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, j4);
                if (this.f34824c) {
                    this.f34824c = false;
                    r50 r50VarG = this.f34827f.g();
                    tn1 tn1VarE = this.f34827f.e();
                    r50VarG.getClass();
                    r50.a(tn1VarE);
                }
                if (j10 == -1) {
                    a(null);
                    return -1L;
                }
                long j11 = this.f34823b + j10;
                long j12 = this.f34822a;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f34822a + " bytes but received " + j11);
                }
                this.f34823b = j11;
                if (j11 == j12) {
                    a(null);
                }
                return j10;
            } catch (IOException e4) {
                throw a(e4);
            }
        }
    }

    public w50(tn1 call, r50 eventListener, y50 finder, x50 codec) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        kotlin.jvm.internal.l.f(finder, "finder");
        kotlin.jvm.internal.l.f(codec, "codec");
        this.f34811a = call;
        this.f34812b = eventListener;
        this.f34813c = finder;
        this.f34814d = codec;
        this.f34816f = codec.c();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            this.f34813c.a(iOException);
            this.f34814d.c().a(this.f34811a, iOException);
        }
        if (z11) {
            if (iOException != null) {
                r50 r50Var = this.f34812b;
                tn1 call = this.f34811a;
                r50Var.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            } else {
                r50 r50Var2 = this.f34812b;
                tn1 call2 = this.f34811a;
                r50Var2.getClass();
                kotlin.jvm.internal.l.f(call2, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                r50 r50Var3 = this.f34812b;
                tn1 call3 = this.f34811a;
                r50Var3.getClass();
                kotlin.jvm.internal.l.f(call3, "call");
            } else {
                r50 r50Var4 = this.f34812b;
                tn1 call4 = this.f34811a;
                r50Var4.getClass();
                kotlin.jvm.internal.l.f(call4, "call");
            }
        }
        return this.f34811a.a(this, z11, z10, iOException);
    }

    public final void b() {
        this.f34814d.cancel();
        this.f34811a.a(this, true, true, null);
    }

    public final void c() throws IOException {
        try {
            this.f34814d.a();
        } catch (IOException e4) {
            r50 r50Var = this.f34812b;
            tn1 call = this.f34811a;
            r50Var.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            this.f34813c.a(e4);
            this.f34814d.c().a(this.f34811a, e4);
            throw e4;
        }
    }

    public final void d() throws IOException {
        try {
            this.f34814d.b();
        } catch (IOException e4) {
            r50 r50Var = this.f34812b;
            tn1 call = this.f34811a;
            r50Var.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            this.f34813c.a(e4);
            this.f34814d.c().a(this.f34811a, e4);
            throw e4;
        }
    }

    public final tn1 e() {
        return this.f34811a;
    }

    public final un1 f() {
        return this.f34816f;
    }

    public final r50 g() {
        return this.f34812b;
    }

    public final y50 h() {
        return this.f34813c;
    }

    public final boolean i() {
        return !kotlin.jvm.internal.l.b(this.f34813c.a().k().g(), this.f34816f.k().a().k().g());
    }

    public final boolean j() {
        return this.f34815e;
    }

    public final void k() {
        this.f34814d.c().j();
    }

    public final void l() {
        this.f34811a.a(this, true, false, null);
    }

    public final void m() {
        r50 r50Var = this.f34812b;
        tn1 call = this.f34811a;
        r50Var.getClass();
        kotlin.jvm.internal.l.f(call, "call");
    }

    public final void b(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        r50 r50Var = this.f34812b;
        tn1 call = this.f34811a;
        r50Var.getClass();
        kotlin.jvm.internal.l.f(call, "call");
    }

    public final void b(pp1 request) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        try {
            r50 r50Var = this.f34812b;
            tn1 call = this.f34811a;
            r50Var.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            this.f34814d.a(request);
            r50 r50Var2 = this.f34812b;
            tn1 call2 = this.f34811a;
            r50Var2.getClass();
            kotlin.jvm.internal.l.f(call2, "call");
        } catch (IOException e4) {
            r50 r50Var3 = this.f34812b;
            tn1 call3 = this.f34811a;
            r50Var3.getClass();
            kotlin.jvm.internal.l.f(call3, "call");
            this.f34813c.a(e4);
            this.f34814d.c().a(this.f34811a, e4);
            throw e4;
        }
    }

    public final void a() {
        this.f34814d.cancel();
    }

    public final ia.A a(pp1 request) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        this.f34815e = false;
        sp1 sp1VarA = request.a();
        kotlin.jvm.internal.l.c(sp1VarA);
        long jA = sp1VarA.a();
        r50 r50Var = this.f34812b;
        tn1 call = this.f34811a;
        r50Var.getClass();
        kotlin.jvm.internal.l.f(call, "call");
        return new a(this, this.f34814d.a(request, jA), jA);
    }

    public final yn1 a(pq1 response) throws IOException {
        kotlin.jvm.internal.l.f(response, "response");
        try {
            String strA = pq1.a(response, "Content-Type");
            long jB = this.f34814d.b(response);
            return new yn1(strA, jB, ia.q.c(new b(this, this.f34814d.a(response), jB)));
        } catch (IOException e4) {
            r50 r50Var = this.f34812b;
            tn1 call = this.f34811a;
            r50Var.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            this.f34813c.a(e4);
            this.f34814d.c().a(this.f34811a, e4);
            throw e4;
        }
    }

    public final pq1.a a(boolean z10) throws IOException {
        try {
            pq1.a aVarA = this.f34814d.a(z10);
            if (aVarA == null) {
                return aVarA;
            }
            aVarA.a(this);
            return aVarA;
        } catch (IOException e4) {
            r50 r50Var = this.f34812b;
            tn1 call = this.f34811a;
            r50Var.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            this.f34813c.a(e4);
            this.f34814d.c().a(this.f34811a, e4);
            throw e4;
        }
    }
}
