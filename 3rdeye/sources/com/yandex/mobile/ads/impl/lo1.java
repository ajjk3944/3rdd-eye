package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lo1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f30060a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f30061b;

    /* renamed from: c, reason: collision with root package name */
    private final e9 f30062c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f30063d;

    /* renamed from: e, reason: collision with root package name */
    private final du1 f30064e;

    /* renamed from: f, reason: collision with root package name */
    private final qq f30065f;

    /* renamed from: g, reason: collision with root package name */
    private j91 f30066g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo1(Context context, C4072a3 c4072a3, a8 a8Var, e9 e9Var) {
        this(context, c4072a3, a8Var, e9Var, gd.a(context, wm2.f35021a, c4072a3.q().b()), ew1.a.a().a(context), new qq());
        c4072a3.q().f();
    }

    public final void a() {
        List listW;
        jp1 jp1VarA = this.f30065f.a(this.f30061b, this.f30060a);
        jp1VarA.b(ip1.a.f28774a, "adapter");
        j91 j91Var = this.f30066g;
        if (j91Var != null) {
            jp1VarA.a((Map<String, ? extends Object>) j91Var.a());
        }
        vy1 vy1VarR = this.f30060a.r();
        if (vy1VarR != null) {
            jp1VarA.b(vy1VarR.a().a(), "size_type");
            jp1VarA.b(Integer.valueOf(vy1VarR.getWidth()), "width");
            jp1VarA.b(Integer.valueOf(vy1VarR.getHeight()), "height");
        }
        du1 du1Var = this.f30064e;
        if (du1Var != null) {
            jp1VarA.b(du1Var.n(), "banner_size_calculation_type");
        }
        int iOrdinal = this.f30062c.ordinal();
        if (iOrdinal == 0) {
            listW = C2092m.W(ip1.b.f28824w, ip1.b.f28823v);
        } else if (iOrdinal == 1) {
            listW = E.u.G(ip1.b.f28824w);
        } else {
            if (iOrdinal != 2) {
                throw new b9.j();
            }
            listW = E.u.G(ip1.b.f28823v);
        }
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            this.f30063d.a(new ip1((ip1.b) it.next(), (Map<String, ? extends Object>) jp1VarA.b(), jp1VarA.a()));
        }
    }

    public lo1(Context context, C4072a3 adConfiguration, a8<?> adResponse, e9 adStructureType, mp1 metricaReporter, du1 du1Var, qq commonReportDataProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f30060a = adConfiguration;
        this.f30061b = adResponse;
        this.f30062c = adStructureType;
        this.f30063d = metricaReporter;
        this.f30064e = du1Var;
        this.f30065f = commonReportDataProvider;
    }

    public final void a(j91 j91Var) {
        this.f30066g = j91Var;
    }
}
