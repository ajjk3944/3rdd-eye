package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import b5.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: m, reason: collision with root package name */
    public static final int f9883m = j4.b.motionDurationLong2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f9884n = j4.b.motionDurationMedium4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f9885o = j4.b.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f9886a;

    /* renamed from: b, reason: collision with root package name */
    public int f9887b;

    /* renamed from: c, reason: collision with root package name */
    public int f9888c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f9889d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f9890e;

    /* renamed from: f, reason: collision with root package name */
    public int f9891f;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f9892g;

    /* renamed from: h, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f9893h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9894i;

    /* renamed from: j, reason: collision with root package name */
    public int f9895j;

    /* renamed from: k, reason: collision with root package name */
    public int f9896k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f9897l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f9893h == null || HideBottomViewOnScrollBehavior.this.f9892g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f9892g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f9893h);
            HideBottomViewOnScrollBehavior.this.f9893h = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f9897l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9886a = new LinkedHashSet();
        this.f9891f = 0;
        this.f9894i = true;
        this.f9895j = 2;
        this.f9896k = 0;
    }

    public static /* synthetic */ void I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.P()) {
            hideBottomViewOnScrollBehavior.U(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public final void N(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f9897l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    public final void O(final View view) {
        if (this.f9892g == null) {
            this.f9892g = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f9892g == null || this.f9893h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: n4.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.I(this.f23530a, view, z10);
            }
        };
        this.f9893h = touchExplorationStateChangeListener;
        this.f9892g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    public boolean P() {
        return this.f9895j == 1;
    }

    public boolean Q() {
        return this.f9895j == 2;
    }

    public void R(View view, int i10) {
        this.f9896k = i10;
        if (this.f9895j == 1) {
            view.setTranslationY(this.f9891f + i10);
        }
    }

    public void S(View view) {
        T(view, true);
    }

    public void T(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (P()) {
            return;
        }
        if (this.f9894i && (accessibilityManager = this.f9892g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9897l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        W(view, 1);
        int i10 = this.f9891f + this.f9896k;
        if (z10) {
            N(view, i10, this.f9888c, this.f9890e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void U(View view) {
        V(view, true);
    }

    public void V(View view, boolean z10) {
        if (Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9897l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        W(view, 2);
        if (z10) {
            N(view, 0, this.f9887b, this.f9889d);
        } else {
            view.setTranslationY(0);
        }
    }

    public final void W(View view, int i10) {
        this.f9895j = i10;
        Iterator it = this.f9886a.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f9891f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9887b = k.f(view.getContext(), f9883m, 225);
        this.f9888c = k.f(view.getContext(), f9884n, 175);
        Context context = view.getContext();
        int i11 = f9885o;
        this.f9889d = k.g(context, i11, k4.a.f21837d);
        this.f9890e = k.g(view.getContext(), i11, k4.a.f21836c);
        O(view);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            S(view);
        } else if (i11 < 0) {
            U(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9886a = new LinkedHashSet();
        this.f9891f = 0;
        this.f9894i = true;
        this.f9895j = 2;
        this.f9896k = 0;
    }
}
