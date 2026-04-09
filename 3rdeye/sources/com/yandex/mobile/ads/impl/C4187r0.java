package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4187r0 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f32392a;

    /* renamed from: b, reason: collision with root package name */
    private final qq f32393b;

    public /* synthetic */ C4187r0(mp1 mp1Var) {
        this(mp1Var, new qq());
    }

    public final void a(Throwable throwable) {
        kotlin.jvm.internal.l.f(throwable, "throwable");
        this.f32392a.reportError("Failed to register ActivityResult", throwable);
    }

    public C4187r0(mp1 reporter, qq commonReportDataProvider) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f32392a = reporter;
        this.f32393b = commonReportDataProvider;
    }

    public final void a(C4236y0 adActivityData) {
        kotlin.jvm.internal.l.f(adActivityData, "adActivityData");
        jp1 jp1VarA = this.f32393b.a(adActivityData.c(), adActivityData.b());
        ip1.b bVar = ip1.b.f28804c0;
        Map<String, Object> mapB = jp1VarA.b();
        this.f32392a.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }
}
