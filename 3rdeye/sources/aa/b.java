package aa;

import U9.E;
import U9.s;
import U9.t;
import U9.x;
import U9.y;
import U9.z;
import Y9.g;
import Z9.i;
import ia.A;
import ia.C;
import ia.C4468d;
import ia.D;
import ia.l;
import ia.v;
import ia.w;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class b implements Z9.d {

    /* renamed from: a, reason: collision with root package name */
    public final x f14256a;

    /* renamed from: b, reason: collision with root package name */
    public final g f14257b;

    /* renamed from: c, reason: collision with root package name */
    public final w f14258c;

    /* renamed from: d, reason: collision with root package name */
    public final v f14259d;

    /* renamed from: e, reason: collision with root package name */
    public int f14260e;

    /* renamed from: f, reason: collision with root package name */
    public final aa.a f14261f;

    /* renamed from: g, reason: collision with root package name */
    public s f14262g;

    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements C {

        /* renamed from: b, reason: collision with root package name */
        public final l f14263b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14264c;

        public a() {
            this.f14263b = new l(b.this.f14258c.f38684b.timeout());
        }

        public final void a() {
            b bVar = b.this;
            int i = bVar.f14260e;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                b.i(bVar, this.f14263b);
                bVar.f14260e = 6;
            } else {
                throw new IllegalStateException("state: " + bVar.f14260e);
            }
        }

        @Override // ia.C
        public long read(C4468d sink, long j4) throws IOException {
            b bVar = b.this;
            kotlin.jvm.internal.l.f(sink, "sink");
            try {
                return bVar.f14258c.read(sink, j4);
            } catch (IOException e4) {
                bVar.f14257b.l();
                a();
                throw e4;
            }
        }

        @Override // ia.C
        public final D timeout() {
            return this.f14263b;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: aa.b$b, reason: collision with other inner class name */
    public final class C0226b implements A {

        /* renamed from: b, reason: collision with root package name */
        public final l f14266b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14267c;

        public C0226b() {
            this.f14266b = new l(b.this.f14259d.f38681b.timeout());
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f14267c) {
                return;
            }
            this.f14267c = true;
            b.this.f14259d.c0("0\r\n\r\n");
            b.i(b.this, this.f14266b);
            b.this.f14260e = 3;
        }

        @Override // ia.A, java.io.Flushable
        public final synchronized void flush() {
            if (this.f14267c) {
                return;
            }
            b.this.f14259d.flush();
        }

        @Override // ia.A
        public final D timeout() {
            return this.f14266b;
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.f14267c) {
                throw new IllegalStateException("closed");
            }
            if (j4 == 0) {
                return;
            }
            b bVar = b.this;
            bVar.f14259d.f0(j4);
            v vVar = bVar.f14259d;
            vVar.c0("\r\n");
            vVar.write(source, j4);
            vVar.c0("\r\n");
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public final t f14269e;

        /* renamed from: f, reason: collision with root package name */
        public long f14270f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f14271g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f14272h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, t url) {
            super();
            kotlin.jvm.internal.l.f(url, "url");
            this.f14272h = bVar;
            this.f14269e = url;
            this.f14270f = -1L;
            this.f14271g = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14264c) {
                return;
            }
            if (this.f14271g) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!V9.b.g(this)) {
                    this.f14272h.f14257b.l();
                    a();
                }
            }
            this.f14264c = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
        
            if (r10.f14271g == false) goto L34;
         */
        @Override // aa.b.a, ia.C
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long read(ia.C4468d r11, long r12) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: aa.b.c.read(ia.d, long):long");
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public long f14273e;

        public d(long j4) {
            super();
            this.f14273e = j4;
            if (j4 == 0) {
                a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14264c) {
                return;
            }
            if (this.f14273e != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!V9.b.g(this)) {
                    b.this.f14257b.l();
                    a();
                }
            }
            this.f14264c = true;
        }

        @Override // aa.b.a, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            if (this.f14264c) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f14273e;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, j4));
            if (j11 == -1) {
                b.this.f14257b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j12 = this.f14273e - j11;
            this.f14273e = j12;
            if (j12 == 0) {
                a();
            }
            return j11;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class e implements A {

        /* renamed from: b, reason: collision with root package name */
        public final l f14275b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14276c;

        public e() {
            this.f14275b = new l(b.this.f14259d.f38681b.timeout());
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14276c) {
                return;
            }
            this.f14276c = true;
            b bVar = b.this;
            b.i(bVar, this.f14275b);
            bVar.f14260e = 3;
        }

        @Override // ia.A, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f14276c) {
                return;
            }
            b.this.f14259d.flush();
        }

        @Override // ia.A
        public final D timeout() {
            return this.f14275b;
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.f14276c) {
                throw new IllegalStateException("closed");
            }
            long j10 = source.f38643c;
            byte[] bArr = V9.b.f13053a;
            if (j4 < 0 || 0 > j10 || j10 < j4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            b.this.f14259d.write(source, j4);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f14278e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14264c) {
                return;
            }
            if (!this.f14278e) {
                a();
            }
            this.f14264c = true;
        }

        @Override // aa.b.a, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
            }
            if (this.f14264c) {
                throw new IllegalStateException("closed");
            }
            if (this.f14278e) {
                return -1L;
            }
            long j10 = super.read(sink, j4);
            if (j10 != -1) {
                return j10;
            }
            this.f14278e = true;
            a();
            return -1L;
        }
    }

    public b(x xVar, g connection, w source, v sink) {
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(source, "source");
        kotlin.jvm.internal.l.f(sink, "sink");
        this.f14256a = xVar;
        this.f14257b = connection;
        this.f14258c = source;
        this.f14259d = sink;
        this.f14261f = new aa.a(source);
    }

    public static final void i(b bVar, l lVar) {
        bVar.getClass();
        D d10 = lVar.f38653b;
        D delegate = D.NONE;
        kotlin.jvm.internal.l.f(delegate, "delegate");
        lVar.f38653b = delegate;
        d10.clearDeadline();
        d10.clearTimeout();
    }

    @Override // Z9.d
    public final void a() {
        this.f14259d.flush();
    }

    @Override // Z9.d
    public final void b(z zVar) {
        Proxy.Type type = this.f14257b.f13857b.f12595b.type();
        kotlin.jvm.internal.l.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.f12796b);
        sb.append(' ');
        t tVar = zVar.f12795a;
        if (tVar.f12720j || type != Proxy.Type.HTTP) {
            String strB = tVar.b();
            String strD = tVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(tVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        k(zVar.f12797c, string);
    }

    @Override // Z9.d
    public final E.a c(boolean z10) {
        aa.a aVar = this.f14261f;
        int i = this.f14260e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f14260e).toString());
        }
        try {
            String strS = aVar.f14254a.S(aVar.f14255b);
            aVar.f14255b -= strS.length();
            i iVarA = i.a.a(strS);
            int i10 = iVarA.f14081b;
            E.a aVar2 = new E.a();
            y protocol = iVarA.f14080a;
            kotlin.jvm.internal.l.f(protocol, "protocol");
            aVar2.f12576b = protocol;
            aVar2.f12577c = i10;
            aVar2.f12578d = iVarA.f14082c;
            s.a aVar3 = new s.a();
            while (true) {
                String strS2 = aVar.f14254a.S(aVar.f14255b);
                aVar.f14255b -= strS2.length();
                if (strS2.length() == 0) {
                    break;
                }
                aVar3.b(strS2);
            }
            aVar2.c(aVar3.d());
            if (z10 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f14260e = 3;
                return aVar2;
            }
            if (102 > i10 || i10 >= 200) {
                this.f14260e = 4;
                return aVar2;
            }
            this.f14260e = 3;
            return aVar2;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on ".concat(this.f14257b.f13857b.f12594a.f12604h.h()), e4);
        }
    }

    @Override // Z9.d
    public final void cancel() throws IOException {
        Socket socket = this.f14257b.f13858c;
        if (socket != null) {
            V9.b.d(socket);
        }
    }

    @Override // Z9.d
    public final A d(z zVar, long j4) throws ProtocolException {
        U9.D d10 = zVar.f12798d;
        if (d10 != null && d10.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(zVar.f12797c.c("Transfer-Encoding"))) {
            if (this.f14260e == 1) {
                this.f14260e = 2;
                return new C0226b();
            }
            throw new IllegalStateException(("state: " + this.f14260e).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f14260e == 1) {
            this.f14260e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.f14260e).toString());
    }

    @Override // Z9.d
    public final g e() {
        return this.f14257b;
    }

    @Override // Z9.d
    public final C f(E e4) {
        if (!Z9.e.a(e4)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(E.c(e4, "Transfer-Encoding"))) {
            t tVar = e4.f12562b.f12795a;
            if (this.f14260e == 4) {
                this.f14260e = 5;
                return new c(this, tVar);
            }
            throw new IllegalStateException(("state: " + this.f14260e).toString());
        }
        long j4 = V9.b.j(e4);
        if (j4 != -1) {
            return j(j4);
        }
        if (this.f14260e == 4) {
            this.f14260e = 5;
            this.f14257b.l();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f14260e).toString());
    }

    @Override // Z9.d
    public final void g() throws IOException {
        this.f14259d.flush();
    }

    @Override // Z9.d
    public final long h(E e4) {
        if (!Z9.e.a(e4)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(E.c(e4, "Transfer-Encoding"))) {
            return -1L;
        }
        return V9.b.j(e4);
    }

    public final d j(long j4) {
        if (this.f14260e == 4) {
            this.f14260e = 5;
            return new d(j4);
        }
        throw new IllegalStateException(("state: " + this.f14260e).toString());
    }

    public final void k(s sVar, String requestLine) {
        kotlin.jvm.internal.l.f(requestLine, "requestLine");
        if (this.f14260e != 0) {
            throw new IllegalStateException(("state: " + this.f14260e).toString());
        }
        v vVar = this.f14259d;
        vVar.c0(requestLine);
        vVar.c0("\r\n");
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            vVar.c0(sVar.d(i));
            vVar.c0(": ");
            vVar.c0(sVar.f(i));
            vVar.c0("\r\n");
        }
        vVar.c0("\r\n");
        this.f14260e = 1;
    }
}
