package x6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import c0.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import nk.k;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final g f36984a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f36985b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f36986c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f36987d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f36988e;

    public static p a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, b7.b bVar) {
        NetworkCapabilities networkCapabilities;
        synchronized (f36985b) {
            try {
                LinkedHashMap linkedHashMap = f36986c;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(bVar, networkRequest);
                if (zIsEmpty) {
                    v.e().a(i.f36992a, "NetworkRequestConstraintController register shared callback");
                    connectivityManager.registerDefaultNetworkCallback(f36984a);
                }
                v.e().a(i.f36992a, "NetworkRequestConstraintController send initial capabilities");
                f36984a.getClass();
                if (f36988e) {
                    networkCapabilities = f36987d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    f36987d = networkCapabilities;
                    f36988e = true;
                }
                bVar.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? a.f36977a : new b(7));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new p(12, bVar, connectivityManager);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        k.e(network, "network");
        k.e(networkCapabilities, "networkCapabilities");
        v.e().a(i.f36992a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f36985b) {
            try {
                f36987d = networkCapabilities;
                for (Map.Entry entry : f36986c.entrySet()) {
                    ((mk.c) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? a.f36977a : new b(7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        k.e(network, "network");
        v.e().a(i.f36992a, "NetworkRequestConstraintController onLost callback");
        synchronized (f36985b) {
            f36987d = null;
            Iterator it = f36986c.keySet().iterator();
            while (it.hasNext()) {
                ((mk.c) it.next()).invoke(new b(7));
            }
        }
    }
}
