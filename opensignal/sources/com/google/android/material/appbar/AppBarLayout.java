package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
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
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import ba.m;
import com.google.android.material.appbar.AppBarLayout;
import ed.d;
import ed.k;
import ed.l;
import ee.i;
import gd.e;
import gd.g;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import u3.h1;
import u3.i0;
import u3.j;
import u3.z;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements e3.a {
    public static final int W = k.Widget_Design_AppBarLayout;
    public h1 B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ColorStateList H;
    public int I;
    public WeakReference J;
    public ValueAnimator K;
    public ValueAnimator.AnimatorUpdateListener L;
    public final ArrayList M;
    public final LinkedHashSet N;
    public final long O;
    public final TimeInterpolator P;
    public int[] Q;
    public int R;
    public Drawable S;
    public Integer T;
    public final float U;
    public Behavior V;

    /* renamed from: a, reason: collision with root package name */
    public int f5443a;

    /* renamed from: d, reason: collision with root package name */
    public int f5444d;

    /* renamed from: g, reason: collision with root package name */
    public int f5445g;

    /* renamed from: r, reason: collision with root package name */
    public int f5446r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5447x;

    /* renamed from: y, reason: collision with root package name */
    public int f5448y;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // e3.b
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // e3.b
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            e3.b bVar = ((e3.e) view2.getLayoutParams()).f7771a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).j) + this.f9514e) - u(view2);
                WeakHashMap weakHashMap = i0.f23177a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.G) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // e3.b
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                i0.n(coordinatorLayout, null);
            }
        }

        @Override // e3.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.k(view));
            if (appBarLayoutV != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f9512c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutV.d(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ScrollingViewBehavior_Layout);
            this.f9515f = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10 = ed.b.appBarLayoutStyle;
        int i11 = W;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.f5444d = -1;
        this.f5445g = -1;
        this.f5446r = -1;
        this.f5448y = 0;
        this.M = new ArrayList();
        this.N = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = xd.k.d(context3, attributeSet, g.f9518a, i10, i11, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = xd.k.d(context2, attributeSet, l.AppBarLayout, i10, i11, new int[0]);
            this.H = xu.l.q(context2, typedArrayD2, l.AppBarLayout_liftOnScrollColor);
            this.O = f0.U(context2, ed.b.motionDurationMedium2, getResources().getInteger(ed.g.app_bar_elevation_anim_duration));
            this.P = f0.V(context2, ed.b.motionEasingStandardInterpolator, fd.a.f8822a);
            if (typedArrayD2.hasValue(l.AppBarLayout_expanded)) {
                d(typedArrayD2.getBoolean(l.AppBarLayout_expanded, false), false, false);
            }
            if (typedArrayD2.hasValue(l.AppBarLayout_elevation)) {
                g.a(this, typedArrayD2.getDimensionPixelSize(l.AppBarLayout_elevation, 0));
            }
            setBackground(typedArrayD2.getDrawable(l.AppBarLayout_android_background));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayD2.hasValue(l.AppBarLayout_android_keyboardNavigationCluster)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(l.AppBarLayout_android_keyboardNavigationCluster, false));
                }
                if (typedArrayD2.hasValue(l.AppBarLayout_android_touchscreenBlocksFocus)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(l.AppBarLayout_android_touchscreenBlocksFocus, false));
                }
            }
            this.U = getResources().getDimension(d.design_appbar_elevation);
            this.G = typedArrayD2.getBoolean(l.AppBarLayout_liftOnScroll, false);
            this.I = typedArrayD2.getResourceId(l.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(l.AppBarLayout_statusBarForeground));
            typedArrayD2.recycle();
            b9.c cVar = new b9.c(24, this);
            WeakHashMap weakHashMap = i0.f23177a;
            z.j(this, cVar);
        } catch (Throwable th2) {
            typedArrayD.recycle();
            throw th2;
        }
    }

    public static gd.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            gd.c cVar = new gd.c((LinearLayout.LayoutParams) layoutParams);
            cVar.f9502a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            gd.c cVar2 = new gd.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f9502a = 1;
            return cVar2;
        }
        gd.c cVar3 = new gd.c(layoutParams);
        cVar3.f9502a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gd.c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        gd.c cVar = new gd.c(context, attributeSet);
        cVar.f9502a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.AppBarLayout_Layout);
        cVar.f9502a = typedArrayObtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollFlags, 0);
        cVar.f9503b = typedArrayObtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new bm.e(21);
        if (typedArrayObtainStyledAttributes.hasValue(l.AppBarLayout_Layout_layout_scrollInterpolator)) {
            cVar.f9504c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.V;
        BaseBehavior.SavedState savedStateB = (behavior == null || this.f5444d == -1 || this.f5448y != 0) ? null : behavior.B(AbsSavedState.f1242d, this);
        this.f5444d = -1;
        this.f5445g = -1;
        this.f5446r = -1;
        if (savedStateB != null) {
            Behavior behavior2 = this.V;
            if (behavior2.f5450m != null) {
                return;
            }
            behavior2.f5450m = savedStateB;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gd.c;
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        this.f5448y = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.S == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f5443a);
        this.S.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.S;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z10) {
        if (this.D || this.F == z10) {
            return false;
        }
        this.F = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof i)) {
            return true;
        }
        if (this.H != null) {
            g(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.G) {
            return true;
        }
        float f10 = this.U;
        g(z10 ? 0.0f : f10, z10 ? f10 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i10;
        if (this.J == null && (i10 = this.I) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.I);
            }
            if (viewFindViewById != null) {
                this.J = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.J;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.K = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.O);
        this.K.setInterpolator(this.P);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.L;
        if (animatorUpdateListener != null) {
            this.K.addUpdateListener(animatorUpdateListener);
        }
        this.K.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        gd.c cVar = new gd.c(-1, -2);
        cVar.f9502a = 1;
        return cVar;
    }

    @Override // e3.a
    public e3.b getBehavior() {
        Behavior behavior = new Behavior();
        this.V = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f5445g;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                gd.c cVar = (gd.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f9502a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
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
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f5445g = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f5446r;
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
                gd.c cVar = (gd.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f9502a;
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
        this.f5446r = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.I;
    }

    public i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof i) {
            return (i) background;
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
        return this.f5448y;
    }

    public Drawable getStatusBarForeground() {
        return this.S;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        h1 h1Var = this.B;
        if (h1Var != null) {
            return h1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f5444d;
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
                gd.c cVar = (gd.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f9502a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f5444d = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        se.b.V(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.Q == null) {
            this.Q = new int[4];
        }
        int[] iArr = this.Q;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.E;
        int i11 = ed.b.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.F) ? ed.b.state_lifted : -ed.b.state_lifted;
        int i12 = ed.b.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.F) ? ed.b.state_collapsed : -ed.b.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.J = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = i0.f23177a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f5447x = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((gd.c) getChildAt(i14).getLayoutParams()).f9504c != null) {
                this.f5447x = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.S;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.D) {
            return;
        }
        if (!this.G) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((gd.c) getChildAt(i15).getLayoutParams()).f9502a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.E != z11) {
            this.E = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = dr.a.g(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final i iVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof i) {
            iVar = (i) drawable;
        } else {
            ColorStateList colorStateListY = m.y(drawable);
            if (colorStateListY == null) {
                iVar = null;
            } else {
                i iVar2 = new i();
                iVar2.q(colorStateListY);
                iVar = iVar2;
            }
        }
        if (iVar != null && (colorStateList = iVar.f8117d.f8100d) != null) {
            this.R = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.H;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueC0 = xu.d.c0(context2, ed.b.colorSurface);
                if (typedValueC0 != null) {
                    int i10 = typedValueC0.resourceId;
                    numValueOf = Integer.valueOf(i10 != 0 ? context2.getColor(i10) : typedValueC0.data);
                }
                this.L = new ValueAnimator.AnimatorUpdateListener() { // from class: gd.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f9495a;
                        LinkedHashSet linkedHashSet = appBarLayout.N;
                        ArrayList arrayList = appBarLayout.M;
                        int iB0 = io.sentry.config.a.b0(appBarLayout.R, ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB0);
                        i iVar3 = iVar;
                        iVar3.q(colorStateListValueOf);
                        if (appBarLayout.S != null && (num = appBarLayout.T) != null && num.equals(numValueOf)) {
                            appBarLayout.S.setTint(iB0);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (iVar3.f8117d.f8100d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw w.g.d(it2);
                        }
                    }
                };
            } else {
                iVar.m(context);
                this.L = new gd.b(this, 0, iVar);
            }
            drawable = iVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        se.b.T(this, f10);
    }

    public void setExpanded(boolean z10) {
        d(z10, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.G = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.I = -1;
        if (view != null) {
            this.J = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.J = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.I = i10;
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.J = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.D = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setPendingAction(int i10) {
        this.f5448y = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.S;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.S = drawableMutate;
            if (drawableMutate instanceof i) {
                numValueOf = Integer.valueOf(((i) drawableMutate).R);
            } else {
                ColorStateList colorStateListY = m.y(drawableMutate);
                if (colorStateListY != null) {
                    numValueOf = Integer.valueOf(colorStateListY.getDefaultColor());
                }
            }
            this.T = numValueOf;
            Drawable drawable3 = this.S;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.S.setState(getDrawableState());
                }
                this.S.setLayoutDirection(getLayoutDirection());
                this.S.setVisible(getVisibility() == 0, false);
                this.S.setCallback(this);
            }
            if (this.S != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(ic.a.r(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        g.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.S;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.S;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends gd.d {
        public int j;
        public int k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f5449l;

        /* renamed from: m, reason: collision with root package name */
        public SavedState f5450m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f5451n;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new c();
            public boolean B;

            /* renamed from: g, reason: collision with root package name */
            public boolean f5452g;

            /* renamed from: r, reason: collision with root package name */
            public boolean f5453r;

            /* renamed from: x, reason: collision with root package name */
            public int f5454x;

            /* renamed from: y, reason: collision with root package name */
            public float f5455y;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f5452g = parcel.readByte() != 0;
                this.f5453r = parcel.readByte() != 0;
                this.f5454x = parcel.readInt();
                this.f5455y = parcel.readFloat();
                this.B = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f5452g ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f5453r ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f5454x);
                parcel.writeFloat(this.f5455y);
                parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f9508f = -1;
            this.f9510h = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void D(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                gd.c r0 = (gd.c) r0
                int r0 = r0.f9502a
                r1 = r0 & 1
                if (r1 == 0) goto L5b
                int r1 = r5.getMinimumHeight()
                r3 = 1
                if (r10 <= 0) goto L49
                r10 = r0 & 12
                if (r10 == 0) goto L49
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L49:
                r10 = r0 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L5b:
                r3 = r2
            L5c:
                boolean r9 = r8.G
                if (r9 == 0) goto L68
                android.view.View r9 = z(r7)
                boolean r3 = r8.f(r9)
            L68:
                boolean r9 = r8.e(r3)
                if (r11 != 0) goto Laa
                if (r9 == 0) goto Ld1
                kg.r r7 = r7.f1203d
                java.lang.Object r7 = r7.f14396d
                u.i0 r7 = (u.i0) r7
                java.lang.Object r7 = r7.get(r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                if (r7 != 0) goto L7f
                goto L84
            L7f:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r7)
            L84:
                if (r4 != 0) goto L88
                java.util.List r4 = java.util.Collections.EMPTY_LIST
            L88:
                int r7 = r4.size()
            L8c:
                if (r2 >= r7) goto Ld1
                java.lang.Object r9 = r4.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                e3.e r9 = (e3.e) r9
                e3.b r9 = r9.f7771a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La7
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r7 = r9.f9515f
                if (r7 == 0) goto Ld1
                goto Laa
            La7:
                int r2 = r2 + 1
                goto L8c
            Laa:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb7
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb7:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lc4
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lc4:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Ld1
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Ld1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static View x(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((e3.e) childAt.getLayoutParams()).f7771a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof j) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void A(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.u()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.v(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.G
                if (r9 == 0) goto L37
                boolean r9 = r4.f(r11)
                r4.e(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final SavedState B(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f1242d;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iS == 0;
                    savedState.f5453r = z10;
                    savedState.f5452g = !z10 && (-iS) >= appBarLayout.getTotalScrollRange();
                    savedState.f5454x = i10;
                    savedState.B = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f5455y = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iU = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                gd.c cVar = (gd.c) childAt.getLayoutParams();
                if ((cVar.f9502a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -iU;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                gd.c cVar2 = (gd.c) childAt2.getLayoutParams();
                int i12 = cVar2.f9502a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i12 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iU < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iU < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    y(coordinatorLayout, appBarLayout, dr.a.g(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // gd.f, e3.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f5450m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            y(coordinatorLayout, appBarLayout, i11);
                        } else {
                            w(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            y(coordinatorLayout, appBarLayout, 0);
                        } else {
                            w(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f5452g) {
                w(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f5453r) {
                w(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f5454x);
                int i12 = -childAt.getBottom();
                w(coordinatorLayout, appBarLayout, this.f5450m.B ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i12 : Math.round(childAt.getHeight() * this.f5450m.f5455y) + i12);
            }
            appBarLayout.f5448y = 0;
            this.f5450m = null;
            int iG = dr.a.g(s(), -appBarLayout.getTotalScrollRange(), 0);
            androidx.datastore.preferences.protobuf.l lVar = this.f9516a;
            if (lVar == null) {
                this.f9517b = iG;
            } else if (lVar.f1313c != iG) {
                lVar.f1313c = iG;
                lVar.c();
            }
            D(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f5443a = s();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (i0.d(coordinatorLayout) != null) {
                return true;
            }
            i0.n(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // e3.b
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e3.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.t(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // e3.b
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // e3.b
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = v(coordinatorLayout2, appBarLayout, u() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i12 == 0 && i0.d(coordinatorLayout2) == null) {
                i0.n(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // e3.b
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f5450m = (SavedState) parcelable;
            } else {
                this.f5450m = null;
            }
        }

        @Override // e3.b
        public final Parcelable o(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateB = B(absSavedState, (AppBarLayout) view);
            return savedStateB == null ? absSavedState : savedStateB;
        }

        @Override // e3.b
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.G || appBarLayout.F || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f5449l) != null) {
                valueAnimator.cancel();
            }
            this.f5451n = null;
            this.k = i11;
            return z10;
        }

        @Override // e3.b
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i10 == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.G) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f5451n = new WeakReference(view2);
        }

        @Override // gd.d
        public final int u() {
            return s() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
        @Override // gd.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int v(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 381
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(u() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iU = u();
            if (iU == i10) {
                ValueAnimator valueAnimator = this.f5449l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f5449l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f5449l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f5449l = valueAnimator3;
                valueAnimator3.setInterpolator(fd.a.f8826e);
                this.f5449l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f5449l.setDuration(Math.min(iRound, 600));
            this.f5449l.setIntValues(iU, i10);
            this.f5449l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f9508f = -1;
            this.f9510h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        gd.c cVar = new gd.c(-1, -2);
        cVar.f9502a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
