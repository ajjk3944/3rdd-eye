package Y7;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b implements a {
    private final void d(Context context) {
        Locale locale = Locale.getDefault();
        if (context.getResources().getBoolean(f.f24766a)) {
            return;
        }
        AbstractC6492s.f(locale);
        if (e(locale)) {
            return;
        }
        Z7.b.h("AppLocaleService - Falling DEFAULT app locale back to Locale.US since " + locale.getLanguage() + " is not localized", null, 2, null);
        Locale.setDefault(Locale.US);
    }

    private final boolean e(Locale locale) {
        return locale.getLanguage().equals("en");
    }

    @Override // Y7.a
    public Context a(Context context) {
        AbstractC6492s.i(context, "context");
        d(context);
        Locale locale = Locale.getDefault();
        if (AbstractC6492s.d(context.getResources().getConfiguration().locale, locale)) {
            return context;
        }
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        Z7.b.h("AppLocaleService - Activity context locale set to " + locale.getLanguage(), null, 2, null);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        AbstractC6492s.h(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    @Override // Y7.a
    public void b(Context context) {
        AbstractC6492s.i(context, "context");
        d(context);
    }

    @Override // Y7.a
    public void c(Context context, Configuration newConfig) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(newConfig, "newConfig");
        d(context);
    }
}
