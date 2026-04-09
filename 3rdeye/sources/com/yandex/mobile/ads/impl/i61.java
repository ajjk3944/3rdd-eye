package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import c9.C2101v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i61 {
    public static Set a(h61 nativeAdPrivate) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, null);
    }

    public static Set b(h61 nativeAdPrivate) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, o20.f31139b);
    }

    public static Set c(h61 nativeAdPrivate) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, o20.f31140c);
    }

    private static Set a(h61 h61Var, o20 o20Var) {
        List<w20> listC = h61Var.c();
        if (listC == null) {
            return C2101v.f18583b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            C2095p.b0(((w20) it.next()).a(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            n20 n20Var = (n20) next;
            if (o20Var == null || n20Var.b() == o20Var) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((n20) it3.next()).a());
        }
        return C2097r.L0(arrayList3);
    }
}
