package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
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
import p.i1;
import p.y1;

/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int Q = h.g.abc_popup_menu_item_layout;
    public final int B;
    public final y1 D;
    public PopupWindow.OnDismissListener G;
    public View H;
    public View I;
    public x J;
    public ViewTreeObserver K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public final Context f18579d;

    /* renamed from: g, reason: collision with root package name */
    public final m f18580g;

    /* renamed from: r, reason: collision with root package name */
    public final j f18581r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f18582x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18583y;
    public final d E = new d(1, this);
    public final g1.e F = new g1.e(6, this);
    public int O = 0;

    public d0(Context context, m mVar, View view, int i10, boolean z10) {
        this.f18579d = context;
        this.f18580g = mVar;
        this.f18582x = z10;
        this.f18581r = new j(mVar, LayoutInflater.from(context), z10, Q);
        this.B = i10;
        Resources resources = context.getResources();
        this.f18583y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.abc_config_prefDialogWidth));
        this.H = view;
        this.D = new y1(context, null, i10, 0);
        mVar.b(this, context);
    }

    @Override // o.c0
    public final boolean a() {
        return !this.L && this.D.V.isShowing();
    }

    @Override // o.y
    public final void b(boolean z10) {
        this.M = false;
        j jVar = this.f18581r;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final void c(m mVar, boolean z10) {
        if (mVar != this.f18580g) {
            return;
        }
        dismiss();
        x xVar = this.J;
        if (xVar != null) {
            xVar.c(mVar, z10);
        }
    }

    @Override // o.c0
    public final void dismiss() {
        if (a()) {
            this.D.dismiss();
        }
    }

    @Override // o.y
    public final boolean e() {
        return false;
    }

    @Override // o.y
    public final boolean f(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f18579d, e0Var, this.I, this.f18582x, this.B, 0);
            x xVar = this.J;
            wVar.f18680h = xVar;
            u uVar = wVar.f18681i;
            if (uVar != null) {
                uVar.k(xVar);
            }
            int size = e0Var.f18618f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            wVar.f18679g = z10;
            u uVar2 = wVar.f18681i;
            if (uVar2 != null) {
                uVar2.q(z10);
            }
            wVar.j = this.G;
            this.G = null;
            this.f18580g.c(false);
            y1 y1Var = this.D;
            int width = y1Var.f20176y;
            int iO = y1Var.o();
            if ((Gravity.getAbsoluteGravity(this.O, this.H.getLayoutDirection()) & 7) == 5) {
                width += this.H.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f18677e != null) {
                    wVar.d(width, iO, true, true);
                }
            }
            x xVar2 = this.J;
            if (xVar2 != null) {
                xVar2.Q(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.c0
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.L || (view = this.H) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.I = view;
        y1 y1Var = this.D;
        p.v vVar = y1Var.V;
        p.v vVar2 = y1Var.V;
        vVar.setOnDismissListener(this);
        y1Var.L = this;
        y1Var.U = true;
        vVar2.setFocusable(true);
        View view2 = this.I;
        boolean z10 = this.K == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.K = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.E);
        }
        view2.addOnAttachStateChangeListener(this.F);
        y1Var.K = view2;
        y1Var.H = this.O;
        boolean z11 = this.M;
        Context context = this.f18579d;
        j jVar = this.f18581r;
        if (!z11) {
            this.N = u.o(jVar, context, this.f18583y);
            this.M = true;
        }
        y1Var.r(this.N);
        vVar2.setInputMethodMode(2);
        Rect rect = this.f18671a;
        y1Var.T = rect != null ? new Rect(rect) : null;
        y1Var.g();
        i1 i1Var = y1Var.f20173g;
        i1Var.setOnKeyListener(this);
        if (this.P) {
            m mVar = this.f18580g;
            if (mVar.f18623m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(h.g.abc_popup_menu_header_item_layout, (ViewGroup) i1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f18623m);
                }
                frameLayout.setEnabled(false);
                i1Var.addHeaderView(frameLayout, null, false);
            }
        }
        y1Var.p(jVar);
        y1Var.g();
    }

    @Override // o.c0
    public final i1 j() {
        return this.D.f20173g;
    }

    @Override // o.y
    public final void k(x xVar) {
        this.J = xVar;
    }

    @Override // o.y
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.L = true;
        this.f18580g.c(true);
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.K = this.I.getViewTreeObserver();
            }
            this.K.removeGlobalOnLayoutListener(this.E);
            this.K = null;
        }
        this.I.removeOnAttachStateChangeListener(this.F);
        PopupWindow.OnDismissListener onDismissListener = this.G;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(View view) {
        this.H = view;
    }

    @Override // o.u
    public final void q(boolean z10) {
        this.f18581r.f18608c = z10;
    }

    @Override // o.u
    public final void r(int i10) {
        this.O = i10;
    }

    @Override // o.u
    public final void s(int i10) {
        this.D.f20176y = i10;
    }

    @Override // o.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    @Override // o.u
    public final void u(boolean z10) {
        this.P = z10;
    }

    @Override // o.u
    public final void v(int i10) {
        this.D.l(i10);
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
    }

    @Override // o.u
    public final void n(m mVar) {
    }
}
