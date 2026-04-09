package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pq1;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class in implements zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28755a;

    public in(boolean z10) {
        this.f28755a = z10;
    }

    @Override // com.yandex.mobile.ads.impl.zo0
    public final pq1 a(xn1 chain) throws Throwable {
        pq1.a aVarA;
        kotlin.jvm.internal.l.f(chain, "chain");
        w50 w50VarD = chain.d();
        kotlin.jvm.internal.l.c(w50VarD);
        pp1 pp1VarF = chain.f();
        sp1 sp1VarA = pp1VarF.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        w50VarD.b(pp1VarF);
        boolean z10 = true;
        if (!kh0.a(pp1VarF.f()) || sp1VarA == null) {
            w50VarD.l();
            aVarA = null;
        } else {
            if ("100-continue".equalsIgnoreCase(pp1VarF.a("Expect"))) {
                w50VarD.d();
                aVarA = w50VarD.a(true);
                w50VarD.m();
                z10 = false;
            } else {
                aVarA = null;
            }
            if (aVarA == null) {
                ia.v vVarB = ia.q.b(w50VarD.a(pp1VarF));
                sp1VarA.a(vVarB);
                vVarB.close();
            } else {
                w50VarD.l();
                if (!w50VarD.f().h()) {
                    w50VarD.k();
                }
            }
        }
        w50VarD.c();
        if (aVarA == null) {
            aVarA = w50VarD.a(false);
            kotlin.jvm.internal.l.c(aVarA);
            if (z10) {
                w50VarD.m();
                z10 = false;
            }
        }
        pq1 pq1VarA = aVarA.a(pp1VarF).a(w50VarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iD = pq1VarA.d();
        if (iD == 100) {
            pq1.a aVarA2 = w50VarD.a(false);
            kotlin.jvm.internal.l.c(aVarA2);
            if (z10) {
                w50VarD.m();
            }
            pq1VarA = aVarA2.a(pp1VarF).a(w50VarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iD = pq1VarA.d();
        }
        w50VarD.b(pq1VarA);
        pq1 pq1VarA2 = (this.f28755a && iD == 101) ? pq1VarA.k().a(t82.f33482c).a() : pq1VarA.k().a(w50VarD.a(pq1VarA)).a();
        if (com.vungle.ads.internal.presenter.g.CLOSE.equalsIgnoreCase(pq1VarA2.o().a("Connection")) || com.vungle.ads.internal.presenter.g.CLOSE.equalsIgnoreCase(pq1.a(pq1VarA2, "Connection"))) {
            w50VarD.k();
        }
        if (iD == 204 || iD == 205) {
            tq1 tq1VarA = pq1VarA2.a();
            if ((tq1VarA != null ? tq1VarA.a() : -1L) > 0) {
                tq1 tq1VarA2 = pq1VarA2.a();
                throw new ProtocolException("HTTP " + iD + " had non-zero Content-Length: " + (tq1VarA2 != null ? Long.valueOf(tq1VarA2.a()) : null));
            }
        }
        return pq1VarA2;
    }
}
