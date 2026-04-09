package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o22 extends sb1 implements p22 {
    public o22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 2);
    }

    @Override // defpackage.p22
    public final boolean D(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        Parcel parcelY = Y(parcelU, 10);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.p22
    public final u10 R0() {
        return ga1.j(Y(U(), 9));
    }

    @Override // defpackage.p22
    public final String f() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }
}
