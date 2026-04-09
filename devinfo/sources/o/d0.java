package o;

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
import b5.a1;
import com.liuzh.deviceinfo.R;
import p.g2;
import p.p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f30177b;

    /* renamed from: c, reason: collision with root package name */
    public final m f30178c;

    /* renamed from: d, reason: collision with root package name */
    public final j f30179d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30181f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final g2 f30182h;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f30184k;

    /* renamed from: l, reason: collision with root package name */
    public View f30185l;

    /* renamed from: m, reason: collision with root package name */
    public View f30186m;

    /* renamed from: n, reason: collision with root package name */
    public x f30187n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f30188o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30189p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30190q;

    /* renamed from: r, reason: collision with root package name */
    public int f30191r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30193t;

    /* renamed from: i, reason: collision with root package name */
    public final d f30183i = new d(1, this);
    public final a1 j = new a1(7, this);

    /* renamed from: s, reason: collision with root package name */
    public int f30192s = 0;

    public d0(Context context, m mVar, View view, int i4, boolean z3) {
        this.f30177b = context;
        this.f30178c = mVar;
        this.f30180e = z3;
        this.f30179d = new j(mVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.g = i4;
        Resources resources = context.getResources();
        this.f30181f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f30185l = view;
        this.f30182h = new g2(context, null, i4, 0);
        mVar.b(this, context);
    }

    @Override // o.c0
    public final boolean a() {
        return !this.f30189p && this.f30182h.f30654z.isShowing();
    }

    @Override // o.y
    public final boolean c() {
        return false;
    }

    @Override // o.y
    public final boolean d(e0 e0Var) {
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f30177b, e0Var, this.f30186m, this.f30180e, this.g, 0);
            x xVar = this.f30187n;
            wVar.f30306h = xVar;
            u uVar = wVar.f30307i;
            if (uVar != null) {
                uVar.i(xVar);
            }
            int size = e0Var.f30243f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i4++;
            }
            wVar.g = z3;
            u uVar2 = wVar.f30307i;
            if (uVar2 != null) {
                uVar2.n(z3);
            }
            wVar.j = this.f30184k;
            this.f30184k = null;
            this.f30178c.c(false);
            g2 g2Var = this.f30182h;
            int width = g2Var.f30636f;
            int iN = g2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f30192s, this.f30185l.getLayoutDirection()) & 7) == 5) {
                width += this.f30185l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f30304e != null) {
                    wVar.d(width, iN, true, true);
                }
            }
            x xVar2 = this.f30187n;
            if (xVar2 != null) {
                xVar2.v(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.c0
    public final void dismiss() {
        if (a()) {
            this.f30182h.dismiss();
        }
    }

    @Override // o.y
    public final void e(m mVar, boolean z3) {
        if (mVar != this.f30178c) {
            return;
        }
        dismiss();
        x xVar = this.f30187n;
        if (xVar != null) {
            xVar.e(mVar, z3);
        }
    }

    @Override // o.y
    public final void f() {
        this.f30190q = false;
        j jVar = this.f30179d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final p1 h() {
        return this.f30182h.f30633c;
    }

    @Override // o.y
    public final void i(x xVar) {
        this.f30187n = xVar;
    }

    @Override // o.u
    public final void m(View view) {
        this.f30185l = view;
    }

    @Override // o.u
    public final void n(boolean z3) {
        this.f30179d.f30233c = z3;
    }

    @Override // o.u
    public final void o(int i4) {
        this.f30192s = i4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f30189p = true;
        this.f30178c.c(true);
        ViewTreeObserver viewTreeObserver = this.f30188o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f30188o = this.f30186m.getViewTreeObserver();
            }
            this.f30188o.removeGlobalOnLayoutListener(this.f30183i);
            this.f30188o = null;
        }
        this.f30186m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.f30184k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(int i4) {
        this.f30182h.f30636f = i4;
    }

    @Override // o.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f30184k = onDismissListener;
    }

    @Override // o.u
    public final void r(boolean z3) {
        this.f30193t = z3;
    }

    @Override // o.u
    public final void s(int i4) {
        this.f30182h.k(i4);
    }

    @Override // o.c0
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f30189p || (view = this.f30185l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f30186m = view;
        g2 g2Var = this.f30182h;
        p.y yVar = g2Var.f30654z;
        p.y yVar2 = g2Var.f30654z;
        yVar.setOnDismissListener(this);
        g2Var.f30644p = this;
        g2Var.f30653y = true;
        yVar2.setFocusable(true);
        View view2 = this.f30186m;
        boolean z3 = this.f30188o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f30188o = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f30183i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        g2Var.f30643o = view2;
        g2Var.f30640l = this.f30192s;
        boolean z10 = this.f30190q;
        Context context = this.f30177b;
        j jVar = this.f30179d;
        if (!z10) {
            this.f30191r = u.l(jVar, context, this.f30181f);
            this.f30190q = true;
        }
        g2Var.q(this.f30191r);
        yVar2.setInputMethodMode(2);
        Rect rect = this.f30297a;
        g2Var.f30652x = rect != null ? new Rect(rect) : null;
        g2Var.show();
        p1 p1Var = g2Var.f30633c;
        p1Var.setOnKeyListener(this);
        if (this.f30193t) {
            m mVar = this.f30178c;
            if (mVar.f30248m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f30248m);
                }
                frameLayout.setEnabled(false);
                p1Var.addHeaderView(frameLayout, null, false);
            }
        }
        g2Var.o(jVar);
        g2Var.show();
    }

    @Override // o.u
    public final void k(m mVar) {
    }
}
