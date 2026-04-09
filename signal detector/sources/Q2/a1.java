package q2;

import a.AbstractC0241a;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends N2.a {
    public static final Parcelable.Creator<a1> CREATOR = new C2819g0(8);

    /* renamed from: C, reason: collision with root package name */
    public final List f23152C;

    /* renamed from: D, reason: collision with root package name */
    public final String f23153D;

    /* renamed from: E, reason: collision with root package name */
    public final String f23154E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f23155F;

    /* renamed from: G, reason: collision with root package name */
    public final O f23156G;

    /* renamed from: H, reason: collision with root package name */
    public final int f23157H;

    /* renamed from: I, reason: collision with root package name */
    public final String f23158I;

    /* renamed from: J, reason: collision with root package name */
    public final List f23159J;

    /* renamed from: K, reason: collision with root package name */
    public final int f23160K;

    /* renamed from: L, reason: collision with root package name */
    public final String f23161L;
    public final int M;

    /* renamed from: N, reason: collision with root package name */
    public final long f23162N;

    /* renamed from: O, reason: collision with root package name */
    public final long f23163O;

    /* renamed from: P, reason: collision with root package name */
    public final Bundle f23164P = new Bundle();

    /* renamed from: a, reason: collision with root package name */
    public final int f23165a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23166b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23167c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23168d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23170f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23171g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23172h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final W0 f23173j;

    /* renamed from: k, reason: collision with root package name */
    public final Location f23174k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23175l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f23176m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f23177n;

    public a1(int i, long j6, Bundle bundle, int i3, List list, boolean z6, int i6, boolean z7, String str, W0 w02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z8, O o5, int i7, String str5, List list3, int i8, String str6, int i9, long j7, long j8) {
        this.f23165a = i;
        this.f23166b = j6;
        this.f23167c = bundle == null ? new Bundle() : bundle;
        this.f23168d = i3;
        this.f23169e = list;
        this.f23170f = z6;
        this.f23171g = i6;
        this.f23172h = z7;
        this.i = str;
        this.f23173j = w02;
        this.f23174k = location;
        this.f23175l = str2;
        this.f23176m = bundle2 == null ? new Bundle() : bundle2;
        this.f23177n = bundle3;
        this.f23152C = list2;
        this.f23153D = str3;
        this.f23154E = str4;
        this.f23155F = z8;
        this.f23156G = o5;
        this.f23157H = i7;
        this.f23158I = str5;
        this.f23159J = list3 == null ? new ArrayList() : list3;
        this.f23160K = i8;
        this.f23161L = str6;
        this.M = i9;
        this.f23162N = j7;
        this.f23163O = j8;
    }

    public final boolean a(a1 a1Var) {
        return A.f.y(a1Var) && this.f23165a == a1Var.f23165a && this.f23166b == a1Var.f23166b && u2.k.a(this.f23167c, a1Var.f23167c) && this.f23168d == a1Var.f23168d && M2.u.g(this.f23169e, a1Var.f23169e) && this.f23170f == a1Var.f23170f && this.f23171g == a1Var.f23171g && this.f23172h == a1Var.f23172h && M2.u.g(this.i, a1Var.i) && M2.u.g(this.f23173j, a1Var.f23173j) && M2.u.g(this.f23174k, a1Var.f23174k) && M2.u.g(this.f23175l, a1Var.f23175l) && u2.k.a(this.f23176m, a1Var.f23176m) && u2.k.a(this.f23177n, a1Var.f23177n) && M2.u.g(this.f23152C, a1Var.f23152C) && M2.u.g(this.f23153D, a1Var.f23153D) && M2.u.g(this.f23154E, a1Var.f23154E) && this.f23155F == a1Var.f23155F && this.f23157H == a1Var.f23157H && M2.u.g(this.f23158I, a1Var.f23158I) && M2.u.g(this.f23159J, a1Var.f23159J) && this.f23160K == a1Var.f23160K && M2.u.g(this.f23161L, a1Var.f23161L) && this.M == a1Var.M;
    }

    public final boolean b() {
        Bundle bundle = this.f23167c;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            return a((a1) obj) && this.f23162N == ((a1) obj).f23162N;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23165a), Long.valueOf(this.f23166b), this.f23167c, Integer.valueOf(this.f23168d), this.f23169e, Boolean.valueOf(this.f23170f), Integer.valueOf(this.f23171g), Boolean.valueOf(this.f23172h), this.i, this.f23173j, this.f23174k, this.f23175l, this.f23176m, this.f23177n, this.f23152C, this.f23153D, this.f23154E, Boolean.valueOf(this.f23155F), Integer.valueOf(this.f23157H), this.f23158I, this.f23159J, Integer.valueOf(this.f23160K), this.f23161L, Integer.valueOf(this.M), Long.valueOf(this.f23162N), Long.valueOf(this.f23163O)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f23165a);
        AbstractC0241a.B(parcel, 2, 8);
        parcel.writeLong(this.f23166b);
        AbstractC0241a.q(parcel, 3, this.f23167c);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f23168d);
        AbstractC0241a.w(parcel, 5, this.f23169e);
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeInt(this.f23170f ? 1 : 0);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f23171g);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f23172h ? 1 : 0);
        AbstractC0241a.u(parcel, 9, this.i);
        AbstractC0241a.t(parcel, 10, this.f23173j, i);
        AbstractC0241a.t(parcel, 11, this.f23174k, i);
        AbstractC0241a.u(parcel, 12, this.f23175l);
        AbstractC0241a.q(parcel, 13, this.f23176m);
        AbstractC0241a.q(parcel, 14, this.f23177n);
        AbstractC0241a.w(parcel, 15, this.f23152C);
        AbstractC0241a.u(parcel, 16, this.f23153D);
        AbstractC0241a.u(parcel, 17, this.f23154E);
        AbstractC0241a.B(parcel, 18, 4);
        parcel.writeInt(this.f23155F ? 1 : 0);
        AbstractC0241a.t(parcel, 19, this.f23156G, i);
        AbstractC0241a.B(parcel, 20, 4);
        parcel.writeInt(this.f23157H);
        AbstractC0241a.u(parcel, 21, this.f23158I);
        AbstractC0241a.w(parcel, 22, this.f23159J);
        AbstractC0241a.B(parcel, 23, 4);
        parcel.writeInt(this.f23160K);
        AbstractC0241a.u(parcel, 24, this.f23161L);
        AbstractC0241a.B(parcel, 25, 4);
        parcel.writeInt(this.M);
        AbstractC0241a.B(parcel, 26, 8);
        parcel.writeLong(this.f23162N);
        AbstractC0241a.B(parcel, 27, 8);
        parcel.writeLong(this.f23163O);
        AbstractC0241a.H(parcel, iE);
    }
}
