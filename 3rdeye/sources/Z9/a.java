package Z9;

import U9.D;
import U9.E;
import U9.F;
import U9.l;
import U9.s;
import U9.t;
import U9.u;
import U9.v;
import U9.z;
import ia.n;
import ia.q;
import java.io.IOException;

/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final l f14064a;

    public a(l cookieJar) {
        kotlin.jvm.internal.l.f(cookieJar, "cookieJar");
        this.f14064a = cookieJar;
    }

    @Override // U9.u
    public final E intercept(u.a aVar) throws IOException {
        F f10;
        f fVar = (f) aVar;
        z zVar = fVar.f14072e;
        z.a aVarA = zVar.a();
        D d10 = zVar.f12798d;
        if (d10 != null) {
            v vVarContentType = d10.contentType();
            if (vVarContentType != null) {
                aVarA.c("Content-Type", vVarContentType.f12731a);
            }
            long jContentLength = d10.contentLength();
            if (jContentLength != -1) {
                aVarA.c("Content-Length", String.valueOf(jContentLength));
                aVarA.f12803c.f("Transfer-Encoding");
            } else {
                aVarA.c("Transfer-Encoding", "chunked");
                aVarA.f12803c.f("Content-Length");
            }
        }
        s sVar = zVar.f12797c;
        String strC = sVar.c("Host");
        boolean z10 = false;
        t url = zVar.f12795a;
        if (strC == null) {
            aVarA.c("Host", V9.b.v(url, false));
        }
        if (sVar.c("Connection") == null) {
            aVarA.c("Connection", "Keep-Alive");
        }
        if (sVar.c("Accept-Encoding") == null && sVar.c("Range") == null) {
            aVarA.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        l lVar = this.f14064a;
        lVar.getClass();
        kotlin.jvm.internal.l.f(url, "url");
        if (sVar.c("User-Agent") == null) {
            aVarA.c("User-Agent", "okhttp/4.12.0");
        }
        E eA = fVar.a(aVarA.b());
        s sVar2 = eA.f12567g;
        e.b(lVar, url, sVar2);
        E.a aVarE = eA.e();
        aVarE.f12575a = zVar;
        if (z10 && "gzip".equalsIgnoreCase(E.c(eA, "Content-Encoding")) && e.a(eA) && (f10 = eA.f12568h) != null) {
            n nVar = new n(f10.source());
            s.a aVarE2 = sVar2.e();
            aVarE2.f("Content-Encoding");
            aVarE2.f("Content-Length");
            aVarE.c(aVarE2.d());
            aVarE.f12581g = new g(E.c(eA, "Content-Type"), -1L, q.c(nVar));
        }
        return aVarE.a();
    }
}
