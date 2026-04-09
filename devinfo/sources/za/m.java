package za;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38164a;

    public /* synthetic */ m(int i4) {
        this.f38164a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f38164a) {
            case 0:
                int iT = com.bumptech.glide.e.T(parcel);
                int iN = 0;
                int iN2 = 0;
                boolean zL = false;
                boolean zL2 = false;
                String strW = null;
                while (parcel.dataPosition() < iT) {
                    int i4 = parcel.readInt();
                    char c9 = (char) i4;
                    if (c9 == 2) {
                        strW = com.bumptech.glide.e.w(parcel, i4);
                    } else if (c9 == 3) {
                        iN = com.bumptech.glide.e.N(parcel, i4);
                    } else if (c9 == 4) {
                        iN2 = com.bumptech.glide.e.N(parcel, i4);
                    } else if (c9 == 5) {
                        zL = com.bumptech.glide.e.L(parcel, i4);
                    } else if (c9 != 6) {
                        com.bumptech.glide.e.S(parcel, i4);
                    } else {
                        zL2 = com.bumptech.glide.e.L(parcel, i4);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new a(strW, iN, iN2, zL, zL2);
            default:
                nk.k.e(parcel, "parcel");
                return new zh.b(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f38164a) {
            case 0:
                return new a[i4];
            default:
                return new zh.b[i4];
        }
    }
}
