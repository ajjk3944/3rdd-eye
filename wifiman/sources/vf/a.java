package Vf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import l0.C6533i;

/* loaded from: classes4.dex */
public abstract class a {
    public static final C6533i a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(137725222);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(137725222, i10, -1, "com.valentinilk.shimmer.rememberWindowBounds (ScreenInfo.android.kt:8)");
        }
        interfaceC3540l.U(-1972096875);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            C6533i c6533i = new C6533i(0.0f, 0.0f, displayMetrics.widthPixels, displayMetrics.heightPixels);
            interfaceC3540l.K(c6533i);
            objF = c6533i;
        }
        C6533i c6533i2 = (C6533i) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c6533i2;
    }
}
