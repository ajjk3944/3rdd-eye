package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class uw0 {
    public static Set a(w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        List<ag<?>> listB = nativeAd.b();
        ArrayList arrayList = new ArrayList(C2092m.T(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((ag) it.next()).d());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (sw0.class.isInstance(next)) {
                arrayList2.add(next);
            }
        }
        return C2097r.L0(arrayList2);
    }
}
