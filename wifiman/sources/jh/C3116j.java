package Jh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* renamed from: Jh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3116j {

    /* renamed from: a, reason: collision with root package name */
    public static final C3116j f10189a = new C3116j();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10190b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10191c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f10192d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f10193e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f10194f;

    static {
        Zh.d dVar = o.a.f51880s;
        Yg.s sVarA = Yg.z.a(AbstractC3117k.d(dVar, "name"), kotlin.reflect.jvm.internal.impl.builtins.o.f51789m);
        Yg.s sVarA2 = Yg.z.a(AbstractC3117k.d(dVar, "ordinal"), Zh.f.h("ordinal"));
        Yg.s sVarA3 = Yg.z.a(AbstractC3117k.c(o.a.f51841X, "size"), Zh.f.h("size"));
        Zh.c cVar = o.a.f51847b0;
        Map mapK = Zg.U.k(sVarA, sVarA2, sVarA3, Yg.z.a(AbstractC3117k.c(cVar, "size"), Zh.f.h("size")), Yg.z.a(AbstractC3117k.d(o.a.f51856g, "length"), Zh.f.h("length")), Yg.z.a(AbstractC3117k.c(cVar, "keys"), Zh.f.h("keySet")), Yg.z.a(AbstractC3117k.c(cVar, "values"), Zh.f.h("values")), Yg.z.a(AbstractC3117k.c(cVar, "entries"), Zh.f.h("entrySet")));
        f10190b = mapK;
        Set<Map.Entry> setEntrySet = mapK.entrySet();
        ArrayList<Yg.s> arrayList = new ArrayList(AbstractC3689v.w(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Yg.s(((Zh.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Yg.s sVar : arrayList) {
            Zh.f fVar = (Zh.f) sVar.j();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((Zh.f) sVar.h());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Zg.U.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC3689v.g0((Iterable) entry2.getValue()));
        }
        f10191c = linkedHashMap2;
        Map map = f10190b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            Ah.c cVar2 = Ah.c.f771a;
            Zh.d dVarJ = ((Zh.c) entry3.getKey()).e().j();
            AbstractC6492s.h(dVarJ, "toUnsafe(...)");
            Zh.b bVarN = cVar2.n(dVarJ);
            AbstractC6492s.f(bVarN);
            linkedHashSet.add(bVarN.a().c((Zh.f) entry3.getValue()));
        }
        f10192d = linkedHashSet;
        Set setKeySet = f10190b.keySet();
        f10193e = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Zh.c) it.next()).g());
        }
        f10194f = AbstractC3689v.n1(arrayList3);
    }

    private C3116j() {
    }

    public final Map a() {
        return f10190b;
    }

    public final List b(Zh.f name1) {
        AbstractC6492s.i(name1, "name1");
        List list = (List) f10191c.get(name1);
        return list == null ? AbstractC3689v.l() : list;
    }

    public final Set c() {
        return f10193e;
    }

    public final Set d() {
        return f10194f;
    }
}
