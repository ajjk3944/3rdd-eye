package com.google.android.material.appbar;

import B3.m;
import E.e;
import R.F;
import R.InterfaceC0183j;
import R.O;
import R.r0;
import V2.h;
import a4.p;
import a4.t;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.material.appbar.AppBarLayout;
import d3.AbstractC2266a;
import d5.y;
import e3.AbstractC2303a;
import f3.f;
import f3.g;
import f3.i;
import f3.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import x3.AbstractC2993B;
import x3.C2997b;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements E.a {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f18004P = 0;

    /* renamed from: C, reason: collision with root package name */
    public WeakReference f18005C;

    /* renamed from: D, reason: collision with root package name */
    public ValueAnimator f18006D;

    /* renamed from: E, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f18007E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f18008F;

    /* renamed from: G, reason: collision with root package name */
    public final LinkedHashSet f18009G;

    /* renamed from: H, reason: collision with root package name */
    public final long f18010H;

    /* renamed from: I, reason: collision with root package name */
    public final TimeInterpolator f18011I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f18012J;

    /* renamed from: K, reason: collision with root package name */
    public int f18013K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f18014L;
    public Integer M;

    /* renamed from: N, reason: collision with root package name */
    public final float f18015N;

    /* renamed from: O, reason: collision with root package name */
    public Behavior f18016O;

    /* renamed from: a, reason: collision with root package name */
    public int f18017a;

    /* renamed from: b, reason: collision with root package name */
    public int f18018b;

    /* renamed from: c, reason: collision with root package name */
    public int f18019c;

    /* renamed from: d, reason: collision with root package name */
    public int f18020d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18021e;

    /* renamed from: f, reason: collision with root package name */
    public int f18022f;

    /* renamed from: g, reason: collision with root package name */
    public r0 f18023g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18024h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18025j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18026k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18027l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f18028m;

    /* renamed from: n, reason: collision with root package name */
    public int f18029n;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // E.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // E.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            E.b bVar = ((e) view2.getLayoutParams()).f1311a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f18030j) + this.f20102e) - y(view2);
                WeakHashMap weakHashMap = O.f3270a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f18027l) {
                return false;
            }
            appBarLayout.f(appBarLayout.g(view));
            return false;
        }

        @Override // E.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                O.m(coordinatorLayout, null);
            }
        }

        @Override // E.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f20100c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.e(false, !z6, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.M);
            this.f20103f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(O3.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f18018b = -1;
        this.f18019c = -1;
        this.f18020d = -1;
        this.f18022f = 0;
        this.f18008F = new ArrayList();
        this.f18009G = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context3, attributeSet, j.f20110a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayI.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayI.getResourceId(0, 0)));
            }
            typedArrayI.recycle();
            TypedArray typedArrayI2 = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19747a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.f18028m = com.bumptech.glide.c.n(context2, typedArrayI2, 6);
            this.f18010H = com.bumptech.glide.d.O(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f18011I = com.bumptech.glide.d.P(context2, R.attr.motionEasingStandardInterpolator, AbstractC2303a.f19927a);
            if (typedArrayI2.hasValue(4)) {
                e(typedArrayI2.getBoolean(4, false), false, false);
            }
            if (typedArrayI2.hasValue(3)) {
                j.a(this, typedArrayI2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayI2.getDrawable(0));
            int i = 26;
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayI2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayI2.getBoolean(2, false));
                }
                if (typedArrayI2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayI2.getBoolean(1, false));
                }
            }
            this.f18015N = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f18027l = typedArrayI2.getBoolean(5, false);
            this.f18029n = typedArrayI2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayI2.getDrawable(8));
            typedArrayI2.recycle();
            A0.e eVar = new A0.e(i, this);
            WeakHashMap weakHashMap = O.f3270a;
            F.k(this, eVar);
        } catch (Throwable th) {
            typedArrayI.recycle();
            throw th;
        }
    }

    public static f3.b b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            f3.b bVar = new f3.b((LinearLayout.LayoutParams) layoutParams);
            bVar.f20088a = 1;
            return bVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            f3.b bVar2 = new f3.b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar2.f20088a = 1;
            return bVar2;
        }
        f3.b bVar3 = new f3.b(layoutParams);
        bVar3.f20088a = 1;
        return bVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f3.b generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f3.b bVar = new f3.b(context, attributeSet);
        bVar.f20088a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19748b);
        bVar.f20088a = typedArrayObtainStyledAttributes.getInt(1, 0);
        bVar.f20089b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new h(22);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            bVar.f20090c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    public final void c() {
        Behavior behavior = this.f18016O;
        d dVarF = (behavior == null || this.f18018b == -1 || this.f18022f != 0) ? null : behavior.F(W.b.f3953b, this);
        this.f18018b = -1;
        this.f18019c = -1;
        this.f18020d = -1;
        if (dVarF != null) {
            Behavior behavior2 = this.f18016O;
            if (behavior2.f18033m != null) {
                return;
            }
            behavior2.f18033m = dVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f3.b;
    }

    public final void d(int i) {
        this.f18017a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f18024h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                f3.d dVar = (f3.d) this.f18024h.get(i3);
                if (dVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = dVar.f20093a;
                    collapsingToolbarLayout.f18047P = i;
                    C2997b c2997b = collapsingToolbarLayout.f18067m;
                    C2997b c2997b2 = collapsingToolbarLayout.f18066l;
                    r0 r0Var = collapsingToolbarLayout.f18050S;
                    int iD = r0Var != null ? r0Var.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i6);
                        f3.c cVar = (f3.c) childAt.getLayoutParams();
                        i iVarB = CollapsingToolbarLayout.b(childAt);
                        int i7 = cVar.f20091a;
                        if (i7 == 1) {
                            iVarB.b(y.f(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f20107b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((f3.c) childAt.getLayoutParams())).bottomMargin));
                        } else if (i7 == 2) {
                            iVarB.b(Math.round((-i) * cVar.f20092b));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.f18039G != null && iD > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
                    int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    int i8 = collapsingToolbarLayout.f18047P + minimumHeight;
                    float f2 = minimumHeight;
                    float fAbs = Math.abs(i) / f2;
                    float f5 = scrimVisibleHeightTrigger / f2;
                    float fMin = Math.min(1.0f, f5);
                    c2997b2.f24070d = fMin;
                    c2997b2.f24072e = AbstractC1135f5.h(1.0f, fMin, 0.5f, fMin);
                    c2997b2.f24074f = i8;
                    c2997b2.A(fAbs);
                    float fMin2 = Math.min(1.0f, f5);
                    c2997b.f24070d = fMin2;
                    c2997b.f24072e = AbstractC1135f5.h(1.0f, fMin2, 0.5f, fMin2);
                    c2997b.f24074f = i8;
                    c2997b.A(fAbs);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18014L == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f18017a);
        this.f18014L.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f18014L;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z6, boolean z7, boolean z8) {
        this.f18022f = (z6 ? 1 : 2) | (z7 ? 4 : 0) | (z8 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z6) {
        if (this.i || this.f18026k == z6) {
            return false;
        }
        this.f18026k = z6;
        refreshDrawableState();
        if (!(getBackground() instanceof G3.j)) {
            return true;
        }
        if (this.f18028m != null) {
            h(z6 ? 0.0f : 1.0f, z6 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f18027l) {
            return true;
        }
        float f2 = this.f18015N;
        h(z6 ? 0.0f : f2, z6 ? f2 : 0.0f);
        return true;
    }

    public final boolean g(View view) {
        int i;
        if (this.f18005C == null && (i = this.f18029n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f18029n);
            }
            if (viewFindViewById != null) {
                this.f18005C = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f18005C;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f3.b bVar = new f3.b(-1, -2);
        bVar.f20088a = 1;
        return bVar;
    }

    @Override // E.a
    public E.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f18016O = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f18019c;
        if (i != -1) {
            return i;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                f3.b bVar = (f3.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.f20088a;
                if ((i6 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i7 = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    if ((i6 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i6 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i7 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i3 += iMin;
                    }
                    iMin = minimumHeight + i7;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i3 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i3);
        this.f18019c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f18020d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f3.b bVar = (f3.b) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + childAt.getMeasuredHeight();
                int i6 = bVar.f20088a;
                if ((i6 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i6 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i3++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f18020d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f18029n;
    }

    public G3.j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof G3.j) {
            return (G3.j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i3 = (minimumHeight2 * 2) + topInset;
        return i3 < getHeight() ? i3 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f18022f;
    }

    public Drawable getStatusBarForeground() {
        return this.f18014L;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        r0 r0Var = this.f18023g;
        if (r0Var != null) {
            return r0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f18018b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f3.b bVar = (f3.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.f20088a;
                if ((i6 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + minimumHeight;
                if (i3 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i6 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i3++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f18018b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f2, float f5) {
        ValueAnimator valueAnimator = this.f18006D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f5);
        this.f18006D = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f18010H);
        this.f18006D.setInterpolator(this.f18011I);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f18007E;
        if (animatorUpdateListener != null) {
            this.f18006D.addUpdateListener(animatorUpdateListener);
        }
        this.f18006D.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.s(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f18012J == null) {
            this.f18012J = new int[4];
        }
        int[] iArr = this.f18012J;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z6 = this.f18025j;
        iArr[0] = z6 ? R.attr.state_liftable : -2130969748;
        iArr[1] = (z6 && this.f18026k) ? R.attr.state_lifted : -2130969749;
        iArr[2] = z6 ? R.attr.state_collapsible : -2130969744;
        iArr[3] = (z6 && this.f18026k) ? R.attr.state_collapsed : -2130969743;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f18005C;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f18005C = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        boolean z7 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = O.f3270a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f18021e = false;
        int childCount2 = getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount2) {
                break;
            }
            if (((f3.b) getChildAt(i8).getLayoutParams()).f20090c != null) {
                this.f18021e = true;
                break;
            }
            i8++;
        }
        Drawable drawable = this.f18014L;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.f18027l) {
            int childCount3 = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount3) {
                    z7 = false;
                    break;
                }
                int i10 = ((f3.b) getChildAt(i9).getLayoutParams()).f20088a;
                if ((i10 & 1) == 1 && (i10 & 10) != 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (this.f18025j != z7) {
            this.f18025j = z7;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = y.f(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
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
        final G3.j jVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof G3.j) {
            jVar = (G3.j) drawable;
        } else {
            ColorStateList colorStateListN = R2.a.n(drawable);
            if (colorStateListN == null) {
                jVar = null;
            } else {
                G3.j jVar2 = new G3.j();
                jVar2.q(colorStateListN);
                jVar = jVar2;
            }
        }
        if (jVar != null && (colorStateList = jVar.f1597b.f1563d) != null) {
            this.f18013K = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f18028m;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueN = y.n(context2, R.attr.colorSurface);
                if (typedValueN != null) {
                    int i = typedValueN.resourceId;
                    numValueOf = Integer.valueOf(i != 0 ? context2.getColor(i) : typedValueN.data);
                }
                this.f18007E = new ValueAnimator.AnimatorUpdateListener() { // from class: f3.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f20084a;
                        LinkedHashSet linkedHashSet = appBarLayout.f18009G;
                        ArrayList arrayList = appBarLayout.f18008F;
                        int iT = com.bumptech.glide.e.t(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.f18013K, colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
                        G3.j jVar3 = jVar;
                        jVar3.q(colorStateListValueOf);
                        if (appBarLayout.f18014L != null && (num = appBarLayout.M) != null && num.equals(numValueOf)) {
                            appBarLayout.f18014L.setTint(iT);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                if (jVar3.f1597b.f1563d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw A.f.f(it);
                        }
                    }
                };
            } else {
                jVar.m(context);
                this.f18007E = new m(this, 2, jVar);
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        p.q(this, f2);
    }

    public void setExpanded(boolean z6) {
        e(z6, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z6) {
        this.f18027l = z6;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f18028m != colorStateList) {
            this.f18028m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f18029n = -1;
        if (view != null) {
            this.f18005C = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f18005C;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f18005C = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f18029n = i;
        WeakReference weakReference = this.f18005C;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f18005C = null;
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.i = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setPendingAction(int i) {
        this.f18022f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f18014L;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f18014L = drawableMutate;
            if (drawableMutate instanceof G3.j) {
                numValueOf = Integer.valueOf(((G3.j) drawableMutate).f1587J);
            } else {
                ColorStateList colorStateListN = R2.a.n(drawableMutate);
                if (colorStateListN != null) {
                    numValueOf = Integer.valueOf(colorStateListN.getDefaultColor());
                }
            }
            this.M = numValueOf;
            Drawable drawable3 = this.f18014L;
            boolean z6 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f18014L.setState(getDrawableState());
                }
                this.f18014L.setLayoutDirection(getLayoutDirection());
                this.f18014L.setVisible(getVisibility() == 0, false);
                this.f18014L.setCallback(this);
            }
            if (this.f18014L != null && getTopInset() > 0) {
                z6 = true;
            }
            setWillNotDraw(!z6);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(t.i(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        j.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z6 = i == 0;
        Drawable drawable = this.f18014L;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18014L;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends f {

        /* renamed from: j, reason: collision with root package name */
        public int f18030j;

        /* renamed from: k, reason: collision with root package name */
        public int f18031k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f18032l;

        /* renamed from: m, reason: collision with root package name */
        public d f18033m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f18034n;

        public BaseBehavior() {
            this.f20097f = -1;
            this.f20099h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((e) childAt.getLayoutParams()).f1311a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0183j) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void H(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5a
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                f3.b r0 = (f3.b) r0
                int r0 = r0.f20088a
                r1 = r0 & 1
                if (r1 == 0) goto L5a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L48
                r9 = r0 & 12
                if (r9 == 0) goto L48
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L48:
                r9 = r0 & 2
                if (r9 == 0) goto L5a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                boolean r8 = r7.f18027l
                if (r8 == 0) goto L67
                android.view.View r8 = D(r6)
                boolean r3 = r7.g(r8)
            L67:
                boolean r8 = r7.f(r3)
                if (r10 != 0) goto La7
                if (r8 == 0) goto Lce
                c1.g r8 = r6.f5067b
                java.lang.Object r8 = r8.f5897c
                u.i r8 = (u.C2940i) r8
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.f5069d
                r6.clear()
                if (r8 == 0) goto L85
                r6.addAll(r8)
            L85:
                int r8 = r6.size()
            L89:
                if (r2 >= r8) goto Lce
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                E.e r9 = (E.e) r9
                E.b r9 = r9.f1311a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.f20103f
                if (r6 == 0) goto Lce
                goto La7
            La4:
                int r2 = r2 + 1
                goto L89
            La7:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lb4
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lb4:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lc1
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lc1:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lce
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.H(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(y() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            if (iY == i) {
                ValueAnimator valueAnimator = this.f18032l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f18032l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f18032l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f18032l = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC2303a.f19931e);
                this.f18032l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f18032l.setDuration(Math.min(iRound, 600));
            this.f18032l.setIntValues(iY, i);
            this.f18032l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void E(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
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
                int r0 = r8.y()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.z(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f18027l
                if (r9 == 0) goto L37
                boolean r9 = r4.g(r11)
                r4.f(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = W.b.f3953b;
                    }
                    d dVar = new d(parcelable);
                    boolean z6 = iW == 0;
                    dVar.f18082d = z6;
                    dVar.f18081c = !z6 && (-iW) >= appBarLayout.getTotalScrollRange();
                    dVar.f18083e = i;
                    dVar.f18085g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.f18084f = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f3.b bVar = (f3.b) childAt.getLayoutParams();
                if ((bVar.f20088a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) bVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) bVar).bottomMargin;
                }
                int i3 = -iY;
                if (top <= i3 && bottom >= i3) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                f3.b bVar2 = (f3.b) childAt2.getLayoutParams();
                int i6 = bVar2.f20088a;
                if ((i6 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i6 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i6 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i6 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) bVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) bVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, y.f(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // f3.h, E.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f18033m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, i3);
                        } else {
                            A(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f18081c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f18082d) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f18083e);
                int i6 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.f18033m.f18085g ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i6 : Math.round(childAt.getHeight() * this.f18033m.f18084f) + i6);
            }
            appBarLayout.f18022f = 0;
            this.f18033m = null;
            int iF = y.f(w(), -appBarLayout.getTotalScrollRange(), 0);
            i iVar = this.f20104a;
            if (iVar != null) {
                iVar.b(iF);
            } else {
                this.f20105b = iF;
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.d(w());
            if (O.d(coordinatorLayout) != null) {
                return true;
            }
            O.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // E.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i, i3, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // E.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3, int[] iArr, int i6) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        @Override // E.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i3, int i6, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i6 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i6, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i6 == 0 && O.d(coordinatorLayout2) == null) {
                O.m(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // E.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f18033m = (d) parcelable;
            } else {
                this.f18033m = null;
            }
        }

        @Override // E.b
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarF = F(absSavedState, (AppBarLayout) view);
            return dVarF == null ? absSavedState : dVarF;
        }

        @Override // E.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i3) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z6 = (i & 2) != 0 && (appBarLayout.f18027l || appBarLayout.f18026k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z6 && (valueAnimator = this.f18032l) != null) {
                valueAnimator.cancel();
            }
            this.f18034n = null;
            this.f18031k = i3;
            return z6;
        }

        @Override // E.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f18031k == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f18027l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f18034n = new WeakReference(view2);
        }

        @Override // f3.f
        public final int y() {
            return w() + this.f18030j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
        @Override // f3.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f20097f = -1;
            this.f20099h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        f3.b bVar = new f3.b(-1, -2);
        bVar.f20088a = 1;
        return bVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
