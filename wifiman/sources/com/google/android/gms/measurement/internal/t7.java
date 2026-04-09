package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class t7 extends AbstractC8026a {
    public static final Parcelable.Creator<t7> CREATOR = new O6();

    /* renamed from: A, reason: collision with root package name */
    public final String f36741A;

    /* renamed from: B, reason: collision with root package name */
    public final int f36742B;

    /* renamed from: C, reason: collision with root package name */
    public final long f36743C;

    /* renamed from: D, reason: collision with root package name */
    public final String f36744D;

    /* renamed from: E, reason: collision with root package name */
    public final String f36745E;

    /* renamed from: F, reason: collision with root package name */
    public final long f36746F;

    /* renamed from: G, reason: collision with root package name */
    public final int f36747G;

    /* renamed from: a, reason: collision with root package name */
    public final String f36748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36749b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36750c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36751d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36752e;

    /* renamed from: f, reason: collision with root package name */
    public final long f36753f;

    /* renamed from: g, reason: collision with root package name */
    public final String f36754g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36755h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36756i;

    /* renamed from: j, reason: collision with root package name */
    public final long f36757j;

    /* renamed from: k, reason: collision with root package name */
    public final String f36758k;

    /* renamed from: l, reason: collision with root package name */
    public final long f36759l;

    /* renamed from: m, reason: collision with root package name */
    public final int f36760m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36761n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f36762o;

    /* renamed from: p, reason: collision with root package name */
    public final String f36763p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f36764q;

    /* renamed from: r, reason: collision with root package name */
    public final long f36765r;

    /* renamed from: s, reason: collision with root package name */
    public final List f36766s;

    /* renamed from: t, reason: collision with root package name */
    private final String f36767t;

    /* renamed from: u, reason: collision with root package name */
    public final String f36768u;

    /* renamed from: v, reason: collision with root package name */
    public final String f36769v;

    /* renamed from: w, reason: collision with root package name */
    public final String f36770w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f36771x;

    /* renamed from: y, reason: collision with root package name */
    public final long f36772y;

    /* renamed from: z, reason: collision with root package name */
    public final int f36773z;

    t7(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        AbstractC7901p.f(str);
        this.f36748a = str;
        this.f36749b = TextUtils.isEmpty(str2) ? null : str2;
        this.f36750c = str3;
        this.f36757j = j10;
        this.f36751d = str4;
        this.f36752e = j11;
        this.f36753f = j12;
        this.f36754g = str5;
        this.f36755h = z10;
        this.f36756i = z11;
        this.f36758k = str6;
        this.f36759l = j13;
        this.f36760m = i10;
        this.f36761n = z12;
        this.f36762o = z13;
        this.f36763p = str7;
        this.f36764q = bool;
        this.f36765r = j14;
        this.f36766s = list;
        this.f36767t = null;
        this.f36768u = str9;
        this.f36769v = str10;
        this.f36770w = str11;
        this.f36771x = z14;
        this.f36772y = j15;
        this.f36773z = i11;
        this.f36741A = str12;
        this.f36742B = i12;
        this.f36743C = j16;
        this.f36744D = str13;
        this.f36745E = str14;
        this.f36746F = j17;
        this.f36747G = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 2, this.f36748a, false);
        t3.b.q(parcel, 3, this.f36749b, false);
        t3.b.q(parcel, 4, this.f36750c, false);
        t3.b.q(parcel, 5, this.f36751d, false);
        t3.b.n(parcel, 6, this.f36752e);
        t3.b.n(parcel, 7, this.f36753f);
        t3.b.q(parcel, 8, this.f36754g, false);
        t3.b.c(parcel, 9, this.f36755h);
        t3.b.c(parcel, 10, this.f36756i);
        t3.b.n(parcel, 11, this.f36757j);
        t3.b.q(parcel, 12, this.f36758k, false);
        t3.b.n(parcel, 14, this.f36759l);
        t3.b.k(parcel, 15, this.f36760m);
        t3.b.c(parcel, 16, this.f36761n);
        t3.b.c(parcel, 18, this.f36762o);
        t3.b.q(parcel, 19, this.f36763p, false);
        t3.b.d(parcel, 21, this.f36764q, false);
        t3.b.n(parcel, 22, this.f36765r);
        t3.b.r(parcel, 23, this.f36766s, false);
        t3.b.q(parcel, 24, this.f36767t, false);
        t3.b.q(parcel, 25, this.f36768u, false);
        t3.b.q(parcel, 26, this.f36769v, false);
        t3.b.q(parcel, 27, this.f36770w, false);
        t3.b.c(parcel, 28, this.f36771x);
        t3.b.n(parcel, 29, this.f36772y);
        t3.b.k(parcel, 30, this.f36773z);
        t3.b.q(parcel, 31, this.f36741A, false);
        t3.b.k(parcel, 32, this.f36742B);
        t3.b.n(parcel, 34, this.f36743C);
        t3.b.q(parcel, 35, this.f36744D, false);
        t3.b.q(parcel, 36, this.f36745E, false);
        t3.b.n(parcel, 37, this.f36746F);
        t3.b.k(parcel, 38, this.f36747G);
        t3.b.b(parcel, iA);
    }

    t7(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        this.f36748a = str;
        this.f36749b = str2;
        this.f36750c = str3;
        this.f36757j = j12;
        this.f36751d = str4;
        this.f36752e = j10;
        this.f36753f = j11;
        this.f36754g = str5;
        this.f36755h = z10;
        this.f36756i = z11;
        this.f36758k = str6;
        this.f36759l = j13;
        this.f36760m = i10;
        this.f36761n = z12;
        this.f36762o = z13;
        this.f36763p = str7;
        this.f36764q = bool;
        this.f36765r = j14;
        this.f36766s = list;
        this.f36767t = str8;
        this.f36768u = str9;
        this.f36769v = str10;
        this.f36770w = str11;
        this.f36771x = z14;
        this.f36772y = j15;
        this.f36773z = i11;
        this.f36741A = str12;
        this.f36742B = i12;
        this.f36743C = j16;
        this.f36744D = str13;
        this.f36745E = str14;
        this.f36746F = j17;
        this.f36747G = i13;
    }
}
