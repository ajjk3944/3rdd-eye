package Hi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7981a = new e();

    private e() {
    }

    public final boolean a(Map map, Map.Entry element) {
        AbstractC6492s.i(map, "map");
        AbstractC6492s.i(element, "element");
        Object obj = map.get(element.getKey());
        return obj != null ? AbstractC6492s.d(obj, element.getValue()) : element.getValue() == null && map.containsKey(element.getKey());
    }

    public final boolean b(Map thisMap, Map otherMap) {
        AbstractC6492s.i(thisMap, "thisMap");
        AbstractC6492s.i(otherMap, "otherMap");
        if (thisMap.size() != otherMap.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (otherMap.isEmpty()) {
            return true;
        }
        Iterator it = otherMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!f7981a.a(thisMap, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int c(Map map) {
        AbstractC6492s.i(map, "map");
        return map.entrySet().hashCode();
    }
}
