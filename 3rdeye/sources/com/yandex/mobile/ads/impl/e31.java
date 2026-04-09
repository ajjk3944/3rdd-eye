package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e31 {
    public static double a(List imageValues) {
        Object next;
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList(C2092m.T(imageValues, 10));
        Iterator it = imageValues.iterator();
        while (true) {
            double dG = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            if (((jj0) it.next()).a() != 0) {
                dG = r2.g() / r2.a();
            }
            arrayList.add(Double.valueOf(dG));
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(com.google.gson.internal.c.x(((Number) it2.next()).doubleValue() * 1000)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int iIntValue = 1;
            if (!it3.hasNext()) {
                break;
            }
            int iIntValue2 = ((Number) it3.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int iIntValue3 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int iIntValue4 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue3 < iIntValue4) {
                        next = next2;
                        iIntValue3 = iIntValue4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue5 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && iIntValue5 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Map.Entry) it5.next()).getKey()).intValue() / 1000));
        }
        List listB0 = C2097r.B0(arrayList3);
        int size = listB0.size();
        int i = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i10 = size % 2;
        if (i10 + ((((i10 ^ 2) & ((-i10) | i10)) >> 31) & 2) == 1) {
            return ((Number) listB0.get(i)).doubleValue();
        }
        return (((Number) listB0.get(i - 1)).doubleValue() + ((Number) listB0.get(i)).doubleValue()) / 2;
    }
}
