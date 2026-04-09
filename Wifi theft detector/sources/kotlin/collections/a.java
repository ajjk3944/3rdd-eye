package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import z8.g0;
import z8.h0;

/* loaded from: classes4.dex */
public abstract class a extends h0 {
    public static Map h() {
        EmptyMap emptyMap = EmptyMap.f21944a;
        p.c(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object i(Map map, Object obj) {
        p.e(map, "<this>");
        return g0.a(map, obj);
    }

    public static HashMap j(Pair... pairs) {
        p.e(pairs, "pairs");
        HashMap map = new HashMap(h0.e(pairs.length));
        r(map, pairs);
        return map;
    }

    public static Map k(Pair... pairs) {
        p.e(pairs, "pairs");
        return pairs.length > 0 ? v(pairs, new LinkedHashMap(h0.e(pairs.length))) : h();
    }

    public static Map l(Map map, Object obj) {
        p.e(map, "<this>");
        Map mapW = w(map);
        mapW.remove(obj);
        return n(mapW);
    }

    public static Map m(Pair... pairs) {
        p.e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0.e(pairs.length));
        r(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        p.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : h0.g(map) : h();
    }

    public static Map o(Map map, Map map2) {
        p.e(map, "<this>");
        p.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map p(Map map, Pair pair) {
        p.e(map, "<this>");
        p.e(pair, "pair");
        if (map.isEmpty()) {
            return h0.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.h(), pair.i());
        return linkedHashMap;
    }

    public static final void q(Map map, Iterable pairs) {
        p.e(map, "<this>");
        p.e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void r(Map map, Pair[] pairs) {
        p.e(map, "<this>");
        p.e(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static Map s(Iterable iterable) {
        p.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n(t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return t(iterable, new LinkedHashMap(h0.e(collection.size())));
        }
        return h0.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map t(Iterable iterable, Map destination) {
        p.e(iterable, "<this>");
        p.e(destination, "destination");
        q(destination, iterable);
        return destination;
    }

    public static Map u(Map map) {
        p.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? w(map) : h0.g(map) : h();
    }

    public static final Map v(Pair[] pairArr, Map destination) {
        p.e(pairArr, "<this>");
        p.e(destination, "destination");
        r(destination, pairArr);
        return destination;
    }

    public static Map w(Map map) {
        p.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
