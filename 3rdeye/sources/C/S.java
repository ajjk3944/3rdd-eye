package C;

import android.os.Build;
import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static int f653a = 3;

    public static void a(String str, String str2) {
        String strF = f(str);
        if (e(3, strF)) {
            Log.d(strF, str2);
        }
    }

    public static void b(String str, String str2) {
        String strF = f(str);
        if (e(6, strF)) {
            Log.e(strF, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String strF = f(str);
        if (e(6, strF)) {
            Log.e(strF, str2, th);
        }
    }

    public static boolean d(String str) {
        return e(3, f(str));
    }

    public static boolean e(int i, String str) {
        return f653a <= i || Log.isLoggable(str, i);
    }

    public static String f(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void g(String str, String str2) {
        String strF = f(str);
        if (e(5, strF)) {
            Log.w(strF, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        String strF = f(str);
        if (e(5, strF)) {
            Log.w(strF, str2, th);
        }
    }
}
