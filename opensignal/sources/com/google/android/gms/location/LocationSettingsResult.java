package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import tc.c;

/* loaded from: classes.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Status f5318a;

    /* renamed from: d, reason: collision with root package name */
    public final LocationSettingsStates f5319d;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f5318a = status;
        this.f5319d = locationSettingsStates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 1, this.f5318a, i10);
        i4.O(parcel, 2, this.f5319d, i10);
        i4.W(parcel, iU);
    }
}
