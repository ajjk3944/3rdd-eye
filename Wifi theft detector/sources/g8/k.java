package g8;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21215a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f21216b = "WiFiYou";

    public static void a(String str) {
        if (!TextUtils.isEmpty(str) && f21215a) {
            Log.d(f21216b, str);
        }
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str) && f21215a) {
            Log.e(f21216b, str);
        }
    }

    public static void c(String str, Throwable th) {
        if (!TextUtils.isEmpty(str) && f21215a) {
            Log.e(f21216b, str, th);
        }
    }

    public static void d(boolean z10, String str) {
        f21215a = z10;
        f21216b = str;
    }
}
