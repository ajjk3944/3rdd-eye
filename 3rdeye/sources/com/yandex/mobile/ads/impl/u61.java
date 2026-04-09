package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u61 implements dr1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f33949a;

    /* renamed from: b, reason: collision with root package name */
    private final y71 f33950b;

    /* renamed from: c, reason: collision with root package name */
    private final jz0 f33951c;

    /* renamed from: d, reason: collision with root package name */
    private a8<p61> f33952d;

    public /* synthetic */ u61(C4072a3 c4072a3) {
        this(c4072a3, new m71(), new jz0());
    }

    @Override // com.yandex.mobile.ads.impl.dr1
    public final jp1 a() {
        jp1 jp1Var;
        jp1 jp1Var2 = new jp1((Map) null, 3);
        a8<p61> a8Var = this.f33952d;
        if (a8Var == null) {
            return jp1Var2;
        }
        jp1 jp1VarA = kp1.a(jp1Var2, this.f33950b.a(a8Var, this.f33949a, a8Var.I()));
        zy0 zy0VarI = this.f33949a.i();
        this.f33951c.getClass();
        if (zy0VarI != null) {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(zy0VarI.e(), "adapter");
            jp1Var.b(zy0VarI.i(), "adapter_parameters");
        } else {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(ip1.a.f28774a, "adapter");
        }
        return kp1.a(jp1VarA, jp1Var);
    }

    public u61(C4072a3 adConfiguration, y71 commonReportDataProvider, jz0 mediationNetworkReportDataProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(mediationNetworkReportDataProvider, "mediationNetworkReportDataProvider");
        this.f33949a = adConfiguration;
        this.f33950b = commonReportDataProvider;
        this.f33951c = mediationNetworkReportDataProvider;
    }

    public final void a(a8<p61> a8Var) {
        this.f33952d = a8Var;
    }
}
