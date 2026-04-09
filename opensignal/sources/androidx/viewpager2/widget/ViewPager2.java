package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import h7.q0;
import h7.v0;
import h7.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import js.e;
import u3.i0;
import z7.b;
import z7.c;
import z7.d;
import z7.f;
import z7.g;
import z7.h;
import z7.k;
import z7.l;
import z7.m;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public int B;
    public Parcelable D;
    public final m E;
    public final l F;
    public final d G;
    public final f H;
    public final b I;
    public final c J;
    public v0 K;
    public boolean L;
    public boolean M;
    public int N;
    public final e O;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2150a;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2151d;

    /* renamed from: g, reason: collision with root package name */
    public int f2152g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2153r;

    /* renamed from: x, reason: collision with root package name */
    public final z7.e f2154x;

    /* renamed from: y, reason: collision with root package name */
    public final h f2155y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2156a;

        /* renamed from: d, reason: collision with root package name */
        public int f2157d;

        /* renamed from: g, reason: collision with root package name */
        public Parcelable f2158g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2156a);
            parcel.writeInt(this.f2157d);
            parcel.writeParcelable(this.f2158g, i10);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2150a = new Rect();
        this.f2151d = new Rect();
        f fVar = new f();
        int i10 = 0;
        this.f2153r = false;
        this.f2154x = new z7.e(i10, this);
        this.B = -1;
        this.K = null;
        this.L = false;
        int i11 = 1;
        this.M = true;
        this.N = -1;
        this.O = new e(this);
        m mVar = new m(this, context);
        this.E = mVar;
        WeakHashMap weakHashMap = i0.f23177a;
        mVar.setId(View.generateViewId());
        this.E.setDescendantFocusability(131072);
        h hVar = new h(this);
        this.f2155y = hVar;
        this.E.setLayoutManager(hVar);
        this.E.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y7.a.ViewPager2);
        i0.m(this, context, y7.a.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(y7.a.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.E.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            m mVar2 = this.E;
            g gVar = new g();
            if (mVar2.f2058b0 == null) {
                mVar2.f2058b0 = new ArrayList();
            }
            mVar2.f2058b0.add(gVar);
            d dVar = new d(this);
            this.G = dVar;
            this.I = new b(dVar);
            l lVar = new l(this);
            this.F = lVar;
            lVar.a(this.E);
            this.E.j(this.G);
            f fVar2 = new f();
            this.H = fVar2;
            this.G.f26691a = fVar2;
            f fVar3 = new f(this, i10);
            f fVar4 = new f(this, i11);
            ((ArrayList) fVar2.f26704b).add(fVar3);
            ((ArrayList) this.H.f26704b).add(fVar4);
            e eVar = this.O;
            m mVar3 = this.E;
            eVar.getClass();
            mVar3.setImportantForAccessibility(2);
            eVar.f13800x = new z7.e(i11, eVar);
            ViewPager2 viewPager2 = (ViewPager2) eVar.f13797d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.H.f26704b).add(fVar);
            c cVar = new c();
            this.J = cVar;
            ((ArrayList) this.H.f26704b).add(cVar);
            m mVar4 = this.E;
            attachViewToParent(mVar4, 0, mVar4.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        q0 adapter;
        if (this.B == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.D != null) {
            this.D = null;
        }
        int iMax = Math.max(0, Math.min(this.B, adapter.b() - 1));
        this.f2152g = iMax;
        this.B = -1;
        this.E.i0(iMax);
        this.O.q0();
    }

    public final void b(int i10, boolean z10) {
        f fVar;
        q0 adapter = getAdapter();
        if (adapter == null) {
            if (this.B != -1) {
                this.B = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.b() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.b() - 1);
        int i11 = this.f2152g;
        if (iMin == i11 && this.G.f26696f == 0) {
            return;
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d6 = i11;
        this.f2152g = iMin;
        this.O.q0();
        d dVar = this.G;
        if (dVar.f26696f != 0) {
            dVar.e();
            lb.c cVar = dVar.f26697g;
            d6 = cVar.f15083b + cVar.f15082a;
        }
        d dVar2 = this.G;
        dVar2.getClass();
        dVar2.f26695e = z10 ? 2 : 3;
        boolean z11 = dVar2.f26699i != iMin;
        dVar2.f26699i = iMin;
        dVar2.c(2);
        if (z11 && (fVar = dVar2.f26691a) != null) {
            fVar.c(iMin);
        }
        if (!z10) {
            this.E.i0(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - d6) <= 3.0d) {
            this.E.l0(iMin);
            return;
        }
        this.E.i0(d10 > d6 ? iMin - 3 : iMin + 3);
        m mVar = this.E;
        mVar.post(new bc.m(iMin, mVar));
    }

    public final void c() {
        l lVar = this.F;
        if (lVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = lVar.e(this.f2155y);
        if (viewE == null) {
            return;
        }
        this.f2155y.getClass();
        int iH = y0.H(viewE);
        if (iH != this.f2152g && getScrollState() == 0) {
            this.H.c(iH);
        }
        this.f2153r = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.E.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.E.canScrollVertically(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f2156a;
            sparseArray.put(this.E.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.O.getClass();
        this.O.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public q0 getAdapter() {
        return this.E.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2152g;
    }

    public int getItemDecorationCount() {
        return this.E.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.N;
    }

    public int getOrientation() {
        return this.f2155y.f2036p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        m mVar = this.E;
        if (orientation == 0) {
            height = mVar.getWidth() - mVar.getPaddingLeft();
            paddingBottom = mVar.getPaddingRight();
        } else {
            height = mVar.getHeight() - mVar.getPaddingTop();
            paddingBottom = mVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.G.f26696f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iB;
        int iB2;
        int iB3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.O.f13797d;
        if (viewPager2.getAdapter() == null) {
            iB = 0;
            iB2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iB = viewPager2.getAdapter().b();
            iB2 = 1;
        } else {
            iB2 = viewPager2.getAdapter().b();
            iB = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a2.a.a(iB, iB2, 0).f28a);
        q0 adapter = viewPager2.getAdapter();
        if (adapter == null || (iB3 = adapter.b()) == 0 || !viewPager2.M) {
            return;
        }
        if (viewPager2.f2152g > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f2152g < iB3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.E.getMeasuredWidth();
        int measuredHeight = this.E.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2150a;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f2151d;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.E.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2153r) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.E, i10, i11);
        int measuredWidth = this.E.getMeasuredWidth();
        int measuredHeight = this.E.getMeasuredHeight();
        int measuredState = this.E.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.B = savedState.f2157d;
        this.D = savedState.f2158g;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2156a = this.E.getId();
        int i10 = this.B;
        if (i10 == -1) {
            i10 = this.f2152g;
        }
        savedState.f2157d = i10;
        Parcelable parcelable = this.D;
        if (parcelable != null) {
            savedState.f2158g = parcelable;
            return savedState;
        }
        this.E.getAdapter();
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.O.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        e eVar = this.O;
        ViewPager2 viewPager2 = (ViewPager2) eVar.f13797d;
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = (ViewPager2) eVar.f13797d;
        if (viewPager22.M) {
            viewPager22.b(currentItem, true);
        }
        return true;
    }

    public void setAdapter(q0 q0Var) {
        q0 adapter = this.E.getAdapter();
        e eVar = this.O;
        if (adapter != null) {
            adapter.f10189a.unregisterObserver((z7.e) eVar.f13800x);
        } else {
            eVar.getClass();
        }
        z7.e eVar2 = this.f2154x;
        if (adapter != null) {
            adapter.f10189a.unregisterObserver(eVar2);
        }
        this.E.setAdapter(q0Var);
        this.f2152g = 0;
        a();
        e eVar3 = this.O;
        eVar3.q0();
        if (q0Var != null) {
            q0Var.f10189a.registerObserver((z7.e) eVar3.f13800x);
        }
        if (q0Var != null) {
            q0Var.f10189a.registerObserver(eVar2);
        }
    }

    public void setCurrentItem(int i10) {
        Object obj = this.I.f26690a;
        b(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.O.q0();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.N = i10;
        this.E.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2155y.d1(i10);
        this.O.q0();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.L) {
                this.K = this.E.getItemAnimator();
                this.L = true;
            }
            this.E.setItemAnimator(null);
        } else if (this.L) {
            this.E.setItemAnimator(this.K);
            this.K = null;
            this.L = false;
        }
        this.J.getClass();
        if (kVar == null) {
            return;
        }
        this.J.getClass();
        this.J.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.M = z10;
        this.O.q0();
    }
}
