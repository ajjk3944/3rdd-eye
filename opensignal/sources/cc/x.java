package cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f3678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3679b;

    public x(e eVar, int i10) {
        this.f3679b = eVar;
        this.f3678a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        e eVar = this.f3679b;
        if (iBinder == null) {
            synchronized (eVar.f3621g) {
                i10 = eVar.f3626n;
            }
            if (i10 == 3) {
                eVar.f3634v = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            v vVar = eVar.f3620f;
            vVar.sendMessage(vVar.obtainMessage(i11, eVar.f3636x.get(), 16));
            return;
        }
        synchronized (eVar.f3622h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.f3623i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new o(iBinder) : (o) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar2 = this.f3679b;
        int i12 = this.f3678a;
        eVar2.getClass();
        z zVar = new z(eVar2, 0, null);
        v vVar2 = eVar2.f3620f;
        vVar2.sendMessage(vVar2.obtainMessage(7, i12, -1, zVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f3679b;
        synchronized (eVar.f3622h) {
            eVar.f3623i = null;
        }
        e eVar2 = this.f3679b;
        int i10 = this.f3678a;
        v vVar = eVar2.f3620f;
        vVar.sendMessage(vVar.obtainMessage(6, i10, 1));
    }
}
