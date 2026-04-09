package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ip extends qb.a {
    public static final Parcelable.Creator<ip> CREATOR = new ci(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f12405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12407c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12408d;

    public ip(String str, int i4, String str2, boolean z3) {
        this.f12405a = str;
        this.f12406b = z3;
        this.f12407c = i4;
        this.f12408d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f12405a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f12406b ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f12407c);
        com.bumptech.glide.f.I(parcel, 4, this.f12408d);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
