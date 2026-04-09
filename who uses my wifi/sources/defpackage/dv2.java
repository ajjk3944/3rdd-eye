package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dv2 extends sb1 implements uv2 {
    public dv2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 2);
    }

    @Override // defpackage.uv2
    public final void z2(String str, u10 u10Var, u10 u10Var2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u10Var2);
        M0(parcelU, 1);
    }
}
