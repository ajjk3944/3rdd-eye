package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static N.h b(Configuration configuration) {
        return N.h.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(N.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f2966a.a()));
    }

    public static void d(Configuration configuration, N.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.f2966a.a()));
    }
}
