package A1;

import android.content.IntentFilter;
import android.util.Log;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f129b;

    public /* synthetic */ u(v vVar, int i) {
        this.f128a = i;
        this.f129b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f128a) {
            case 0:
                v vVar = this.f129b;
                vVar.f134d = vVar.c();
                try {
                    v vVar2 = this.f129b;
                    vVar2.f131a.registerReceiver(vVar2.f136f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f129b.f135e = true;
                    break;
                } catch (SecurityException e6) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e6);
                    }
                    this.f129b.f135e = false;
                    return;
                }
            case 1:
                if (this.f129b.f135e) {
                    this.f129b.f135e = false;
                    v vVar3 = this.f129b;
                    vVar3.f131a.unregisterReceiver(vVar3.f136f);
                    break;
                }
                break;
            default:
                boolean z6 = this.f129b.f134d;
                v vVar4 = this.f129b;
                vVar4.f134d = vVar4.c();
                if (z6 != this.f129b.f134d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f129b.f134d);
                    }
                    v vVar5 = this.f129b;
                    H1.p.f().post(new q(vVar5, vVar5.f134d, 1));
                    break;
                }
                break;
        }
    }
}
