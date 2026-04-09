package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2078B;
import c9.C2092m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.mobile.ads.impl.az0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yy0 {

    /* renamed from: a, reason: collision with root package name */
    private final fz0 f36112a;

    /* renamed from: b, reason: collision with root package name */
    private final oz0 f36113b;

    public /* synthetic */ yy0() {
        this(new fz0(), new oz0());
    }

    public final Map<String, Object> a(boolean z10) {
        String str = z10 ? "ads-mediation" : "single";
        ArrayList arrayListA = this.f36113b.a(az0.a.a());
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            this.f36112a.getClass();
            if (fz0.a((ez0) next)) {
                arrayList.add(next);
            }
        }
        b9.l lVar = new b9.l("integration_type", str);
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C2077A.m(new b9.l(AppMeasurementSdk.ConditionalUserProperty.NAME, ((ez0) it2.next()).d())));
        }
        return C2078B.o(lVar, new b9.l("networks", arrayList2));
    }

    public yy0(fz0 mediationNetworkValidator, oz0 mediationNetworksDataProvider) {
        kotlin.jvm.internal.l.f(mediationNetworkValidator, "mediationNetworkValidator");
        kotlin.jvm.internal.l.f(mediationNetworksDataProvider, "mediationNetworksDataProvider");
        this.f36112a = mediationNetworkValidator;
        this.f36113b = mediationNetworksDataProvider;
    }
}
