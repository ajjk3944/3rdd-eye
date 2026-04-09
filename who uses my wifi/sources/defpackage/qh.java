package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class qh {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, y70 y70Var) {
        configuration.setLocales(y70Var.a.a);
    }
}
