package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.ex0;
import defpackage.kj;
import defpackage.n1;
import defpackage.r4;
import defpackage.t00;
import defpackage.ud;
import defpackage.vj;
import defpackage.wl2;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends vj {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public t00 h;
    public ViewPropertyAnimator l;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;
    public int k = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.vj
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = wl2.t(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = wl2.t(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = wl2.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r4.d);
        this.e = wl2.u(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r4.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) kj.b(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        t00 t00Var = new t00(this, view, 0);
        this.h = t00Var;
        accessibilityManager.addTouchExplorationStateChangeListener(t00Var);
        view.addOnAttachStateChangeListener(new ud(3, this));
        return false;
    }

    @Override // defpackage.vj
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        this.l = view.animate().translationY(this.f + this.k).setInterpolator(this.e).setDuration(this.c).setListener(new n1(5, this));
    }

    @Override // defpackage.vj
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void w(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        this.l = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new n1(5, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
