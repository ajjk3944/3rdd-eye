package u3;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class a0 {
    public static h1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        h1 h1VarG = h1.g(null, rootWindowInsets);
        f1 f1Var = h1VarG.f23176a;
        f1Var.r(h1VarG);
        f1Var.d(view.getRootView());
        return h1VarG;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
