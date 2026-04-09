package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class k implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5091a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.f5091a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n d(String str) {
        HashMap map = this.f5091a;
        return map.containsKey(str) ? (n) map.get(str) : n.f5129f;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void e(String str, n nVar) {
        HashMap map = this.f5091a;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f5091a.equals(((k) obj).f5091a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n g(String str, kg.r rVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : j.k(this, new q(str), rVar, arrayList);
    }

    public final int hashCode() {
        return this.f5091a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return this.f5091a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        k kVar = new k();
        for (Map.Entry entry : this.f5091a.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            HashMap map = kVar.f5091a;
            if (z10) {
                map.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((n) entry.getValue()).m());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f5091a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
