package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f4.C4334b;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<a> f22490a;

    /* renamed from: b, reason: collision with root package name */
    public int f22491b;

    /* renamed from: c, reason: collision with root package name */
    public int f22492c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f22493d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f22494e;

    /* renamed from: f, reason: collision with root package name */
    public int f22495f;

    /* renamed from: g, reason: collision with root package name */
    public int f22496g;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f22497h;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f22490a = new LinkedHashSet<>();
        this.f22495f = 0;
        this.f22496g = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        this.f22495f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f22491b = C4334b.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.f22492c = C4334b.c(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f22493d = C4334b.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, L3.a.f4037d);
        this.f22494e = C4334b.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, L3.a.f4036c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        LinkedHashSet<a> linkedHashSet = this.f22490a;
        if (i > 0) {
            if (this.f22496g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f22497h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f22496g = 1;
            Iterator<a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f22497h = view.animate().translationY(this.f22495f).setInterpolator(this.f22494e).setDuration(this.f22492c).setListener(new N3.a(this, 0));
            return;
        }
        if (i >= 0 || this.f22496g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f22497h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f22496g = 2;
        Iterator<a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f22497h = view.animate().translationY(0).setInterpolator(this.f22493d).setDuration(this.f22491b).setListener(new N3.a(this, 0));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i, int i10) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22490a = new LinkedHashSet<>();
        this.f22495f = 0;
        this.f22496g = 2;
    }
}
