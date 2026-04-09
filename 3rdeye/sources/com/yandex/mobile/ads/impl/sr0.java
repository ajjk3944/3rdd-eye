package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2091l;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class sr0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33190a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f33191b;

    /* renamed from: c, reason: collision with root package name */
    private final ze f33192c;

    /* renamed from: d, reason: collision with root package name */
    private final y01 f33193d;

    public /* synthetic */ sr0(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, new ze(), y01.f35576e.a());
    }

    private final List<C4128i3> a() {
        C4128i3 c4128i3A;
        C4128i3 c4128i3A2;
        try {
            this.f33192c.a();
            c4128i3A = null;
        } catch (oo0 e4) {
            int i = i7.f28531A;
            c4128i3A = i7.a(e4.getMessage(), e4.a());
        }
        try {
            this.f33193d.a(this.f33190a);
            c4128i3A2 = null;
        } catch (oo0 e10) {
            int i10 = i7.f28531A;
            c4128i3A2 = i7.a(e10.getMessage(), e10.a());
        }
        return C2091l.l(new C4128i3[]{c4128i3A, c4128i3A2, this.f33191b.c() == null ? i7.f() : null, this.f33191b.a() == null ? i7.t() : null});
    }

    public final C4128i3 b() {
        List<C4128i3> listA = a();
        C4128i3 c4128i3E = this.f33191b.r() == null ? i7.e() : null;
        ArrayList arrayListY0 = C2097r.y0(c4128i3E != null ? E.u.G(c4128i3E) : C2099t.f18581b, listA);
        String strB = this.f33191b.b().b();
        ArrayList arrayList = new ArrayList(C2092m.T(arrayListY0, 10));
        Iterator it = arrayListY0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4128i3) it.next()).d());
        }
        C4156m3.a(strB, arrayList);
        return (C4128i3) C2097r.q0(arrayListY0);
    }

    public final C4128i3 c() {
        return (C4128i3) C2097r.q0(a());
    }

    public sr0(Context context, C4072a3 adConfiguration, ze appMetricaIntegrationValidator, y01 mobileAdsIntegrationValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(appMetricaIntegrationValidator, "appMetricaIntegrationValidator");
        kotlin.jvm.internal.l.f(mobileAdsIntegrationValidator, "mobileAdsIntegrationValidator");
        this.f33190a = context;
        this.f33191b = adConfiguration;
        this.f33192c = appMetricaIntegrationValidator;
        this.f33193d = mobileAdsIntegrationValidator;
    }
}
