package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f19762a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19763b = new HashMap();

    public h(String str) {
        this.f19762a = str;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        HashMap map = this.f19763b;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public abstract n b(a0.x0 x0Var, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new i(this.f19763b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f19762a;
        if (str != null) {
            return str.equals(hVar.f19762a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n g(String str) {
        HashMap map = this.f19763b;
        return map.containsKey(str) ? (n) map.get(str) : n.J8;
    }

    public final int hashCode() {
        String str = this.f19762a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i(String str, a0.x0 x0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.f19762a) : com.google.android.gms.internal.ads.d7.E(this, new q(str), x0Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return this.f19763b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        return this.f19762a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n N1() {
        return this;
    }
}
