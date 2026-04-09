package M2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2826b;

    public z(AbstractC0165e abstractC0165e, int i) {
        this.f2826b = abstractC0165e;
        this.f2825a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0165e abstractC0165e = this.f2826b;
        if (iBinder == null) {
            abstractC0165e.y();
            return;
        }
        synchronized (abstractC0165e.f2740h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0165e.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) ? new t(iBinder) : (t) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0165e abstractC0165e2 = this.f2826b;
        int i = this.f2825a;
        abstractC0165e2.getClass();
        B b5 = new B(abstractC0165e2, 0, null);
        x xVar = abstractC0165e2.f2738f;
        xVar.sendMessage(xVar.obtainMessage(7, i, -1, b5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0165e abstractC0165e = this.f2826b;
        synchronized (abstractC0165e.f2740h) {
            abstractC0165e.i = null;
        }
        AbstractC0165e abstractC0165e2 = this.f2826b;
        int i = this.f2825a;
        x xVar = abstractC0165e2.f2738f;
        xVar.sendMessage(xVar.obtainMessage(6, i, 1));
    }
}
