package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t62 extends sb1 implements u62 {
    @Override // defpackage.u62
    public final d82 G(String str) {
        d82 c82Var;
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 3);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = h82.g;
        if (strongBinder == null) {
            c82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c82Var = iInterfaceQueryLocalInterface instanceof d82 ? (d82) iInterfaceQueryLocalInterface : new c82(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 2);
        }
        parcelY.recycle();
        return c82Var;
    }

    @Override // defpackage.u62
    public final boolean J(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 4);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.u62
    public final boolean P(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 2);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.u62
    public final w62 w(String str) {
        w62 v62Var;
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v62Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            v62Var = iInterfaceQueryLocalInterface instanceof w62 ? (w62) iInterfaceQueryLocalInterface : new v62(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 2);
        }
        parcelY.recycle();
        return v62Var;
    }
}
