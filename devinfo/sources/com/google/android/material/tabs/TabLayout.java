package com.google.android.material.tabs;

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
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.liuzh.deviceinfo.R;
import d4.d;
import d4.e;
import ed.j;
import j6.i;
import java.util.ArrayList;
import java.util.Iterator;
import jd.c;
import jd.g;
import jd.h;
import jd.k;
import jd.l;
import n6.a;
import n6.b;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@b
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final e W = new e(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public i I;
    public final TimeInterpolator J;
    public c K;
    public final ArrayList L;
    public l M;
    public ValueAnimator N;
    public ViewPager O;
    public a P;
    public jd.e Q;
    public jd.i R;
    public jd.b S;
    public boolean T;
    public int U;
    public final d V;

    /* renamed from: a, reason: collision with root package name */
    public int f20570a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20571b;

    /* renamed from: c, reason: collision with root package name */
    public h f20572c;

    /* renamed from: d, reason: collision with root package name */
    public final g f20573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20575f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20576h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20577i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20578k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f20579l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f20580m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f20581n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f20582o;

    /* renamed from: p, reason: collision with root package name */
    public int f20583p;

    /* renamed from: q, reason: collision with root package name */
    public final float f20584q;

    /* renamed from: r, reason: collision with root package name */
    public final float f20585r;

    /* renamed from: s, reason: collision with root package name */
    public final float f20586s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20587t;

    /* renamed from: u, reason: collision with root package name */
    public int f20588u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20589v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20590w;

    /* renamed from: x, reason: collision with root package name */
    public final int f20591x;

    /* renamed from: y, reason: collision with root package name */
    public final int f20592y;

    /* renamed from: z, reason: collision with root package name */
    public int f20593z;

    public TabLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(md.a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f20570a = -1;
        this.f20571b = new ArrayList();
        this.f20578k = -1;
        this.f20583p = 0;
        this.f20588u = Integer.MAX_VALUE;
        this.F = -1;
        this.L = new ArrayList();
        this.V = new d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        g gVar = new g(this, context2);
        this.f20573d = gVar;
        super.addView(gVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.J, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListA = a4.l.a(getBackground());
        if (colorStateListA != null) {
            j jVar = new j();
            jVar.o(colorStateListA);
            jVar.l(context2);
            jVar.n(getElevation());
            setBackground(jVar);
        }
        setSelectedTabIndicator(jm.a.m(context2, typedArrayG, 5));
        setSelectedTabIndicatorColor(typedArrayG.getColor(8, 0));
        gVar.b(typedArrayG.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayG.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayG.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayG.getBoolean(9, true));
        int dimensionPixelSize = typedArrayG.getDimensionPixelSize(16, 0);
        this.f20576h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f20575f = dimensionPixelSize;
        this.f20574e = dimensionPixelSize;
        this.f20574e = typedArrayG.getDimensionPixelSize(19, dimensionPixelSize);
        this.f20575f = typedArrayG.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = typedArrayG.getDimensionPixelSize(18, dimensionPixelSize);
        this.f20576h = typedArrayG.getDimensionPixelSize(17, dimensionPixelSize);
        if (ii.a.z(context2, R.attr.isMaterial3Theme, false)) {
            this.f20577i = R.attr.textAppearanceTitleSmall;
        } else {
            this.f20577i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayG.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = h.a.f24797x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f20584q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f20579l = jm.a.j(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayG.hasValue(22)) {
                this.f20578k = typedArrayG.getResourceId(22, resourceId);
            }
            int i4 = this.f20578k;
            if (i4 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i4, iArr);
                try {
                    this.f20585r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList colorStateListJ = jm.a.j(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListJ != null) {
                        this.f20579l = d(this.f20579l.getDefaultColor(), colorStateListJ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListJ.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayG.hasValue(25)) {
                this.f20579l = jm.a.j(context2, typedArrayG, 25);
            }
            if (typedArrayG.hasValue(23)) {
                this.f20579l = d(this.f20579l.getDefaultColor(), typedArrayG.getColor(23, 0));
            }
            this.f20580m = jm.a.j(context2, typedArrayG, 3);
            m.h(typedArrayG.getInt(4, -1), null);
            this.f20581n = jm.a.j(context2, typedArrayG, 21);
            this.A = typedArrayG.getInt(6, 300);
            this.J = nh.a.w(context2, R.attr.motionEasingEmphasizedInterpolator, jc.a.f27483b);
            this.f20589v = typedArrayG.getDimensionPixelSize(14, -1);
            this.f20590w = typedArrayG.getDimensionPixelSize(13, -1);
            this.f20587t = typedArrayG.getResourceId(0, 0);
            this.f20592y = typedArrayG.getDimensionPixelSize(1, 0);
            this.C = typedArrayG.getInt(15, 1);
            this.f20593z = typedArrayG.getInt(2, 0);
            this.D = typedArrayG.getBoolean(12, false);
            this.H = typedArrayG.getBoolean(26, false);
            typedArrayG.recycle();
            Resources resources = getResources();
            this.f20586s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f20591x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            b();
        } finally {
        }
    }

    public static ColorStateList d(int i4, int i10) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i10, i4});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f20571b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i4 = this.f20589v;
        if (i4 != -1) {
            return i4;
        }
        int i10 = this.C;
        if (i10 == 0 || i10 == 2) {
            return this.f20591x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f20573d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i4) {
        g gVar = this.f20573d;
        int childCount = gVar.getChildCount();
        if (i4 < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = gVar.getChildAt(i10);
                if ((i10 != i4 || childAt.isSelected()) && (i10 == i4 || !childAt.isSelected())) {
                    childAt.setSelected(i10 == i4);
                    childAt.setActivated(i10 == i4);
                } else {
                    childAt.setSelected(i10 == i4);
                    childAt.setActivated(i10 == i4);
                    if (childAt instanceof k) {
                        ((k) childAt).f();
                    }
                }
                i10++;
            }
        }
    }

    public final void a(int i4) {
        if (i4 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            g gVar = this.f20573d;
            int childCount = gVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (gVar.getChildAt(i10).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iC = c(i4, 0.0f);
            if (scrollX != iC) {
                e();
                this.N.setIntValues(scrollX, iC);
                this.N.start();
            }
            ValueAnimator valueAnimator = gVar.f27505a;
            if (valueAnimator != null && valueAnimator.isRunning() && gVar.f27506b.f20570a != i4) {
                gVar.f27505a.cancel();
            }
            gVar.d(i4, this.A, true);
            return;
        }
        j(i4, 0.0f, true, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b() {
        int i4 = this.C;
        int iMax = (i4 == 0 || i4 == 2) ? Math.max(0, this.f20592y - this.f20574e) : 0;
        g gVar = this.f20573d;
        gVar.setPaddingRelative(iMax, 0, 0, 0);
        int i10 = this.C;
        if (i10 == 0) {
            int i11 = this.f20593z;
            if (i11 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i11 == 1) {
                gVar.setGravity(1);
            } else if (i11 == 2) {
            }
            gVar.setGravity(8388611);
        } else if (i10 == 1 || i10 == 2) {
            if (this.f20593z == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            gVar.setGravity(1);
        }
        l(true);
    }

    public final int c(int i4, float f10) {
        g gVar;
        View childAt;
        int i10 = this.C;
        if ((i10 != 0 && i10 != 2) || (childAt = (gVar = this.f20573d).getChildAt(i4)) == null) {
            return 0;
        }
        int i11 = i4 + 1;
        View childAt2 = i11 < gVar.getChildCount() ? gVar.getChildAt(i11) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i12 : left - i12;
    }

    public final void e() {
        if (this.N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.N = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.N.setDuration(this.A);
            this.N.addUpdateListener(new com.facebook.shimmer.d(1, this));
        }
    }

    public final h f(int i4) {
        if (i4 < 0 || i4 >= getTabCount()) {
            return null;
        }
        return (h) this.f20571b.get(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [jd.k] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, jd.k] */
    public final void g() {
        d dVar;
        CharSequence charSequence;
        e eVar;
        int currentItem;
        g gVar = this.f20573d;
        int childCount = gVar.getChildCount() - 1;
        while (true) {
            dVar = this.V;
            charSequence = null;
            if (childCount < 0) {
                break;
            }
            k kVar = (k) gVar.getChildAt(childCount);
            gVar.removeViewAt(childCount);
            if (kVar != null) {
                kVar.setTab(null);
                kVar.setSelected(false);
                dVar.i(kVar);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f20571b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = W;
            if (!zHasNext) {
                break;
            }
            h hVar = (h) it.next();
            it.remove();
            hVar.f27510d = null;
            hVar.f27511e = null;
            hVar.f27507a = null;
            hVar.f27508b = -1;
            hVar.f27509c = null;
            eVar.i(hVar);
        }
        this.f20572c = null;
        a aVar = this.P;
        if (aVar != null) {
            int iC = aVar.c();
            int i4 = 0;
            while (i4 < iC) {
                h hVar2 = (h) eVar.k();
                if (hVar2 == null) {
                    hVar2 = new h();
                    hVar2.f27508b = -1;
                }
                hVar2.f27510d = this;
                ?? kVar2 = dVar != null ? (k) dVar.k() : charSequence;
                if (kVar2 == 0) {
                    kVar2 = new k(this, getContext());
                }
                kVar2.setTab(hVar2);
                kVar2.setFocusable(true);
                kVar2.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(charSequence)) {
                    kVar2.setContentDescription(hVar2.f27507a);
                } else {
                    kVar2.setContentDescription(charSequence);
                }
                hVar2.f27511e = kVar2;
                String strE = this.P.e(i4);
                if (TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(strE)) {
                    hVar2.f27511e.setContentDescription(strE);
                }
                hVar2.f27507a = strE;
                k kVar3 = hVar2.f27511e;
                if (kVar3 != null) {
                    kVar3.d();
                }
                int size = arrayList.size();
                if (hVar2.f27510d != this) {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
                hVar2.f27508b = size;
                arrayList.add(size, hVar2);
                int size2 = arrayList.size();
                int i10 = -1;
                for (int i11 = size + 1; i11 < size2; i11++) {
                    if (((h) arrayList.get(i11)).f27508b == this.f20570a) {
                        i10 = i11;
                    }
                    ((h) arrayList.get(i11)).f27508b = i11;
                }
                this.f20570a = i10;
                k kVar4 = hVar2.f27511e;
                kVar4.setSelected(false);
                kVar4.setActivated(false);
                int i12 = hVar2.f27508b;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.C == 1 && this.f20593z == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                gVar.addView(kVar4, i12, layoutParams);
                i4++;
                charSequence = null;
            }
            ViewPager viewPager = this.O;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            h(f(currentItem), true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        h hVar = this.f20572c;
        if (hVar != null) {
            return hVar.f27508b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f20571b.size();
    }

    public int getTabGravity() {
        return this.f20593z;
    }

    public ColorStateList getTabIconTint() {
        return this.f20580m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.f20588u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f20581n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f20582o;
    }

    public ColorStateList getTabTextColors() {
        return this.f20579l;
    }

    public final void h(h hVar, boolean z3) {
        TabLayout tabLayout;
        h hVar2 = this.f20572c;
        ArrayList arrayList = this.L;
        if (hVar2 == hVar) {
            if (hVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                a(hVar.f27508b);
                return;
            }
            return;
        }
        int i4 = hVar != null ? hVar.f27508b : -1;
        if (z3) {
            if ((hVar2 == null || hVar2.f27508b == -1) && i4 != -1) {
                tabLayout = this;
                tabLayout.j(i4, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                a(i4);
            }
            if (i4 != -1) {
                setSelectedTabView(i4);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f20572c = hVar;
        if (hVar2 != null && hVar2.f27510d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).getClass();
            }
        }
        if (hVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((l) ((c) arrayList.get(size3))).f27527a.setCurrentItem(hVar.f27508b);
            }
        }
    }

    public final void i(a aVar, boolean z3) {
        jd.e eVar;
        a aVar2 = this.P;
        if (aVar2 != null && (eVar = this.Q) != null) {
            aVar2.f29766a.unregisterObserver(eVar);
        }
        this.P = aVar;
        if (z3 && aVar != null) {
            if (this.Q == null) {
                this.Q = new jd.e(0, this);
            }
            aVar.f29766a.registerObserver(this.Q);
        }
        g();
    }

    public final void j(int i4, float f10, boolean z3, boolean z10, boolean z11) {
        float f11 = i4 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            g gVar = this.f20573d;
            if (iRound >= gVar.getChildCount()) {
                return;
            }
            if (z10) {
                gVar.f27506b.f20570a = Math.round(f11);
                ValueAnimator valueAnimator = gVar.f27505a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    gVar.f27505a.cancel();
                }
                gVar.c(gVar.getChildAt(i4), gVar.getChildAt(i4 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            int iC = c(i4, f10);
            int scrollX = getScrollX();
            boolean z12 = (i4 < getSelectedTabPosition() && iC >= scrollX) || (i4 > getSelectedTabPosition() && iC <= scrollX) || i4 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z12 = (i4 < getSelectedTabPosition() && iC <= scrollX) || (i4 > getSelectedTabPosition() && iC >= scrollX) || i4 == getSelectedTabPosition();
            }
            if (z12 || this.U == 1 || z11) {
                if (i4 < 0) {
                    iC = 0;
                }
                scrollTo(iC, 0);
            }
            if (z3) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void k(ViewPager viewPager, boolean z3) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.O;
        if (viewPager2 != null) {
            jd.i iVar = this.R;
            if (iVar != null && (arrayList2 = viewPager2.Q) != null) {
                arrayList2.remove(iVar);
            }
            jd.b bVar = this.S;
            if (bVar != null && (arrayList = this.O.S) != null) {
                arrayList.remove(bVar);
            }
        }
        l lVar = this.M;
        ArrayList arrayList3 = this.L;
        if (lVar != null) {
            arrayList3.remove(lVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.O = viewPager;
            if (this.R == null) {
                this.R = new jd.i(this);
            }
            jd.i iVar2 = this.R;
            iVar2.f27514c = 0;
            iVar2.f27513b = 0;
            if (viewPager.Q == null) {
                viewPager.Q = new ArrayList();
            }
            viewPager.Q.add(iVar2);
            l lVar2 = new l(viewPager);
            this.M = lVar2;
            if (!arrayList3.contains(lVar2)) {
                arrayList3.add(lVar2);
            }
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                i(adapter, true);
            }
            if (this.S == null) {
                this.S = new jd.b(this);
            }
            jd.b bVar2 = this.S;
            bVar2.f27497a = true;
            if (viewPager.S == null) {
                viewPager.S = new ArrayList();
            }
            viewPager.S.add(bVar2);
            j(viewPager.getCurrentItem(), 0.0f, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.O = null;
            i(null, false);
        }
        tabLayout.T = z3;
    }

    public final void l(boolean z3) {
        int i4 = 0;
        while (true) {
            g gVar = this.f20573d;
            if (i4 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i4);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.C == 1 && this.f20593z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z3) {
                childAt.requestLayout();
            }
            i4++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            ii.a.E(this, (j) background);
        }
        if (this.O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                k((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k kVar;
        Drawable drawable;
        int i4 = 0;
        while (true) {
            g gVar = this.f20573d;
            if (i4 >= gVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = gVar.getChildAt(i4);
            if ((childAt instanceof k) && (drawable = (kVar = (k) childAt).f27525i) != null) {
                drawable.setBounds(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
                kVar.f27525i.draw(canvas);
            }
            i4++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o7.d.n(1, getTabCount(), 1, false).f30421b);
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
            float r0 = zc.m.d(r1, r0)
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
            int r1 = r6.f20590w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = zc.m.d(r2, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f20588u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.C
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
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).n(f10);
        }
    }

    public void setInlineLabel(boolean z3) {
        if (this.D == z3) {
            return;
        }
        this.D = z3;
        int i4 = 0;
        while (true) {
            g gVar = this.f20573d;
            if (i4 >= gVar.getChildCount()) {
                b();
                return;
            }
            View childAt = gVar.getChildAt(i4);
            if (childAt instanceof k) {
                k kVar = (k) childAt;
                kVar.setOrientation(!kVar.f27526k.D ? 1 : 0);
                TextView textView = kVar.g;
                if (textView == null && kVar.f27524h == null) {
                    kVar.g(kVar.f27519b, kVar.f27520c, true);
                } else {
                    kVar.g(textView, kVar.f27524h, false);
                }
            }
            i4++;
        }
    }

    public void setInlineLabelResource(int i4) {
        setInlineLabel(getResources().getBoolean(i4));
    }

    @Deprecated
    public void setOnTabSelectedListener(jd.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f20582o = drawableMutate;
        int i4 = this.f20583p;
        if (i4 != 0) {
            drawableMutate.setTint(i4);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.F;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f20582o.getIntrinsicHeight();
        }
        this.f20573d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i4) {
        this.f20583p = i4;
        Drawable drawable = this.f20582o;
        if (i4 != 0) {
            drawable.setTint(i4);
        } else {
            drawable.setTintList(null);
        }
        l(false);
    }

    public void setSelectedTabIndicatorGravity(int i4) {
        if (this.B != i4) {
            this.B = i4;
            this.f20573d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i4) {
        this.F = i4;
        this.f20573d.b(i4);
    }

    public void setTabGravity(int i4) {
        if (this.f20593z != i4) {
            this.f20593z = i4;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f20580m != colorStateList) {
            this.f20580m = colorStateList;
            ArrayList arrayList = this.f20571b;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k kVar = ((h) arrayList.get(i4)).f27511e;
                if (kVar != null) {
                    kVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i4) {
        setTabIconTint(wd.b.r(i4, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i4) {
        this.G = i4;
        if (i4 == 0) {
            this.I = new i(1);
            return;
        }
        if (i4 == 1) {
            this.I = new jd.a(0);
        } else {
            if (i4 == 2) {
                this.I = new jd.a(1);
                return;
            }
            throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z3) {
        this.E = z3;
        int i4 = g.f27504c;
        g gVar = this.f20573d;
        gVar.a(gVar.f27506b.getSelectedTabPosition());
        gVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i4) {
        if (i4 != this.C) {
            this.C = i4;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f20581n == colorStateList) {
            return;
        }
        this.f20581n = colorStateList;
        int i4 = 0;
        while (true) {
            g gVar = this.f20573d;
            if (i4 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i4);
            if (childAt instanceof k) {
                Context context = getContext();
                int i10 = k.f27517l;
                ((k) childAt).e(context);
            }
            i4++;
        }
    }

    public void setTabRippleColorResource(int i4) {
        setTabRippleColor(wd.b.r(i4, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f20579l != colorStateList) {
            this.f20579l = colorStateList;
            ArrayList arrayList = this.f20571b;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k kVar = ((h) arrayList.get(i4)).f27511e;
                if (kVar != null) {
                    kVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        i(aVar, false);
    }

    public void setUnboundedRipple(boolean z3) {
        if (this.H == z3) {
            return;
        }
        this.H = z3;
        int i4 = 0;
        while (true) {
            g gVar = this.f20573d;
            if (i4 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i4);
            if (childAt instanceof k) {
                Context context = getContext();
                int i10 = k.f27517l;
                ((k) childAt).e(context);
            }
            i4++;
        }
    }

    public void setUnboundedRippleResource(int i4) {
        setUnboundedRipple(getResources().getBoolean(i4));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        k(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i4) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.K;
        ArrayList arrayList = this.L;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.K = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i4) {
        if (i4 != 0) {
            setSelectedTabIndicator(jm.a.l(i4, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
