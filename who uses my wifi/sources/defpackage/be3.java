package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class be3 extends l0 {
    public static final Parcelable.Creator<be3> CREATOR = new p92(21);
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;

    public be3(int i, int i2, int i3, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        uk2.D(parcel, 3, this.h);
        uk2.D(parcel, 4, this.i);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j);
        uk2.O(parcel, I);
    }
}
