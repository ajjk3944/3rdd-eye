package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v9 extends h {

    /* renamed from: g, reason: collision with root package name */
    public final w5 f5240g;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f5241r;

    public v9(w5 w5Var) {
        super("require");
        this.f5241r = new HashMap();
        this.f5240g = w5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n f(kg.r rVar, List list) {
        n nVar;
        a.a.I("require", 1, list);
        String strL = ((t) rVar.f14396d).c(rVar, (n) list.get(0)).l();
        HashMap map = this.f5241r;
        if (map.containsKey(strL)) {
            return (n) map.get(strL);
        }
        HashMap map2 = (HashMap) this.f5240g.f5247a;
        if (map2.containsKey(strL)) {
            try {
                nVar = (n) ((Callable) map2.get(strL)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strL)));
            }
        } else {
            nVar = n.f5129f;
        }
        if (nVar instanceof h) {
            map.put(strL, (h) nVar);
        }
        return nVar;
    }
}
