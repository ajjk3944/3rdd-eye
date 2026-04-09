package c7;

import android.net.NetworkRequest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {
    public static int[] a(NetworkRequest networkRequest) {
        nk.k.e(networkRequest, "request");
        int[] capabilities = networkRequest.getCapabilities();
        nk.k.d(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public static int[] b(NetworkRequest networkRequest) {
        nk.k.e(networkRequest, "request");
        int[] transportTypes = networkRequest.getTransportTypes();
        nk.k.d(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
