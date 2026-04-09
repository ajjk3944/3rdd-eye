package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.yc2;

/* loaded from: classes3.dex */
public final class hc2 implements yc2.b {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28182a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f28183b;

    /* renamed from: c, reason: collision with root package name */
    private final y71 f28184c;

    public /* synthetic */ hc2(C4072a3 c4072a3, a8 a8Var) {
        this(c4072a3, a8Var, new m71());
    }

    @Override // com.yandex.mobile.ads.impl.yc2.b
    public final jp1 a() {
        Object objI = this.f28183b.I();
        jp1 jp1VarA = this.f28184c.a(this.f28183b, this.f28182a, objI instanceof p61 ? (p61) objI : null);
        jp1VarA.b(ip1.a.f28774a, "adapter");
        jp1VarA.a(this.f28183b.a());
        return jp1VarA;
    }

    public hc2(C4072a3 adConfiguration, a8<?> adResponse, y71 commonReportDataProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f28182a = adConfiguration;
        this.f28183b = adResponse;
        this.f28184c = commonReportDataProvider;
    }
}
