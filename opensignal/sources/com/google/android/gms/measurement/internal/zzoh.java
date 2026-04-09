package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new h(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f5409a;

    /* renamed from: d, reason: collision with root package name */
    public final long f5410d;

    /* renamed from: g, reason: collision with root package name */
    public final int f5411g;

    public zzoh(String str, int i10, long j) {
        this.f5409a = str;
        this.f5410d = j;
        this.f5411g = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 1, this.f5409a);
        i4.S(parcel, 2, 8);
        parcel.writeLong(this.f5410d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5411g);
        i4.W(parcel, iU);
    }
}
