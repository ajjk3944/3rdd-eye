package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import i6.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f5302a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5303d;

    /* renamed from: g, reason: collision with root package name */
    public final long f5304g;

    /* renamed from: r, reason: collision with root package name */
    public final int f5305r;

    /* renamed from: x, reason: collision with root package name */
    public final zzal[] f5306x;

    public LocationAvailability(int i10, int i11, int i12, long j, zzal[] zzalVarArr) {
        this.f5305r = i10 < 1000 ? 0 : 1000;
        this.f5302a = i11;
        this.f5303d = i12;
        this.f5304g = j;
        this.f5306x = zzalVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f5302a == locationAvailability.f5302a && this.f5303d == locationAvailability.f5303d && this.f5304g == locationAvailability.f5304g && this.f5305r == locationAvailability.f5305r && Arrays.equals(this.f5306x, locationAvailability.f5306x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5305r)});
    }

    public final String toString() {
        boolean z10 = this.f5305r < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(z10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5302a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5303d);
        i4.S(parcel, 3, 8);
        parcel.writeLong(this.f5304g);
        i4.S(parcel, 4, 4);
        int i11 = this.f5305r;
        parcel.writeInt(i11);
        i4.Q(parcel, 5, this.f5306x, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        i4.S(parcel, 6, 4);
        parcel.writeInt(i12);
        i4.W(parcel, iU);
    }
}
