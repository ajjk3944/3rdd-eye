package com.google.android.material.tabs;

import android.R;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ba.m;
import bq.f;
import ed.k;
import ed.l;
import h.j;
import ie.c;
import ie.e;
import ie.g;
import ie.h;
import io.sentry.android.core.e0;
import io.sentry.hints.i;
import ir.f0;
import java.util.ArrayList;
import java.util.Iterator;
import t3.d;
import x7.a;
import x7.b;

@b
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: v0, reason: collision with root package name */
    public static final int f5710v0 = k.Widget_Design_TabLayout;

    /* renamed from: w0, reason: collision with root package name */
    public static final d f5711w0 = new d(16);
    public final int B;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public ColorStateList H;
    public ColorStateList I;
    public ColorStateList J;
    public Drawable K;
    public int L;
    public final float M;
    public final float N;
    public final float O;
    public final int P;
    public int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public int V;
    public final int W;

    /* renamed from: a, reason: collision with root package name */
    public int f5712a;

    /* renamed from: a0, reason: collision with root package name */
    public int f5713a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5714b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5715c0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5716d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5717d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f5718e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f5719f0;

    /* renamed from: g, reason: collision with root package name */
    public h f5720g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5721g0;

    /* renamed from: h0, reason: collision with root package name */
    public i f5722h0;

    /* renamed from: i0, reason: collision with root package name */
    public final TimeInterpolator f5723i0;

    /* renamed from: j0, reason: collision with root package name */
    public c f5724j0;

    /* renamed from: k0, reason: collision with root package name */
    public final ArrayList f5725k0;

    /* renamed from: l0, reason: collision with root package name */
    public ie.k f5726l0;

    /* renamed from: m0, reason: collision with root package name */
    public ValueAnimator f5727m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewPager f5728n0;

    /* renamed from: o0, reason: collision with root package name */
    public a f5729o0;

    /* renamed from: p0, reason: collision with root package name */
    public e f5730p0;

    /* renamed from: q0, reason: collision with root package name */
    public ie.i f5731q0;

    /* renamed from: r, reason: collision with root package name */
    public final g f5732r;

    /* renamed from: r0, reason: collision with root package name */
    public ie.b f5733r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f5734s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f5735t0;

    /* renamed from: u0, reason: collision with root package name */
    public final t3.c f5736u0;

    /* renamed from: x, reason: collision with root package name */
    public final int f5737x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5738y;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10 = ed.b.tabStyle;
        int i11 = f5710v0;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.f5712a = -1;
        this.f5716d = new ArrayList();
        this.G = -1;
        this.L = 0;
        this.Q = Integer.MAX_VALUE;
        this.f5718e0 = -1;
        this.f5725k0 = new ArrayList();
        this.f5736u0 = new t3.c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        g gVar = new g(this, context2);
        this.f5732r = gVar;
        super.addView(gVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.TabLayout, i10, i11, l.TabLayout_tabTextAppearance);
        ColorStateList colorStateListY = m.y(getBackground());
        if (colorStateListY != null) {
            ee.i iVar = new ee.i();
            iVar.q(colorStateListY);
            iVar.m(context2);
            iVar.p(getElevation());
            setBackground(iVar);
        }
        setSelectedTabIndicator(xu.l.t(context2, typedArrayD, l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayD.getColor(l.TabLayout_tabIndicatorColor, 0));
        gVar.b(typedArrayD.getDimensionPixelSize(l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(l.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(l.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(l.TabLayout_tabPadding, 0);
        this.D = dimensionPixelSize;
        this.B = dimensionPixelSize;
        this.f5738y = dimensionPixelSize;
        this.f5737x = dimensionPixelSize;
        this.f5737x = typedArrayD.getDimensionPixelSize(l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f5738y = typedArrayD.getDimensionPixelSize(l.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.B = typedArrayD.getDimensionPixelSize(l.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.D = typedArrayD.getDimensionPixelSize(l.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (xu.d.d0(context2, ed.b.isMaterial3Theme, false)) {
            this.E = ed.b.textAppearanceTitleSmall;
        } else {
            this.E = ed.b.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(l.TabLayout_tabTextAppearance, k.TextAppearance_Design_Tab);
        this.F = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, j.TextAppearance);
        try {
            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.TextAppearance_android_textSize, 0);
            this.H = xu.l.q(context2, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(l.TabLayout_tabSelectedTextAppearance)) {
                this.G = typedArrayD.getResourceId(l.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i12 = this.G;
            int[] iArr = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr2 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i12 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i12, j.TextAppearance);
                try {
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.TextAppearance_android_textSize, (int) r4);
                    ColorStateList colorStateListQ = xu.l.q(context2, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColor);
                    if (colorStateListQ != null) {
                        this.H = new ColorStateList(new int[][]{iArr2, iArr}, new int[]{colorStateListQ.getColorForState(new int[]{R.attr.state_selected}, colorStateListQ.getDefaultColor()), this.H.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(l.TabLayout_tabTextColor)) {
                this.H = xu.l.q(context2, typedArrayD, l.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(l.TabLayout_tabSelectedTextColor)) {
                this.H = new ColorStateList(new int[][]{iArr2, iArr}, new int[]{typedArrayD.getColor(l.TabLayout_tabSelectedTextColor, 0), this.H.getDefaultColor()});
            }
            this.I = xu.l.q(context2, typedArrayD, l.TabLayout_tabIconTint);
            xd.l.d(typedArrayD.getInt(l.TabLayout_tabIconTintMode, -1), null);
            this.J = xu.l.q(context2, typedArrayD, l.TabLayout_tabRippleColor);
            this.W = typedArrayD.getInt(l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f5723i0 = f0.V(context2, ed.b.motionEasingEmphasizedInterpolator, fd.a.f8823b);
            this.R = typedArrayD.getDimensionPixelSize(l.TabLayout_tabMinWidth, -1);
            this.S = typedArrayD.getDimensionPixelSize(l.TabLayout_tabMaxWidth, -1);
            this.P = typedArrayD.getResourceId(l.TabLayout_tabBackground, 0);
            this.U = typedArrayD.getDimensionPixelSize(l.TabLayout_tabContentStart, 0);
            this.f5714b0 = typedArrayD.getInt(l.TabLayout_tabMode, 1);
            this.V = typedArrayD.getInt(l.TabLayout_tabGravity, 0);
            this.f5715c0 = typedArrayD.getBoolean(l.TabLayout_tabInlineLabel, false);
            this.f5721g0 = typedArrayD.getBoolean(l.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.O = resources.getDimensionPixelSize(ed.d.design_tab_text_size_2line);
            this.T = resources.getDimensionPixelSize(ed.d.design_tab_scrollable_min_width);
            b();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f5716d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.R;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f5714b0;
        if (i11 == 0 || i11 == 2) {
            return this.T;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f5732r.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        g gVar = this.f5732r;
        int childCount = gVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = gVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof ie.j) {
                        ((ie.j) childAt).f();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            g gVar = this.f5732r;
            int childCount = gVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (gVar.getChildAt(i11).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iC = c(i10, 0.0f);
            if (scrollX != iC) {
                d();
                this.f5727m0.setIntValues(scrollX, iC);
                this.f5727m0.start();
            }
            ValueAnimator valueAnimator = gVar.f11347a;
            if (valueAnimator != null && valueAnimator.isRunning() && gVar.f11348d.f5712a != i10) {
                gVar.f11347a.cancel();
            }
            gVar.d(i10, true, this.W);
            return;
        }
        h(i10, 0.0f, true, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b() {
        int i10 = this.f5714b0;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.U - this.f5737x) : 0;
        g gVar = this.f5732r;
        gVar.setPaddingRelative(iMax, 0, 0, 0);
        int i11 = this.f5714b0;
        if (i11 == 0) {
            int i12 = this.V;
            if (i12 == 0) {
                e0.p("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                gVar.setGravity(1);
            } else if (i12 == 2) {
            }
            gVar.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            if (this.V == 2) {
                e0.p("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            gVar.setGravity(1);
        }
        j(true);
    }

    public final int c(int i10, float f10) {
        g gVar;
        View childAt;
        int i11 = this.f5714b0;
        if ((i11 != 0 && i11 != 2) || (childAt = (gVar = this.f5732r).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < gVar.getChildCount() ? gVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void d() {
        if (this.f5727m0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5727m0 = valueAnimator;
            valueAnimator.setInterpolator(this.f5723i0);
            this.f5727m0.setDuration(this.W);
            this.f5727m0.addUpdateListener(new f(2, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [ie.j] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, ie.j] */
    public final void e() {
        t3.c cVar;
        CharSequence charSequence;
        d dVar;
        int currentItem;
        g gVar = this.f5732r;
        int childCount = gVar.getChildCount() - 1;
        while (true) {
            cVar = this.f5736u0;
            charSequence = null;
            if (childCount < 0) {
                break;
            }
            ie.j jVar = (ie.j) gVar.getChildAt(childCount);
            gVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                cVar.c(jVar);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f5716d;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dVar = f5711w0;
            if (!zHasNext) {
                break;
            }
            h hVar = (h) it.next();
            it.remove();
            hVar.f11352d = null;
            hVar.f11353e = null;
            hVar.f11349a = null;
            hVar.f11350b = -1;
            hVar.f11351c = null;
            dVar.c(hVar);
        }
        this.f5720g = null;
        a aVar = this.f5729o0;
        if (aVar != null) {
            int iC = aVar.c();
            int i10 = 0;
            while (i10 < iC) {
                h hVar2 = (h) dVar.a();
                if (hVar2 == null) {
                    hVar2 = new h();
                    hVar2.f11350b = -1;
                }
                hVar2.f11352d = this;
                ?? jVar2 = cVar != null ? (ie.j) cVar.a() : charSequence;
                if (jVar2 == 0) {
                    jVar2 = new ie.j(this, getContext());
                }
                jVar2.setTab(hVar2);
                jVar2.setFocusable(true);
                jVar2.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(charSequence)) {
                    jVar2.setContentDescription(hVar2.f11349a);
                } else {
                    jVar2.setContentDescription(charSequence);
                }
                hVar2.f11353e = jVar2;
                String strD = this.f5729o0.d(i10);
                if (TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(strD)) {
                    hVar2.f11353e.setContentDescription(strD);
                }
                hVar2.f11349a = strD;
                ie.j jVar3 = hVar2.f11353e;
                if (jVar3 != null) {
                    jVar3.d();
                }
                int size = arrayList.size();
                if (hVar2.f11352d != this) {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
                hVar2.f11350b = size;
                arrayList.add(size, hVar2);
                int size2 = arrayList.size();
                int i11 = -1;
                for (int i12 = size + 1; i12 < size2; i12++) {
                    if (((h) arrayList.get(i12)).f11350b == this.f5712a) {
                        i11 = i12;
                    }
                    ((h) arrayList.get(i12)).f11350b = i12;
                }
                this.f5712a = i11;
                ie.j jVar4 = hVar2.f11353e;
                jVar4.setSelected(false);
                jVar4.setActivated(false);
                int i13 = hVar2.f11350b;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.f5714b0 == 1 && this.V == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                gVar.addView(jVar4, i13, layoutParams);
                i10++;
                charSequence = null;
            }
            ViewPager viewPager = this.f5728n0;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            f((currentItem < 0 || currentItem >= getTabCount()) ? null : (h) arrayList.get(currentItem), true);
        }
    }

    public final void f(h hVar, boolean z10) {
        TabLayout tabLayout;
        h hVar2 = this.f5720g;
        ArrayList arrayList = this.f5725k0;
        if (hVar2 == hVar) {
            if (hVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                a(hVar.f11350b);
                return;
            }
            return;
        }
        int i10 = hVar != null ? hVar.f11350b : -1;
        if (z10) {
            if ((hVar2 == null || hVar2.f11350b == -1) && i10 != -1) {
                tabLayout = this;
                tabLayout.h(i10, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                a(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f5720g = hVar;
        if (hVar2 != null && hVar2.f11352d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).getClass();
            }
        }
        if (hVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((ie.k) ((c) arrayList.get(size3))).f11363a.setCurrentItem(hVar.f11350b);
            }
        }
    }

    public final void g(a aVar, boolean z10) {
        e eVar;
        a aVar2 = this.f5729o0;
        if (aVar2 != null && (eVar = this.f5730p0) != null) {
            aVar2.f25058a.unregisterObserver(eVar);
        }
        this.f5729o0 = aVar;
        if (z10 && aVar != null) {
            if (this.f5730p0 == null) {
                this.f5730p0 = new e(0, this);
            }
            aVar.f25058a.registerObserver(this.f5730p0);
        }
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        h hVar = this.f5720g;
        if (hVar != null) {
            return hVar.f11350b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f5716d.size();
    }

    public int getTabGravity() {
        return this.V;
    }

    public ColorStateList getTabIconTint() {
        return this.I;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f5719f0;
    }

    public int getTabIndicatorGravity() {
        return this.f5713a0;
    }

    public int getTabMaxWidth() {
        return this.Q;
    }

    public int getTabMode() {
        return this.f5714b0;
    }

    public ColorStateList getTabRippleColor() {
        return this.J;
    }

    public Drawable getTabSelectedIndicator() {
        return this.K;
    }

    public ColorStateList getTabTextColors() {
        return this.H;
    }

    public final void h(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            g gVar = this.f5732r;
            if (iRound >= gVar.getChildCount()) {
                return;
            }
            if (z11) {
                gVar.f11348d.f5712a = Math.round(f11);
                ValueAnimator valueAnimator = gVar.f11347a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    gVar.f11347a.cancel();
                }
                gVar.c(gVar.getChildAt(i10), gVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.f5727m0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5727m0.cancel();
            }
            int iC = c(i10, f10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iC >= scrollX) || (i10 > getSelectedTabPosition() && iC <= scrollX) || i10 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z13 = (i10 < getSelectedTabPosition() && iC <= scrollX) || (i10 > getSelectedTabPosition() && iC >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.f5735t0 == 1 || z12) {
                if (i10 < 0) {
                    iC = 0;
                }
                scrollTo(iC, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void i(ViewPager viewPager, boolean z10) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f5728n0;
        if (viewPager2 != null) {
            ie.i iVar = this.f5731q0;
            if (iVar != null && (arrayList2 = viewPager2.f2139p0) != null) {
                arrayList2.remove(iVar);
            }
            ie.b bVar = this.f5733r0;
            if (bVar != null && (arrayList = this.f5728n0.f2142r0) != null) {
                arrayList.remove(bVar);
            }
        }
        ie.k kVar = this.f5726l0;
        ArrayList arrayList3 = this.f5725k0;
        if (kVar != null) {
            arrayList3.remove(kVar);
            this.f5726l0 = null;
        }
        if (viewPager != null) {
            this.f5728n0 = viewPager;
            if (this.f5731q0 == null) {
                this.f5731q0 = new ie.i(this);
            }
            ie.i iVar2 = this.f5731q0;
            iVar2.f11356c = 0;
            iVar2.f11355b = 0;
            if (viewPager.f2139p0 == null) {
                viewPager.f2139p0 = new ArrayList();
            }
            viewPager.f2139p0.add(iVar2);
            ie.k kVar2 = new ie.k(viewPager);
            this.f5726l0 = kVar2;
            if (!arrayList3.contains(kVar2)) {
                arrayList3.add(kVar2);
            }
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                g(adapter, true);
            }
            if (this.f5733r0 == null) {
                this.f5733r0 = new ie.b(this);
            }
            ie.b bVar2 = this.f5733r0;
            bVar2.f11339a = true;
            if (viewPager.f2142r0 == null) {
                viewPager.f2142r0 = new ArrayList();
            }
            viewPager.f2142r0.add(bVar2);
            h(viewPager.getCurrentItem(), 0.0f, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.f5728n0 = null;
            g(null, false);
        }
        tabLayout.f5734s0 = z10;
    }

    public final void j(boolean z10) {
        int i10 = 0;
        while (true) {
            g gVar = this.f5732r;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f5714b0 == 1 && this.V == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        se.b.V(this);
        if (this.f5728n0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                i((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5734s0) {
            setupWithViewPager(null);
            this.f5734s0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ie.j jVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            g gVar = this.f5732r;
            if (i10 >= gVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if ((childAt instanceof ie.j) && (drawable = (jVar = (ie.j) childAt).E) != null) {
                drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                jVar.E.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a2.a.a(1, getTabCount(), 1).f28a);
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
            float r0 = xd.l.b(r0, r1)
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
            int r1 = r6.S
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = xd.l.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.Q = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f5714b0
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
    public void setElevation(float f10) {
        super.setElevation(f10);
        se.b.T(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f5715c0 == z10) {
            return;
        }
        this.f5715c0 = z10;
        int i10 = 0;
        while (true) {
            g gVar = this.f5732r;
            if (i10 >= gVar.getChildCount()) {
                b();
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof ie.j) {
                ie.j jVar = (ie.j) childAt;
                jVar.setOrientation(!jVar.G.f5715c0 ? 1 : 0);
                TextView textView = jVar.B;
                if (textView == null && jVar.D == null) {
                    jVar.g(jVar.f11358d, jVar.f11359g, true);
                } else {
                    jVar.g(textView, jVar.D, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(ie.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        d();
        this.f5727m0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.K = drawableMutate;
        int i10 = this.L;
        if (i10 != 0) {
            drawableMutate.setTint(i10);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f5718e0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.K.getIntrinsicHeight();
        }
        this.f5732r.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.L = i10;
        Drawable drawable = this.K;
        if (i10 != 0) {
            drawable.setTint(i10);
        } else {
            drawable.setTintList(null);
        }
        j(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f5713a0 != i10) {
            this.f5713a0 = i10;
            this.f5732r.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f5718e0 = i10;
        this.f5732r.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.V != i10) {
            this.V = i10;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            ArrayList arrayList = this.f5716d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ie.j jVar = ((h) arrayList.get(i10)).f11353e;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(h3.c.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f5719f0 = i10;
        if (i10 == 0) {
            this.f5722h0 = new i(9);
            return;
        }
        if (i10 == 1) {
            this.f5722h0 = new ie.a(0);
        } else {
            if (i10 == 2) {
                this.f5722h0 = new ie.a(1);
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f5717d0 = z10;
        int i10 = g.f11346g;
        g gVar = this.f5732r;
        gVar.a(gVar.f11348d.getSelectedTabPosition());
        gVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.f5714b0) {
            this.f5714b0 = i10;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.J == colorStateList) {
            return;
        }
        this.J = colorStateList;
        int i10 = 0;
        while (true) {
            g gVar = this.f5732r;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof ie.j) {
                Context context = getContext();
                int i11 = ie.j.H;
                ((ie.j) childAt).e(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(h3.c.c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            ArrayList arrayList = this.f5716d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ie.j jVar = ((h) arrayList.get(i10)).f11353e;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        g(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f5721g0 == z10) {
            return;
        }
        this.f5721g0 = z10;
        int i10 = 0;
        while (true) {
            g gVar = this.f5732r;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof ie.j) {
                Context context = getContext();
                int i11 = ie.j.H;
                ((ie.j) childAt).e(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        i(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f5724j0;
        ArrayList arrayList = this.f5725k0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.f5724j0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(ic.a.r(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
