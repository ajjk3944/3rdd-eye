package com.google.android.material.appbar;

import a4.l;
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
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.k;
import com.google.android.material.appbar.AppBarLayout;
import com.liuzh.deviceinfo.R;
import e4.a1;
import e4.c2;
import e4.m0;
import e4.o;
import e4.v0;
import ed.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import je.u;
import kc.f;
import p3.e;
import t6.i0;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements p3.a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f20285a;

    /* renamed from: b, reason: collision with root package name */
    public int f20286b;

    /* renamed from: c, reason: collision with root package name */
    public int f20287c;

    /* renamed from: d, reason: collision with root package name */
    public int f20288d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20289e;

    /* renamed from: f, reason: collision with root package name */
    public int f20290f;
    public c2 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20291h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20292i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20293k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f20294l;

    /* renamed from: m, reason: collision with root package name */
    public int f20295m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f20296n;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f20297o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f20298p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f20299q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f20300r;

    /* renamed from: s, reason: collision with root package name */
    public final long f20301s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f20302t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f20303u;

    /* renamed from: v, reason: collision with root package name */
    public int f20304v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f20305w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f20306x;

    /* renamed from: y, reason: collision with root package name */
    public final float f20307y;

    /* renamed from: z, reason: collision with root package name */
    public Behavior f20308z;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ScrollingViewBehavior extends kc.d {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p3.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p3.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            p3.b bVar = ((e) view2.getLayoutParams()).f31147a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).j) + this.f28136e) - y(view2);
                WeakHashMap weakHashMap = v0.f22405a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f20293k) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // p3.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                v0.o(coordinatorLayout, null);
            }
        }

        @Override // p3.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f28134c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.d(false, !z3, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.D);
            this.f28137f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(md.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f20286b = -1;
        this.f20287c = -1;
        this.f20288d = -1;
        this.f20290f = 0;
        this.f20299q = new ArrayList();
        this.f20300r = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayG = m.g(context3, attributeSet, f.f28140a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayG.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayG.getResourceId(0, 0)));
            }
            typedArrayG.recycle();
            TypedArray typedArrayG2 = m.g(context2, attributeSet, ic.a.f25942a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.f20294l = jm.a.j(context2, typedArrayG2, 6);
            this.f20301s = nh.a.v(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f20302t = nh.a.w(context2, R.attr.motionEasingStandardInterpolator, jc.a.f27482a);
            if (typedArrayG2.hasValue(4)) {
                d(typedArrayG2.getBoolean(4, false), false, false);
            }
            if (typedArrayG2.hasValue(3)) {
                f.a(this, typedArrayG2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayG2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayG2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayG2.getBoolean(2, false));
                }
                if (typedArrayG2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayG2.getBoolean(1, false));
                }
            }
            this.f20307y = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f20293k = typedArrayG2.getBoolean(5, false);
            this.f20295m = typedArrayG2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayG2.getDrawable(8));
            typedArrayG2.recycle();
            o7.c cVar = new o7.c(29, this);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(this, cVar);
        } catch (Throwable th2) {
            typedArrayG.recycle();
            throw th2;
        }
    }

    public static kc.b b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            kc.b bVar = new kc.b((LinearLayout.LayoutParams) layoutParams);
            bVar.f28125a = 1;
            return bVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            kc.b bVar2 = new kc.b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar2.f28125a = 1;
            return bVar2;
        }
        kc.b bVar3 = new kc.b(layoutParams);
        bVar3.f28125a = 1;
        return bVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kc.b generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        kc.b bVar = new kc.b(context, attributeSet);
        bVar.f28125a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.f25943b);
        bVar.f28125a = typedArrayObtainStyledAttributes.getInt(1, 0);
        bVar.f28126b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new y4.a(29);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            bVar.f28127c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return bVar;
    }

    public final void c() {
        Behavior behavior = this.f20308z;
        d dVarF = (behavior == null || this.f20286b == -1 || this.f20290f != 0) ? null : behavior.F(m4.b.f28875b, this);
        this.f20286b = -1;
        this.f20287c = -1;
        this.f20288d = -1;
        if (dVarF != null) {
            Behavior behavior2 = this.f20308z;
            if (behavior2.f20311m != null) {
                return;
            }
            behavior2.f20311m = dVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kc.b;
    }

    public final void d(boolean z3, boolean z10, boolean z11) {
        this.f20290f = (z3 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f20305w == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f20285a);
        this.f20305w.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f20305w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z3) {
        if (this.f20291h || this.j == z3) {
            return false;
        }
        this.j = z3;
        refreshDrawableState();
        if (!(getBackground() instanceof j)) {
            return true;
        }
        if (this.f20294l != null) {
            g(z3 ? 0.0f : 1.0f, z3 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f20293k) {
            return true;
        }
        float f10 = this.f20307y;
        g(z3 ? 0.0f : f10, z3 ? f10 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i4;
        if (this.f20296n == null && (i4 = this.f20295m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i4) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f20295m);
            }
            if (viewFindViewById != null) {
                this.f20296n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f20296n;
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
        ValueAnimator valueAnimator = this.f20297o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f20297o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f20301s);
        this.f20297o.setInterpolator(this.f20302t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f20298p;
        if (animatorUpdateListener != null) {
            this.f20297o.addUpdateListener(animatorUpdateListener);
        }
        this.f20297o.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        kc.b bVar = new kc.b(-1, -2);
        bVar.f28125a = 1;
        return bVar;
    }

    @Override // p3.a
    public p3.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f20308z = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i4 = this.f20287c;
        if (i4 != -1) {
            return i4;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                kc.b bVar = (kc.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = bVar.f28125a;
                if ((i11 & 5) != 5) {
                    if (i10 > 0) {
                        break;
                    }
                } else {
                    int i12 = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    if ((i11 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i11 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i12 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i10 += iMin;
                    }
                    iMin = minimumHeight + i12;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i10 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i10);
        this.f20287c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i4 = this.f20288d;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                kc.b bVar = (kc.b) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + childAt.getMeasuredHeight();
                int i11 = bVar.f28125a;
                if ((i11 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i11 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f20288d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f20295m;
    }

    public j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof j) {
            return (j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i4 = (minimumHeight * 2) + topInset;
            return i4 < getHeight() ? i4 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i10 = (minimumHeight2 * 2) + topInset;
        return i10 < getHeight() ? i10 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f20290f;
    }

    public Drawable getStatusBarForeground() {
        return this.f20305w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        c2 c2Var = this.g;
        if (c2Var != null) {
            return c2Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.f20286b;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                kc.b bVar = (kc.b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = bVar.f28125a;
                if ((i11 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + minimumHeight;
                if (i10 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i11 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f20286b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            ii.a.E(this, (j) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        if (this.f20303u == null) {
            this.f20303u = new int[4];
        }
        int[] iArr = this.f20303u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z3 = this.f20292i;
        iArr[0] = z3 ? R.attr.state_liftable : -2130969860;
        iArr[1] = (z3 && this.j) ? R.attr.state_lifted : -2130969861;
        iArr[2] = z3 ? R.attr.state_collapsible : -2130969856;
        iArr[3] = (z3 && this.j) ? R.attr.state_collapsed : -2130969855;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f20296n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20296n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        boolean z10 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = v0.f22405a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f20289e = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            }
            if (((kc.b) getChildAt(i13).getLayoutParams()).f28127c != null) {
                this.f20289e = true;
                break;
            }
            i13++;
        }
        Drawable drawable = this.f20305w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f20291h) {
            return;
        }
        if (!this.f20293k) {
            int childCount3 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                int i15 = ((kc.b) getChildAt(i14).getLayoutParams()).f28125a;
                if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (this.f20292i != z10) {
            this.f20292i = z10;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = com.bumptech.glide.d.i(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
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
        final j jVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof j) {
            jVar = (j) drawable;
        } else {
            ColorStateList colorStateListA = l.a(drawable);
            if (colorStateListA == null) {
                jVar = null;
            } else {
                j jVar2 = new j();
                jVar2.o(colorStateListA);
                jVar = jVar2;
            }
        }
        if (jVar != null && (colorStateList = jVar.f23316b.f23301d) != null) {
            this.f20304v = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f20294l;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueY = ii.a.y(R.attr.colorSurface, context2);
                if (typedValueY != null) {
                    int i4 = typedValueY.resourceId;
                    numValueOf = Integer.valueOf(i4 != 0 ? context2.getColor(i4) : typedValueY.data);
                }
                this.f20298p = new ValueAnimator.AnimatorUpdateListener() { // from class: kc.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f28121a;
                        LinkedHashSet linkedHashSet = appBarLayout.f20300r;
                        ArrayList arrayList = appBarLayout.f20299q;
                        int iO = i0.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.f20304v, colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO);
                        j jVar3 = jVar;
                        jVar3.o(colorStateListValueOf);
                        if (appBarLayout.f20305w != null && (num = appBarLayout.f20306x) != null && num.equals(numValueOf)) {
                            appBarLayout.f20305w.setTint(iO);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                if (jVar3.f23316b.f23301d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw u.o(it);
                        }
                    }
                };
            } else {
                jVar.l(context);
                this.f20298p = new a1(1, this, jVar);
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).n(f10);
        }
    }

    public void setExpanded(boolean z3) {
        d(z3, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z3) {
        this.f20293k = z3;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f20294l != colorStateList) {
            this.f20294l = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f20295m = -1;
        if (view != null) {
            this.f20296n = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f20296n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20296n = null;
    }

    public void setLiftOnScrollTargetViewId(int i4) {
        this.f20295m = i4;
        WeakReference weakReference = this.f20296n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20296n = null;
    }

    public void setLiftableOverrideEnabled(boolean z3) {
        this.f20291h = z3;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i4);
    }

    public void setPendingAction(int i4) {
        this.f20290f = i4;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f20305w;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f20305w = drawableMutate;
            if (drawableMutate instanceof j) {
                numValueOf = Integer.valueOf(((j) drawableMutate).f23334v);
            } else {
                ColorStateList colorStateListA = l.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.f20306x = numValueOf;
            Drawable drawable3 = this.f20305w;
            boolean z3 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f20305w.setState(getDrawableState());
                }
                this.f20305w.setLayoutDirection(getLayoutDirection());
                this.f20305w.setVisible(getVisibility() == 0, false);
                this.f20305w.setCallback(this);
            }
            if (this.f20305w != null && getTopInset() > 0) {
                z3 = true;
            }
            setWillNotDraw(!z3);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i4) {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(int i4) {
        setStatusBarForeground(jm.a.l(i4, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        f.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f20305w;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20305w;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class BaseBehavior<T extends AppBarLayout> extends kc.c {
        public int j;

        /* renamed from: k, reason: collision with root package name */
        public int f20309k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f20310l;

        /* renamed from: m, reason: collision with root package name */
        public d f20311m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f20312n;

        public BaseBehavior() {
            this.f28131f = -1;
            this.f28132h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (((e) childAt.getLayoutParams()).f31147a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof o) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
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
                kc.b r0 = (kc.b) r0
                int r0 = r0.f28125a
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
                boolean r8 = r7.f20293k
                if (r8 == 0) goto L67
                android.view.View r8 = D(r6)
                boolean r3 = r7.f(r8)
            L67:
                boolean r8 = r7.e(r3)
                if (r10 != 0) goto La7
                if (r8 == 0) goto Lce
                a0.x0 r8 = r6.f877b
                java.lang.Object r8 = r8.f145b
                x.n0 r8 = (x.n0) r8
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.f879d
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
                p3.e r9 = (p3.e) r9
                p3.b r9 = r9.f31147a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.f28137f
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

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            int iAbs = Math.abs(y() - i4);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            if (iY == i4) {
                ValueAnimator valueAnimator = this.f20310l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f20310l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f20310l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f20310l = valueAnimator3;
                valueAnimator3.setInterpolator(jc.a.f27486e);
                this.f20310l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f20310l.setDuration(Math.min(iRound, 600));
            this.f20310l.setIntValues(iY, i4);
            this.f20310l.start();
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
                boolean r9 = r4.f20293k
                if (r9 == 0) goto L37
                boolean r9 = r4.f(r11)
                r4.e(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = m4.b.f28875b;
                    }
                    d dVar = new d(parcelable);
                    boolean z3 = iW == 0;
                    dVar.f20323d = z3;
                    dVar.f20322c = !z3 && (-iW) >= appBarLayout.getTotalScrollRange();
                    dVar.f20324e = i4;
                    dVar.g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.f20325f = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i4 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i4);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                kc.b bVar = (kc.b) childAt.getLayoutParams();
                if ((bVar.f28125a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) bVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) bVar).bottomMargin;
                }
                int i10 = -iY;
                if (top <= i10 && bottom >= i10) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i4);
                kc.b bVar2 = (kc.b) childAt2.getLayoutParams();
                int i11 = bVar2.f28125a;
                if ((i11 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i4 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i11 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i11 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i11 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) bVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) bVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, com.bumptech.glide.d.i(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // kc.e, p3.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i4);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f20311m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z3 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i10 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z3) {
                            C(coordinatorLayout, appBarLayout, i10);
                        } else {
                            A(coordinatorLayout, appBarLayout, i10);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z3) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f20322c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f20323d) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f20324e);
                int i11 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.f20311m.g ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i11 : Math.round(childAt.getHeight() * this.f20311m.f20325f) + i11);
            }
            appBarLayout.f20290f = 0;
            this.f20311m = null;
            int i12 = com.bumptech.glide.d.i(w(), -appBarLayout.getTotalScrollRange(), 0);
            k kVar = this.f28138a;
            if (kVar == null) {
                this.f28139b = i12;
            } else if (kVar.f1002c != i12) {
                kVar.f1002c = i12;
                kVar.d();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f20285a = w();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (v0.e(coordinatorLayout) != null) {
                return true;
            }
            v0.o(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // p3.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i4, i10, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // p3.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10, int[] iArr, int i11) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        @Override // p3.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i11 == 0 && v0.e(coordinatorLayout2) == null) {
                v0.o(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // p3.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f20311m = (d) parcelable;
            } else {
                this.f20311m = null;
            }
        }

        @Override // p3.b
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarF = F(absSavedState, (AppBarLayout) view);
            return dVarF == null ? absSavedState : dVarF;
        }

        @Override // p3.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z3 = (i4 & 2) != 0 && (appBarLayout.f20293k || appBarLayout.j || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z3 && (valueAnimator = this.f20310l) != null) {
                valueAnimator.cancel();
            }
            this.f20312n = null;
            this.f20309k = i10;
            return z3;
        }

        @Override // p3.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f20309k == 0 || i4 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f20293k) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f20312n = new WeakReference(view2);
        }

        @Override // kc.c
        public final int y() {
            return w() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
        @Override // kc.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f28131f = -1;
            this.f28132h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        kc.b bVar = new kc.b(-1, -2);
        bVar.f28125a = 1;
        return bVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
