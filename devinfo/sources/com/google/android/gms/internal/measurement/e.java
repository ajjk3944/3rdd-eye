package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19666a;

    public e(Boolean bool) {
        this.f19666a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        return new e(Boolean.valueOf(this.f19666a));
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.valueOf(this.f19666a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f19666a == ((e) obj).f19666a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        return Double.valueOf(true != this.f19666a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f19666a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i(String str, a0.x0 x0Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z3 = this.f19666a;
        if (zEquals) {
            return new q(Boolean.toString(z3));
        }
        throw new IllegalArgumentException(Boolean.toString(z3) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.f19666a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        return Boolean.toString(this.f19666a);
    }
}
