package androidx.viewpager2.widget;

import Q0.a;
import R.O;
import R0.c;
import S0.b;
import S0.d;
import S0.e;
import S0.f;
import S0.h;
import S0.k;
import S0.l;
import U0.j;
import U4.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.L;
import c1.g;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2616u;
import k0.K;
import u.C2938g;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: C, reason: collision with root package name */
    public final b f5639C;

    /* renamed from: D, reason: collision with root package name */
    public L f5640D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5641E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5642F;

    /* renamed from: G, reason: collision with root package name */
    public int f5643G;

    /* renamed from: H, reason: collision with root package name */
    public final g f5644H;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5645a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5646b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5647c;

    /* renamed from: d, reason: collision with root package name */
    public int f5648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5649e;

    /* renamed from: f, reason: collision with root package name */
    public final e f5650f;

    /* renamed from: g, reason: collision with root package name */
    public final h f5651g;

    /* renamed from: h, reason: collision with root package name */
    public int f5652h;
    public Parcelable i;

    /* renamed from: j, reason: collision with root package name */
    public final l f5653j;

    /* renamed from: k, reason: collision with root package name */
    public final k f5654k;

    /* renamed from: l, reason: collision with root package name */
    public final d f5655l;

    /* renamed from: m, reason: collision with root package name */
    public final c f5656m;

    /* renamed from: n, reason: collision with root package name */
    public final j f5657n;

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5645a = new Rect();
        this.f5646b = new Rect();
        c cVar = new c();
        this.f5647c = cVar;
        int i = 0;
        this.f5649e = false;
        this.f5650f = new e(i, this);
        this.f5652h = -1;
        this.f5640D = null;
        this.f5641E = false;
        int i3 = 1;
        this.f5642F = true;
        this.f5643G = -1;
        this.f5644H = new g(this);
        l lVar = new l(this, context);
        this.f5653j = lVar;
        WeakHashMap weakHashMap = O.f3270a;
        lVar.setId(View.generateViewId());
        this.f5653j.setDescendantFocusability(131072);
        h hVar = new h(this);
        this.f5651g = hVar;
        this.f5653j.setLayoutManager(hVar);
        this.f5653j.setScrollingTouchSlop(1);
        int[] iArr = a.f3168a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f5653j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            l lVar2 = this.f5653j;
            S0.g gVar = new S0.g();
            if (lVar2.f5332P == null) {
                lVar2.f5332P = new ArrayList();
            }
            lVar2.f5332P.add(gVar);
            d dVar = new d(this);
            this.f5655l = dVar;
            this.f5657n = new j(13, dVar);
            k kVar = new k(this);
            this.f5654k = kVar;
            kVar.attachToRecyclerView(this.f5653j);
            this.f5653j.h(this.f5655l);
            c cVar2 = new c();
            this.f5656m = cVar2;
            this.f5655l.f3453a = cVar2;
            f fVar = new f(this, i);
            f fVar2 = new f(this, i3);
            ((ArrayList) cVar2.f3378b).add(fVar);
            ((ArrayList) this.f5656m.f3378b).add(fVar2);
            g gVar2 = this.f5644H;
            l lVar3 = this.f5653j;
            gVar2.getClass();
            lVar3.setImportantForAccessibility(2);
            gVar2.f5898d = new e(i3, gVar2);
            ViewPager2 viewPager2 = (ViewPager2) gVar2.f5899e;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f5656m.f3378b).add(cVar);
            b bVar = new b();
            this.f5639C = bVar;
            ((ArrayList) this.f5656m.f3378b).add(bVar);
            l lVar4 = this.f5653j;
            attachViewToParent(lVar4, 0, lVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() throws NumberFormatException {
        G adapter;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vM;
        if (this.f5652h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof m) {
                m mVar = (m) adapter;
                C2938g c2938g = mVar.f3751c;
                C2938g c2938g2 = mVar.f3752d;
                if (c2938g2.j() != 0 || c2938g.j() != 0) {
                    throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(mVar.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j6 = Long.parseLong(str.substring(2));
                        K k6 = mVar.f3750b;
                        k6.getClass();
                        String string = bundle.getString(str);
                        if (string == null) {
                            abstractComponentCallbacksC2617vM = null;
                        } else {
                            abstractComponentCallbacksC2617vM = k6.f21505c.m(string);
                            if (abstractComponentCallbacksC2617vM == null) {
                                k6.d0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                        }
                        c2938g.h(j6, abstractComponentCallbacksC2617vM);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j7 = Long.parseLong(str.substring(2));
                        C2616u c2616u = (C2616u) bundle.getParcelable(str);
                        if (mVar.b(j7)) {
                            c2938g2.h(j7, c2616u);
                        }
                    }
                }
                if (c2938g.j() != 0) {
                    mVar.f3756h = true;
                    mVar.f3755g = true;
                    mVar.c();
                    Handler handler = new Handler(Looper.getMainLooper());
                    C0.k kVar = new C0.k(6, mVar);
                    mVar.f3749a.a(new R0.b(handler, 1, kVar));
                    handler.postDelayed(kVar, 10000L);
                }
            }
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.f5652h, adapter.getItemCount() - 1));
        this.f5648d = iMax;
        this.f5652h = -1;
        this.f5653j.c0(iMax);
        this.f5644H.H();
    }

    public final void b(int i) {
        G adapter = getAdapter();
        if (adapter == null) {
            if (this.f5652h != -1) {
                this.f5652h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i3 = this.f5648d;
        if ((iMin == i3 && this.f5655l.f3458f == 0) || iMin == i3) {
            return;
        }
        double d6 = i3;
        this.f5648d = iMin;
        this.f5644H.H();
        d dVar = this.f5655l;
        if (dVar.f3458f != 0) {
            dVar.d();
            S0.c cVar = dVar.f3459g;
            d6 = cVar.f3451b + cVar.f3450a;
        }
        d dVar2 = this.f5655l;
        dVar2.getClass();
        dVar2.f3457e = 2;
        boolean z6 = dVar2.i != iMin;
        dVar2.i = iMin;
        dVar2.b(2);
        if (z6) {
            dVar2.a(iMin);
        }
        double d7 = iMin;
        if (Math.abs(d7 - d6) <= 3.0d) {
            this.f5653j.e0(iMin);
            return;
        }
        this.f5653j.c0(d7 > d6 ? iMin - 3 : iMin + 3);
        l lVar = this.f5653j;
        lVar.post(new A3.h(iMin, lVar));
    }

    public final void c() {
        k kVar = this.f5654k;
        if (kVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = kVar.findSnapView(this.f5651g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f5651g.getPosition(viewFindSnapView);
        if (position != this.f5648d && getScrollState() == 0) {
            this.f5656m.c(position);
        }
        this.f5649e = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f5653j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f5653j.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) throws NumberFormatException {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof S0.m) {
            int i = ((S0.m) parcelable).f3471a;
            sparseArray.put(this.f5653j.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f5644H.getClass();
        this.f5644H.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public G getAdapter() {
        return this.f5653j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5648d;
    }

    public int getItemDecorationCount() {
        return this.f5653j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5643G;
    }

    public int getOrientation() {
        return this.f5651g.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        l lVar = this.f5653j;
        if (orientation == 0) {
            height = lVar.getWidth() - lVar.getPaddingLeft();
            paddingBottom = lVar.getPaddingRight();
        } else {
            height = lVar.getHeight() - lVar.getPaddingTop();
            paddingBottom = lVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5655l.f3458f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f5644H.f5899e;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 0;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.q(itemCount, itemCount2, 0, false).f3677b);
        G adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f5642F) {
            return;
        }
        if (viewPager2.f5648d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f5648d < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int measuredWidth = this.f5653j.getMeasuredWidth();
        int measuredHeight = this.f5653j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f5645a;
        rect.left = paddingLeft;
        rect.right = (i6 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i7 - i3) - getPaddingBottom();
        Rect rect2 = this.f5646b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f5653j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f5649e) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        measureChild(this.f5653j, i, i3);
        int measuredWidth = this.f5653j.getMeasuredWidth();
        int measuredHeight = this.f5653j.getMeasuredHeight();
        int measuredState = this.f5653j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof S0.m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S0.m mVar = (S0.m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f5652h = mVar.f3472b;
        this.i = mVar.f3473c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        S0.m mVar = new S0.m(super.onSaveInstanceState());
        mVar.f3471a = this.f5653j.getId();
        int i = this.f5652h;
        if (i == -1) {
            i = this.f5648d;
        }
        mVar.f3472b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            mVar.f3473c = parcelable;
            return mVar;
        }
        G adapter = this.f5653j.getAdapter();
        if (adapter instanceof m) {
            m mVar2 = (m) adapter;
            mVar2.getClass();
            C2938g c2938g = mVar2.f3751c;
            int iJ = c2938g.j();
            C2938g c2938g2 = mVar2.f3752d;
            Bundle bundle = new Bundle(c2938g2.j() + iJ);
            for (int i3 = 0; i3 < c2938g.j(); i3++) {
                long jG = c2938g.g(i3);
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) c2938g.d(jG);
                if (abstractComponentCallbacksC2617v != null && abstractComponentCallbacksC2617v.v()) {
                    String str = "f#" + jG;
                    K k6 = mVar2.f3750b;
                    k6.getClass();
                    if (abstractComponentCallbacksC2617v.f21684G != k6) {
                        k6.d0(new IllegalStateException(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(str, abstractComponentCallbacksC2617v.f21710e);
                }
            }
            for (int i6 = 0; i6 < c2938g2.j(); i6++) {
                long jG2 = c2938g2.g(i6);
                if (mVar2.b(jG2)) {
                    bundle.putParcelable("s#" + jG2, (Parcelable) c2938g2.d(jG2));
                }
            }
            mVar.f3473c = bundle;
        }
        return mVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f5644H.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        g gVar = this.f5644H;
        ViewPager2 viewPager2 = (ViewPager2) gVar.f5899e;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = (ViewPager2) gVar.f5899e;
        if (viewPager22.f5642F) {
            viewPager22.b(currentItem);
        }
        return true;
    }

    public void setAdapter(G g2) throws NumberFormatException {
        G adapter = this.f5653j.getAdapter();
        g gVar = this.f5644H;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((e) gVar.f5898d);
        } else {
            gVar.getClass();
        }
        e eVar = this.f5650f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(eVar);
        }
        this.f5653j.setAdapter(g2);
        this.f5648d = 0;
        a();
        g gVar2 = this.f5644H;
        gVar2.H();
        if (g2 != null) {
            g2.registerAdapterDataObserver((e) gVar2.f5898d);
        }
        if (g2 != null) {
            g2.registerAdapterDataObserver(eVar);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.f5657n.f3677b;
        b(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5644H.H();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5643G = i;
        this.f5653j.requestLayout();
    }

    public void setOrientation(int i) {
        this.f5651g.setOrientation(i);
        this.f5644H.H();
    }

    public void setPageTransformer(S0.j jVar) {
        if (jVar != null) {
            if (!this.f5641E) {
                this.f5640D = this.f5653j.getItemAnimator();
                this.f5641E = true;
            }
            this.f5653j.setItemAnimator(null);
        } else if (this.f5641E) {
            this.f5653j.setItemAnimator(this.f5640D);
            this.f5640D = null;
            this.f5641E = false;
        }
        this.f5639C.getClass();
        if (jVar == null) {
            return;
        }
        this.f5639C.getClass();
        this.f5639C.getClass();
    }

    public void setUserInputEnabled(boolean z6) {
        this.f5642F = z6;
        this.f5644H.H();
    }
}
