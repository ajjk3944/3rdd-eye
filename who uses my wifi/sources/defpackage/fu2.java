package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fu2 extends sb1 implements zu2 {
    public fu2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 2);
    }

    @Override // defpackage.zu2
    public final void R1(dg4 dg4Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, dg4Var);
        M0(parcelU, 1);
    }

    @Override // defpackage.zu2
    public final boolean c() {
        Parcel parcelY = Y(U(), 2);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
