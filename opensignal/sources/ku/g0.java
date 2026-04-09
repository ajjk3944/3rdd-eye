package ku;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final gu.a f14553a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f14554b;

    public g0(gu.a aVar) {
        c1 c1Var = c1.f14534a;
        br.l.e(aVar, "vSerializer");
        this.f14553a = aVar;
        this.f14554b = new f0(c1.f14535b, aVar.getDescriptor());
    }

    @Override // ku.a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // ku.a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        br.l.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // ku.a
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        br.l.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // ku.a
    public final int d(Object obj) {
        Map map = (Map) obj;
        br.l.e(map, "<this>");
        return map.size();
    }

    @Override // ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        Map map = (Map) obj;
        br.l.e(map, "builder");
        c1 c1Var = c1.f14534a;
        f0 f0Var = this.f14554b;
        Object objM = aVar.m(f0Var, i10, c1Var, null);
        int iT = aVar.t(f0Var);
        if (iT != i10 + 1) {
            throw new IllegalArgumentException(h0.b.l("Value must follow key in a map, index for key: ", i10, iT, ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objM);
        gu.a aVar2 = this.f14553a;
        map.put(objM, (!zContainsKey || (aVar2.getDescriptor().f() instanceof iu.d)) ? aVar.m(f0Var, iT, aVar2, null) : aVar.m(f0Var, iT, aVar2, mq.b0.O(map, objM)));
    }

    @Override // ku.a
    public final Object g(Object obj) {
        br.l.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return this.f14554b;
    }

    @Override // ku.a
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        br.l.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        d(obj);
        f0 f0Var = this.f14554b;
        br.l.e(f0Var, "descriptor");
        ju.b bVarB = ((mu.y) dVar).b(f0Var);
        Iterator itC = c(obj);
        int i10 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            mu.y yVar = (mu.y) bVarB;
            yVar.w(f0Var, i10, c1.f14534a, key);
            i10 += 2;
            yVar.w(f0Var, i11, this.f14553a, value);
        }
        bVarB.c(f0Var);
    }
}
