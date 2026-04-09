package as;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f2233a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2234b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f2233a = linkedHashMap;
        b(qs.j.f21059q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(qs.j.f21060r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(qs.j.f21061s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(qs.b.j(new qs.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(qs.b.j(new qs.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new lq.l(((qs.b) entry.getKey()).b(), ((qs.b) entry.getValue()).b()));
        }
        f2234b = mq.b0.V(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(qs.b.j(new qs.c(str)));
        }
        return arrayList;
    }

    public static void b(qs.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            f2233a.put(next, bVar);
        }
    }
}
