package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;
import j4.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r0.i;
import r4.e;
import r4.f;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.n implements r4.b, RecyclerView.x.b {

    /* renamed from: a, reason: collision with root package name */
    public int f10132a;

    /* renamed from: b, reason: collision with root package name */
    public int f10133b;

    /* renamed from: c, reason: collision with root package name */
    public int f10134c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10135d;

    /* renamed from: e, reason: collision with root package name */
    public final c f10136e;

    /* renamed from: f, reason: collision with root package name */
    public CarouselStrategy f10137f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.carousel.c f10138g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.carousel.b f10139h;

    /* renamed from: i, reason: collision with root package name */
    public int f10140i;

    /* renamed from: j, reason: collision with root package name */
    public Map f10141j;

    /* renamed from: k, reason: collision with root package name */
    public e f10142k;

    /* renamed from: l, reason: collision with root package name */
    public final View.OnLayoutChangeListener f10143l;

    /* renamed from: m, reason: collision with root package name */
    public int f10144m;

    /* renamed from: n, reason: collision with root package name */
    public int f10145n;

    /* renamed from: o, reason: collision with root package name */
    public int f10146o;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public int calculateDxToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f10138g == null || !CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int calculateDyToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f10138g == null || CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public PointF computeScrollVectorForPosition(int i10) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f10148a;

        /* renamed from: b, reason: collision with root package name */
        public final float f10149b;

        /* renamed from: c, reason: collision with root package name */
        public final float f10150c;

        /* renamed from: d, reason: collision with root package name */
        public final d f10151d;

        public b(View view, float f10, float f11, d dVar) {
            this.f10148a = view;
            this.f10149b = f10;
            this.f10150c = f11;
            this.f10151d = dVar;
        }
    }

    public static class c extends RecyclerView.m {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f10152a;

        /* renamed from: b, reason: collision with root package name */
        public List f10153b;

        public c() {
            Paint paint = new Paint();
            this.f10152a = paint;
            this.f10153b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void d(List list) {
            this.f10153b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            super.onDrawOver(canvas, recyclerView, yVar);
            this.f10152a.setStrokeWidth(recyclerView.getResources().getDimension(j4.d.m3_carousel_debug_keyline_width));
            for (b.c cVar : this.f10153b) {
                this.f10152a.setColor(j0.a.c(-65281, -16776961, cVar.f10178c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).d()) {
                    canvas.drawLine(cVar.f10177b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S(), cVar.f10177b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).O(), this.f10152a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).P(), cVar.f10177b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Q(), cVar.f10177b, this.f10152a);
                }
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.c f10154a;

        /* renamed from: b, reason: collision with root package name */
        public final b.c f10155b;

        public d(b.c cVar, b.c cVar2) {
            i.a(cVar.f10176a <= cVar2.f10176a);
            this.f10154a = cVar;
            this.f10155b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new f());
    }

    public static int B(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    public static d W(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            b.c cVar = (b.c) list.get(i14);
            float f15 = z10 ? cVar.f10177b : cVar.f10176a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((b.c) list.get(i10), (b.c) list.get(i12));
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        int orientation = getOrientation();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (orientation == 0) {
                return X() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (orientation == 0) {
                return X() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    public static /* synthetic */ void l(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        view.post(new Runnable() { // from class: r4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f24168a.e0();
            }
        });
    }

    private int scrollBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f10138g == null) {
            d0(uVar);
        }
        if (getItemCount() <= J(this.f10138g).n()) {
            return 0;
        }
        int iB = B(i10, this.f10132a, this.f10133b, this.f10134c);
        this.f10132a += iB;
        l0(this.f10138g);
        float fG = this.f10139h.g() / 2.0f;
        float fY = y(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f10 = X() ? this.f10139h.i().f10177b : this.f10139h.b().f10177b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float fAbs = Math.abs(f10 - c0(childAt, fY, fG, rect));
            if (childAt != null && fAbs < f11) {
                this.f10145n = getPosition(childAt);
                f11 = fAbs;
            }
            fY = s(fY, this.f10139h.g());
        }
        D(uVar, yVar);
        return iB;
    }

    public int A(int i10) {
        return (int) (this.f10132a - U(i10, K(i10)));
    }

    public final int C(com.google.android.material.carousel.c cVar) {
        boolean zX = X();
        com.google.android.material.carousel.b bVarH = zX ? cVar.h() : cVar.l();
        return (int) (R() - t((zX ? bVarH.i() : bVarH.b()).f10176a, bVarH.g() / 2.0f));
    }

    public final void D(RecyclerView.u uVar, RecyclerView.y yVar) {
        f0(uVar);
        if (getChildCount() == 0) {
            w(uVar, this.f10140i - 1);
            v(uVar, yVar, this.f10140i);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            w(uVar, position - 1);
            v(uVar, yVar, position2 + 1);
        }
        n0();
    }

    public final View E() {
        return getChildAt(X() ? 0 : getChildCount() - 1);
    }

    public final View F() {
        return getChildAt(X() ? getChildCount() - 1 : 0);
    }

    public final int G() {
        return d() ? a() : b();
    }

    public final float H(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return d() ? r0.centerX() : r0.centerY();
    }

    public final int I() {
        int i10;
        int i11;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.o oVar = (RecyclerView.o) getChildAt(0).getLayoutParams();
        if (this.f10142k.f24169a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) oVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) oVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        }
        return i10 + i11;
    }

    public final com.google.android.material.carousel.b J(com.google.android.material.carousel.c cVar) {
        return X() ? cVar.h() : cVar.l();
    }

    public final com.google.android.material.carousel.b K(int i10) {
        com.google.android.material.carousel.b bVar;
        Map map = this.f10141j;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(m0.a.b(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f10138g.g() : bVar;
    }

    public final int L() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    public final float M(float f10, d dVar) {
        b.c cVar = dVar.f10154a;
        float f11 = cVar.f10179d;
        b.c cVar2 = dVar.f10155b;
        return k4.a.b(f11, cVar2.f10179d, cVar.f10177b, cVar2.f10177b, f10);
    }

    public int N(int i10, com.google.android.material.carousel.b bVar) {
        return U(i10, bVar) - this.f10132a;
    }

    public final int O() {
        return this.f10142k.d();
    }

    public final int P() {
        return this.f10142k.e();
    }

    public final int Q() {
        return this.f10142k.f();
    }

    public final int R() {
        return this.f10142k.g();
    }

    public final int S() {
        return this.f10142k.h();
    }

    public final int T() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    public final int U(int i10, com.google.android.material.carousel.b bVar) {
        return X() ? (int) (((G() - bVar.i().f10176a) - (i10 * bVar.g())) - (bVar.g() / 2.0f)) : (int) (((i10 * bVar.g()) - bVar.b().f10176a) + (bVar.g() / 2.0f));
    }

    public final int V(int i10, com.google.android.material.carousel.b bVar) {
        int i11 = Integer.MAX_VALUE;
        for (b.c cVar : bVar.f()) {
            float fG = (i10 * bVar.g()) + (bVar.g() / 2.0f);
            int iG = (X() ? (int) ((G() - cVar.f10176a) - fG) : (int) (fG - cVar.f10176a)) - this.f10132a;
            if (Math.abs(i11) > Math.abs(iG)) {
                i11 = iG;
            }
        }
        return i11;
    }

    public boolean X() {
        return d() && getLayoutDirection() == 1;
    }

    public final boolean Y(float f10, d dVar) {
        float fT = t(f10, M(f10, dVar) / 2.0f);
        return X() ? fT < 0.0f : fT > ((float) G());
    }

    public final boolean Z(float f10, d dVar) {
        float fS = s(f10, M(f10, dVar) / 2.0f);
        return X() ? fS > ((float) G()) : fS < 0.0f;
    }

    @Override // r4.b
    public int a() {
        return getWidth();
    }

    public final void a0() {
        if (this.f10135d && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + H(childAt) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    @Override // r4.b
    public int b() {
        return getHeight();
    }

    public final b b0(RecyclerView.u uVar, float f10, int i10) {
        View viewO = uVar.o(i10);
        measureChildWithMargins(viewO, 0, 0);
        float fS = s(f10, this.f10139h.g() / 2.0f);
        d dVarW = W(this.f10139h.h(), fS, false);
        return new b(viewO, fS, x(fS, dVarW), dVarW);
    }

    @Override // r4.b
    public int c() {
        return this.f10146o;
    }

    public final float c0(View view, float f10, float f11, Rect rect) {
        float fS = s(f10, f11);
        d dVarW = W(this.f10139h.h(), fS, false);
        float fX = x(fS, dVarW);
        super.getDecoratedBoundsWithMargins(view, rect);
        k0(view, fS, dVarW);
        this.f10142k.j(view, rect, f11, fX);
        return fX;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollHorizontally() {
        return d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollVertically() {
        return !d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0 || this.f10138g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f10138g.g().g() / computeHorizontalScrollRange(yVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return this.f10132a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return this.f10134c - this.f10133b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f10138g == null) {
            return null;
        }
        int iN = N(i10, K(i10));
        return d() ? new PointF(iN, 0.0f) : new PointF(0.0f, iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0 || this.f10138g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f10138g.g().g() / computeVerticalScrollRange(yVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return this.f10132a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return this.f10134c - this.f10133b;
    }

    @Override // r4.b
    public boolean d() {
        return this.f10142k.f24169a == 0;
    }

    public final void d0(RecyclerView.u uVar) {
        View viewO = uVar.o(0);
        measureChildWithMargins(viewO, 0, 0);
        com.google.android.material.carousel.b bVarG = this.f10137f.g(this, viewO);
        if (X()) {
            bVarG = com.google.android.material.carousel.b.p(bVarG, G());
        }
        this.f10138g = com.google.android.material.carousel.c.f(this, bVarG, I(), L(), T(), this.f10137f.e());
    }

    public final void e0() {
        this.f10138g = null;
        requestLayout();
    }

    public final void f0(RecyclerView.u uVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fH = H(childAt);
            if (!Z(fH, W(this.f10139h.h(), fH, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, uVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fH2 = H(childAt2);
            if (!Y(fH2, W(this.f10139h.h(), fH2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, uVar);
            }
        }
    }

    public final void g0(RecyclerView recyclerView, int i10) {
        if (d()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateDefaultLayoutParams() {
        return new RecyclerView.o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (d()) {
            fCenterY = rect.centerX();
        }
        float fM = M(fCenterY, W(this.f10139h.h(), fCenterY, true));
        float fWidth = d() ? (rect.width() - fM) / 2.0f : 0.0f;
        float fHeight = d() ? 0.0f : (rect.height() - fM) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f10142k.f24169a;
    }

    public void h0(int i10) {
        this.f10146o = i10;
        e0();
    }

    public final void i0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.Carousel);
            h0(typedArrayObtainStyledAttributes.getInt(l.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void j0(CarouselStrategy carouselStrategy) {
        this.f10137f = carouselStrategy;
        e0();
    }

    public final void k0(View view, float f10, d dVar) {
    }

    public final void l0(com.google.android.material.carousel.c cVar) {
        int i10 = this.f10134c;
        int i11 = this.f10133b;
        if (i10 <= i11) {
            this.f10139h = J(cVar);
        } else {
            this.f10139h = cVar.j(this.f10132a, i11, i10);
        }
        this.f10136e.d(this.f10139h.h());
    }

    public final void m0() {
        int itemCount = getItemCount();
        int i10 = this.f10144m;
        if (itemCount == i10 || this.f10138g == null) {
            return;
        }
        if (this.f10137f.h(this, i10)) {
            e0();
        }
        this.f10144m = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void measureChildWithMargins(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void n0() {
        if (!this.f10135d || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                a0();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f10137f.f(recyclerView.getContext());
        e0();
        recyclerView.addOnLayoutChangeListener(this.f10143l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.f10143l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public View onFocusSearchFailed(View view, int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            u(uVar, getPosition(getChildAt(0)) - 1, 0);
            return F();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        u(uVar, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.b() <= 0 || G() <= 0.0f) {
            removeAndRecycleAllViews(uVar);
            this.f10140i = 0;
            return;
        }
        boolean zX = X();
        com.google.android.material.carousel.c cVar = this.f10138g;
        boolean z10 = cVar == null;
        if (z10 || cVar.g().a() != G()) {
            d0(uVar);
        }
        int iC = C(this.f10138g);
        int iZ = z(yVar, this.f10138g);
        this.f10133b = zX ? iZ : iC;
        if (zX) {
            iZ = iC;
        }
        this.f10134c = iZ;
        if (z10) {
            this.f10132a = iC;
            this.f10141j = this.f10138g.i(getItemCount(), this.f10133b, this.f10134c, X());
            int i10 = this.f10145n;
            if (i10 != -1) {
                this.f10132a = U(i10, K(i10));
            }
        }
        int i11 = this.f10132a;
        this.f10132a = i11 + B(0, i11, this.f10133b, this.f10134c);
        this.f10140i = m0.a.b(this.f10140i, 0, yVar.b());
        l0(this.f10138g);
        detachAndScrapAttachedViews(uVar);
        D(uVar, yVar);
        this.f10144m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        if (getChildCount() == 0) {
            this.f10140i = 0;
        } else {
            this.f10140i = getPosition(getChildAt(0));
        }
        n0();
    }

    public final void r(View view, int i10, b bVar) {
        float fG = this.f10139h.g() / 2.0f;
        addView(view, i10);
        measureChildWithMargins(view, 0, 0);
        float f10 = bVar.f10150c;
        this.f10142k.i(view, (int) (f10 - fG), (int) (f10 + fG));
        k0(view, bVar.f10149b, bVar.f10151d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iV;
        if (this.f10138g == null || (iV = V(getPosition(view), K(getPosition(view)))) == 0) {
            return false;
        }
        g0(recyclerView, V(getPosition(view), this.f10138g.j(this.f10132a + B(iV, this.f10132a, this.f10133b, this.f10134c), this.f10133b, this.f10134c)));
        return true;
    }

    public final float s(float f10, float f11) {
        return X() ? f10 - f11 : f10 + f11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, uVar, yVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void scrollToPosition(int i10) {
        this.f10145n = i10;
        if (this.f10138g == null) {
            return;
        }
        this.f10132a = U(i10, K(i10));
        this.f10140i = m0.a.b(i10, 0, Math.max(0, getItemCount() - 1));
        l0(this.f10138g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (canScrollVertically()) {
            return scrollBy(i10, uVar, yVar);
        }
        return 0;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        e eVar = this.f10142k;
        if (eVar == null || i10 != eVar.f24169a) {
            this.f10142k = e.b(this, i10);
            e0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }

    public final float t(float f10, float f11) {
        return X() ? f10 + f11 : f10 - f11;
    }

    public final void u(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        b bVarB0 = b0(uVar, y(i10), i10);
        r(bVarB0.f10148a, i11, bVarB0);
    }

    public final void v(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        float fY = y(i10);
        while (i10 < yVar.b()) {
            float fS = s(fY, this.f10139h.g() / 2.0f);
            d dVarW = W(this.f10139h.h(), fS, false);
            float fX = x(fS, dVarW);
            if (Y(fX, dVarW)) {
                return;
            }
            fY = s(fY, this.f10139h.g());
            if (!Z(fX, dVarW)) {
                View viewO = uVar.o(i10);
                r(viewO, -1, new b(viewO, fS, fX, dVarW));
            }
            i10++;
        }
    }

    public final void w(RecyclerView.u uVar, int i10) {
        float fY = y(i10);
        while (i10 >= 0) {
            float fS = s(fY, this.f10139h.g() / 2.0f);
            d dVarW = W(this.f10139h.h(), fS, false);
            float fX = x(fS, dVarW);
            if (Z(fX, dVarW)) {
                return;
            }
            fY = t(fY, this.f10139h.g());
            if (!Y(fX, dVarW)) {
                View viewO = uVar.o(i10);
                r(viewO, 0, new b(viewO, fS, fX, dVarW));
            }
            i10--;
        }
    }

    public final float x(float f10, d dVar) {
        b.c cVar = dVar.f10154a;
        float f11 = cVar.f10177b;
        b.c cVar2 = dVar.f10155b;
        float fB = k4.a.b(f11, cVar2.f10177b, cVar.f10176a, cVar2.f10176a, f10);
        if (dVar.f10155b != this.f10139h.d() && dVar.f10154a != this.f10139h.k()) {
            return fB;
        }
        b.c cVar3 = dVar.f10155b;
        return fB + ((f10 - cVar3.f10176a) * (1.0f - cVar3.f10178c));
    }

    public final float y(int i10) {
        return s(R() - this.f10132a, this.f10139h.g() * i10);
    }

    public final int z(RecyclerView.y yVar, com.google.android.material.carousel.c cVar) {
        boolean zX = X();
        com.google.android.material.carousel.b bVarL = zX ? cVar.l() : cVar.h();
        b.c cVarB = zX ? bVarL.b() : bVarL.i();
        int iB = (int) (((((yVar.b() - 1) * bVarL.g()) * (zX ? -1.0f : 1.0f)) - (cVarB.f10176a - R())) + (((zX ? -1 : 1) * cVarB.f10179d) / 2.0f));
        return zX ? Math.min(0, iB) : Math.max(0, iB);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int i10) {
        this.f10135d = false;
        this.f10136e = new c();
        this.f10140i = 0;
        this.f10143l = new View.OnLayoutChangeListener() { // from class: r4.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.l(this.f24167a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f10145n = -1;
        this.f10146o = 0;
        j0(carouselStrategy);
        setOrientation(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f10135d = false;
        this.f10136e = new c();
        this.f10140i = 0;
        this.f10143l = new View.OnLayoutChangeListener() { // from class: r4.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.l(this.f24167a, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f10145n = -1;
        this.f10146o = 0;
        j0(new f());
        i0(context, attributeSet);
    }
}
