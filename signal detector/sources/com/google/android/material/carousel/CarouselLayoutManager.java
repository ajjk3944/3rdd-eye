package com.google.android.material.carousel;

import A3.g;
import C0.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.X;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.d0;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.material.datepicker.s;
import d3.AbstractC2266a;
import e0.C2296d;
import n3.C2688a;
import n3.b;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends Q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2296d f18212a;

    /* renamed from: b, reason: collision with root package name */
    public q f18213b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnLayoutChangeListener f18214c;

    public CarouselLayoutManager() {
        C2296d c2296d = new C2296d();
        new C2688a();
        this.f18214c = new g(1, this);
        this.f18212a = c2296d;
        requestLayout();
        setOrientation(0);
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean canScrollHorizontally() {
        return e();
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean canScrollVertically() {
        return !e();
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollExtent(d0 d0Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollOffset(d0 d0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollRange(d0 d0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.b0
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollExtent(d0 d0Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollOffset(d0 d0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollRange(d0 d0Var) {
        return 0;
    }

    public final float d(float f2, float f5) {
        return f() ? f2 - f5 : f2 + f5;
    }

    public final boolean e() {
        return this.f18213b.f1097b == 0;
    }

    public final boolean f() {
        return e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateDefaultLayoutParams() {
        return new S(-2, -2);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void measureChildWithMargins(View view, int i, int i3) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onAttachedToWindow(RecyclerView recyclerView) throws Resources.NotFoundException {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        C2296d c2296d = this.f18212a;
        float dimension = c2296d.f19867a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c2296d.f19867a = dimension;
        float dimension2 = c2296d.f19868b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c2296d.f19868b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f18214c);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDetachedFromWindow(RecyclerView recyclerView, X x6) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f18214c);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.X r6, androidx.recyclerview.widget.d0 r7) {
        /*
            r3 = this;
            int r6 = r3.getChildCount()
            if (r6 != 0) goto L8
            goto L96
        L8:
            C0.q r6 = r3.f18213b
            int r6 = r6.f1097b
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.f()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.f()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = r3.getPosition(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.getChildAt(r6)
            int r4 = r3.getPosition(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.getItemCount()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            C0.q r4 = r3.f18213b
            r4.f()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.f()
            if (r4 == 0) goto L86
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        L8b:
            int r4 = r3.getPosition(r4)
            int r5 = r3.getItemCount()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.getChildCount()
            int r4 = r4 - r1
            android.view.View r4 = r3.getChildAt(r4)
            int r4 = r3.getPosition(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.getItemCount()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            C0.q r4 = r3.f18213b
            r4.f()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.f()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i3) {
        super.onItemsAdded(recyclerView, i, i3);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i3) {
        super.onItemsRemoved(recyclerView, i, i3);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onLayoutChildren(X x6, d0 d0Var) {
        if (d0Var.b() > 0) {
            if ((e() ? getWidth() : getHeight()) > 0.0f) {
                f();
                measureChildWithMargins(x6.d(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(x6);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onLayoutCompleted(d0 d0Var) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
        return false;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int scrollHorizontallyBy(int i, X x6, d0 d0Var) {
        if (!e() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(x6.d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.Q
    public final int scrollVerticallyBy(int i, X x6, d0 d0Var) {
        if (!canScrollVertically() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(x6.d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i) {
        b bVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        q qVar = this.f18213b;
        if (qVar == null || i != qVar.f1097b) {
            if (i == 0) {
                bVar = new b(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                bVar = new b(this, 0);
            }
            this.f18213b = bVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void smoothScrollToPosition(RecyclerView recyclerView, d0 d0Var, int i) {
        s sVar = new s(this, recyclerView.getContext());
        sVar.setTargetPosition(i);
        startSmoothScroll(sVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i3) {
        new C2688a();
        this.f18214c = new g(1, this);
        this.f18212a = new C2296d();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19753g);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
