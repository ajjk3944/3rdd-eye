package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l41 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<r91, k41> f29875a;

    public l41(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f29875a = C2078B.o(new b9.l(r91.f32561c, new l81(sdkEnvironmentModule)), new b9.l(r91.f32562d, new w71(sdkEnvironmentModule)), new b9.l(r91.f32563e, new nz1()));
    }

    public final k41 a(r91 r91Var) {
        return this.f29875a.get(r91Var);
    }
}
