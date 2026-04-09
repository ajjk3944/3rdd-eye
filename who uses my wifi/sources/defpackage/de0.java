package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class de0 extends i70 implements rd0 {
    public static final Method I;
    public ug0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.rd0
    public final void i(od0 od0Var, MenuItem menuItem) {
        ug0 ug0Var = this.H;
        if (ug0Var != null) {
            ug0Var.i(od0Var, menuItem);
        }
    }

    @Override // defpackage.rd0
    public final void l(od0 od0Var, sd0 sd0Var) {
        ug0 ug0Var = this.H;
        if (ug0Var != null) {
            ug0Var.l(od0Var, sd0Var);
        }
    }

    @Override // defpackage.i70
    public final kq q(Context context, boolean z) {
        ce0 ce0Var = new ce0(context, z);
        ce0Var.setHoverListener(this);
        return ce0Var;
    }
}
