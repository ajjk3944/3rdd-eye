package c9;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: Maps.kt */
/* renamed from: c9.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2078B extends C2077A {
    public static <K, V> V n(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.l.f(map, "<this>");
        if (map instanceof InterfaceC2104y) {
            return (V) ((InterfaceC2104y) map).b(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    public static <K, V> Map<K, V> o(b9.l<? extends K, ? extends V>... lVarArr) {
        if (lVarArr.length <= 0) {
            return C2100u.f18582b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(lVarArr.length));
        r(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap p(b9.l... lVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(lVarArr.length));
        r(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap q(Map map, Map map2) {
        kotlin.jvm.internal.l.f(map, "<this>");
        kotlin.jvm.internal.l.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void r(AbstractMap abstractMap, b9.l[] lVarArr) {
        for (b9.l lVar : lVarArr) {
            abstractMap.put(lVar.f18083b, lVar.f18084c);
        }
    }

    public static Map s(ArrayList arrayList) {
        C2100u c2100u = C2100u.f18582b;
        int size = arrayList.size();
        if (size == 0) {
            return c2100u;
        }
        if (size == 1) {
            return C2077A.m((b9.l) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b9.l lVar = (b9.l) it.next();
            linkedHashMap.put(lVar.f18083b, lVar.f18084c);
        }
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C2100u.f18582b;
        }
        if (size != 1) {
            return u(map);
        }
        kotlin.jvm.internal.l.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.l.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap u(Map map) {
        kotlin.jvm.internal.l.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
