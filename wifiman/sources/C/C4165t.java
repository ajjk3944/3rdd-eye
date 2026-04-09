package c;

import F1.AbstractC2753i0;
import F1.V0;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4165t extends AbstractC4132A {
    @Override // c.InterfaceC4133B
    public void a(C4143L statusBarStyle, C4143L navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC6492s.i(statusBarStyle, "statusBarStyle");
        AbstractC6492s.i(navigationBarStyle, "navigationBarStyle");
        AbstractC6492s.i(window, "window");
        AbstractC6492s.i(view, "view");
        AbstractC2753i0.b(window, false);
        window.setStatusBarColor(statusBarStyle.c(z10));
        window.setNavigationBarColor(navigationBarStyle.c(z11));
        V0 v02 = new V0(window, view);
        v02.b(!z10);
        v02.a(!z11);
    }
}
