package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gb0 extends zt0 {
    public static int i0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map j0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return os.f;
        }
        if (size == 1) {
            gk0 gk0Var = (gk0) arrayList.get(0);
            i30.m(gk0Var, "pair");
            Map mapSingletonMap = Collections.singletonMap(gk0Var.f, gk0Var.g);
            i30.l(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i0(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            gk0 gk0Var2 = (gk0) obj;
            linkedHashMap.put(gk0Var2.f, gk0Var2.g);
        }
        return linkedHashMap;
    }

    public static final Map k0(Map map) {
        i30.m(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        i30.l(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
