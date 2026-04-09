package f0;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class l {

    public static class a {
        @DoNotInline
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    public static n0.g a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return n0.g.c(e.b(context));
        }
        Object objB = b(context);
        return objB != null ? n0.g.j(a.a(objB)) : n0.g.e();
    }

    public static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
