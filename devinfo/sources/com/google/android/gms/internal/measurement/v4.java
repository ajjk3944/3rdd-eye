package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v4 extends k {

    /* renamed from: b, reason: collision with root package name */
    public final yb.e f19968b;

    public v4(yb.e eVar) {
        this.f19968b = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n i(String str, a0.x0 x0Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        yb.e eVar = this.f19968b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    com.bumptech.glide.c.v(0, arrayList, "getEventName");
                    return new q(((b) eVar.f37510c).f19615a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    com.bumptech.glide.c.v(0, arrayList, "getTimestamp");
                    return new g(Double.valueOf(((b) eVar.f37510c).f19616b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    com.bumptech.glide.c.v(1, arrayList, "getParamValue");
                    String strZzc = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(0)).zzc();
                    HashMap map = ((b) eVar.f37510c).f19617c;
                    return com.bumptech.glide.d.F(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    com.bumptech.glide.c.v(0, arrayList, "getParams");
                    HashMap map2 = ((b) eVar.f37510c).f19617c;
                    k kVar = new k();
                    for (String str2 : map2.keySet()) {
                        kVar.a(str2, com.bumptech.glide.d.F(map2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    com.bumptech.glide.c.v(2, arrayList, "setParamValue");
                    String strZzc2 = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(0)).zzc();
                    n nVarC = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(1));
                    b bVar = (b) eVar.f37510c;
                    Object objD = com.bumptech.glide.c.D(nVarC);
                    HashMap map3 = bVar.f19617c;
                    if (objD == null) {
                        map3.remove(strZzc2);
                        return nVarC;
                    }
                    map3.put(strZzc2, b.b(map3.get(strZzc2), objD, strZzc2));
                    return nVarC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    com.bumptech.glide.c.v(1, arrayList, "setEventName");
                    n nVarC2 = ((t) x0Var.f145b).c(x0Var, (n) arrayList.get(0));
                    if (n.J8.equals(nVarC2) || n.K8.equals(nVarC2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) eVar.f37510c).f19615a = nVarC2.zzc();
                    return new q(nVarC2.zzc());
                }
                break;
        }
        return super.i(str, x0Var, arrayList);
    }
}
