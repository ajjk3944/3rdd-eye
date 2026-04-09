package Jh;

import Zh.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f10200a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10201b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10202c;

    static {
        r rVar = new r();
        f10200a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f10201b = linkedHashMap;
        Zh.i iVar = Zh.i.f25477a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = Zh.b.f25401d;
        rVar.c(aVar.c(new Zh.c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new Zh.c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(Yg.z.a(((Zh.b) entry.getKey()).a(), ((Zh.b) entry.getValue()).a()));
        }
        f10202c = Zg.U.r(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Zh.b.f25401d.c(new Zh.c(str)));
        }
        return arrayList;
    }

    private final void c(Zh.b bVar, List list) {
        Map map = f10201b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final Zh.c b(Zh.c classFqName) {
        AbstractC6492s.i(classFqName, "classFqName");
        return (Zh.c) f10202c.get(classFqName);
    }
}
