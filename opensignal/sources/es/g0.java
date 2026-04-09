package es;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rr.m0;

/* loaded from: classes.dex */
public final class g0 extends h0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8303p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final xr.o f8304n;

    /* renamed from: o, reason: collision with root package name */
    public final j f8305o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cj.a aVar, xr.o oVar, j jVar) {
        super(aVar, null);
        br.l.e(oVar, "jClass");
        this.f8304n = oVar;
        this.f8305o = jVar;
    }

    public static m0 v(m0 m0Var) {
        if (m0Var.f().isReal()) {
            return m0Var;
        }
        Collection collectionP = m0Var.p();
        br.l.d(collectionP, "this.overriddenDescriptors");
        Collection<m0> collection = collectionP;
        ArrayList arrayList = new ArrayList(mq.p.a0(collection, 10));
        for (m0 m0Var2 : collection) {
            br.l.d(m0Var2, "it");
            arrayList.add(v(m0Var2));
        }
        return (m0) mq.o.I0(mq.o.l0(arrayList));
    }

    @Override // at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return null;
    }

    @Override // es.c0
    public final Set h(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return mq.y.f16947a;
    }

    @Override // es.c0
    public final Set i(at.f fVar, at.k kVar) {
        br.l.e(fVar, "kindFilter");
        Set setT0 = mq.o.T0(((c) this.f8274e.c()).a());
        j jVar = this.f8305o;
        g0 g0VarV = vc.e.v(jVar);
        Set setD = g0VarV != null ? g0VarV.d() : null;
        if (setD == null) {
            setD = mq.y.f16947a;
        }
        setT0.addAll(setD);
        if (this.f8304n.f25509a.isEnum()) {
            setT0.addAll(e5.I(or.o.f19715c, or.o.f19713a));
        }
        cj.a aVar = this.f8271b;
        ((ys.a) ((ds.a) aVar.f3974d).f7467x).getClass();
        br.l.e(aVar, "_context_receiver_0");
        br.l.e(jVar, "thisDescriptor");
        setT0.addAll(new ArrayList());
        return setT0;
    }

    @Override // es.c0
    public final void j(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
        cj.a aVar = this.f8271b;
        ((ys.a) ((ds.a) aVar.f3974d).f7467x).getClass();
        br.l.e(aVar, "_context_receiver_0");
        br.l.e(this.f8305o, "thisDescriptor");
        br.l.e(gVar, "name");
    }

    @Override // es.c0
    public final c k() {
        return new a(this.f8304n, k.f8311x);
    }

    @Override // es.c0
    public final void m(LinkedHashSet linkedHashSet, qs.g gVar) {
        br.l.e(gVar, "name");
        j jVar = this.f8305o;
        g0 g0VarV = vc.e.v(jVar);
        Collection collectionU0 = g0VarV == null ? mq.y.f16947a : mq.o.U0(g0VarV.f(gVar, zr.d.WHEN_GET_SUPER_MEMBERS));
        ds.a aVar = (ds.a) this.f8271b.f3974d;
        linkedHashSet.addAll(kc.f.R(gVar, collectionU0, linkedHashSet, this.f8305o, aVar.f7451f, ((jt.l) aVar.f7464u).f13859d));
        if (this.f8304n.f25509a.isEnum()) {
            if (gVar.equals(or.o.f19715c)) {
                linkedHashSet.add(ts.o.i(jVar));
            } else if (gVar.equals(or.o.f19713a)) {
                linkedHashSet.add(ts.o.j(jVar));
            }
        }
    }

    @Override // es.h0, es.c0
    public final void n(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e0 e0Var = new e0(gVar, 0);
        j jVar = this.f8305o;
        rt.k.e(e5.H(jVar), d0.f8285a, new f0(jVar, linkedHashSet, e0Var));
        boolean zIsEmpty = arrayList.isEmpty();
        cj.a aVar = this.f8271b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                m0 m0VarV = v((m0) obj);
                Object arrayList2 = linkedHashMap.get(m0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(m0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                ds.a aVar2 = (ds.a) aVar.f3974d;
                mq.t.d0(arrayList3, kc.f.R(gVar, collection, arrayList, this.f8305o, aVar2.f7451f, ((jt.l) aVar2.f7464u).f13859d));
            }
            arrayList.addAll(arrayList3);
        } else {
            ds.a aVar3 = (ds.a) aVar.f3974d;
            arrayList.addAll(kc.f.R(gVar, linkedHashSet, arrayList, this.f8305o, aVar3.f7451f, ((jt.l) aVar3.f7464u).f13859d));
        }
        if (this.f8304n.f25509a.isEnum() && gVar.equals(or.o.f19714b)) {
            rt.k.a(arrayList, ts.o.h(jVar));
        }
    }

    @Override // es.c0
    public final Set o(at.f fVar) {
        br.l.e(fVar, "kindFilter");
        Set setT0 = mq.o.T0(((c) this.f8274e.c()).e());
        k kVar = k.f8312y;
        j jVar = this.f8305o;
        rt.k.e(e5.H(jVar), d0.f8285a, new f0(jVar, setT0, kVar));
        if (this.f8304n.f25509a.isEnum()) {
            setT0.add(or.o.f19714b);
        }
        return setT0;
    }

    @Override // es.c0
    public final rr.l q() {
        return this.f8305o;
    }
}
