package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import i6.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new a(29);

    /* renamed from: a, reason: collision with root package name */
    public final List f5315a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5316d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5317g;

    public LocationSettingsRequest(ArrayList arrayList, boolean z10, boolean z11) {
        this.f5315a = arrayList;
        this.f5316d = z10;
        this.f5317g = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.R(parcel, 1, Collections.unmodifiableList(this.f5315a));
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5316d ? 1 : 0);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5317g ? 1 : 0);
        i4.W(parcel, iU);
    }
}
