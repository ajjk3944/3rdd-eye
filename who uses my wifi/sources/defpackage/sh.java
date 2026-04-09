package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sh extends l0 {
    public static final Parcelable.Creator<sh> CREATOR = new p92(28);
    public final tq0 f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int[] k;

    public sh(tq0 tq0Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f = tq0Var;
        this.g = z;
        this.h = z2;
        this.i = iArr;
        this.j = i;
        this.k = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.C(parcel, 1, this.f, i);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        int[] iArr = this.i;
        if (iArr != null) {
            int I2 = uk2.I(parcel, 4);
            parcel.writeIntArray(iArr);
            uk2.O(parcel, I2);
        }
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j);
        int[] iArr2 = this.k;
        if (iArr2 != null) {
            int I3 = uk2.I(parcel, 6);
            parcel.writeIntArray(iArr2);
            uk2.O(parcel, I3);
        }
        uk2.O(parcel, I);
    }
}
