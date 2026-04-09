package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f32077a;

    /* renamed from: b, reason: collision with root package name */
    private final i6 f32078b;

    /* renamed from: c, reason: collision with root package name */
    private final r6 f32079c;

    public /* synthetic */ q6(C4072a3 c4072a3) {
        this(c4072a3, new i6(), new r6());
    }

    public final void a(Context context, AdQualityVerificationResult verificationResult, a8<?> a8Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(verificationResult, "verificationResult");
        if (verificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return;
        }
        jp1 jp1VarA = this.f32078b.a(a8Var, this.f32077a);
        this.f32079c.getClass();
        jp1 jp1VarA2 = kp1.a(jp1VarA, r6.b(verificationResult));
        ip1.b bVar = ip1.b.f28801a0;
        Map<String, Object> mapB = jp1VarA2.b();
        ip1 ip1Var = new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA2, bVar, "reportType", mapB, "reportData"));
        this.f32077a.q().f();
        gd.a(context, wm2.f35021a, this.f32077a.q().b()).a(ip1Var);
    }

    public q6(C4072a3 adConfiguration, i6 adQualityAdapterReportDataProvider, r6 adQualityVerificationResultReportDataProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adQualityAdapterReportDataProvider, "adQualityAdapterReportDataProvider");
        kotlin.jvm.internal.l.f(adQualityVerificationResultReportDataProvider, "adQualityVerificationResultReportDataProvider");
        this.f32077a = adConfiguration;
        this.f32078b = adQualityAdapterReportDataProvider;
        this.f32079c = adQualityVerificationResultReportDataProvider;
    }
}
