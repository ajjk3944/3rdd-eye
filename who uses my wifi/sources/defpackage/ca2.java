package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ca2 extends hv1 implements da2 {
    public ca2() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iv1.b(parcel, ParcelFileDescriptor.CREATOR);
            iv1.f(parcel);
            v1(parcelFileDescriptor);
        } else if (i == 2) {
            wu1 wu1Var = (wu1) iv1.b(parcel, wu1.CREATOR);
            iv1.f(parcel);
            O2(wu1Var);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) iv1.b(parcel, ParcelFileDescriptor.CREATOR);
            fa2 fa2Var = (fa2) iv1.b(parcel, fa2.CREATOR);
            iv1.f(parcel);
            p1(parcelFileDescriptor2, fa2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
