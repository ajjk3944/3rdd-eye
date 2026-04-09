package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nv extends qb.a {
    public static final Parcelable.Creator<nv> CREATOR = new ci(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f14446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14447b;

    public nv(String str, String str2) {
        this.f14446a = str;
        this.f14447b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f14446a);
        com.bumptech.glide.f.I(parcel, 2, this.f14447b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
