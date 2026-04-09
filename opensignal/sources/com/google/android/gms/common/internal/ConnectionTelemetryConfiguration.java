package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import zp.f;

/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f4825a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4826d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4827g;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f4828r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4829x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4830y;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f4825a = rootTelemetryConfiguration;
        this.f4826d = z10;
        this.f4827g = z11;
        this.f4828r = iArr;
        this.f4829x = i10;
        this.f4830y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 1, this.f4825a, i10);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4826d ? 1 : 0);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4827g ? 1 : 0);
        int[] iArr = this.f4828r;
        if (iArr != null) {
            int iU2 = i4.U(parcel, 4);
            parcel.writeIntArray(iArr);
            i4.W(parcel, iU2);
        }
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f4829x);
        int[] iArr2 = this.f4830y;
        if (iArr2 != null) {
            int iU3 = i4.U(parcel, 6);
            parcel.writeIntArray(iArr2);
            i4.W(parcel, iU3);
        }
        i4.W(parcel, iU);
    }
}
