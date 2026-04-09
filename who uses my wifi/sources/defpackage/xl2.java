package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xl2 extends sb1 implements nm2 {
    @Override // defpackage.nm2
    public final u62 getAdapterCreator() {
        Parcel parcelY = Y(U(), 2);
        u62 u62VarB3 = s62.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return u62VarB3;
    }

    @Override // defpackage.nm2
    public final w63 getLiteSdkVersion() {
        Parcel parcelY = Y(U(), 1);
        w63 w63Var = (w63) iv1.b(parcelY, w63.CREATOR);
        parcelY.recycle();
        return w63Var;
    }
}
