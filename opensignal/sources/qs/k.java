package qs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import mq.b0;
import mq.p;

/* loaded from: classes.dex */
public abstract class k {
    static {
        new c("java.lang").c(g.e("annotation"));
    }

    public static final b a(String str) {
        c cVar = j.f21045a;
        return new b(j.f21045a, g.e(str));
    }

    public static final b b(String str) {
        c cVar = j.f21045a;
        return new b(j.f21047c, g.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iP = b0.P(p.a0(setEntrySet, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final b d(g gVar) {
        c cVar = j.f21045a;
        b bVar = j.f21052h;
        return new b(bVar.g(), g.e(gVar.c().concat(bVar.i().c())));
    }

    public static final b e(String str) {
        c cVar = j.f21045a;
        return new b(j.f21046b, g.e(str));
    }

    public static final b f(b bVar) {
        c cVar = j.f21045a;
        return new b(j.f21045a, g.e("U".concat(bVar.i().c())));
    }
}
