package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k92 implements ad2 {

    /* renamed from: a, reason: collision with root package name */
    private final m7 f29570a;

    public k92(u92 configuration, m7 adRequestParametersProvider) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(adRequestParametersProvider, "adRequestParametersProvider");
        this.f29570a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ad2
    public final Map<String, String> a() {
        String strD = this.f29570a.d();
        String str = "undefined";
        if (strD == null || strD.length() == 0) {
            strD = "undefined";
        }
        b9.l lVar = new b9.l("page_id", strD);
        String strC = this.f29570a.c();
        if (strC != null && strC.length() != 0) {
            str = strC;
        }
        return C2078B.o(lVar, new b9.l("imp_id", str), new b9.l(Constants.ADMON_AD_TYPE, ns.f30992h.b()));
    }
}
