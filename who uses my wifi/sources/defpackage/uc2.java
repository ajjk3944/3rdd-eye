package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uc2 extends sb1 implements wc2 {
    public uc2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 2);
    }

    @Override // defpackage.wc2
    public final void e2(u10 u10Var, ad2 ad2Var, tc2 tc2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, ad2Var);
        iv1.e(parcelU, tc2Var);
        M0(parcelU, 1);
    }
}
