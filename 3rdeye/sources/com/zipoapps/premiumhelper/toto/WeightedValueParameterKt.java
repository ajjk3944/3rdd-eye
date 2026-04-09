package com.zipoapps.premiumhelper.toto;

import c9.C2097r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* compiled from: WeightedValueParameter.kt */
/* loaded from: classes3.dex */
public final class WeightedValueParameterKt {
    public static final List<WeightedValueParameter> asWeightedParamsList(Map<String, ? extends Map<String, Integer>> map) {
        l.f(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Map<String, Integer>> entry : map.entrySet()) {
            arrayList.add(new WeightedValueParameter(entry.getKey(), entry.getValue()));
        }
        return C2097r.G0(arrayList);
    }
}
