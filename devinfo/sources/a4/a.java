package a4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.drawable.Icon;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.telephony.CellLocation;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f185a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static double f186b = -1.0d;

    public static void A(Outline outline, p1.j jVar) {
        if (!(jVar instanceof p1.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(jVar.f30986a);
    }

    public static void B(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static final void C(hg.a aVar) {
        Window window = aVar.getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        window.setStatusBarColor(0);
    }

    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final int b(float f10) {
        Context context = pk.a.f32022a;
        nk.k.b(context);
        Resources resources = context.getResources();
        nk.k.d(resources, "getResources(...)");
        return c(resources, f10);
    }

    public static final int c(Resources resources, float f10) {
        nk.k.e(resources, "res");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        nk.k.d(displayMetrics, "getDisplayMetrics(...)");
        return pk.a.s(TypedValue.applyDimension(1, f10, displayMetrics));
    }

    public static int d(int i4) {
        if (i4 == Integer.MAX_VALUE) {
            return 99;
        }
        return (i4 + AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID) / 2;
    }

    public static int e() {
        CellLocation cellLocation;
        TelephonyManager telephonyManager = (TelephonyManager) DeviceInfoApp.f21145f.getSystemService("phone");
        if (telephonyManager == null) {
            return -1;
        }
        try {
            cellLocation = telephonyManager.getCellLocation();
        } catch (Exception unused) {
        }
        if (cellLocation instanceof GsmCellLocation) {
            return ((GsmCellLocation) cellLocation).getCid();
        }
        if (cellLocation instanceof CdmaCellLocation) {
            return ((CdmaCellLocation) cellLocation).getBaseStationId();
        }
        return -1;
    }

    public static void f(int i4) {
        SdkExtensions.getExtensionVersion(i4);
    }

    public static final String g(String str, PackageManager packageManager) {
        try {
            return wi.h.f36761f ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String h() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces;
        Enumeration<InetAddress> inetAddresses;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (Exception unused) {
        }
        if (networkInterfaces == null) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        ArrayList arrayList = new ArrayList();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (networkInterfaceNextElement != null && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null) {
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if ((inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.isLoopbackAddress()) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress) && !arrayList.contains(hostAddress)) {
                            arrayList.add(hostAddress);
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join("\n", arrayList);
        }
        return DeviceInfoApp.f21145f.getString(R.string.unknown);
    }

    public static int i() {
        CellLocation cellLocation;
        TelephonyManager telephonyManager = (TelephonyManager) DeviceInfoApp.f21145f.getSystemService("phone");
        if (telephonyManager == null) {
            return -1;
        }
        try {
            cellLocation = telephonyManager.getCellLocation();
        } catch (Exception unused) {
        }
        if (cellLocation instanceof GsmCellLocation) {
            return ((GsmCellLocation) cellLocation).getLac();
        }
        if (cellLocation instanceof CdmaCellLocation) {
            return ((CdmaCellLocation) cellLocation).getNetworkId();
        }
        return -1;
    }

    public static int j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) DeviceInfoApp.f21145f.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 5;
        }
        if (activeNetworkInfo.getType() != 0) {
            return -1;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 2;
            case 13:
            case 18:
                return 3;
            case 19:
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName)) {
                    return 0;
                }
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? 2 : -1;
            case 20:
                return 4;
        }
    }

    public static int k(int i4) {
        if (i4 > 31 || i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return (i4 * 2) - 113;
    }

    public static final int l(DeviceInfoApp deviceInfoApp) {
        nk.k.e(deviceInfoApp, "context");
        Object systemService = deviceInfoApp.getSystemService("window");
        nk.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (wi.h.f36761f) {
            return windowManager.getCurrentWindowMetrics().getBounds().height();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static final int m(Context context) {
        nk.k.e(context, "context");
        Object systemService = context.getSystemService("window");
        nk.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (wi.h.f36761f) {
            return windowManager.getCurrentWindowMetrics().getBounds().width();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static String n(SignalStrength signalStrength) {
        if (!wi.i.a(DeviceInfoApp.f21145f, "android.permission.READ_PHONE_STATE")) {
            return "- dBm";
        }
        TelephonyManager telephonyManager = (TelephonyManager) DeviceInfoApp.f21145f.getSystemService("phone");
        if (telephonyManager != null) {
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 2) {
                int cdmaDbm = signalStrength.getCdmaDbm();
                return cdmaDbm + " dBm, " + d(cdmaDbm) + " asu";
            }
            if (phoneType == 1) {
                int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                return k(gsmSignalStrength) + " dBm, " + gsmSignalStrength + " asu";
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) DeviceInfoApp.f21145f.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() != 0) {
            return "-";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            case 20:
                int gsmSignalStrength2 = signalStrength.getGsmSignalStrength();
                return k(gsmSignalStrength2) + " dBm, " + gsmSignalStrength2 + " asu";
            case 4:
            case 7:
            case 11:
            case 17:
                int cdmaDbm2 = signalStrength.getCdmaDbm();
                return cdmaDbm2 + " dBm, " + d(cdmaDbm2) + " asu";
            case 5:
            case 6:
            case 12:
                int evdoDbm = signalStrength.getEvdoDbm();
                return evdoDbm + " dBm, " + d(evdoDbm) + " asu";
            case 13:
            case 18:
                try {
                    int iIntValue = ((Integer) signalStrength.getClass().getDeclaredMethod("getLteSignalStrength", null).invoke(signalStrength, null)).intValue();
                    return iIntValue + " dBm, " + d(iIntValue) + " asu";
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return "-";
                }
            case 19:
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName)) {
                    return "-";
                }
                if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                    int cdmaDbm3 = signalStrength.getCdmaDbm();
                    return cdmaDbm3 + " dBm, " + d(cdmaDbm3) + " asu";
                }
                int gsmSignalStrength3 = signalStrength.getGsmSignalStrength();
                return k(gsmSignalStrength3) + " dBm, " + gsmSignalStrength3 + " asu";
        }
    }

    public static CharSequence o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets p(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static WifiInfo q() {
        WifiManager wifiManager = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    public static String r(int i4) {
        return (i4 & 255) + "." + ((i4 >> 8) & 255) + "." + ((i4 >> 16) & 255) + "." + ((i4 >> 24) & 255);
    }

    public static boolean s() {
        WifiManager wifiManager = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
        if (wifiManager == null || !wi.h.f36762h) {
            return false;
        }
        try {
            return wifiManager.is6GHzBandSupported();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean t() {
        int iJ = j();
        return iJ == 1 || iJ == 2 || iJ == 3 || iJ == 4;
    }

    public static boolean u(DeviceInfoApp deviceInfoApp) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        TelephonyManager telephonyManager = (TelephonyManager) deviceInfoApp.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return telephonyManager.isDataEnabled();
            }
            Object objInvoke = telephonyManager.getClass().getDeclaredMethod("getDataEnabled", null).invoke(telephonyManager, null);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean v(Resources resources) {
        nk.k.e(resources, "res");
        return resources.getConfiguration().orientation == 1;
    }

    public static boolean w() {
        return j() == 5 && q() != null;
    }

    public static void x(Window window, boolean z3) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z3);
    }

    public static void y(Window window, boolean z3) {
        window.setDecorFitsSystemWindows(z3);
    }

    public static void z(View view) {
        view.setImportantForContentCapture(1);
    }
}
