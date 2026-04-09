package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yv0 extends qb.a {
    public static final Parcelable.Creator<yv0> CREATOR = new ci(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f18886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18887b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18888c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18889d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18890e;

    public yv0(int i4, int i10, int i11, String str, String str2) {
        this.f18886a = i4;
        this.f18887b = i10;
        this.f18888c = str;
        this.f18889d = str2;
        this.f18890e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f18886a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f18887b);
        com.bumptech.glide.f.I(parcel, 3, this.f18888c);
        com.bumptech.glide.f.I(parcel, 4, this.f18889d);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f18890e);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
