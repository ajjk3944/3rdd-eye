package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r42 extends l0 {
    public static final Parcelable.Creator<r42> CREATOR = new kq0(25);
    public final boolean f;
    public final String g;
    public final int h;
    public final byte[] i;
    public final String[] j;
    public final String[] k;
    public final boolean l;
    public final long m;

    public r42(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f = z;
        this.g = str;
        this.h = i;
        this.i = bArr;
        this.j = strArr;
        this.k = strArr2;
        this.l = z2;
        this.m = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uk2.D(parcel, 2, this.g);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.A(parcel, 4, this.i);
        uk2.E(parcel, 5, this.j);
        uk2.E(parcel, 6, this.k);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.l ? 1 : 0);
        uk2.T(parcel, 8, 8);
        parcel.writeLong(this.m);
        uk2.O(parcel, I);
    }
}
