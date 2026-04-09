package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zb4 extends l0 {
    public static final Parcelable.Creator<zb4> CREATOR = new p92(29);
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final float j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public zb4(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = z3;
        this.j = f;
        this.k = i;
        this.l = z4;
        this.m = z5;
        this.n = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.D(parcel, 4, this.h);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.T(parcel, 6, 4);
        parcel.writeFloat(this.j);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.k);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        uk2.T(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        uk2.T(parcel, 10, 4);
        parcel.writeInt(this.n ? 1 : 0);
        uk2.O(parcel, I);
    }

    public zb4(boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
