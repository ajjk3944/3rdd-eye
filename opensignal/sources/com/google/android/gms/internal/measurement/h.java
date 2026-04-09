package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5049a;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5050d = new HashMap();

    public h(String str) {
        this.f5049a = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.f5050d.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n d(String str) {
        HashMap map = this.f5050d;
        return map.containsKey(str) ? (n) map.get(str) : n.f5129f;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void e(String str, n nVar) {
        HashMap map = this.f5050d;
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f5049a;
        if (str != null) {
            return str.equals(hVar.f5049a);
        }
        return false;
    }

    public abstract n f(kg.r rVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.f5049a) : j.k(this, new q(str), rVar, arrayList);
    }

    public final int hashCode() {
        String str = this.f5049a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return this.f5050d.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return this.f5049a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n m() {
        return this;
    }
}
