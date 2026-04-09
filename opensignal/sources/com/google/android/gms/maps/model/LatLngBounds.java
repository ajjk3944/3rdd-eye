package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import cc.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new h(3);

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f5349a;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f5350d;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        s.i(latLng, "southwest must not be null.");
        s.i(latLng2, "northeast must not be null.");
        double d6 = latLng2.f5347a;
        double d10 = latLng.f5347a;
        s.c(d6 >= d10, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d10), Double.valueOf(d6));
        this.f5349a = latLng;
        this.f5350d = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f5349a.equals(latLngBounds.f5349a) && this.f5350d.equals(latLngBounds.f5350d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5349a, this.f5350d});
    }

    public final String toString() {
        e eVar = new e(9, this);
        eVar.d(this.f5349a, "southwest");
        eVar.d(this.f5350d, "northeast");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 2, this.f5349a, i10);
        i4.O(parcel, 3, this.f5350d, i10);
        i4.W(parcel, iU);
    }
}
