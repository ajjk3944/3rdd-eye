package com.mbridge.msdk.thrid.okhttp.internal.http1;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* renamed from: a, reason: collision with root package name */
    final v f17740a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f17741b;

    /* renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.e f17742c;

    /* renamed from: d, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.d f17743d;

    /* renamed from: e, reason: collision with root package name */
    int f17744e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f17745f = 262144;

    public abstract class b implements s {

        /* renamed from: a, reason: collision with root package name */
        protected final i f17746a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f17747b;

        /* renamed from: c, reason: collision with root package name */
        protected long f17748c;

        private b() {
            this.f17746a = new i(a.this.f17742c.b());
            this.f17748c = 0L;
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f17744e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f17744e);
            }
            aVar.a(this.f17746a);
            a aVar2 = a.this;
            aVar2.f17744e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f17741b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f17748c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f17746a;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f17742c.b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f17748c += jB;
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    public final class c implements r {

        /* renamed from: a, reason: collision with root package name */
        private final i f17750a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17751b;

        public c() {
            this.f17750a = new i(a.this.f17743d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f17751b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f17743d.a(j10);
            a.this.f17743d.a("\r\n");
            a.this.f17743d.a(cVar, j10);
            a.this.f17743d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f17750a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f17751b) {
                return;
            }
            this.f17751b = true;
            a.this.f17743d.a("0\r\n\r\n");
            a.this.a(this.f17750a);
            a.this.f17744e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f17751b) {
                return;
            }
            a.this.f17743d.flush();
        }
    }

    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f17753e;

        /* renamed from: f, reason: collision with root package name */
        private long f17754f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17755g;

        public d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f17754f = -1L;
            this.f17755g = true;
            this.f17753e = sVar;
        }

        private void d() throws IOException {
            if (this.f17754f != -1) {
                a.this.f17742c.c();
            }
            try {
                this.f17754f = a.this.f17742c.i();
                String strTrim = a.this.f17742c.c().trim();
                if (this.f17754f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17754f + strTrim + "\"");
                }
                if (this.f17754f == 0) {
                    this.f17755g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f17740a.i(), this.f17753e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f17747b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f17755g) {
                return -1L;
            }
            long j11 = this.f17754f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f17755g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f17754f));
            if (jB != -1) {
                this.f17754f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17747b) {
                return;
            }
            if (this.f17755g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f17747b = true;
        }
    }

    public final class e implements r {

        /* renamed from: a, reason: collision with root package name */
        private final i f17757a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17758b;

        /* renamed from: c, reason: collision with root package name */
        private long f17759c;

        public e(long j10) {
            this.f17757a = new i(a.this.f17743d.b());
            this.f17759c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f17758b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f17759c) {
                a.this.f17743d.a(cVar, j10);
                this.f17759c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f17759c + " bytes but received " + j10);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f17757a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17758b) {
                return;
            }
            this.f17758b = true;
            if (this.f17759c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f17757a);
            a.this.f17744e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f17758b) {
                return;
            }
            a.this.f17743d.flush();
        }
    }

    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f17761e;

        public f(long j10) throws IOException {
            super();
            this.f17761e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f17747b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f17761e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f17761e - jB;
            this.f17761e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17747b) {
                return;
            }
            if (this.f17761e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f17747b = true;
        }
    }

    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f17763e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f17747b) {
                throw new IllegalStateException("closed");
            }
            if (this.f17763e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f17763e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17747b) {
                return;
            }
            if (!this.f17763e) {
                a(false, null);
            }
            this.f17747b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f17740a = vVar;
        this.f17741b = gVar;
        this.f17742c = eVar;
        this.f17743d = dVar;
    }

    private String e() throws IOException {
        String strD = this.f17742c.d(this.f17745f);
        this.f17745f -= strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f17743d.flush();
    }

    public r c() {
        if (this.f17744e == 1) {
            this.f17744e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f17744e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f17741b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f17744e != 4) {
            throw new IllegalStateException("state: " + this.f17744e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f17741b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f17744e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(aVar, strE);
        }
    }

    public s b(long j10) throws IOException {
        if (this.f17744e == 4) {
            this.f17744e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f17744e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f17741b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f17741b;
        gVar.f17699f.responseBodyStart(gVar.f17698e);
        String strB = a0Var.b(CommonGatewayClient.HEADER_CONTENT_TYPE);
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f17743d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.f17744e == 0) {
            this.f17743d.a(str).a("\r\n");
            int iB = rVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f17743d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a("\r\n");
            }
            this.f17743d.a("\r\n");
            this.f17744e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f17744e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws NumberFormatException, IOException {
        int i10 = this.f17744e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f17744e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f17737a).a(kVarA.f17738b).a(kVarA.f17739c).a(f());
            if (z10 && kVarA.f17738b == 100) {
                return null;
            }
            if (kVarA.f17738b == 100) {
                this.f17744e = 3;
                return aVarA;
            }
            this.f17744e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f17741b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public com.mbridge.msdk.thrid.okio.r a(long j10) {
        if (this.f17744e == 1) {
            this.f17744e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f17744e);
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) throws IOException {
        if (this.f17744e == 4) {
            this.f17744e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f17744e);
    }

    public void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f18201d);
        tVarG.a();
        tVarG.b();
    }
}
