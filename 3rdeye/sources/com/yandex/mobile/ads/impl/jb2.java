package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jb2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ za2 f29056a;

    public jb2(za2 za2Var) {
        this.f29056a = za2Var;
    }

    @Override // com.yandex.mobile.ads.impl.wf2
    public final Map<String, List<String>> a() {
        List<y52> listB = this.f29056a.l().b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listB) {
            String strA = ((y52) obj).a();
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2077A.l(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C2092m.T(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y52) it.next()).c());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
