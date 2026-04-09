package m8;

import android.content.IntentFilter;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f28974b;

    public /* synthetic */ q(r rVar, int i4) {
        this.f28973a = i4;
        this.f28974b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28973a) {
            case 0:
                r rVar = this.f28974b;
                rVar.f28978d = rVar.c();
                try {
                    r rVar2 = this.f28974b;
                    rVar2.f28975a.registerReceiver(rVar2.f28980f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f28974b.f28979e = true;
                    break;
                } catch (SecurityException e2) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e2);
                    }
                    this.f28974b.f28979e = false;
                    return;
                }
            case 1:
                if (this.f28974b.f28979e) {
                    this.f28974b.f28979e = false;
                    r rVar3 = this.f28974b;
                    rVar3.f28975a.unregisterReceiver(rVar3.f28980f);
                    break;
                }
                break;
            default:
                boolean z3 = this.f28974b.f28978d;
                r rVar4 = this.f28974b;
                rVar4.f28978d = rVar4.c();
                if (z3 != this.f28974b.f28978d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f28974b.f28978d);
                    }
                    r rVar5 = this.f28974b;
                    t8.m.f().post(new bi.a(7, rVar5, rVar5.f28978d));
                    break;
                }
                break;
        }
    }
}
