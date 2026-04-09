package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.pq1;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class xl implements zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final ks f35345a;

    public xl(ks cookieJar) {
        kotlin.jvm.internal.l.f(cookieJar, "cookieJar");
        this.f35345a = cookieJar;
    }

    @Override // com.yandex.mobile.ads.impl.zo0
    public final pq1 a(xn1 chain) throws IOException {
        boolean z10;
        tq1 tq1VarA;
        kotlin.jvm.internal.l.f(chain, "chain");
        pp1 pp1VarI = chain.i();
        pp1VarI.getClass();
        pp1.a aVar = new pp1.a(pp1VarI);
        sp1 sp1VarA = pp1VarI.a();
        if (sp1VarA != null) {
            qw0 qw0VarB = sp1VarA.b();
            if (qw0VarB != null) {
                aVar.b("Content-Type", qw0VarB.toString());
            }
            long jA = sp1VarA.a();
            if (jA != -1) {
                aVar.b("Content-Length", String.valueOf(jA));
                aVar.a("Transfer-Encoding");
            } else {
                aVar.b("Transfer-Encoding", "chunked");
                aVar.a("Content-Length");
            }
        }
        int i = 0;
        if (pp1VarI.a("Host") == null) {
            aVar.b("Host", t82.a(pp1VarI.g(), false));
        }
        if (pp1VarI.a("Connection") == null) {
            aVar.b("Connection", "Keep-Alive");
        }
        if (pp1VarI.a("Accept-Encoding") == null && pp1VarI.a("Range") == null) {
            aVar.b("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        List<is> listA = this.f35345a.a(pp1VarI.g());
        if (!listA.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listA) {
                int i10 = i + 1;
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                is isVar = (is) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(isVar.e());
                sb.append('=');
                sb.append(isVar.f());
                i = i10;
            }
            String string = sb.toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            aVar.b("Cookie", string);
        }
        if (pp1VarI.a("User-Agent") == null) {
            aVar.b("User-Agent", "okhttp/4.9.3");
        }
        pq1 pq1VarA = chain.a(aVar.a());
        ih0.a(this.f35345a, pp1VarI.g(), pq1VarA.g());
        pq1.a aVarA = new pq1.a(pq1VarA).a(pp1VarI);
        if (z10 && "gzip".equalsIgnoreCase(pq1.a(pq1VarA, "Content-Encoding")) && ih0.a(pq1VarA) && (tq1VarA = pq1VarA.a()) != null) {
            ia.n nVar = new ia.n(tq1VarA.c());
            aVarA.a(pq1VarA.g().b().a("Content-Encoding").a("Content-Length").a());
            aVarA.a(new yn1(pq1.a(pq1VarA, "Content-Type"), -1L, ia.q.c(nVar)));
        }
        return aVarA.a();
    }
}
