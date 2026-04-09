package h;

import R.O;
import R.S;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import d4.C2272f;
import g.AbstractC2327a;
import h0.C2351a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.MenuC2677k;
import o.InterfaceC2707d;
import o.InterfaceC2714g0;
import o.d1;
import o.i1;

/* loaded from: classes.dex */
public final class H extends com.bumptech.glide.d implements InterfaceC2707d {

    /* renamed from: a, reason: collision with root package name */
    public Context f20282a;

    /* renamed from: b, reason: collision with root package name */
    public Context f20283b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f20284c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f20285d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f20286e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2714g0 f20287f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f20288g;

    /* renamed from: h, reason: collision with root package name */
    public final View f20289h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public G f20290j;

    /* renamed from: k, reason: collision with root package name */
    public G f20291k;

    /* renamed from: l, reason: collision with root package name */
    public C2351a f20292l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20293m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f20294n;

    /* renamed from: o, reason: collision with root package name */
    public int f20295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20296p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20297q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20298r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20299s;

    /* renamed from: t, reason: collision with root package name */
    public C2272f f20300t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20301u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20302v;

    /* renamed from: w, reason: collision with root package name */
    public final F f20303w;

    /* renamed from: x, reason: collision with root package name */
    public final F f20304x;

    /* renamed from: y, reason: collision with root package name */
    public final A0.e f20305y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f20281z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f20280A = new DecelerateInterpolator();

    public H(Activity activity, boolean z6) {
        new ArrayList();
        this.f20294n = new ArrayList();
        this.f20295o = 0;
        this.f20296p = true;
        this.f20299s = true;
        this.f20303w = new F(this, 0);
        this.f20304x = new F(this, 1);
        this.f20305y = new A0.e(29, this);
        this.f20284c = activity;
        View decorView = activity.getWindow().getDecorView();
        e0(decorView);
        if (z6) {
            return;
        }
        this.f20289h = decorView.findViewById(R.id.content);
    }

