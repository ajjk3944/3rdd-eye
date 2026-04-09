package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import dr.a;
import wc.h;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new h(16);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4874a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4875d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4876g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4877r;

    /* renamed from: x, reason: collision with root package name */
    public final long f4878x;

    public zzr(int i10, int i11, long j, String str, boolean z10) {
        this.f4874a = z10;
        this.f4875d = str;
        this.f4876g = a.M(i10) - 1;
        this.f4877r = e5.W(i11) - 1;
        this.f4878x = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4874a ? 1 : 0);
        i4.P(parcel, 2, this.f4875d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4876g);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4877r);
        i4.S(parcel, 5, 8);
        parcel.writeLong(this.f4878x);
        i4.W(parcel, iU);
    }
}
