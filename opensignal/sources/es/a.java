package es;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final xr.o f8257a;

    /* renamed from: b, reason: collision with root package name */
    public final br.n f8258b;

    /* renamed from: c, reason: collision with root package name */
    public final as.d f8259c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8260d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8261e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8262f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [ar.k, br.n] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ar.k, br.n] */
    public a(xr.o oVar, ar.k kVar) {
        br.l.e(oVar, "jClass");
        this.f8257a = oVar;
        this.f8258b = (br.n) kVar;
        as.d dVar = new as.d(13, this);
        this.f8259c = dVar;
        st.f fVar = new st.f(mq.o.j0(oVar.d()), true, dVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        st.e eVar = new st.e(fVar);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            qs.g gVarC = ((xr.x) next).c();
            Object arrayList = linkedHashMap.get(gVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(gVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f8260d = linkedHashMap;
        st.f fVar2 = new st.f(mq.o.j0(this.f8257a.b()), true, this.f8258b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        st.e eVar2 = new st.e(fVar2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((xr.u) next2).c(), next2);
        }
        this.f8261e = linkedHashMap2;
        ArrayList arrayListE = this.f8257a.e();
        ?? r62 = this.f8258b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r62.a(next3)).booleanValue()) {
                arrayList2.add(next3);
            }
        }
        int iP = mq.b0.P(mq.p.a0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP < 16 ? 16 : iP);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((xr.a0) next4).c(), next4);
        }
        this.f8262f = linkedHashMap3;
    }

    @Override // es.c
    public final Set a() {
        st.f fVar = new st.f(mq.o.j0(this.f8257a.d()), true, this.f8259c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        st.e eVar = new st.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((xr.x) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // es.c
    public final xr.u b(qs.g gVar) {
        br.l.e(gVar, "name");
        return (xr.u) this.f8261e.get(gVar);
    }

    @Override // es.c
    public final xr.a0 c(qs.g gVar) {
        br.l.e(gVar, "name");
        return (xr.a0) this.f8262f.get(gVar);
    }

    @Override // es.c
    public final Set d() {
        return this.f8262f.keySet();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ar.k, br.n] */
    @Override // es.c
    public final Set e() {
        st.f fVar = new st.f(mq.o.j0(this.f8257a.b()), true, this.f8258b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        st.e eVar = new st.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((xr.u) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // es.c
    public final Collection f(qs.g gVar) {
        br.l.e(gVar, "name");
        List list = (List) this.f8260d.get(gVar);
        return list != null ? list : mq.w.f16945a;
    }
}
