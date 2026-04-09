package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new u0(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f5290a;

    /* renamed from: d, reason: collision with root package name */
    public final long f5291d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5292g;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f5293r;

    /* renamed from: x, reason: collision with root package name */
    public final String f5294x;

    public zzdd(long j, long j7, boolean z10, Bundle bundle, String str) {
        this.f5290a = j;
        this.f5291d = j7;
        this.f5292g = z10;
        this.f5293r = bundle;
        this.f5294x = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 8);
        parcel.writeLong(this.f5290a);
        i4.S(parcel, 2, 8);
        parcel.writeLong(this.f5291d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5292g ? 1 : 0);
        i4.L(parcel, 7, this.f5293r);
        i4.P(parcel, 8, this.f5294x);
        i4.W(parcel, iU);
    }
}
