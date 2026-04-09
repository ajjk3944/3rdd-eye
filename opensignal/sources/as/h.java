package as;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2219a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2220b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f2221c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f2222d;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    static {
        qs.e eVar = or.n.j;
        lq.l lVar = new lq.l(eVar.b(qs.g.e("name")).g(), qs.g.e("name"));
        lq.l lVar2 = new lq.l(eVar.b(qs.g.e("ordinal")).g(), qs.g.e("ordinal"));
        lq.l lVar3 = new lq.l(or.n.B.c(qs.g.e("size")), qs.g.e("size"));
        qs.c cVar = or.n.F;
        Map mapR = mq.b0.R(lVar, lVar2, lVar3, new lq.l(cVar.c(qs.g.e("size")), qs.g.e("size")), new lq.l(or.n.f19693e.b(qs.g.e("length")).g(), qs.g.e("length")), new lq.l(cVar.c(qs.g.e("keys")), qs.g.e("keySet")), new lq.l(cVar.c(qs.g.e("values")), qs.g.e("values")), new lq.l(cVar.c(qs.g.e("entries")), qs.g.e("entrySet")));
        f2219a = mapR;
        Set<Map.Entry> setEntrySet = mapR.entrySet();
        ArrayList arrayList = new ArrayList(mq.p.a0(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new lq.l(((qs.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lq.l lVar4 = (lq.l) it.next();
            qs.g gVar = (qs.g) lVar4.f15572d;
            Object arrayList2 = linkedHashMap.get(gVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(gVar, arrayList2);
            }
            ((List) arrayList2).add((qs.g) lVar4.f15571a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mq.b0.P(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), mq.o.l0((Iterable) entry2.getValue()));
        }
        f2220b = linkedHashMap2;
        Set setKeySet = f2219a.keySet();
        f2221c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(mq.p.a0(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((qs.c) it2.next()).f());
        }
        f2222d = mq.o.U0(arrayList3);
    }
}
