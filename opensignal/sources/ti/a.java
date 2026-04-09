package ti;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import bk.d;
import br.l;
import ch.n;
import ek.g;
import ek.h;
import java.util.ArrayList;
import java.util.Iterator;
import jj.y;
import of.b;
import xi.q;

/* loaded from: classes.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22873a;

    public a(b bVar) {
        this.f22873a = bVar;
    }

    public final void a(Network network, boolean z10) {
        b bVar = this.f22873a;
        synchronized (((ArrayList) bVar.f19424r)) {
            Iterator it = ((ArrayList) bVar.f19424r).iterator();
            while (it.hasNext()) {
                ((h) it.next()).K(network);
            }
        }
        b bVar2 = this.f22873a;
        synchronized (((ArrayList) bVar2.f19425x)) {
            Iterator it2 = ((ArrayList) bVar2.f19425x).iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                qVar.getClass();
                n.b("NetworkConnectedTrigger", "onNetworkConnectivityChanged() called with: isConnected = " + z10);
                qVar.f25360y.d(d.CONNECTIVITY_STATE_UPDATED);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        l.e(network, "network");
        super.onAvailable(network);
        n.b("PostApi24NetworkCallbackMonitor", "Network available");
        a(network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        l.e(network, "network");
        super.onBlockedStatusChanged(network, z10);
        n.b("PostApi24NetworkCallbackMonitor", "onBlockedStatusChanged() called with: network = " + network + ", blocked = " + z10);
        b bVar = this.f22873a;
        synchronized (((ArrayList) bVar.f19426y)) {
            Iterator it = ((ArrayList) bVar.f19426y).iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                yVar.getClass();
                n.b("NetworkBlockedTriggerDataSource", "onNetworkBlockedChanged() called with: isBlocked = " + z10);
                yVar.f13761y = Boolean.valueOf(z10);
                yVar.a1();
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        l.e(network, "network");
        l.e(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        n.b("PostApi24NetworkCallbackMonitor", "Network capability changed");
        b bVar = this.f22873a;
        synchronized (((ArrayList) bVar.f19423g)) {
            Iterator it = ((ArrayList) bVar.f19423g).iterator();
            while (it.hasNext()) {
                ((g) it.next()).k0(network, networkCapabilities);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        l.e(network, "network");
        super.onLost(network);
        n.b("PostApi24NetworkCallbackMonitor", "Network Lost");
        a(network, false);
    }
}
