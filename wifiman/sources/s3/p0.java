package s3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class p0 extends B3.a implements InterfaceC7895j {
    p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // s3.InterfaceC7895j
    public final Account zzb() {
        Parcel parcelB = b(2, c());
        Account account = (Account) B3.d.a(parcelB, Account.CREATOR);
        parcelB.recycle();
        return account;
    }
}
