package u2;

import M2.u;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.C1285ht;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.XA;
import com.google.android.gms.internal.ads.YA;
import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C1448kw f23815a = new C1448kw(3, new C1285ht(12, 0));

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!u.g(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static T2.e b(Context context) throws l {
        try {
            return T2.e.c(context, T2.e.f3572b);
        } catch (Exception e6) {
            throw new l(e6);
        }
    }

    public static void c(String str) {
        if (!l(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        C1448kw c1448kw = f23815a;
        Iterator itE = ((YA) c1448kw.f15314b).e(c1448kw, str);
        boolean z6 = true;
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return;
            }
            String str2 = (String) xa.next();
            if (z6) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void d(String str, Throwable th) {
        if (l(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void e(String str) {
        if (!l(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        C1448kw c1448kw = f23815a;
        Iterator itE = ((YA) c1448kw.f15314b).e(c1448kw, str);
        boolean z6 = true;
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return;
            }
            String str2 = (String) xa.next();
            if (z6) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void f(String str, Throwable th) {
        if (l(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void g(String str) {
        if (!l(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        C1448kw c1448kw = f23815a;
        Iterator itE = ((YA) c1448kw.f15314b).e(c1448kw, str);
        boolean z6 = true;
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return;
            }
            String str2 = (String) xa.next();
            if (z6) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void h(String str) {
        if (!l(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        C1448kw c1448kw = f23815a;
        Iterator itE = ((YA) c1448kw.f15314b).e(c1448kw, str);
        boolean z6 = true;
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return;
            }
            String str2 = (String) xa.next();
            if (z6) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void i(String str, Throwable th) {
        if (l(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void k(String str, Exception exc) {
        if (l(5)) {
            if (exc != null) {
                i(j(str), exc);
            } else {
                h(j(str));
            }
        }
    }

    public static boolean l(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
