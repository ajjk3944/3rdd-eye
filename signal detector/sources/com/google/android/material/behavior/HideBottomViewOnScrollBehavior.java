package com.google.android.material.behavior;

import A.f;
import B3.x;
import E.b;
import M3.n;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apm.insight.R;
import com.bumptech.glide.d;
import e3.AbstractC2303a;
import h3.AccessibilityManagerTouchExplorationStateChangeListenerC2362a;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f18087b;

    /* renamed from: c, reason: collision with root package name */
    public int f18088c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f18089d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f18090e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f18092g;

    /* renamed from: h, reason: collision with root package name */
    public AccessibilityManagerTouchExplorationStateChangeListenerC2362a f18093h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f18095k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18086a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f18091f = 0;
    public final boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f18094j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // E.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f18091f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f18087b = d.O(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f18088c = d.O(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f18089d = d.P(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19930d);
        this.f18090e = d.P(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19929c);
        if (this.f18092g == null) {
            this.f18092g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f18092g;
        if (accessibilityManager == null || this.f18093h != null) {
            return false;
        }
        AccessibilityManagerTouchExplorationStateChangeListenerC2362a accessibilityManagerTouchExplorationStateChangeListenerC2362a = new AccessibilityManagerTouchExplorationStateChangeListenerC2362a(this, view, 0);
        this.f18093h = accessibilityManagerTouchExplorationStateChangeListenerC2362a;
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2362a);
        view.addOnAttachStateChangeListener(new n(1, this));
        return false;
    }

    @Override // E.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.f18094j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.f18092g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f18095k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f18094j = 1;
        Iterator it = this.f18086a.iterator();
        if (it.hasNext()) {
            throw f.f(it);
        }
        this.f18095k = view.animate().translationY(this.f18091f).setInterpolator(this.f18090e).setDuration(this.f18088c).setListener(new x(7, this));
    }

    @Override // E.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3) {
        return i == 2;
    }

    public final void w(View view) {
        if (this.f18094j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f18095k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f18094j = 2;
        Iterator it = this.f18086a.iterator();
        if (it.hasNext()) {
            throw f.f(it);
        }
        this.f18095k = view.animate().translationY(0).setInterpolator(this.f18089d).setDuration(this.f18087b).setListener(new x(7, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
