package p;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class y1 extends t1 implements u1 {
    public static final Method Z;
    public i.g0 Y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p.u1
    public final void c(o.m mVar, MenuItem menuItem) {
        i.g0 g0Var = this.Y;
        if (g0Var != null) {
            g0Var.c(mVar, menuItem);
        }
    }

    @Override // p.u1
    public final void i(o.m mVar, o.o oVar) {
        i.g0 g0Var = this.Y;
        if (g0Var != null) {
            g0Var.i(mVar, oVar);
        }
    }

    @Override // p.t1
    public final i1 q(Context context, boolean z10) {
        x1 x1Var = new x1(context, z10);
        x1Var.setHoverListener(this);
        return x1Var;
    }
}
