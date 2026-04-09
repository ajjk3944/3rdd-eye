package n6;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(String str) {
        if (!h6.b.f21413a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!h6.b.f21413a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void c(String str) {
        if (!h6.b.f21413a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
