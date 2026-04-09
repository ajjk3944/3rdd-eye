package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j4 extends h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5086g = 0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5087r;

    public j4(bm.d dVar) {
        super("internal.eventLogger");
        this.f5087r = dVar;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n f(kg.r rVar, List list) {
        TreeMap treeMap;
        switch (this.f5086g) {
            case 0:
                a.a.I(this.f5049a, 3, list);
                String strL = ((t) rVar.f14396d).c(rVar, (n) list.get(0)).l();
                n nVar = (n) list.get(1);
                t tVar = (t) rVar.f14396d;
                long jP = (long) a.a.P(tVar.c(rVar, nVar).c().doubleValue());
                n nVarC = tVar.c(rVar, (n) list.get(2));
                HashMap mapR = nVarC instanceof k ? a.a.R((k) nVarC) : new HashMap();
                bm.d dVar = (bm.d) this.f5087r;
                dVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapR.keySet()) {
                    HashMap map2 = ((b) dVar.f2826d).f4914c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, mapR.get(str), str));
                }
                ((ArrayList) dVar.f2828r).add(new b(strL, jP, map));
                return n.f5129f;
            case 1:
                a.a.I("getValue", 2, list);
                n nVarC2 = ((t) rVar.f14396d).c(rVar, (n) list.get(0));
                n nVarC3 = ((t) rVar.f14396d).c(rVar, (n) list.get(1));
                String strL2 = nVarC2.l();
                xr.a aVar = (xr.a) this.f5087r;
                Map map3 = (Map) ((zc.w0) aVar.f25483g).f27250x.get((String) aVar.f25482d);
                String str2 = (map3 == null || !map3.containsKey(strL2)) ? null : (String) map3.get(strL2);
                return str2 != null ? new q(str2) : nVarC3;
            case 2:
                return n.f5129f;
            case 3:
                try {
                    return ba.m.V(((zc.u0) this.f5087r).call());
                } catch (Exception unused) {
                    return n.f5129f;
                }
            default:
                a.a.I(this.f5049a, 3, list);
                ((t) rVar.f14396d).c(rVar, (n) list.get(0)).l();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) rVar.f14396d;
                n nVarC4 = tVar2.c(rVar, nVar2);
                if (!(nVarC4 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n nVarC5 = tVar2.c(rVar, (n) list.get(2));
                if (!(nVarC5 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) nVarC5;
                HashMap map4 = kVar.f5091a;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strL3 = kVar.d("type").l();
                int iO = map4.containsKey("priority") ? a.a.O(kVar.d("priority").c().doubleValue()) : 1000;
                t tVar3 = (t) this.f5087r;
                m mVar = (m) nVarC4;
                tVar3.getClass();
                if ("create".equals(strL3)) {
                    treeMap = (TreeMap) tVar3.f5207b;
                } else {
                    if (!"edit".equals(strL3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strL3)));
                    }
                    treeMap = (TreeMap) tVar3.f5206a;
                }
                if (treeMap.containsKey(Integer.valueOf(iO))) {
                    iO = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iO), mVar);
                return n.f5129f;
        }
    }

    public j4(t tVar) {
        super("internal.registerCallback");
        this.f5087r = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(u5 u5Var, xr.a aVar) {
        super("getValue");
        this.f5087r = aVar;
    }

    public j4(y9.u uVar) {
        super("internal.logger");
        this.f5087r = uVar;
        this.f5050d.put("log", new u9(this, false, true));
        this.f5050d.put("silent", new u5("silent", 1));
        ((h) this.f5050d.get("silent")).e("log", new u9(this, true, true));
        this.f5050d.put("unmonitored", new u5("unmonitored", 2));
        ((h) this.f5050d.get("unmonitored")).e("log", new u9(this, false, false));
    }

    public j4(zc.u0 u0Var) {
        super("internal.appMetadata");
        this.f5087r = u0Var;
    }
}
