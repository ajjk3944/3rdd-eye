package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ei2 implements fq1<bi2, xh2> {
    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(bi2 bi2Var) {
        bi2 requestConfiguration = bi2Var;
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        Map mapO = C2078B.o(new b9.l("page_id", requestConfiguration.a()), new b9.l("category_id", requestConfiguration.b()), new b9.l(Constants.ADMON_AD_TYPE, ns.f30992h.b()));
        ip1.b reportType = ip1.b.f28821t;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        return new ip1(reportType.a(), C2078B.u(mapO), (C4075b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(rq1<xh2> rq1Var, int i, bi2 bi2Var) {
        bi2 requestConfiguration = bi2Var;
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        LinkedHashMap linkedHashMapU = C2078B.u(C2078B.o(new b9.l("page_id", requestConfiguration.a()), new b9.l("category_id", requestConfiguration.b()), new b9.l(Constants.ADMON_AD_TYPE, ns.f30992h.b())));
        if (i != -1) {
            linkedHashMapU.put("code", Integer.valueOf(i));
        }
        ip1.b reportType = ip1.b.f28822u;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        return new ip1(reportType.a(), C2078B.u(linkedHashMapU), (C4075b) null);
    }
}
