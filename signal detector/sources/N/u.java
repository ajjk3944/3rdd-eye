package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.apm.insight.R;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22131a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC2677k f22132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22133c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22134d;

    /* renamed from: e, reason: collision with root package name */
    public View f22135e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22137g;

    /* renamed from: h, reason: collision with root package name */
    public v f22138h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f22139j;

    /* renamed from: f, reason: collision with root package name */
    public int f22136f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final t f22140k = new t(this);

    public u(Context context, MenuC2677k menuC2677k, View view, boolean z6, int i, int i3) {
        this.f22131a = context;
        this.f22132b = menuC2677k;
        this.f22135e = view;
        this.f22133c = z6;
        this.f22134d = i;
    }

    public final s a() {
        s viewOnKeyListenerC2665B;
        if (this.i == null) {
            Context context = this.f22131a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2665B = new ViewOnKeyListenerC2671e(context, this.f22135e, this.f22134d, this.f22133c);
            } else {
                viewOnKeyListenerC2665B = new ViewOnKeyListenerC2665B(this.f22131a, this.f22132b, this.f22135e, this.f22134d, this.f22133c);
            }
            viewOnKeyListenerC2665B.n(this.f22132b);
            viewOnKeyListenerC2665B.t(this.f22140k);
            viewOnKeyListenerC2665B.p(this.f22135e);
            viewOnKeyListenerC2665B.l(this.f22138h);
            viewOnKeyListenerC2665B.q(this.f22137g);
            viewOnKeyListenerC2665B.r(this.f22136f);
            this.i = viewOnKeyListenerC2665B;
        }
        return this.i;
    }

    public final boolean b() {
        s sVar = this.i;
        return sVar != null && sVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f22139j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i3, boolean z6, boolean z7) {
        s sVarA = a();
        sVarA.u(z7);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f22136f, this.f22135e.getLayoutDirection()) & 7) == 5) {
                i -= this.f22135e.getWidth();
            }
            sVarA.s(i);
            sVarA.v(i3);
            int i6 = (int) ((this.f22131a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            sVarA.f22129a = new Rect(i - i6, i3 - i6, i + i6, i3 + i6);
        }
        sVarA.g();
    }
}
