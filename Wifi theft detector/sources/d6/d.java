package d6;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(String str) {
        if (!x5.b.f24977a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!x5.b.f24977a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
