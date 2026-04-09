package com.google.android.gms.common.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new l(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f4848a;

    /* renamed from: d, reason: collision with root package name */
    public List f4849d;

    public TelemetryData(int i10, List list) {
        this.f4848a = i10;
        this.f4849d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4848a);
        i4.R(parcel, 2, this.f4849d);
        i4.W(parcel, iU);
    }
}
