package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.e5;
import io.sentry.g4;
import io.sentry.g6;
import io.sentry.j6;
import io.sentry.k6;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a0 extends g4 implements c2 {
    public String L;
    public Double M;
    public Double N;
    public final ArrayList O;
    public final HashMap P;
    public e5 Q;
    public ConcurrentHashMap R;

    public a0(ArrayList arrayList, HashMap map, e5 e5Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.O = arrayList2;
        HashMap map2 = new HashMap();
        this.P = map2;
        this.L = "";
        this.M = dValueOf;
        this.N = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.P.putAll(((w) it.next()).H);
        }
        this.Q = e5Var;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.L != null) {
            bVar.I("transaction");
            bVar.V(this.L);
        }
        bVar.I("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.M.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        bVar.S(u0Var, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.N != null) {
            bVar.I("timestamp");
            bVar.S(u0Var, BigDecimal.valueOf(this.N.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.O;
        if (!arrayList.isEmpty()) {
            bVar.I("spans");
            bVar.S(u0Var, arrayList);
        }
        bVar.I("type");
        bVar.V("transaction");
        HashMap map = this.P;
        if (!map.isEmpty()) {
            bVar.I("measurements");
            bVar.S(u0Var, map);
        }
        bVar.I("transaction_info");
        bVar.S(u0Var, this.Q);
        ic.a.J(this, bVar, u0Var);
        ConcurrentHashMap concurrentHashMap = this.R;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.R, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }

    public a0(g6 g6Var) {
        super(g6Var.f12275a);
        this.O = new ArrayList();
        this.P = new HashMap();
        j6 j6Var = g6Var.f12276b;
        this.M = Double.valueOf(j6Var.f12386a.d() / 1.0E9d);
        this.N = Double.valueOf(j6Var.f12386a.c(j6Var.f12387b) / 1.0E9d);
        this.L = g6Var.f12279e;
        Iterator it = g6Var.f12277c.iterator();
        while (it.hasNext()) {
            j6 j6Var2 = (j6) it.next();
            Boolean bool = Boolean.TRUE;
            cj.a aVar = j6Var2.f12388c.f12415r;
            if (bool.equals(aVar == null ? null : (Boolean) aVar.f3974d)) {
                this.O.add(new w(j6Var2));
            }
        }
        c cVar = this.f12269d;
        cVar.k(g6Var.f12288p);
        k6 k6Var = j6Var.f12388c;
        ConcurrentHashMap concurrentHashMap = j6Var.k;
        k6 k6Var2 = new k6(k6Var.f12412a, k6Var.f12413d, k6Var.f12414g, k6Var.f12416x, k6Var.f12417y, k6Var.f12415r, k6Var.B, k6Var.E);
        for (Map.Entry entry : k6Var.D.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        k6Var2.F.remove(str);
                    } else {
                        k6Var2.F.put(str, value);
                    }
                }
            }
        }
        cVar.t(k6Var2);
        this.Q = new e5(1, g6Var.f12286n.apiName());
    }
}
