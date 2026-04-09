package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class d1 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f1113a;

    /* renamed from: b, reason: collision with root package name */
    public int f1114b;

    /* renamed from: c, reason: collision with root package name */
    public View f1115c;

    /* renamed from: d, reason: collision with root package name */
    public View f1116d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1117e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1118f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f1119g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1120h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1121i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1122j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1123k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f1124l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1125m;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f1126n;

    /* renamed from: o, reason: collision with root package name */
    public int f1127o;

    /* renamed from: p, reason: collision with root package name */
    public int f1128p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1129q;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final i.a f1130a;

        public a() {
            this.f1130a = new i.a(d1.this.f1113a.getContext(), 0, R.id.home, 0, 0, d1.this.f1121i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1 d1Var = d1.this;
            Window.Callback callback = d1Var.f1124l;
            if (callback == null || !d1Var.f1125m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1130a);
        }
    }

    public class b extends androidx.core.view.i1 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1132a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1133b;

        public b(int i10) {
            this.f1133b = i10;
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public void a(View view) {
            this.f1132a = true;
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            if (this.f1132a) {
                return;
            }
            d1.this.f1113a.setVisibility(this.f1133b);
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public void c(View view) {
            d1.this.f1113a.setVisibility(0);
        }
    }

    public d1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, c.h.abc_action_bar_up_description, c.e.abc_ic_ab_back_material);
    }

    public void A(int i10) {
        if (i10 == this.f1128p) {
            return;
        }
        this.f1128p = i10;
        if (TextUtils.isEmpty(this.f1113a.getNavigationContentDescription())) {
            o(this.f1128p);
        }
    }

    public void B(Drawable drawable) {
        this.f1118f = drawable;
        I();
    }

    public void C(CharSequence charSequence) {
        this.f1123k = charSequence;
        G();
    }

    public void D(CharSequence charSequence) {
        this.f1122j = charSequence;
        if ((this.f1114b & 8) != 0) {
            this.f1113a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f1120h = true;
        F(charSequence);
    }

    public final void F(CharSequence charSequence) {
        this.f1121i = charSequence;
        if ((this.f1114b & 8) != 0) {
            this.f1113a.setTitle(charSequence);
            if (this.f1120h) {
                ViewCompat.l0(this.f1113a.getRootView(), charSequence);
            }
        }
    }

    public final void G() {
        if ((this.f1114b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1123k)) {
                this.f1113a.setNavigationContentDescription(this.f1128p);
            } else {
                this.f1113a.setNavigationContentDescription(this.f1123k);
            }
        }
    }

    public final void H() {
        if ((this.f1114b & 4) == 0) {
            this.f1113a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1113a;
        Drawable drawable = this.f1119g;
        if (drawable == null) {
            drawable = this.f1129q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void I() {
        Drawable drawable;
        int i10 = this.f1114b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1118f) == null) {
            drawable = this.f1117e;
        }
        this.f1113a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean a() {
        return this.f1113a.d();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean b() {
        return this.f1113a.w();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean c() {
        return this.f1113a.Q();
    }

    @Override // androidx.appcompat.widget.e0
    public void collapseActionView() {
        this.f1113a.e();
    }

    @Override // androidx.appcompat.widget.e0
    public void d(Menu menu, h.a aVar) {
        if (this.f1126n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1113a.getContext());
            this.f1126n = actionMenuPresenter;
            actionMenuPresenter.r(c.f.action_menu_presenter);
        }
        this.f1126n.d(aVar);
        this.f1113a.K((androidx.appcompat.view.menu.d) menu, this.f1126n);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean e() {
        return this.f1113a.B();
    }

    @Override // androidx.appcompat.widget.e0
    public void f() {
        this.f1125m = true;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean g() {
        return this.f1113a.A();
    }

    @Override // androidx.appcompat.widget.e0
    public Context getContext() {
        return this.f1113a.getContext();
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence getTitle() {
        return this.f1113a.getTitle();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean h() {
        return this.f1113a.v();
    }

    @Override // androidx.appcompat.widget.e0
    public void i(int i10) {
        View view;
        int i11 = this.f1114b ^ i10;
        this.f1114b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1113a.setTitle(this.f1121i);
                    this.f1113a.setSubtitle(this.f1122j);
                } else {
                    this.f1113a.setTitle((CharSequence) null);
                    this.f1113a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1116d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1113a.addView(view);
            } else {
                this.f1113a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.e0
    public Menu j() {
        return this.f1113a.getMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public int k() {
        return this.f1127o;
    }

    @Override // androidx.appcompat.widget.e0
    public androidx.core.view.g1 l(int i10, long j10) {
        return ViewCompat.e(this.f1113a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.e0
    public ViewGroup m() {
        return this.f1113a;
    }

    @Override // androidx.appcompat.widget.e0
    public void n(boolean z10) {
    }

    @Override // androidx.appcompat.widget.e0
    public void o(int i10) {
        C(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.e0
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void q(boolean z10) {
        this.f1113a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.e0
    public void r() {
        this.f1113a.f();
    }

    @Override // androidx.appcompat.widget.e0
    public void s(t0 t0Var) {
        View view = this.f1115c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1113a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1115c);
            }
        }
        this.f1115c = t0Var;
        if (t0Var == null || this.f1127o != 2) {
            return;
        }
        this.f1113a.addView(t0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1115c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f336a = 8388691;
        t0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setVisibility(int i10) {
        this.f1113a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowCallback(Window.Callback callback) {
        this.f1124l = callback;
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1120h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void t(int i10) {
        B(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void u(h.a aVar, d.a aVar2) {
        this.f1113a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.e0
    public int v() {
        return this.f1114b;
    }

    @Override // androidx.appcompat.widget.e0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void x(Drawable drawable) {
        this.f1119g = drawable;
        H();
    }

    public final int y() {
        if (this.f1113a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1129q = this.f1113a.getNavigationIcon();
        return 15;
    }

    public void z(View view) {
        View view2 = this.f1116d;
        if (view2 != null && (this.f1114b & 16) != 0) {
            this.f1113a.removeView(view2);
        }
        this.f1116d = view;
        if (view == null || (this.f1114b & 16) == 0) {
            return;
        }
        this.f1113a.addView(view);
    }

    public d1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1127o = 0;
        this.f1128p = 0;
        this.f1113a = toolbar;
        this.f1121i = toolbar.getTitle();
        this.f1122j = toolbar.getSubtitle();
        this.f1120h = this.f1121i != null;
        this.f1119g = toolbar.getNavigationIcon();
        z0 z0VarV = z0.v(toolbar.getContext(), null, c.j.ActionBar, c.a.actionBarStyle, 0);
        this.f1129q = z0VarV.g(c.j.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence charSequenceP = z0VarV.p(c.j.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceP)) {
                E(charSequenceP);
            }
            CharSequence charSequenceP2 = z0VarV.p(c.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                D(charSequenceP2);
            }
            Drawable drawableG = z0VarV.g(c.j.ActionBar_logo);
            if (drawableG != null) {
                B(drawableG);
            }
            Drawable drawableG2 = z0VarV.g(c.j.ActionBar_icon);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1119g == null && (drawable = this.f1129q) != null) {
                x(drawable);
            }
            i(z0VarV.k(c.j.ActionBar_displayOptions, 0));
            int iN = z0VarV.n(c.j.ActionBar_customNavigationLayout, 0);
            if (iN != 0) {
                z(LayoutInflater.from(this.f1113a.getContext()).inflate(iN, (ViewGroup) this.f1113a, false));
                i(this.f1114b | 16);
            }
            int iM = z0VarV.m(c.j.ActionBar_height, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1113a.getLayoutParams();
                layoutParams.height = iM;
                this.f1113a.setLayoutParams(layoutParams);
            }
            int iE = z0VarV.e(c.j.ActionBar_contentInsetStart, -1);
            int iE2 = z0VarV.e(c.j.ActionBar_contentInsetEnd, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1113a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = z0VarV.n(c.j.ActionBar_titleTextStyle, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1113a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = z0VarV.n(c.j.ActionBar_subtitleTextStyle, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1113a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = z0VarV.n(c.j.ActionBar_popupTheme, 0);
            if (iN4 != 0) {
                this.f1113a.setPopupTheme(iN4);
            }
        } else {
            this.f1114b = y();
        }
        z0VarV.x();
        A(i10);
        this.f1123k = this.f1113a.getNavigationContentDescription();
        this.f1113a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(Drawable drawable) {
        this.f1117e = drawable;
        I();
    }
}
