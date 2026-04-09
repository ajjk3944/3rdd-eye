package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f19726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19727b;

    public f(String str) {
        this.f19726a = n.J8;
        this.f19727b = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        return new f(this.f19727b, this.f19726a.N1());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19727b.equals(fVar.f19727b) && this.f19726a.equals(fVar.f19726a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f19726a.hashCode() + (this.f19727b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i(String str, a0.x0 x0Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    public f(String str, n nVar) {
        this.f19726a = nVar;
        this.f19727b = str;
    }
}
