package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new h(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f5394a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5395d;

    /* renamed from: g, reason: collision with root package name */
    public final long f5396g;

    public zzaf(int i10, long j, long j7) {
        this.f5394a = j;
        this.f5395d = i10;
        this.f5396g = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 8);
        parcel.writeLong(this.f5394a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5395d);
        i4.S(parcel, 3, 8);
        parcel.writeLong(this.f5396g);
        i4.W(parcel, iU);
    }
}
