package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2077A;
import c9.C2078B;
import c9.C2097r;
import c9.C2100u;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rt1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f32773a;

    /* renamed from: b, reason: collision with root package name */
    private final o7 f32774b;

    /* renamed from: c, reason: collision with root package name */
    private final qq f32775c;

    public /* synthetic */ rt1(C4072a3 c4072a3) {
        this(c4072a3, new o7(), new qq());
    }

    private final void a(Context context, a8<?> a8Var, ip1.b bVar, jp1 jp1Var) {
        w31 w31Var;
        ar1 ar1VarG;
        jp1 jp1VarA = this.f32774b.a(this.f32773a.a());
        jp1VarA.b(a8Var.p(), Constants.ADMON_AD_UNIT_ID);
        jp1VarA.b(a8Var.p(), "block_id");
        String str = ip1.a.f28774a;
        jp1VarA.b(str, "adapter");
        ns nsVarN = a8Var.n();
        jp1VarA.b(nsVarN != null ? nsVarN.b() : null, Constants.ADMON_AD_TYPE);
        Object objI = a8Var.I();
        if (objI instanceof p61) {
            List<w31> listE = ((p61) objI).e();
            String strA = (listE == null || (w31Var = (w31) C2097r.q0(listE)) == null || (ar1VarG = w31Var.g()) == null) ? null : ar1VarG.a();
            if (strA == null) {
                strA = "";
            }
            jp1VarA.b(strA, "native_ad_type");
        }
        jp1VarA.b(a8Var.m(), "ad_source");
        jp1 jp1VarA2 = kp1.a(jp1VarA, jp1Var);
        Map<String, Object> mapB = jp1VarA2.b();
        ip1 ip1Var = new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA2, bVar, "reportType", mapB, "reportData"));
        this.f32773a.q().f();
        gd.a(context, wm2.f35021a, this.f32773a.q().b()).a(ip1Var);
        new bd(context).a(bVar, ip1Var.b(), str, null);
    }

    public final void b(Context context, a8<?> adResponse) {
        Object objM;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        jp1 jp1Var = new jp1((Map) null, 3);
        or1 or1VarJ = adResponse.J();
        Boolean boolValueOf = or1VarJ != null ? Boolean.valueOf(or1VarJ.e()) : null;
        if (kotlin.jvm.internal.l.b(boolValueOf, Boolean.TRUE)) {
            objM = C2077A.m(new b9.l("rewarding_side", "server_side"));
        } else if (kotlin.jvm.internal.l.b(boolValueOf, Boolean.FALSE)) {
            objM = C2077A.m(new b9.l("rewarding_side", "client_side"));
        } else {
            if (boolValueOf != null) {
                throw new b9.j();
            }
            objM = C2100u.f18582b;
        }
        jp1Var.b(objM, "reward_info");
        a(context, adResponse, ip1.b.f28788N, jp1Var);
    }

    public rt1(C4072a3 adConfiguration, o7 adRequestReportDataProvider, qq commonReportDataProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f32773a = adConfiguration;
        this.f32774b = adRequestReportDataProvider;
        this.f32775c = commonReportDataProvider;
    }

    public final void a(Context context, a8<?> adResponse, k71 k71Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        jp1 jp1Var = new jp1((Map) null, 3);
        if (k71Var != null) {
            jp1Var.a((Map<String, ? extends Object>) k71Var.a());
        }
        a(context, adResponse, ip1.b.f28809g, jp1Var);
    }

    public final void a(Context context, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        jp1 jp1VarA = this.f32775c.a(adResponse, this.f32773a);
        jp1VarA.b(ip1.c.f28829c.a(), "status");
        a(context, adResponse, ip1.b.f28810h, jp1VarA);
    }

    public final void a(Context context, a8<?> adResponse, l71 l71Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        jp1 jp1Var = new jp1((Map) null, 3);
        if (l71Var != null) {
            jp1Var = l71Var.a();
        }
        jp1Var.b(ip1.c.f28829c.a(), "status");
        a(context, adResponse, ip1.b.f28810h, jp1Var);
    }
}
