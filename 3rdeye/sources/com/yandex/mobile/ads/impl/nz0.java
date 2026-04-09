package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import com.yandex.mobile.ads.impl.az0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class nz0 {

    /* renamed from: a, reason: collision with root package name */
    private final oz0 f31101a;

    public nz0(oz0 networksDataProvider) {
        kotlin.jvm.internal.l.f(networksDataProvider, "networksDataProvider");
        this.f31101a = networksDataProvider;
    }

    public final ArrayList a(List mediationNetworks) {
        kotlin.jvm.internal.l.f(mediationNetworks, "mediationNetworks");
        ArrayList arrayList = new ArrayList(C2092m.T(mediationNetworks, 10));
        Iterator it = mediationNetworks.iterator();
        while (it.hasNext()) {
            lx lxVar = (lx) it.next();
            List<String> listB = lxVar.b();
            ArrayList arrayList2 = new ArrayList(C2092m.T(listB, 10));
            for (String str : listB) {
                List listQ0 = y9.q.q0(str, new char[]{'.'});
                String str2 = (String) C2097r.r0(C2092m.V(listQ0) - 1, listQ0);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new az0.b(str2, str));
            }
            String strF = lxVar.f();
            String strC = lxVar.c();
            if (strC == null) {
                strC = "undefined";
            }
            arrayList.add(new az0(strF, strC, arrayList2));
        }
        return this.f31101a.a(arrayList);
    }
}
