package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class l71 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f29910a;

    /* renamed from: b, reason: collision with root package name */
    private final p61 f29911b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f29912c;

    /* renamed from: d, reason: collision with root package name */
    private final y71 f29913d;

    public /* synthetic */ l71(a8 a8Var, p61 p61Var, C4072a3 c4072a3) {
        this(a8Var, p61Var, c4072a3, new m71());
    }

    public final jp1 a() {
        return this.f29913d.a(this.f29910a, this.f29912c, this.f29911b);
    }

    public l71(a8<?> adResponse, p61 p61Var, C4072a3 adConfiguration, y71 commonReportDataProvider) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f29910a = adResponse;
        this.f29911b = p61Var;
        this.f29912c = adConfiguration;
        this.f29913d = commonReportDataProvider;
    }
}
