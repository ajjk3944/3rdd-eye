package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class re0 extends l0 {
    public static final Parcelable.Creator<re0> CREATOR = new kq0(10);
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;

    public re0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = j2;
        this.k = str;
        this.l = str2;
        this.m = i4;
        this.n = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.T(parcel, 4, 8);
        parcel.writeLong(this.i);
        uk2.T(parcel, 5, 8);
        parcel.writeLong(this.j);
        uk2.D(parcel, 6, this.k);
        uk2.D(parcel, 7, this.l);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.m);
        uk2.T(parcel, 9, 4);
        parcel.writeInt(this.n);
        uk2.O(parcel, I);
    }
}
