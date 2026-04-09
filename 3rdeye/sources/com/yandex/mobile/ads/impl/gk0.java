package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gk0 {

    /* renamed from: a, reason: collision with root package name */
    private a8<?> f27778a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f27779b;

    /* renamed from: c, reason: collision with root package name */
    private final C4108f4 f27780c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f27781d;

    /* renamed from: e, reason: collision with root package name */
    private final du1 f27782e;

    /* renamed from: f, reason: collision with root package name */
    private final qq f27783f;

    /* renamed from: g, reason: collision with root package name */
    private final bd f27784g;

    /* renamed from: h, reason: collision with root package name */
    private o71 f27785h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk0(Context context, a8 a8Var, C4072a3 c4072a3, C4108f4 c4108f4) {
        this(context, a8Var, c4072a3, c4108f4, gd.a(context, wm2.f35021a, c4072a3.q().b()), ew1.a.a().a(context), new qq(), new bd(context));
        c4072a3.q().f();
    }

    private final jp1 a() {
        jp1 jp1VarA = this.f27783f.a(this.f27778a, this.f27779b);
        jp1VarA.b(ip1.a.f28774a, "adapter");
        vy1 vy1VarR = this.f27779b.r();
        if (vy1VarR != null) {
            jp1VarA.b(vy1VarR.a().a(), "size_type");
            jp1VarA.b(Integer.valueOf(vy1VarR.getWidth()), "width");
            jp1VarA.b(Integer.valueOf(vy1VarR.getHeight()), "height");
        }
        du1 du1Var = this.f27782e;
        if (du1Var != null) {
            jp1VarA.b(du1Var.n(), "banner_size_calculation_type");
        }
        o71 o71Var = this.f27785h;
        return o71Var != null ? kp1.a(jp1VarA, o71Var.a()) : jp1VarA;
    }

    public final void b(ip1.b reportType, a92 validationResult) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        jp1 jp1VarA = a();
        jp1VarA.b(validationResult.b().a(), "reason");
        String strA = validationResult.a();
        if (strA != null && strA.length() > 0) {
            jp1VarA.b(strA, "asset_name");
        }
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) jp1VarA.b(), jp1VarA.a());
        this.f27781d.a(ip1Var);
        this.f27784g.a(reportType, ip1Var.b(), ip1.a.f28774a, this.f27780c);
    }

    public gk0(Context context, a8<?> adResponse, C4072a3 adConfiguration, C4108f4 c4108f4, mp1 metricaReporter, du1 du1Var, qq commonReportDataProvider, bd metricaLibraryEventReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f27778a = adResponse;
        this.f27779b = adConfiguration;
        this.f27780c = c4108f4;
        this.f27781d = metricaReporter;
        this.f27782e = du1Var;
        this.f27783f = commonReportDataProvider;
        this.f27784g = metricaLibraryEventReporter;
    }

    public final void a(ip1.b reportType, a92 validationResult) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        jp1 jp1VarA = a();
        jp1VarA.b(validationResult.b().a(), "reason");
        String strA = validationResult.a();
        if (strA != null && strA.length() > 0) {
            jp1VarA.b(strA, "asset_name");
        }
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) jp1VarA.b(), jp1VarA.a());
        this.f27781d.a(ip1Var);
        this.f27784g.a(reportType, ip1Var.b(), ip1.a.f28774a, this.f27780c);
    }

    public final void a(ip1.b reportType, Map<String, ? extends Object> additionalReportData) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        jp1 jp1VarA = a();
        jp1VarA.a(additionalReportData);
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) jp1VarA.b(), jp1VarA.a());
        this.f27781d.a(ip1Var);
        this.f27784g.a(reportType, ip1Var.b(), ip1.a.f28774a, this.f27780c);
    }

    public final void a(ip1.b reportType) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        jp1 jp1VarA = a();
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) jp1VarA.b(), jp1VarA.a());
        this.f27781d.a(ip1Var);
        this.f27784g.a(reportType, ip1Var.b(), ip1.a.f28774a, this.f27780c);
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f27785h = reportParameterManager;
    }

    public final void a(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f27778a = adResponse;
    }
}
