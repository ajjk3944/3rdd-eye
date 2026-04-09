package V2;

import M2.AbstractC0168h;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b extends AbstractC0168h {
    @Override // M2.AbstractC0165e, K2.c
    public final int j() {
        return 212800000;
    }

    @Override // M2.AbstractC0165e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // M2.AbstractC0165e
    public final J2.d[] q() {
        return G2.d.f1518b;
    }

    @Override // M2.AbstractC0165e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // M2.AbstractC0165e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // M2.AbstractC0165e
    public final boolean w() {
        return true;
    }
}
