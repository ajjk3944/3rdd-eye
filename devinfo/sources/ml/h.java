package ml;

import com.google.android.gms.internal.ads.be1;
import d0.z0;
import java.util.LinkedHashMap;
import java.util.Map;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public final il.a f29413a;

    /* renamed from: b, reason: collision with root package name */
    public final g f29414b;

    public h(il.a aVar) {
        p pVar = p.f29436a;
        this.f29413a = aVar;
        this.f29414b = new g(p.f29437b, aVar.d());
    }

    @Override // il.a
    public Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        nk.k.e(be1Var, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nk.k.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        be1 be1VarB = be1Var.b(d());
        while (true) {
            int iF = be1VarB.f(d());
            if (iF == -1) {
                be1VarB.s(d());
                nk.k.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i4 = iF + size;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            nk.k.e(linkedHashMap2, "builder");
            p pVar = p.f29436a;
            g gVar = this.f29414b;
            Object objM = be1VarB.m(gVar, i4, pVar, null);
            int iF2 = be1VarB.f(gVar);
            if (iF2 != i4 + 1) {
                throw new IllegalArgumentException(a0.g.i(i4, iF2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean zContainsKey = linkedHashMap2.containsKey(objM);
            il.a aVar = this.f29413a;
            linkedHashMap2.put(objM, (!zContainsKey || (aVar.d().e() instanceof kl.c)) ? be1VarB.m(gVar, iF2, aVar, null) : be1VarB.m(gVar, iF2, aVar, w.G(objM, linkedHashMap2)));
        }
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        Map map = (Map) obj;
        nk.k.e(map, "<this>");
        map.size();
        g gVar = this.f29414b;
        nk.k.e(gVar, "descriptor");
        z0 z0VarC = z0Var.c(gVar);
        Map map2 = (Map) obj;
        nk.k.e(map2, "<this>");
        int i4 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i4 + 1;
            z0VarC.k(gVar, i4, p.f29436a, key);
            i4 += 2;
            z0VarC.k(gVar, i10, this.f29413a, value);
        }
        z0VarC.o(gVar);
    }

    @Override // il.a
    public final kl.d d() {
        return this.f29414b;
    }
}
