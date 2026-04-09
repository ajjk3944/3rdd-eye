package p0;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3139a = "e";

    private static int a(TelephonyManager telephonyManager, String str, int i2) throws a, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(telephonyManager.getClass().getName()).getMethod(str, Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i2));
            if (objInvoke != null) {
                return Integer.parseInt(objInvoke.toString());
            }
            return -1;
        } catch (Exception unused) {
            throw new a(str);
        }
    }

    private static String b(TelephonyManager telephonyManager, String str, int i2) throws a, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(telephonyManager.getClass().getName()).getMethod(str, Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i2));
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (Exception unused) {
            throw new a(str);
        }
    }

    public static boolean c(TelephonyManager telephonyManager, b bVar, Context context) {
        if (!e(telephonyManager, bVar)) {
            bVar.f3110a = telephonyManager.getDeviceId();
            bVar.f3111b = null;
        }
        bVar.f3114e = bVar.f3111b != null;
        if (!o(telephonyManager, bVar)) {
            bVar.f3112c = telephonyManager.getSimState() == 5;
            bVar.f3113d = false;
        }
        d(telephonyManager, bVar);
        return true;
    }

    public static boolean d(TelephonyManager telephonyManager, b bVar) {
        if (!j(telephonyManager, bVar)) {
            bVar.f3115f = telephonyManager.getNetworkType();
            bVar.f3116g = -1;
        }
        if (!m(telephonyManager, bVar)) {
            bVar.f3117h = telephonyManager.getSimOperator();
            bVar.f3118i = null;
        }
        if (!n(telephonyManager, bVar)) {
            bVar.f3119j = telephonyManager.getSimOperatorName();
            bVar.f3120k = null;
        }
        if (!l(telephonyManager, bVar)) {
            bVar.f3121l = telephonyManager.getSimCountryIso();
            bVar.f3122m = null;
        }
        if (!g(telephonyManager, bVar)) {
            bVar.f3123n = telephonyManager.getNetworkOperator();
            bVar.f3124o = null;
        }
        if (!h(telephonyManager, bVar)) {
            bVar.f3125p = telephonyManager.getNetworkOperatorName();
            bVar.f3126q = null;
        }
        if (!f(telephonyManager, bVar)) {
            bVar.f3127r = telephonyManager.getNetworkCountryIso();
            bVar.f3128s = null;
        }
        if (!k(telephonyManager, bVar)) {
            bVar.f3129t = telephonyManager.getPhoneType();
            bVar.f3130u = -1;
        }
        if (i(telephonyManager, bVar)) {
            return true;
        }
        bVar.f3131v = telephonyManager.isNetworkRoaming();
        bVar.f3132w = false;
        return true;
    }

    public static boolean e(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getDeviceIdGemini", "getDeviceId"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3110a = b(telephonyManager, str, 0);
                bVar.f3111b = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean f(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getNetworkCountryIsoGemini", "getNetworkCountryIsoForPhone", "getNetworkCountryIso"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3127r = b(telephonyManager, str, 0);
                bVar.f3128s = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean g(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getNetworkOperatorGemini", "getNetworkOperator"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3123n = b(telephonyManager, str, 0);
                bVar.f3124o = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean h(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getNetworkOperatorNameGemini", "getNetworkOperatorNameForPhone", "getNetworkOperatorName"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3125p = b(telephonyManager, str, 0);
                bVar.f3126q = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean i(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"isNetworkRoaming"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3131v = a(telephonyManager, str, 0) > 0;
                bVar.f3132w = a(telephonyManager, str, 1) > 0;
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean j(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getNetworkTypeGemini", "getNetworkType"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3115f = a(telephonyManager, str, 0);
                bVar.f3116g = a(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean k(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getPhoneTypeGemini", "getPhoneTypeForPhone", "getPhoneType"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3129t = a(telephonyManager, str, 0);
                bVar.f3130u = a(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean l(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getSimCountryIsoGemini", "getSimCountryIsoForPhone", "getSimCountryIso"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3121l = b(telephonyManager, str, 0);
                bVar.f3122m = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean m(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getSimOperatorGemini", "getSimOperator"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3117h = b(telephonyManager, str, 0);
                bVar.f3118i = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean n(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getSimOperatorNameGemini", "getSimOperatorNameForPhone", "getSimOperatorName"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3119j = b(telephonyManager, str, 0);
                bVar.f3120k = b(telephonyManager, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean o(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"getSimStateGemini", "getSimState"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3112c = a(telephonyManager, str, 0) == 5;
                bVar.f3113d = a(telephonyManager, str, 1) == 5;
                return true;
            } catch (a unused) {
                Log.w(f3139a, "unknown method = " + str);
            }
        }
        return false;
    }
}
