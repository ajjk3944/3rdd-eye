package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zv0 extends qb.a {
    public static final Parcelable.Creator<zv0> CREATOR = new ci(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f19189a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19191c;

    public zv0(int i4, int i10, byte[] bArr) {
        this.f19189a = i4;
        this.f19190b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f19191c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f19189a);
        com.bumptech.glide.f.E(parcel, 2, this.f19190b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f19191c);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public zv0() {
        this(1, 1, null);
    }
}
