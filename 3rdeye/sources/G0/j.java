package G0;

import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f1851b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final l f1852a;

    /* compiled from: LocaleListCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f1853a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (locale.getLanguage().equals(locale2.getLanguage())) {
                Locale[] localeArr = f1853a;
                for (Locale locale3 : localeArr) {
                    if (locale3.equals(locale)) {
                        return false;
                    }
                }
                for (Locale locale4 : localeArr) {
                    if (locale4.equals(locale2)) {
                        return false;
                    }
                }
                String strA = J0.c.a(locale);
                if (!strA.isEmpty()) {
                    return strA.equals(J0.c.a(locale2));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat.java */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public j(l lVar) {
        this.f1852a = lVar;
    }

    public static j a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new j(new r(b.a(localeArr))) : new j(new k(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return f1851b;
        }
        String[] strArrSplit = str.split(StringUtils.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f1852a.equals(((j) obj).f1852a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1852a.hashCode();
    }

    public final String toString() {
        return this.f1852a.toString();
    }
}
