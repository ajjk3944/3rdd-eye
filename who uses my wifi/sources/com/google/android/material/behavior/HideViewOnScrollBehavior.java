package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.ex0;
import defpackage.kj;
import defpackage.n1;
import defpackage.ob1;
import defpackage.r4;
import defpackage.t00;
import defpackage.u00;
import defpackage.ud;
import defpackage.vj;
import defpackage.wl2;
import defpackage.yj;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends vj {
    public ob1 a;
    public AccessibilityManager b;
    public t00 c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.vj
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) kj.b(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            t00 t00Var = new t00(this, view, 1);
            this.c = t00Var;
            accessibilityManager.addTouchExplorationStateChangeListener(t00Var);
            view.addOnAttachStateChangeListener(new ud(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((yj) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.j(view, marginLayoutParams);
        this.e = wl2.t(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = wl2.t(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = wl2.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r4.d);
        this.h = wl2.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r4.c);
        return false;
    }

    @Override // defpackage.vj
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                throw ex0.e(it);
            }
            this.k = this.a.l(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new n1(6, this));
        }
    }

    @Override // defpackage.vj
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        ob1 ob1Var = this.a;
        if (ob1Var == null || ob1Var.k() != i) {
            if (i == 0) {
                this.a = new u00(2);
                return;
            }
            if (i == 1) {
                this.a = new u00(0);
            } else {
                if (i == 2) {
                    this.a = new u00(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        this.a.getClass();
        this.k = this.a.l(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new n1(6, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
