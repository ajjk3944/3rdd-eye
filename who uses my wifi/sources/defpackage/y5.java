package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class y5 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static y70 b(Configuration configuration) {
        return y70.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(y70 y70Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(y70Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, y70 y70Var) {
        configuration.setLocales(LocaleList.forLanguageTags(y70Var.a.a.toLanguageTags()));
    }
}
