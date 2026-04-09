package c2;

import android.net.ConnectivityManager;

/* compiled from: NetworkApi24.kt */
/* loaded from: classes.dex */
public final class n {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.l.f(connectivityManager, "<this>");
        kotlin.jvm.internal.l.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
