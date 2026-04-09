package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class bz0 {

    /* renamed from: a, reason: collision with root package name */
    private final ux0 f25473a;

    /* renamed from: b, reason: collision with root package name */
    private final rx0 f25474b;

    public /* synthetic */ bz0(ux0 ux0Var) {
        this(ux0Var, new rx0());
    }

    public final void a(Context context, zy0 mediationNetwork, hx0 hx0Var, String failureReason, Long l5) {
        MediatedAdapterInfo mediatedAdapterInfoB;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(failureReason, "failureReason");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("failure_reason", failureReason);
        linkedHashMap.put("status", com.vungle.ads.internal.presenter.g.ERROR);
        if (l5 != null) {
            linkedHashMap.put("response_time", l5);
        }
        if (hx0Var != null) {
            this.f25474b.getClass();
            linkedHashMap.putAll(rx0.a(hx0Var));
        }
        this.f25473a.h(context, mediationNetwork, linkedHashMap, (hx0Var == null || (mediatedAdapterInfoB = hx0Var.b()) == null) ? null : mediatedAdapterInfoB.getNetworkName());
    }

    public bz0(ux0 mediatedAdapterReporter, rx0 mediatedAdapterInfoReportDataProvider) {
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f25473a = mediatedAdapterReporter;
        this.f25474b = mediatedAdapterInfoReportDataProvider;
    }

    public final void a(Context context, zy0 mediationNetwork, hx0 hx0Var) {
        MediatedAdapterInfo mediatedAdapterInfoB;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        LinkedHashMap linkedHashMapP = C2078B.p(new b9.l("status", "success"));
        if (hx0Var != null) {
            this.f25474b.getClass();
            linkedHashMapP.putAll(rx0.a(hx0Var));
        }
        this.f25473a.h(context, mediationNetwork, linkedHashMapP, (hx0Var == null || (mediatedAdapterInfoB = hx0Var.b()) == null) ? null : mediatedAdapterInfoB.getNetworkName());
    }
}
