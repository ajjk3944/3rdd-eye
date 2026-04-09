package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* loaded from: classes.dex */
public interface j {
    static n k(j jVar, q qVar, kg.r rVar, ArrayList arrayList) {
        String str = qVar.f5166a;
        if (jVar.j(str)) {
            n nVarD = jVar.d(str);
            if (nVarD instanceof h) {
                return ((h) nVarD).f(rVar, arrayList);
            }
            throw new IllegalArgumentException(w.g.f(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(c7.a.p("Object has no function ", str));
        }
        a.a.I("hasOwnProperty", 1, arrayList);
        return jVar.j(((t) rVar.f14396d).c(rVar, (n) arrayList.get(0)).l()) ? n.f5132l : n.f5133m;
    }

    n d(String str);

    void e(String str, n nVar);

    boolean j(String str);
}
