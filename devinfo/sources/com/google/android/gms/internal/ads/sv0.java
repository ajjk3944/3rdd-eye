package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sv0 extends qb.a {
    public static final Parcelable.Creator<sv0> CREATOR = new ci(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f16561a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16562b;

    public sv0(int i4, byte[] bArr) {
        this.f16561a = i4;
        this.f16562b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f16561a);
        com.bumptech.glide.f.E(parcel, 2, this.f16562b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
