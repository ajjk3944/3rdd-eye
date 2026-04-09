package z8;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class g0 {
    public static final Object a(Map map, Object obj) {
        kotlin.jvm.internal.p.e(map, "<this>");
        if (map instanceof f0) {
            return ((f0) map).b(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
