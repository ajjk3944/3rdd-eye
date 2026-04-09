package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class vg {
    public static Set a(List assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        ArrayList arrayList = new ArrayList(C2092m.T(assets, 10));
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            arrayList.add(((ag) it.next()).d());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            List<jj0> listG = next instanceof jj0 ? E.u.G(next) : next instanceof sw0 ? ((sw0) next).a() : null;
            if (listG != null) {
                arrayList2.add(listG);
            }
        }
        return C2097r.L0(C2092m.U(arrayList2));
    }
}
