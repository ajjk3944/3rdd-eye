package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oa1 implements ad2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f31327a;

    public oa1(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f31327a = adConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.ad2
    public final Map<String, String> a() {
        String strC = this.f31327a.c();
        if (strC == null || y9.q.i0(strC)) {
            strC = "undefined";
        }
        return C2078B.o(new b9.l("block_id", strC), new b9.l(Constants.ADMON_AD_TYPE, this.f31327a.b().b()));
    }
}
