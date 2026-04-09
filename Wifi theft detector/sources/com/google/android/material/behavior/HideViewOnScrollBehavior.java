package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import b5.k;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n4.c;
import n4.d;
import n4.f;

/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: o, reason: collision with root package name */
    public static final int f9900o = j4.b.motionDurationLong2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9901p = j4.b.motionDurationMedium4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f9902q = j4.b.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    public f f9903a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f9904b;

    /* renamed from: c, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f9905c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9906d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f9907e;

    /* renamed from: f, reason: collision with root package name */
    public int f9908f;

    /* renamed from: g, reason: collision with root package name */
    public int f9909g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f9910h;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f9911i;

    /* renamed from: j, reason: collision with root package name */
    public int f9912j;

    /* renamed from: k, reason: collision with root package name */
    public int f9913k;

    /* renamed from: l, reason: collision with root package name */
    public int f9914l;

    /* renamed from: m, reason: collision with root package name */
    public ViewPropertyAnimator f9915m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9916n;

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
            if (HideViewOnScrollBehavior.this.f9905c == null || HideViewOnScrollBehavior.this.f9904b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f9904b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f9905c);
            HideViewOnScrollBehavior.this.f9905c = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f9915m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f9906d = true;
        this.f9907e = new LinkedHashSet();
        this.f9912j = 0;
        this.f9913k = 2;
        this.f9914l = 0;
        this.f9916n = false;
    }

    public static /* synthetic */ void I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f9906d && z10 && hideViewOnScrollBehavior.S()) {
            hideViewOnScrollBehavior.V(view);
        }
    }

    private void N(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f9915m = this.f9903a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void O(final View view) {
        if (this.f9904b == null) {
            this.f9904b = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f9904b == null || this.f9905c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: n4.e
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.I(this.f23532a, view, z10);
            }
        };
        this.f9905c = touchExplorationStateChangeListener;
        this.f9904b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void Z(View view, int i10) {
        this.f9913k = i10;
        Iterator it = this.f9907e.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public final boolean P(int i10) {
        return i10 == 80 || i10 == 81;
    }

    public final boolean Q(int i10) {
        return i10 == 3 || i10 == 19;
    }

    public boolean R() {
        return this.f9913k == 2;
    }

    public boolean S() {
        return this.f9913k == 1;
    }

    public final void T(View view, int i10) {
        if (this.f9916n) {
            return;
        }
        int i11 = ((CoordinatorLayout.e) view.getLayoutParams()).f2334c;
        if (P(i11)) {
            U(1);
        } else {
            U(Q(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    public final void U(int i10) {
        f fVar = this.f9903a;
        if (fVar == null || fVar.c() != i10) {
            if (i10 == 0) {
                this.f9903a = new d();
                return;
            }
            if (i10 == 1) {
                this.f9903a = new n4.b();
                return;
            }
            if (i10 == 2) {
                this.f9903a = new c();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    public void V(View view) {
        W(view, true);
    }

    public void W(View view, boolean z10) {
        if (R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9915m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Z(view, 2);
        int iB = this.f9903a.b();
        if (z10) {
            N(view, iB, this.f9908f, this.f9910h);
        } else {
            this.f9903a.e(view, iB);
        }
    }

    public void X(View view) {
        Y(view, true);
    }

    public void Y(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (S()) {
            return;
        }
        if (this.f9906d && (accessibilityManager = this.f9904b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9915m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Z(view, 1);
        int i10 = this.f9912j + this.f9914l;
        if (z10) {
            N(view, i10, this.f9909g, this.f9911i);
        } else {
            this.f9903a.e(view, i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        O(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        T(view, i10);
        this.f9912j = this.f9903a.a(view, marginLayoutParams);
        this.f9908f = k.f(view.getContext(), f9900o, 225);
        this.f9909g = k.f(view.getContext(), f9901p, 175);
        Context context = view.getContext();
        int i11 = f9902q;
        this.f9910h = k.g(context, i11, k4.a.f21837d);
        this.f9911i = k.g(view.getContext(), i11, k4.a.f21836c);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            X(view);
        } else if (i11 < 0) {
            V(view);
        }
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9906d = true;
        this.f9907e = new LinkedHashSet();
        this.f9912j = 0;
        this.f9913k = 2;
        this.f9914l = 0;
        this.f9916n = false;
    }
}
