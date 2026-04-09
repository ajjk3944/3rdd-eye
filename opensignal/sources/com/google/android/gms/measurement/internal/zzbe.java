package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Iterator;
import oe.o0;
import wc.h;

/* loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new h(21);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f5404a;

    public zzbe(Bundle bundle) {
        this.f5404a = bundle;
    }

    public final Object d(String str) {
        return this.f5404a.get(str);
    }

    public final Double e() {
        return Double.valueOf(this.f5404a.getDouble("value"));
    }

    public final String g() {
        return this.f5404a.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new o0(this);
    }

    public final Bundle j() {
        return new Bundle(this.f5404a);
    }

    public final String toString() {
        return this.f5404a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.L(parcel, 2, j());
        i4.W(parcel, iU);
    }
}
