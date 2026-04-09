package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k7 implements eq1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f29544a;

    /* renamed from: b, reason: collision with root package name */
    private final o7 f29545b;

    public k7(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f29544a = adConfiguration;
        this.f29545b = new o7();
    }

    @Override // com.yandex.mobile.ads.impl.eq1
    public final Map<String, Object> a() {
        LinkedHashMap linkedHashMapP = C2078B.p(new b9.l(Constants.ADMON_AD_TYPE, this.f29544a.b().b()));
        String strC = this.f29544a.c();
        if (strC != null) {
            linkedHashMapP.put("block_id", strC);
            linkedHashMapP.put(Constants.ADMON_AD_UNIT_ID, strC);
        }
        linkedHashMapP.putAll(this.f29545b.a(this.f29544a.a()).b());
        return linkedHashMapP;
    }
}
