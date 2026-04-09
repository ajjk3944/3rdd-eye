package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.List;

/* loaded from: classes3.dex */
public final class o61 extends yj<p61> {

    /* renamed from: c, reason: collision with root package name */
    private final s61 f31267c;

    public /* synthetic */ o61() {
        this(new q91(), new s61());
    }

    @Override // com.yandex.mobile.ads.impl.yj
    public final jp1 a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = super.a(adConfiguration);
        jp1VarA.b(Boolean.valueOf(adConfiguration.u()), "image_loading_automatically");
        List<String> listM = adConfiguration.m();
        if (!listM.isEmpty()) {
            jp1VarA.b(listM, "image_sizes");
        }
        return jp1VarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(q91 nativeResponseReportDataProvider, s61 nativeAdResponseDataProvider) {
        super(nativeResponseReportDataProvider);
        kotlin.jvm.internal.l.f(nativeResponseReportDataProvider, "nativeResponseReportDataProvider");
        kotlin.jvm.internal.l.f(nativeAdResponseDataProvider, "nativeAdResponseDataProvider");
        this.f31267c = nativeAdResponseDataProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.yj
    public final jp1 a(int i, C4072a3 adConfiguration, rq1 rq1Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = super.a(i, adConfiguration, rq1Var);
        ip1.c cVar = null;
        a8 a8Var = rq1Var != null ? (a8) rq1Var.f32763a : null;
        if (204 == i) {
            cVar = ip1.c.f28831e;
        } else if (a8Var != null && i == 200) {
            this.f31267c.getClass();
            p61 p61Var = (p61) a8Var.I();
            if (p61Var != null) {
                cVar = (ip1.c) p61Var.f().get("status");
            } else if (a8Var.D() == null) {
                cVar = ip1.c.f28830d;
            }
        } else {
            cVar = ip1.c.f28830d;
        }
        if (cVar != null) {
            jp1VarA.b(cVar.a(), "status");
        }
        return jp1VarA;
    }
}
