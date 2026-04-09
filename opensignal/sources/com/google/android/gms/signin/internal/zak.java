package com.google.android.gms.signin.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new l(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f5440a;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectionResult f5441d;

    /* renamed from: g, reason: collision with root package name */
    public final zay f5442g;

    public zak(int i10, ConnectionResult connectionResult, zay zayVar) {
        this.f5440a = i10;
        this.f5441d = connectionResult;
        this.f5442g = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5440a);
        i4.O(parcel, 2, this.f5441d, i10);
        i4.O(parcel, 3, this.f5442g, i10);
        i4.W(parcel, iU);
    }
}
