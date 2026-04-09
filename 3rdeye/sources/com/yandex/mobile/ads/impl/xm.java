package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.an;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.pq1;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class xm implements zo0 {

    public static final class a {
        private a() {
        }

        public static final kf0 a(kf0 kf0Var, kf0 kf0Var2) {
            kf0.a aVar = new kf0.a();
            int size = kf0Var.size();
            for (int i = 0; i < size; i++) {
                String strA = kf0Var.a(i);
                String strB = kf0Var.b(i);
                if ((!"Warning".equalsIgnoreCase(strA) || !y9.n.a0(strB, "1", false)) && ("Content-Length".equalsIgnoreCase(strA) || "Content-Encoding".equalsIgnoreCase(strA) || "Content-Type".equalsIgnoreCase(strA) || !a(strA) || kf0Var2.a(strA) == null)) {
                    aVar.a(strA, strB);
                }
            }
            int size2 = kf0Var2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String strA2 = kf0Var2.a(i10);
                if (!"Content-Length".equalsIgnoreCase(strA2) && !"Content-Encoding".equalsIgnoreCase(strA2) && !"Content-Type".equalsIgnoreCase(strA2) && a(strA2)) {
                    aVar.a(strA2, kf0Var2.b(i10));
                }
            }
            return aVar.a();
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static final pq1 a(pq1 pq1Var) {
            if ((pq1Var != null ? pq1Var.a() : null) == null) {
                return pq1Var;
            }
            pq1Var.getClass();
            return new pq1.a(pq1Var).a((tq1) null).a();
        }

        private static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zo0
    public final pq1 a(xn1 chain) throws IOException {
        r50 r50VarE;
        kotlin.jvm.internal.l.f(chain, "chain");
        tn1 call = chain.a();
        an anVarA = new an.a(System.currentTimeMillis(), chain.i()).a();
        pp1 pp1VarB = anVarA.b();
        pq1 pq1VarA = anVarA.a();
        tn1 tn1Var = call != null ? call : null;
        if (tn1Var == null || (r50VarE = tn1Var.e()) == null) {
            r50VarE = r50.f32480a;
        }
        if (pp1VarB == null && pq1VarA == null) {
            pq1 response = new pq1.a().a(chain.i()).a(gm1.f27818e).a(504).a("Unsatisfiable Request (only-if-cached)").a(t82.f33482c).b(-1L).a(System.currentTimeMillis()).a();
            r50VarE.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            kotlin.jvm.internal.l.f(response, "response");
            return response;
        }
        if (pp1VarB == null) {
            kotlin.jvm.internal.l.c(pq1VarA);
            pq1 response2 = new pq1.a(pq1VarA).a(a.a(pq1VarA)).a();
            r50VarE.getClass();
            kotlin.jvm.internal.l.f(call, "call");
            kotlin.jvm.internal.l.f(response2, "response");
            return response2;
        }
        if (pq1VarA != null) {
            r50VarE.getClass();
            kotlin.jvm.internal.l.f(call, "call");
        }
        pq1 pq1VarA2 = chain.a(pp1VarB);
        if (pq1VarA != null) {
            if (pq1VarA2.d() == 304) {
                new pq1.a(pq1VarA).a(a.a(pq1VarA.g(), pq1VarA2.g())).b(pq1VarA2.p()).a(pq1VarA2.n()).a(a.a(pq1VarA)).b(a.a(pq1VarA2)).a();
                tq1 tq1VarA = pq1VarA2.a();
                kotlin.jvm.internal.l.c(tq1VarA);
                t82.a((Closeable) tq1VarA.c());
                kotlin.jvm.internal.l.c(null);
                throw null;
            }
            tq1 tq1VarA2 = pq1VarA.a();
            if (tq1VarA2 != null) {
                t82.a(tq1VarA2);
            }
        }
        kotlin.jvm.internal.l.c(pq1VarA2);
        return new pq1.a(pq1VarA2).a(a.a(pq1VarA)).b(a.a(pq1VarA2)).a();
    }
}
