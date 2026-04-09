package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qx2 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ w9 b;

    public qx2(w9 w9Var, int i) {
        this.b = w9Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        w9 w9Var = this.b;
        if (iBinder == null) {
            synchronized (w9Var.g) {
                i = w9Var.n;
            }
            if (i == 3) {
                w9Var.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            mu1 mu1Var = w9Var.f;
            mu1Var.sendMessage(mu1Var.obtainMessage(i2, w9Var.w.get(), 16));
            return;
        }
        synchronized (w9Var.h) {
            try {
                w9 w9Var2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                w9Var2.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof if1)) ? new if1(iBinder) : (if1) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        w9 w9Var3 = this.b;
        int i3 = this.a;
        eh3 eh3Var = new eh3(w9Var3, 0);
        mu1 mu1Var2 = w9Var3.f;
        mu1Var2.sendMessage(mu1Var2.obtainMessage(7, i3, -1, eh3Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w9 w9Var;
        synchronized (this.b.h) {
            w9Var = this.b;
            w9Var.i = null;
        }
        int i = this.a;
        mu1 mu1Var = w9Var.f;
        mu1Var.sendMessage(mu1Var.obtainMessage(6, i, 1));
    }
}
