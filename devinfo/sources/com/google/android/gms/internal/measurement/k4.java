package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k4 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19800c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19801d;

    public k4(t tVar) {
        super("internal.registerCallback");
        this.f19801d = tVar;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(a0.x0 x0Var, List list) {
        TreeMap treeMap;
        switch (this.f19800c) {
            case 0:
                com.bumptech.glide.c.v(3, list, this.f19762a);
                String strZzc = ((t) x0Var.f145b).c(x0Var, (n) list.get(0)).zzc();
                n nVar = (n) list.get(1);
                t tVar = (t) x0Var.f145b;
                long jC = (long) com.bumptech.glide.c.C(tVar.c(x0Var, nVar).f().doubleValue());
                n nVarC = tVar.c(x0Var, (n) list.get(2));
                HashMap mapE = nVarC instanceof k ? com.bumptech.glide.c.E((k) nVarC) : new HashMap();
                yb.e eVar = (yb.e) this.f19801d;
                eVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapE.keySet()) {
                    HashMap map2 = ((b) eVar.f37509b).f19617c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, mapE.get(str), str));
                }
                ((ArrayList) eVar.f37511d).add(new b(strZzc, jC, map));
                return n.J8;
            case 1:
                com.bumptech.glide.c.v(2, list, "getValue");
                n nVarC2 = ((t) x0Var.f145b).c(x0Var, (n) list.get(0));
                n nVarC3 = ((t) x0Var.f145b).c(x0Var, (n) list.get(1));
                String strZzc2 = nVarC2.zzc();
                y4.a aVar = (y4.a) this.f19801d;
                Map map3 = (Map) ((ec.h1) aVar.f37324b).f22764e.get((String) aVar.f37323a);
                String str2 = (map3 == null || !map3.containsKey(strZzc2)) ? null : (String) map3.get(strZzc2);
                return str2 != null ? new q(str2) : nVarC3;
            case 2:
                return n.J8;
            case 3:
                try {
                    return com.bumptech.glide.d.F(((ec.f1) this.f19801d).call());
                } catch (Exception unused) {
                    return n.J8;
                }
            default:
                com.bumptech.glide.c.v(3, list, this.f19762a);
                ((t) x0Var.f145b).c(x0Var, (n) list.get(0)).zzc();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) x0Var.f145b;
                n nVarC4 = tVar2.c(x0Var, nVar2);
                if (!(nVarC4 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n nVarC5 = tVar2.c(x0Var, (n) list.get(2));
                if (!(nVarC5 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) nVarC5;
                HashMap map4 = kVar.f19793a;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzc3 = kVar.g("type").zzc();
                int iB = map4.containsKey("priority") ? com.bumptech.glide.c.B(kVar.g("priority").f().doubleValue()) : 1000;
                t tVar3 = (t) this.f19801d;
                m mVar = (m) nVarC4;
                tVar3.getClass();
                if ("create".equals(strZzc3)) {
                    treeMap = (TreeMap) tVar3.f19930b;
                } else {
                    if (!"edit".equals(strZzc3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                    }
                    treeMap = (TreeMap) tVar3.f19929a;
                }
                if (treeMap.containsKey(Integer.valueOf(iB))) {
                    iB = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iB), mVar);
                return n.J8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(t5 t5Var, y4.a aVar) {
        super("getValue");
        this.f19801d = aVar;
    }

    public k4(ec.f1 f1Var) {
        super("internal.appMetadata");
        this.f19801d = f1Var;
    }

    public k4(jf.c cVar) {
        super("internal.logger");
        this.f19801d = cVar;
        this.f19763b.put("log", new t9(this, false, true));
        this.f19763b.put("silent", new t5("silent", 1));
        ((h) this.f19763b.get("silent")).a("log", new t9(this, true, true));
        this.f19763b.put("unmonitored", new t5("unmonitored", 2));
        ((h) this.f19763b.get("unmonitored")).a("log", new t9(this, false, false));
    }

    public k4(yb.e eVar) {
        super("internal.eventLogger");
        this.f19801d = eVar;
    }
}
