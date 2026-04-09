package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tv extends qb.a {
    public static final Parcelable.Creator<tv> CREATOR = new ci(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f16968a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16971d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16973f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final List f16974h;

    public tv(String str, String str2, boolean z3, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.f16968a = str;
        this.f16969b = str2;
        this.f16970c = z3;
        this.f16971d = z10;
        this.f16972e = list;
        this.f16973f = z11;
        this.g = z12;
        this.f16974h = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f16968a);
        com.bumptech.glide.f.I(parcel, 3, this.f16969b);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f16970c ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f16971d ? 1 : 0);
        com.bumptech.glide.f.K(parcel, 6, this.f16972e);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.f16973f ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        com.bumptech.glide.f.K(parcel, 9, this.f16974h);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
