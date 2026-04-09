package sh;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.liuzh.deviceinfo.DeviceInfoApp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33694b;

    public /* synthetic */ i0(int i4, Object obj) {
        this.f33693a = i4;
        this.f33694b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignalStrength signalStrength;
        WifiInfo connectionInfo;
        WifiInfo connectionInfo2;
        switch (this.f33693a) {
            case 0:
                k0 k0Var = (k0) this.f33694b;
                if (!k0Var.c0()) {
                    if (k0Var.f33705d0 != null) {
                        if (a4.a.w()) {
                            WifiManager wifiManager = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
                            int rssi = (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? Integer.MIN_VALUE : connectionInfo.getRssi();
                            if (rssi == Integer.MIN_VALUE) {
                                k0Var.f33705d0.setText("- dBm, " + WifiManager.calculateSignalLevel(rssi, 100) + "%");
                            } else {
                                k0Var.f33705d0.setText(rssi + " dBm, " + WifiManager.calculateSignalLevel(rssi, 100) + "%");
                            }
                        } else if (!a4.a.t()) {
                            k0Var.f33705d0.setText("- dBm");
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            TelephonyManager telephonyManager = (TelephonyManager) k0Var.W().getSystemService("phone");
                            if (telephonyManager == null || (signalStrength = telephonyManager.getSignalStrength()) == null) {
                                k0Var.f33705d0.setText("- dBm");
                            } else {
                                k0.h0(k0Var, signalStrength);
                            }
                        }
                    }
                    bi.d.f2269a.postDelayed(this, 1000L);
                    break;
                }
                break;
            default:
                wg.x xVar = (wg.x) this.f33694b;
                if (!xVar.f36640a && xVar.f36735f != null) {
                    if (a4.a.w()) {
                        WifiManager wifiManager2 = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
                        int rssi2 = (wifiManager2 == null || (connectionInfo2 = wifiManager2.getConnectionInfo()) == null) ? Integer.MIN_VALUE : connectionInfo2.getRssi();
                        if (rssi2 == Integer.MIN_VALUE) {
                            xVar.f36735f.setText("- dBm, " + WifiManager.calculateSignalLevel(rssi2, 100) + "%");
                        } else {
                            xVar.f36735f.setText(rssi2 + " dBm, " + WifiManager.calculateSignalLevel(rssi2, 100) + "%");
                        }
                    } else if (!a4.a.t()) {
                        xVar.f36735f.setText("- dBm");
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        SignalStrength signalStrength2 = xVar.f36733d.getSignalStrength();
                        if (signalStrength2 != null) {
                            wg.x.g(xVar, signalStrength2);
                        } else {
                            xVar.f36735f.setText("- dBm");
                        }
                    }
                }
                if (!xVar.f36640a) {
                    wg.x.f(xVar);
                }
                xVar.f36734e.postDelayed(this, 1000L);
                break;
        }
    }
}
