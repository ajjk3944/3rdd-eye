package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tq0 extends l0 {
    public static final Parcelable.Creator<tq0> CREATOR = new kq0(14);
    public final int f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;

    public tq0(int i, int i2, int i3, boolean z, boolean z2) {
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = i2;
        this.j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.i);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j);
        uk2.O(parcel, I);
    }
}
