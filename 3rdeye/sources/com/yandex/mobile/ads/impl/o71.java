package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class o71 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f31279a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31280b;

    /* renamed from: c, reason: collision with root package name */
    private final a8<?> f31281c;

    /* renamed from: d, reason: collision with root package name */
    private final p61 f31282d;

    /* renamed from: e, reason: collision with root package name */
    private final y71 f31283e;

    /* renamed from: f, reason: collision with root package name */
    private v71 f31284f;

    public o71(C4072a3 adConfiguration, String responseNativeType, a8<?> adResponse, p61 nativeAdResponse, y71 nativeCommonReportDataProvider, v71 v71Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        kotlin.jvm.internal.l.f(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f31279a = adConfiguration;
        this.f31280b = responseNativeType;
        this.f31281c = adResponse;
        this.f31282d = nativeAdResponse;
        this.f31283e = nativeCommonReportDataProvider;
        this.f31284f = v71Var;
    }

    public final jp1 a() {
        jp1 jp1VarA = this.f31283e.a(this.f31281c, this.f31279a, this.f31282d);
        v71 v71Var = this.f31284f;
        if (v71Var != null) {
            jp1VarA.b(v71Var.a(), "bind_type");
        }
        jp1VarA.a(this.f31280b, "native_ad_type");
        vy1 vy1VarR = this.f31279a.r();
        if (vy1VarR != null) {
            jp1VarA.b(vy1VarR.a().a(), "size_type");
            jp1VarA.b(Integer.valueOf(vy1VarR.getWidth()), "width");
            jp1VarA.b(Integer.valueOf(vy1VarR.getHeight()), "height");
        }
        jp1VarA.a(this.f31281c.a());
        return jp1VarA;
    }

    public final void a(v71 bindType) {
        kotlin.jvm.internal.l.f(bindType, "bindType");
        this.f31284f = bindType;
    }
}
