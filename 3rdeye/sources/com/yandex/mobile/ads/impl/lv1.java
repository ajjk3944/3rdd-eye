package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lv1 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f30107a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30108b;

    /* renamed from: c, reason: collision with root package name */
    private final n32 f30109c;

    /* renamed from: d, reason: collision with root package name */
    private final yy0 f30110d;

    /* renamed from: e, reason: collision with root package name */
    private final wg1 f30111e;

    public /* synthetic */ lv1(mp1 mp1Var, boolean z10, C4198s4 c4198s4) {
        this(mp1Var, z10, c4198s4, new n32(), new yy0(), new kv1(c4198s4));
    }

    public final void a(C4128i3 adRequestError, tk0 initializationCallSource, er erVar) {
        kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
        kotlin.jvm.internal.l.f(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f30107a;
        ip1.b reportType = ip1.b.f28799Y;
        Map mapO = C2078B.o(new b9.l("failure_reason", adRequestError.c()), new b9.l("call_source", initializationCallSource.a()), new b9.l("configuration_source", erVar != null ? erVar.a() : null), new b9.l("durations", this.f30111e.a()));
        kotlin.jvm.internal.l.f(reportType, "reportType");
        mp1Var.a(new ip1(reportType.a(), C2078B.u(mapO), (C4075b) null));
    }

    public lv1(mp1 reporter, boolean z10, C4198s4 adLoadingPhasesManager, n32 systemCurrentTimeProvider, yy0 integratedNetworksProvider, wg1 phasesParametersProvider) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        kotlin.jvm.internal.l.f(integratedNetworksProvider, "integratedNetworksProvider");
        kotlin.jvm.internal.l.f(phasesParametersProvider, "phasesParametersProvider");
        this.f30107a = reporter;
        this.f30108b = z10;
        this.f30109c = systemCurrentTimeProvider;
        this.f30110d = integratedNetworksProvider;
        this.f30111e = phasesParametersProvider;
    }

    public final void a(du1 sdkConfiguration, tk0 initializationCallSource, er erVar) {
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        kotlin.jvm.internal.l.f(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f30107a;
        ip1.b reportType = ip1.b.f28798X;
        this.f30109c.getClass();
        Map mapO = C2078B.o(new b9.l("creation_date", Long.valueOf(System.currentTimeMillis())), new b9.l("startup_version", sdkConfiguration.T()), new b9.l("user_consent", sdkConfiguration.F0()), new b9.l("integrated_mediation", this.f30110d.a(this.f30108b)), new b9.l("call_source", initializationCallSource.a()), new b9.l("configuration_source", erVar != null ? erVar.a() : null), new b9.l("durations", this.f30111e.a()));
        kotlin.jvm.internal.l.f(reportType, "reportType");
        mp1Var.a(new ip1(reportType.a(), C2078B.u(mapO), (C4075b) null));
    }
}
