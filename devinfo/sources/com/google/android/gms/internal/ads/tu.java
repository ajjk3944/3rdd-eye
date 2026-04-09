package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tu extends qb.a {
    public static final Parcelable.Creator<tu> CREATOR = new ci(14);

    /* renamed from: a, reason: collision with root package name */
    public final va.z2 f16962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16963b;

    public tu(String str, va.z2 z2Var) {
        this.f16962a = z2Var;
        this.f16963b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.H(parcel, 2, this.f16962a, i4);
        com.bumptech.glide.f.I(parcel, 3, this.f16963b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
