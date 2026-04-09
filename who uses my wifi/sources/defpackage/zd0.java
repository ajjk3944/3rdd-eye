package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class zd0 {
    public final Context a;
    public final od0 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public ee0 h;
    public xd0 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final yd0 k = new yd0(this);

    public zd0(Context context, od0 od0Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = od0Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final xd0 a() {
        xd0 vx0Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                vx0Var = new xd(context, this.e, this.d, this.c);
            } else {
                vx0Var = new vx0(this.a, this.b, this.e, this.d, this.c);
            }
            vx0Var.l(this.b);
            vx0Var.r(this.k);
            vx0Var.n(this.e);
            vx0Var.d(this.h);
            vx0Var.o(this.g);
            vx0Var.p(this.f);
            this.i = vx0Var;
        }
        return this.i;
    }

    public final boolean b() {
        xd0 xd0Var = this.i;
        return xd0Var != null && xd0Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        xd0 xd0VarA = a();
        xd0VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            xd0VarA.q(i);
            xd0VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            xd0VarA.f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        xd0VarA.c();
    }
}
