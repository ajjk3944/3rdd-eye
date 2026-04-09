package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h22;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.zg0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class xg0 implements x50 {

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f35293g = t82.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f35294h = t82.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final un1 f35295a;

    /* renamed from: b, reason: collision with root package name */
    private final xn1 f35296b;

    /* renamed from: c, reason: collision with root package name */
    private final sg0 f35297c;

    /* renamed from: d, reason: collision with root package name */
    private volatile zg0 f35298d;

    /* renamed from: e, reason: collision with root package name */
    private final gm1 f35299e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f35300f;

    public static final class a {
        public static pq1.a a(kf0 headerBlock, gm1 protocol) throws NumberFormatException, IOException {
            kotlin.jvm.internal.l.f(headerBlock, "headerBlock");
            kotlin.jvm.internal.l.f(protocol, "protocol");
            kf0.a aVar = new kf0.a();
            int size = headerBlock.size();
            h22 h22VarA = null;
            for (int i = 0; i < size; i++) {
                String strA = headerBlock.a(i);
                String strB = headerBlock.b(i);
                if (kotlin.jvm.internal.l.b(strA, ":status")) {
                    h22VarA = h22.a.a("HTTP/1.1 " + strB);
                } else if (!xg0.f35294h.contains(strA)) {
                    aVar.a(strA, strB);
                }
            }
            if (h22VarA != null) {
                return new pq1.a().a(protocol).a(h22VarA.f28086b).a(h22VarA.f28087c).a(aVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public xg0(vd1 client, un1 connection, xn1 chain, sg0 http2Connection) {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(chain, "chain");
        kotlin.jvm.internal.l.f(http2Connection, "http2Connection");
        this.f35295a = connection;
        this.f35296b = chain;
        this.f35297c = http2Connection;
        List<gm1> listR = client.r();
        gm1 gm1Var = gm1.f27821h;
        this.f35299e = listR.contains(gm1Var) ? gm1Var : gm1.f27820g;
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final ia.A a(pp1 request, long j4) {
        kotlin.jvm.internal.l.f(request, "request");
        zg0 zg0Var = this.f35298d;
        kotlin.jvm.internal.l.c(zg0Var);
        return zg0Var.j();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void b() throws IOException {
        this.f35297c.flush();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final un1 c() {
        return this.f35295a;
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void cancel() {
        this.f35300f = true;
        zg0 zg0Var = this.f35298d;
        if (zg0Var != null) {
            zg0Var.a(o50.i);
        }
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final long b(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        if (ih0.a(response)) {
            return t82.a(response);
        }
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void a() throws IOException {
        zg0 zg0Var = this.f35298d;
        kotlin.jvm.internal.l.c(zg0Var);
        zg0Var.j().close();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final ia.C a(pq1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        zg0 zg0Var = this.f35298d;
        kotlin.jvm.internal.l.c(zg0Var);
        return zg0Var.l();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final pq1.a a(boolean z10) throws NumberFormatException, IOException {
        zg0 zg0Var = this.f35298d;
        kotlin.jvm.internal.l.c(zg0Var);
        pq1.a aVarA = a.a(zg0Var.s(), this.f35299e);
        if (z10 && aVarA.b() == 100) {
            return null;
        }
        return aVarA;
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void a(pp1 request) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        if (this.f35298d != null) {
            return;
        }
        boolean z10 = request.a() != null;
        kf0 kf0VarD = request.d();
        ArrayList arrayList = new ArrayList(kf0VarD.size() + 4);
        arrayList.add(new ff0(ff0.f27306f, request.f()));
        arrayList.add(new ff0(ff0.f27307g, wp1.a(request.g())));
        String strA = request.a("Host");
        if (strA != null) {
            arrayList.add(new ff0(ff0.i, strA));
        }
        arrayList.add(new ff0(ff0.f27308h, request.g().k()));
        int size = kf0VarD.size();
        for (int i = 0; i < size; i++) {
            String strA2 = kf0VarD.a(i);
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            String lowerCase = strA2.toLowerCase(US);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            if (!f35293g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.l.b(kf0VarD.b(i), "trailers"))) {
                arrayList.add(new ff0(lowerCase, kf0VarD.b(i)));
            }
        }
        this.f35298d = this.f35297c.a(arrayList, z10);
        if (!this.f35300f) {
            zg0 zg0Var = this.f35298d;
            kotlin.jvm.internal.l.c(zg0Var);
            zg0.c cVarR = zg0Var.r();
            long jE = this.f35296b.e();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVarR.timeout(jE, timeUnit);
            zg0 zg0Var2 = this.f35298d;
            kotlin.jvm.internal.l.c(zg0Var2);
            zg0Var2.u().timeout(this.f35296b.g(), timeUnit);
            return;
        }
        zg0 zg0Var3 = this.f35298d;
        kotlin.jvm.internal.l.c(zg0Var3);
        zg0Var3.a(o50.i);
        throw new IOException("Canceled");
    }
}
