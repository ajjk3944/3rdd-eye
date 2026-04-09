package i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h7.r1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.n2;
import p.r2;
import p.z0;

/* loaded from: classes.dex */
public final class m0 extends xu.l implements p.c {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public Context f11073c;

    /* renamed from: d, reason: collision with root package name */
    public Context f11074d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f11075e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f11076f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f11077g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContextView f11078h;

    /* renamed from: i, reason: collision with root package name */
    public final View f11079i;
    public boolean j;
    public l0 k;

    /* renamed from: l, reason: collision with root package name */
    public l0 f11080l;

    /* renamed from: m, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f11081m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11082n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f11083o;

    /* renamed from: p, reason: collision with root package name */
    public int f11084p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11085q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11086r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11087s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11088t;

    /* renamed from: u, reason: collision with root package name */
    public n.j f11089u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11090v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11091w;

    /* renamed from: x, reason: collision with root package name */
    public final k0 f11092x;

    /* renamed from: y, reason: collision with root package name */
    public final k0 f11093y;

    /* renamed from: z, reason: collision with root package name */
    public final r1 f11094z;

    public m0(Activity activity, boolean z10) {
        new ArrayList();
        this.f11083o = new ArrayList();
        this.f11084p = 0;
        this.f11085q = true;
        this.f11088t = true;
        this.f11092x = new k0(this, 0);
        this.f11093y = new k0(this, 1);
        this.f11094z = new r1(5, this);
        View decorView = activity.getWindow().getDecorView();
        g0(decorView);
        if (z10) {
            return;
        }
        this.f11079i = decorView.findViewById(R.id.content);
    }

    @Override // xu.l
    public final void J() {
        h0(this.f11073c.getResources().getBoolean(h.b.abc_action_bar_embed_tabs));
    }

