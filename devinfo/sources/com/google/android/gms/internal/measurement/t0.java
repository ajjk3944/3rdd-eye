package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 extends qb.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f19931a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19932b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19933c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f19934d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19935e;

    public t0(long j, long j8, boolean z3, Bundle bundle, String str) {
        this.f19931a = j;
        this.f19932b = j8;
        this.f19933c = z3;
        this.f19934d = bundle;
        this.f19935e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 8);
        parcel.writeLong(this.f19931a);
        com.bumptech.glide.f.N(parcel, 2, 8);
        parcel.writeLong(this.f19932b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f19933c ? 1 : 0);
        com.bumptech.glide.f.D(parcel, 7, this.f19934d);
        com.bumptech.glide.f.I(parcel, 8, this.f19935e);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
