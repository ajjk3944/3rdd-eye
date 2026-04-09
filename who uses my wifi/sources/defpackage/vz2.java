package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vz2 extends l0 {
    public static final Parcelable.Creator<vz2> CREATOR = new p92(13);
    public final int f;

    public vz2(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.f);
        uk2.O(parcel, I);
    }
}
