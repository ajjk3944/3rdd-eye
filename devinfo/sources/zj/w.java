package zj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class w extends com.bumptech.glide.c {
    public static Object G(Object obj, Map map) {
        nk.k.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int H(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map I(yj.i iVar) {
        nk.k.e(iVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(iVar.f37638a, iVar.f37639b);
        nk.k.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final void J(HashMap map, yj.i[] iVarArr) {
        for (yj.i iVar : iVarArr) {
            map.put(iVar.f37638a, iVar.f37639b);
        }
    }

    public static Map K(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f38318a;
        }
        if (size == 1) {
            return I((yj.i) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H(arrayList.size()));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            yj.i iVar = (yj.i) obj;
            linkedHashMap.put(iVar.f37638a, iVar.f37639b);
        }
        return linkedHashMap;
    }

    public static Map L(Map map) {
        nk.k.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return t.f38318a;
        }
        if (size != 1) {
            return M(map);
        }
        nk.k.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        nk.k.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap M(Map map) {
        nk.k.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
