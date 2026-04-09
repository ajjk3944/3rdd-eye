package com.google.android.material.behavior;

import a4.AbstractC3764d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: j, reason: collision with root package name */
    private static final int f36995j = O3.a.f16984w;

    /* renamed from: k, reason: collision with root package name */
    private static final int f36996k = O3.a.f16986y;

    /* renamed from: l, reason: collision with root package name */
    private static final int f36997l = O3.a.f16950D;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f36998a;

    /* renamed from: b, reason: collision with root package name */
    private int f36999b;

    /* renamed from: c, reason: collision with root package name */
    private int f37000c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f37001d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f37002e;

    /* renamed from: f, reason: collision with root package name */
    private int f37003f;

    /* renamed from: g, reason: collision with root package name */
    private int f37004g;

    /* renamed from: h, reason: collision with root package name */
    private int f37005h;

    /* renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f37006i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f37006i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f36998a = new LinkedHashSet();
        this.f37003f = 0;
        this.f37004g = 2;
        this.f37005h = 0;
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f37006i = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void M(View view, int i10) {
        this.f37004g = i10;
        Iterator it = this.f36998a.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f37004g == 1;
    }

    public boolean H() {
        return this.f37004g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f37006i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i10 = this.f37003f + this.f37005h;
        if (z10) {
            F(view, i10, this.f37000c, this.f37002e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f37006i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z10) {
            F(view, 0, this.f36999b, this.f37001d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f37003f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f36999b = AbstractC3764d.f(view.getContext(), f36995j, 225);
        this.f37000c = AbstractC3764d.f(view.getContext(), f36996k, 175);
        Context context = view.getContext();
        int i11 = f36997l;
        this.f37001d = AbstractC3764d.g(context, i11, P3.a.f18024d);
        this.f37002e = AbstractC3764d.g(view.getContext(), i11, P3.a.f18023c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36998a = new LinkedHashSet();
        this.f37003f = 0;
        this.f37004g = 2;
        this.f37005h = 0;
    }
}
