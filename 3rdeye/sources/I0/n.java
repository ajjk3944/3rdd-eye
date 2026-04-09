package I0;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: ThemeUtils.kt */
/* loaded from: classes.dex */
public final class n {
    public static final void a(Resources.Theme theme, View decor) {
        kotlin.jvm.internal.l.f(theme, "theme");
        kotlin.jvm.internal.l.f(decor, "decor");
        b(theme, decor, new TypedValue());
    }

    public static final void b(Resources.Theme theme, View decor, TypedValue tv) {
        kotlin.jvm.internal.l.f(theme, "theme");
        kotlin.jvm.internal.l.f(decor, "decor");
        kotlin.jvm.internal.l.f(tv, "tv");
        int i = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
            i |= 16;
        }
        WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
        kotlin.jvm.internal.l.c(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }
}
