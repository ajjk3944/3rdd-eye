package s3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: s3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7895j extends IInterface {

    /* renamed from: s3.j$a */
    public static abstract class a extends B3.c implements InterfaceC7895j {
        public static InterfaceC7895j c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC7895j ? (InterfaceC7895j) iInterfaceQueryLocalInterface : new p0(iBinder);
        }
    }

    Account zzb();
}
