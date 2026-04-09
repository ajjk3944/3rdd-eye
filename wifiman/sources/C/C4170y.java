package c;

import F1.AbstractC2753i0;
import F1.V0;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4170y extends C4167v {
    @Override // c.C4165t, c.InterfaceC4133B
    public void a(C4143L statusBarStyle, C4143L navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC6492s.i(statusBarStyle, "statusBarStyle");
        AbstractC6492s.i(navigationBarStyle, "navigationBarStyle");
        AbstractC6492s.i(window, "window");
        AbstractC6492s.i(view, "view");
        AbstractC2753i0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(z10));
        window.setNavigationBarColor(navigationBarStyle.d(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.b() == 0);
        V0 v02 = new V0(window, view);
        v02.b(!z10);
        v02.a(true ^ z11);
    }
}
