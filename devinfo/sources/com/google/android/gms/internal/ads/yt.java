package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yt extends qb.a {
    public static final Parcelable.Creator<yt> CREATOR = new ci(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18853a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18854b;

    public yt(List list, boolean z3) {
        this.f18853a = z3;
        this.f18854b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f18853a ? 1 : 0);
        com.bumptech.glide.f.K(parcel, 3, this.f18854b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
