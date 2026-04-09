package t5;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(String str) {
        if (!n5.c.f23535a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!n5.c.f23535a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
