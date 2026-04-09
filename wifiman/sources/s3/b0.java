package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import r3.C7564b;

/* loaded from: classes.dex */
public final class b0 extends M {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f61208g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61209h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC7888c abstractC7888c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC7888c, i10, bundle);
        this.f61209h = abstractC7888c;
        this.f61208g = iBinder;
    }

    @Override // s3.M
    protected final void f(C7564b c7564b) {
        if (this.f61209h.f61236v != null) {
            this.f61209h.f61236v.b(c7564b);
        }
        this.f61209h.J(c7564b);
    }

    @Override // s3.M
    protected final boolean g() throws RemoteException {
        try {
            IBinder iBinder = this.f61208g;
            AbstractC7901p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f61209h.C().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f61209h.C() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceQ = this.f61209h.q(this.f61208g);
            if (iInterfaceQ == null || !(AbstractC7888c.e0(this.f61209h, 2, 4, iInterfaceQ) || AbstractC7888c.e0(this.f61209h, 3, 4, iInterfaceQ))) {
                return false;
            }
            this.f61209h.f61240z = null;
            AbstractC7888c abstractC7888c = this.f61209h;
            Bundle bundleV = abstractC7888c.v();
            if (abstractC7888c.f61235u == null) {
                return true;
            }
            this.f61209h.f61235u.f(bundleV);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
