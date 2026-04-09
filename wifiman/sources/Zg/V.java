package Zg;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
abstract class V {
    public static final Object a(Map map, Object obj) {
        AbstractC6492s.i(map, "<this>");
        if (map instanceof T) {
            return ((T) map).o(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
