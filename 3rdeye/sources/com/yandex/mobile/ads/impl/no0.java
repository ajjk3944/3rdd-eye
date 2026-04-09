package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.ez0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class no0 {

    /* renamed from: a, reason: collision with root package name */
    private final oz0 f30955a;

    public /* synthetic */ no0() {
        this(new oz0());
    }

    public final ArrayList a() {
        ArrayList arrayListA = this.f30955a.a(az0.a.a());
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List<ez0.c> listB = ((ez0) next).b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator<T> it2 = listB.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((ez0.c) it2.next()).c()) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public no0(oz0 mediationNetworksDataProvider) {
        kotlin.jvm.internal.l.f(mediationNetworksDataProvider, "mediationNetworksDataProvider");
        this.f30955a = mediationNetworksDataProvider;
    }
}
