package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m63 extends ad1 {
    public final IBinder g;
    public final /* synthetic */ w9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(w9 w9Var, int i, IBinder iBinder, Bundle bundle) {
        super(w9Var, i, bundle);
        this.h = w9Var;
        this.g = iBinder;
    }

    @Override // defpackage.ad1
    public final void a(rh rhVar) {
        u9 u9Var = this.h.p;
        if (u9Var != null) {
            u9Var.U(rhVar);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.ad1
    public final boolean b() throws RemoteException {
        IInterface iInterfaceO;
        IBinder iBinder = this.g;
        try {
            ou1.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            w9 w9Var = this.h;
            if (!w9Var.u().equals(interfaceDescriptor) || (iInterfaceO = w9Var.o(iBinder)) == null) {
                return false;
            }
            if (!w9.x(w9Var, 2, 4, iInterfaceO) && !w9.x(w9Var, 3, 4, iInterfaceO)) {
                return false;
            }
            w9Var.t = null;
            t9 t9Var = w9Var.o;
            if (t9Var == null) {
                return true;
            }
            t9Var.Y();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
