package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iu extends qb.a {
    public static final Parcelable.Creator<iu> CREATOR = new ci(13);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f12473a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f12474b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f12475c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12476d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12477e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f12478f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12479h;

    /* renamed from: i, reason: collision with root package name */
    public zq0 f12480i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12481k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12482l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f12483m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f12484n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12485o;

    public iu(Bundle bundle, za.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, zq0 zq0Var, String str4, boolean z3, boolean z10, Bundle bundle2, Bundle bundle3, int i4) {
        this.f12473a = bundle;
        this.f12474b = aVar;
        this.f12476d = str;
        this.f12475c = applicationInfo;
        this.f12477e = arrayList;
        this.f12478f = packageInfo;
        this.g = str2;
        this.f12479h = str3;
        this.f12480i = zq0Var;
        this.j = str4;
        this.f12481k = z3;
        this.f12482l = z10;
        this.f12483m = bundle2;
        this.f12484n = bundle3;
        this.f12485o = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.D(parcel, 1, this.f12473a);
        com.bumptech.glide.f.H(parcel, 2, this.f12474b, i4);
        com.bumptech.glide.f.H(parcel, 3, this.f12475c, i4);
        com.bumptech.glide.f.I(parcel, 4, this.f12476d);
        com.bumptech.glide.f.K(parcel, 5, this.f12477e);
        com.bumptech.glide.f.H(parcel, 6, this.f12478f, i4);
        com.bumptech.glide.f.I(parcel, 7, this.g);
        com.bumptech.glide.f.I(parcel, 9, this.f12479h);
        com.bumptech.glide.f.H(parcel, 10, this.f12480i, i4);
        com.bumptech.glide.f.I(parcel, 11, this.j);
        com.bumptech.glide.f.N(parcel, 12, 4);
        parcel.writeInt(this.f12481k ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 13, 4);
        parcel.writeInt(this.f12482l ? 1 : 0);
        com.bumptech.glide.f.D(parcel, 14, this.f12483m);
        com.bumptech.glide.f.D(parcel, 15, this.f12484n);
        com.bumptech.glide.f.N(parcel, 16, 4);
        parcel.writeInt(this.f12485o);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
