package io.appmetrica.analytics.impl;

import c9.C2078B;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Dd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C5031vk f39301a = Ga.j().o();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4906qm[] fromModel(Map<String, ? extends Object> map) {
        C4906qm c4906qm;
        Map<String, C4922rd> mapC = this.f39301a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C4922rd c4922rd = mapC.get(key);
            if (c4922rd == null || value == null) {
                c4906qm = null;
            } else {
                c4906qm = new C4906qm();
                c4906qm.f41494a = key;
                c4906qm.f41495b = (byte[]) c4922rd.f41573c.fromModel(value);
            }
            if (c4906qm != null) {
                arrayList.add(c4906qm);
            }
        }
        Object[] array = arrayList.toArray(new C4906qm[0]);
        if (array != null) {
            return (C4906qm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C4906qm[] c4906qmArr) {
        Map<String, C4922rd> mapC = this.f39301a.c();
        ArrayList arrayList = new ArrayList();
        for (C4906qm c4906qm : c4906qmArr) {
            C4922rd c4922rd = mapC.get(c4906qm.f41494a);
            b9.l lVar = c4922rd != null ? new b9.l(c4906qm.f41494a, c4922rd.f41573c.toModel(c4906qm.f41495b)) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return C2078B.s(arrayList);
    }
}
