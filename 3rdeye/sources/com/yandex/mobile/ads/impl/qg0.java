package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h22;
import com.yandex.mobile.ads.impl.pq1;
import g0.C4356c;
import ia.C4468d;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class qg0 implements x50 {

    /* renamed from: a, reason: collision with root package name */
    private final vd1 f32176a;

    /* renamed from: b, reason: collision with root package name */
    private final un1 f32177b;

    /* renamed from: c, reason: collision with root package name */
    private final ia.g f32178c;

    /* renamed from: d, reason: collision with root package name */
    private final ia.f f32179d;

    /* renamed from: e, reason: collision with root package name */
    private int f32180e;

    /* renamed from: f, reason: collision with root package name */
    private final lf0 f32181f;

    /* renamed from: g, reason: collision with root package name */
    private kf0 f32182g;

    public abstract class a implements ia.C {

        /* renamed from: a, reason: collision with root package name */
        private final ia.l f32183a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32184b;

        public a() {
            this.f32183a = new ia.l(qg0.this.f32178c.timeout());
        }

        public final boolean a() {
            return this.f32184b;
        }

        public final void b() {
            if (qg0.this.f32180e == 6) {
                return;
            }
            if (qg0.this.f32180e != 5) {
                throw new IllegalStateException(C4356c.h(qg0.this.f32180e, "state: "));
            }
            qg0.a(qg0.this, this.f32183a);
            qg0.this.f32180e = 6;
        }

        public final void c() {
            this.f32184b = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        @Override // ia.C
        public long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            try {
                return qg0.this.f32178c.read(sink, j4);
            } catch (IOException e4) {
                qg0.this.c().j();
                b();
                throw e4;
            }
        }

        @Override // ia.C
        public final ia.D timeout() {
            return this.f32183a;
        }
    }

    public final class b implements ia.A {

        /* renamed from: a, reason: collision with root package name */
        private final ia.l f32186a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32187b;

        public b() {
            this.f32186a = new ia.l(qg0.this.f32179d.timeout());
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f32187b) {
                return;
            }
            this.f32187b = true;
            qg0.this.f32179d.c0("0\r\n\r\n");
            qg0.a(qg0.this, this.f32186a);
            qg0.this.f32180e = 3;
        }

        @Override // ia.A, java.io.Flushable
        public final synchronized void flush() {
            if (this.f32187b) {
                return;
            }
            qg0.this.f32179d.flush();
        }

        @Override // ia.A
        public final ia.D timeout() {
            return this.f32186a;
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.f32187b) {
                throw new IllegalStateException("closed");
            }
            if (j4 == 0) {
                return;
            }
            qg0.this.f32179d.f0(j4);
            qg0.this.f32179d.c0("\r\n");
            qg0.this.f32179d.write(source, j4);
            qg0.this.f32179d.c0("\r\n");
        }
    }

    public final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        private final rh0 f32189d;

        /* renamed from: e, reason: collision with root package name */
        private long f32190e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32191f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ qg0 f32192g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qg0 qg0Var, rh0 url) {
            super();
            kotlin.jvm.internal.l.f(url, "url");
            this.f32192g = qg0Var;
            this.f32189d = url;
            this.f32190e = -1L;
            this.f32191f = true;
        }

        private final void d() throws IOException {
            if (this.f32190e != -1) {
                this.f32192g.f32178c.o0();
            }
            try {
                this.f32190e = this.f32192g.f32178c.J0();
                String string = y9.q.w0(this.f32192g.f32178c.o0()).toString();
                if (this.f32190e < 0 || (string.length() > 0 && !y9.n.a0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f32190e + string + "\"");
                }
                if (this.f32190e == 0) {
                    this.f32191f = false;
                    qg0 qg0Var = this.f32192g;
                    qg0Var.f32182g = qg0Var.f32181f.a();
                    vd1 vd1Var = this.f32192g.f32176a;
                    kotlin.jvm.internal.l.c(vd1Var);
                    ks ksVarH = vd1Var.h();
                    rh0 rh0Var = this.f32189d;
                    kf0 kf0Var = this.f32192g.f32182g;
                    kotlin.jvm.internal.l.c(kf0Var);
                    ih0.a(ksVarH, rh0Var, kf0Var);
                    b();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f32191f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = t82.f33480a;
                kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
                if (!t82.a(this, 100, timeUnit)) {
                    this.f32192g.c().j();
                    b();
                }
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f32191f) {
                return -1L;
            }
            long j10 = this.f32190e;
            if (j10 == 0 || j10 == -1) {
                d();
                if (!this.f32191f) {
                    return -1L;
                }
            }
            long j11 = super.read(sink, Math.min(j4, this.f32190e));
            if (j11 != -1) {
                this.f32190e -= j11;
                return j11;
            }
            this.f32192g.c().j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    public final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f32193d;

        public d(long j4) {
            super();
            this.f32193d = j4;
            if (j4 == 0) {
                b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f32193d != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = t82.f33480a;
                kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
                if (!t82.a(this, 100, timeUnit)) {
                    qg0.this.c().j();
                    b();
                }
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f32193d;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, j4));
            if (j11 == -1) {
                qg0.this.c().j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f32193d - j11;
            this.f32193d = j12;
            if (j12 == 0) {
                b();
            }
            return j11;
        }
    }

    public final class e implements ia.A {

        /* renamed from: a, reason: collision with root package name */
        private final ia.l f32195a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32196b;

        public e() {
            this.f32195a = new ia.l(qg0.this.f32179d.timeout());
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f32196b) {
                return;
            }
            this.f32196b = true;
            qg0.a(qg0.this, this.f32195a);
            qg0.this.f32180e = 3;
        }

        @Override // ia.A, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f32196b) {
                return;
            }
            qg0.this.f32179d.flush();
        }

        @Override // ia.A
        public final ia.D timeout() {
            return this.f32195a;
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.f32196b) {
                throw new IllegalStateException("closed");
            }
            long j10 = source.f38643c;
            byte[] bArr = t82.f33480a;
            if (j4 < 0 || 0 > j10 || j10 < j4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            qg0.this.f32179d.write(source, j4);
        }
    }

    public final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f32198d;

        public f(qg0 qg0Var) {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (!this.f32198d) {
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f32198d) {
                return -1L;
            }
            long j10 = super.read(sink, j4);
            if (j10 != -1) {
                return j10;
            }
            this.f32198d = true;
            b();
            return -1L;
        }
    }

    public qg0(vd1 vd1Var, un1 connection, ia.g source, ia.f sink) {
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(source, "source");
        kotlin.jvm.internal.l.f(sink, "sink");
        this.f32176a = vd1Var;
        this.f32177b = connection;
        this.f32178c = source;
        this.f32179d = sink;
        this.f32181f = new lf0(source);
    }

    public static final void a(qg0 qg0Var, ia.l lVar) {
        qg0Var.getClass();
        ia.D d10 = lVar.f38653b;
        ia.D delegate = ia.D.NONE;
        kotlin.jvm.internal.l.f(delegate, "delegate");
        lVar.f38653b = delegate;
        d10.clearDeadline();
        d10.clearTimeout();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void cancel() {
        this.f32177b.a();
    }

    private final ia.A d() {
        int i = this.f32180e;
        if (i != 1) {
            throw new IllegalStateException(C4356c.h(i, "state: ").toString());
        }
        this.f32180e = 2;
        return new b();
    }

    private final ia.A e() {
        int i = this.f32180e;
        if (i != 1) {
            throw new IllegalStateException(C4356c.h(i, "state: ").toString());
        }
        this.f32180e = 2;
        return new e();
    }

    private final ia.C f() {
        int i = this.f32180e;
        if (i != 4) {
            throw new IllegalStateException(C4356c.h(i, "state: ").toString());
        }
        this.f32180e = 5;
        this.f32177b.j();
        return new f(this);
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void b() throws IOException {
        this.f32179d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final un1 c() {
        return this.f32177b;
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final long b(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        if (!ih0.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(pq1.a(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return t82.a(response);
    }

    public final void c(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        long jA = t82.a(response);
        if (jA == -1) {
            return;
        }
        ia.C cA = a(jA);
        t82.a(cA, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((d) cA).close();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final ia.A a(pp1 request, long j4) {
        kotlin.jvm.internal.l.f(request, "request");
        if (request.a() != null) {
            request.a().getClass();
        }
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            return d();
        }
        if (j4 != -1) {
            return e();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void a() {
        this.f32179d.flush();
    }

    private final ia.C a(rh0 rh0Var) {
        int i = this.f32180e;
        if (i == 4) {
            this.f32180e = 5;
            return new c(this, rh0Var);
        }
        throw new IllegalStateException(C4356c.h(i, "state: ").toString());
    }

    private final ia.C a(long j4) {
        int i = this.f32180e;
        if (i == 4) {
            this.f32180e = 5;
            return new d(j4);
        }
        throw new IllegalStateException(C4356c.h(i, "state: ").toString());
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final ia.C a(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        if (!ih0.a(response)) {
            return a(0L);
        }
        if ("chunked".equalsIgnoreCase(pq1.a(response, "Transfer-Encoding"))) {
            return a(response.o().g());
        }
        long jA = t82.a(response);
        if (jA != -1) {
            return a(jA);
        }
        return f();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final pq1.a a(boolean z10) {
        int i = this.f32180e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(C4356c.h(i, "state: ").toString());
        }
        try {
            h22 h22VarA = h22.a.a(this.f32181f.b());
            pq1.a aVarA = new pq1.a().a(h22VarA.f28085a).a(h22VarA.f28086b).a(h22VarA.f28087c).a(this.f32181f.a());
            if (z10 && h22VarA.f28086b == 100) {
                return null;
            }
            if (h22VarA.f28086b == 100) {
                this.f32180e = 3;
                return aVarA;
            }
            this.f32180e = 4;
            return aVarA;
        } catch (EOFException e4) {
            throw new IOException(androidx.work.s.d("unexpected end of stream on ", this.f32177b.k().a().k().j()), e4);
        }
    }

    public final void a(kf0 headers, String requestLine) {
        kotlin.jvm.internal.l.f(headers, "headers");
        kotlin.jvm.internal.l.f(requestLine, "requestLine");
        int i = this.f32180e;
        if (i == 0) {
            this.f32179d.c0(requestLine).c0("\r\n");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f32179d.c0(headers.a(i10)).c0(": ").c0(headers.b(i10)).c0("\r\n");
            }
            this.f32179d.c0("\r\n");
            this.f32180e = 1;
            return;
        }
        throw new IllegalStateException(C4356c.h(i, "state: ").toString());
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void a(pp1 request) {
        kotlin.jvm.internal.l.f(request, "request");
        Proxy.Type type = this.f32177b.k().b().type();
        kotlin.jvm.internal.l.e(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f());
        sb.append(' ');
        if (!request.e() && type == Proxy.Type.HTTP) {
            sb.append(request.g());
        } else {
            sb.append(wp1.a(request.g()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        a(request.d(), string);
    }
}
