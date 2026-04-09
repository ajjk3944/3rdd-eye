package N;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f2965b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final j f2966a;

    public h(j jVar) {
        this.f2966a = jVar;
    }

    public static h a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new h(new k(e.b(localeArr))) : new h(new i(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return f2965b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            Locale[] localeArr2 = g.f2964a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public static boolean c(Locale locale, Locale locale2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return LocaleList.matchesLanguageAndScript(locale, locale2);
        }
        Locale[] localeArr = g.f2964a;
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr2 = g.f2964a;
            int length = localeArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Locale[] localeArr3 = g.f2964a;
                    int length2 = localeArr3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            String strA = P.c.a(locale);
                            if (!strA.isEmpty()) {
                                return strA.equals(P.c.a(locale2));
                            }
                            String country = locale.getCountry();
                            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                return true;
                            }
                        } else {
                            if (localeArr3[i3].equals(locale2)) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (localeArr2[i].equals(locale)) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f2966a.equals(((h) obj).f2966a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2966a.hashCode();
    }

    public final String toString() {
        return this.f2966a.toString();
    }
}
