package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a82 extends sb1 implements b82 {
    public a82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback", 2);
    }

    @Override // defpackage.b82
    public final void a(nx2 nx2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, nx2Var);
        M0(parcelU, 4);
    }
}
