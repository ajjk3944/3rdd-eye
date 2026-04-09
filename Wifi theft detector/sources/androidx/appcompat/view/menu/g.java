package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.core.view.r;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f769a;

    /* renamed from: b, reason: collision with root package name */
    public final d f770b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f771c;

    /* renamed from: d, reason: collision with root package name */
    public final int f772d;

    /* renamed from: e, reason: collision with root package name */
    public final int f773e;

    /* renamed from: f, reason: collision with root package name */
    public View f774f;

    /* renamed from: g, reason: collision with root package name */
    public int f775g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f776h;

    /* renamed from: i, reason: collision with root package name */
    public h.a f777i;

    /* renamed from: j, reason: collision with root package name */
    public i.d f778j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f779k;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f780l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            g.this.e();
        }
    }

    public g(Context context, d dVar, View view, boolean z10, int i10) {
        this(context, dVar, view, z10, i10, 0);
    }

    public final i.d a() {
        Display defaultDisplay = ((WindowManager) this.f769a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        i.d cascadingMenuPopup = Math.min(point.x, point.y) >= this.f769a.getResources().getDimensionPixelSize(c.d.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.f769a, this.f774f, this.f772d, this.f773e, this.f771c) : new j(this.f769a, this.f770b, this.f774f, this.f772d, this.f773e, this.f771c);
        cascadingMenuPopup.l(this.f770b);
        cascadingMenuPopup.v(this.f780l);
        cascadingMenuPopup.q(this.f774f);
        cascadingMenuPopup.d(this.f777i);
        cascadingMenuPopup.s(this.f776h);
        cascadingMenuPopup.t(this.f775g);
        return cascadingMenuPopup;
    }

    public void b() {
        if (d()) {
            this.f778j.dismiss();
        }
    }

    public i.d c() {
        if (this.f778j == null) {
            this.f778j = a();
        }
        return this.f778j;
    }

    public boolean d() {
        i.d dVar = this.f778j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f778j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f779k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f774f = view;
    }

    public void g(boolean z10) {
        this.f776h = z10;
        i.d dVar = this.f778j;
        if (dVar != null) {
            dVar.s(z10);
        }
    }

    public void h(int i10) {
        this.f775g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f779k = onDismissListener;
    }

    public void j(h.a aVar) {
        this.f777i = aVar;
        i.d dVar = this.f778j;
        if (dVar != null) {
            dVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i10, int i11, boolean z10, boolean z11) {
        i.d dVarC = c();
        dVarC.w(z11);
        if (z10) {
            if ((r.b(this.f775g, this.f774f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f774f.getWidth();
            }
            dVarC.u(i10);
            dVarC.x(i11);
            int i12 = (int) ((this.f769a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.r(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        dVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f774f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f774f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public g(Context context, d dVar, View view, boolean z10, int i10, int i11) {
        this.f775g = 8388611;
        this.f780l = new a();
        this.f769a = context;
        this.f770b = dVar;
        this.f774f = view;
        this.f771c = z10;
        this.f772d = i10;
        this.f773e = i11;
    }
}
