package Z1;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14004a;

    static {
        String strG = androidx.work.m.g("NetworkStateTracker");
        kotlin.jvm.internal.l.e(strG, "tagWithPrefix(\"NetworkStateTracker\")");
        f14004a = strG;
    }

    public static final X1.c a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        kotlin.jvm.internal.l.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = c2.l.a(connectivityManager, c2.m.a(connectivityManager));
        } catch (SecurityException e4) {
            androidx.work.m.e().d(f14004a, "Unable to validate active network", e4);
        }
        boolean zB = networkCapabilitiesA != null ? c2.l.b(networkCapabilitiesA, 16) : false;
        return new X1.c(z10, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
