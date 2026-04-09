package y0;

import android.app.LocaleManager;
import android.os.LocaleList;

/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes.dex */
public final class i {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
