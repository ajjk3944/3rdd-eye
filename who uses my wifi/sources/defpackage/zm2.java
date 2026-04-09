package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zm2 extends sb1 implements zn2 {
    public zm2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 2);
    }

    @Override // defpackage.zn2
    public final void S2(u10 u10Var, String str) {
        Parcel parcelU = U();
        parcelU.writeString(null);
        iv1.e(parcelU, u10Var);
        M0(parcelU, 6);
    }

    @Override // defpackage.zn2
    public final void b() {
        M0(U(), 1);
    }

    @Override // defpackage.zn2
    public final void b2(ne3 ne3Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, ne3Var);
        M0(parcelU, 14);
    }

    @Override // defpackage.zn2
    public final void i0(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        M0(parcelU, 18);
    }

    @Override // defpackage.zn2
    public final List m() {
        Parcel parcelY = Y(U(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelY.createTypedArrayList(w42.CREATOR);
        parcelY.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.zn2
    public final void x2(u62 u62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u62Var);
        M0(parcelU, 11);
    }

    @Override // defpackage.zn2
    public final void y2(d52 d52Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, d52Var);
        M0(parcelU, 12);
    }
}
