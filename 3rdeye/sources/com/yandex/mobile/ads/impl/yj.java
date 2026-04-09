package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.c82;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class yj<T> implements fq1<C4072a3, a8<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final o7 f35833a;

    /* renamed from: b, reason: collision with root package name */
    private final c8<T> f35834b;

    public interface a<K> {
        jp1 a(rq1<a8<K>> rq1Var, C4072a3 c4072a3);
    }

    public yj(a<T> responseReportDataProvider) {
        kotlin.jvm.internal.l.f(responseReportDataProvider, "responseReportDataProvider");
        this.f35833a = new o7();
        this.f35834b = new c8<>(responseReportDataProvider);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(C4072a3 c4072a3) {
        C4072a3 adConfiguration = c4072a3;
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = a(adConfiguration);
        ip1.b bVar = ip1.b.f28812k;
        Map<String, Object> mapB = jp1VarA.b();
        return new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public jp1 a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1Var = new jp1(new HashMap(), 2);
        h7 h7VarA = adConfiguration.a();
        if (h7VarA != null) {
            jp1Var = kp1.a(jp1Var, this.f35833a.a(h7VarA));
        }
        jp1Var.b(adConfiguration.c(), "block_id");
        jp1Var.b(adConfiguration.c(), Constants.ADMON_AD_UNIT_ID);
        jp1Var.b(adConfiguration.b().b(), Constants.ADMON_AD_TYPE);
        vy1 vy1VarR = adConfiguration.r();
        if (vy1VarR != null) {
            jp1Var.b(vy1VarR.a().a(), "size_type");
        }
        jp1Var.b(Boolean.valueOf(adConfiguration.t() == c82.a.f25569c), "is_passback");
        return jp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(rq1 rq1Var, int i, C4072a3 c4072a3) {
        C4072a3 adConfiguration = c4072a3;
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = a(i, adConfiguration, rq1Var);
        ip1.b bVar = ip1.b.f28813l;
        Map<String, Object> mapB = jp1VarA.b();
        return new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData"));
    }

    public jp1 a(int i, C4072a3 adConfiguration, rq1 rq1Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        return this.f35834b.a(i, adConfiguration, rq1Var);
    }
}