    @Override // com.bumptech.glide.d
    public final void G() {
        f0(this.f20282a.getResources().getBoolean(com.apm.insight.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // com.bumptech.glide.d
    public final boolean K(int i, KeyEvent keyEvent) {
        MenuC2677k menuC2677k;
        G g2 = this.f20290j;
        if (g2 == null || (menuC2677k = g2.f20276d) == null) {
            return false;
        }
        menuC2677k.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC2677k.performShortcut(i, keyEvent, 0);
    }

    @Override // com.bumptech.glide.d
    public final void R(boolean z6) {
        if (this.i) {
            return;
        }
        S(z6);
    }

    @Override // com.bumptech.glide.d
    public final void S(boolean z6) {
        int i = z6 ? 4 : 0;
        i1 i1Var = (i1) this.f20287f;
        int i3 = i1Var.f22523b;
        this.i = true;
        i1Var.a((i & 4) | (i3 & (-5)));
    }

    @Override // com.bumptech.glide.d
    public final void T(int i) {
        ((i1) this.f20287f).b(i);
    }

    @Override // com.bumptech.glide.d
    public final void U(Drawable drawable) {
        i1 i1Var = (i1) this.f20287f;
        i1Var.f22527f = drawable;
        Toolbar toolbar = i1Var.f22522a;
        if ((i1Var.f22523b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = i1Var.f22535o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // com.bumptech.glide.d
    public final void W(boolean z6) {
        C2272f c2272f;
        this.f20301u = z6;
        if (z6 || (c2272f = this.f20300t) == null) {
            return;
        }
        c2272f.b();
    }

    @Override // com.bumptech.glide.d
    public final void X(String str) {
        i1 i1Var = (i1) this.f20287f;
        i1Var.f22528g = true;
        Toolbar toolbar = i1Var.f22522a;
        i1Var.f22529h = str;
        if ((i1Var.f22523b & 8) != 0) {
            toolbar.setTitle(str);
            if (i1Var.f22528g) {
                O.n(toolbar.getRootView(), str);
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final void Y(CharSequence charSequence) {
        i1 i1Var = (i1) this.f20287f;
        if (i1Var.f22528g) {
            return;
        }
        Toolbar toolbar = i1Var.f22522a;
        i1Var.f22529h = charSequence;
        if ((i1Var.f22523b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i1Var.f22528g) {
                O.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final m.a a0(C2351a c2351a) {
        G g2 = this.f20290j;
        if (g2 != null) {
            g2.a();
        }
        this.f20285d.setHideOnContentScrollEnabled(false);
        this.f20288g.e();
        G g6 = new G(this, this.f20288g.getContext(), c2351a);
        MenuC2677k menuC2677k = g6.f20276d;
        menuC2677k.y();
        try {
            if (!((c1.g) g6.f20277e.f20441b).A(g6, menuC2677k)) {
                return null;
            }
            this.f20290j = g6;
            g6.h();
            this.f20288g.c(g6);
            d0(true);
            return g6;
        } finally {
            menuC2677k.x();
        }
    }

    public final void d0(boolean z6) {
        S sI;
        S sI2;
        if (z6) {
            if (!this.f20298r) {
                this.f20298r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20285d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g0(false);
            }
        } else if (this.f20298r) {
            this.f20298r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20285d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g0(false);
        }
        if (!this.f20286e.isLaidOut()) {
            if (z6) {
                ((i1) this.f20287f).f22522a.setVisibility(4);
                this.f20288g.setVisibility(0);
                return;
            } else {
                ((i1) this.f20287f).f22522a.setVisibility(0);
                this.f20288g.setVisibility(8);
                return;
            }
        }
        if (z6) {
            i1 i1Var = (i1) this.f20287f;
            sI = O.a(i1Var.f22522a);
            sI.a(0.0f);
            sI.c(100L);
            sI.d(new m.i(i1Var, 4));
            sI2 = this.f20288g.i(0, 200L);
        } else {
            i1 i1Var2 = (i1) this.f20287f;
            S sA = O.a(i1Var2.f22522a);
            sA.a(1.0f);
            sA.c(200L);
            sA.d(new m.i(i1Var2, 0));
            sI = this.f20288g.i(8, 100L);
            sI2 = sA;
        }
        C2272f c2272f = new C2272f();
        ArrayList arrayList = c2272f.f19800a;
        arrayList.add(sI);
        View view = (View) sI.f3278a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) sI2.f3278a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(sI2);
        c2272f.c();
    }

    public final void e0(View view) {
        InterfaceC2714g0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.apm.insight.R.id.decor_content_parent);
        this.f20285d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.apm.insight.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC2714g0) {
            wrapper = (InterfaceC2714g0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f20287f = wrapper;
        this.f20288g = (ActionBarContextView) view.findViewById(com.apm.insight.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.apm.insight.R.id.action_bar_container);
        this.f20286e = actionBarContainer;
        InterfaceC2714g0 interfaceC2714g0 = this.f20287f;
        if (interfaceC2714g0 == null || this.f20288g == null || actionBarContainer == null) {
            throw new IllegalStateException(H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((i1) interfaceC2714g0).f22522a.getContext();
        this.f20282a = context;
        if ((((i1) this.f20287f).f22523b & 4) != 0) {
            this.i = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f20287f.getClass();
        f0(context.getResources().getBoolean(com.apm.insight.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f20282a.obtainStyledAttributes(null, AbstractC2327a.f20114a, com.apm.insight.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20285d;
            if (!actionBarOverlayLayout2.f4837g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f20302v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f20286e;
            WeakHashMap weakHashMap = O.f3270a;
            R.F.j(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f0(boolean z6) {
        if (z6) {
            this.f20286e.setTabContainer(null);
            ((i1) this.f20287f).getClass();
        } else {
            ((i1) this.f20287f).getClass();
            this.f20286e.setTabContainer(null);
        }
        this.f20287f.getClass();
        ((i1) this.f20287f).f22522a.setCollapsible(false);
        this.f20285d.setHasNonEmbeddedTabs(false);
    }

    public final void g0(boolean z6) {
        boolean z7 = this.f20297q;
        boolean z8 = this.f20298r;
        A0.e eVar = this.f20305y;
        View view = this.f20289h;
        int i = 1;
        if (!z8 && z7) {
            if (this.f20299s) {
                this.f20299s = false;
                C2272f c2272f = this.f20300t;
                if (c2272f != null) {
                    c2272f.b();
                }
                int i3 = this.f20295o;
                F f2 = this.f20303w;
                if (i3 != 0 || (!this.f20301u && !z6)) {
                    f2.c();
                    return;
                }
                this.f20286e.setAlpha(1.0f);
                this.f20286e.setTransitioning(true);
                C2272f c2272f2 = new C2272f();
                float f5 = -this.f20286e.getHeight();
                if (z6) {
                    this.f20286e.getLocationInWindow(new int[]{0, 0});
                    f5 -= r12[1];
                }
                S sA = O.a(this.f20286e);
                sA.e(f5);
                View view2 = (View) sA.f3278a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(eVar != null ? new B3.m(eVar, i, view2) : null);
                }
                boolean z9 = c2272f2.f19802c;
                ArrayList arrayList = c2272f2.f19800a;
                if (!z9) {
                    arrayList.add(sA);
                }
                if (this.f20296p && view != null) {
                    S sA2 = O.a(view);
                    sA2.e(f5);
                    if (!c2272f2.f19802c) {
                        arrayList.add(sA2);
                    }
                }
                boolean z10 = c2272f2.f19802c;
                if (!z10) {
                    c2272f2.f19803d = f20281z;
                }
                if (!z10) {
                    c2272f2.f19801b = 250L;
                }
                if (!z10) {
                    c2272f2.f19804e = f2;
                }
                this.f20300t = c2272f2;
                c2272f2.c();
                return;
            }
            return;
        }
        if (this.f20299s) {
            return;
        }
        this.f20299s = true;
        C2272f c2272f3 = this.f20300t;
        if (c2272f3 != null) {
            c2272f3.b();
        }
        this.f20286e.setVisibility(0);
        int i6 = this.f20295o;
        F f6 = this.f20304x;
        if (i6 == 0 && (this.f20301u || z6)) {
            this.f20286e.setTranslationY(0.0f);
            float f7 = -this.f20286e.getHeight();
            if (z6) {
                this.f20286e.getLocationInWindow(new int[]{0, 0});
                f7 -= r12[1];
            }
            this.f20286e.setTranslationY(f7);
            C2272f c2272f4 = new C2272f();
            S sA3 = O.a(this.f20286e);
            sA3.e(0.0f);
            View view3 = (View) sA3.f3278a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(eVar != null ? new B3.m(eVar, i, view3) : null);
            }
            boolean z11 = c2272f4.f19802c;
            ArrayList arrayList2 = c2272f4.f19800a;
            if (!z11) {
                arrayList2.add(sA3);
            }
            if (this.f20296p && view != null) {
                view.setTranslationY(f7);
                S sA4 = O.a(view);
                sA4.e(0.0f);
                if (!c2272f4.f19802c) {
                    arrayList2.add(sA4);
                }
            }
            boolean z12 = c2272f4.f19802c;
            if (!z12) {
                c2272f4.f19803d = f20280A;
            }
            if (!z12) {
                c2272f4.f19801b = 250L;
            }
            if (!z12) {
                c2272f4.f19804e = f6;
            }
            this.f20300t = c2272f4;
            c2272f4.c();
        } else {
            this.f20286e.setAlpha(1.0f);
            this.f20286e.setTranslationY(0.0f);
            if (this.f20296p && view != null) {
                view.setTranslationY(0.0f);
            }
            f6.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20285d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = O.f3270a;
            R.D.c(actionBarOverlayLayout);
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean k() {
        d1 d1Var;
        InterfaceC2714g0 interfaceC2714g0 = this.f20287f;
        if (interfaceC2714g0 == null || (d1Var = ((i1) interfaceC2714g0).f22522a.f5011d0) == null || d1Var.f22503b == null) {
            return false;
        }
        d1 d1Var2 = ((i1) interfaceC2714g0).f22522a.f5011d0;
        n.m mVar = d1Var2 == null ? null : d1Var2.f22503b;
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // com.bumptech.glide.d
    public final void q(boolean z6) {
        if (z6 == this.f20293m) {
            return;
        }
        this.f20293m = z6;
        ArrayList arrayList = this.f20294n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // com.bumptech.glide.d
    public final int u() {
        return ((i1) this.f20287f).f22523b;
    }

    @Override // com.bumptech.glide.d
    public final Context y() {
        if (this.f20283b == null) {
            TypedValue typedValue = new TypedValue();
            this.f20282a.getTheme().resolveAttribute(com.apm.insight.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f20283b = new ContextThemeWrapper(this.f20282a, i);
            } else {
                this.f20283b = this.f20282a;
            }
        }
        return this.f20283b;
    }

    public H(Dialog dialog) {
        new ArrayList();
        this.f20294n = new ArrayList();
        this.f20295o = 0;
        this.f20296p = true;
        this.f20299s = true;
        this.f20303w = new F(this, 0);
        this.f20304x = new F(this, 1);
        this.f20305y = new A0.e(29, this);
        e0(dialog.getWindow().getDecorView());
    }
}
