package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.ez0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class oz0 {

    /* renamed from: a, reason: collision with root package name */
    private String f31533a;

    public final ArrayList a(List networks) {
        com.monetization.ads.mediation.base.a aVar;
        ez0.c cVar;
        kotlin.jvm.internal.l.f(networks, "networks");
        ArrayList arrayList = new ArrayList(C2092m.T(networks, 10));
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            az0 az0Var = (az0) it.next();
            List<az0.b> listB = az0Var.b();
            ArrayList arrayList2 = new ArrayList(C2092m.T(listB, 10));
            for (az0.b bVar : listB) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) do1.a.a(bVar.a(), new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    cVar = new ez0.c(bVar.b(), null, false);
                } else {
                    hx0 hx0Var = new hx0(aVar);
                    if (this.f31533a == null) {
                        this.f31533a = hx0Var.b().getNetworkSdkVersion();
                    }
                    cVar = new ez0.c(bVar.b(), hx0Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(cVar);
            }
            String str = this.f31533a;
            this.f31533a = null;
            arrayList.add(new ez0(az0Var.d(), az0Var.c(), str, arrayList2));
        }
        return arrayList;
    }
}
