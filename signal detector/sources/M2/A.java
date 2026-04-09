package M2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public final class A extends s {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractC0165e abstractC0165e, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0165e, i, bundle);
        this.f2706h = abstractC0165e;
        this.f2705g = iBinder;
    }

    @Override // M2.s
    public final boolean a() throws RemoteException {
        IBinder iBinder = this.f2705g;
        try {
            u.e(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0165e abstractC0165e = this.f2706h;
            if (!abstractC0165e.u().equals(interfaceDescriptor)) {
                String strU = abstractC0165e.u();
                Log.w("GmsClient", AbstractC1135f5.o(new StringBuilder(strU.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strU, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceO = abstractC0165e.o(iBinder);
            if (iInterfaceO == null || !(abstractC0165e.x(2, 4, iInterfaceO) || abstractC0165e.x(3, 4, iInterfaceO))) {
                return false;
            }
            abstractC0165e.f2751t = null;
            InterfaceC0162b interfaceC0162b = abstractC0165e.f2746o;
            if (interfaceC0162b == null) {
                return true;
            }
            interfaceC0162b.h0();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // M2.s
    public final void b(J2.b bVar) {
        InterfaceC0163c interfaceC0163c = this.f2706h.f2747p;
        if (interfaceC0163c != null) {
            interfaceC0163c.k0(bVar);
        }
        System.currentTimeMillis();
    }
}
