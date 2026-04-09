package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gc {
    static {
        int i = Build.VERSION.SDK_INT;
        fc fcVar = fc.a;
        if (i >= 30) {
            fcVar.a(30);
        }
        if (i >= 30) {
            fcVar.a(31);
        }
        if (i >= 30) {
            fcVar.a(33);
        }
        if (i >= 30) {
            fcVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        i30.l(str, "CODENAME");
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        i30.l(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = "S".toUpperCase(locale);
        i30.l(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
