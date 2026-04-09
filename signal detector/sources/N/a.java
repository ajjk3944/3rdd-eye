package N;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2959a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            K.b.b(30);
        }
        if (i >= 30) {
            K.b.b(31);
        }
        if (i >= 30) {
            K.b.b(33);
        }
        if (i >= 30) {
            K.b.b(1000000);
        }
    }

    public static final boolean a(String str) {
        String str2 = Build.VERSION.CODENAME;
        q5.i.e(str2, "buildCodename");
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            q5.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            q5.i.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num == null || num == null) {
                if (num == null && num == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    q5.i.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase4 = str.toUpperCase(locale);
                    q5.i.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        q5.i.d(Build.VERSION.CODENAME, "CODENAME");
        return a("S");
    }
}
