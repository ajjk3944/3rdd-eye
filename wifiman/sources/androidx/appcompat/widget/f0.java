package androidx.appcompat.widget;

import F1.AbstractC2749g0;
import F1.C2745e0;
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
import androidx.appcompat.view.menu.j;
import h.AbstractC5927a;
import h.AbstractC5931e;
import h.AbstractC5932f;
import h.AbstractC5934h;
import h.AbstractC5936j;
import i.AbstractC6050a;
import l.C6520a;

/* loaded from: classes.dex */
public class f0 implements J {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f27373a;

    /* renamed from: b, reason: collision with root package name */
    private int f27374b;

    /* renamed from: c, reason: collision with root package name */
    private View f27375c;

    /* renamed from: d, reason: collision with root package name */
    private View f27376d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f27377e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f27378f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f27379g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27380h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f27381i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f27382j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f27383k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f27384l;

    /* renamed from: m, reason: collision with root package name */
    boolean f27385m;

    /* renamed from: n, reason: collision with root package name */
    private C3878c f27386n;

    /* renamed from: o, reason: collision with root package name */
    private int f27387o;

    /* renamed from: p, reason: collision with root package name */
    private int f27388p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f27389q;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final C6520a f27390a;

        a() {
            this.f27390a = new C6520a(f0.this.f27373a.getContext(), 0, R.id.home, 0, 0, f0.this.f27381i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0 f0Var = f0.this;
            Window.Callback callback = f0Var.f27384l;
            if (callback == null || !f0Var.f27385m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f27390a);
        }
    }

    class b extends AbstractC2749g0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27392a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27393b;

        b(int i10) {
            this.f27393b = i10;
        }

        @Override // F1.AbstractC2749g0, F1.InterfaceC2747f0
        public void a(View view) {
            this.f27392a = true;
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            if (this.f27392a) {
                return;
            }
            f0.this.f27373a.setVisibility(this.f27393b);
        }

