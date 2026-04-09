package c;

import G3.C0152f;
import R.s0;
import R.t0;
import R.u0;
import R.v0;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: c.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0393r extends a4.t {
    @Override // a4.t
    public void t(C0375O c0375o, C0375O c0375o2, Window window, View view, boolean z6, boolean z7) {
        q5.i.e(c0375o, "statusBarStyle");
        q5.i.e(c0375o2, "navigationBarStyle");
        q5.i.e(window, "window");
        q5.i.e(view, "view");
        com.bumptech.glide.e.x(window, false);
        window.setStatusBarColor(z6 ? c0375o.f5816b : c0375o.f5815a);
        window.setNavigationBarColor(z7 ? c0375o2.f5816b : c0375o2.f5815a);
        C0152f c0152f = new C0152f(view);
        int i = Build.VERSION.SDK_INT;
        R2.a v0Var = i >= 35 ? new v0(window, c0152f) : i >= 30 ? new u0(window, c0152f) : i >= 26 ? new t0(window, c0152f) : new s0(window, c0152f);
        v0Var.D(!z6);
        v0Var.C(!z7);
    }
}
