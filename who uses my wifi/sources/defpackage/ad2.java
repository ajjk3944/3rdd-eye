package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ad2 extends l0 {
    public static final Parcelable.Creator<ad2> CREATOR = new p92(10);
    public final String f;
    public final String g;
    public final xe4 h;
    public final pc4 i;
    public final int j;
    public final String k;

    public ad2(String str, String str2, xe4 xe4Var, pc4 pc4Var, int i, String str3) {
        this.f = str;
        this.g = str2;
        this.h = xe4Var;
        this.i = pc4Var;
        this.j = i;
        this.k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.D(parcel, 2, this.g);
        uk2.C(parcel, 3, this.h, i);
        uk2.C(parcel, 4, this.i, i);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j);
        uk2.D(parcel, 6, this.k);
        uk2.O(parcel, I);
    }
}
