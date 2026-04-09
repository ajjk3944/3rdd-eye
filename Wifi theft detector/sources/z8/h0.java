package z8;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes4.dex */
public abstract class h0 extends g0 {
    public static Map b(Map builder) {
        kotlin.jvm.internal.p.e(builder, "builder");
        return ((MapBuilder) builder).n();
    }

    public static Map c() {
        return new MapBuilder();
    }

    public static Map d(int i10) {
        return new MapBuilder(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(Pair pair) {
        kotlin.jvm.internal.p.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.h(), pair.i());
        kotlin.jvm.internal.p.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.p.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
