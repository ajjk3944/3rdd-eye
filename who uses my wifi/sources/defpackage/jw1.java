package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jw1 extends sb1 implements kw1 {
    @Override // defpackage.kw1
    public final void H1(u10 u10Var, pw1 pw1Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, pw1Var);
        M0(parcelU, 4);
    }

    @Override // defpackage.kw1
    public final tx2 e() {
        Parcel parcelY = Y(U(), 5);
        tx2 tx2VarB3 = rm2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return tx2VarB3;
    }
}
