package S9;

import K6.P0;
import O9.l;
import R9.AbstractC1564a;
import S9.C1586s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: JsonNamesMap.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final C1586s.a<Map<String, Integer>> f12110a = new C1586s.a<>();

    public static final int a(O9.e eVar, AbstractC1564a json, String name) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(name, "name");
        c(eVar, json);
        int iD = eVar.d(name);
        if (iD != -3 || !json.f11781a.f11805g) {
            return iD;
        }
        C1586s.a<Map<String, Integer>> aVar = f12110a;
        P0 p02 = new P0(1, eVar, json);
        C1586s c1586s = json.f11783c;
        c1586s.getClass();
        Object objA = c1586s.a(eVar, aVar);
        if (objA == null) {
            objA = p02.invoke();
            ConcurrentHashMap concurrentHashMap = c1586s.f12105a;
            Object concurrentHashMap2 = concurrentHashMap.get(eVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objA);
        }
        Integer num = (Integer) ((Map) objA).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(O9.e eVar, AbstractC1564a json, String name, String suffix) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(suffix, "suffix");
        int iA = a(eVar, json, name);
        if (iA != -3) {
            return iA;
        }
        throw new M9.i(eVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void c(O9.e eVar, AbstractC1564a json) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.b(eVar.e(), l.a.f10523a);
    }
}
