package R;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class G {
    public static r0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        r0 r0VarG = r0.g(null, rootWindowInsets);
        o0 o0Var = r0VarG.f3359a;
        o0Var.p(r0VarG);
        o0Var.d(view.getRootView());
        return r0VarG;
    }

    public static void b(View view, int i, int i3) {
        view.setScrollIndicators(i, i3);
    }
}
