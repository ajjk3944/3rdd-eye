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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class x0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1172a;

    /* renamed from: b, reason: collision with root package name */
    private int f1173b;

    /* renamed from: c, reason: collision with root package name */
    private View f1174c;

    /* renamed from: d, reason: collision with root package name */
    private View f1175d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1176e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1177f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1178g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1179h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f1180i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1181j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1182k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f1183l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1184m;

    /* renamed from: n, reason: collision with root package name */
    private c f1185n;

    /* renamed from: o, reason: collision with root package name */
    private int f1186o;

    /* renamed from: p, reason: collision with root package name */
    private int f1187p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1188q;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final g.a f1189b;

        a() {
            this.f1189b = new g.a(x0.this.f1172a.getContext(), 0, R.id.home, 0, 0, x0.this.f1180i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f1183l;
            if (callback == null || !x0Var.f1184m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1189b);
        }
    }

    class b extends a0.y {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1191a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1192b;

        b(int i2) {
            this.f1192b = i2;
        }

        @Override // a0.x
        public void a(View view) {
            if (this.f1191a) {
                return;
            }
            x0.this.f1172a.setVisibility(this.f1192b);
        }

        @Override // a0.y, a0.x
        public void b(View view) {
            x0.this.f1172a.setVisibility(0);
        }

        @Override // a0.y, a0.x
        public void c(View view) {
            this.f1191a = true;
        }
    }

    public x0(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, a.h.f118a, a.e.f59n);
    }

    public x0(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.f1186o = 0;
        this.f1187p = 0;
        this.f1172a = toolbar;
        this.f1180i = toolbar.getTitle();
        this.f1181j = toolbar.getSubtitle();
        this.f1179h = this.f1180i != null;
        this.f1178g = toolbar.getNavigationIcon();
        w0 w0VarT = w0.t(toolbar.getContext(), null, a.j.f133a, a.a.f2c, 0);
        this.f1188q = w0VarT.f(a.j.f155l);
        if (z2) {
            CharSequence charSequenceO = w0VarT.o(a.j.f167r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                E(charSequenceO);
            }
            CharSequence charSequenceO2 = w0VarT.o(a.j.f163p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                D(charSequenceO2);
            }
            Drawable drawableF = w0VarT.f(a.j.f159n);
            if (drawableF != null) {
                z(drawableF);
            }
            Drawable drawableF2 = w0VarT.f(a.j.f157m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f1178g == null && (drawable = this.f1188q) != null) {
                C(drawable);
            }
            u(w0VarT.j(a.j.f147h, 0));
            int iM = w0VarT.m(a.j.f145g, 0);
            if (iM != 0) {
                x(LayoutInflater.from(this.f1172a.getContext()).inflate(iM, (ViewGroup) this.f1172a, false));
                u(this.f1173b | 16);
            }
            int iL = w0VarT.l(a.j.f151j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1172a.getLayoutParams();
                layoutParams.height = iL;
                this.f1172a.setLayoutParams(layoutParams);
            }
            int iD = w0VarT.d(a.j.f143f, -1);
            int iD2 = w0VarT.d(a.j.f141e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f1172a.H(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = w0VarT.m(a.j.f168s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1172a;
                toolbar2.K(toolbar2.getContext(), iM2);
            }
            int iM3 = w0VarT.m(a.j.f165q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1172a;
                toolbar3.J(toolbar3.getContext(), iM3);
            }
            int iM4 = w0VarT.m(a.j.f161o, 0);
            if (iM4 != 0) {
                this.f1172a.setPopupTheme(iM4);
            }
        } else {
            this.f1173b = w();
        }
        w0VarT.u();
        y(i2);
        this.f1182k = this.f1172a.getNavigationContentDescription();
        this.f1172a.setNavigationOnClickListener(new a());
    }

    private void F(CharSequence charSequence) {
        this.f1180i = charSequence;
        if ((this.f1173b & 8) != 0) {
            this.f1172a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1173b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1182k)) {
                this.f1172a.setNavigationContentDescription(this.f1187p);
            } else {
                this.f1172a.setNavigationContentDescription(this.f1182k);
            }
        }
    }

    private void H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1173b & 4) != 0) {
            toolbar = this.f1172a;
            drawable = this.f1178g;
            if (drawable == null) {
                drawable = this.f1188q;
            }
        } else {
            toolbar = this.f1172a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.f1173b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1177f) == null) {
            drawable = this.f1176e;
        }
        this.f1172a.setLogo(drawable);
    }

    private int w() {
        if (this.f1172a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1188q = this.f1172a.getNavigationIcon();
        return 15;
    }

    public void A(int i2) {
        B(i2 == 0 ? null : t().getString(i2));
    }

    public void B(CharSequence charSequence) {
        this.f1182k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f1178g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f1181j = charSequence;
        if ((this.f1173b & 8) != 0) {
            this.f1172a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f1179h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        return this.f1172a.N();
    }

    @Override // androidx.appcompat.widget.d0
    public void b(Menu menu, j.a aVar) {
        if (this.f1185n == null) {
            c cVar = new c(this.f1172a.getContext());
            this.f1185n = cVar;
            cVar.p(a.f.f78g);
        }
        this.f1185n.d(aVar);
        this.f1172a.I((androidx.appcompat.view.menu.e) menu, this.f1185n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f1172a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f1172a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public void d() {
        this.f1184m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f1172a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f1172a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.f1172a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f1172a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        this.f1172a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public a0.w i(int i2, long j2) {
        return a0.s.b(this.f1172a).a(i2 == 0 ? 1.0f : 0.0f).d(j2).f(new b(i2));
    }

    @Override // androidx.appcompat.widget.d0
    public int j() {
        return this.f1173b;
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i2) {
        this.f1172a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.d0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public boolean m() {
        return this.f1172a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void n(int i2) {
        z(i2 != 0 ? c.a.d(t(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void o(p0 p0Var) {
        View view = this.f1174c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1172a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1174c);
            }
        }
        this.f1174c = p0Var;
        if (p0Var == null || this.f1186o != 2) {
            return;
        }
        this.f1172a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1174c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f365a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup p() {
        return this.f1172a;
    }

    @Override // androidx.appcompat.widget.d0
    public void q(boolean z2) {
    }

    @Override // androidx.appcompat.widget.d0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void s(boolean z2) {
        this.f1172a.setCollapsible(z2);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? c.a.d(t(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f1176e = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1183l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1179h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public Context t() {
        return this.f1172a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public void u(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f1173b ^ i2;
        this.f1173b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1172a.setTitle(this.f1180i);
                    toolbar = this.f1172a;
                    charSequence = this.f1181j;
                } else {
                    charSequence = null;
                    this.f1172a.setTitle((CharSequence) null);
                    toolbar = this.f1172a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f1175d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f1172a.addView(view);
            } else {
                this.f1172a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public int v() {
        return this.f1186o;
    }

    public void x(View view) {
        View view2 = this.f1175d;
        if (view2 != null && (this.f1173b & 16) != 0) {
            this.f1172a.removeView(view2);
        }
        this.f1175d = view;
        if (view == null || (this.f1173b & 16) == 0) {
            return;
        }
        this.f1172a.addView(view);
    }

    public void y(int i2) {
        if (i2 == this.f1187p) {
            return;
        }
        this.f1187p = i2;
        if (TextUtils.isEmpty(this.f1172a.getNavigationContentDescription())) {
            A(this.f1187p);
        }
    }

    public void z(Drawable drawable) {
        this.f1177f = drawable;
        I();
    }
}
