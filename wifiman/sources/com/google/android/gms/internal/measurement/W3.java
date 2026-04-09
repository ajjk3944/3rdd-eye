package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class W3 {
    public static InterfaceC4449s a(N2 n22) {
        if (n22 == null) {
            return InterfaceC4449s.f35450e0;
        }
        int i10 = AbstractC4501y3.f35534a[n22.G().ordinal()];
        if (i10 == 1) {
            return n22.O() ? new C4465u(n22.J()) : InterfaceC4449s.f35457l0;
        }
        if (i10 == 2) {
            return n22.N() ? new C4386k(Double.valueOf(n22.F())) : new C4386k(null);
        }
        if (i10 == 3) {
            return n22.M() ? new C4360h(Boolean.valueOf(n22.L())) : new C4360h(null);
        }
        if (i10 != 4) {
            if (i10 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(n22));
        }
        List listK = n22.K();
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(a((N2) it.next()));
        }
        return new C4473v(n22.I(), arrayList);
    }

    public static InterfaceC4449s b(Object obj) {
        if (obj == null) {
            return InterfaceC4449s.f35451f0;
        }
        if (obj instanceof String) {
            return new C4465u((String) obj);
        }
        if (obj instanceof Double) {
            return new C4386k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C4386k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C4386k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C4360h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C4351g c4351g = new C4351g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c4351g.k(b(it.next()));
            }
            return c4351g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC4449s interfaceC4449sB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                rVar.f((String) string, interfaceC4449sB);
            }
        }
        return rVar;
    }
}
