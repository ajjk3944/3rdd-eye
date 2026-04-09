package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class eg1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f26836a;

    /* renamed from: b, reason: collision with root package name */
    private final vy0 f26837b;

    public eg1(String str, vy0 mediationData) {
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        this.f26836a = str;
        this.f26837b = mediationData;
    }

    public final Map<String, String> a() {
        String str = this.f26836a;
        return (str == null || str.length() == 0) ? this.f26837b.d() : C2078B.q(this.f26837b.d(), C2077A.m(new b9.l("adf-resp_time", this.f26836a)));
    }
}
