package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class np extends qb.a {
    public static final Parcelable.Creator<np> CREATOR = new ci(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f14388a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f14389b;

    public np(Bundle bundle, String str) {
        this.f14388a = str;
        this.f14389b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f14388a);
        com.bumptech.glide.f.D(parcel, 2, this.f14389b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
