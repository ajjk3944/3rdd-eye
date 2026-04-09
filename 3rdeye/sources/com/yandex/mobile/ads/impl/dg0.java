package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class dg0 implements dr1 {

    /* renamed from: a, reason: collision with root package name */
    private final qq f26163a;

    /* renamed from: b, reason: collision with root package name */
    private final jz0 f26164b;

    /* renamed from: c, reason: collision with root package name */
    private a8<String> f26165c;

    /* renamed from: d, reason: collision with root package name */
    private C4072a3 f26166d;

    public /* synthetic */ dg0() {
        this(new qq(), new jz0());
    }

    @Override // com.yandex.mobile.ads.impl.dr1
    public final jp1 a() {
        jp1 jp1Var;
        jp1 jp1Var2 = new jp1(new HashMap(), 2);
        a8<String> a8Var = this.f26165c;
        C4072a3 c4072a3 = this.f26166d;
        if (a8Var == null || c4072a3 == null) {
            return jp1Var2;
        }
        jp1 jp1VarA = kp1.a(jp1Var2, this.f26163a.a(a8Var, c4072a3));
        zy0 zy0VarI = c4072a3.i();
        this.f26164b.getClass();
        if (zy0VarI != null) {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(zy0VarI.e(), "adapter");
            jp1Var.b(zy0VarI.i(), "adapter_parameters");
        } else {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(ip1.a.f28774a, "adapter");
        }
        jp1 jp1VarA2 = kp1.a(jp1VarA, jp1Var);
        jp1VarA2.b(a8Var.M().a().a(), "size_type");
        jp1VarA2.b(Integer.valueOf(a8Var.M().getWidth()), "width");
        jp1VarA2.b(Integer.valueOf(a8Var.M().getHeight()), "height");
        return jp1VarA2;
    }

    public dg0(qq commonReportDataProvider, jz0 mediationReportDataProvider) {
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(mediationReportDataProvider, "mediationReportDataProvider");
        this.f26163a = commonReportDataProvider;
        this.f26164b = mediationReportDataProvider;
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f26166d = adConfiguration;
    }

    public final void a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f26165c = adResponse;
    }
}
