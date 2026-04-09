package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5111g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f5112r;

    /* renamed from: x, reason: collision with root package name */
    public final kg.r f5113x;

    public m(m mVar) {
        super(mVar.f5049a);
        ArrayList arrayList = new ArrayList(mVar.f5111g.size());
        this.f5111g = arrayList;
        arrayList.addAll(mVar.f5111g);
        ArrayList arrayList2 = new ArrayList(mVar.f5112r.size());
        this.f5112r = arrayList2;
        arrayList2.addAll(mVar.f5112r);
        this.f5113x = mVar.f5113x;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n f(kg.r rVar, List list) {
        r rVar2;
        kg.r rVarE = this.f5113x.E();
        t tVar = (t) rVarE.f14396d;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5111g;
            int size = arrayList.size();
            rVar2 = n.f5129f;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                rVarE.H((String) arrayList.get(i10), ((t) rVar.f14396d).c(rVar, (n) list.get(i10)));
            } else {
                rVarE.H((String) arrayList.get(i10), rVar2);
            }
            i10++;
        }
        Iterator it = this.f5112r.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            n nVarC = tVar.c(rVarE, nVar);
            if (nVarC instanceof o) {
                nVarC = tVar.c(rVarE, nVar);
            }
            if (nVarC instanceof f) {
                return ((f) nVarC).f4980a;
            }
        }
        return rVar2;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n m() {
        return new m(this);
    }

    public m(String str, ArrayList arrayList, List list, kg.r rVar) {
        super(str);
        this.f5111g = new ArrayList();
        this.f5113x = rVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f5111g.add(((n) it.next()).l());
            }
        }
        this.f5112r = new ArrayList(list);
    }
}
