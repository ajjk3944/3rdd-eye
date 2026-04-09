package defpackage;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ tr(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int prefixLength;
        String strH;
        switch (this.f) {
            case 0:
                nc3 nc3Var = (nc3) this.g;
                ou1 ou1Var = (ou1) this.h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.i;
                try {
                    mv mvVarB = a30.b(nc3Var.f);
                    if (mvVarB == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    lv lvVar = (lv) ((qr) mvVarB.b);
                    synchronized (lvVar.i) {
                        lvVar.k = threadPoolExecutor;
                    }
                    ((qr) mvVarB.b).a(new ur(ou1Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    ou1Var.r(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) this.g;
                DhcpInfo dhcpInfo = (DhcpInfo) this.h;
                WifiInfo wifiInfo = (WifiInfo) this.i;
                int[] iArr = MainActivity.d0;
                mainActivity.runOnUiThread(new na0(true, mainActivity, true ? 1 : 0));
                f2 f2Var = mainActivity.C;
                if (f2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                xi xiVar = (xi) f2Var.f;
                mainActivity.R = um.l(dhcpInfo.ipAddress);
                mainActivity.P = um.l(dhcpInfo.gateway);
                ArrayList arrayList = mainActivity.V;
                if (arrayList.isEmpty()) {
                    prefixLength = 24;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            LinkAddress linkAddress = (LinkAddress) obj;
                            String string = linkAddress.getAddress().toString();
                            i30.l(string, "toString(...)");
                            if (sy0.y(string, mainActivity.R, false)) {
                                int prefixLength2 = linkAddress.getPrefixLength();
                                if (prefixLength2 >= 0 && prefixLength2 < 33) {
                                    prefixLength = linkAddress.getPrefixLength();
                                }
                            }
                        }
                    }
                }
                mainActivity.Q = prefixLength;
                xiVar.f.setText(mainActivity.R);
                xiVar.l.setText(mainActivity.P);
                String strL = um.l(dhcpInfo.dns1);
                String strL2 = um.l(dhcpInfo.dns2);
                if (strL.equalsIgnoreCase("0.0.0.0")) {
                    strL = "";
                }
                if (strL2.equalsIgnoreCase("0.0.0.0")) {
                    strL2 = "";
                }
                xiVar.h.setText(strL);
                xiVar.i.setText(strL2);
                xiVar.e.setBackgroundColor(i41.h(mainActivity, R.attr.colorPrimary, -16777216));
                xiVar.d.setImageResource(R.drawable.ic_baseline_router_24);
                if (Build.VERSION.SDK_INT >= 30) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    i30.l(applicationContext, "getApplicationContext(...)");
                    xiVar.n.setText((CharSequence) um.o(applicationContext, wifiInfo).f);
                }
                TextView textView = xiVar.m;
                String ssid = wifiInfo.getSSID();
                i30.l(ssid, "getSSID(...)");
                int frequency = wifiInfo.getFrequency();
                String strH2 = sy0.H(ssid, "\"", "");
                if (strH2.equalsIgnoreCase("<unknown ssid>")) {
                    strH = ex0.h("WiFi (", frequency < 5000 ? "2.4" : "5", "Ghz)");
                } else {
                    strH = strH2 + " (" + (frequency < 5000 ? "2.4" : "5") + "Ghz)";
                }
                textView.setText(strH);
                return;
            default:
                ew0 ew0Var = (ew0) this.g;
                CompletableFuture completableFuture = (CompletableFuture) this.h;
                try {
                    completableFuture.complete(ew0Var.d((me0) this.i));
                    return;
                } catch (IOException e) {
                    completableFuture.completeExceptionally(e);
                    return;
                }
        }
    }
}
