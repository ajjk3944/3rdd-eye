package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a42 extends sb1 implements y42 {
    @Override // defpackage.y42
    public final boolean zze(u10 u10Var, String str, String str2) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        Parcel parcelY = Y(parcelU, 1);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.y42
    public final void zzf(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 2);
    }

    @Override // defpackage.y42
    public final boolean zzg(u10 u10Var, gd1 gd1Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, gd1Var);
        Parcel parcelY = Y(parcelU, 3);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