        @Override // F1.AbstractC2749g0, F1.InterfaceC2747f0
        public void c(View view) {
            f0.this.f27373a.setVisibility(0);
        }
    }

    public f0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, AbstractC5934h.f48071a, AbstractC5931e.f48010n);
    }

    private void C(CharSequence charSequence) {
        this.f27381i = charSequence;
        if ((this.f27374b & 8) != 0) {
            this.f27373a.setTitle(charSequence);
            if (this.f27380h) {
                F1.W.p0(this.f27373a.getRootView(), charSequence);
            }
        }
    }

    private void D() {
        if ((this.f27374b & 4) != 0) {
            if (TextUtils.isEmpty(this.f27383k)) {
                this.f27373a.setNavigationContentDescription(this.f27388p);
            } else {
                this.f27373a.setNavigationContentDescription(this.f27383k);
            }
        }
    }

    private void E() {
        if ((this.f27374b & 4) == 0) {
            this.f27373a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f27373a;
        Drawable drawable = this.f27379g;
        if (drawable == null) {
            drawable = this.f27389q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void F() {
        Drawable drawable;
        int i10 = this.f27374b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f27378f) == null) {
            drawable = this.f27377e;
        }
        this.f27373a.setLogo(drawable);
    }

    private int v() {
        if (this.f27373a.getNavigationIcon() == null) {
            return 11;
        }
        this.f27389q = this.f27373a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f27379g = drawable;
        E();
    }

    public void B(CharSequence charSequence) {
        this.f27382j = charSequence;
        if ((this.f27374b & 8) != 0) {
            this.f27373a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.J
    public void a(Menu menu, j.a aVar) {
        if (this.f27386n == null) {
            C3878c c3878c = new C3878c(this.f27373a.getContext());
            this.f27386n = c3878c;
            c3878c.p(AbstractC5932f.f48034g);
        }
        this.f27386n.h(aVar);
        this.f27373a.L((androidx.appcompat.view.menu.e) menu, this.f27386n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean b() {
        return this.f27373a.C();
    }

    @Override // androidx.appcompat.widget.J
    public void c() {
        this.f27385m = true;
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f27373a.e();
    }

    @Override // androidx.appcompat.widget.J
    public boolean d() {
        return this.f27373a.d();
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f27373a.B();
    }

    @Override // androidx.appcompat.widget.J
    public boolean f() {
        return this.f27373a.x();
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f27373a.R();
    }

    @Override // androidx.appcompat.widget.J
    public Context getContext() {
        return this.f27373a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public CharSequence getTitle() {
        return this.f27373a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public void h() {
        this.f27373a.f();
    }

    @Override // androidx.appcompat.widget.J
    public void i(W w10) {
        View view = this.f27375c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f27373a;
            if (parent == toolbar) {
                toolbar.removeView(this.f27375c);
            }
        }
        this.f27375c = w10;
    }

    @Override // androidx.appcompat.widget.J
    public void j(Drawable drawable) {
        this.f27378f = drawable;
        F();
    }

    @Override // androidx.appcompat.widget.J
    public boolean k() {
        return this.f27373a.w();
    }

    @Override // androidx.appcompat.widget.J
    public void l(int i10) {
        View view;
        int i11 = this.f27374b ^ i10;
        this.f27374b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    D();
                }
                E();
            }
            if ((i11 & 3) != 0) {
                F();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f27373a.setTitle(this.f27381i);
                    this.f27373a.setSubtitle(this.f27382j);
                } else {
                    this.f27373a.setTitle((CharSequence) null);
                    this.f27373a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f27376d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f27373a.addView(view);
            } else {
                this.f27373a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public void m(int i10) {
        j(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public int n() {
        return this.f27387o;
    }

    @Override // androidx.appcompat.widget.J
    public C2745e0 o(int i10, long j10) {
        return F1.W.e(this.f27373a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.J
    public void p(int i10) {
        this.f27373a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.J
    public void q(boolean z10) {
    }

    @Override // androidx.appcompat.widget.J
    public int r() {
        return this.f27374b;
    }

    @Override // androidx.appcompat.widget.J
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setTitle(CharSequence charSequence) {
        this.f27380h = true;
        C(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(Window.Callback callback) {
        this.f27384l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f27380h) {
            return;
        }
        C(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void u(boolean z10) {
        this.f27373a.setCollapsible(z10);
    }

    public void w(View view) {
        View view2 = this.f27376d;
        if (view2 != null && (this.f27374b & 16) != 0) {
            this.f27373a.removeView(view2);
        }
        this.f27376d = view;
        if (view == null || (this.f27374b & 16) == 0) {
            return;
        }
        this.f27373a.addView(view);
    }

    public void x(int i10) {
        if (i10 == this.f27388p) {
            return;
        }
        this.f27388p = i10;
        if (TextUtils.isEmpty(this.f27373a.getNavigationContentDescription())) {
            y(this.f27388p);
        }
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f27383k = charSequence;
        D();
    }

    public f0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f27387o = 0;
        this.f27388p = 0;
        this.f27373a = toolbar;
        this.f27381i = toolbar.getTitle();
        this.f27382j = toolbar.getSubtitle();
        this.f27380h = this.f27381i != null;
        this.f27379g = toolbar.getNavigationIcon();
        b0 b0VarV = b0.v(toolbar.getContext(), null, AbstractC5936j.f48189a, AbstractC5927a.f47940c, 0);
        this.f27389q = b0VarV.g(AbstractC5936j.f48244l);
        if (z10) {
            CharSequence charSequenceP = b0VarV.p(AbstractC5936j.f48269r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = b0VarV.p(AbstractC5936j.f48261p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            Drawable drawableG = b0VarV.g(AbstractC5936j.f48253n);
            if (drawableG != null) {
                j(drawableG);
            }
            Drawable drawableG2 = b0VarV.g(AbstractC5936j.f48249m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f27379g == null && (drawable = this.f27389q) != null) {
                A(drawable);
            }
            l(b0VarV.k(AbstractC5936j.f48224h, 0));
            int iN = b0VarV.n(AbstractC5936j.f48219g, 0);
            if (iN != 0) {
                w(LayoutInflater.from(this.f27373a.getContext()).inflate(iN, (ViewGroup) this.f27373a, false));
                l(this.f27374b | 16);
            }
            int iM = b0VarV.m(AbstractC5936j.f48234j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f27373a.getLayoutParams();
                layoutParams.height = iM;
                this.f27373a.setLayoutParams(layoutParams);
            }
            int iE = b0VarV.e(AbstractC5936j.f48214f, -1);
            int iE2 = b0VarV.e(AbstractC5936j.f48209e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f27373a.K(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = b0VarV.n(AbstractC5936j.f48273s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f27373a;
                toolbar2.O(toolbar2.getContext(), iN2);
            }
            int iN3 = b0VarV.n(AbstractC5936j.f48265q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f27373a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = b0VarV.n(AbstractC5936j.f48257o, 0);
            if (iN4 != 0) {
                this.f27373a.setPopupTheme(iN4);
            }
        } else {
            this.f27374b = v();
        }
        b0VarV.x();
        x(i10);
        this.f27383k = this.f27373a.getNavigationContentDescription();
        this.f27373a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(Drawable drawable) {
        this.f27377e = drawable;
        F();
    }
}
