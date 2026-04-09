package p0;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3136a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static int f3137b;

    /* renamed from: c, reason: collision with root package name */
    private static b f3138c;

    public static void a(Context context) {
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            i.a(telephonyManager, f3138c, context);
            return;
        }
        if (i3 >= 23) {
            try {
                g.a(telephonyManager, f3138c, context);
                f3137b = 3;
                return;
            } catch (Exception e2) {
                Log.e(f3136a, e2.getMessage());
                return;
            }
        }
        String strB = l0.a.b();
        q0.a.b(f3136a, strB);
        if (!strB.contains("mtk")) {
            e.c(telephonyManager, f3138c, context);
            i2 = 1;
        } else {
            if (!h.g(telephonyManager, f3138c)) {
                f.a(telephonyManager, f3138c);
                return;
            }
            i2 = 2;
        }
        f3137b = i2;
    }

    public static b b(Context context) {
        if (f3138c == null) {
            f3138c = new b();
        }
        a(context);
        return f3138c;
    }

    public static int c() {
        return f3137b;
    }
}
