package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4212u4 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f33925a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f33926b;

    /* renamed from: c, reason: collision with root package name */
    private final wg1 f33927c;

    /* renamed from: d, reason: collision with root package name */
    private final bd f33928d;

    /* renamed from: e, reason: collision with root package name */
    private eq1 f33929e;

    /* renamed from: f, reason: collision with root package name */
    private dr1 f33930f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33931g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4212u4(Context context, C4072a3 c4072a3, C4198s4 c4198s4) {
        this(context, c4072a3, c4198s4, gd.a(context, wm2.f35021a, c4072a3.q().b()), new C4205t4(c4198s4), new bd(context));
        c4072a3.q().f();
    }

    public final void a(Object... listeners) {
        kotlin.jvm.internal.l.f(listeners, "listeners");
        int length = listeners.length;
        boolean z10 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (listeners[i] != null) {
                z10 = true;
                break;
            }
            i++;
        }
        this.f33931g = z10;
    }

    public final void a(String failureReason) {
        kotlin.jvm.internal.l.f(failureReason, "failureReason");
        HashMap map = new HashMap();
        map.put("status", com.vungle.ads.internal.presenter.g.ERROR);
        map.put("failure_reason", failureReason);
        map.put("durations", this.f33927c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f33931g));
        a(map);
    }

    public C4212u4(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, mp1 metricaReporter, wg1 phasesParametersProvider, bd metricaLibraryEventReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(phasesParametersProvider, "phasesParametersProvider");
        kotlin.jvm.internal.l.f(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f33925a = adConfiguration;
        this.f33926b = metricaReporter;
        this.f33927c = phasesParametersProvider;
        this.f33928d = metricaLibraryEventReporter;
    }

    private final void a(HashMap map) {
        jp1 jp1Var = new jp1(map, 2);
        eq1 eq1Var = this.f33929e;
        if (eq1Var != null) {
            jp1Var.a((Map<String, ? extends Object>) eq1Var.a());
        }
        dr1 dr1Var = this.f33930f;
        if (dr1Var != null) {
            jp1Var = kp1.a(jp1Var, dr1Var.a());
        }
        ip1.b bVar = ip1.b.f28803c;
        Map<String, Object> mapB = jp1Var.b();
        ip1 ip1Var = new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1Var, bVar, "reportType", mapB, "reportData"));
        this.f33926b.a(ip1Var);
        if (kotlin.jvm.internal.l.b(map.get("status"), "success")) {
            bd bdVar = this.f33928d;
            Map<String, ? extends Object> mapB2 = ip1Var.b();
            String strJ = this.f33925a.j();
            if (strJ == null) {
                strJ = ip1.a.f28774a;
            }
            bdVar.a(bVar, mapB2, strJ, null);
        }
    }

    public final void a() {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("durations", this.f33927c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f33931g));
        a(map);
    }

    public final void a(eq1 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f33929e = reportParameterManager;
    }

    public final void a(dr1 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f33930f = reportParameterManager;
    }
}
