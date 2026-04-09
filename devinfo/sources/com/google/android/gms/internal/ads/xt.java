package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xt extends qb.a {
    public static final Parcelable.Creator<xt> CREATOR = new ci(10);
    public final long A;
    public final String B;
    public final float C;
    public final int D;
    public final int E;
    public final boolean F;
    public final String G;
    public final boolean H;
    public final String I;
    public final boolean J;
    public final int K;
    public final Bundle L;
    public final String M;
    public final va.c2 N;
    public final boolean O;
    public final Bundle P;
    public final String Q;
    public final String R;
    public final String S;
    public final boolean T;
    public final List U;
    public final String V;
    public final List W;
    public final int X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f18461a;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f18462a0;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f18463b;

    /* renamed from: b0, reason: collision with root package name */
    public final ArrayList f18464b0;

    /* renamed from: c, reason: collision with root package name */
    public final va.z2 f18465c;

    /* renamed from: c0, reason: collision with root package name */
    public final String f18466c0;

    /* renamed from: d, reason: collision with root package name */
    public final va.c3 f18467d;

    /* renamed from: d0, reason: collision with root package name */
    public final op f18468d0;

    /* renamed from: e, reason: collision with root package name */
    public final String f18469e;

    /* renamed from: e0, reason: collision with root package name */
    public final String f18470e0;

    /* renamed from: f, reason: collision with root package name */
    public final ApplicationInfo f18471f;

    /* renamed from: f0, reason: collision with root package name */
    public final Bundle f18472f0;
    public final PackageInfo g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18473h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18474i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final za.a f18475k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f18476l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18477m;

    /* renamed from: n, reason: collision with root package name */
    public final List f18478n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f18479o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18480p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18481q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18482r;

    /* renamed from: s, reason: collision with root package name */
    public final float f18483s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18484t;

    /* renamed from: u, reason: collision with root package name */
    public final long f18485u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18486v;

    /* renamed from: w, reason: collision with root package name */
    public final List f18487w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18488x;

    /* renamed from: y, reason: collision with root package name */
    public final qm f18489y;

    /* renamed from: z, reason: collision with root package name */
    public final List f18490z;

    public xt(int i4, Bundle bundle, va.z2 z2Var, va.c3 c3Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, za.a aVar, Bundle bundle2, int i10, ArrayList arrayList, Bundle bundle3, boolean z3, int i11, int i12, float f10, String str5, long j, String str6, ArrayList arrayList2, String str7, qm qmVar, ArrayList arrayList3, long j8, String str8, float f11, boolean z10, int i13, int i14, boolean z11, String str9, String str10, boolean z12, int i15, Bundle bundle4, String str11, va.c2 c2Var, boolean z13, Bundle bundle5, String str12, String str13, String str14, boolean z14, ArrayList arrayList4, String str15, ArrayList arrayList5, int i16, boolean z15, boolean z16, boolean z17, ArrayList arrayList6, String str16, op opVar, String str17, Bundle bundle6) {
        this.f18461a = i4;
        this.f18463b = bundle;
        this.f18465c = z2Var;
        this.f18467d = c3Var;
        this.f18469e = str;
        this.f18471f = applicationInfo;
        this.g = packageInfo;
        this.f18473h = str2;
        this.f18474i = str3;
        this.j = str4;
        this.f18475k = aVar;
        this.f18476l = bundle2;
        this.f18477m = i10;
        this.f18478n = arrayList;
        this.f18490z = arrayList3 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList3);
        this.f18479o = bundle3;
        this.f18480p = z3;
        this.f18481q = i11;
        this.f18482r = i12;
        this.f18483s = f10;
        this.f18484t = str5;
        this.f18485u = j;
        this.f18486v = str6;
        this.f18487w = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
        this.f18488x = str7;
        this.f18489y = qmVar;
        this.A = j8;
        this.B = str8;
        this.C = f11;
        this.H = z10;
        this.D = i13;
        this.E = i14;
        this.F = z11;
        this.G = str9;
        this.I = str10;
        this.J = z12;
        this.K = i15;
        this.L = bundle4;
        this.M = str11;
        this.N = c2Var;
        this.O = z13;
        this.P = bundle5;
        this.Q = str12;
        this.R = str13;
        this.S = str14;
        this.T = z14;
        this.U = arrayList4;
        this.V = str15;
        this.W = arrayList5;
        this.X = i16;
        this.Y = z15;
        this.Z = z16;
        this.f18462a0 = z17;
        this.f18464b0 = arrayList6;
        this.f18466c0 = str16;
        this.f18468d0 = opVar;
        this.f18470e0 = str17;
        this.f18472f0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f18461a);
        com.bumptech.glide.f.D(parcel, 2, this.f18463b);
        com.bumptech.glide.f.H(parcel, 3, this.f18465c, i4);
        com.bumptech.glide.f.H(parcel, 4, this.f18467d, i4);
        com.bumptech.glide.f.I(parcel, 5, this.f18469e);
        com.bumptech.glide.f.H(parcel, 6, this.f18471f, i4);
        com.bumptech.glide.f.H(parcel, 7, this.g, i4);
        com.bumptech.glide.f.I(parcel, 8, this.f18473h);
        com.bumptech.glide.f.I(parcel, 9, this.f18474i);
        com.bumptech.glide.f.I(parcel, 10, this.j);
        com.bumptech.glide.f.H(parcel, 11, this.f18475k, i4);
        com.bumptech.glide.f.D(parcel, 12, this.f18476l);
        com.bumptech.glide.f.N(parcel, 13, 4);
        parcel.writeInt(this.f18477m);
        com.bumptech.glide.f.K(parcel, 14, this.f18478n);
        com.bumptech.glide.f.D(parcel, 15, this.f18479o);
        com.bumptech.glide.f.N(parcel, 16, 4);
        parcel.writeInt(this.f18480p ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 18, 4);
        parcel.writeInt(this.f18481q);
        com.bumptech.glide.f.N(parcel, 19, 4);
        parcel.writeInt(this.f18482r);
        com.bumptech.glide.f.N(parcel, 20, 4);
        parcel.writeFloat(this.f18483s);
        com.bumptech.glide.f.I(parcel, 21, this.f18484t);
        com.bumptech.glide.f.N(parcel, 25, 8);
        parcel.writeLong(this.f18485u);
        com.bumptech.glide.f.I(parcel, 26, this.f18486v);
        com.bumptech.glide.f.K(parcel, 27, this.f18487w);
        com.bumptech.glide.f.I(parcel, 28, this.f18488x);
        com.bumptech.glide.f.H(parcel, 29, this.f18489y, i4);
        com.bumptech.glide.f.K(parcel, 30, this.f18490z);
        com.bumptech.glide.f.N(parcel, 31, 8);
        parcel.writeLong(this.A);
        com.bumptech.glide.f.I(parcel, 33, this.B);
        com.bumptech.glide.f.N(parcel, 34, 4);
        parcel.writeFloat(this.C);
        com.bumptech.glide.f.N(parcel, 35, 4);
        parcel.writeInt(this.D);
        com.bumptech.glide.f.N(parcel, 36, 4);
        parcel.writeInt(this.E);
        com.bumptech.glide.f.N(parcel, 37, 4);
        parcel.writeInt(this.F ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 39, this.G);
        com.bumptech.glide.f.N(parcel, 40, 4);
        parcel.writeInt(this.H ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 41, this.I);
        com.bumptech.glide.f.N(parcel, 42, 4);
        parcel.writeInt(this.J ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 43, 4);
        parcel.writeInt(this.K);
        com.bumptech.glide.f.D(parcel, 44, this.L);
        com.bumptech.glide.f.I(parcel, 45, this.M);
        com.bumptech.glide.f.H(parcel, 46, this.N, i4);
        com.bumptech.glide.f.N(parcel, 47, 4);
        parcel.writeInt(this.O ? 1 : 0);
        com.bumptech.glide.f.D(parcel, 48, this.P);
        com.bumptech.glide.f.I(parcel, 49, this.Q);
        com.bumptech.glide.f.I(parcel, 50, this.R);
        com.bumptech.glide.f.I(parcel, 51, this.S);
        com.bumptech.glide.f.N(parcel, 52, 4);
        parcel.writeInt(this.T ? 1 : 0);
        com.bumptech.glide.f.G(parcel, 53, this.U);
        com.bumptech.glide.f.I(parcel, 54, this.V);
        com.bumptech.glide.f.K(parcel, 55, this.W);
        com.bumptech.glide.f.N(parcel, 56, 4);
        parcel.writeInt(this.X);
        com.bumptech.glide.f.N(parcel, 57, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 58, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 59, 4);
        parcel.writeInt(this.f18462a0 ? 1 : 0);
        com.bumptech.glide.f.K(parcel, 60, this.f18464b0);
        com.bumptech.glide.f.I(parcel, 61, this.f18466c0);
        com.bumptech.glide.f.H(parcel, 63, this.f18468d0, i4);
        com.bumptech.glide.f.I(parcel, 64, this.f18470e0);
        com.bumptech.glide.f.D(parcel, 65, this.f18472f0);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
