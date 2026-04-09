package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sc1 extends l0 {
    public static final Parcelable.Creator<sc1> CREATOR = new kq0(9);
    public final int f;
    public final rh g;
    public final yc1 h;

    public sc1(int i, rh rhVar, yc1 yc1Var) {
        this.f = i;
        this.g = rhVar;
        this.h = yc1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.C(parcel, 2, this.g, i);
        uk2.C(parcel, 3, this.h, i);
        uk2.O(parcel, I);
    }
}
