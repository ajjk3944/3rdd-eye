package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kd3 extends hv1 implements zu2 {
    public kd3() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zu2 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zu2 ? (zu2) iInterfaceQueryLocalInterface : new fu2(iBinder);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            iv1.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = iv1.a;
        parcel2.writeInt(1);
        return true;
    }

    @Override // defpackage.zu2
    public final boolean c() {
        return true;
    }

    @Override // defpackage.zu2
    public final void R1(dg4 dg4Var) {
    }
}
