package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ir {

    /* renamed from: a, reason: collision with root package name */
    private final no0 f28840a;

    public ir(no0 integratedMediationNetworkProvider) {
        kotlin.jvm.internal.l.f(integratedMediationNetworkProvider, "integratedMediationNetworkProvider");
        this.f28840a = integratedMediationNetworkProvider;
    }

    public final ArrayList a() {
        ArrayList arrayListA = this.f28840a.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!kotlin.jvm.internal.l.b(((ez0) next).c(), "undefined")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ez0) it2.next()).c());
        }
        return arrayList2;
    }
}
