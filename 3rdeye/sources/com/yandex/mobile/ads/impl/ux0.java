package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2077A;
import c9.C2078B;
import c9.C2100u;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ux0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f34236a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f34237b;

    /* renamed from: c, reason: collision with root package name */
    private final tx0 f34238c;

    /* renamed from: d, reason: collision with root package name */
    private final jz0 f34239d;

    /* renamed from: e, reason: collision with root package name */
    private final sr1 f34240e;

    public /* synthetic */ ux0(C4072a3 c4072a3, a8 a8Var) {
        this(c4072a3, a8Var, new tx0(), new jz0(), new sr1());
    }

    public final void a(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28808f, mediationNetwork, str, additionalReportData);
    }

    public final void b(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28823v, mediationNetwork, str, additionalReportData);
    }

    public final void c(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28777C, mediationNetwork, str, additionalReportData);
    }

    public final void d(Context context, zy0 mediationNetwork, Map<String, ? extends Object> reportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        a(context, ip1.b.f28825x, mediationNetwork, str, reportData);
        a(context, ip1.b.f28826y, mediationNetwork, str, reportData);
    }

    public final void e(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28776B, mediationNetwork, str, additionalReportData);
    }

    public final void f(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28807e, mediationNetwork, str, additionalReportData);
    }

    public final void g(Context context, zy0 mediationNetwork, Map<String, ? extends Object> additionalReportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        a(context, ip1.b.f28810h, mediationNetwork, str, additionalReportData);
    }

    public final void h(Context context, zy0 mediationNetwork, Map<String, ? extends Object> reportData, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        a(context, ip1.b.i, mediationNetwork, str, reportData);
    }

    private final void a(Context context, ip1.b bVar, zy0 mediationNetwork, String str, Map<String, ? extends Object> map) {
        jp1 jp1VarA = this.f34238c.a(this.f34237b, this.f34236a);
        this.f34239d.getClass();
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(mediationNetwork.e(), "adapter");
        jp1Var.b(mediationNetwork.i(), "adapter_parameters");
        jp1 jp1VarA2 = kp1.a(jp1VarA, jp1Var);
        jp1VarA2.a(map);
        Map<String, Object> mapB = jp1VarA2.b();
        ip1 ip1Var = new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA2, bVar, "reportType", mapB, "reportData"));
        this.f34236a.q().f();
        gd.a(context, wm2.f35021a, this.f34236a.q().b()).a(ip1Var);
        new bd(context).a(bVar, ip1Var.b(), str, mediationNetwork.c());
    }

    public final void b(Context context, zy0 mediationNetwork, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        a(context, ip1.b.f28809g, mediationNetwork, str, C2100u.f18582b);
    }

    public ux0(C4072a3 adConfiguration, a8<?> a8Var, tx0 mediatedAdapterReportDataProvider, jz0 mediationNetworkReportDataProvider, sr1 rewardInfoProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mediatedAdapterReportDataProvider, "mediatedAdapterReportDataProvider");
        kotlin.jvm.internal.l.f(mediationNetworkReportDataProvider, "mediationNetworkReportDataProvider");
        kotlin.jvm.internal.l.f(rewardInfoProvider, "rewardInfoProvider");
        this.f34236a = adConfiguration;
        this.f34237b = a8Var;
        this.f34238c = mediatedAdapterReportDataProvider;
        this.f34239d = mediationNetworkReportDataProvider;
        this.f34240e = rewardInfoProvider;
    }

    public final void a(Context context, zy0 mediationNetwork, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        a(context, ip1.b.f28823v, mediationNetwork, str, C2100u.f18582b);
    }

    public final void a(Context context, zy0 mediationNetwork, a8<?> a8Var, String str) {
        Object objM;
        or1 or1VarJ;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        this.f34240e.getClass();
        Boolean boolValueOf = (a8Var == null || (or1VarJ = a8Var.J()) == null) ? null : Boolean.valueOf(or1VarJ.e());
        if (kotlin.jvm.internal.l.b(boolValueOf, Boolean.TRUE)) {
            objM = C2077A.m(new b9.l("rewarding_side", "server_side"));
        } else if (kotlin.jvm.internal.l.b(boolValueOf, Boolean.FALSE)) {
            objM = C2077A.m(new b9.l("rewarding_side", "client_side"));
        } else if (boolValueOf == null) {
            objM = C2100u.f18582b;
        } else {
            throw new b9.j();
        }
        a(context, ip1.b.f28788N, mediationNetwork, str, C2077A.m(new b9.l("reward_info", objM)));
    }
}
