package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.r1;
import androidx.recyclerview.widget.t1;
import com.google.android.gms.internal.ads.mv0;
import com.liuzh.deviceinfo.R;
import ic.a;
import ig.l;
import je.u;
import qc.b;
import qc.c;
import qc.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CarouselLayoutManager extends f1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final e f20409a;

    /* renamed from: b, reason: collision with root package name */
    public mv0 f20410b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnLayoutChangeListener f20411c;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f20411c = new View.OnLayoutChangeListener() { // from class: qc.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                if (i11 - i4 == i15 - i13 && i12 - i10 == i16 - i14) {
                    return;
                }
                view.post(new l(13, this.f32233a));
            }
        };
        this.f20409a = eVar;
        requestLayout();
        setOrientation(0);
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean canScrollHorizontally() {
        return e();
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean canScrollVertically() {
        return !e();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollExtent(t1 t1Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollOffset(t1 t1Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollRange(t1 t1Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.r1
    public final PointF computeScrollVectorForPosition(int i4) {
        return null;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollExtent(t1 t1Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollOffset(t1 t1Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollRange(t1 t1Var) {
        return 0;
    }

    public final float d(float f10, float f11) {
        return f() ? f10 - f11 : f10 + f11;
    }

    public final boolean e() {
        return this.f20410b.f14029b == 0;
    }

    public final boolean f() {
        return e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateDefaultLayoutParams() {
        return new g1(-2, -2);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f1
    public final void measureChildWithMargins(View view, int i4, int i10) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onAttachedToWindow(RecyclerView recyclerView) throws Resources.NotFoundException {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        e eVar = this.f20409a;
        float dimension = eVar.f32238a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f32238a = dimension;
        float dimension2 = eVar.f32239b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f32239b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f20411c);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onDetachedFromWindow(RecyclerView recyclerView, m1 m1Var) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f20411c);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.m1 r6, androidx.recyclerview.widget.t1 r7) {
        /*
            r3 = this;
            int r6 = r3.getChildCount()
            if (r6 != 0) goto L8
            goto L96
        L8:
            com.google.android.gms.internal.ads.mv0 r6 = r3.f20410b
            int r6 = r6.f14029b
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
            com.google.android.gms.internal.ads.mv0 r4 = r3.f20410b
            r4.d()
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
            com.google.android.gms.internal.ads.mv0 r4 = r3.f20410b
            r4.d()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsAdded(RecyclerView recyclerView, int i4, int i10) {
        super.onItemsAdded(recyclerView, i4, i10);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsRemoved(RecyclerView recyclerView, int i4, int i10) {
        super.onItemsRemoved(recyclerView, i4, i10);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onLayoutChildren(m1 m1Var, t1 t1Var) {
        if (t1Var.b() > 0) {
            if ((e() ? getWidth() : getHeight()) > 0.0f) {
                f();
                measureChildWithMargins(m1Var.d(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(m1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onLayoutCompleted(t1 t1Var) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int scrollHorizontallyBy(int i4, m1 m1Var, t1 t1Var) {
        if (!e() || getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        measureChildWithMargins(m1Var.d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int scrollVerticallyBy(int i4, m1 m1Var, t1 t1Var) {
        if (!canScrollVertically() || getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        measureChildWithMargins(m1Var.d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i4) {
        c cVar;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(u.r(i4, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        mv0 mv0Var = this.f20410b;
        if (mv0Var == null || i4 != mv0Var.f14029b) {
            if (i4 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f20410b = cVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void smoothScrollToPosition(RecyclerView recyclerView, t1 t1Var, int i4) {
        com.google.android.material.datepicker.u uVar = new com.google.android.material.datepicker.u(this, recyclerView.getContext());
        uVar.setTargetPosition(i4);
        startSmoothScroll(uVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i10) {
        new b();
        this.f20411c = new View.OnLayoutChangeListener() { // from class: qc.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i42, int i102, int i11, int i12, int i13, int i14, int i15, int i16) {
                if (i11 - i42 == i15 - i13 && i12 - i102 == i16 - i14) {
                    return;
                }
                view.post(new l(13, this.f32233a));
            }
        };
        this.f20409a = new e();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f25946e);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void scrollToPosition(int i4) {
    }
}
