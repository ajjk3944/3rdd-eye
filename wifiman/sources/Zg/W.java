package Zg;

import ah.C3854d;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.MPv3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class W extends V {
    public static Map b(Map builder) {
        AbstractC6492s.i(builder, "builder");
        return ((C3854d) builder).y();
    }

    public static Map c() {
        return new C3854d();
    }

    public static int d(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : MPv3.MAX_MESSAGE_ID;
    }

    public static Map e(Yg.s pair) {
        AbstractC6492s.i(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.h(), pair.j());
        AbstractC6492s.h(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map f(Map map) {
        AbstractC6492s.i(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC6492s.h(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap g(Map map, Comparator comparator) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
