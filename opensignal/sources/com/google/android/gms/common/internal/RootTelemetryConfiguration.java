package com.google.android.gms.common.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new l(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f4843a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4844d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4845g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4846r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4847x;

    public RootTelemetryConfiguration(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f4843a = i10;
        this.f4844d = z10;
        this.f4845g = z11;
        this.f4846r = i11;
        this.f4847x = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4843a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4844d ? 1 : 0);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4845g ? 1 : 0);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4846r);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f4847x);
        i4.W(parcel, iU);
    }
}
