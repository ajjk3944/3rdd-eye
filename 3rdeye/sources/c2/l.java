package c2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkApi21.kt */
/* loaded from: classes.dex */
public final class l {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        kotlin.jvm.internal.l.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i) {
        kotlin.jvm.internal.l.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.l.f(connectivityManager, "<this>");
        kotlin.jvm.internal.l.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
