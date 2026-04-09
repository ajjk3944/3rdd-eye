package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f52 extends l0 {
    public static final Parcelable.Creator<f52> CREATOR = new kq0(28);
    public final int f;
    public final int g;
    public final String h;
    public final int i;

    public f52(int i, int i2, int i3, String str) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.g);
        uk2.D(parcel, 2, this.h);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.i);
        uk2.T(parcel, 1000, 4);
        parcel.writeInt(this.f);
        uk2.O(parcel, I);
    }
}
