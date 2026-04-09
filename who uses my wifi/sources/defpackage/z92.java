package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z92 extends sb1 implements da2 {
    public z92(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 2);
    }

    @Override // defpackage.da2
    public final void O2(wu1 wu1Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, wu1Var);
        M0(parcelU, 2);
    }

    @Override // defpackage.da2
    public final void p1(ParcelFileDescriptor parcelFileDescriptor, fa2 fa2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, parcelFileDescriptor);
        iv1.c(parcelU, fa2Var);
        M0(parcelU, 3);
    }

    @Override // defpackage.da2
    public final void v1(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelU = U();
        iv1.c(parcelU, parcelFileDescriptor);
        M0(parcelU, 1);
    }
}
