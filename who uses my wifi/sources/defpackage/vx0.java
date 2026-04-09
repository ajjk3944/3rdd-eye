package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vx0 extends xd0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final od0 h;
    public final ld0 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final de0 m;
    public PopupWindow.OnDismissListener p;
    public View q;
    public View r;
    public ee0 s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean y;
    public final y6 n = new y6(3, this);
    public final ud o = new ud(5, this);
    public int x = 0;

    public vx0(Context context, od0 od0Var, View view, int i, boolean z) {
        this.g = context;
        this.h = od0Var;
        this.j = z;
        this.i = new ld0(od0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.q = view;
        this.m = new de0(context, null, i, 0);
        od0Var.b(this, context);
    }

    @Override // defpackage.uv0
    public final boolean a() {
        return !this.u && this.m.E.isShowing();
    }

    @Override // defpackage.uv0
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.u || (view = this.q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.r = view;
        de0 de0Var = this.m;
        r6 r6Var = de0Var.E;
        r6 r6Var2 = de0Var.E;
        r6Var.setOnDismissListener(this);
        de0Var.u = this;
        de0Var.D = true;
        r6Var2.setFocusable(true);
        View view2 = this.r;
        boolean z = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.n);
        }
        view2.addOnAttachStateChangeListener(this.o);
        de0Var.t = view2;
        de0Var.q = this.x;
        boolean z2 = this.v;
        Context context = this.g;
        ld0 ld0Var = this.i;
        if (!z2) {
            this.w = xd0.m(ld0Var, context, this.k);
            this.v = true;
        }
        de0Var.r(this.w);
        r6Var2.setInputMethodMode(2);
        Rect rect = this.f;
        de0Var.C = rect != null ? new Rect(rect) : null;
        de0Var.c();
        kq kqVar = de0Var.h;
        kqVar.setOnKeyListener(this);
        if (this.y) {
            od0 od0Var = this.h;
            if (od0Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) kqVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(od0Var.m);
                }
                frameLayout.setEnabled(false);
                kqVar.addHeaderView(frameLayout, null, false);
            }
        }
        de0Var.p(ld0Var);
        de0Var.c();
    }

    @Override // defpackage.fe0
    public final void d(ee0 ee0Var) {
        this.s = ee0Var;
    }

    @Override // defpackage.uv0
    public final void dismiss() {
        if (a()) {
            this.m.dismiss();
        }
    }

    @Override // defpackage.fe0
    public final void f(od0 od0Var, boolean z) {
        if (od0Var != this.h) {
            return;
        }
        dismiss();
        ee0 ee0Var = this.s;
        if (ee0Var != null) {
            ee0Var.f(od0Var, z);
        }
    }

    @Override // defpackage.fe0
    public final void g() {
        this.v = false;
        ld0 ld0Var = this.i;
        if (ld0Var != null) {
            ld0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.uv0
    public final kq h() {
        return this.m.h;
    }

    @Override // defpackage.fe0
    public final boolean j(uy0 uy0Var) {
        boolean z;
        if (uy0Var.hasVisibleItems()) {
            zd0 zd0Var = new zd0(this.g, uy0Var, this.r, this.j, this.l, 0);
            ee0 ee0Var = this.s;
            zd0Var.h = ee0Var;
            xd0 xd0Var = zd0Var.i;
            if (xd0Var != null) {
                xd0Var.d(ee0Var);
            }
            int size = uy0Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = uy0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            zd0Var.g = z;
            xd0 xd0Var2 = zd0Var.i;
            if (xd0Var2 != null) {
                xd0Var2.o(z);
            }
            zd0Var.j = this.p;
            this.p = null;
            this.h.c(false);
            de0 de0Var = this.m;
            int width = de0Var.k;
            int iN = de0Var.n();
            if ((Gravity.getAbsoluteGravity(this.x, this.q.getLayoutDirection()) & 7) == 5) {
                width += this.q.getWidth();
            }
            if (!zd0Var.b()) {
                if (zd0Var.e != null) {
                    zd0Var.d(width, iN, true, true);
                }
            }
            ee0 ee0Var2 = this.s;
            if (ee0Var2 != null) {
                ee0Var2.r(uy0Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.fe0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.xd0
    public final void n(View view) {
        this.q = view;
    }

    @Override // defpackage.xd0
    public final void o(boolean z) {
        this.i.h = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.u = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.xd0
    public final void p(int i) {
        this.x = i;
    }

    @Override // defpackage.xd0
    public final void q(int i) {
        this.m.k = i;
    }

    @Override // defpackage.xd0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override // defpackage.xd0
    public final void s(boolean z) {
        this.y = z;
    }

    @Override // defpackage.xd0
    public final void t(int i) {
        this.m.g(i);
    }

    @Override // defpackage.xd0
    public final void l(od0 od0Var) {
    }
}
