package a3;

import a3.p;
import android.util.Log;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.e f14154b;

    public r(p.e eVar) {
        this.f14154b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f14154b.f14146d;
        p.e eVar = this.f14154b;
        eVar.f14146d = eVar.c();
        if (z10 != this.f14154b.f14146d) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f14154b.f14146d);
            }
            p.e eVar2 = this.f14154b;
            h3.l.f().post(new s(eVar2, eVar2.f14146d));
        }
    }
}
