package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class op extends qb.a {
    public static final Parcelable.Creator<op> CREATOR = new ci(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f14764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14765b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14766c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14767d;

    public op(int i4, int i10, int i11, String str) {
        this.f14764a = i4;
        this.f14765b = i10;
        this.f14766c = str;
        this.f14767d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f14765b);
        com.bumptech.glide.f.I(parcel, 2, this.f14766c);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f14767d);
        com.bumptech.glide.f.N(parcel, 1000, 4);
        parcel.writeInt(this.f14764a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
