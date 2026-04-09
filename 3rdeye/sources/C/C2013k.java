package c;

import L0.C0792x;
import L0.U;
import L0.Z;
import L0.a0;
import L0.b0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import t4.C5606d;

/* compiled from: EdgeToEdge.kt */
/* renamed from: c.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013k extends C5606d {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.InterfaceC2018p
    public void a(C2027y statusBarStyle, C2027y navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        Z a0Var;
        kotlin.jvm.internal.l.f(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.l.f(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(view, "view");
        U.a(window, false);
        window.setStatusBarColor(z10 ? statusBarStyle.f18329b : statusBarStyle.f18328a);
        window.setNavigationBarColor(navigationBarStyle.f18329b);
        C0792x c0792x = new C0792x(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b0 b0Var = new b0(window.getInsetsController(), c0792x);
            b0Var.f3888c = window;
            a0Var = b0Var;
        } else {
            a0Var = i >= 26 ? new a0(window, c0792x) : new Z(window, c0792x);
        }
        a0Var.y(!z10);
    }
}
