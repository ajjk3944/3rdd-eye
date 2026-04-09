package Zg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class X extends W {
    public static Map h() {
        K k10 = K.f25338a;
        AbstractC6492s.g(k10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return k10;
    }

    public static Object i(Map map, Object obj) {
        AbstractC6492s.i(map, "<this>");
        return V.a(map, obj);
    }

    public static HashMap j(Yg.s... pairs) {
        AbstractC6492s.i(pairs, "pairs");
        HashMap map = new HashMap(U.d(pairs.length));
        q(map, pairs);
        return map;
    }

    public static Map k(Yg.s... pairs) {
        AbstractC6492s.i(pairs, "pairs");
        return pairs.length > 0 ? w(pairs, new LinkedHashMap(U.d(pairs.length))) : U.h();
    }

    public static Map l(Yg.s... pairs) {
        AbstractC6492s.i(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(pairs.length));
        q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map m(Map map) {
        AbstractC6492s.i(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : W.f(map) : U.h();
    }

    public static Map n(Map map, Map map2) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void o(Map map, Iterable pairs) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Yg.s sVar = (Yg.s) it.next();
            map.put(sVar.a(), sVar.c());
        }
    }

    public static final void p(Map map, InterfaceC8780j pairs) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Yg.s sVar = (Yg.s) it.next();
            map.put(sVar.a(), sVar.c());
        }
    }

    public static final void q(Map map, Yg.s[] pairs) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(pairs, "pairs");
        for (Yg.s sVar : pairs) {
            map.put(sVar.a(), sVar.c());
        }
    }

    public static Map r(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return U.h();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(U.d(collection.size())));
        }
        return U.e((Yg.s) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map s(Iterable iterable, Map destination) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(destination, "destination");
        U.o(destination, iterable);
        return destination;
    }

    public static Map t(Map map) {
        AbstractC6492s.i(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? U.x(map) : W.f(map) : U.h();
    }

    public static Map u(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return m(v(interfaceC8780j, new LinkedHashMap()));
    }

    public static final Map v(InterfaceC8780j interfaceC8780j, Map destination) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(destination, "destination");
        p(destination, interfaceC8780j);
        return destination;
    }

    public static final Map w(Yg.s[] sVarArr, Map destination) {
        AbstractC6492s.i(sVarArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        q(destination, sVarArr);
        return destination;
    }

    public static Map x(Map map) {
        AbstractC6492s.i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
