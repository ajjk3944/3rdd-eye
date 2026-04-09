package q0;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Method f23958a;

    public static class a {
        @DoNotInline
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: q0.b$b, reason: collision with other inner class name */
    public static class C0457b {
        @DoNotInline
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f23958a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0457b.c(C0457b.a(C0457b.b(locale)));
        }
        try {
            return a.a((Locale) f23958a.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
            return a.a(locale);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
            return a.a(locale);
        }
    }
}
