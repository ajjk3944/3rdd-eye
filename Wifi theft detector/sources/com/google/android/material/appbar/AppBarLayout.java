package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.b0;
import androidx.core.view.g0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.a0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import g5.h;
import j4.g;
import j4.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l4.e;
import s0.x;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int B = k.Widget_Design_AppBarLayout;
    public Behavior A;

    /* renamed from: a, reason: collision with root package name */
    public int f9778a;

    /* renamed from: b, reason: collision with root package name */
    public int f9779b;

    /* renamed from: c, reason: collision with root package name */
    public int f9780c;

    /* renamed from: d, reason: collision with root package name */
    public int f9781d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9782e;

    /* renamed from: f, reason: collision with root package name */
    public int f9783f;

    /* renamed from: g, reason: collision with root package name */
    public WindowInsetsCompat f9784g;

    /* renamed from: h, reason: collision with root package name */
    public List f9785h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9786i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9787j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9788k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9789l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f9790m;

    /* renamed from: n, reason: collision with root package name */
    public int f9791n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f9792o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f9793p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f9794q;

    /* renamed from: r, reason: collision with root package name */
    public final List f9795r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f9796s;

    /* renamed from: t, reason: collision with root package name */
    public final long f9797t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f9798u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f9799v;

    /* renamed from: w, reason: collision with root package name */
    public int f9800w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f9801x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f9802y;

    /* renamed from: z, reason: collision with root package name */
    public final float f9803z;

    public static class BaseBehavior<T extends AppBarLayout> extends l4.d {

        /* renamed from: k, reason: collision with root package name */
        public int f9804k;

        /* renamed from: l, reason: collision with root package name */
        public int f9805l;

        /* renamed from: m, reason: collision with root package name */
        public ValueAnimator f9806m;

        /* renamed from: n, reason: collision with root package name */
        public SavedState f9807n;

        /* renamed from: o, reason: collision with root package name */
        public WeakReference f9808o;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f9814a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f9815b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f9814a = coordinatorLayout;
                this.f9815b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f9814a, this.f9815b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f9817d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f9818e;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f9817d = appBarLayout;
                this.f9818e = coordinatorLayout;
            }

            @Override // androidx.core.view.a
            public void g(View view, x xVar) {
                View viewJ0;
                super.g(view, xVar);
                xVar.m0(ScrollView.class.getName());
                if (this.f9817d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f9818e)) == null || !BaseBehavior.this.f0(this.f9817d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f9817d.getTotalScrollRange())) {
                    xVar.b(x.a.f24208q);
                    xVar.H0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        xVar.b(x.a.f24209r);
                        xVar.H0(true);
                    } else if ((-this.f9817d.getDownNestedPreScrollRange()) != 0) {
                        xVar.b(x.a.f24209r);
                        xVar.H0(true);
                    }
                }
            }

            @Override // androidx.core.view.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f9817d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f9818e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f9817d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f9817d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f9818e, this.f9817d, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public static View h0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(appBarLayout, iQ);
            if (iI0 >= 0) {
                View childAt = appBarLayout.getChildAt(iI0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int iC = layoutParams.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iI0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (e0(iC, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iQ < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, m0.a.b(b0(iQ, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewH0 = h0(appBarLayout, i10);
            boolean zE = false;
            if (viewH0 != null) {
                int iC = ((LayoutParams) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int minimumHeight = viewH0.getMinimumHeight();
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zE = true;
                    }
                }
            }
            if (appBarLayout.p()) {
                zE = appBarLayout.E(g0(coordinatorLayout));
            }
            boolean zB = appBarLayout.B(zE);
            if (z10 || (zB && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // l4.d
        public int Q() {
            return I() + this.f9804k;
        }

        public final void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (ViewCompat.M(coordinatorLayout)) {
                return;
            }
            ViewCompat.j0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        public final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            a0(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f9806m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f9806m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9806m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9806m = valueAnimator3;
                valueAnimator3.setInterpolator(k4.a.f21838e);
                this.f9806m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f9806m.setDuration(Math.min(i11, Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE));
            this.f9806m.setIntValues(iQ, i10);
            this.f9806m.start();
        }

        public final int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        @Override // l4.d
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f9808o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.l() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((LayoutParams) appBarLayout.getChildAt(i10).getLayoutParams()).f9820a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof b0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (e0(layoutParams.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.e) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // l4.d
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // l4.d
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final int m0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolatorD = layoutParams.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (interpolatorD != null) {
                    int iC = layoutParams.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f10 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        @Override // l4.d
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.p()) {
                appBarLayout.B(appBarLayout.E(g0(coordinatorLayout)));
            }
        }

        @Override // l4.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zP = super.p(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f9807n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f9809c) {
                T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f9810d) {
                T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f9811e);
                T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f9807n.f9813g ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f9807n.f9812f)));
            }
            appBarLayout.x();
            this.f9807n = null;
            K(m0.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            B0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.u(I());
            Y(coordinatorLayout, appBarLayout);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) appBarLayout.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.J(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void u(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.S(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.p()
                if (r7 == 0) goto L34
                boolean r7 = r2.E(r9)
                r2.B(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                w0((SavedState) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.f9807n.c());
            } else {
                super.B(coordinatorLayout, appBarLayout, parcelable);
                this.f9807n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableC = super.C(coordinatorLayout, appBarLayout);
            SavedState savedStateX0 = x0(parcelableC, appBarLayout);
            return savedStateX0 == null ? parcelableC : savedStateX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.p() || appBarLayout.r() || d0(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f9806m) != null) {
                valueAnimator.cancel();
            }
            this.f9808o = null;
            this.f9805l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f9805l == 0 || i10 == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.p()) {
                    appBarLayout.B(appBarLayout.E(view));
                }
            }
            this.f9808o = new WeakReference(view);
        }

        public void w0(SavedState savedState, boolean z10) {
            if (this.f9807n == null || z10) {
                this.f9807n = savedState;
            }
        }

        public SavedState x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f2845b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = I == 0;
                    savedState.f9810d = z10;
                    savedState.f9809c = !z10 && (-I) >= appBarLayout.getTotalScrollRange();
                    savedState.f9811e = i10;
                    savedState.f9813g = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f9812f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // l4.d
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iQ = Q();
            int i13 = 0;
            if (i11 == 0 || iQ < i11 || iQ > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f9804k = 0;
            } else {
                int iB = m0.a.b(i10, i11, i12);
                if (iQ != iB) {
                    int iM0 = appBarLayout.j() ? m0(appBarLayout, iB) : iB;
                    boolean zK = K(iM0);
                    int i14 = iQ - iB;
                    this.f9804k = iB - iM0;
                    if (zK) {
                        while (i13 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) appBarLayout.getChildAt(i13).getLayoutParams();
                            b bVarB = layoutParams.b();
                            if (bVarB != null && (layoutParams.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && appBarLayout.j()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.u(I());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    B0(coordinatorLayout2, appBarLayout2, iB, iB < iQ ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            Y(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public final boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listS = coordinatorLayout.s(appBarLayout);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.e) ((View) listS.get(i10)).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public boolean f9809c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f9810d;

            /* renamed from: e, reason: collision with root package name */
            public int f9811e;

            /* renamed from: f, reason: collision with root package name */
            public float f9812f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f9813g;

            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9809c = parcel.readByte() != 0;
                this.f9810d = parcel.readByte() != 0;
                this.f9811e = parcel.readInt();
                this.f9812f = parcel.readFloat();
                this.f9813g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f9809c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9810d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9811e);
                parcel.writeFloat(this.f9812f);
                parcel.writeByte(this.f9813g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // l4.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // l4.f
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // l4.f
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // l4.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.r(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f23160d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.y(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // l4.e
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // l4.e
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // l4.e
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void W(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.e) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                ViewCompat.U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f9804k) + Q()) - M(view2));
            }
        }

        public final void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.B(appBarLayout.E(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.j0(coordinatorLayout, null);
            }
        }

        @Override // l4.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // l4.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ScrollingViewBehavior_Layout);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements g0 {
        public a() {
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.v(windowInsetsCompat);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f9824a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f9825b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f9824a, appBarLayout, view);
            float fAbs = this.f9824a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fA = 1.0f - m0.a.a(Math.abs(fAbs / this.f9824a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f9824a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f9825b);
            this.f9825b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f9825b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f9825b);
        }
    }

    public static abstract class d {
        public abstract void a(float f10, int i10, float f11);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.h0(fFloatValue);
        Drawable drawable = appBarLayout.f9801x;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).h0(fFloatValue);
        }
        Iterator it = appBarLayout.f9795r.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            materialShapeDrawable.G();
            throw null;
        }
        Iterator it2 = appBarLayout.f9796s.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).a(fFloatValue, materialShapeDrawable.G(), fFloatValue / appBarLayout.f9803z);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int iJ = u4.a.j(appBarLayout.f9800w, colorStateList.getDefaultColor(), fFloatValue);
        materialShapeDrawable.i0(ColorStateList.valueOf(iJ));
        if (appBarLayout.f9801x != null && (num2 = appBarLayout.f9802y) != null && num2.equals(num)) {
            appBarLayout.f9801x.setTint(iJ);
        }
        if (!appBarLayout.f9795r.isEmpty()) {
            Iterator it = appBarLayout.f9795r.iterator();
            while (it.hasNext()) {
                z.a(it.next());
                if (materialShapeDrawable.D() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f9796s.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f9796s.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).a(0.0f, iJ, fFloatValue);
        }
    }

    public final boolean A(boolean z10) {
        if (this.f9787j == z10) {
            return false;
        }
        this.f9787j = z10;
        refreshDrawableState();
        return true;
    }

    public boolean B(boolean z10) {
        return C(z10, !this.f9786i);
    }

    public boolean C(boolean z10, boolean z11) {
        if (!z11 || this.f9788k == z10) {
            return false;
        }
        this.f9788k = z10;
        refreshDrawableState();
        if (!q()) {
            return true;
        }
        if (this.f9790m != null) {
            G(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f9789l) {
            return true;
        }
        G(z10 ? 0.0f : this.f9803z, z10 ? this.f9803z : 0.0f);
        return true;
    }

    public final boolean D() {
        return this.f9801x != null && getTopInset() > 0;
    }

    public boolean E(View view) {
        View viewF = f(view);
        if (viewF != null) {
            view = viewF;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean F() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    public final void G(float f10, float f11) {
        ValueAnimator valueAnimator = this.f9793p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f9793p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f9797t);
        this.f9793p.setInterpolator(this.f9798u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f9794q;
        if (animatorUpdateListener != null) {
            this.f9793p.addUpdateListener(animatorUpdateListener);
        }
        this.f9793p.start();
    }

    public final void H() {
        setWillNotDraw(!D());
    }

    public void c(d dVar) {
        this.f9796s.add(dVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        WeakReference weakReference = this.f9792o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9792o = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (D()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f9778a);
            this.f9801x.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9801x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final Integer e() {
        Drawable drawable = this.f9801x;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).G());
        }
        ColorStateList colorStateListF = w4.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    public final View f(View view) {
        int i10;
        if (this.f9792o == null && (i10 = this.f9791n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f9791n);
            }
            if (viewFindViewById != null) {
                this.f9792o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f9792o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f9780c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f9820a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f9780c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f9781d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i12 = layoutParams.f9820a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f9781d = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f9791n;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f9783f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f9801x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f9784g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f9779b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f9820a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f9779b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public boolean j() {
        return this.f9782e;
    }

    public final boolean k() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        return getTotalScrollRange() != 0;
    }

    public final void m(final MaterialShapeDrawable materialShapeDrawable, final ColorStateList colorStateList) {
        final Integer numF = u4.a.f(getContext(), j4.b.colorSurface);
        this.f9794q = new ValueAnimator.AnimatorUpdateListener() { // from class: l4.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f23144a, colorStateList, materialShapeDrawable, numF, valueAnimator);
            }
        };
    }

    public final void n(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.W(context);
        this.f9794q = new ValueAnimator.AnimatorUpdateListener() { // from class: l4.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f23148a, materialShapeDrawable, valueAnimator);
            }
        };
    }

    public final void o() {
        Behavior behavior = this.A;
        BaseBehavior.SavedState savedStateX0 = (behavior == null || this.f9779b == -1 || this.f9783f != 0) ? null : behavior.x0(AbsSavedState.f2845b, this);
        this.f9779b = -1;
        this.f9780c = -1;
        this.f9781d = -1;
        if (savedStateX0 != null) {
            this.A.w0(savedStateX0, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f9799v == null) {
            this.f9799v = new int[4];
        }
        int[] iArr = this.f9799v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f9787j;
        int i11 = j4.b.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f9788k) ? j4.b.state_lifted : -j4.b.state_lifted;
        int i12 = j4.b.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f9788k) ? j4.b.state_collapsed : -j4.b.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && F()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.U(getChildAt(childCount), topInset);
            }
        }
        o();
        this.f9782e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f9782e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f9801x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f9786i) {
            return;
        }
        if (!this.f9789l && !k()) {
            z11 = false;
        }
        A(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && F()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = m0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.f9789l;
    }

    public final boolean q() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    public boolean r() {
        return this.f9788k;
    }

    public final MaterialShapeDrawable s(Drawable drawable) {
        if (drawable instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) drawable;
        }
        ColorStateList colorStateListF = w4.d.f(drawable);
        if (colorStateListF == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.i0(colorStateListF);
        return materialShapeDrawable;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(t(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        y(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f9789l = z10;
    }

    public void setLiftOnScrollColor(@Nullable ColorStateList colorStateList) {
        if (this.f9790m != colorStateList) {
            this.f9790m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f9791n = -1;
        if (view == null) {
            d();
        } else {
            this.f9792o = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i10) {
        this.f9791n = i10;
        d();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f9786i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setPendingAction(int i10) {
        this.f9783f = i10;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f9801x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f9801x = drawable != null ? drawable.mutate() : null;
            this.f9802y = e();
            Drawable drawable3 = this.f9801x;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f9801x.setState(getDrawableState());
                }
                k0.a.m(this.f9801x, getLayoutDirection());
                this.f9801x.setVisible(getVisibility() == 0, false);
                this.f9801x.setCallback(this);
            }
            H();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i10) {
        setStatusBarForeground(d.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        l4.h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f9801x;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final Drawable t(Context context, Drawable drawable) {
        MaterialShapeDrawable materialShapeDrawableS = s(drawable);
        if (materialShapeDrawableS == null || materialShapeDrawableS.D() == null) {
            return drawable;
        }
        this.f9800w = materialShapeDrawableS.D().getDefaultColor();
        ColorStateList colorStateList = this.f9790m;
        if (colorStateList != null) {
            m(materialShapeDrawableS, colorStateList);
            return materialShapeDrawableS;
        }
        n(context, materialShapeDrawableS);
        return materialShapeDrawableS;
    }

    public void u(int i10) {
        this.f9778a = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f9785h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                z.a(this.f9785h.get(i11));
            }
        }
    }

    public WindowInsetsCompat v(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = getFitsSystemWindows() ? windowInsetsCompat : null;
        if (!r0.d.a(this.f9784g, windowInsetsCompat2)) {
            this.f9784g = windowInsetsCompat2;
            H();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9801x;
    }

    public boolean w(d dVar) {
        return this.f9796s.remove(dVar);
    }

    public void x() {
        this.f9783f = 0;
    }

    public void y(boolean z10, boolean z11) {
        z(z10, z11, true);
    }

    public final void z(boolean z10, boolean z11, boolean z12) {
        this.f9783f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = B;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f9779b = -1;
        this.f9780c = -1;
        this.f9781d = -1;
        this.f9783f = 0;
        this.f9795r = new ArrayList();
        this.f9796s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            l4.h.a(this);
        }
        l4.h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.AppBarLayout, i10, i11, new int[0]);
        this.f9790m = d5.c.a(context2, typedArrayI, l.AppBarLayout_liftOnScrollColor);
        this.f9797t = b5.k.f(context2, j4.b.motionDurationMedium2, getResources().getInteger(g.app_bar_elevation_anim_duration));
        this.f9798u = b5.k.g(context2, j4.b.motionEasingStandardInterpolator, k4.a.f21834a);
        int i12 = l.AppBarLayout_expanded;
        if (typedArrayI.hasValue(i12)) {
            z(typedArrayI.getBoolean(i12, false), false, false);
        }
        if (typedArrayI.hasValue(l.AppBarLayout_elevation)) {
            l4.h.b(this, typedArrayI.getDimensionPixelSize(r10, 0));
        }
        setBackground(typedArrayI.getDrawable(l.AppBarLayout_android_background));
        if (Build.VERSION.SDK_INT >= 26) {
            int i13 = l.AppBarLayout_android_keyboardNavigationCluster;
            if (typedArrayI.hasValue(i13)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(i13, false));
            }
            int i14 = l.AppBarLayout_android_touchscreenBlocksFocus;
            if (typedArrayI.hasValue(i14)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(i14, false));
            }
        }
        this.f9803z = getResources().getDimension(j4.d.design_appbar_elevation);
        this.f9789l = typedArrayI.getBoolean(l.AppBarLayout_liftOnScroll, false);
        this.f9791n = typedArrayI.getResourceId(l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayI.getDrawable(l.AppBarLayout_statusBarForeground));
        typedArrayI.recycle();
        ViewCompat.t0(this, new a());
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f9820a;

        /* renamed from: b, reason: collision with root package name */
        public b f9821b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f9822c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9820a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.AppBarLayout_Layout);
            this.f9820a = typedArrayObtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollFlags, 0);
            f(typedArrayObtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i10 = l.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f9822c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f9821b;
        }

        public int c() {
            return this.f9820a;
        }

        public Interpolator d() {
            return this.f9822c;
        }

        public boolean e() {
            int i10 = this.f9820a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f9821b = a(i10);
        }

        public void g(int i10) {
            this.f9820a = i10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f9820a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9820a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9820a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9820a = 1;
        }
    }
}
