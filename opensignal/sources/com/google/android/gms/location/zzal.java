package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import tc.c;

@Deprecated
/* loaded from: classes.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f5326a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5327d;

    /* renamed from: g, reason: collision with root package name */
    public final long f5328g;

    /* renamed from: r, reason: collision with root package name */
    public final long f5329r;

    public zzal(int i10, int i11, long j, long j7) {
        this.f5326a = i10;
        this.f5327d = i11;
        this.f5328g = j;
        this.f5329r = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.f5326a == zzalVar.f5326a && this.f5327d == zzalVar.f5327d && this.f5328g == zzalVar.f5328g && this.f5329r == zzalVar.f5329r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5327d), Integer.valueOf(this.f5326a), Long.valueOf(this.f5329r), Long.valueOf(this.f5328g)});
    }

    public final String toString() {
        int i10 = this.f5326a;
        int length = String.valueOf(i10).length();
        int i11 = this.f5327d;
        int length2 = String.valueOf(i11).length();
        long j = this.f5329r;
        int length3 = String.valueOf(j).length();
        long j7 = this.f5328g;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j7).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j);
        sb2.append(" system time ms: ");
        sb2.append(j7);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5326a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5327d);
        i4.S(parcel, 3, 8);
        parcel.writeLong(this.f5328g);
        i4.S(parcel, 4, 8);
        parcel.writeLong(this.f5329r);
        i4.W(parcel, iU);
    }
}
