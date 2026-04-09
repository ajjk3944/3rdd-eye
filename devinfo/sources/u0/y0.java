package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35024a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f35024a) {
            case 0:
                return new z0(parcel.readFloat());
            case 1:
                return new a1(parcel.readInt());
            default:
                return new b1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f35024a) {
            case 0:
                return new z0[i4];
            case 1:
                return new a1[i4];
            default:
                return new b1[i4];
        }
    }
}
