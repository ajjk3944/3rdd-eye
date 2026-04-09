package P4;

import L2.m;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class a implements NsdManager.DiscoveryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3145a;

    public a(m mVar) {
        this.f3145a = mVar;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        q5.i.e(str, "regType");
        Object obj = this.f3145a.f2538c;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        q5.i.e(str, "serviceType");
        Object obj = this.f3145a.f2538c;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        if (nsdServiceInfo == null) {
            return;
        }
        m mVar = this.f3145a;
        ((ConcurrentLinkedQueue) mVar.f2541f).add(nsdServiceInfo);
        m.b(mVar);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        Object obj = this.f3145a.f2538c;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        q5.i.e(str, "serviceType");
        try {
            NsdManager nsdManager = (NsdManager) this.f3145a.f2537b;
            if (nsdManager != null) {
                nsdManager.stopServiceDiscovery(this);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        q5.i.e(str, "serviceType");
        try {
            NsdManager nsdManager = (NsdManager) this.f3145a.f2537b;
            if (nsdManager != null) {
                nsdManager.stopServiceDiscovery(this);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
    }
}
