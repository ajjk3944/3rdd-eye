package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f4980a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4981d;

    public f(String str) {
        this.f4980a = n.f5129f;
        this.f4981d = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4981d.equals(fVar.f4981d) && this.f4980a.equals(fVar.f4980a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f4980a.hashCode() + (this.f4981d.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        return new f(this.f4981d, this.f4980a.m());
    }

    public f(String str, n nVar) {
        this.f4980a = nVar;
        this.f4981d = str;
    }
}
