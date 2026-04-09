package as;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f2224a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f2225b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2226c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f2227d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f2228e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f2229f;

    /* renamed from: g, reason: collision with root package name */
    public static final g0 f2230g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2231h;

    /* renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f2232i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setB0 = mq.l.B0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(mq.p.a0(setB0, 10));
        for (String str : setB0) {
            String desc = ys.c.BOOLEAN.getDesc();
            br.l.d(desc, "BOOLEAN.desc");
            arrayList.add(n.a("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f2224a = arrayList;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g0) it.next()).f2218b);
        }
        f2225b = arrayList2;
        ArrayList arrayList3 = f2224a;
        ArrayList arrayList4 = new ArrayList(mq.p.a0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((g0) it2.next()).f2217a.b());
        }
        String strConcat = "java/util/".concat("Collection");
        ys.c cVar = ys.c.BOOLEAN;
        String desc2 = cVar.getDesc();
        br.l.d(desc2, "BOOLEAN.desc");
        g0 g0VarA = n.a(strConcat, "contains", "Ljava/lang/Object;", desc2);
        i0 i0Var = i0.FALSE;
        lq.l lVar = new lq.l(g0VarA, i0Var);
        String strConcat2 = "java/util/".concat("Collection");
        String desc3 = cVar.getDesc();
        br.l.d(desc3, "BOOLEAN.desc");
        lq.l lVar2 = new lq.l(n.a(strConcat2, "remove", "Ljava/lang/Object;", desc3), i0Var);
        String strConcat3 = "java/util/".concat("Map");
        String desc4 = cVar.getDesc();
        br.l.d(desc4, "BOOLEAN.desc");
        lq.l lVar3 = new lq.l(n.a(strConcat3, "containsKey", "Ljava/lang/Object;", desc4), i0Var);
        String strConcat4 = "java/util/".concat("Map");
        String desc5 = cVar.getDesc();
        br.l.d(desc5, "BOOLEAN.desc");
        lq.l lVar4 = new lq.l(n.a(strConcat4, "containsValue", "Ljava/lang/Object;", desc5), i0Var);
        String strConcat5 = "java/util/".concat("Map");
        String desc6 = cVar.getDesc();
        br.l.d(desc6, "BOOLEAN.desc");
        lq.l lVar5 = new lq.l(n.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), i0Var);
        lq.l lVar6 = new lq.l(n.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), i0.MAP_GET_OR_DEFAULT);
        g0 g0VarA2 = n.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        i0 i0Var2 = i0.NULL;
        lq.l lVar7 = new lq.l(g0VarA2, i0Var2);
        lq.l lVar8 = new lq.l(n.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), i0Var2);
        String strConcat6 = "java/util/".concat("List");
        ys.c cVar2 = ys.c.INT;
        String desc7 = cVar2.getDesc();
        br.l.d(desc7, "INT.desc");
        g0 g0VarA3 = n.a(strConcat6, "indexOf", "Ljava/lang/Object;", desc7);
        i0 i0Var3 = i0.INDEX;
        lq.l lVar9 = new lq.l(g0VarA3, i0Var3);
        String strConcat7 = "java/util/".concat("List");
        String desc8 = cVar2.getDesc();
        br.l.d(desc8, "INT.desc");
        Map mapR = mq.b0.R(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, new lq.l(n.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", desc8), i0Var3));
        f2226c = mapR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mq.b0.P(mapR.size()));
        for (Map.Entry entry : mapR.entrySet()) {
            linkedHashMap.put(((g0) entry.getKey()).f2218b, entry.getValue());
        }
        f2227d = linkedHashMap;
        LinkedHashSet linkedHashSetN = mq.f0.N(f2226c.keySet(), f2224a);
        ArrayList arrayList5 = new ArrayList(mq.p.a0(linkedHashSetN, 10));
        Iterator it3 = linkedHashSetN.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((g0) it3.next()).f2217a);
        }
        f2228e = mq.o.U0(arrayList5);
        ArrayList arrayList6 = new ArrayList(mq.p.a0(linkedHashSetN, 10));
        Iterator it4 = linkedHashSetN.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((g0) it4.next()).f2218b);
        }
        f2229f = mq.o.U0(arrayList6);
        ys.c cVar3 = ys.c.INT;
        String desc9 = cVar3.getDesc();
        br.l.d(desc9, "INT.desc");
        g0 g0VarA4 = n.a("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f2230g = g0VarA4;
        String strConcat8 = "java/lang/".concat("Number");
        String desc10 = ys.c.BYTE.getDesc();
        br.l.d(desc10, "BYTE.desc");
        lq.l lVar10 = new lq.l(n.a(strConcat8, "toByte", "", desc10), qs.g.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String desc11 = ys.c.SHORT.getDesc();
        br.l.d(desc11, "SHORT.desc");
        lq.l lVar11 = new lq.l(n.a(strConcat9, "toShort", "", desc11), qs.g.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String desc12 = cVar3.getDesc();
        br.l.d(desc12, "INT.desc");
        lq.l lVar12 = new lq.l(n.a(strConcat10, "toInt", "", desc12), qs.g.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String desc13 = ys.c.LONG.getDesc();
        br.l.d(desc13, "LONG.desc");
        lq.l lVar13 = new lq.l(n.a(strConcat11, "toLong", "", desc13), qs.g.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String desc14 = ys.c.FLOAT.getDesc();
        br.l.d(desc14, "FLOAT.desc");
        lq.l lVar14 = new lq.l(n.a(strConcat12, "toFloat", "", desc14), qs.g.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String desc15 = ys.c.DOUBLE.getDesc();
        br.l.d(desc15, "DOUBLE.desc");
        lq.l lVar15 = new lq.l(n.a(strConcat13, "toDouble", "", desc15), qs.g.e("doubleValue"));
        lq.l lVar16 = new lq.l(g0VarA4, qs.g.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String desc16 = cVar3.getDesc();
        br.l.d(desc16, "INT.desc");
        String desc17 = ys.c.CHAR.getDesc();
        br.l.d(desc17, "CHAR.desc");
        Map mapR2 = mq.b0.R(lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, new lq.l(n.a(strConcat14, "get", desc16, desc17), qs.g.e("charAt")));
        f2231h = mapR2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mq.b0.P(mapR2.size()));
        for (Map.Entry entry2 : mapR2.entrySet()) {
            linkedHashMap2.put(((g0) entry2.getKey()).f2218b, entry2.getValue());
        }
        f2232i = linkedHashMap2;
        Set setKeySet = f2231h.keySet();
        ArrayList arrayList7 = new ArrayList(mq.p.a0(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((g0) it5.next()).f2217a);
        }
        j = arrayList7;
        Set<Map.Entry> setEntrySet = f2231h.entrySet();
        ArrayList arrayList8 = new ArrayList(mq.p.a0(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new lq.l(((g0) entry3.getKey()).f2217a, entry3.getValue()));
        }
        int iP = mq.b0.P(mq.p.a0(arrayList8, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            lq.l lVar17 = (lq.l) it6.next();
            linkedHashMap3.put((qs.g) lVar17.f15572d, (qs.g) lVar17.f15571a);
        }
        k = linkedHashMap3;
    }
}
