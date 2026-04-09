package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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

    public static a4.h b(Configuration configuration) {
        return a4.h.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(a4.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f193a.a()));
    }

    public static void d(Configuration configuration, a4.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.f193a.a()));
    }
}
