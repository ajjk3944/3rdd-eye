package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r12 extends l0 {
    public static final Parcelable.Creator<r12> CREATOR = new kq0(23);
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int j;
    public final ih3 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final boolean o;
    public final int p;

    public r12(int i, boolean z, int i2, boolean z2, int i3, ih3 ih3Var, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = ih3Var;
        this.l = z3;
        this.m = i4;
        this.o = z4;
        this.n = i5;
        this.p = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j);
        uk2.C(parcel, 6, this.k, i);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.l ? 1 : 0);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.m);
        uk2.T(parcel, 9, 4);
        parcel.writeInt(this.n);
        uk2.T(parcel, 10, 4);
        parcel.writeInt(this.o ? 1 : 0);
        uk2.T(parcel, 11, 4);
        parcel.writeInt(this.p);
        uk2.O(parcel, I);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r12(kg0 kg0Var) {
        boolean z = kg0Var.a;
        int i = kg0Var.b;
        boolean z2 = kg0Var.d;
        int i2 = kg0Var.e;
        l51 l51Var = kg0Var.f;
        this(4, z, i, z2, i2, l51Var != null ? new ih3(l51Var) : null, kg0Var.g, kg0Var.c, 0, false, 0);
    }
}
