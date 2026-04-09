package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import tc.c;

/* loaded from: classes.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5320a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5321d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5322g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5323r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5324x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5325y;

    public LocationSettingsStates(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f5320a = z10;
        this.f5321d = z11;
        this.f5322g = z12;
        this.f5323r = z13;
        this.f5324x = z14;
        this.f5325y = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5320a ? 1 : 0);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5321d ? 1 : 0);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5322g ? 1 : 0);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f5323r ? 1 : 0);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f5324x ? 1 : 0);
        i4.S(parcel, 6, 4);
        parcel.writeInt(this.f5325y ? 1 : 0);
        i4.W(parcel, iU);
    }
}
