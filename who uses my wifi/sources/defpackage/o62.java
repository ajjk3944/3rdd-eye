package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o62 extends sb1 implements x72 {
    public o62(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 2);
    }

    @Override // defpackage.x72
    public final a62 b() {
        a62 a52Var;
        Parcel parcelY = Y(U(), 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            a52Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            a52Var = iInterfaceQueryLocalInterface instanceof a62 ? (a62) iInterfaceQueryLocalInterface : new a52(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 2);
        }
        parcelY.recycle();
        return a52Var;
    }

    @Override // defpackage.x72
    public final void m1(String str, v22 v22Var, t22 t22Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        iv1.e(parcelU, v22Var);
        iv1.e(parcelU, t22Var);
        M0(parcelU, 5);
    }

    @Override // defpackage.x72
    public final void q1(z22 z22Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, z22Var);
        M0(parcelU, 10);
    }

    @Override // defpackage.x72
    public final void v0(d32 d32Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, d32Var);
        M0(parcelU, 2);
    }

    @Override // defpackage.x72
    public final void w1(r12 r12Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, r12Var);
        M0(parcelU, 6);
    }
}
