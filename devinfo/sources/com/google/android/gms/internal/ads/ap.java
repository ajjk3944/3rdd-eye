package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ap extends qb.a {
    public static final Parcelable.Creator<ap> CREATOR = new ci(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f9378a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f9379b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f9380c;

    public ap(String str, String[] strArr, String[] strArr2) {
        this.f9378a = str;
        this.f9379b = strArr;
        this.f9380c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f9378a);
        com.bumptech.glide.f.J(parcel, 2, this.f9379b);
        com.bumptech.glide.f.J(parcel, 3, this.f9380c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
