package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class g70 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f27565a;

    /* JADX WARN: Multi-variable type inference failed */
    public g70(List<? extends ag<?>> assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f27565a = assets;
    }

    public final ArrayList a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<ag<?>> list = this.f27565a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            bg<?> bgVarA = nativeAdViewAdapter.a((ag<?>) next);
            if (bgVarA == null || !bgVarA.b()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ag) it2.next()).b());
        }
        return arrayList3;
    }
}
