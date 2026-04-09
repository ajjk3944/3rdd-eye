package d5;

import c5.C0407d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class v extends a4.t {
    public static int J(int i) {
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

    public static Map K(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f19825a;
        }
        if (size == 1) {
            C0407d c0407d = (C0407d) arrayList.get(0);
            q5.i.e(c0407d, "pair");
            Map mapSingletonMap = Collections.singletonMap(c0407d.f5921a, c0407d.f5922b);
            q5.i.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            C0407d c0407d2 = (C0407d) obj;
            linkedHashMap.put(c0407d2.f5921a, c0407d2.f5922b);
        }
        return linkedHashMap;
    }

    public static Map L(Map map) {
        q5.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return t.f19825a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        q5.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        q5.i.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
