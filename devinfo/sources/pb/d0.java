package pb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f31564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f31565b;

    public d0(e eVar, int i4) {
        this.f31565b = eVar;
        this.f31564a = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar = this.f31565b;
        if (iBinder == null) {
            eVar.y();
            return;
        }
        synchronized (eVar.f31573h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.f31574i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new u(iBinder) : (u) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar2 = this.f31565b;
        int i4 = this.f31564a;
        eVar2.getClass();
        f0 f0Var = new f0(eVar2, 0, null);
        b0 b0Var = eVar2.f31572f;
        b0Var.sendMessage(b0Var.obtainMessage(7, i4, -1, f0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f31565b;
        synchronized (eVar.f31573h) {
            eVar.f31574i = null;
        }
        e eVar2 = this.f31565b;
        int i4 = this.f31564a;
        b0 b0Var = eVar2.f31572f;
        b0Var.sendMessage(b0Var.obtainMessage(6, i4, 1));
    }
}
