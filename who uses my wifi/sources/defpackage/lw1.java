package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lw1 extends sb1 implements nw1 {
    @Override // defpackage.nw1
    public final void I(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        M0(parcelU, 2);
    }

    @Override // defpackage.nw1
    public final void W(nx2 nx2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, nx2Var);
        M0(parcelU, 3);
    }

    @Override // defpackage.nw1
    public final void d3(kw1 kw1Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, kw1Var);
        M0(parcelU, 1);
    }
}
