package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c51 {

    /* renamed from: a, reason: collision with root package name */
    private final vg f25537a;

    public /* synthetic */ c51() {
        this(new vg());
    }

    public final List<String> a(w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        vg vgVar = this.f25537a;
        List<ag<?>> listB = nativeAd.b();
        vgVar.getClass();
        Set setA = vg.a(listB);
        ArrayList arrayList = new ArrayList();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            String strD = ((jj0) it.next()).d();
            if (strD != null) {
                arrayList.add(strD);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return C2097r.G0(arrayList2);
    }

    public c51(vg assetsImagesProvider) {
        kotlin.jvm.internal.l.f(assetsImagesProvider, "assetsImagesProvider");
        this.f25537a = assetsImagesProvider;
    }
}
