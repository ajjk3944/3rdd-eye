package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g2 extends b2 implements c2 {
    public static final Method E;
    public o.e D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.c2
    public final void e(o.m mVar, MenuItem menuItem) {
        o.e eVar = this.D;
        if (eVar != null) {
            eVar.e(mVar, menuItem);
        }
    }

    @Override // p.c2
    public final void g(o.m mVar, o.o oVar) {
        o.e eVar = this.D;
        if (eVar != null) {
            eVar.g(mVar, oVar);
        }
    }

    @Override // p.b2
    public final p1 p(Context context, boolean z3) {
        f2 f2Var = new f2(context, z3);
        f2Var.setHoverListener(this);
        return f2Var;
    }
}
