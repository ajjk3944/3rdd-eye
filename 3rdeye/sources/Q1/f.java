package Q1;

import L0.I;
import M0.g;
import Q1.e;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class f extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10882b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10883c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.c f10884d;

    /* renamed from: e, reason: collision with root package name */
    public int f10885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10886f;

    /* renamed from: g, reason: collision with root package name */
    public final a f10887g;

    /* renamed from: h, reason: collision with root package name */
    public final d f10888h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Parcelable f10889j;

    /* renamed from: k, reason: collision with root package name */
    public final i f10890k;

    /* renamed from: l, reason: collision with root package name */
    public final h f10891l;

    /* renamed from: m, reason: collision with root package name */
    public final Q1.e f10892m;

    /* renamed from: n, reason: collision with root package name */
    public final Q1.c f10893n;

    /* renamed from: o, reason: collision with root package name */
    public final H7.e f10894o;

    /* renamed from: p, reason: collision with root package name */
    public final Q1.d f10895p;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView.m f10896q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10897r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10898s;

    /* renamed from: t, reason: collision with root package name */
    public int f10899t;

    /* renamed from: u, reason: collision with root package name */
    public final C0130f f10900u;

    /* compiled from: ViewPager2.java */
    public class a extends c {
        public a() {
        }

        @Override // Q1.f.c, androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            f fVar = f.this;
            fVar.f10886f = true;
            fVar.f10892m.f10878l = true;
        }
    }

    /* compiled from: ViewPager2.java */
    public abstract class b {
    }

    /* compiled from: ViewPager2.java */
    public static abstract class c extends RecyclerView.j {
        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i10, Object obj) {
            onChanged();
        }
    }

    /* compiled from: ViewPager2.java */
    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean D0(RecyclerView.w wVar, RecyclerView.B b10, int i, Bundle bundle) {
            f.this.f10900u.getClass();
            return super.D0(wVar, b10, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void Y0(RecyclerView.B b10, int[] iArr) {
            f fVar = f.this;
            int offscreenPageLimit = fVar.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.Y0(b10, iArr);
                return;
            }
            int pageSize = fVar.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void q0(RecyclerView.w wVar, RecyclerView.B b10, M0.g gVar) {
            super.q0(wVar, b10, gVar);
            f.this.f10900u.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void s0(RecyclerView.w wVar, RecyclerView.B b10, View view, M0.g gVar) {
            int iB0;
            int iB02;
            f fVar = f.this;
            if (fVar.getOrientation() == 1) {
                fVar.f10888h.getClass();
                iB0 = RecyclerView.p.b0(view);
            } else {
                iB0 = 0;
            }
            if (fVar.getOrientation() == 0) {
                fVar.f10888h.getClass();
                iB02 = RecyclerView.p.b0(view);
            } else {
                iB02 = 0;
            }
            gVar.k(g.e.a(false, iB0, 1, iB02, 1));
        }
    }

    /* compiled from: ViewPager2.java */
    /* renamed from: Q1.f$f, reason: collision with other inner class name */
    public class C0130f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f10903a = new a();

        /* renamed from: b, reason: collision with root package name */
        public final b f10904b = new b();

        /* renamed from: c, reason: collision with root package name */
        public Q1.j f10905c;

        /* compiled from: ViewPager2.java */
        /* renamed from: Q1.f$f$a */
        public class a implements M0.i {
            public a() {
            }

            @Override // M0.i
            public final boolean a(View view) {
                int currentItem = ((f) view).getCurrentItem() + 1;
                f fVar = f.this;
                if (fVar.f10898s) {
                    fVar.e(currentItem, true);
                }
                return true;
            }
        }

        /* compiled from: ViewPager2.java */
        /* renamed from: Q1.f$f$b */
        public class b implements M0.i {
            public b() {
            }

            @Override // M0.i
            public final boolean a(View view) {
                int currentItem = ((f) view).getCurrentItem() - 1;
                f fVar = f.this;
                if (fVar.f10898s) {
                    fVar.e(currentItem, true);
                }
                return true;
            }
        }

        public C0130f() {
        }

        public final void a() {
            int itemCount;
            int i = R.id.accessibilityActionPageLeft;
            f fVar = f.this;
            I.l(R.id.accessibilityActionPageLeft, fVar);
            I.i(0, fVar);
            I.l(R.id.accessibilityActionPageRight, fVar);
            I.i(0, fVar);
            I.l(R.id.accessibilityActionPageUp, fVar);
            I.i(0, fVar);
            I.l(R.id.accessibilityActionPageDown, fVar);
            I.i(0, fVar);
            if (fVar.getAdapter() == null || (itemCount = fVar.getAdapter().getItemCount()) == 0 || !fVar.f10898s) {
                return;
            }
            int orientation = fVar.getOrientation();
            b bVar = this.f10904b;
            a aVar = this.f10903a;
            if (orientation != 0) {
                if (fVar.f10885e < itemCount - 1) {
                    I.m(fVar, new g.a(R.id.accessibilityActionPageDown), aVar);
                }
                if (fVar.f10885e > 0) {
                    I.m(fVar, new g.a(R.id.accessibilityActionPageUp), bVar);
                    return;
                }
                return;
            }
            boolean z10 = fVar.f10888h.W() == 1;
            int i10 = z10 ? 16908360 : 16908361;
            if (z10) {
                i = 16908361;
            }
            if (fVar.f10885e < itemCount - 1) {
                I.m(fVar, new g.a(i10), aVar);
            }
            if (fVar.f10885e > 0) {
                I.m(fVar, new g.a(i), bVar);
            }
        }
    }

    /* compiled from: ViewPager2.java */
    public interface g {
        void transformPage(View view, float f10);
    }

    /* compiled from: ViewPager2.java */
    public class h extends C {
        public h() {
        }

        @Override // androidx.recyclerview.widget.C, androidx.recyclerview.widget.G
        public final View c(RecyclerView.p pVar) {
            Object obj = f.this.f10894o.f2291b;
            return super.c(pVar);
        }
    }

    /* compiled from: ViewPager2.java */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            f.this.f10900u.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            f fVar = f.this;
            accessibilityEvent.setFromIndex(fVar.f10885e);
            accessibilityEvent.setToIndex(fVar.f10885e);
            accessibilityEvent.setSource(f.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return f.this.f10898s && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return f.this.f10898s && super.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: ViewPager2.java */
    public static class k implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f10914b;

        /* renamed from: c, reason: collision with root package name */
        public final i f10915c;

        public k(int i, i iVar) {
            this.f10914b = i;
            this.f10915c = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10915c.smoothScrollToPosition(this.f10914b);
        }
    }

    public f(Context context) throws IllegalStateException {
        super(context);
        this.f10882b = new Rect();
        this.f10883c = new Rect();
        Q1.c cVar = new Q1.c();
        this.f10884d = cVar;
        this.f10886f = false;
        this.f10887g = new a();
        this.i = -1;
        this.f10896q = null;
        this.f10897r = false;
        this.f10898s = true;
        this.f10899t = -1;
        this.f10900u = new C0130f();
        i iVar = new i(context);
        this.f10890k = iVar;
        iVar.setId(View.generateViewId());
        this.f10890k.setDescendantFocusability(131072);
        d dVar = new d();
        this.f10888h = dVar;
        this.f10890k.setLayoutManager(dVar);
        this.f10890k.setScrollingTouchSlop(1);
        int[] iArr = O1.a.f10173a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        I.n(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f10890k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f10890k.addOnChildAttachStateChangeListener(new Q1.i());
            Q1.e eVar = new Q1.e(this);
            this.f10892m = eVar;
            this.f10894o = new H7.e(eVar);
            h hVar = new h();
            this.f10891l = hVar;
            hVar.a(this.f10890k);
            this.f10890k.addOnScrollListener(this.f10892m);
            Q1.c cVar2 = new Q1.c();
            this.f10893n = cVar2;
            this.f10892m.f10868a = cVar2;
            Q1.g gVar = new Q1.g(this);
            Q1.h hVar2 = new Q1.h(this);
            this.f10893n.f10865d.add(gVar);
            this.f10893n.f10865d.add(hVar2);
            C0130f c0130f = this.f10900u;
            i iVar2 = this.f10890k;
            c0130f.getClass();
            iVar2.setImportantForAccessibility(2);
            c0130f.f10905c = new Q1.j(c0130f);
            f fVar = f.this;
            if (fVar.getImportantForAccessibility() == 0) {
                fVar.setImportantForAccessibility(1);
            }
            this.f10893n.f10865d.add(cVar);
            Q1.d dVar2 = new Q1.d(this.f10888h);
            this.f10895p = dVar2;
            this.f10893n.f10865d.add(dVar2);
            i iVar3 = this.f10890k;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(e eVar) {
        this.f10884d.f10865d.add(eVar);
    }

    public final void b() {
        if (this.f10895p.f10867e == null) {
            return;
        }
        Q1.e eVar = this.f10892m;
        eVar.e();
        e.a aVar = eVar.f10874g;
        double d10 = aVar.f10879a + aVar.f10880b;
        int i10 = (int) d10;
        float f10 = (float) (d10 - i10);
        this.f10895p.onPageScrolled(i10, f10, Math.round(getPageSize() * f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        RecyclerView.h adapter;
        if (this.i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        if (this.f10889j != null) {
            if (adapter instanceof P1.a) {
                ((P1.a) adapter).b();
            }
            this.f10889j = null;
        }
        int iMax = Math.max(0, Math.min(this.i, adapter.getItemCount() - 1));
        this.f10885e = iMax;
        this.i = -1;
        this.f10890k.scrollToPosition(iMax);
        this.f10900u.a();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f10890k.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f10890k.canScrollVertically(i10);
    }

    public final void d(int i10, boolean z10) {
        Object obj = this.f10894o.f2291b;
        e(i10, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i10 = ((j) parcelable).f10911b;
            sparseArray.put(this.f10890k.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e(int i10, boolean z10) {
        Q1.c cVar;
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.i != -1) {
                this.i = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i11 = this.f10885e;
        if (iMin == i11 && this.f10892m.f10873f == 0) {
            return;
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f10885e = iMin;
        this.f10900u.a();
        Q1.e eVar = this.f10892m;
        if (eVar.f10873f != 0) {
            eVar.e();
            e.a aVar = eVar.f10874g;
            d10 = aVar.f10879a + aVar.f10880b;
        }
        Q1.e eVar2 = this.f10892m;
        eVar2.getClass();
        eVar2.f10872e = z10 ? 2 : 3;
        boolean z11 = eVar2.i != iMin;
        eVar2.i = iMin;
        eVar2.c(2);
        if (z11 && (cVar = eVar2.f10868a) != null) {
            cVar.onPageSelected(iMin);
        }
        if (!z10) {
            this.f10890k.scrollToPosition(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f10890k.smoothScrollToPosition(iMin);
            return;
        }
        this.f10890k.scrollToPosition(d11 > d10 ? iMin - 3 : iMin + 3);
        i iVar = this.f10890k;
        iVar.post(new k(iMin, iVar));
    }

    public final void f(e eVar) {
        this.f10884d.f10865d.remove(eVar);
    }

    public final void g() {
        h hVar = this.f10891l;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewC = hVar.c(this.f10888h);
        if (viewC == null) {
            return;
        }
        this.f10888h.getClass();
        int iB0 = RecyclerView.p.b0(viewC);
        if (iB0 != this.f10885e && getScrollState() == 0) {
            this.f10893n.onPageSelected(iB0);
        }
        this.f10886f = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f10900u.getClass();
        this.f10900u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.h getAdapter() {
        return this.f10890k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f10885e;
    }

    public int getItemDecorationCount() {
        return this.f10890k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f10899t;
    }

    public int getOrientation() {
        return this.f10888h.f16414p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f10890k;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f10892m.f10873f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f fVar = f.this;
        if (fVar.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (fVar.getOrientation() == 1) {
            itemCount = fVar.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = fVar.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(itemCount, itemCount2, false, 0));
        RecyclerView.h adapter = fVar.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !fVar.f10898s) {
            return;
        }
        if (fVar.f10885e > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (fVar.f10885e < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f10890k.getMeasuredWidth();
        int measuredHeight = this.f10890k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f10882b;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f10883c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f10890k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f10886f) {
            g();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f10890k, i10, i11);
        int measuredWidth = this.f10890k.getMeasuredWidth();
        int measuredHeight = this.f10890k.getMeasuredHeight();
        int measuredState = this.f10890k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.i = jVar.f10912c;
        this.f10889j = jVar.f10913d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f10911b = this.f10890k.getId();
        int i10 = this.i;
        if (i10 == -1) {
            i10 = this.f10885e;
        }
        jVar.f10912c = i10;
        Parcelable parcelable = this.f10889j;
        if (parcelable != null) {
            jVar.f10913d = parcelable;
            return jVar;
        }
        Object adapter = this.f10890k.getAdapter();
        if (adapter instanceof P1.a) {
            jVar.f10913d = ((P1.a) adapter).a();
        }
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(f.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.f10900u.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        C0130f c0130f = this.f10900u;
        c0130f.getClass();
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        f fVar = f.this;
        int currentItem = i10 == 8192 ? fVar.getCurrentItem() - 1 : fVar.getCurrentItem() + 1;
        if (fVar.f10898s) {
            fVar.e(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f10890k.getAdapter();
        C0130f c0130f = this.f10900u;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(c0130f.f10905c);
        } else {
            c0130f.getClass();
        }
        a aVar = this.f10887g;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        this.f10890k.setAdapter(hVar);
        this.f10885e = 0;
        c();
        C0130f c0130f2 = this.f10900u;
        c0130f2.a();
        if (hVar != null) {
            hVar.registerAdapterDataObserver(c0130f2.f10905c);
        }
        if (hVar != null) {
            hVar.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        d(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f10900u.a();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f10899t = i10;
        this.f10890k.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f10888h.y1(i10);
        this.f10900u.a();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.f10897r) {
                this.f10896q = this.f10890k.getItemAnimator();
                this.f10897r = true;
            }
            this.f10890k.setItemAnimator(null);
        } else if (this.f10897r) {
            this.f10890k.setItemAnimator(this.f10896q);
            this.f10896q = null;
            this.f10897r = false;
        }
        Q1.d dVar = this.f10895p;
        if (gVar == dVar.f10867e) {
            return;
        }
        dVar.f10867e = gVar;
        b();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f10898s = z10;
        this.f10900u.a();
    }

    /* compiled from: ViewPager2.java */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f10911b;

        /* renamed from: c, reason: collision with root package name */
        public int f10912c;

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f10913d;

        @SuppressLint({"ClassVerificationFailure"})
        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10911b = parcel.readInt();
            this.f10912c = parcel.readInt();
            this.f10913d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10911b);
            parcel.writeInt(this.f10912c);
            parcel.writeParcelable(this.f10913d, i);
        }

        /* compiled from: ViewPager2.java */
        public class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new j(parcel, null);
                }
                j jVar = new j(parcel);
                jVar.f10911b = parcel.readInt();
                jVar.f10912c = parcel.readInt();
                jVar.f10913d = parcel.readParcelable(null);
                return jVar;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new j[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new j(parcel, classLoader);
                }
                j jVar = new j(parcel);
                jVar.f10911b = parcel.readInt();
                jVar.f10912c = parcel.readInt();
                jVar.f10913d = parcel.readParcelable(null);
                return jVar;
            }
        }
    }

    /* compiled from: ViewPager2.java */
    public static abstract class e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrolled(int i, float f10, int i10) {
        }
    }
}
