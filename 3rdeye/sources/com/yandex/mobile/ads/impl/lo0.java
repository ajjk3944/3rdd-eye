package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lo0 implements eq1 {

    /* renamed from: a, reason: collision with root package name */
    private final bi2 f30059a;

    public lo0(bi2 requestConfig) {
        kotlin.jvm.internal.l.f(requestConfig, "requestConfig");
        this.f30059a = requestConfig;
    }

    @Override // com.yandex.mobile.ads.impl.eq1
    public final Map<String, Object> a() {
        return C2078B.o(new b9.l(Constants.ADMON_AD_TYPE, ns.f30992h.b()), new b9.l("page_id", this.f30059a.a()), new b9.l("category_id", this.f30059a.b()));
    }
}
