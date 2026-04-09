package qm;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import o4.q;

/* loaded from: classes.dex */
public final class f {
    public static boolean a(Context context) {
        return c(context, "android.permission.ACCESS_COARSE_LOCATION") || c(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            return true;
        }
        return c(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public static boolean c(Context context, String str) {
        br.l.e(str, "permission");
        return context != null && h3.c.a(context, str) == 0;
    }

    public static void d(Activity activity, int i10) {
        f(i10, activity, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    public static void e(i.j jVar) {
        boolean zA = a(jVar);
        boolean zC = c(jVar, "android.permission.READ_PHONE_STATE");
        if (!zA && !zC) {
            f(8, jVar, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_PHONE_STATE");
        } else if (!zA) {
            d(jVar, 8);
        } else {
            if (zC) {
                return;
            }
            f(8, jVar, "android.permission.READ_PHONE_STATE");
        }
    }

    public static void f(int i10, Activity activity, String... strArr) {
        if (activity == null) {
            return;
        }
        boolean z10 = true;
        for (String str : strArr) {
            z10 = z10 && c(activity, str);
        }
        if (z10) {
            return;
        }
        g3.b.e(i10, activity, strArr);
    }

    public static void g(q qVar, Context context, String... strArr) {
        boolean z10 = true;
        for (String str : strArr) {
            z10 = z10 && c(context, str);
        }
        if (z10) {
            return;
        }
        qVar.a(strArr);
    }
}
