package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y92 implements fq1<u92, m92> {

    /* renamed from: a, reason: collision with root package name */
    private final m7 f35674a;

    public y92(m7 adRequestParametersProvider) {
        kotlin.jvm.internal.l.f(adRequestParametersProvider, "adRequestParametersProvider");
        this.f35674a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(u92 u92Var) {
        u92 requestConfiguration = u92Var;
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        Map<String, Object> reportData = a();
        ip1.b reportType = ip1.b.f28814m;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        return new ip1(reportType.a(), C2078B.u(reportData), (C4075b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(rq1<m92> rq1Var, int i, u92 u92Var) {
        u92 requestConfiguration = u92Var;
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        LinkedHashMap linkedHashMapU = C2078B.u(a());
        if (i != -1) {
            linkedHashMapU.put("code", Integer.valueOf(i));
        }
        ip1.b reportType = ip1.b.f28815n;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        return new ip1(reportType.a(), C2078B.u(linkedHashMapU), (C4075b) null);
    }

    private final Map<String, Object> a() {
        String strD = this.f35674a.d();
        if (strD == null) {
            strD = "";
        }
        if (strD.length() == 0) {
            strD = "null";
        }
        b9.l lVar = new b9.l("page_id", strD);
        String strC = this.f35674a.c();
        String str = strC != null ? strC : "";
        return C2078B.o(lVar, new b9.l("imp_id", str.length() != 0 ? str : "null"), new b9.l(Constants.ADMON_AD_TYPE, ns.f30992h.b()));
    }
}
