package com.google.android.material.behavior;

import A.f;
import B3.x;
import E.b;
import E.e;
import M3.n;
import a.AbstractC0241a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apm.insight.R;
import com.bumptech.glide.d;
import e3.AbstractC2303a;
import h3.AccessibilityManagerTouchExplorationStateChangeListenerC2362a;
import h3.C2363b;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0241a f18096a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f18097b;

    /* renamed from: c, reason: collision with root package name */
    public AccessibilityManagerTouchExplorationStateChangeListenerC2362a f18098c;

    /* renamed from: e, reason: collision with root package name */
    public int f18100e;

    /* renamed from: f, reason: collision with root package name */
    public int f18101f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f18102g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f18103h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f18105k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f18099d = new LinkedHashSet();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f18104j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // E.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f18097b == null) {
            this.f18097b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f18097b;
        if (accessibilityManager != null && this.f18098c == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC2362a accessibilityManagerTouchExplorationStateChangeListenerC2362a = new AccessibilityManagerTouchExplorationStateChangeListenerC2362a(this, view, 1);
            this.f18098c = accessibilityManagerTouchExplorationStateChangeListenerC2362a;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2362a);
            view.addOnAttachStateChangeListener(new n(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((e) view.getLayoutParams()).f1313c;
        if (i3 == 80 || i3 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.f18096a.g(view, marginLayoutParams);
        this.f18100e = d.O(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f18101f = d.O(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f18102g = d.P(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19930d);
        this.f18103h = d.P(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19929c);
        return false;
    }

    @Override // E.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.f18104j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f18097b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f18105k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f18104j = 1;
            Iterator it = this.f18099d.iterator();
            if (it.hasNext()) {
                throw f.f(it);
            }
            this.f18105k = this.f18096a.i(this.i, view).setInterpolator(this.f18103h).setDuration(this.f18101f).setListener(new x(8, this));
        }
    }

    @Override // E.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3) {
        return i == 2;
    }

    public final void w(int i) {
        AbstractC0241a abstractC0241a = this.f18096a;
        if (abstractC0241a == null || abstractC0241a.h() != i) {
            if (i == 0) {
                this.f18096a = new C2363b(2);
            } else if (i == 1) {
                this.f18096a = new C2363b(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(f.h(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f18096a = new C2363b(1);
            }
        }
    }

    public final void x(View view) {
        if (this.f18104j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f18105k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f18104j = 2;
        Iterator it = this.f18099d.iterator();
        if (it.hasNext()) {
            throw f.f(it);
        }
        this.f18096a.getClass();
        this.f18105k = this.f18096a.i(0, view).setInterpolator(this.f18102g).setDuration(this.f18100e).setListener(new x(8, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
