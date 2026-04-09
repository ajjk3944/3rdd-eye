package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wa2 extends sb1 implements ya2 {
    public wa2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 2);
    }

    @Override // defpackage.ya2
    public final void K1(pc4 pc4Var, fb2 fb2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, fb2Var);
        M0(parcelU, 14);
    }

    @Override // defpackage.ya2
    public final void c1(bb2 bb2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, bb2Var);
        M0(parcelU, 2);
    }

    @Override // defpackage.ya2
    public final tx2 n() {
        Parcel parcelY = Y(U(), 12);
        tx2 tx2VarB3 = rm2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return tx2VarB3;
    }

    @Override // defpackage.ya2
    public final void q2(pc4 pc4Var, fb2 fb2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, fb2Var);
        M0(parcelU, 1);
    }

    @Override // defpackage.ya2
    public final void w2(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 5);
    }
}
