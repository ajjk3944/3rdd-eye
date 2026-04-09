package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new h(24);
    public String B;

    /* renamed from: a, reason: collision with root package name */
    public final long f5412a;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5413d;

    /* renamed from: g, reason: collision with root package name */
    public final String f5414g;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f5415r;

    /* renamed from: x, reason: collision with root package name */
    public final int f5416x;

    /* renamed from: y, reason: collision with root package name */
    public final long f5417y;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i10, long j7, String str2) {
        this.f5412a = j;
        this.f5413d = bArr;
        this.f5414g = str;
        this.f5415r = bundle;
        this.f5416x = i10;
        this.f5417y = j7;
        this.B = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 8);
        parcel.writeLong(this.f5412a);
        byte[] bArr = this.f5413d;
        if (bArr != null) {
            int iU2 = i4.U(parcel, 2);
            parcel.writeByteArray(bArr);
            i4.W(parcel, iU2);
        }
        i4.P(parcel, 3, this.f5414g);
        i4.L(parcel, 4, this.f5415r);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f5416x);
        i4.S(parcel, 6, 8);
        parcel.writeLong(this.f5417y);
        i4.P(parcel, 7, this.B);
        i4.W(parcel, iU);
    }
}
