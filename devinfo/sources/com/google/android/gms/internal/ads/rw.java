package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rw extends qb.a {
    public static final Parcelable.Creator<rw> CREATOR = new ci(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f15772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15773b;

    /* renamed from: c, reason: collision with root package name */
    public final va.c3 f15774c;

    /* renamed from: d, reason: collision with root package name */
    public final va.z2 f15775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15776e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15777f;

    public rw(String str, String str2, va.c3 c3Var, va.z2 z2Var, int i4, String str3) {
        this.f15772a = str;
        this.f15773b = str2;
        this.f15774c = c3Var;
        this.f15775d = z2Var;
        this.f15776e = i4;
        this.f15777f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f15772a);
        com.bumptech.glide.f.I(parcel, 2, this.f15773b);
        com.bumptech.glide.f.H(parcel, 3, this.f15774c, i4);
        com.bumptech.glide.f.H(parcel, 4, this.f15775d, i4);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f15776e);
        com.bumptech.glide.f.I(parcel, 6, this.f15777f);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
