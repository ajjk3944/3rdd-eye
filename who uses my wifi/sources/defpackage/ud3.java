package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ud3 extends l0 {
    public static final Parcelable.Creator<ud3> CREATOR = new p92(18);
    public final int f;
    public final byte[] g;

    public ud3(int i, byte[] bArr) {
        this.f = i;
        this.g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.A(parcel, 2, this.g);
        uk2.O(parcel, I);
    }
}
