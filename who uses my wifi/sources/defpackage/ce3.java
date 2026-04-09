package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ce3 extends l0 {
    public static final Parcelable.Creator<ce3> CREATOR = new p92(22);
    public final int f;
    public final byte[] g;
    public final int h;

    public ce3(byte[] bArr, int i, int i2) {
        this.f = i;
        this.g = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.A(parcel, 2, this.g);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.O(parcel, I);
    }

    public ce3() {
        this(null, 1, 1);
    }
}
