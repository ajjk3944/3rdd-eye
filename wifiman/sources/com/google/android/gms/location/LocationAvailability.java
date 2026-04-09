package com.google.android.gms.location;

import I3.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractC8026a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f35741a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35742b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35743c;

    /* renamed from: d, reason: collision with root package name */
    final int f35744d;

    /* renamed from: e, reason: collision with root package name */
    private final s[] f35745e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f35739f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f35740g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    LocationAvailability(int i10, int i11, int i12, long j10, s[] sVarArr, boolean z10) {
        this.f35744d = i10 < 1000 ? 0 : 1000;
        this.f35741a = i11;
        this.f35742b = i12;
        this.f35743c = j10;
        this.f35745e = sVarArr;
    }

    public boolean b() {
        return this.f35744d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f35741a == locationAvailability.f35741a && this.f35742b == locationAvailability.f35742b && this.f35743c == locationAvailability.f35743c && this.f35744d == locationAvailability.f35744d && Arrays.equals(this.f35745e, locationAvailability.f35745e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC7900o.b(Integer.valueOf(this.f35744d));
    }

    public String toString() {
        boolean zB = b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zB).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(zB);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f35741a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.k(parcel, 2, this.f35742b);
        t3.b.n(parcel, 3, this.f35743c);
        t3.b.k(parcel, 4, this.f35744d);
        t3.b.s(parcel, 5, this.f35745e, i10, false);
        t3.b.c(parcel, 6, b());
        t3.b.b(parcel, iA);
    }
}
