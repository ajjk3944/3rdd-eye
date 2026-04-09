package defpackage;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ea0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity g;

    public /* synthetic */ ea0(MainActivity mainActivity, int i) {
        this.f = i;
        this.g = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        int i = this.f;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                int[] iArr = MainActivity.d0;
                ArrayList arrayList = new ArrayList();
                WifiManager wifiManager = mainActivity.G;
                if (wifiManager == null) {
                    i30.S("wifiManager");
                    throw null;
                }
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                f2 f2Var = mainActivity.C;
                if (f2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                xi xiVar = (xi) f2Var.f;
                TextView textView = xiVar.j;
                String string3 = mainActivity.getString(R.string.txt_connected);
                i30.l(string3, "getString(...)");
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    string = xiVar.m.getText().toString();
                    String string4 = mainActivity.getString(R.string.txt_ip_public);
                    i30.l(string4, "getString(...)");
                    arrayList.add(new k81(R.drawable.ic_frag_outline_public_24, string4, textView.getText().toString()));
                    String string5 = mainActivity.getString(R.string.txt_ip);
                    i30.l(string5, "getString(...)");
                    arrayList.add(new k81(R.drawable.ic_frag_ip_24, string5, xiVar.f.getText().toString()));
                    WifiManager wifiManager2 = mainActivity.G;
                    if (wifiManager2 == null) {
                        i30.S("wifiManager");
                        throw null;
                    }
                    DhcpInfo dhcpInfo = wifiManager2.getDhcpInfo();
                    String strL = um.l(dhcpInfo.dns1);
                    String strL2 = um.l(dhcpInfo.dns2);
                    String string6 = mainActivity.getString(R.string.txt_dns_1_2);
                    i30.l(string6, "getString(...)");
                    arrayList.add(new k81(R.drawable.ic_frag_outline_dns_24, string6, strL + "\n" + strL2));
                    arrayList.add(new k81(R.drawable.ic_frag_outline_router_24, xiVar.k.getText().toString(), xiVar.l.getText().toString()));
                    if (Build.VERSION.SDK_INT >= 30) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        i30.l(applicationContext, "getApplicationContext(...)");
                        f31 f31VarO = um.o(applicationContext, connectionInfo);
                        String string7 = mainActivity.getString(R.string.txt_wifi_standard);
                        i30.l(string7, "getString(...)");
                        arrayList.add(new k81(R.drawable.ic_frag_outline_wifi_24, string7, f31VarO.g + "\n" + f31VarO.f));
                    }
                    String string8 = mainActivity.getString(R.string.txt_link_speed);
                    i30.l(string8, "getString(...)");
                    arrayList.add(new k81(R.drawable.ic_frag_outline_network_check_24, string8, connectionInfo.getLinkSpeed() + " Mbps"));
                    String string9 = mainActivity.getString(R.string.txt_signal);
                    i30.l(string9, "getString(...)");
                    Context applicationContext2 = mainActivity.getApplicationContext();
                    i30.l(applicationContext2, "getApplicationContext(...)");
                    int rssi = connectionInfo.getRssi();
                    if (-55 <= rssi && rssi < 36) {
                        string2 = applicationContext2.getString(R.string.signal_excellent);
                        i30.j(string2);
                    } else if (-75 <= rssi && rssi < -54) {
                        string2 = applicationContext2.getString(R.string.signal_good);
                        i30.j(string2);
                    } else if (-85 > rssi || rssi >= -74) {
                        string2 = applicationContext2.getString(R.string.signal_low);
                        i30.l(string2, "getString(...)");
                    } else {
                        string2 = applicationContext2.getString(R.string.btn_ok);
                        i30.j(string2);
                    }
                    arrayList.add(new k81(R.drawable.ic_frag_signal_cellular_alt_24, string9, string2));
                } else {
                    String string10 = mainActivity.getString(R.string.txt_ip_public);
                    i30.l(string10, "getString(...)");
                    arrayList.add(new k81(R.drawable.ic_frag_outline_public_24, string10, textView.getText().toString()));
                    string3 = mainActivity.getString(R.string.txt_disconnected);
                    i30.l(string3, "getString(...)");
                    string = mainActivity.getString(R.string.txt_bts);
                    i30.l(string, "getString(...)");
                }
                String string11 = mainActivity.getString(R.string.txt_status);
                i30.l(string11, "getString(...)");
                arrayList.add(new k81(R.drawable.ic_frag_outline_info_24, string11, string3));
                new j81();
                i30.m(string, "dialogTitle");
                j81 j81Var = new j81();
                j81Var.q0.addAll(arrayList);
                j81Var.r0 = string;
                j81Var.Q(mainActivity.o(), "wifi_dialog");
                return;
            case 1:
                int[] iArr2 = MainActivity.d0;
                mainActivity.D();
                return;
            case 2:
                int[] iArr3 = MainActivity.d0;
                mainActivity.z();
                return;
            case 3:
                int[] iArr4 = MainActivity.d0;
                mainActivity.D();
                return;
            default:
                int[] iArr5 = MainActivity.d0;
                new y00().Q(mainActivity.o(), "ModalBottomSheet");
                return;
        }
    }
}
