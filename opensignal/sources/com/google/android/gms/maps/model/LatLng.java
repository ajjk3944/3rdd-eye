package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new h(4);

    /* renamed from: a, reason: collision with root package name */
    public final double f5347a;

    /* renamed from: d, reason: collision with root package name */
    public final double f5348d;

    public LatLng(double d6, double d10) {
        if (d10 < -180.0d || d10 >= 180.0d) {
            this.f5348d = ((((d10 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f5348d = d10;
        }
        this.f5347a = Math.max(-90.0d, Math.min(90.0d, d6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f5347a) == Double.doubleToLongBits(latLng.f5347a) && Double.doubleToLongBits(this.f5348d) == Double.doubleToLongBits(latLng.f5348d);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5347a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f5348d);
        return ((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f5347a + "," + this.f5348d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 2, 8);
        parcel.writeDouble(this.f5347a);
        i4.S(parcel, 3, 8);
        parcel.writeDouble(this.f5348d);
        i4.W(parcel, iU);
    }
}
