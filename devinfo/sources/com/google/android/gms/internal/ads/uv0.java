package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uv0 extends qb.a {
    public static final Parcelable.Creator<uv0> CREATOR = new ci(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f17353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17355c;

    public uv0(int i4, String str, String str2) {
        this.f17353a = i4;
        this.f17354b = str;
        this.f17355c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f17353a);
        com.bumptech.glide.f.I(parcel, 2, this.f17354b);
        com.bumptech.glide.f.I(parcel, 3, this.f17355c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
