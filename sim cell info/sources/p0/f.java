package p0;

import android.telephony.TelephonyManager;
import android.util.Log;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3140a = "f";

    public static boolean a(TelephonyManager telephonyManager, b bVar) {
        try {
            bVar.f3110a = telephonyManager.getDeviceId();
            bVar.f3111b = null;
        } catch (SecurityException unused) {
        } catch (Exception e2) {
            Log.e(f3140a, e2.getMessage());
        }
        bVar.f3114e = false;
        bVar.f3112c = telephonyManager.getSimState() == 5;
        bVar.f3113d = false;
        b(telephonyManager, bVar);
        return true;
    }

    public static boolean b(TelephonyManager telephonyManager, b bVar) {
        try {
            bVar.f3115f = telephonyManager.getNetworkType();
            bVar.f3116g = -1;
        } catch (SecurityException unused) {
        }
        bVar.f3117h = telephonyManager.getSimOperator();
        bVar.f3118i = null;
        bVar.f3119j = telephonyManager.getSimOperatorName();
        bVar.f3120k = null;
        bVar.f3121l = telephonyManager.getSimCountryIso();
        bVar.f3122m = null;
        bVar.f3123n = telephonyManager.getNetworkOperator();
        bVar.f3124o = null;
        bVar.f3125p = telephonyManager.getNetworkOperatorName();
        bVar.f3126q = null;
        bVar.f3127r = telephonyManager.getNetworkCountryIso();
        bVar.f3128s = null;
        bVar.f3129t = telephonyManager.getPhoneType();
        bVar.f3130u = -1;
        bVar.f3131v = telephonyManager.isNetworkRoaming();
        bVar.f3132w = false;
        return true;
    }
}
