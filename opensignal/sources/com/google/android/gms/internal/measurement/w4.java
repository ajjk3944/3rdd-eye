package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w4 extends k {

    /* renamed from: d, reason: collision with root package name */
    public final bm.d f5245d;

    public w4(bm.d dVar) {
        this.f5245d = dVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        bm.d dVar = this.f5245d;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    a.a.I("getEventName", 0, arrayList);
                    return new q(((b) dVar.f2827g).f4912a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    a.a.I("getTimestamp", 0, arrayList);
                    return new g(Double.valueOf(((b) dVar.f2827g).f4913b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    a.a.I("getParamValue", 1, arrayList);
                    String strL = ((t) rVar.f14396d).c(rVar, (n) arrayList.get(0)).l();
                    HashMap map = ((b) dVar.f2827g).f4914c;
                    return ba.m.V(map.containsKey(strL) ? map.get(strL) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    a.a.I("getParams", 0, arrayList);
                    HashMap map2 = ((b) dVar.f2827g).f4914c;
                    k kVar = new k();
                    for (String str2 : map2.keySet()) {
                        kVar.e(str2, ba.m.V(map2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    a.a.I("setParamValue", 2, arrayList);
                    String strL2 = ((t) rVar.f14396d).c(rVar, (n) arrayList.get(0)).l();
                    n nVarC = ((t) rVar.f14396d).c(rVar, (n) arrayList.get(1));
                    b bVar = (b) dVar.f2827g;
                    Object objQ = a.a.Q(nVarC);
                    HashMap map3 = bVar.f4914c;
                    if (objQ == null) {
                        map3.remove(strL2);
                        return nVarC;
                    }
                    map3.put(strL2, b.b(map3.get(strL2), objQ, strL2));
                    return nVarC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    a.a.I("setEventName", 1, arrayList);
                    n nVarC2 = ((t) rVar.f14396d).c(rVar, (n) arrayList.get(0));
                    if (n.f5129f.equals(nVarC2) || n.f5130h.equals(nVarC2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) dVar.f2827g).f4912a = nVarC2.l();
                    return new q(nVarC2.l());
                }
                break;
        }
        return super.g(str, rVar, arrayList);
    }
}
