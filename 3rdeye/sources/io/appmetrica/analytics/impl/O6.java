package io.appmetrica.analytics.impl;

import c9.C2077A;
import c9.C2091l;
import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class O6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4828nm[] fromModel(Map<String, ? extends List<String>> map) {
        C4828nm[] c4828nmArr = new C4828nm[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4828nm c4828nm = new C4828nm();
            c4828nm.f41317a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c4828nm.f41318b = (String[]) array;
            c4828nmArr[i] = c4828nm;
            i = i10;
        }
        return c4828nmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C4828nm[] c4828nmArr) {
        int iL = C2077A.l(c4828nmArr.length);
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (C4828nm c4828nm : c4828nmArr) {
            linkedHashMap.put(c4828nm.f41317a, C2091l.t(c4828nm.f41318b));
        }
        return linkedHashMap;
    }
}
