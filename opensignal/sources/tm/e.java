package tm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import bf.n;
import br.l;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.o;
import java.util.Iterator;
import java.util.List;
import mq.w;
import tt.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22894a;

    /* renamed from: b, reason: collision with root package name */
    public final qm.f f22895b;

    /* renamed from: c, reason: collision with root package name */
    public final o f22896c;

    /* renamed from: d, reason: collision with root package name */
    public final k f22897d;

    /* renamed from: e, reason: collision with root package name */
    public final WifiManager f22898e;

    public e(Context context, qm.f fVar, o oVar, k kVar) {
        l.e(context, "context");
        l.e(fVar, "permissionsManager");
        l.e(oVar, "networkTypeUtils");
        l.e(kVar, "networkOperatorInfo");
        this.f22894a = context;
        this.f22895b = fVar;
        this.f22896c = oVar;
        this.f22897d = kVar;
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        this.f22898e = systemService instanceof WifiManager ? (WifiManager) systemService : null;
    }

    public final NetworkInfo a() {
        this.f22895b.getClass();
        Context context = this.f22894a;
        if (!qm.f.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        Object systemService = context.getSystemService("connectivity");
        l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetworkInfo();
    }

    public final c b(TelephonyManager telephonyManager) {
        um.a aVar;
        String strW;
        c cVar = new c();
        NetworkInfo networkInfoA = a();
        if (networkInfoA == null) {
            aVar = um.a.NONE;
        } else {
            int type = networkInfoA.getType();
            aVar = type != 0 ? type != 1 ? um.a.NONE : um.a.WIFI : um.a.MOBILE;
        }
        l.e(aVar, "<set-?>");
        cVar.f22890a = aVar;
        int i10 = d.f22893a[aVar.ordinal()];
        Context context = this.f22894a;
        String strL0 = "";
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return cVar;
                }
                throw new n();
            }
            if (telephonyManager != null && (strW = dr.a.w(telephonyManager, this.f22897d)) != null) {
                strL0 = strW;
            }
            cVar.f22891d = strL0;
            String strD = this.f22896c.d(context);
            l.e(strD, "<set-?>");
            cVar.f22892g = strD;
            return cVar;
        }
        WifiManager wifiManager = this.f22898e;
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            this.f22895b.getClass();
            List<WifiConfiguration> configuredNetworks = qm.f.c(context, "android.permission.ACCESS_FINE_LOCATION") ? wifiManager.getConfiguredNetworks() : w.f16945a;
            l.b(configuredNetworks);
            Iterator<T> it = configuredNetworks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration wifiConfiguration = (WifiConfiguration) it.next();
                if (connectionInfo != null && wifiConfiguration.networkId == connectionInfo.getNetworkId()) {
                    String str = wifiConfiguration.SSID;
                    l.d(str, "SSID");
                    strL0 = s.l0(str, "\"", "");
                    break;
                }
            }
        }
        cVar.f22891d = strL0;
        return cVar;
    }
}
