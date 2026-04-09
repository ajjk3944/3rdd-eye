package e4;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n0 {
    public static c2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c2 c2VarH = c2.h(null, rootWindowInsets);
        z1 z1Var = c2VarH.f22315a;
        z1Var.t(c2VarH);
        z1Var.d(view.getRootView());
        return c2VarH;
    }

    public static void b(View view, int i4, int i10) {
        view.setScrollIndicators(i4, i10);
    }
}