    @Override // xu.l
    public final boolean L(int i10, KeyEvent keyEvent) {
        o.m mVar;
        l0 l0Var = this.k;
        if (l0Var == null || (mVar = l0Var.f11071x) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // xu.l
    public final void R(boolean z10) {
        if (this.j) {
            return;
        }
        S(z10);
    }

    @Override // xu.l
    public final void S(boolean z10) {
        int i10 = z10 ? 4 : 0;
        r2 r2Var = (r2) this.f11077g;
        int i11 = r2Var.f20153b;
        this.j = true;
        r2Var.a((i10 & 4) | (i11 & (-5)));
    }

    @Override // xu.l
    public final void T() {
        this.f11077g.getClass();
    }

    @Override // xu.l
    public final void U(boolean z10) {
        n.j jVar;
        this.f11090v = z10;
        if (z10 || (jVar = this.f11089u) == null) {
            return;
        }
        jVar.a();
    }

    @Override // xu.l
    public final void V(CharSequence charSequence) {
        r2 r2Var = (r2) this.f11077g;
        if (r2Var.f20158g) {
            return;
        }
        Toolbar toolbar = r2Var.f20152a;
        r2Var.f20159h = charSequence;
        if ((r2Var.f20153b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r2Var.f20158g) {
                u3.i0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // xu.l
    public final n.a W(io.sentry.internal.debugmeta.c cVar) {
        l0 l0Var = this.k;
        if (l0Var != null) {
            l0Var.b();
        }
        this.f11075e.setHideOnContentScrollEnabled(false);
        this.f11078h.e();
        l0 l0Var2 = new l0(this, this.f11078h.getContext(), cVar);
        o.m mVar = l0Var2.f11071x;
        mVar.w();
        try {
            if (!((js.e) l0Var2.f11072y.f12353d).m0(l0Var2, mVar)) {
                return null;
            }
            this.k = l0Var2;
            l0Var2.i();
            this.f11078h.c(l0Var2);
            f0(true);
            return l0Var2;
        } finally {
            mVar.v();
        }
    }

    public final void f0(boolean z10) {
        u3.l0 l0VarI;
        u3.l0 l0VarI2;
        if (z10) {
            if (!this.f11087s) {
                this.f11087s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11075e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                i0(false);
            }
        } else if (this.f11087s) {
            this.f11087s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11075e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            i0(false);
        }
        if (!this.f11076f.isLaidOut()) {
            if (z10) {
                ((r2) this.f11077g).f20152a.setVisibility(4);
                this.f11078h.setVisibility(0);
                return;
            } else {
                ((r2) this.f11077g).f20152a.setVisibility(0);
                this.f11078h.setVisibility(8);
                return;
            }
        }
        if (z10) {
            r2 r2Var = (r2) this.f11077g;
            l0VarI = u3.i0.a(r2Var.f20152a);
            l0VarI.a(0.0f);
            l0VarI.c(100L);
            l0VarI.d(new n.i(r2Var, 4));
            l0VarI2 = this.f11078h.i(0, 200L);
        } else {
            r2 r2Var2 = (r2) this.f11077g;
            u3.l0 l0VarA = u3.i0.a(r2Var2.f20152a);
            l0VarA.a(1.0f);
            l0VarA.c(200L);
            l0VarA.d(new n.i(r2Var2, 0));
            l0VarI = this.f11078h.i(8, 100L);
            l0VarI2 = l0VarA;
        }
        n.j jVar = new n.j();
        ArrayList arrayList = jVar.f17121a;
        arrayList.add(l0VarI);
        View view = (View) l0VarI.f23192a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l0VarI2.f23192a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l0VarI2);
        jVar.b();
    }

    @Override // xu.l
    public final boolean g() {
        n2 n2Var;
        z0 z0Var = this.f11077g;
        if (z0Var == null || (n2Var = ((r2) z0Var).f20152a.f1025l0) == null || n2Var.f20121d == null) {
            return false;
        }
        n2 n2Var2 = ((r2) z0Var).f20152a.f1025l0;
        o.o oVar = n2Var2 == null ? null : n2Var2.f20121d;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    public final void g0(View view) {
        z0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.f.decor_content_parent);
        this.f11075e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(h.f.action_bar);
        if (callbackFindViewById instanceof z0) {
            wrapper = (z0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f11077g = wrapper;
        this.f11078h = (ActionBarContextView) view.findViewById(h.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.f.action_bar_container);
        this.f11076f = actionBarContainer;
        z0 z0Var = this.f11077g;
        if (z0Var == null || this.f11078h == null || actionBarContainer == null) {
            throw new IllegalStateException(m0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((r2) z0Var).f20152a.getContext();
        this.f11073c = context;
        if ((((r2) this.f11077g).f20153b & 4) != 0) {
            this.j = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        T();
        h0(context.getResources().getBoolean(h.b.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f11073c.obtainStyledAttributes(null, h.j.ActionBar, h.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11075e;
            if (!actionBarOverlayLayout2.B) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f11091w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f11076f;
            WeakHashMap weakHashMap = u3.i0.f23177a;
            u3.z.i(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void h0(boolean z10) {
        if (z10) {
            this.f11076f.setTabContainer(null);
            ((r2) this.f11077g).getClass();
        } else {
            ((r2) this.f11077g).getClass();
            this.f11076f.setTabContainer(null);
        }
        this.f11077g.getClass();
        ((r2) this.f11077g).f20152a.setCollapsible(false);
        this.f11075e.setHasNonEmbeddedTabs(false);
    }

    public final void i0(boolean z10) {
        boolean z11 = this.f11086r;
        boolean z12 = this.f11087s;
        r1 r1Var = this.f11094z;
        View view = this.f11079i;
        int i10 = 1;
        if (!z12 && z11) {
            if (this.f11088t) {
                this.f11088t = false;
                n.j jVar = this.f11089u;
                if (jVar != null) {
                    jVar.a();
                }
                int i11 = this.f11084p;
                k0 k0Var = this.f11092x;
                if (i11 != 0 || (!this.f11090v && !z10)) {
                    k0Var.c();
                    return;
                }
                this.f11076f.setAlpha(1.0f);
                this.f11076f.setTransitioning(true);
                n.j jVar2 = new n.j();
                float f10 = -this.f11076f.getHeight();
                if (z10) {
                    this.f11076f.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                u3.l0 l0VarA = u3.i0.a(this.f11076f);
                l0VarA.e(f10);
                View view2 = (View) l0VarA.f23192a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(r1Var != null ? new gd.b(r1Var, i10, view2) : null);
                }
                boolean z13 = jVar2.f17125e;
                ArrayList arrayList = jVar2.f17121a;
                if (!z13) {
                    arrayList.add(l0VarA);
                }
                if (this.f11085q && view != null) {
                    u3.l0 l0VarA2 = u3.i0.a(view);
                    l0VarA2.e(f10);
                    if (!jVar2.f17125e) {
                        arrayList.add(l0VarA2);
                    }
                }
                boolean z14 = jVar2.f17125e;
                if (!z14) {
                    jVar2.f17123c = A;
                }
                if (!z14) {
                    jVar2.f17122b = 250L;
                }
                if (!z14) {
                    jVar2.f17124d = k0Var;
                }
                this.f11089u = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f11088t) {
            return;
        }
        this.f11088t = true;
        n.j jVar3 = this.f11089u;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f11076f.setVisibility(0);
        int i12 = this.f11084p;
        k0 k0Var2 = this.f11093y;
        if (i12 == 0 && (this.f11090v || z10)) {
            this.f11076f.setTranslationY(0.0f);
            float f11 = -this.f11076f.getHeight();
            if (z10) {
                this.f11076f.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.f11076f.setTranslationY(f11);
            n.j jVar4 = new n.j();
            u3.l0 l0VarA3 = u3.i0.a(this.f11076f);
            l0VarA3.e(0.0f);
            View view3 = (View) l0VarA3.f23192a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(r1Var != null ? new gd.b(r1Var, i10, view3) : null);
            }
            boolean z15 = jVar4.f17125e;
            ArrayList arrayList2 = jVar4.f17121a;
            if (!z15) {
                arrayList2.add(l0VarA3);
            }
            if (this.f11085q && view != null) {
                view.setTranslationY(f11);
                u3.l0 l0VarA4 = u3.i0.a(view);
                l0VarA4.e(0.0f);
                if (!jVar4.f17125e) {
                    arrayList2.add(l0VarA4);
                }
            }
            boolean z16 = jVar4.f17125e;
            if (!z16) {
                jVar4.f17123c = B;
            }
            if (!z16) {
                jVar4.f17122b = 250L;
            }
            if (!z16) {
                jVar4.f17124d = k0Var2;
            }
            this.f11089u = jVar4;
            jVar4.b();
        } else {
            this.f11076f.setAlpha(1.0f);
            this.f11076f.setTranslationY(0.0f);
            if (this.f11085q && view != null) {
                view.setTranslationY(0.0f);
            }
            k0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f11075e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = u3.i0.f23177a;
            u3.x.c(actionBarOverlayLayout);
        }
    }

    @Override // xu.l
    public final void n(boolean z10) {
        if (z10 == this.f11082n) {
            return;
        }
        this.f11082n = z10;
        ArrayList arrayList = this.f11083o;
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
    }

    @Override // xu.l
    public final int s() {
        return ((r2) this.f11077g).f20153b;
    }

    @Override // xu.l
    public final Context y() {
        if (this.f11074d == null) {
            TypedValue typedValue = new TypedValue();
            this.f11073c.getTheme().resolveAttribute(h.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f11074d = new ContextThemeWrapper(this.f11073c, i10);
            } else {
                this.f11074d = this.f11073c;
            }
        }
        return this.f11074d;
    }

    public m0(Dialog dialog) {
        new ArrayList();
        this.f11083o = new ArrayList();
        this.f11084p = 0;
        this.f11085q = true;
        this.f11088t = true;
        this.f11092x = new k0(this, 0);
        this.f11093y = new k0(this, 1);
        this.f11094z = new r1(5, this);
        g0(dialog.getWindow().getDecorView());
    }
}
