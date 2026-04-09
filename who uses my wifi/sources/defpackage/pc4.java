package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pc4 extends l0 {
    public static final Parcelable.Creator<pc4> CREATOR = new ed4(2);
    public final List A;
    public final int B;
    public final String C;
    public final int D;
    public final long E;
    public final long F;
    public final Bundle G = new Bundle();
    public final int f;
    public final long g;
    public final Bundle h;
    public final int i;
    public final List j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final String n;
    public final qf3 o;
    public final Location p;
    public final String q;
    public final Bundle r;
    public final Bundle s;
    public final List t;
    public final String u;
    public final String v;
    public final boolean w;
    public final ec2 x;
    public final int y;
    public final String z;

    public pc4(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, qf3 qf3Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, ec2 ec2Var, int i4, String str5, List list3, int i5, String str6, int i6, long j2, long j3) {
        this.f = i;
        this.g = j;
        this.h = bundle == null ? new Bundle() : bundle;
        this.i = i2;
        this.j = list;
        this.k = z;
        this.l = i3;
        this.m = z2;
        this.n = str;
        this.o = qf3Var;
        this.p = location;
        this.q = str2;
        this.r = bundle2 == null ? new Bundle() : bundle2;
        this.s = bundle3;
        this.t = list2;
        this.u = str3;
        this.v = str4;
        this.w = z3;
        this.x = ec2Var;
        this.y = i4;
        this.z = str5;
        this.A = list3 == null ? new ArrayList() : list3;
        this.B = i5;
        this.C = str6;
        this.D = i6;
        this.E = j2;
        this.F = j3;
    }

    public final boolean a(pc4 pc4Var) {
        return pc4Var != null && this.f == pc4Var.f && this.g == pc4Var.g && ou1.J(this.h, pc4Var.h) && this.i == pc4Var.i && a30.c(this.j, pc4Var.j) && this.k == pc4Var.k && this.l == pc4Var.l && this.m == pc4Var.m && a30.c(this.n, pc4Var.n) && a30.c(this.o, pc4Var.o) && a30.c(this.p, pc4Var.p) && a30.c(this.q, pc4Var.q) && ou1.J(this.r, pc4Var.r) && ou1.J(this.s, pc4Var.s) && a30.c(this.t, pc4Var.t) && a30.c(this.u, pc4Var.u) && a30.c(this.v, pc4Var.v) && this.w == pc4Var.w && this.y == pc4Var.y && a30.c(this.z, pc4Var.z) && a30.c(this.A, pc4Var.A) && this.B == pc4Var.B && a30.c(this.C, pc4Var.C) && this.D == pc4Var.D;
    }

    public final boolean b() {
        Bundle bundle = this.h;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pc4)) {
            return false;
        }
        pc4 pc4Var = (pc4) obj;
        return a(pc4Var) && this.E == pc4Var.E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Long.valueOf(this.g), this.h, Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), Integer.valueOf(this.l), Boolean.valueOf(this.m), this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, Boolean.valueOf(this.w), Integer.valueOf(this.y), this.z, this.A, Integer.valueOf(this.B), this.C, Integer.valueOf(this.D), Long.valueOf(this.E), Long.valueOf(this.F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 8);
        parcel.writeLong(this.g);
        uk2.z(parcel, 3, this.h);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.i);
        uk2.F(parcel, 5, this.j);
        uk2.T(parcel, 6, 4);
        parcel.writeInt(this.k ? 1 : 0);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.l);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.m ? 1 : 0);
        uk2.D(parcel, 9, this.n);
        uk2.C(parcel, 10, this.o, i);
        uk2.C(parcel, 11, this.p, i);
        uk2.D(parcel, 12, this.q);
        uk2.z(parcel, 13, this.r);
        uk2.z(parcel, 14, this.s);
        uk2.F(parcel, 15, this.t);
        uk2.D(parcel, 16, this.u);
        uk2.D(parcel, 17, this.v);
        uk2.T(parcel, 18, 4);
        parcel.writeInt(this.w ? 1 : 0);
        uk2.C(parcel, 19, this.x, i);
        uk2.T(parcel, 20, 4);
        parcel.writeInt(this.y);
        uk2.D(parcel, 21, this.z);
        uk2.F(parcel, 22, this.A);
        uk2.T(parcel, 23, 4);
        parcel.writeInt(this.B);
        uk2.D(parcel, 24, this.C);
        uk2.T(parcel, 25, 4);
        parcel.writeInt(this.D);
        uk2.T(parcel, 26, 8);
        parcel.writeLong(this.E);
        uk2.T(parcel, 27, 8);
        parcel.writeLong(this.F);
        uk2.O(parcel, I);
    }
}
