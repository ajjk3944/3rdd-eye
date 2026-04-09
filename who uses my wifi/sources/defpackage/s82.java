package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s82 extends sb1 implements w82 {
    public s82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 2);
    }

    @Override // defpackage.w82
    public final void D2(u10 u10Var, gd1 gd1Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, gd1Var);
        M0(parcelU, 6);
    }

    @Override // defpackage.w82
    public final void R(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 4);
    }

    @Override // defpackage.w82
    public final void U2(String[] strArr, int[] iArr, u10 u10Var) {
        Parcel parcelU = U();
        parcelU.writeStringArray(strArr);
        parcelU.writeIntArray(iArr);
        iv1.e(parcelU, u10Var);
        M0(parcelU, 5);
    }

    @Override // defpackage.w82
    public final void e() {
        M0(U(), 3);
    }

    @Override // defpackage.w82
    public final void s0(Intent intent) {
        Parcel parcelU = U();
        iv1.c(parcelU, intent);
        M0(parcelU, 1);
    }
}
