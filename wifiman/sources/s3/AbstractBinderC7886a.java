package s3;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import s3.InterfaceC7895j;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7886a extends InterfaceC7895j.a {
    public static Account f(InterfaceC7895j interfaceC7895j) {
        Account accountZzb = null;
        if (interfaceC7895j != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountZzb = interfaceC7895j.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountZzb;
    }
}
