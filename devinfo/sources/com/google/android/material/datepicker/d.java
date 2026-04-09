package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new i0(10);

    /* renamed from: a, reason: collision with root package name */
    public final long f20447a;

    public d(long j) {
        this.f20447a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f20447a == ((d) obj).f20447a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20447a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f20447a);
    }
}
