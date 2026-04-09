package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import x9.C5786d;

/* loaded from: classes3.dex */
public final class vg1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f34538a;

    public vg1(C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f34538a = adLoadingPhasesManager;
    }

    public final LinkedHashMap a(Set phases) {
        kotlin.jvm.internal.l.f(phases, "phases");
        C5786d c5786dF = x9.l.F(C2097r.j0(this.f34538a.b()), new ug1(phases));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5786d.a aVar = new C5786d.a(c5786dF);
        while (aVar.hasNext()) {
            C4185q4 c4185q4 = (C4185q4) aVar.next();
            String strA = c4185q4.a().a();
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(c4185q4.b());
        }
        return linkedHashMap;
    }
}
