package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u51 {
    public static o91 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        o91 o91VarG = o91.g(null, rootWindowInsets);
        l91 l91Var = o91VarG.a;
        l91Var.p(o91VarG);
        l91Var.d(view.getRootView());
        return o91VarG;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
