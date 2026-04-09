package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2097r;
import c9.C2100u;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k71 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f29548a;

    public k71(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f29548a = adConfiguration;
    }

    public final Map<String, Object> a() {
        List<String> listM = this.f29548a.m();
        if (listM.isEmpty()) {
            listM = null;
        }
        return listM != null ? C2077A.m(new b9.l("image_sizes", C2097r.G0(listM))) : C2100u.f18582b;
    }
}
