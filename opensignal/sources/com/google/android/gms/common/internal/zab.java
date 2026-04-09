package com.google.android.gms.common.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new l(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f4850a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4851d;

    /* renamed from: g, reason: collision with root package name */
    public final long f4852g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4853r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4854x;

    public zab(int i10, int i11, long j, String str, boolean z10) {
        this.f4850a = i10;
        this.f4851d = str;
        this.f4852g = j;
        this.f4853r = i11;
        this.f4854x = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4850a);
        i4.P(parcel, 2, this.f4851d);
        i4.S(parcel, 3, 8);
        parcel.writeLong(this.f4852g);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4853r);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f4854x ? 1 : 0);
        i4.W(parcel, iU);
    }
}
