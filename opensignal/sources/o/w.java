package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18673a;

    /* renamed from: b, reason: collision with root package name */
    public final m f18674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18676d;

    /* renamed from: e, reason: collision with root package name */
    public View f18677e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18679g;

    /* renamed from: h, reason: collision with root package name */
    public x f18680h;

    /* renamed from: i, reason: collision with root package name */
    public u f18681i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f18678f = 8388611;
    public final v k = new v(this);

    public w(Context context, m mVar, View view, boolean z10, int i10, int i11) {
        this.f18673a = context;
        this.f18674b = mVar;
        this.f18677e = view;
        this.f18675c = z10;
        this.f18676d = i10;
    }

    public final u a() {
        u d0Var;
        if (this.f18681i == null) {
            Context context = this.f18673a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(h.d.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(context, this.f18677e, this.f18676d, this.f18675c);
            } else {
                d0Var = new d0(this.f18673a, this.f18674b, this.f18677e, this.f18676d, this.f18675c);
            }
            d0Var.n(this.f18674b);
            d0Var.t(this.k);
            d0Var.p(this.f18677e);
            d0Var.k(this.f18680h);
            d0Var.q(this.f18679g);
            d0Var.r(this.f18678f);
            this.f18681i = d0Var;
        }
        return this.f18681i;
    }

    public final boolean b() {
        u uVar = this.f18681i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.f18681i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        u uVarA = a();
        uVarA.u(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f18678f, this.f18677e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f18677e.getWidth();
            }
            uVarA.s(i10);
            uVarA.v(i11);
            int i12 = (int) ((this.f18673a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uVarA.f18671a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        uVarA.g();
    }
}
