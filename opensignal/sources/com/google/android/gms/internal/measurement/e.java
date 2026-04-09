package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4958a;

    public e(Boolean bool) {
        this.f4958a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.valueOf(this.f4958a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        return Double.valueOf(true != this.f4958a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f4958a == ((e) obj).f4958a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z10 = this.f4958a;
        if (zEquals) {
            return new q(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(Boolean.toString(z10) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f4958a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return Boolean.toString(this.f4958a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        return new e(Boolean.valueOf(this.f4958a));
    }

    public final String toString() {
        return String.valueOf(this.f4958a);
    }
}
