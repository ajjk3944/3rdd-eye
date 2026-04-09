package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class po1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f31857a;

    /* JADX WARN: Multi-variable type inference failed */
    public po1(List<? extends ag<?>> assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f31857a = assets;
    }

    public final ArrayList a(x61 viewAdapter) {
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        List<ag<?>> list = this.f31857a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            bg<?> bgVarA = viewAdapter.a((ag<?>) obj);
            if (bgVarA != null && bgVarA.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ag) it.next()).b());
        }
        return arrayList2;
    }
}
