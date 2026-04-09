package z6;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37967a;

    static {
        String strG = v.g("NetworkStateTracker");
        nk.k.d(strG, "tagWithPrefix(...)");
        f37967a = strG;
    }

    public static final x6.e a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        String str = f37967a;
        nk.k.e(connectivityManager, "<this>");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e2) {
                v.e().d(str, "Unable to validate active network", e2);
            }
            boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            return new x6.e(z3, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException e10) {
            v.e().d(str, "Unable to get active network state", e10);
            return new x6.e(false, false, false, true);
        }
    }
}
