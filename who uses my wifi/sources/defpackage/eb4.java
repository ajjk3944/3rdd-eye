package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eb4 extends l0 {
    public static final Parcelable.Creator<eb4> CREATOR = new p92(27);
    public Bundle f;
    public ju[] g;
    public int h;
    public sh i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.z(parcel, 1, this.f);
        uk2.G(parcel, 2, this.g, i);
        int i2 = this.h;
        uk2.T(parcel, 3, 4);
        parcel.writeInt(i2);
        uk2.C(parcel, 4, this.i, i);
        uk2.O(parcel, I);
    }
}
