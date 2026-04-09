package androidx.appcompat.app;

import F1.AbstractC2749g0;
import F1.C2745e0;
import F1.InterfaceC2747f0;
import F1.InterfaceC2751h0;
import F1.W;
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
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC5487d;
import h.AbstractC5927a;
import h.AbstractC5932f;
import h.AbstractC5936j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class w extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: D, reason: collision with root package name */
    private static final Interpolator f26633D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f26634E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f26638a;

    /* renamed from: b, reason: collision with root package name */
    private Context f26639b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f26640c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f26641d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f26642e;

    /* renamed from: f, reason: collision with root package name */
    J f26643f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f26644g;

    /* renamed from: h, reason: collision with root package name */
    View f26645h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26648k;

    /* renamed from: l, reason: collision with root package name */
    d f26649l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f26650m;

    /* renamed from: n, reason: collision with root package name */
    b.a f26651n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26652o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26654q;

    /* renamed from: t, reason: collision with root package name */
    boolean f26657t;

    /* renamed from: u, reason: collision with root package name */
    boolean f26658u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26659v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f26661x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f26662y;

    /* renamed from: z, reason: collision with root package name */
    boolean f26663z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f26646i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f26647j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f26653p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f26655r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f26656s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26660w = true;

    /* renamed from: A, reason: collision with root package name */
    final InterfaceC2747f0 f26635A = new a();

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC2747f0 f26636B = new b();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC2751h0 f26637C = new c();

    class a extends AbstractC2749g0 {
        a() {
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            View view2;
            w wVar = w.this;
            if (wVar.f26656s && (view2 = wVar.f26645h) != null) {
                view2.setTranslationY(0.0f);
                w.this.f26642e.setTranslationY(0.0f);
            }
            w.this.f26642e.setVisibility(8);
            w.this.f26642e.setTransitioning(false);
            w wVar2 = w.this;
            wVar2.f26661x = null;
            wVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = w.this.f26641d;
            if (actionBarOverlayLayout != null) {
                W.j0(actionBarOverlayLayout);
            }
        }
    }

    class b extends AbstractC2749g0 {
        b() {
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            w wVar = w.this;
            wVar.f26661x = null;
            wVar.f26642e.requestLayout();
        }
    }

    class c implements InterfaceC2751h0 {
        c() {
        }

        @Override // F1.InterfaceC2751h0
        public void a(View view) {
            ((View) w.this.f26642e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f26667c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f26668d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f26669e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f26670f;

        public d(Context context, b.a aVar) {
            this.f26667c = context;
            this.f26669e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f26668d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f26669e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f26669e == null) {
                return;
            }
            k();
            w.this.f26644g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            w wVar = w.this;
            if (wVar.f26649l != this) {
                return;
            }
            if (w.A(wVar.f26657t, wVar.f26658u, false)) {
                this.f26669e.a(this);
            } else {
                w wVar2 = w.this;
                wVar2.f26650m = this;
                wVar2.f26651n = this.f26669e;
            }
            this.f26669e = null;
            w.this.z(false);
            w.this.f26644g.g();
            w wVar3 = w.this;
            wVar3.f26641d.setHideOnContentScrollEnabled(wVar3.f26663z);
            w.this.f26649l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f26670f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f26668d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f26667c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return w.this.f26644g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return w.this.f26644g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (w.this.f26649l != this) {
                return;
            }
            this.f26668d.e0();
            try {
                this.f26669e.c(this, this.f26668d);
            } finally {
                this.f26668d.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return w.this.f26644g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            w.this.f26644g.setCustomView(view);
            this.f26670f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(w.this.f26638a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            w.this.f26644g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(w.this.f26638a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            w.this.f26644g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            w.this.f26644g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f26668d.e0();
            try {
                return this.f26669e.b(this, this.f26668d);
            } finally {
                this.f26668d.d0();
            }
        }
    }

    public w(Activity activity, boolean z10) {
        this.f26640c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z10) {
            return;
        }
        this.f26645h = decorView.findViewById(R.id.content);
    }

    static boolean A(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J E(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void G() {
        if (this.f26659v) {
            this.f26659v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f26641d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC5932f.f48043p);
        this.f26641d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f26643f = E(view.findViewById(AbstractC5932f.f48028a));
        this.f26644g = (ActionBarContextView) view.findViewById(AbstractC5932f.f48033f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC5932f.f48030c);
        this.f26642e = actionBarContainer;
        J j10 = this.f26643f;
        if (j10 == null || this.f26644g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f26638a = j10.getContext();
        boolean z10 = (this.f26643f.r() & 4) != 0;
        if (z10) {
            this.f26648k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f26638a);
        M(aVarB.a() || z10);
        K(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f26638a.obtainStyledAttributes(null, AbstractC5936j.f48189a, AbstractC5927a.f47940c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48239k, false)) {
            L(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5936j.f48229i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void K(boolean z10) {
        this.f26654q = z10;
        if (z10) {
            this.f26642e.setTabContainer(null);
            this.f26643f.i(null);
        } else {
            this.f26643f.i(null);
            this.f26642e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = F() == 2;
        this.f26643f.u(!this.f26654q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f26641d;
        if (!this.f26654q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean N() {
        return this.f26642e.isLaidOut();
    }

    private void O() {
        if (this.f26659v) {
            return;
        }
        this.f26659v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f26641d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        P(false);
    }

    private void P(boolean z10) {
        if (A(this.f26657t, this.f26658u, this.f26659v)) {
            if (this.f26660w) {
                return;
            }
            this.f26660w = true;
            D(z10);
            return;
        }
        if (this.f26660w) {
            this.f26660w = false;
            C(z10);
        }
    }

    void B() {
        b.a aVar = this.f26651n;
        if (aVar != null) {
            aVar.a(this.f26650m);
            this.f26650m = null;
            this.f26651n = null;
        }
    }

    public void C(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f26661x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f26655r != 0 || (!this.f26662y && !z10)) {
            this.f26635A.b(null);
            return;
        }
        this.f26642e.setAlpha(1.0f);
        this.f26642e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f26642e.getHeight();
        if (z10) {
            this.f26642e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C2745e0 c2745e0M = W.e(this.f26642e).m(f10);
        c2745e0M.k(this.f26637C);
        hVar2.c(c2745e0M);
        if (this.f26656s && (view = this.f26645h) != null) {
            hVar2.c(W.e(view).m(f10));
        }
        hVar2.f(f26633D);
        hVar2.e(250L);
        hVar2.g(this.f26635A);
        this.f26661x = hVar2;
        hVar2.h();
    }

    public void D(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f26661x;
        if (hVar != null) {
            hVar.a();
        }
        this.f26642e.setVisibility(0);
        if (this.f26655r == 0 && (this.f26662y || z10)) {
            this.f26642e.setTranslationY(0.0f);
            float f10 = -this.f26642e.getHeight();
            if (z10) {
                this.f26642e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f26642e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C2745e0 c2745e0M = W.e(this.f26642e).m(0.0f);
            c2745e0M.k(this.f26637C);
            hVar2.c(c2745e0M);
            if (this.f26656s && (view2 = this.f26645h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(W.e(this.f26645h).m(0.0f));
            }
            hVar2.f(f26634E);
            hVar2.e(250L);
            hVar2.g(this.f26636B);
            this.f26661x = hVar2;
            hVar2.h();
        } else {
            this.f26642e.setAlpha(1.0f);
            this.f26642e.setTranslationY(0.0f);
            if (this.f26656s && (view = this.f26645h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f26636B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f26641d;
        if (actionBarOverlayLayout != null) {
            W.j0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f26643f.n();
    }

    public void I(int i10, int i11) {
        int iR = this.f26643f.r();
        if ((i11 & 4) != 0) {
            this.f26648k = true;
        }
        this.f26643f.l((i10 & i11) | ((~i11) & iR));
    }

    public void J(float f10) {
        W.t0(this.f26642e, f10);
    }

    public void L(boolean z10) {
        if (z10 && !this.f26641d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f26663z = z10;
        this.f26641d.setHideOnContentScrollEnabled(z10);
    }

    public void M(boolean z10) {
        this.f26643f.q(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f26658u) {
            this.f26658u = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f26656s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f26658u) {
            return;
        }
        this.f26658u = true;
        P(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f26661x;
        if (hVar != null) {
            hVar.a();
            this.f26661x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i10) {
        this.f26655r = i10;
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        J j10 = this.f26643f;
        if (j10 == null || !j10.k()) {
            return false;
        }
        this.f26643f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f26652o) {
            return;
        }
        this.f26652o = z10;
        if (this.f26653p.size() <= 0) {
            return;
        }
        AbstractC5487d.a(this.f26653p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f26643f.r();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f26639b == null) {
            TypedValue typedValue = new TypedValue();
            this.f26638a.getTheme().resolveAttribute(AbstractC5927a.f47942e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f26639b = new ContextThemeWrapper(this.f26638a, i10);
            } else {
                this.f26639b = this.f26638a;
            }
        }
        return this.f26639b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(androidx.appcompat.view.a.b(this.f26638a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f26649l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f26648k) {
            return;
        }
        s(z10);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        I(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.f26643f.j(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f26662y = z10;
        if (z10 || (hVar = this.f26661x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f26643f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f26643f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b y(b.a aVar) {
        d dVar = this.f26649l;
        if (dVar != null) {
            dVar.c();
        }
        this.f26641d.setHideOnContentScrollEnabled(false);
        this.f26644g.k();
        d dVar2 = new d(this.f26644g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f26649l = dVar2;
        dVar2.k();
        this.f26644g.h(dVar2);
        z(true);
        return dVar2;
    }

    public void z(boolean z10) {
        C2745e0 c2745e0O;
        C2745e0 c2745e0F;
        if (z10) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z10) {
                this.f26643f.p(4);
                this.f26644g.setVisibility(0);
                return;
            } else {
                this.f26643f.p(0);
                this.f26644g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c2745e0F = this.f26643f.o(4, 100L);
            c2745e0O = this.f26644g.f(0, 200L);
        } else {
            c2745e0O = this.f26643f.o(0, 200L);
            c2745e0F = this.f26644g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c2745e0F, c2745e0O);
        hVar.h();
    }

    public w(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }
}
