package K3;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.InterfaceC4275d;
import com.google.android.gms.common.api.internal.InterfaceC4282k;
import java.util.List;
import s3.AbstractC7892g;
import s3.C7889d;

/* loaded from: classes.dex */
public final class g extends AbstractC7892g {
    public g(Context context, Looper looper, C7889d c7889d, e.a aVar, e.b bVar) {
        super(context, looper, 185, c7889d, (InterfaceC4275d) aVar, (InterfaceC4282k) bVar);
    }

    private final e n0() {
        try {
            return (e) super.B();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // s3.AbstractC7888c
    protected final String C() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // s3.AbstractC7888c
    protected final String D() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 12600000;
    }

    public final synchronized String j0(G3.e eVar) {
        e eVarN0;
        eVarN0 = n0();
        if (eVarN0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarN0.f(eVar.c());
    }

    public final synchronized String k0(String str) {
        e eVarN0;
        eVarN0 = n0();
        if (eVarN0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarN0.n0(str);
    }

    public final synchronized String l0(String str) {
        e eVarN0;
        eVarN0 = n0();
        if (eVarN0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarN0.o0(str);
    }

    public final synchronized List m0(List list) {
        e eVarN0;
        eVarN0 = n0();
        if (eVarN0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarN0.p0(list);
    }

    @Override // s3.AbstractC7888c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // s3.AbstractC7888c
    protected final boolean r() {
        return true;
    }
}
