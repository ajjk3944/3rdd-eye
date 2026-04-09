package com.google.android.material.behavior;

import ad.g;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.a1;
import com.liuzh.deviceinfo.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.u;
import mc.a;
import p3.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f20327b;

    /* renamed from: c, reason: collision with root package name */
    public int f20328c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f20329d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f20330e;
    public AccessibilityManager g;

    /* renamed from: h, reason: collision with root package name */
    public a f20332h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f20334k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20326a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f20331f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20333i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p3.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f20331f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f20327b = nh.a.v(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f20328c = nh.a.v(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f20329d = nh.a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27485d);
        this.f20330e = nh.a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27484c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.f20332h != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.f20332h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new a1(4, this));
        return false;
    }

    @Override // p3.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i4 <= 0) {
            if (i4 < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.f20333i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f20334k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.f20326a.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        this.f20334k = view.animate().translationY(this.f20331f).setInterpolator(this.f20330e).setDuration(this.f20328c).setListener(new g(8, this));
    }

    @Override // p3.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10) {
        return i4 == 2;
    }

    public final void w(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f20334k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f20326a.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        this.f20334k = view.animate().translationY(0).setInterpolator(this.f20329d).setDuration(this.f20327b).setListener(new g(8, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
