package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class t {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static p3.d b(Configuration configuration) {
        return p3.d.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(p3.d dVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dVar.f20245a.f20246a.toLanguageTags()));
    }

    public static void d(Configuration configuration, p3.d dVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dVar.f20245a.f20246a.toLanguageTags()));
    }
}
