package P;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3111a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3111a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return N.e.g(N.e.a(N.e.c(locale)));
        }
        try {
            return ((Locale) f3111a.invoke(null, locale)).getScript();
        } catch (IllegalAccessException e6) {
            Log.w("ICUCompat", e6);
            return locale.getScript();
        } catch (InvocationTargetException e7) {
            Log.w("ICUCompat", e7);
            return locale.getScript();
        }
    }
}
