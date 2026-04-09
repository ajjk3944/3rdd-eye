package d;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.d5;
import e4.d2;
import e4.e2;
import e4.f2;
import e4.h2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends r {
    @Override // d.q, d.o, com.bumptech.glide.d
    public void z(d0 d0Var, d0 d0Var2, Window window, View view, boolean z3, boolean z10) {
        nk.k.e(d0Var, "statusBarStyle");
        nk.k.e(d0Var2, "navigationBarStyle");
        nk.k.e(window, "window");
        nk.k.e(view, "view");
        com.bumptech.glide.f.A(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new h4.d(viewGroup.getContext(), cm.g.t(new h4.a(2, 0), new h4.a(1, 0), new h4.a(4, 0), new h4.a(8, 0))));
        }
        window.setNavigationBarContrastEnforced(true);
        o7.c cVar = new o7.c(view);
        int i4 = Build.VERSION.SDK_INT;
        d5 h2Var = i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar);
        h2Var.w(!z3);
        h2Var.v(!z10);
    }
}
