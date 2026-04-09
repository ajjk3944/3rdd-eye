package d;

import android.os.Build;
import android.view.View;
import android.view.Window;
import e4.d2;
import e4.e2;
import e4.f2;
import e4.h2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends com.bumptech.glide.d {
    @Override // com.bumptech.glide.d
    public void z(d0 d0Var, d0 d0Var2, Window window, View view, boolean z3, boolean z10) {
        nk.k.e(d0Var, "statusBarStyle");
        nk.k.e(d0Var2, "navigationBarStyle");
        nk.k.e(window, "window");
        nk.k.e(view, "view");
        com.bumptech.glide.f.A(window, false);
        window.setStatusBarColor(z3 ? d0Var.f21589b : d0Var.f21588a);
        window.setNavigationBarColor(d0Var2.f21589b);
        o7.c cVar = new o7.c(view);
        int i4 = Build.VERSION.SDK_INT;
        (i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar)).w(!z3);
    }
}
