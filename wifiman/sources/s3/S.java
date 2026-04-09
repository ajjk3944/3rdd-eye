package s3;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class S extends B3.c implements T {
    public static T c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinder);
    }
}
