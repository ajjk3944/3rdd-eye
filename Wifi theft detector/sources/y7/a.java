package y7;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import b8.f;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public WifiInfo f25156a;

    /* renamed from: b, reason: collision with root package name */
    public String f25157b = "eth0";

    /* renamed from: c, reason: collision with root package name */
    public int f25158c = 24;

    /* renamed from: d, reason: collision with root package name */
    public int f25159d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f25160e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f25161f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f25162g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f25163h = "255.255.255.255";

    /* renamed from: i, reason: collision with root package name */
    public String f25164i = "0.0.0.0";

    /* renamed from: j, reason: collision with root package name */
    public String f25165j = "0.0.0.0";

    public a(Context context) throws IOException {
        b();
        e(context);
    }

    public final void a() throws IOException {
        String str = this.f25163h;
        if (str != "255.255.255.255") {
            this.f25158c = f.a(str);
            return;
        }
        try {
            String strL = f.l("/system/xbin/ip", String.format(" -f inet addr show %s", this.f25157b), String.format("\\s*inet [0-9\\.]+\\/([0-9]+) brd [0-9\\.]+ scope global %s$", this.f25157b));
            if (strL != null) {
                this.f25158c = Integer.parseInt(strL);
                return;
            }
            String strL2 = f.l("/system/xbin/ip", String.format(" -f inet addr show %s", this.f25157b), String.format("\\s*inet [0-9\\.]+ peer [0-9\\.]+\\/([0-9]+) scope global %s$", this.f25157b));
            if (strL2 != null) {
                this.f25158c = Integer.parseInt(strL2);
                return;
            }
            String strL3 = f.l("/system/bin/ifconfig", " " + this.f25157b, String.format("^%s: ip [0-9\\.]+ mask ([0-9\\.]+) flags.*", this.f25157b));
            if (strL3 != null) {
                this.f25158c = f.a(strL3);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void b() throws IOException {
        c();
        a();
    }

    public String c() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                this.f25157b = networkInterfaceNextElement.getName();
                String strG = f.g(networkInterfaceNextElement);
                this.f25165j = strG;
                if (strG != "0.0.0.0") {
                    break;
                }
            }
        } catch (Exception unused) {
        }
        return this.f25165j;
    }

    public List d() {
        long jI = f.i(this.f25165j);
        long jI2 = f.i(this.f25163h);
        long j10 = jI & jI2;
        long j11 = jI | (jI2 ^ 4294967295L);
        long jK = f.k(j10);
        long jK2 = f.k(j11);
        if (jK2 - jK > 255) {
            jK2 = jK + 255;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            jK++;
            if (jK >= jK2) {
                return arrayList;
            }
            arrayList.add(f.j(f.k(jK)));
        }
    }

    public boolean e(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        this.f25156a = connectionInfo;
        this.f25159d = connectionInfo.getLinkSpeed();
        this.f25160e = this.f25156a.getSSID();
        this.f25161f = this.f25156a.getBSSID();
        if (wifiManager.getDhcpInfo() != null) {
            this.f25164i = f.j(wifiManager.getDhcpInfo().gateway);
            this.f25163h = f.j(wifiManager.getDhcpInfo().netmask);
        }
        String str = this.f25164i;
        if (str == null || str.equals("0.0.0.0")) {
            this.f25164i = "255.255.255.0";
        }
        String str2 = this.f25163h;
        if (str2 == null || str2.equals("0.0.0.0")) {
            this.f25163h = "255.255.255.0";
        }
        this.f25165j = f.j(this.f25156a.getIpAddress());
        return true;
    }
}
