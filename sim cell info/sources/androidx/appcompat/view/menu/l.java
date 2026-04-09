package androidx.appcompat.view.menu;

import a0.s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w, reason: collision with root package name */
    private static final int f664w = a.g.f110m;

    /* renamed from: c, reason: collision with root package name */
    private final Context f665c;

    /* renamed from: d, reason: collision with root package name */
    private final e f666d;

    /* renamed from: e, reason: collision with root package name */
    private final d f667e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f668f;

    /* renamed from: g, reason: collision with root package name */
    private final int f669g;

    /* renamed from: h, reason: collision with root package name */
    private final int f670h;

    /* renamed from: i, reason: collision with root package name */
    private final int f671i;

    /* renamed from: j, reason: collision with root package name */
    final l0 f672j;

    /* renamed from: m, reason: collision with root package name */
    private PopupWindow.OnDismissListener f675m;

    /* renamed from: n, reason: collision with root package name */
    private View f676n;

    /* renamed from: o, reason: collision with root package name */
    View f677o;

    /* renamed from: p, reason: collision with root package name */
    private j.a f678p;

    /* renamed from: q, reason: collision with root package name */
    ViewTreeObserver f679q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f680r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f681s;

    /* renamed from: t, reason: collision with root package name */
    private int f682t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f684v;

    /* renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f673k = new a();

    /* renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f674l = new b();

    /* renamed from: u, reason: collision with root package name */
    private int f683u = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f672j.x()) {
                return;
            }
            View view = l.this.f677o;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f672j.i();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f679q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f679q = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f679q.removeGlobalOnLayoutListener(lVar.f673k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i2, int i3, boolean z2) {
        this.f665c = context;
        this.f666d = eVar;
        this.f668f = z2;
        this.f667e = new d(eVar, LayoutInflater.from(context), z2, f664w);
        this.f670h = i2;
        this.f671i = i3;
        Resources resources = context.getResources();
        this.f669g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.f37d));
        this.f676n = view;
        this.f672j = new l0(context, null, i2, i3);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f680r || (view = this.f676n) == null) {
            return false;
        }
        this.f677o = view;
        this.f672j.G(this);
        this.f672j.H(this);
        this.f672j.F(true);
        View view2 = this.f677o;
        boolean z2 = this.f679q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f679q = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f673k);
        }
        view2.addOnAttachStateChangeListener(this.f674l);
        this.f672j.z(view2);
        this.f672j.C(this.f683u);
        if (!this.f681s) {
            this.f682t = h.o(this.f667e, null, this.f665c, this.f669g);
            this.f681s = true;
        }
        this.f672j.B(this.f682t);
        this.f672j.E(2);
        this.f672j.D(n());
        this.f672j.i();
        ListView listViewE = this.f672j.e();
        listViewE.setOnKeyListener(this);
        if (this.f684v && this.f666d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f665c).inflate(a.g.f109l, (ViewGroup) listViewE, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f666d.x());
            }
            frameLayout.setEnabled(false);
            listViewE.addHeaderView(frameLayout, null, false);
        }
        this.f672j.o(this.f667e);
        this.f672j.i();
        return true;
    }

    @Override // g.e
    public boolean a() {
        return !this.f680r && this.f672j.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        if (eVar != this.f666d) {
            return;
        }
        dismiss();
        j.a aVar = this.f678p;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f678p = aVar;
    }

    @Override // g.e
    public void dismiss() {
        if (a()) {
            this.f672j.dismiss();
        }
    }

    @Override // g.e
    public ListView e() {
        return this.f672j.e();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f665c, mVar, this.f677o, this.f668f, this.f670h, this.f671i);
            iVar.j(this.f678p);
            iVar.g(h.x(mVar));
            iVar.i(this.f675m);
            this.f675m = null;
            this.f666d.e(false);
            int iD = this.f672j.d();
            int iJ = this.f672j.j();
            if ((Gravity.getAbsoluteGravity(this.f683u, s.t(this.f676n)) & 7) == 5) {
                iD += this.f676n.getWidth();
            }
            if (iVar.n(iD, iJ)) {
                j.a aVar = this.f678p;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z2) {
        this.f681s = false;
        d dVar = this.f667e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // g.e
    public void i() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f680r = true;
        this.f666d.close();
        ViewTreeObserver viewTreeObserver = this.f679q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f679q = this.f677o.getViewTreeObserver();
            }
            this.f679q.removeGlobalOnLayoutListener(this.f673k);
            this.f679q = null;
        }
        this.f677o.removeOnAttachStateChangeListener(this.f674l);
        PopupWindow.OnDismissListener onDismissListener = this.f675m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f676n = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z2) {
        this.f667e.d(z2);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i2) {
        this.f683u = i2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i2) {
        this.f672j.c(i2);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f675m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z2) {
        this.f684v = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i2) {
        this.f672j.m(i2);
    }
}
