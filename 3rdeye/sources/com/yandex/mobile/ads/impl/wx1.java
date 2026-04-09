package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import c9.C2092m;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wx1 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35108a;

    /* renamed from: b, reason: collision with root package name */
    private final o71 f35109b;

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f35110c;

    public wx1(Context context, a8<?> adResponse, C4072a3 adConfiguration, o71 o71Var, mp1 metricaReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        this.f35108a = adResponse;
        this.f35109b = o71Var;
        this.f35110c = metricaReporter;
    }

    public final void a(List<n02> socialActionItems) {
        kotlin.jvm.internal.l.f(socialActionItems, "socialActionItems");
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(ip1.a.f28774a, "adapter");
        ArrayList arrayList = new ArrayList(C2092m.T(socialActionItems, 10));
        Iterator<T> it = socialActionItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((n02) it.next()).b());
        }
        jp1Var.b((String[]) arrayList.toArray(new String[0]), "social_actions");
        o71 o71Var = this.f35109b;
        if (o71Var != null) {
            jp1Var = kp1.a(jp1Var, o71Var.a());
        }
        jp1Var.a(this.f35108a.a());
        ip1.b bVar = ip1.b.f28781G;
        Map<String, Object> mapB = jp1Var.b();
        this.f35110c.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1Var, bVar, "reportType", mapB, "reportData")));
    }
}
