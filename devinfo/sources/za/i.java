package za;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.k31;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.tk0;
import java.lang.reflect.Array;
import java.util.Iterator;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final rg0 f38155a;

    static {
        int i4 = 19;
        f38155a = new rg0(i4, new tk0((byte) 0, i4));
    }

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
                    for (int i4 = 0; i4 < length; i4++) {
                        if (!y.l(Array.get(obj, i4), Array.get(obj2, i4))) {
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

    public static wb.d b(Context context) throws j {
        try {
            return wb.d.c(context, wb.d.f36579b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new j(e2);
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
        rg0 rg0Var = f38155a;
        Iterator itM = ((k31) rg0Var.f15651b).m(rg0Var, str);
        boolean z3 = true;
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return;
            }
            String str2 = (String) j31Var.next();
            if (z3) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void d(String str, Throwable th2) {
        if (l(3)) {
            Log.d("Ads", str, th2);
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
        rg0 rg0Var = f38155a;
        Iterator itM = ((k31) rg0Var.f15651b).m(rg0Var, str);
        boolean z3 = true;
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return;
            }
            String str2 = (String) j31Var.next();
            if (z3) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void f(String str, Throwable th2) {
        if (l(6)) {
            Log.e("Ads", str, th2);
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
        rg0 rg0Var = f38155a;
        Iterator itM = ((k31) rg0Var.f15651b).m(rg0Var, str);
        boolean z3 = true;
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return;
            }
            String str2 = (String) j31Var.next();
            if (z3) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z3 = false;
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
        rg0 rg0Var = f38155a;
        Iterator itM = ((k31) rg0Var.f15651b).m(rg0Var, str);
        boolean z3 = true;
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return;
            }
            String str2 = (String) j31Var.next();
            if (z3) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void i(String str, Throwable th2) {
        if (l(5)) {
            Log.w("Ads", str, th2);
        }
    }

    public static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
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

    public static boolean l(int i4) {
        return i4 >= 5 || Log.isLoggable("Ads", i4);
    }
}
