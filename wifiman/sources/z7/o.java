package z7;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.net.NetworkInterface;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class o {
    public static final p a(NetworkInterface networkInterface) {
        AbstractC6492s.i(networkInterface, "<this>");
        o7.o oVar = o7.o.f55558a;
        if (oVar.d().c() < 21) {
            String name = networkInterface.getName();
            AbstractC6492s.h(name, "name");
            if (!kotlin.text.t.P(name, "tun", false, 2, null)) {
                String name2 = networkInterface.getName();
                AbstractC6492s.h(name2, "name");
                if (!kotlin.text.t.P(name2, "tap", false, 2, null)) {
                    String name3 = networkInterface.getName();
                    AbstractC6492s.h(name3, "name");
                    if (kotlin.text.t.P(name3, "wlan", false, 2, null)) {
                        return p.WIFI;
                    }
                }
            }
            return p.VPN;
        }
        ConnectivityManager connectivityManagerB = oVar.c().b();
        Network[] allNetworks = connectivityManagerB.getAllNetworks();
        AbstractC6492s.h(allNetworks, "cm.allNetworks");
        for (Network network : allNetworks) {
            LinkProperties linkProperties = connectivityManagerB.getLinkProperties(network);
            if (linkProperties != null && AbstractC6492s.d(networkInterface.getName(), linkProperties.getInterfaceName())) {
                NetworkCapabilities networkCapabilities = connectivityManagerB.getNetworkCapabilities(network);
                return networkCapabilities == null ? p.UNKNOWN : networkCapabilities.hasTransport(4) ? p.VPN : networkCapabilities.hasTransport(1) ? p.WIFI : networkCapabilities.hasTransport(0) ? p.CELULAR : networkCapabilities.hasTransport(3) ? p.ETHERNET : p.UNKNOWN;
            }
        }
        return p.UNKNOWN;
    }
}
