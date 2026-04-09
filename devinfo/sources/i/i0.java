package i;

import a0.x0;
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
import e4.a1;
import e4.c1;
import e4.k0;
import e4.m0;
import e4.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.f1;
import p.i3;
import p.n3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends wd.b implements p.d {
    public static final AccelerateInterpolator B = new AccelerateInterpolator();
    public static final DecelerateInterpolator C = new DecelerateInterpolator();
    public final p6.i A;

    /* renamed from: b, reason: collision with root package name */
    public Context f25305b;

    /* renamed from: c, reason: collision with root package name */
    public Context f25306c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f25307d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f25308e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f25309f;
    public f1 g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContextView f25310h;

    /* renamed from: i, reason: collision with root package name */
    public final View f25311i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f25312k;

    /* renamed from: l, reason: collision with root package name */
    public h0 f25313l;

    /* renamed from: m, reason: collision with root package name */
    public yb.i f25314m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25315n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f25316o;

    /* renamed from: p, reason: collision with root package name */
    public int f25317p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25318q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25319r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25320s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25321t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25322u;

    /* renamed from: v, reason: collision with root package name */
    public n.j f25323v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25324w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25325x;

    /* renamed from: y, reason: collision with root package name */
    public final g0 f25326y;

    /* renamed from: z, reason: collision with root package name */
    public final g0 f25327z;

    public i0(Activity activity, boolean z3) {
        new ArrayList();
        this.f25316o = new ArrayList();
        this.f25317p = 0;
        this.f25318q = true;
        this.f25322u = true;
        this.f25326y = new g0(this, 0);
        this.f25327z = new g0(this, 1);
        this.A = new p6.i(this);
        this.f25307d = activity;
        View decorView = activity.getWindow().getDecorView();
        W(decorView);
        if (z3) {
            return;
        }
        this.f25311i = decorView.findViewById(R.id.content);
    }

    @Override // wd.b
    public final void D() {
        X(this.f25305b.getResources().getBoolean(com.liuzh.deviceinfo.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // wd.b
    public final boolean F(int i4, KeyEvent keyEvent) {
        o.m mVar;
        h0 h0Var = this.f25312k;
        if (h0Var == null || (mVar = h0Var.f25300e) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i4, keyEvent, 0);
    }

    @Override // wd.b
    public final void P(boolean z3) {
        if (this.j) {
            return;
        }
        Q(z3);
    }

    @Override // wd.b
    public final void Q(boolean z3) {
        int i4 = z3 ? 4 : 0;
        n3 n3Var = (n3) this.g;
        int i10 = n3Var.f30780b;
        this.j = true;
        n3Var.a((i4 & 4) | (i10 & (-5)));
    }

    @Override // wd.b
    public final void R(boolean z3) {
        n.j jVar;
        this.f25324w = z3;
        if (z3 || (jVar = this.f25323v) == null) {
            return;
        }
        jVar.a();
    }

    @Override // wd.b
    public final void T(CharSequence charSequence) {
        n3 n3Var = (n3) this.g;
        if (n3Var.g) {
            return;
        }
        Toolbar toolbar = n3Var.f30779a;
        n3Var.f30785h = charSequence;
        if ((n3Var.f30780b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (n3Var.g) {
                v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // wd.b
    public final n.a U(yb.i iVar) {
        h0 h0Var = this.f25312k;
        if (h0Var != null) {
            h0Var.d();
        }
        this.f25308e.setHideOnContentScrollEnabled(false);
        this.f25310h.e();
        h0 h0Var2 = new h0(this, this.f25310h.getContext(), iVar);
        o.m mVar = h0Var2.f25300e;
        mVar.w();
        try {
            if (!((x0) h0Var2.f25301f.f37516b).H(h0Var2, mVar)) {
                return null;
            }
            this.f25312k = h0Var2;
            h0Var2.k();
            this.f25310h.c(h0Var2);
            V(true);
            return h0Var2;
        } finally {
            mVar.v();
        }
    }

    public final void V(boolean z3) {
        c1 c1VarI;
        c1 c1VarI2;
        if (z3) {
            if (!this.f25321t) {
                this.f25321t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f25308e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Y(false);
            }
        } else if (this.f25321t) {
            this.f25321t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25308e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Y(false);
        }
        if (!this.f25309f.isLaidOut()) {
            if (z3) {
                ((n3) this.g).f30779a.setVisibility(4);
                this.f25310h.setVisibility(0);
                return;
            } else {
                ((n3) this.g).f30779a.setVisibility(0);
                this.f25310h.setVisibility(8);
                return;
            }
        }
        if (z3) {
            n3 n3Var = (n3) this.g;
            c1VarI = v0.b(n3Var.f30779a);
            c1VarI.a(0.0f);
            c1VarI.c(100L);
            c1VarI.d(new n.i(n3Var, 4));
            c1VarI2 = this.f25310h.i(0, 200L);
        } else {
            n3 n3Var2 = (n3) this.g;
            c1 c1VarB = v0.b(n3Var2.f30779a);
            c1VarB.a(1.0f);
            c1VarB.c(200L);
            c1VarB.d(new n.i(n3Var2, 0));
            c1VarI = this.f25310h.i(8, 100L);
            c1VarI2 = c1VarB;
        }
        n.j jVar = new n.j();
        ArrayList arrayList = jVar.f29491a;
        arrayList.add(c1VarI);
        View view = (View) c1VarI.f22313a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c1VarI2.f22313a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c1VarI2);
        jVar.b();
    }

    public final void W(View view) {
        f1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.liuzh.deviceinfo.R.id.decor_content_parent);
        this.f25308e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.liuzh.deviceinfo.R.id.action_bar);
        if (callbackFindViewById instanceof f1) {
            wrapper = (f1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.g = wrapper;
        this.f25310h = (ActionBarContextView) view.findViewById(com.liuzh.deviceinfo.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.liuzh.deviceinfo.R.id.action_bar_container);
        this.f25309f = actionBarContainer;
        f1 f1Var = this.g;
        if (f1Var == null || this.f25310h == null || actionBarContainer == null) {
            throw new IllegalStateException(i0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((n3) f1Var).f30779a.getContext();
        this.f25305b = context;
        if ((((n3) this.g).f30780b & 4) != 0) {
            this.j = true;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        this.g.getClass();
        X(context.getResources().getBoolean(com.liuzh.deviceinfo.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f25305b.obtainStyledAttributes(null, h.a.f24776a, com.liuzh.deviceinfo.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25308e;
            if (!actionBarOverlayLayout2.g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f25325x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f25309f;
            WeakHashMap weakHashMap = v0.f22405a;
            m0.i(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void X(boolean z3) {
        if (z3) {
            this.f25309f.setTabContainer(null);
            ((n3) this.g).getClass();
        } else {
            ((n3) this.g).getClass();
            this.f25309f.setTabContainer(null);
        }
        this.g.getClass();
        ((n3) this.g).f30779a.setCollapsible(false);
        this.f25308e.setHasNonEmbeddedTabs(false);
    }

    public final void Y(boolean z3) {
        boolean z10 = this.f25319r;
        boolean z11 = this.f25320s;
        boolean z12 = this.f25321t;
        p6.i iVar = this.A;
        View view = this.f25311i;
        int i4 = 0;
        if (!z12 && (z10 || z11)) {
            if (this.f25322u) {
                this.f25322u = false;
                n.j jVar = this.f25323v;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f25317p;
                g0 g0Var = this.f25326y;
                if (i10 != 0 || (!this.f25324w && !z3)) {
                    g0Var.d();
                    return;
                }
                this.f25309f.setAlpha(1.0f);
                this.f25309f.setTransitioning(true);
                n.j jVar2 = new n.j();
                float f10 = -this.f25309f.getHeight();
                if (z3) {
                    this.f25309f.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                c1 c1VarB = v0.b(this.f25309f);
                c1VarB.e(f10);
                View view2 = (View) c1VarB.f22313a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(iVar != null ? new a1(i4, iVar, view2) : null);
                }
                boolean z13 = jVar2.f29495e;
                ArrayList arrayList = jVar2.f29491a;
                if (!z13) {
                    arrayList.add(c1VarB);
                }
                if (this.f25318q && view != null) {
                    c1 c1VarB2 = v0.b(view);
                    c1VarB2.e(f10);
                    if (!jVar2.f29495e) {
                        arrayList.add(c1VarB2);
                    }
                }
                boolean z14 = jVar2.f29495e;
                if (!z14) {
                    jVar2.f29493c = B;
                }
                if (!z14) {
                    jVar2.f29492b = 250L;
                }
                if (!z14) {
                    jVar2.f29494d = g0Var;
                }
                this.f25323v = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f25322u) {
            return;
        }
        this.f25322u = true;
        n.j jVar3 = this.f25323v;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f25309f.setVisibility(0);
        int i11 = this.f25317p;
        g0 g0Var2 = this.f25327z;
        if (i11 == 0 && (this.f25324w || z3)) {
            this.f25309f.setTranslationY(0.0f);
            float f11 = -this.f25309f.getHeight();
            if (z3) {
                this.f25309f.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.f25309f.setTranslationY(f11);
            n.j jVar4 = new n.j();
            c1 c1VarB3 = v0.b(this.f25309f);
            c1VarB3.e(0.0f);
            View view3 = (View) c1VarB3.f22313a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(iVar != null ? new a1(i4, iVar, view3) : null);
            }
            boolean z15 = jVar4.f29495e;
            ArrayList arrayList2 = jVar4.f29491a;
            if (!z15) {
                arrayList2.add(c1VarB3);
            }
            if (this.f25318q && view != null) {
                view.setTranslationY(f11);
                c1 c1VarB4 = v0.b(view);
                c1VarB4.e(0.0f);
                if (!jVar4.f29495e) {
                    arrayList2.add(c1VarB4);
                }
            }
            boolean z16 = jVar4.f29495e;
            if (!z16) {
                jVar4.f29493c = C;
            }
            if (!z16) {
                jVar4.f29492b = 250L;
            }
            if (!z16) {
                jVar4.f29494d = g0Var2;
            }
            this.f25323v = jVar4;
            jVar4.b();
        } else {
            this.f25309f.setAlpha(1.0f);
            this.f25309f.setTranslationY(0.0f);
            if (this.f25318q && view != null) {
                view.setTranslationY(0.0f);
            }
            g0Var2.d();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25308e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = v0.f22405a;
            k0.c(actionBarOverlayLayout);
        }
    }

    @Override // wd.b
    public final boolean g() {
        i3 i3Var;
        f1 f1Var = this.g;
        if (f1Var == null || (i3Var = ((n3) f1Var).f30779a.M) == null || i3Var.f30717b == null) {
            return false;
        }
        i3 i3Var2 = ((n3) f1Var).f30779a.M;
        o.o oVar = i3Var2 == null ? null : i3Var2.f30717b;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // wd.b
    public final void m(boolean z3) {
        if (z3 == this.f25315n) {
            return;
        }
        this.f25315n = z3;
        ArrayList arrayList = this.f25316o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // wd.b
    public final int s() {
        return ((n3) this.g).f30780b;
    }

    @Override // wd.b
    public final Context v() {
        if (this.f25306c == null) {
            TypedValue typedValue = new TypedValue();
            this.f25305b.getTheme().resolveAttribute(com.liuzh.deviceinfo.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f25306c = new ContextThemeWrapper(this.f25305b, i4);
            } else {
                this.f25306c = this.f25305b;
            }
        }
        return this.f25306c;
    }

    @Override // wd.b
    public final void y() {
        if (this.f25319r) {
            return;
        }
        this.f25319r = true;
        Y(false);
    }

    public i0(Dialog dialog) {
        new ArrayList();
        this.f25316o = new ArrayList();
        this.f25317p = 0;
        this.f25318q = true;
        this.f25322u = true;
        this.f25326y = new g0(this, 0);
        this.f25327z = new g0(this, 1);
        this.A = new p6.i(this);
        W(dialog.getWindow().getDecorView());
    }
}
