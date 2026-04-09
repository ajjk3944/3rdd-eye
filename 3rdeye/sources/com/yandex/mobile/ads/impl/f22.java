package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f22 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f27189a;

    public f22(mp1 reporter) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f27189a = reporter;
    }

    public final void a(tk0 initializationCallSource) {
        kotlin.jvm.internal.l.f(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f27189a;
        ip1.b reportType = ip1.b.f28802b0;
        Map mapM = C2077A.m(new b9.l("call_source", initializationCallSource.a()));
        kotlin.jvm.internal.l.f(reportType, "reportType");
        mp1Var.a(new ip1(reportType.a(), C2078B.u(mapM), (C4075b) null));
    }
}
