package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e3.b;
import g1.e;
import id.a;
import ir.f0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w.g;

@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5476l = ed.b.motionDurationLong2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5477m = ed.b.motionDurationMedium4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5478n = ed.b.motionEasingEmphasizedInterpolator;

    /* renamed from: b, reason: collision with root package name */
    public int f5480b;

    /* renamed from: c, reason: collision with root package name */
    public int f5481c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f5482d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f5483e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f5485g;

    /* renamed from: h, reason: collision with root package name */
    public a f5486h;
    public ViewPropertyAnimator k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5479a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f5484f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5487i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // e3.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f5484f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f5480b = f0.U(view.getContext(), f5476l, 225);
        this.f5481c = f0.U(view.getContext(), f5477m, 175);
        Context context = view.getContext();
        q4.a aVar = fd.a.f8825d;
        int i11 = f5478n;
        this.f5482d = f0.V(context, i11, aVar);
        this.f5483e = f0.V(view.getContext(), i11, fd.a.f8824c);
        if (this.f5485g == null) {
            this.f5485g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f5485g;
        if (accessibilityManager == null || this.f5486h != null) {
            return false;
        }
        a aVar2 = new a(this, view, 0);
        this.f5486h = aVar2;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar2);
        view.addOnAttachStateChangeListener(new e(1, this));
        return false;
    }

    @Override // e3.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i10 <= 0) {
            if (i10 < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.f5487i && (accessibilityManager = this.f5485g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.f5479a.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
        this.k = view.animate().translationY(this.f5484f).setInterpolator(this.f5483e).setDuration(this.f5481c).setListener(new id.b(0, this));
    }

    @Override // e3.b
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f5479a.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
        this.k = view.animate().translationY(0).setInterpolator(this.f5482d).setDuration(this.f5480b).setListener(new id.b(0, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
