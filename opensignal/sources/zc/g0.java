package zc;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class g0 extends cc.e {
    @Override // cc.e, ac.c
    public final int a() {
        return 12451000;
    }

    @Override // cc.e
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinder);
    }

    @Override // cc.e
    public final String n() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // cc.e
    public final String o() {
        return "com.google.android.gms.measurement.START";
    }
}
