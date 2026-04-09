package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d22 extends sb1 implements f22 {
    public d22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 2);
    }

    @Override // defpackage.f22
    public final void E0(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 7);
    }

    @Override // defpackage.f22
    public final void L0(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 3);
    }

    @Override // defpackage.f22
    public final void M(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 6);
    }

    @Override // defpackage.f22
    public final u10 P(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        return ga1.j(Y(parcelU, 2));
    }

    @Override // defpackage.f22
    public final void T2(z12 z12Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, z12Var);
        M0(parcelU, 8);
    }

    @Override // defpackage.f22
    public final void V0(u10 u10Var, String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        iv1.e(parcelU, u10Var);
        M0(parcelU, 1);
    }

    @Override // defpackage.f22
    public final void d0(u10 u10Var, int i) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeInt(i);
        M0(parcelU, 5);
    }

    @Override // defpackage.f22
    public final void z1(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 9);
    }
}
