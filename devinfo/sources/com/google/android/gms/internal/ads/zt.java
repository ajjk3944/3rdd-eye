package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zt extends qb.a {
    public static final Parcelable.Creator<zt> CREATOR = new ci(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f19174a;

    public zt(String str) {
        this.f19174a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f19174a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
