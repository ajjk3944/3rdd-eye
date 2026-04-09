package va;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z2 extends qb.a {
    public static final Parcelable.Creator<z2> CREATOR = new f1(8);
    public final long A;
    public final Bundle B = new Bundle();

    /* renamed from: a, reason: collision with root package name */
    public final int f36188a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36189b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f36190c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36191d;

    /* renamed from: e, reason: collision with root package name */
    public final List f36192e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36193f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36194h;

    /* renamed from: i, reason: collision with root package name */
    public final String f36195i;
    public final v2 j;

    /* renamed from: k, reason: collision with root package name */
    public final Location f36196k;

    /* renamed from: l, reason: collision with root package name */
    public final String f36197l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f36198m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f36199n;

    /* renamed from: o, reason: collision with root package name */
    public final List f36200o;

    /* renamed from: p, reason: collision with root package name */
    public final String f36201p;

    /* renamed from: q, reason: collision with root package name */
    public final String f36202q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f36203r;

    /* renamed from: s, reason: collision with root package name */
    public final o0 f36204s;

    /* renamed from: t, reason: collision with root package name */
    public final int f36205t;

    /* renamed from: u, reason: collision with root package name */
    public final String f36206u;

    /* renamed from: v, reason: collision with root package name */
    public final List f36207v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36208w;

    /* renamed from: x, reason: collision with root package name */
    public final String f36209x;

    /* renamed from: y, reason: collision with root package name */
    public final int f36210y;

    /* renamed from: z, reason: collision with root package name */
    public final long f36211z;

    public z2(int i4, long j, Bundle bundle, int i10, List list, boolean z3, int i11, boolean z10, String str, v2 v2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, o0 o0Var, int i12, String str5, List list3, int i13, String str6, int i14, long j8, long j9) {
        this.f36188a = i4;
        this.f36189b = j;
        this.f36190c = bundle == null ? new Bundle() : bundle;
        this.f36191d = i10;
        this.f36192e = list;
        this.f36193f = z3;
        this.g = i11;
        this.f36194h = z10;
        this.f36195i = str;
        this.j = v2Var;
        this.f36196k = location;
        this.f36197l = str2;
        this.f36198m = bundle2 == null ? new Bundle() : bundle2;
        this.f36199n = bundle3;
        this.f36200o = list2;
        this.f36201p = str3;
        this.f36202q = str4;
        this.f36203r = z11;
        this.f36204s = o0Var;
        this.f36205t = i12;
        this.f36206u = str5;
        this.f36207v = list3 == null ? new ArrayList() : list3;
        this.f36208w = i13;
        this.f36209x = str6;
        this.f36210y = i14;
        this.f36211z = j8;
        this.A = j9;
    }

    public final boolean a(z2 z2Var) {
        return a0.g.C(z2Var) && this.f36188a == z2Var.f36188a && this.f36189b == z2Var.f36189b && za.i.a(this.f36190c, z2Var.f36190c) && this.f36191d == z2Var.f36191d && pb.y.l(this.f36192e, z2Var.f36192e) && this.f36193f == z2Var.f36193f && this.g == z2Var.g && this.f36194h == z2Var.f36194h && pb.y.l(this.f36195i, z2Var.f36195i) && pb.y.l(this.j, z2Var.j) && pb.y.l(this.f36196k, z2Var.f36196k) && pb.y.l(this.f36197l, z2Var.f36197l) && za.i.a(this.f36198m, z2Var.f36198m) && za.i.a(this.f36199n, z2Var.f36199n) && pb.y.l(this.f36200o, z2Var.f36200o) && pb.y.l(this.f36201p, z2Var.f36201p) && pb.y.l(this.f36202q, z2Var.f36202q) && this.f36203r == z2Var.f36203r && this.f36205t == z2Var.f36205t && pb.y.l(this.f36206u, z2Var.f36206u) && pb.y.l(this.f36207v, z2Var.f36207v) && this.f36208w == z2Var.f36208w && pb.y.l(this.f36209x, z2Var.f36209x) && this.f36210y == z2Var.f36210y;
    }

    public final boolean c() {
        Bundle bundle = this.f36190c;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return a(z2Var) && this.f36211z == z2Var.f36211z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36188a), Long.valueOf(this.f36189b), this.f36190c, Integer.valueOf(this.f36191d), this.f36192e, Boolean.valueOf(this.f36193f), Integer.valueOf(this.g), Boolean.valueOf(this.f36194h), this.f36195i, this.j, this.f36196k, this.f36197l, this.f36198m, this.f36199n, this.f36200o, this.f36201p, this.f36202q, Boolean.valueOf(this.f36203r), Integer.valueOf(this.f36205t), this.f36206u, this.f36207v, Integer.valueOf(this.f36208w), this.f36209x, Integer.valueOf(this.f36210y), Long.valueOf(this.f36211z), Long.valueOf(this.A)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f36188a);
        com.bumptech.glide.f.N(parcel, 2, 8);
        parcel.writeLong(this.f36189b);
        com.bumptech.glide.f.D(parcel, 3, this.f36190c);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f36191d);
        com.bumptech.glide.f.K(parcel, 5, this.f36192e);
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(this.f36193f ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.g);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.f36194h ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 9, this.f36195i);
        com.bumptech.glide.f.H(parcel, 10, this.j, i4);
        com.bumptech.glide.f.H(parcel, 11, this.f36196k, i4);
        com.bumptech.glide.f.I(parcel, 12, this.f36197l);
        com.bumptech.glide.f.D(parcel, 13, this.f36198m);
        com.bumptech.glide.f.D(parcel, 14, this.f36199n);
        com.bumptech.glide.f.K(parcel, 15, this.f36200o);
        com.bumptech.glide.f.I(parcel, 16, this.f36201p);
        com.bumptech.glide.f.I(parcel, 17, this.f36202q);
        com.bumptech.glide.f.N(parcel, 18, 4);
        parcel.writeInt(this.f36203r ? 1 : 0);
        com.bumptech.glide.f.H(parcel, 19, this.f36204s, i4);
        com.bumptech.glide.f.N(parcel, 20, 4);
        parcel.writeInt(this.f36205t);
        com.bumptech.glide.f.I(parcel, 21, this.f36206u);
        com.bumptech.glide.f.K(parcel, 22, this.f36207v);
        com.bumptech.glide.f.N(parcel, 23, 4);
        parcel.writeInt(this.f36208w);
        com.bumptech.glide.f.I(parcel, 24, this.f36209x);
        com.bumptech.glide.f.N(parcel, 25, 4);
        parcel.writeInt(this.f36210y);
        com.bumptech.glide.f.N(parcel, 26, 8);
        parcel.writeLong(this.f36211z);
        com.bumptech.glide.f.N(parcel, 27, 8);
        parcel.writeLong(this.A);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
