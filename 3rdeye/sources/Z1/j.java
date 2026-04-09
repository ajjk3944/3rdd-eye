package Z1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class j extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14001a;

    public j(k kVar) {
        this.f14001a = kVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        kotlin.jvm.internal.l.f(network, "network");
        kotlin.jvm.internal.l.f(capabilities, "capabilities");
        androidx.work.m.e().a(l.f14004a, "Network capabilities changed: " + capabilities);
        k kVar = this.f14001a;
        kVar.b(l.a(kVar.f14002f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.l.f(network, "network");
        androidx.work.m.e().a(l.f14004a, "Network connection lost");
        k kVar = this.f14001a;
        kVar.b(l.a(kVar.f14002f));
    }
}
