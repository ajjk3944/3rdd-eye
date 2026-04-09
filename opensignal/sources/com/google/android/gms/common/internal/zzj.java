package com.google.android.gms.common.internal;

import ac.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new l(28);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f4864a;

    /* renamed from: d, reason: collision with root package name */
    public Feature[] f4865d;

    /* renamed from: g, reason: collision with root package name */
    public int f4866g;

    /* renamed from: r, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f4867r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.L(parcel, 1, this.f4864a);
        i4.Q(parcel, 2, this.f4865d, i10);
        int i11 = this.f4866g;
        i4.S(parcel, 3, 4);
        parcel.writeInt(i11);
        i4.O(parcel, 4, this.f4867r, i10);
        i4.W(parcel, iU);
    }
}
