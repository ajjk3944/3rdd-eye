package s3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class a0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f61206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61207b;

    public a0(AbstractC7888c abstractC7888c, int i10) {
        this.f61207b = abstractC7888c;
        this.f61206a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC7888c abstractC7888c = this.f61207b;
        if (iBinder == null) {
            AbstractC7888c.b0(abstractC7888c, 16);
            return;
        }
        synchronized (abstractC7888c.f61228n) {
            try {
                AbstractC7888c abstractC7888c2 = this.f61207b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC7888c2.f61229o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7897l)) ? new P(iBinder) : (InterfaceC7897l) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f61207b.c0(0, null, this.f61206a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f61207b.f61228n) {
            this.f61207b.f61229o = null;
        }
        AbstractC7888c abstractC7888c = this.f61207b;
        int i10 = this.f61206a;
        Handler handler = abstractC7888c.f61226l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
