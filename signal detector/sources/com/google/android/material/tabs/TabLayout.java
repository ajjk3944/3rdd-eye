package com.google.android.material.tabs;

import G3.C0152f;
import G3.j;
import L3.b;
import L3.c;
import L3.f;
import L3.g;
import L3.i;
import L3.l;
import O3.a;
import Q.d;
import a4.p;
import a4.t;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.apm.insight.R;
import d3.AbstractC2266a;
import d5.y;
import e3.AbstractC2303a;
import g.AbstractC2327a;
import java.util.ArrayList;
import java.util.Iterator;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: g0, reason: collision with root package name */
    public static final d f18450g0 = new d(16);

    /* renamed from: C, reason: collision with root package name */
    public Drawable f18451C;

    /* renamed from: D, reason: collision with root package name */
    public int f18452D;

    /* renamed from: E, reason: collision with root package name */
    public final float f18453E;

    /* renamed from: F, reason: collision with root package name */
    public final float f18454F;

    /* renamed from: G, reason: collision with root package name */
    public final float f18455G;

    /* renamed from: H, reason: collision with root package name */
    public final int f18456H;

    /* renamed from: I, reason: collision with root package name */
    public int f18457I;

    /* renamed from: J, reason: collision with root package name */
    public final int f18458J;

    /* renamed from: K, reason: collision with root package name */
    public final int f18459K;

    /* renamed from: L, reason: collision with root package name */
    public final int f18460L;
    public final int M;

    /* renamed from: N, reason: collision with root package name */
    public int f18461N;

    /* renamed from: O, reason: collision with root package name */
    public final int f18462O;

    /* renamed from: P, reason: collision with root package name */
    public int f18463P;

    /* renamed from: Q, reason: collision with root package name */
    public int f18464Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f18465R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f18466S;

    /* renamed from: T, reason: collision with root package name */
    public int f18467T;

    /* renamed from: U, reason: collision with root package name */
    public int f18468U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f18469V;

    /* renamed from: W, reason: collision with root package name */
    public C0152f f18470W;

    /* renamed from: a, reason: collision with root package name */
    public int f18471a;

    /* renamed from: a0, reason: collision with root package name */
    public final TimeInterpolator f18472a0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18473b;
    public c b0;

    /* renamed from: c, reason: collision with root package name */
    public g f18474c;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f18475c0;

    /* renamed from: d, reason: collision with root package name */
    public final f f18476d;

    /* renamed from: d0, reason: collision with root package name */
    public ValueAnimator f18477d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f18478e;

    /* renamed from: e0, reason: collision with root package name */
    public int f18479e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f18480f;

    /* renamed from: f0, reason: collision with root package name */
    public final Q.c f18481f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f18482g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18483h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18484j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18485k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f18486l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f18487m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f18488n;

    public TabLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f18471a = -1;
        this.f18473b = new ArrayList();
        this.f18485k = -1;
        this.f18452D = 0;
        this.f18457I = Integer.MAX_VALUE;
        this.f18467T = -1;
        this.f18475c0 = new ArrayList();
        this.f18481f0 = new Q.c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.f18476d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19742U, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListN = R2.a.n(getBackground());
        if (colorStateListN != null) {
            j jVar = new j();
            jVar.q(colorStateListN);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
        setSelectedTabIndicator(com.bumptech.glide.c.r(context2, typedArrayI, 5));
        setSelectedTabIndicatorColor(typedArrayI.getColor(8, 0));
        fVar.b(typedArrayI.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(9, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(16, 0);
        this.f18483h = dimensionPixelSize;
        this.f18482g = dimensionPixelSize;
        this.f18480f = dimensionPixelSize;
        this.f18478e = dimensionPixelSize;
        this.f18478e = typedArrayI.getDimensionPixelSize(19, dimensionPixelSize);
        this.f18480f = typedArrayI.getDimensionPixelSize(20, dimensionPixelSize);
        this.f18482g = typedArrayI.getDimensionPixelSize(18, dimensionPixelSize);
        this.f18483h = typedArrayI.getDimensionPixelSize(17, dimensionPixelSize);
        if (y.o(context2, R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayI.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f18484j = resourceId;
        int[] iArr = AbstractC2327a.f20137y;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f18453E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f18486l = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayI.hasValue(22)) {
                this.f18485k = typedArrayI.getResourceId(22, resourceId);
            }
            int i = this.f18485k;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i, iArr);
                try {
                    this.f18454F = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList colorStateListN2 = com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListN2 != null) {
                        this.f18486l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListN2.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListN2.getDefaultColor()), this.f18486l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (typedArrayI.hasValue(25)) {
                this.f18486l = com.bumptech.glide.c.n(context2, typedArrayI, 25);
            }
            if (typedArrayI.hasValue(23)) {
                this.f18486l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayI.getColor(23, 0), this.f18486l.getDefaultColor()});
            }
            this.f18487m = com.bumptech.glide.c.n(context2, typedArrayI, 3);
            AbstractC2993B.k(typedArrayI.getInt(4, -1), null);
            this.f18488n = com.bumptech.glide.c.n(context2, typedArrayI, 21);
            this.f18462O = typedArrayI.getInt(6, 300);
            this.f18472a0 = com.bumptech.glide.d.P(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19928b);
            this.f18458J = typedArrayI.getDimensionPixelSize(14, -1);
            this.f18459K = typedArrayI.getDimensionPixelSize(13, -1);
            this.f18456H = typedArrayI.getResourceId(0, 0);
            this.M = typedArrayI.getDimensionPixelSize(1, 0);
            this.f18464Q = typedArrayI.getInt(15, 1);
            this.f18461N = typedArrayI.getInt(2, 0);
            this.f18465R = typedArrayI.getBoolean(12, false);
            this.f18469V = typedArrayI.getBoolean(26, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f18455G = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f18460L = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            b();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f18473b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f18458J;
        if (i != -1) {
            return i;
        }
        int i3 = this.f18464Q;
        if (i3 == 0 || i3 == 2) {
            return this.f18460L;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f18476d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        f fVar = this.f18476d;
        int childCount = fVar.getChildCount();
        if (i < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = fVar.getChildAt(i3);
                if ((i3 != i || childAt.isSelected()) && (i3 == i || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i);
                    childAt.setActivated(i3 == i);
                } else {
                    childAt.setSelected(i3 == i);
                    childAt.setActivated(i3 == i);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                }
                i3++;
            }
        }
    }

    public final void a(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.f18476d;
            int childCount = fVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fVar.getChildAt(i3).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iC = c(i, 0.0f);
            if (scrollX != iC) {
                d();
                this.f18477d0.setIntValues(scrollX, iC);
                this.f18477d0.start();
            }
            ValueAnimator valueAnimator = fVar.f2578a;
            if (valueAnimator != null && valueAnimator.isRunning() && fVar.f2579b.f18471a != i) {
                fVar.f2578a.cancel();
            }
            fVar.d(i, this.f18462O, true);
            return;
        }
        h(i, 0.0f, true, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b() {
        int i = this.f18464Q;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.M - this.f18478e) : 0;
        f fVar = this.f18476d;
        fVar.setPaddingRelative(iMax, 0, 0, 0);
        int i3 = this.f18464Q;
        if (i3 == 0) {
            int i6 = this.f18461N;
            if (i6 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i6 == 1) {
                fVar.setGravity(1);
            } else if (i6 == 2) {
            }
            fVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f18461N == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fVar.setGravity(1);
        }
        i(true);
    }

    public final int c(int i, float f2) {
        f fVar;
        View childAt;
        int i3 = this.f18464Q;
        if ((i3 != 0 && i3 != 2) || (childAt = (fVar = this.f18476d).getChildAt(i)) == null) {
            return 0;
        }
        int i6 = i + 1;
        View childAt2 = i6 < fVar.getChildCount() ? fVar.getChildAt(i6) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i7 = (int) ((width + width2) * 0.5f * f2);
        return getLayoutDirection() == 0 ? left + i7 : left - i7;
    }

    public final void d() {
        if (this.f18477d0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18477d0 = valueAnimator;
            valueAnimator.setInterpolator(this.f18472a0);
            this.f18477d0.setDuration(this.f18462O);
            this.f18477d0.addUpdateListener(new b(0, this));
        }
    }

    public final g e() {
        g gVar = (g) f18450g0.h();
        if (gVar == null) {
            gVar = new g();
            gVar.f2581b = -1;
        }
        gVar.f2583d = this;
        Q.c cVar = this.f18481f0;
        i iVar = cVar != null ? (i) cVar.h() : null;
        if (iVar == null) {
            iVar = new i(this, getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            iVar.setContentDescription(gVar.f2580a);
        } else {
            iVar.setContentDescription(null);
        }
        gVar.f2584e = iVar;
        return gVar;
    }

    public final void f() {
        f fVar = this.f18476d;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f18481f0.d(iVar);
            }
            requestLayout();
        }
        Iterator it = this.f18473b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.f2583d = null;
            gVar.f2584e = null;
            gVar.f2580a = null;
            gVar.f2581b = -1;
            gVar.f2582c = null;
            f18450g0.d(gVar);
        }
        this.f18474c = null;
    }

    public final void g(g gVar, boolean z6) {
        TabLayout tabLayout;
        g gVar2 = this.f18474c;
        ArrayList arrayList = this.f18475c0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                a(gVar.f2581b);
                return;
            }
            return;
        }
        int i = gVar != null ? gVar.f2581b : -1;
        if (z6) {
            if ((gVar2 == null || gVar2.f2581b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.h(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                a(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f18474c = gVar;
        if (gVar2 != null && gVar2.f2583d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ViewPager2 viewPager2 = ((l) ((c) arrayList.get(size3))).f2603a;
                int i3 = gVar.f2581b;
                Object obj = viewPager2.f5657n.f3677b;
                viewPager2.b(i3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f18474c;
        if (gVar != null) {
            return gVar.f2581b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f18473b.size();
    }

    public int getTabGravity() {
        return this.f18461N;
    }

    public ColorStateList getTabIconTint() {
        return this.f18487m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f18468U;
    }

    public int getTabIndicatorGravity() {
        return this.f18463P;
    }

    public int getTabMaxWidth() {
        return this.f18457I;
    }

    public int getTabMode() {
        return this.f18464Q;
    }

    public ColorStateList getTabRippleColor() {
        return this.f18488n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f18451C;
    }

    public ColorStateList getTabTextColors() {
        return this.f18486l;
    }

    public final void h(int i, float f2, boolean z6, boolean z7, boolean z8) {
        float f5 = i + f2;
        int iRound = Math.round(f5);
        if (iRound >= 0) {
            f fVar = this.f18476d;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z7) {
                fVar.f2579b.f18471a = Math.round(f5);
                ValueAnimator valueAnimator = fVar.f2578a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f2578a.cancel();
                }
                fVar.c(fVar.getChildAt(i), fVar.getChildAt(i + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.f18477d0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f18477d0.cancel();
            }
            int iC = c(i, f2);
            int scrollX = getScrollX();
            boolean z9 = (i < getSelectedTabPosition() && iC >= scrollX) || (i > getSelectedTabPosition() && iC <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z9 = (i < getSelectedTabPosition() && iC <= scrollX) || (i > getSelectedTabPosition() && iC >= scrollX) || i == getSelectedTabPosition();
            }
            if (z9 || this.f18479e0 == 1 || z8) {
                if (i < 0) {
                    iC = 0;
                }
                scrollTo(iC, 0);
            }
            if (z6) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void i(boolean z6) {
        int i = 0;
        while (true) {
            f fVar = this.f18476d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f18464Q == 1 && this.f18461N == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z6) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.s(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            f fVar = this.f18476d;
            if (i >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).i) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) U0.j.q(1, getTabCount(), 1, false).f3677b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = x3.AbstractC2993B.e(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f18459K
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = x3.AbstractC2993B.e(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f18457I = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f18464Q
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        p.q(this, f2);
    }

    public void setInlineLabel(boolean z6) {
        if (this.f18465R == z6) {
            return;
        }
        this.f18465R = z6;
        int i = 0;
        while (true) {
            f fVar = this.f18476d;
            if (i >= fVar.getChildCount()) {
                b();
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                iVar.setOrientation(!iVar.f2597k.f18465R ? 1 : 0);
                TextView textView = iVar.f2594g;
                if (textView == null && iVar.f2595h == null) {
                    iVar.g(iVar.f2589b, iVar.f2590c, true);
                } else {
                    iVar.g(textView, iVar.f2595h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(L3.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        d();
        this.f18477d0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f18451C = drawableMutate;
        int i = this.f18452D;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f18467T;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f18451C.getIntrinsicHeight();
        }
        this.f18476d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f18452D = i;
        Drawable drawable = this.f18451C;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        i(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f18463P != i) {
            this.f18463P = i;
            this.f18476d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f18467T = i;
        this.f18476d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.f18461N != i) {
            this.f18461N = i;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f18487m != colorStateList) {
            this.f18487m = colorStateList;
            ArrayList arrayList = this.f18473b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i iVar = ((g) arrayList.get(i)).f2584e;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(G.c.b(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f18468U = i;
        if (i == 0) {
            this.f18470W = new C0152f(22);
            return;
        }
        if (i == 1) {
            this.f18470W = new L3.a(0);
        } else {
            if (i == 2) {
                this.f18470W = new L3.a(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z6) {
        this.f18466S = z6;
        int i = f.f2577c;
        f fVar = this.f18476d;
        fVar.a(fVar.f2579b.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f18464Q) {
            this.f18464Q = i;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f18488n == colorStateList) {
            return;
        }
        this.f18488n = colorStateList;
        int i = 0;
        while (true) {
            f fVar = this.f18476d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                Context context = getContext();
                int i3 = i.f2587l;
                ((i) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(G.c.b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f18486l != colorStateList) {
            this.f18486l = colorStateList;
            ArrayList arrayList = this.f18473b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i iVar = ((g) arrayList.get(i)).f2584e;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(P0.a aVar) {
        f();
    }

    public void setUnboundedRipple(boolean z6) {
        if (this.f18469V == z6) {
            return;
        }
        this.f18469V = z6;
        int i = 0;
        while (true) {
            f fVar = this.f18476d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                Context context = getContext();
                int i3 = i.f2587l;
                ((i) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(P0.b bVar) {
        f();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.b0;
        ArrayList arrayList = this.f18475c0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.b0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(t.i(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
