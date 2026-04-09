package h;

import L0.I;
import L0.S;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import h.AbstractC4397a;
import h.LayoutInflaterFactory2C4402f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.AbstractC5304a;
import o.InterfaceC5374B;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public final class t extends AbstractC4397a implements ActionBarOverlayLayout.d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f38120y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f38121z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f38122a;

    /* renamed from: b, reason: collision with root package name */
    public Context f38123b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f38124c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f38125d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC5374B f38126e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f38127f;

    /* renamed from: g, reason: collision with root package name */
    public final View f38128g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38129h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public d f38130j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflaterFactory2C4402f.d f38131k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38132l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<AbstractC4397a.b> f38133m;

    /* renamed from: n, reason: collision with root package name */
    public int f38134n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38135o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38136p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38137q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38138r;

    /* renamed from: s, reason: collision with root package name */
    public m.g f38139s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38140t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38141u;

    /* renamed from: v, reason: collision with root package name */
    public final a f38142v;

    /* renamed from: w, reason: collision with root package name */
    public final b f38143w;

    /* renamed from: x, reason: collision with root package name */
    public final c f38144x;

    /* compiled from: WindowDecorActionBar.java */
    public class a extends A2.l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f38145c;

        public a(t tVar) {
            super(13);
            this.f38145c = tVar;
        }

        @Override // L0.T
        public final void e() {
            View view;
            t tVar = this.f38145c;
            if (tVar.f38135o && (view = tVar.f38128g) != null) {
                view.setTranslationY(0.0f);
                tVar.f38125d.setTranslationY(0.0f);
            }
            tVar.f38125d.setVisibility(8);
            tVar.f38125d.setTransitioning(false);
            tVar.f38139s = null;
            LayoutInflaterFactory2C4402f.d dVar = tVar.f38131k;
            if (dVar != null) {
                dVar.a(tVar.f38130j);
                tVar.f38130j = null;
                tVar.f38131k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = tVar.f38124c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.c.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class b extends A2.l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f38146c;

        public b(t tVar) {
            super(13);
            this.f38146c = tVar;
        }

        @Override // L0.T
        public final void e() {
            t tVar = this.f38146c;
            tVar.f38139s = null;
            tVar.f38125d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class c {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class d extends AbstractC5304a implements f.a {

        /* renamed from: d, reason: collision with root package name */
        public final Context f38148d;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f38149e;

        /* renamed from: f, reason: collision with root package name */
        public LayoutInflaterFactory2C4402f.d f38150f;

        /* renamed from: g, reason: collision with root package name */
        public WeakReference<View> f38151g;

        public d(Context context, LayoutInflaterFactory2C4402f.d dVar) {
            this.f38148d = context;
            this.f38150f = dVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f14441l = 1;
            this.f38149e = fVar;
            fVar.f14435e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            LayoutInflaterFactory2C4402f.d dVar = this.f38150f;
            if (dVar != null) {
                return dVar.f38035a.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f38150f == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = t.this.f38127f.f44616e;
            if (aVar != null) {
                aVar.l();
            }
        }

        @Override // m.AbstractC5304a
        public final void c() {
            t tVar = t.this;
            if (tVar.i != this) {
                return;
            }
            if (tVar.f38136p) {
                tVar.f38130j = this;
                tVar.f38131k = this.f38150f;
            } else {
                this.f38150f.a(this);
            }
            this.f38150f = null;
            tVar.r(false);
            ActionBarContextView actionBarContextView = tVar.f38127f;
            if (actionBarContextView.f14530l == null) {
                actionBarContextView.h();
            }
            tVar.f38124c.setHideOnContentScrollEnabled(tVar.f38141u);
            tVar.i = null;
        }

        @Override // m.AbstractC5304a
        public final View d() {
            WeakReference<View> weakReference = this.f38151g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // m.AbstractC5304a
        public final androidx.appcompat.view.menu.f e() {
            return this.f38149e;
        }

        @Override // m.AbstractC5304a
        public final MenuInflater f() {
            return new m.f(this.f38148d);
        }

        @Override // m.AbstractC5304a
        public final CharSequence g() {
            return t.this.f38127f.getSubtitle();
        }

        @Override // m.AbstractC5304a
        public final CharSequence h() {
            return t.this.f38127f.getTitle();
        }

        @Override // m.AbstractC5304a
        public final void i() {
            if (t.this.i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f38149e;
            fVar.w();
            try {
                this.f38150f.d(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // m.AbstractC5304a
        public final boolean j() {
            return t.this.f38127f.f14538t;
        }

        @Override // m.AbstractC5304a
        public final void k(View view) {
            t.this.f38127f.setCustomView(view);
            this.f38151g = new WeakReference<>(view);
        }

        @Override // m.AbstractC5304a
        public final void l(int i) {
            m(t.this.f38122a.getResources().getString(i));
        }

        @Override // m.AbstractC5304a
        public final void m(CharSequence charSequence) {
            t.this.f38127f.setSubtitle(charSequence);
        }

        @Override // m.AbstractC5304a
        public final void n(int i) {
            o(t.this.f38122a.getResources().getString(i));
        }

        @Override // m.AbstractC5304a
        public final void o(CharSequence charSequence) {
            t.this.f38127f.setTitle(charSequence);
        }

        @Override // m.AbstractC5304a
        public final void p(boolean z10) {
            this.f43929c = z10;
            t.this.f38127f.setTitleOptional(z10);
        }
    }

    public t(Dialog dialog) {
        new ArrayList();
        this.f38133m = new ArrayList<>();
        this.f38134n = 0;
        this.f38135o = true;
        this.f38138r = true;
        this.f38142v = new a(this);
        this.f38143w = new b(this);
        this.f38144x = new c();
        s(dialog.getWindow().getDecorView());
    }

    @Override // h.AbstractC4397a
    public final boolean b() {
        InterfaceC5374B interfaceC5374B = this.f38126e;
        if (interfaceC5374B == null || !interfaceC5374B.i()) {
            return false;
        }
        this.f38126e.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4397a
    public final void c(boolean z10) {
        if (z10 == this.f38132l) {
            return;
        }
        this.f38132l = z10;
        ArrayList<AbstractC4397a.b> arrayList = this.f38133m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // h.AbstractC4397a
    public final int d() {
        return this.f38126e.o();
    }

    @Override // h.AbstractC4397a
    public final Context e() {
        if (this.f38123b == null) {
            TypedValue typedValue = new TypedValue();
            this.f38122a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f38123b = new ContextThemeWrapper(this.f38122a, i);
            } else {
                this.f38123b = this.f38122a;
            }
        }
        return this.f38123b;
    }

    @Override // h.AbstractC4397a
    public final void g() {
        t(this.f38122a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // h.AbstractC4397a
    public final boolean i(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.f38149e) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4397a
    public final void l(boolean z10) {
        if (this.f38129h) {
            return;
        }
        m(z10);
    }

    @Override // h.AbstractC4397a
    public final void m(boolean z10) {
        int i = z10 ? 4 : 0;
        int iO = this.f38126e.o();
        this.f38129h = true;
        this.f38126e.j((i & 4) | (iO & (-5)));
    }

    @Override // h.AbstractC4397a
    public final void n(boolean z10) {
        m.g gVar;
        this.f38140t = z10;
        if (z10 || (gVar = this.f38139s) == null) {
            return;
        }
        gVar.a();
    }

    @Override // h.AbstractC4397a
    public final void o(CharSequence charSequence) {
        this.f38126e.setTitle(charSequence);
    }

    @Override // h.AbstractC4397a
    public final void p(CharSequence charSequence) {
        this.f38126e.setWindowTitle(charSequence);
    }

    @Override // h.AbstractC4397a
    public final AbstractC5304a q(LayoutInflaterFactory2C4402f.d dVar) {
        d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f38124c.setHideOnContentScrollEnabled(false);
        this.f38127f.h();
        d dVar3 = new d(this.f38127f.getContext(), dVar);
        androidx.appcompat.view.menu.f fVar = dVar3.f38149e;
        fVar.w();
        try {
            if (!dVar3.f38150f.f38035a.b(dVar3, fVar)) {
                return null;
            }
            this.i = dVar3;
            dVar3.i();
            this.f38127f.f(dVar3);
            r(true);
            return dVar3;
        } finally {
            fVar.v();
        }
    }

    public final void r(boolean z10) {
        S sM;
        S sE;
        if (z10) {
            if (!this.f38137q) {
                this.f38137q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38124c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.f38137q) {
            this.f38137q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38124c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        if (!this.f38125d.isLaidOut()) {
            if (z10) {
                this.f38126e.n(4);
                this.f38127f.setVisibility(0);
                return;
            } else {
                this.f38126e.n(0);
                this.f38127f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            sE = this.f38126e.m(4, 100L);
            sM = this.f38127f.e(0, 200L);
        } else {
            sM = this.f38126e.m(0, 200L);
            sE = this.f38127f.e(8, 100L);
        }
        m.g gVar = new m.g();
        ArrayList<S> arrayList = gVar.f43986a;
        arrayList.add(sE);
        View view = sE.f3819a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = sM.f3819a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(sM);
        gVar.b();
    }

    public final void s(View view) {
        InterfaceC5374B wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f38124c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC5374B) {
            wrapper = (InterfaceC5374B) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f38126e = wrapper;
        this.f38127f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f38125d = actionBarContainer;
        InterfaceC5374B interfaceC5374B = this.f38126e;
        if (interfaceC5374B == null || this.f38127f == null || actionBarContainer == null) {
            throw new IllegalStateException(t.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f38122a = interfaceC5374B.getContext();
        if ((this.f38126e.o() & 4) != 0) {
            this.f38129h = true;
        }
        Context context = this.f38122a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f38126e.getClass();
        t(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f38122a.obtainStyledAttributes(null, C4353a.f37876a, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38124c;
            if (!actionBarOverlayLayout2.f14553h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f38141u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f38125d;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.d.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void t(boolean z10) {
        if (z10) {
            this.f38125d.setTabContainer(null);
            this.f38126e.k();
        } else {
            this.f38126e.k();
            this.f38125d.setTabContainer(null);
        }
        this.f38126e.getClass();
        this.f38126e.r(false);
        this.f38124c.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z10) {
        boolean z11 = this.f38137q || !this.f38136p;
        View view = this.f38128g;
        final c cVar = this.f38144x;
        if (!z11) {
            if (this.f38138r) {
                this.f38138r = false;
                m.g gVar = this.f38139s;
                if (gVar != null) {
                    gVar.a();
                }
                int i = this.f38134n;
                a aVar = this.f38142v;
                if (i != 0 || (!this.f38140t && !z10)) {
                    aVar.e();
                    return;
                }
                this.f38125d.setAlpha(1.0f);
                this.f38125d.setTransitioning(true);
                m.g gVar2 = new m.g();
                float f10 = -this.f38125d.getHeight();
                if (z10) {
                    this.f38125d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                S sA = I.a(this.f38125d);
                sA.e(f10);
                final View view2 = sA.f3819a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: L0.Q
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) h.t.this.f38125d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z12 = gVar2.f43990e;
                ArrayList<S> arrayList = gVar2.f43986a;
                if (!z12) {
                    arrayList.add(sA);
                }
                if (this.f38135o && view != null) {
                    S sA2 = I.a(view);
                    sA2.e(f10);
                    if (!gVar2.f43990e) {
                        arrayList.add(sA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f38120y;
                boolean z13 = gVar2.f43990e;
                if (!z13) {
                    gVar2.f43988c = accelerateInterpolator;
                }
                if (!z13) {
                    gVar2.f43987b = 250L;
                }
                if (!z13) {
                    gVar2.f43989d = aVar;
                }
                this.f38139s = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.f38138r) {
            return;
        }
        this.f38138r = true;
        m.g gVar3 = this.f38139s;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f38125d.setVisibility(0);
        int i10 = this.f38134n;
        b bVar = this.f38143w;
        if (i10 == 0 && (this.f38140t || z10)) {
            this.f38125d.setTranslationY(0.0f);
            float f11 = -this.f38125d.getHeight();
            if (z10) {
                this.f38125d.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.f38125d.setTranslationY(f11);
            m.g gVar4 = new m.g();
            S sA3 = I.a(this.f38125d);
            sA3.e(0.0f);
            final View view3 = sA3.f3819a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: L0.Q
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) h.t.this.f38125d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z14 = gVar4.f43990e;
            ArrayList<S> arrayList2 = gVar4.f43986a;
            if (!z14) {
                arrayList2.add(sA3);
            }
            if (this.f38135o && view != null) {
                view.setTranslationY(f11);
                S sA4 = I.a(view);
                sA4.e(0.0f);
                if (!gVar4.f43990e) {
                    arrayList2.add(sA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f38121z;
            boolean z15 = gVar4.f43990e;
            if (!z15) {
                gVar4.f43988c = decelerateInterpolator;
            }
            if (!z15) {
                gVar4.f43987b = 250L;
            }
            if (!z15) {
                gVar4.f43989d = bVar;
            }
            this.f38139s = gVar4;
            gVar4.b();
        } else {
            this.f38125d.setAlpha(1.0f);
            this.f38125d.setTranslationY(0.0f);
            if (this.f38135o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.e();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38124c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.c.c(actionBarOverlayLayout);
        }
    }

    public t(boolean z10, Activity activity) {
        new ArrayList();
        this.f38133m = new ArrayList<>();
        this.f38134n = 0;
        this.f38135o = true;
        this.f38138r = true;
        this.f38142v = new a(this);
        this.f38143w = new b(this);
        this.f38144x = new c();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z10) {
            return;
        }
        this.f38128g = decorView.findViewById(android.R.id.content);
    }
}
