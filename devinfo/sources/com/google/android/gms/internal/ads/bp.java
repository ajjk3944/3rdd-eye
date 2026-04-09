package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bp extends qb.a {
    public static final Parcelable.Creator<bp> CREATOR = new ci(4);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9749c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9750d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9751e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f9752f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9753h;

    public bp(boolean z3, String str, int i4, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j) {
        this.f9747a = z3;
        this.f9748b = str;
        this.f9749c = i4;
        this.f9750d = bArr;
        this.f9751e = strArr;
        this.f9752f = strArr2;
        this.g = z10;
        this.f9753h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f9747a ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 2, this.f9748b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f9749c);
        com.bumptech.glide.f.E(parcel, 4, this.f9750d);
        com.bumptech.glide.f.J(parcel, 5, this.f9751e);
        com.bumptech.glide.f.J(parcel, 6, this.f9752f);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 8, 8);
        parcel.writeLong(this.f9753h);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
