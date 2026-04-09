package defpackage;

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
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t81 extends m54 implements p1 {
    public static final AccelerateInterpolator E = new AccelerateInterpolator();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public final r81 B;
    public final r81 C;
    public final f20 D;
    public Context g;
    public Context h;
    public ActionBarOverlayLayout i;
    public ActionBarContainer j;
    public wm k;
    public ActionBarContextView l;
    public final View m;
    public boolean n;
    public s81 o;
    public s81 p;
    public vq2 q;
    public boolean r;
    public final ArrayList s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public x61 y;
    public boolean z;

    public t81(Activity activity, boolean z) {
        new ArrayList();
        this.s = new ArrayList();
        this.t = 0;
        this.u = true;
        this.x = true;
        this.B = new r81(this, 0);
        this.C = new r81(this, 1);
        this.D = new f20(10, this);
        View decorView = activity.getWindow().getDecorView();
        j0(decorView);
        if (z) {
            return;
        }
        this.m = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.m54
    public final void A(CharSequence charSequence) {
        h21 h21Var = (h21) this.k;
        if (h21Var.g) {
            return;
        }
        Toolbar toolbar = h21Var.a;
        h21Var.h = charSequence;
        if ((h21Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (h21Var.g) {
                e61.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.m54
    public final c2 B(vq2 vq2Var) {
        s81 s81Var = this.o;
        if (s81Var != null) {
            s81Var.a();
        }
        this.i.setHideOnContentScrollEnabled(false);
        this.l.e();
        s81 s81Var2 = new s81(this, this.l.getContext(), vq2Var);
        od0 od0Var = s81Var2.i;
        od0Var.w();
        try {
            if (!((p21) s81Var2.j.g).w(s81Var2, od0Var)) {
                return null;
            }
            this.o = s81Var2;
            s81Var2.h();
            this.l.c(s81Var2);
            i0(true);
            return s81Var2;
        } finally {
            od0Var.v();
        }
    }

    @Override // defpackage.m54
    public final boolean c() {
        b21 b21Var;
        wm wmVar = this.k;
        if (wmVar == null || (b21Var = ((h21) wmVar).a.R) == null || b21Var.g == null) {
            return false;
        }
        b21 b21Var2 = ((h21) wmVar).a.R;
        sd0 sd0Var = b21Var2 == null ? null : b21Var2.g;
        if (sd0Var == null) {
            return true;
        }
        sd0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.m54
    public final void d(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        ArrayList arrayList = this.s;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.m54
    public final int g() {
        return ((h21) this.k).b;
    }

    public final void i0(boolean z) {
        w61 w61VarI;
        w61 w61VarI2;
        if (z) {
            if (!this.w) {
                this.w = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                l0(false);
            }
        } else if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            l0(false);
        }
        if (!this.j.isLaidOut()) {
            if (z) {
                ((h21) this.k).a.setVisibility(4);
                this.l.setVisibility(0);
                return;
            } else {
                ((h21) this.k).a.setVisibility(0);
                this.l.setVisibility(8);
                return;
            }
        }
        if (z) {
            h21 h21Var = (h21) this.k;
            w61VarI = e61.a(h21Var.a);
            w61VarI.a(0.0f);
            w61VarI.c(100L);
            w61VarI.d(new g21(h21Var, 4));
            w61VarI2 = this.l.i(0, 200L);
        } else {
            h21 h21Var2 = (h21) this.k;
            w61 w61VarA = e61.a(h21Var2.a);
            w61VarA.a(1.0f);
            w61VarA.c(200L);
            w61VarA.d(new g21(h21Var2, 0));
            w61VarI = this.l.i(8, 100L);
            w61VarI2 = w61VarA;
        }
        x61 x61Var = new x61();
        ArrayList arrayList = x61Var.a;
        arrayList.add(w61VarI);
        View view = (View) w61VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) w61VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(w61VarI2);
        x61Var.b();
    }

    public final void j0(View view) {
        wm wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.decor_content_parent);
        this.i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.action_bar);
        if (callbackFindViewById instanceof wm) {
            wrapper = (wm) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.k = wrapper;
        this.l = (ActionBarContextView) view.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.action_bar_container);
        this.j = actionBarContainer;
        wm wmVar = this.k;
        if (wmVar == null || this.l == null || actionBarContainer == null) {
            throw new IllegalStateException(t81.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((h21) wmVar).a.getContext();
        this.g = context;
        if ((((h21) this.k).b & 4) != 0) {
            this.n = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.k.getClass();
        k0(context.getResources().getBoolean(com.phuongpn.whousemywifi.networkscanner.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.g.obtainStyledAttributes(null, hn0.a, com.phuongpn.whousemywifi.networkscanner.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
            if (!actionBarOverlayLayout2.l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.A = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.j;
            WeakHashMap weakHashMap = e61.a;
            t51.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k0(boolean z) {
        if (z) {
            this.j.setTabContainer(null);
            ((h21) this.k).getClass();
        } else {
            ((h21) this.k).getClass();
            this.j.setTabContainer(null);
        }
        this.k.getClass();
        ((h21) this.k).a.setCollapsible(false);
        this.i.setHasNonEmbeddedTabs(false);
    }

    public final void l0(boolean z) {
        boolean z2 = this.v;
        boolean z3 = this.w;
        int i = 2;
        f20 f20Var = this.D;
        View view = this.m;
        if (!z3 && z2) {
            if (this.x) {
                this.x = false;
                x61 x61Var = this.y;
                if (x61Var != null) {
                    x61Var.a();
                }
                int i2 = this.t;
                r81 r81Var = this.B;
                if (i2 != 0 || (!this.z && !z)) {
                    r81Var.b();
                    return;
                }
                this.j.setAlpha(1.0f);
                this.j.setTransitioning(true);
                x61 x61Var2 = new x61();
                float f = -this.j.getHeight();
                if (z) {
                    this.j.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                w61 w61VarA = e61.a(this.j);
                w61VarA.e(f);
                View view2 = (View) w61VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(f20Var != null ? new e5(f20Var, view2, i) : null);
                }
                boolean z4 = x61Var2.e;
                ArrayList arrayList = x61Var2.a;
                if (!z4) {
                    arrayList.add(w61VarA);
                }
                if (this.u && view != null) {
                    w61 w61VarA2 = e61.a(view);
                    w61VarA2.e(f);
                    if (!x61Var2.e) {
                        arrayList.add(w61VarA2);
                    }
                }
                boolean z5 = x61Var2.e;
                if (!z5) {
                    x61Var2.c = E;
                }
                if (!z5) {
                    x61Var2.b = 250L;
                }
                if (!z5) {
                    x61Var2.d = r81Var;
                }
                this.y = x61Var2;
                x61Var2.b();
                return;
            }
            return;
        }
        if (this.x) {
            return;
        }
        this.x = true;
        x61 x61Var3 = this.y;
        if (x61Var3 != null) {
            x61Var3.a();
        }
        this.j.setVisibility(0);
        int i3 = this.t;
        r81 r81Var2 = this.C;
        if (i3 == 0 && (this.z || z)) {
            this.j.setTranslationY(0.0f);
            float f2 = -this.j.getHeight();
            if (z) {
                this.j.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.j.setTranslationY(f2);
            x61 x61Var4 = new x61();
            w61 w61VarA3 = e61.a(this.j);
            w61VarA3.e(0.0f);
            View view3 = (View) w61VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(f20Var != null ? new e5(f20Var, view3, i) : null);
            }
            boolean z6 = x61Var4.e;
            ArrayList arrayList2 = x61Var4.a;
            if (!z6) {
                arrayList2.add(w61VarA3);
            }
            if (this.u && view != null) {
                view.setTranslationY(f2);
                w61 w61VarA4 = e61.a(view);
                w61VarA4.e(0.0f);
                if (!x61Var4.e) {
                    arrayList2.add(w61VarA4);
                }
            }
            boolean z7 = x61Var4.e;
            if (!z7) {
                x61Var4.c = F;
            }
            if (!z7) {
                x61Var4.b = 250L;
            }
            if (!z7) {
                x61Var4.d = r81Var2;
            }
            this.y = x61Var4;
            x61Var4.b();
        } else {
            this.j.setAlpha(1.0f);
            this.j.setTranslationY(0.0f);
            if (this.u && view != null) {
                view.setTranslationY(0.0f);
            }
            r81Var2.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.i;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = e61.a;
            r51.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.m54
    public final Context p() {
        if (this.h == null) {
            TypedValue typedValue = new TypedValue();
            this.g.getTheme().resolveAttribute(com.phuongpn.whousemywifi.networkscanner.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.h = new ContextThemeWrapper(this.g, i);
            } else {
                this.h = this.g;
            }
        }
        return this.h;
    }

    @Override // defpackage.m54
    public final void s() {
        k0(this.g.getResources().getBoolean(com.phuongpn.whousemywifi.networkscanner.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.m54
    public final boolean u(int i, KeyEvent keyEvent) {
        od0 od0Var;
        s81 s81Var = this.o;
        if (s81Var == null || (od0Var = s81Var.i) == null) {
            return false;
        }
        od0Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return od0Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.m54
    public final void x(boolean z) {
        if (this.n) {
            return;
        }
        y(z);
    }

    @Override // defpackage.m54
    public final void y(boolean z) {
        int i = z ? 4 : 0;
        h21 h21Var = (h21) this.k;
        int i2 = h21Var.b;
        this.n = true;
        h21Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.m54
    public final void z(boolean z) {
        x61 x61Var;
        this.z = z;
        if (z || (x61Var = this.y) == null) {
            return;
        }
        x61Var.a();
    }

    public t81(Dialog dialog) {
        new ArrayList();
        this.s = new ArrayList();
        this.t = 0;
        this.u = true;
        this.x = true;
        this.B = new r81(this, 0);
        this.C = new r81(this, 1);
        this.D = new f20(10, this);
        j0(dialog.getWindow().getDecorView());
    }
}
