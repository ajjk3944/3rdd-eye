package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u9 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final v5 f19960c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19961d;

    public u9(v5 v5Var) {
        super("require");
        this.f19961d = new HashMap();
        this.f19960c = v5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(a0.x0 x0Var, List list) {
        n nVar;
        com.bumptech.glide.c.v(1, list, "require");
        String strZzc = ((t) x0Var.f145b).c(x0Var, (n) list.get(0)).zzc();
        HashMap map = this.f19961d;
        if (map.containsKey(strZzc)) {
            return (n) map.get(strZzc);
        }
        HashMap map2 = (HashMap) this.f19960c.f19970a;
        if (map2.containsKey(strZzc)) {
            try {
                nVar = (n) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            nVar = n.J8;
        }
        if (nVar instanceof h) {
            map.put(strZzc, (h) nVar);
        }
        return nVar;
    }
}
