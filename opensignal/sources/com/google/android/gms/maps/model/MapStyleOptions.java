package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new h(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f5351a;

    public MapStyleOptions(String str) {
        s.i(str, "json must not be null");
        this.f5351a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 2, this.f5351a);
        i4.W(parcel, iU);
    }
}
