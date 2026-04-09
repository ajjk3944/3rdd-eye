package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f17811f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f17812g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final t.a f17813a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f17814b;

    /* renamed from: c, reason: collision with root package name */
    private final g f17815c;

    /* renamed from: d, reason: collision with root package name */
    private i f17816d;

    /* renamed from: e, reason: collision with root package name */
    private final w f17817e;

    public class a extends com.mbridge.msdk.thrid.okio.h {

        /* renamed from: b, reason: collision with root package name */
        boolean f17818b;

        /* renamed from: c, reason: collision with root package name */
        long f17819c;

        public a(s sVar) {
            super(sVar);
            this.f17818b = false;
            this.f17819c = 0L;
        }

        private void a(IOException iOException) throws IOException {
            if (this.f17818b) {
                return;
            }
            this.f17818b = true;
            f fVar = f.this;
            fVar.f17814b.a(false, fVar, this.f17819c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f17819c += jB;
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f17813a = aVar;
        this.f17814b = gVar;
        this.f17815c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f17817e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        return this.f17816d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f17815c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f17816d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public static List<c> b(y yVar) {
        com.mbridge.msdk.thrid.okhttp.r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f17780f, yVar.e()));
        arrayList.add(new c(c.f17781g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f17783i, strA));
        }
        arrayList.add(new c(c.f17782h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f17811f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.f17816d != null) {
            return;
        }
        i iVarA = this.f17815c.a(b(yVar), yVar.a() != null);
        this.f17816d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f17813a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f17816d.l().a(this.f17813a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f17816d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws NumberFormatException, IOException {
        a0.a aVarA = a(this.f17816d.j(), this.f17817e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static a0.a a(com.mbridge.msdk.thrid.okhttp.r rVar, w wVar) throws NumberFormatException, IOException {
        r.a aVar = new r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(":status")) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f17812g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f17738b).a(kVarA.f17739c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f17814b;
        gVar.f17699f.responseBodyStart(gVar.f17698e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b(CommonGatewayClient.HEADER_CONTENT_TYPE), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f17816d.e())));
    }
}
