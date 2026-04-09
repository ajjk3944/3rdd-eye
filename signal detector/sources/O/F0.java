package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class F0 extends A0 implements B0 {

    /* renamed from: S, reason: collision with root package name */
    public static final Method f22373S;

    /* renamed from: R, reason: collision with root package name */
    public d4.h f22374R;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f22373S = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.B0
    public final void c(MenuC2677k menuC2677k, MenuItem menuItem) {
        d4.h hVar = this.f22374R;
        if (hVar != null) {
            hVar.c(menuC2677k, menuItem);
        }
    }

    @Override // o.B0
    public final void p(MenuC2677k menuC2677k, n.m mVar) {
        d4.h hVar = this.f22374R;
        if (hVar != null) {
            hVar.p(menuC2677k, mVar);
        }
    }

    @Override // o.A0
    public final C2732p0 q(Context context, boolean z6) {
        E0 e02 = new E0(context, z6);
        e02.setHoverListener(this);
        return e02;
    }
}
