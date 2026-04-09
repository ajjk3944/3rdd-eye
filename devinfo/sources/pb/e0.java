package pb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 extends t {
    public final IBinder g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f31588h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e eVar, int i4, IBinder iBinder, Bundle bundle) {
        super(eVar, i4, bundle);
        this.f31588h = eVar;
        this.g = iBinder;
    }

    @Override // pb.t
    public final boolean a() throws RemoteException {
        IBinder iBinder = this.g;
        try {
            y.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f31588h;
            if (!eVar.u().equals(interfaceDescriptor)) {
                String strU = eVar.u();
                Log.w("GmsClient", a0.g.p(new StringBuilder(strU.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strU, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceO = eVar.o(iBinder);
            if (iInterfaceO == null || !(eVar.x(2, 4, iInterfaceO) || eVar.x(3, 4, iInterfaceO))) {
                return false;
            }
            eVar.f31584t = null;
            b bVar = eVar.f31579o;
            if (bVar == null) {
                return true;
            }
            bVar.T();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // pb.t
    public final void b(nb.b bVar) {
        c cVar = this.f31588h.f31580p;
        if (cVar != null) {
            cVar.O(bVar);
        }
        System.currentTimeMillis();
    }
}
