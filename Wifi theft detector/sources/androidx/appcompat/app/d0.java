package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.t0;
import androidx.core.view.ViewCompat;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.i1;
import androidx.core.view.j1;
import h.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d0 extends ActionBar implements ActionBarOverlayLayout.d {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public Context f543a;

    /* renamed from: b, reason: collision with root package name */
    public Context f544b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f545c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f546d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f547e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f548f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f549g;

    /* renamed from: h, reason: collision with root package name */
    public View f550h;

    /* renamed from: i, reason: collision with root package name */
    public t0 f551i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f554l;

    /* renamed from: m, reason: collision with root package name */
    public d f555m;

    /* renamed from: n, reason: collision with root package name */
    public h.b f556n;

    /* renamed from: o, reason: collision with root package name */
    public b.a f557o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f558p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f560r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f563u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f564v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f565w;

    /* renamed from: y, reason: collision with root package name */
    public h.h f567y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f568z;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f552j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f553k = -1;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f559q = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public int f561s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f562t = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f566x = true;
    public final h1 B = new a();
    public final h1 C = new b();
    public final j1 D = new c();

    public class a extends i1 {
        public a() {
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            View view2;
            d0 d0Var = d0.this;
            if (d0Var.f562t && (view2 = d0Var.f550h) != null) {
                view2.setTranslationY(0.0f);
                d0.this.f547e.setTranslationY(0.0f);
            }
            d0.this.f547e.setVisibility(8);
            d0.this.f547e.setTransitioning(false);
            d0 d0Var2 = d0.this;
            d0Var2.f567y = null;
            d0Var2.z();
            ActionBarOverlayLayout actionBarOverlayLayout = d0.this.f546d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.g0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends i1 {
        public b() {
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            d0 d0Var = d0.this;
            d0Var.f567y = null;
            d0Var.f547e.requestLayout();
        }
    }

    public class c implements j1 {
        public c() {
        }

        @Override // androidx.core.view.j1
        public void a(View view) {
            ((View) d0.this.f547e.getParent()).invalidate();
        }
    }

    public class d extends h.b implements d.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f572c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f573d;

        /* renamed from: e, reason: collision with root package name */
        public b.a f574e;

        /* renamed from: f, reason: collision with root package name */
        public WeakReference f575f;

        public d(Context context, b.a aVar) {
            this.f572c = context;
            this.f574e = aVar;
            androidx.appcompat.view.menu.d dVarX = new androidx.appcompat.view.menu.d(context).X(1);
            this.f573d = dVarX;
            dVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.a aVar = this.f574e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            if (this.f574e == null) {
                return;
            }
            k();
            d0.this.f549g.l();
        }

        @Override // h.b
        public void c() {
            d0 d0Var = d0.this;
            if (d0Var.f555m != this) {
                return;
            }
            if (d0.y(d0Var.f563u, d0Var.f564v, false)) {
                this.f574e.d(this);
            } else {
                d0 d0Var2 = d0.this;
                d0Var2.f556n = this;
                d0Var2.f557o = this.f574e;
            }
            this.f574e = null;
            d0.this.x(false);
            d0.this.f549g.g();
            d0 d0Var3 = d0.this;
            d0Var3.f546d.setHideOnContentScrollEnabled(d0Var3.A);
            d0.this.f555m = null;
        }

        @Override // h.b
        public View d() {
            WeakReference weakReference = this.f575f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // h.b
        public Menu e() {
            return this.f573d;
        }

        @Override // h.b
        public MenuInflater f() {
            return new h.g(this.f572c);
        }

        @Override // h.b
        public CharSequence g() {
            return d0.this.f549g.getSubtitle();
        }

        @Override // h.b
        public CharSequence i() {
            return d0.this.f549g.getTitle();
        }

        @Override // h.b
        public void k() {
            if (d0.this.f555m != this) {
                return;
            }
            this.f573d.i0();
            try {
                this.f574e.b(this, this.f573d);
            } finally {
                this.f573d.h0();
            }
        }

        @Override // h.b
        public boolean l() {
            return d0.this.f549g.j();
        }

        @Override // h.b
        public void m(View view) {
            d0.this.f549g.setCustomView(view);
            this.f575f = new WeakReference(view);
        }

        @Override // h.b
        public void n(int i10) {
            o(d0.this.f543a.getResources().getString(i10));
        }

        @Override // h.b
        public void o(CharSequence charSequence) {
            d0.this.f549g.setSubtitle(charSequence);
        }

        @Override // h.b
        public void q(int i10) {
            r(d0.this.f543a.getResources().getString(i10));
        }

        @Override // h.b
        public void r(CharSequence charSequence) {
            d0.this.f549g.setTitle(charSequence);
        }

        @Override // h.b
        public void s(boolean z10) {
            super.s(z10);
            d0.this.f549g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f573d.i0();
            try {
                return this.f574e.a(this, this.f573d);
            } finally {
                this.f573d.h0();
            }
        }
    }

    public d0(Activity activity, boolean z10) {
        this.f545c = activity;
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z10) {
            return;
        }
        this.f550h = decorView.findViewById(R.id.content);
    }

    public static boolean y(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public void A(boolean z10) {
        View view;
        h.h hVar = this.f567y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f561s != 0 || (!this.f568z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f547e.setAlpha(1.0f);
        this.f547e.setTransitioning(true);
        h.h hVar2 = new h.h();
        float f10 = -this.f547e.getHeight();
        if (z10) {
            this.f547e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        g1 g1VarL = ViewCompat.e(this.f547e).l(f10);
        g1VarL.j(this.D);
        hVar2.c(g1VarL);
        if (this.f562t && (view = this.f550h) != null) {
            hVar2.c(ViewCompat.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f567y = hVar2;
        hVar2.h();
    }

    public void B(boolean z10) {
        View view;
        View view2;
        h.h hVar = this.f567y;
        if (hVar != null) {
            hVar.a();
        }
        this.f547e.setVisibility(0);
        if (this.f561s == 0 && (this.f568z || z10)) {
            this.f547e.setTranslationY(0.0f);
            float f10 = -this.f547e.getHeight();
            if (z10) {
                this.f547e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f547e.setTranslationY(f10);
            h.h hVar2 = new h.h();
            g1 g1VarL = ViewCompat.e(this.f547e).l(0.0f);
            g1VarL.j(this.D);
            hVar2.c(g1VarL);
            if (this.f562t && (view2 = this.f550h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(ViewCompat.e(this.f550h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f567y = hVar2;
            hVar2.h();
        } else {
            this.f547e.setAlpha(1.0f);
            this.f547e.setTranslationY(0.0f);
            if (this.f562t && (view = this.f550h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f546d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.g0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 C(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int D() {
        return this.f548f.k();
    }

    public final void E() {
        if (this.f565w) {
            this.f565w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f546d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    public final void F(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(c.f.decor_content_parent);
        this.f546d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f548f = C(view.findViewById(c.f.action_bar));
        this.f549g = (ActionBarContextView) view.findViewById(c.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(c.f.action_bar_container);
        this.f547e = actionBarContainer;
        e0 e0Var = this.f548f;
        if (e0Var == null || this.f549g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f543a = e0Var.getContext();
        boolean z10 = (this.f548f.v() & 4) != 0;
        if (z10) {
            this.f554l = true;
        }
        h.a aVarB = h.a.b(this.f543a);
        K(aVarB.a() || z10);
        I(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f543a.obtainStyledAttributes(null, c.j.ActionBar, c.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.ActionBar_hideOnContentScroll, false)) {
            J(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            H(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void G(int i10, int i11) {
        int iV = this.f548f.v();
        if ((i11 & 4) != 0) {
            this.f554l = true;
        }
        this.f548f.i((i10 & i11) | ((~i11) & iV));
    }

    public void H(float f10) {
        ViewCompat.p0(this.f547e, f10);
    }

    public final void I(boolean z10) {
        this.f560r = z10;
        if (z10) {
            this.f547e.setTabContainer(null);
            this.f548f.s(this.f551i);
        } else {
            this.f548f.s(null);
            this.f547e.setTabContainer(this.f551i);
        }
        boolean z11 = D() == 2;
        t0 t0Var = this.f551i;
        if (t0Var != null) {
            if (z11) {
                t0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f546d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.g0(actionBarOverlayLayout);
                }
            } else {
                t0Var.setVisibility(8);
            }
        }
        this.f548f.q(!this.f560r && z11);
        this.f546d.setHasNonEmbeddedTabs(!this.f560r && z11);
    }

    public void J(boolean z10) {
        if (z10 && !this.f546d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f546d.setHideOnContentScrollEnabled(z10);
    }

    public void K(boolean z10) {
        this.f548f.n(z10);
    }

    public final boolean L() {
        return this.f547e.isLaidOut();
    }

    public final void M() {
        if (this.f565w) {
            return;
        }
        this.f565w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f546d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        N(false);
    }

    public final void N(boolean z10) {
        if (y(this.f563u, this.f564v, this.f565w)) {
            if (this.f566x) {
                return;
            }
            this.f566x = true;
            B(z10);
            return;
        }
        if (this.f566x) {
            this.f566x = false;
            A(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f564v) {
            this.f564v = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f562t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f564v) {
            return;
        }
        this.f564v = true;
        N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        h.h hVar = this.f567y;
        if (hVar != null) {
            hVar.a();
            this.f567y = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean g() {
        e0 e0Var = this.f548f;
        if (e0Var == null || !e0Var.h()) {
            return false;
        }
        this.f548f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(boolean z10) {
        if (z10 == this.f558p) {
            return;
        }
        this.f558p = z10;
        if (this.f559q.size() <= 0) {
            return;
        }
        z.a(this.f559q.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int i() {
        return this.f548f.v();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context j() {
        if (this.f544b == null) {
            TypedValue typedValue = new TypedValue();
            this.f543a.getTheme().resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f544b = new ContextThemeWrapper(this.f543a, i10);
            } else {
                this.f544b = this.f543a;
            }
        }
        return this.f544b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l(Configuration configuration) {
        I(h.a.b(this.f543a).g());
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f555m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f561s = i10;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q(boolean z10) {
        if (this.f554l) {
            return;
        }
        r(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(boolean z10) {
        G(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s(int i10) {
        this.f548f.o(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t(Drawable drawable) {
        this.f548f.x(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u(boolean z10) {
        h.h hVar;
        this.f568z = z10;
        if (z10 || (hVar = this.f567y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v(CharSequence charSequence) {
        this.f548f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public h.b w(b.a aVar) {
        d dVar = this.f555m;
        if (dVar != null) {
            dVar.c();
        }
        this.f546d.setHideOnContentScrollEnabled(false);
        this.f549g.k();
        d dVar2 = new d(this.f549g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f555m = dVar2;
        dVar2.k();
        this.f549g.h(dVar2);
        x(true);
        return dVar2;
    }

    public void x(boolean z10) {
        g1 g1VarL;
        g1 g1VarF;
        if (z10) {
            M();
        } else {
            E();
        }
        if (!L()) {
            if (z10) {
                this.f548f.setVisibility(4);
                this.f549g.setVisibility(0);
                return;
            } else {
                this.f548f.setVisibility(0);
                this.f549g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            g1VarF = this.f548f.l(4, 100L);
            g1VarL = this.f549g.f(0, 200L);
        } else {
            g1VarL = this.f548f.l(0, 200L);
            g1VarF = this.f549g.f(8, 100L);
        }
        h.h hVar = new h.h();
        hVar.d(g1VarF, g1VarL);
        hVar.h();
    }

    public void z() {
        b.a aVar = this.f557o;
        if (aVar != null) {
            aVar.d(this.f556n);
            this.f556n = null;
            this.f557o = null;
        }
    }

    public d0(Dialog dialog) {
        F(dialog.getWindow().getDecorView());
    }
}
