package io.appmetrica.analytics.impl;

import c9.C2077A;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class Gk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ik fromModel(Map<String, byte[]> map) {
        Ik ik = new Ik();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Jk jk = new Jk();
            jk.f39696a = entry.getKey().getBytes(C5819a.f48359b);
            jk.f39697b = entry.getValue();
            arrayList.add(jk);
        }
        Object[] array = arrayList.toArray(new Jk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        ik.f39650a = (Jk[]) array;
        return ik;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Ik ik) {
        Jk[] jkArr = ik.f39650a;
        int iL = C2077A.l(jkArr.length);
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (Jk jk : jkArr) {
            linkedHashMap.put(new String(jk.f39696a, C5819a.f48359b), jk.f39697b);
        }
        return linkedHashMap;
    }
}
