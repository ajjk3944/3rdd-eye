package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19793a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        k kVar = new k();
        for (Map.Entry entry : this.f19793a.entrySet()) {
            boolean z3 = entry.getValue() instanceof j;
            HashMap map = kVar.f19793a;
            if (z3) {
                map.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((n) entry.getValue()).N1());
            }
        }
        return kVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        HashMap map = this.f19793a;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new i(this.f19793a.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f19793a.equals(((k) obj).f19793a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n g(String str) {
        HashMap map = this.f19793a;
        return map.containsKey(str) ? (n) map.get(str) : n.J8;
    }

    public final int hashCode() {
        return this.f19793a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n i(String str, a0.x0 x0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : com.google.android.gms.internal.ads.d7.E(this, new q(str), x0Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return this.f19793a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f19793a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        return "[object Object]";
    }
}
