package ec;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n4 extends qb.a {
    public static final Parcelable.Creator<n4> CREATOR = new androidx.recyclerview.widget.i0(22);
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final String f22915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22916b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22917c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22918d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22919e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22920f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22921h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22922i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final String f22923k;

    /* renamed from: l, reason: collision with root package name */
    public final long f22924l;

    /* renamed from: m, reason: collision with root package name */
    public final int f22925m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22926n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f22927o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f22928p;

    /* renamed from: q, reason: collision with root package name */
    public final long f22929q;

    /* renamed from: r, reason: collision with root package name */
    public final List f22930r;

    /* renamed from: s, reason: collision with root package name */
    public final String f22931s;

    /* renamed from: t, reason: collision with root package name */
    public final String f22932t;

    /* renamed from: u, reason: collision with root package name */
    public final String f22933u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f22934v;

    /* renamed from: w, reason: collision with root package name */
    public final long f22935w;

    /* renamed from: x, reason: collision with root package name */
    public final int f22936x;

    /* renamed from: y, reason: collision with root package name */
    public final String f22937y;

    /* renamed from: z, reason: collision with root package name */
    public final int f22938z;

    public n4(String str, String str2, String str3, long j, String str4, long j8, long j9, String str5, boolean z3, boolean z10, String str6, long j10, int i4, boolean z11, boolean z12, Boolean bool, long j11, List list, String str7, String str8, String str9, boolean z13, long j12, int i10, String str10, int i11, long j13, String str11, String str12, long j14, int i12) {
        pb.y.e(str);
        this.f22915a = str;
        this.f22916b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f22917c = str3;
        this.j = j;
        this.f22918d = str4;
        this.f22919e = j8;
        this.f22920f = j9;
        this.g = str5;
        this.f22921h = z3;
        this.f22922i = z10;
        this.f22923k = str6;
        this.f22924l = j10;
        this.f22925m = i4;
        this.f22926n = z11;
        this.f22927o = z12;
        this.f22928p = bool;
        this.f22929q = j11;
        this.f22930r = list;
        this.f22931s = str7;
        this.f22932t = str8;
        this.f22933u = str9;
        this.f22934v = z13;
        this.f22935w = j12;
        this.f22936x = i10;
        this.f22937y = str10;
        this.f22938z = i11;
        this.A = j13;
        this.B = str11;
        this.C = str12;
        this.D = j14;
        this.E = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f22915a);
        com.bumptech.glide.f.I(parcel, 3, this.f22916b);
        com.bumptech.glide.f.I(parcel, 4, this.f22917c);
        com.bumptech.glide.f.I(parcel, 5, this.f22918d);
        com.bumptech.glide.f.N(parcel, 6, 8);
        parcel.writeLong(this.f22919e);
        com.bumptech.glide.f.N(parcel, 7, 8);
        parcel.writeLong(this.f22920f);
        com.bumptech.glide.f.I(parcel, 8, this.g);
        com.bumptech.glide.f.N(parcel, 9, 4);
        parcel.writeInt(this.f22921h ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 10, 4);
        parcel.writeInt(this.f22922i ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 11, 8);
        parcel.writeLong(this.j);
        com.bumptech.glide.f.I(parcel, 12, this.f22923k);
        com.bumptech.glide.f.N(parcel, 14, 8);
        parcel.writeLong(this.f22924l);
        com.bumptech.glide.f.N(parcel, 15, 4);
        parcel.writeInt(this.f22925m);
        com.bumptech.glide.f.N(parcel, 16, 4);
        parcel.writeInt(this.f22926n ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 18, 4);
        parcel.writeInt(this.f22927o ? 1 : 0);
        Boolean bool = this.f22928p;
        if (bool != null) {
            com.bumptech.glide.f.N(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.bumptech.glide.f.N(parcel, 22, 8);
        parcel.writeLong(this.f22929q);
        com.bumptech.glide.f.K(parcel, 23, this.f22930r);
        com.bumptech.glide.f.I(parcel, 25, this.f22931s);
        com.bumptech.glide.f.I(parcel, 26, this.f22932t);
        com.bumptech.glide.f.I(parcel, 27, this.f22933u);
        com.bumptech.glide.f.N(parcel, 28, 4);
        parcel.writeInt(this.f22934v ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 29, 8);
        parcel.writeLong(this.f22935w);
        com.bumptech.glide.f.N(parcel, 30, 4);
        parcel.writeInt(this.f22936x);
        com.bumptech.glide.f.I(parcel, 31, this.f22937y);
        com.bumptech.glide.f.N(parcel, 32, 4);
        parcel.writeInt(this.f22938z);
        com.bumptech.glide.f.N(parcel, 34, 8);
        parcel.writeLong(this.A);
        com.bumptech.glide.f.I(parcel, 35, this.B);
        com.bumptech.glide.f.I(parcel, 36, this.C);
        com.bumptech.glide.f.N(parcel, 37, 8);
        parcel.writeLong(this.D);
        com.bumptech.glide.f.N(parcel, 38, 4);
        parcel.writeInt(this.E);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public n4(String str, String str2, String str3, String str4, long j, long j8, String str5, boolean z3, boolean z10, long j9, String str6, long j10, int i4, boolean z11, boolean z12, Boolean bool, long j11, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j12, int i10, String str10, int i11, long j13, String str11, String str12, long j14, int i12) {
        this.f22915a = str;
        this.f22916b = str2;
        this.f22917c = str3;
        this.j = j9;
        this.f22918d = str4;
        this.f22919e = j;
        this.f22920f = j8;
        this.g = str5;
        this.f22921h = z3;
        this.f22922i = z10;
        this.f22923k = str6;
        this.f22924l = j10;
        this.f22925m = i4;
        this.f22926n = z11;
        this.f22927o = z12;
        this.f22928p = bool;
        this.f22929q = j11;
        this.f22930r = arrayList;
        this.f22931s = str7;
        this.f22932t = str8;
        this.f22933u = str9;
        this.f22934v = z13;
        this.f22935w = j12;
        this.f22936x = i10;
        this.f22937y = str10;
        this.f22938z = i11;
        this.A = j13;
        this.B = str11;
        this.C = str12;
        this.D = j14;
        this.E = i12;
    }
}
