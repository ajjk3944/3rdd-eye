package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class he3 {
    public final je3 a;
    public final boolean b = true;

    public he3(je3 je3Var) {
        this.a = je3Var;
    }

    public static he3 a(Context context, String str) throws td3 {
        je3 ie3Var;
        try {
            try {
                try {
                    IBinder iBinderB = ar.c(context, ar.b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        ie3Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        ie3Var = iInterfaceQueryLocalInterface instanceof je3 ? (je3) iInterfaceQueryLocalInterface : new ie3(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 2);
                    }
                    ie3Var.J1(new oi0(context), str);
                    return new he3(ie3Var);
                } catch (Exception e) {
                    throw new td3(e);
                }
            } catch (RemoteException | NullPointerException | SecurityException | td3 unused) {
                return new he3(new ke3());
            }
        } catch (Exception e2) {
            throw new td3(e2);
        }
    }
}
