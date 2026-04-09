package b8;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4629a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f4630b = "WiFiYou";

    public static void a(String str, Throwable th) {
        if (!TextUtils.isEmpty(str) && f4629a) {
            Log.e(f4630b, str, th);
        }
    }
}
