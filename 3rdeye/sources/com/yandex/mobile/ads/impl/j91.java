package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j91 {

    /* renamed from: a, reason: collision with root package name */
    private final o71 f29027a;

    /* renamed from: b, reason: collision with root package name */
    private yg f29028b;

    public j91(o71 reportManager, yg assetsRenderedReportParameterProvider) {
        kotlin.jvm.internal.l.f(reportManager, "reportManager");
        kotlin.jvm.internal.l.f(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        this.f29027a = reportManager;
        this.f29028b = assetsRenderedReportParameterProvider;
    }

    public final Map<String, Object> a() {
        return C2078B.q(this.f29027a.a().b(), C2077A.m(new b9.l("assets", C2077A.m(new b9.l("rendered", this.f29028b.a())))));
    }
}
