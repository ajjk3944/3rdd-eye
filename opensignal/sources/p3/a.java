package p3;

import android.os.Build;
import br.l;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {
    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a2.f.b(30);
        }
        if (i10 >= 30) {
            a2.f.b(31);
        }
        if (i10 >= 30) {
            a2.f.b(33);
        }
        if (i10 >= 30) {
            a2.f.b(1000000);
        }
    }

    public static final boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        l.d(str, "CODENAME");
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        l.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = "VanillaIceCream".toUpperCase(locale);
        l.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
