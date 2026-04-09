package androidx.appcompat.app;

import a.j;
import a0.s;
import a0.w;
import a0.x;
import a0.y;
import a0.z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
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
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import f.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;

    /* renamed from: a, reason: collision with root package name */
    Context f465a;

    /* renamed from: b, reason: collision with root package name */
    private Context f466b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f467c;

    /* renamed from: d, reason: collision with root package name */
    private Dialog f468d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarOverlayLayout f469e;

    /* renamed from: f, reason: collision with root package name */
    ActionBarContainer f470f;

    /* renamed from: g, reason: collision with root package name */
    d0 f471g;

    /* renamed from: h, reason: collision with root package name */
    ActionBarContextView f472h;

    /* renamed from: i, reason: collision with root package name */
    View f473i;

    /* renamed from: j, reason: collision with root package name */
    p0 f474j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f477m;

    /* renamed from: n, reason: collision with root package name */
    d f478n;

    /* renamed from: o, reason: collision with root package name */
    f.b f479o;

    /* renamed from: p, reason: collision with root package name */
    b.a f480p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f481q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f483s;

    /* renamed from: v, reason: collision with root package name */
    boolean f486v;

    /* renamed from: w, reason: collision with root package name */
    boolean f487w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f488x;

    /* renamed from: z, reason: collision with root package name */
    f.h f490z;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<Object> f475k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private int f476l = -1;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<a.b> f482r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private int f484t = 0;

    /* renamed from: u, reason: collision with root package name */
    boolean f485u = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f489y = true;
    final x C = new a();
    final x D = new b();
    final z E = new c();

    class a extends y {
        a() {
        }

        @Override // a0.x
        public void a(View view) {
            View view2;
            i iVar = i.this;
            if (iVar.f485u && (view2 = iVar.f473i) != null) {
                view2.setTranslationY(0.0f);
                i.this.f470f.setTranslationY(0.0f);
            }
            i.this.f470f.setVisibility(8);
            i.this.f470f.setTransitioning(false);
            i iVar2 = i.this;
            iVar2.f490z = null;
            iVar2.y();
            ActionBarOverlayLayout actionBarOverlayLayout = i.this.f469e;
            if (actionBarOverlayLayout != null) {
                s.N(actionBarOverlayLayout);
            }
        }
    }

    class b extends y {
        b() {
        }

        @Override // a0.x
        public void a(View view) {
            i iVar = i.this;
            iVar.f490z = null;
            iVar.f470f.requestLayout();
        }
    }

    class c implements z {
        c() {
        }

        @Override // a0.z
        public void a(View view) {
            ((View) i.this.f470f.getParent()).invalidate();
        }
    }

    public class d extends f.b implements e.a {

        /* renamed from: d, reason: collision with root package name */
        private final Context f494d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f495e;

        /* renamed from: f, reason: collision with root package name */
        private b.a f496f;

        /* renamed from: g, reason: collision with root package name */
        private WeakReference<View> f497g;

        public d(Context context, b.a aVar) {
            this.f494d = context;
            this.f496f = aVar;
            androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(context).S(1);
            this.f495e = eVarS;
            eVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void a(androidx.appcompat.view.menu.e eVar) {
            if (this.f496f == null) {
                return;
            }
            k();
            i.this.f472h.l();
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f496f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // f.b
        public void c() {
            i iVar = i.this;
            if (iVar.f478n != this) {
                return;
            }
            if (i.x(iVar.f486v, iVar.f487w, false)) {
                this.f496f.b(this);
            } else {
                i iVar2 = i.this;
                iVar2.f479o = this;
                iVar2.f480p = this.f496f;
            }
            this.f496f = null;
            i.this.w(false);
            i.this.f472h.g();
            i.this.f471g.p().sendAccessibilityEvent(32);
            i iVar3 = i.this;
            iVar3.f469e.setHideOnContentScrollEnabled(iVar3.B);
            i.this.f478n = null;
        }

        @Override // f.b
        public View d() {
            WeakReference<View> weakReference = this.f497g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // f.b
        public Menu e() {
            return this.f495e;
        }

        @Override // f.b
        public MenuInflater f() {
            return new f.g(this.f494d);
        }

        @Override // f.b
        public CharSequence g() {
            return i.this.f472h.getSubtitle();
        }

        @Override // f.b
        public CharSequence i() {
            return i.this.f472h.getTitle();
        }

        @Override // f.b
        public void k() {
            if (i.this.f478n != this) {
                return;
            }
            this.f495e.d0();
            try {
                this.f496f.d(this, this.f495e);
            } finally {
                this.f495e.c0();
            }
        }

        @Override // f.b
        public boolean l() {
            return i.this.f472h.j();
        }

        @Override // f.b
        public void m(View view) {
            i.this.f472h.setCustomView(view);
            this.f497g = new WeakReference<>(view);
        }

        @Override // f.b
        public void n(int i2) {
            o(i.this.f465a.getResources().getString(i2));
        }

        @Override // f.b
        public void o(CharSequence charSequence) {
            i.this.f472h.setSubtitle(charSequence);
        }

        @Override // f.b
        public void q(int i2) {
            r(i.this.f465a.getResources().getString(i2));
        }

        @Override // f.b
        public void r(CharSequence charSequence) {
            i.this.f472h.setTitle(charSequence);
        }

        @Override // f.b
        public void s(boolean z2) {
            super.s(z2);
            i.this.f472h.setTitleOptional(z2);
        }

        public boolean t() {
            this.f495e.d0();
            try {
                return this.f496f.a(this, this.f495e);
            } finally {
                this.f495e.c0();
            }
        }
    }

    public i(Activity activity, boolean z2) {
        this.f467c = activity;
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (z2) {
            return;
        }
        this.f473i = decorView.findViewById(R.id.content);
    }

    public i(Dialog dialog) {
        this.f468d = dialog;
        E(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 B(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void D() {
        if (this.f488x) {
            this.f488x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f469e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.f.f87p);
        this.f469e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f471g = B(view.findViewById(a.f.f72a));
        this.f472h = (ActionBarContextView) view.findViewById(a.f.f77f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.f.f74c);
        this.f470f = actionBarContainer;
        d0 d0Var = this.f471g;
        if (d0Var == null || this.f472h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f465a = d0Var.t();
        boolean z2 = (this.f471g.j() & 4) != 0;
        if (z2) {
            this.f477m = true;
        }
        f.a aVarB = f.a.b(this.f465a);
        J(aVarB.a() || z2);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f465a.obtainStyledAttributes(null, j.f133a, a.a.f2c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(j.f153k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f149i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H(boolean z2) {
        this.f483s = z2;
        if (z2) {
            this.f470f.setTabContainer(null);
            this.f471g.o(this.f474j);
        } else {
            this.f471g.o(null);
            this.f470f.setTabContainer(this.f474j);
        }
        boolean z3 = C() == 2;
        p0 p0Var = this.f474j;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f469e;
                if (actionBarOverlayLayout != null) {
                    s.N(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f471g.s(!this.f483s && z3);
        this.f469e.setHasNonEmbeddedTabs(!this.f483s && z3);
    }

    private boolean K() {
        return s.D(this.f470f);
    }

    private void L() {
        if (this.f488x) {
            return;
        }
        this.f488x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f469e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z2) {
        if (x(this.f486v, this.f487w, this.f488x)) {
            if (this.f489y) {
                return;
            }
            this.f489y = true;
            A(z2);
            return;
        }
        if (this.f489y) {
            this.f489y = false;
            z(z2);
        }
    }

    static boolean x(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    public void A(boolean z2) {
        View view;
        View view2;
        f.h hVar = this.f490z;
        if (hVar != null) {
            hVar.a();
        }
        this.f470f.setVisibility(0);
        if (this.f484t == 0 && (this.A || z2)) {
            this.f470f.setTranslationY(0.0f);
            float f2 = -this.f470f.getHeight();
            if (z2) {
                this.f470f.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f470f.setTranslationY(f2);
            f.h hVar2 = new f.h();
            w wVarK = s.b(this.f470f).k(0.0f);
            wVarK.i(this.E);
            hVar2.c(wVarK);
            if (this.f485u && (view2 = this.f473i) != null) {
                view2.setTranslationY(f2);
                hVar2.c(s.b(this.f473i).k(0.0f));
            }
            hVar2.f(G);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.f490z = hVar2;
            hVar2.h();
        } else {
            this.f470f.setAlpha(1.0f);
            this.f470f.setTranslationY(0.0f);
            if (this.f485u && (view = this.f473i) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f469e;
        if (actionBarOverlayLayout != null) {
            s.N(actionBarOverlayLayout);
        }
    }

    public int C() {
        return this.f471g.v();
    }

    public void F(int i2, int i3) {
        int iJ = this.f471g.j();
        if ((i3 & 4) != 0) {
            this.f477m = true;
        }
        this.f471g.u((i2 & i3) | ((i3 ^ (-1)) & iJ));
    }

    public void G(float f2) {
        s.U(this.f470f, f2);
    }

    public void I(boolean z2) {
        if (z2 && !this.f469e.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z2;
        this.f469e.setHideOnContentScrollEnabled(z2);
    }

    public void J(boolean z2) {
        this.f471g.q(z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        f.h hVar = this.f490z;
        if (hVar != null) {
            hVar.a();
            this.f490z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b(boolean z2) {
        this.f485u = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i2) {
        this.f484t = i2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f487w) {
            return;
        }
        this.f487w = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f487w) {
            this.f487w = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        d0 d0Var = this.f471g;
        if (d0Var == null || !d0Var.m()) {
            return false;
        }
        this.f471g.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z2) {
        if (z2 == this.f481q) {
            return;
        }
        this.f481q = z2;
        int size = this.f482r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f482r.get(i2).a(z2);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f471g.j();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f466b == null) {
            TypedValue typedValue = new TypedValue();
            this.f465a.getTheme().resolveAttribute(a.a.f6g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f466b = new ContextThemeWrapper(this.f465a, i2);
            } else {
                this.f466b = this.f465a;
            }
        }
        return this.f466b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(f.a.b(this.f465a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f478n;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z2) {
        if (this.f477m) {
            return;
        }
        s(z2);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z2) {
        F(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z2) {
        f.h hVar;
        this.A = z2;
        if (z2 || (hVar = this.f490z) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.f471g.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public f.b v(b.a aVar) {
        d dVar = this.f478n;
        if (dVar != null) {
            dVar.c();
        }
        this.f469e.setHideOnContentScrollEnabled(false);
        this.f472h.k();
        d dVar2 = new d(this.f472h.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f478n = dVar2;
        dVar2.k();
        this.f472h.h(dVar2);
        w(true);
        this.f472h.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void w(boolean z2) {
        w wVarI;
        w wVarF;
        if (z2) {
            L();
        } else {
            D();
        }
        if (!K()) {
            if (z2) {
                this.f471g.k(4);
                this.f472h.setVisibility(0);
                return;
            } else {
                this.f471g.k(0);
                this.f472h.setVisibility(8);
                return;
            }
        }
        if (z2) {
            wVarF = this.f471g.i(4, 100L);
            wVarI = this.f472h.f(0, 200L);
        } else {
            wVarI = this.f471g.i(0, 200L);
            wVarF = this.f472h.f(8, 100L);
        }
        f.h hVar = new f.h();
        hVar.d(wVarF, wVarI);
        hVar.h();
    }

    void y() {
        b.a aVar = this.f480p;
        if (aVar != null) {
            aVar.b(this.f479o);
            this.f479o = null;
            this.f480p = null;
        }
    }

    public void z(boolean z2) {
        View view;
        f.h hVar = this.f490z;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f484t != 0 || (!this.A && !z2)) {
            this.C.a(null);
            return;
        }
        this.f470f.setAlpha(1.0f);
        this.f470f.setTransitioning(true);
        f.h hVar2 = new f.h();
        float f2 = -this.f470f.getHeight();
        if (z2) {
            this.f470f.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        w wVarK = s.b(this.f470f).k(f2);
        wVarK.i(this.E);
        hVar2.c(wVarK);
        if (this.f485u && (view = this.f473i) != null) {
            hVar2.c(s.b(view).k(f2));
        }
        hVar2.f(F);
        hVar2.e(250L);
        hVar2.g(this.C);
        this.f490z = hVar2;
        hVar2.h();
    }
}
