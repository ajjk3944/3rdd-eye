package k4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
final class r implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f51213a;

    /* synthetic */ r(t tVar, s sVar) {
        this.f51213a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f51213a.f51216b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f51213a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f51213a.f51216b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f51213a.c().post(new q(this));
    }
}
