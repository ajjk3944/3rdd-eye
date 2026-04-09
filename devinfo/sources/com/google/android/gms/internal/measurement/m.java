package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends h {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19820c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19821d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.x0 f19822e;

    public m(m mVar) {
        super(mVar.f19762a);
        ArrayList arrayList = new ArrayList(mVar.f19820c.size());
        this.f19820c = arrayList;
        arrayList.addAll(mVar.f19820c);
        ArrayList arrayList2 = new ArrayList(mVar.f19821d.size());
        this.f19821d = arrayList2;
        arrayList2.addAll(mVar.f19821d);
        this.f19822e = mVar.f19822e;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n N1() {
        return new m(this);
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(a0.x0 x0Var, List list) {
        r rVar;
        a0.x0 x0VarT = this.f19822e.T();
        t tVar = (t) x0VarT.f145b;
        int i4 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19820c;
            int size = arrayList.size();
            rVar = n.J8;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                x0VarT.W((String) arrayList.get(i10), ((t) x0Var.f145b).c(x0Var, (n) list.get(i10)));
            } else {
                x0VarT.W((String) arrayList.get(i10), rVar);
            }
            i10++;
        }
        ArrayList arrayList2 = this.f19821d;
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj = arrayList2.get(i4);
            i4++;
            n nVar = (n) obj;
            n nVarC = tVar.c(x0VarT, nVar);
            if (nVarC instanceof o) {
                nVarC = tVar.c(x0VarT, nVar);
            }
            if (nVarC instanceof f) {
                return ((f) nVarC).f19726a;
            }
        }
        return rVar;
    }

    public m(String str, ArrayList arrayList, List list, a0.x0 x0Var) {
        super(str);
        this.f19820c = new ArrayList();
        this.f19822e = x0Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.f19820c.add(((n) obj).zzc());
            }
        }
        this.f19821d = new ArrayList(list);
    }
}
