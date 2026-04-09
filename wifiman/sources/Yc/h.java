package Yc;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class h extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ConnectivityManager connectivityManager) {
        super("WiFi", new NetworkRequest.Builder().addTransportType(1).build(), connectivityManager);
        AbstractC6492s.i(connectivityManager, "connectivityManager");
    }
}
