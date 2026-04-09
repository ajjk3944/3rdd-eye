package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.vy1;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ch2 {

    /* renamed from: a, reason: collision with root package name */
    private final o7 f25652a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f25653b;

    /* renamed from: c, reason: collision with root package name */
    private final if1 f25654c;

    public /* synthetic */ ch2(Context context, C4072a3 c4072a3) {
        o7 o7Var = new o7();
        c4072a3.q().f();
        this(context, c4072a3, o7Var, gd.a(context, wm2.f35021a, c4072a3.q().b()), new if1());
    }

    public final void a(ah2 viewSizeInfo, C4072a3 adConfiguration) {
        vy1.a aVarA;
        kotlin.jvm.internal.l.f(viewSizeInfo, "viewSizeInfo");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        h7 h7VarA = adConfiguration.a();
        jp1 jp1VarA = h7VarA != null ? this.f25652a.a(h7VarA) : new jp1((Map) null, 3);
        h7 h7VarA2 = adConfiguration.a();
        if (h7VarA2 != null) {
            kp1.a(jp1VarA, this.f25652a.a(h7VarA2));
        }
        jp1VarA.b(adConfiguration.c(), Constants.ADMON_AD_UNIT_ID);
        jp1VarA.b(adConfiguration.c(), "block_id");
        if1 if1Var = this.f25654c;
        int iO = adConfiguration.o();
        if1Var.getClass();
        jp1VarA.b(iO != 1 ? iO != 2 ? "undefined" : "landscape" : "portrait", "orientation");
        vy1 vy1VarR = adConfiguration.r();
        jp1VarA.a((vy1VarR == null || (aVarA = vy1VarR.a()) == null) ? null : aVarA.a(), "size_type");
        vy1 vy1VarR2 = adConfiguration.r();
        jp1VarA.a(vy1VarR2 != null ? Integer.valueOf(vy1VarR2.getWidth()) : null, "size_info_width");
        vy1 vy1VarR3 = adConfiguration.r();
        jp1VarA.a(vy1VarR3 != null ? Integer.valueOf(vy1VarR3.getHeight()) : null, "size_info_height");
        jp1VarA.b(Integer.valueOf(viewSizeInfo.d().b()), "view_width");
        jp1VarA.b(Integer.valueOf(viewSizeInfo.d().a()), "view_height");
        jp1VarA.a(viewSizeInfo.b().b(), "layout_width");
        jp1VarA.a(viewSizeInfo.b().a(), "layout_height");
        jp1VarA.b(Integer.valueOf(viewSizeInfo.c().b().b()), "measured_width");
        String strName = viewSizeInfo.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        jp1VarA.b(lowerCase, "measured_width_mode");
        jp1VarA.b(Integer.valueOf(viewSizeInfo.c().a().b()), "measured_height");
        String lowerCase2 = viewSizeInfo.c().a().a().name().toLowerCase(locale);
        kotlin.jvm.internal.l.e(lowerCase2, "toLowerCase(...)");
        jp1VarA.b(lowerCase2, "measured_height_mode");
        ip1.b bVar = ip1.b.f28791Q;
        Map<String, Object> mapB = jp1VarA.b();
        this.f25653b.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public ch2(Context context, C4072a3 adConfiguration, o7 adRequestReportDataProvider, mp1 metricaReporter, if1 orientationNameProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(orientationNameProvider, "orientationNameProvider");
        this.f25652a = adRequestReportDataProvider;
        this.f25653b = metricaReporter;
        this.f25654c = orientationNameProvider;
    }
}
