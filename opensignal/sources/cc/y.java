package cc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class y extends n {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f3680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f3681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e eVar, int i10, IBinder iBinder, Bundle bundle) {
        super(eVar, i10, bundle);
        this.f3681h = eVar;
        this.f3680g = iBinder;
    }

    @Override // cc.n
    public final boolean a() throws RemoteException {
        IBinder iBinder = this.f3680g;
        try {
            s.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f3681h;
            if (!eVar.n().equals(interfaceDescriptor)) {
                String strN = eVar.n();
                StringBuilder sb2 = new StringBuilder(strN.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(strN);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                io.sentry.android.core.e0.p("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceD = eVar.d(iBinder);
            if (iInterfaceD == null || !(eVar.t(2, 4, iInterfaceD) || eVar.t(3, 4, iInterfaceD))) {
                return false;
            }
            eVar.f3633u = null;
            b bVar = eVar.f3627o;
            if (bVar == null) {
                return true;
            }
            bVar.e();
            return true;
        } catch (RemoteException unused) {
            io.sentry.android.core.e0.p("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // cc.n
    public final void b(ConnectionResult connectionResult) {
        c cVar = this.f3681h.f3628p;
        if (cVar != null) {
            cVar.f(connectionResult);
        }
        System.currentTimeMillis();
    }
}
