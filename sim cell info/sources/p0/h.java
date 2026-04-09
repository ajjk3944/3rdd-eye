package p0;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3142a = "h";

    private static int a(Object obj, String str, int i2) throws a, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(obj.getClass().getName()).getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(i2));
            if (objInvoke != null) {
                return Integer.parseInt(objInvoke.toString());
            }
            return -1;
        } catch (Exception unused) {
            throw new a(str);
        }
    }

    private static String b(Object obj, String str, int i2) throws a, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(obj.getClass().getName()).getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(i2));
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (Exception unused) {
            throw new a(str);
        }
    }

    public static List<CellInfo> c(Object obj, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(obj.getClass().getName()).getMethod("getAllCellInfo", Integer.TYPE).invoke(obj, Integer.valueOf(i2));
            if (objInvoke != null) {
                return (List) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            Log.e(f3142a, e2.getMessage());
            return null;
        }
    }

    public static CellLocation d(Object obj, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName(obj.getClass().getName()).getMethod("getCellLocation", Integer.TYPE).invoke(obj, Integer.valueOf(i2));
            if (objInvoke != null) {
                return (CellLocation) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            Log.e(f3142a, e2.getMessage());
            return null;
        }
    }

    public static Object e() throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("com.mediatek.telephony.TelephonyManagerEx");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (Exception e2) {
            q0.a.b(f3142a, "getDefaultTelephonyManagerEx:" + e2.toString());
            return null;
        }
    }

    public static void f(Object obj, PhoneStateListener phoneStateListener, int i2, int i3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("listen", PhoneStateListener.class, cls2, cls2);
                if (method != null) {
                    method.invoke(obj, phoneStateListener, Integer.valueOf(i2), Integer.valueOf(i3));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean g(TelephonyManager telephonyManager, b bVar) throws ClassNotFoundException {
        Object objE = e();
        if (!i(objE, bVar)) {
            bVar.f3110a = telephonyManager.getDeviceId();
            bVar.f3111b = null;
        }
        bVar.f3114e = bVar.f3111b != null;
        if (!s(objE, bVar)) {
            bVar.f3112c = telephonyManager.getSimState() == 5;
            bVar.f3113d = false;
        }
        h(objE, telephonyManager, bVar);
        return true;
    }

    public static boolean h(Object obj, TelephonyManager telephonyManager, b bVar) {
        if (!n(obj, bVar)) {
            bVar.f3115f = telephonyManager.getNetworkType();
            bVar.f3116g = -1;
        }
        if (!q(obj, bVar)) {
            bVar.f3117h = telephonyManager.getSimOperator();
            bVar.f3118i = null;
        }
        if (!r(obj, bVar)) {
            bVar.f3119j = telephonyManager.getSimOperatorName();
            bVar.f3120k = null;
        }
        if (!p(obj, bVar)) {
            bVar.f3121l = telephonyManager.getSimCountryIso();
            bVar.f3122m = null;
        }
        if (!k(telephonyManager, bVar)) {
            bVar.f3123n = telephonyManager.getNetworkOperator();
            bVar.f3124o = null;
        }
        if (!l(telephonyManager, bVar)) {
            bVar.f3125p = telephonyManager.getNetworkOperatorName();
            bVar.f3126q = null;
        }
        if (!j(telephonyManager, bVar)) {
            bVar.f3127r = telephonyManager.getNetworkCountryIso();
            bVar.f3128s = null;
        }
        if (!o(obj, bVar)) {
            bVar.f3129t = telephonyManager.getPhoneType();
            bVar.f3130u = -1;
        }
        if (m(telephonyManager, bVar)) {
            return true;
        }
        bVar.f3131v = telephonyManager.isNetworkRoaming();
        bVar.f3132w = false;
        return true;
    }

    public static boolean i(Object obj, b bVar) {
        String[] strArr = {"getDeviceId"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3110a = b(obj, str, 0);
                bVar.f3111b = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean j(Object obj, b bVar) {
        String[] strArr = {"getNetworkCountryIso"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3121l = b(obj, str, 0);
                bVar.f3122m = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean k(Object obj, b bVar) {
        String[] strArr = {"getNetworkOperator"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3117h = b(obj, str, 0);
                bVar.f3118i = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean l(Object obj, b bVar) {
        String[] strArr = {"getNetworkOperatorName"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3119j = b(obj, str, 0);
                bVar.f3120k = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean m(TelephonyManager telephonyManager, b bVar) {
        String[] strArr = {"isNetworkRoaming"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3131v = a(telephonyManager, str, 0) > 0;
                bVar.f3132w = a(telephonyManager, str, 1) > 0;
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean n(Object obj, b bVar) {
        String[] strArr = {"getNetworkType"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3115f = a(obj, str, 0);
                bVar.f3116g = a(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean o(Object obj, b bVar) {
        String[] strArr = {"getPhoneType"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3129t = a(obj, str, 0);
                bVar.f3130u = a(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean p(Object obj, b bVar) {
        String[] strArr = {"getSimCountryIso"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3121l = b(obj, str, 0);
                bVar.f3122m = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean q(Object obj, b bVar) {
        String[] strArr = {"getSimOperator"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3117h = b(obj, str, 0);
                bVar.f3118i = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean r(Object obj, b bVar) {
        String[] strArr = {"getSimOperatorName"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3119j = b(obj, str, 0);
                bVar.f3120k = b(obj, str, 1);
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }

    public static boolean s(Object obj, b bVar) {
        String[] strArr = {"getSimState"};
        for (int i2 = 0; i2 < 1; i2++) {
            String str = strArr[i2];
            try {
                bVar.f3112c = a(obj, str, 0) == 5;
                bVar.f3113d = a(obj, str, 1) == 5;
                return true;
            } catch (a unused) {
                Log.w(f3142a, "unknown method = " + str);
            }
        }
        return false;
    }
}
