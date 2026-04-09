package n0;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {
        @DoNotInline
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        public static void b(@NonNull Configuration configuration, @NonNull g gVar) {
            configuration.setLocales((LocaleList) gVar.i());
        }
    }

    public static g a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.j(a.a(configuration)) : g.a(configuration.locale);
    }

    public static void b(Configuration configuration, g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.b(configuration, gVar);
        } else {
            if (gVar.f()) {
                return;
            }
            configuration.setLocale(gVar.d(0));
        }
    }
}
