package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zq0 extends qb.a {
    public static final Parcelable.Creator<zq0> CREATOR = new ci(19);

    /* renamed from: a, reason: collision with root package name */
    public final Context f19143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19144b;

    /* renamed from: c, reason: collision with root package name */
    public final yq0 f19145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19148f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19149h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19150i;
    public final int j;

    public zq0(int i4, int i10, int i11, int i12, String str, int i13, int i14) {
        yq0[] yq0VarArrValues = yq0.values();
        this.f19143a = null;
        this.f19144b = i4;
        this.f19145c = yq0VarArrValues[i4];
        this.f19146d = i10;
        this.f19147e = i11;
        this.f19148f = i12;
        this.g = str;
        this.f19149h = i13;
        this.j = new int[]{1, 2, 3}[i13];
        this.f19150i = i14;
        int i15 = new int[]{1}[i14];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f19144b);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f19146d);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f19147e);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f19148f);
        com.bumptech.glide.f.I(parcel, 5, this.g);
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(this.f19149h);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.f19150i);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public zq0(Context context, yq0 yq0Var, int i4, int i10, int i11, String str, String str2) {
        yq0.values();
        this.f19143a = context;
        this.f19144b = yq0Var.ordinal();
        this.f19145c = yq0Var;
        this.f19146d = i4;
        this.f19147e = i10;
        this.f19148f = i11;
        this.g = str;
        int i12 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.j = i12;
        this.f19149h = i12 - 1;
        this.f19150i = 0;
    }
}
