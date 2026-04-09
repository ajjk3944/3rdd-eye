package androidx.recyclerview.widget;

import A2.C0117e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5284a;

    /* renamed from: b, reason: collision with root package name */
    public int f5285b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5286c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f5287d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f5288e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f5289f;

    /* renamed from: g, reason: collision with root package name */
    public B3.u f5290g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f5291h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i3) {
        super(context, attributeSet, i, i3);
        this.f5284a = false;
        this.f5285b = -1;
        this.f5288e = new SparseIntArray();
        this.f5289f = new SparseIntArray();
        this.f5290g = new r(2, false);
        this.f5291h = new Rect();
        y(Q.getProperties(context, attributeSet, i, i3).f5301b);
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean checkLayoutParams(S s5) {
        return s5 instanceof C0321s;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(d0 d0Var, C0325w c0325w, O o5) {
        int i;
        int iO = this.f5285b;
        for (int i3 = 0; i3 < this.f5285b && (i = c0325w.f5622d) >= 0 && i < d0Var.b() && iO > 0; i3++) {
            int i6 = c0325w.f5622d;
            ((C0318o) o5).a(i6, Math.max(0, c0325w.f5625g));
            iO -= this.f5290g.o(i6);
            c0325w.f5622d += c0325w.f5623e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(X x6, d0 d0Var, boolean z6, boolean z7) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i3 = 1;
        if (z7) {
            childCount = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iB = d0Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && v(position, x6, d0Var) == 0) {
                if (((S) childAt.getLayoutParams()).f5377a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final S generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C0321s(-2, -1) : new C0321s(-1, -2);
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateLayoutParams(Context context, AttributeSet attributeSet) {
        C0321s c0321s = new C0321s(context, attributeSet);
        c0321s.f5594e = -1;
        c0321s.f5595f = 0;
        return c0321s;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int getColumnCountForAccessibility(X x6, d0 d0Var) {
        if (this.mOrientation == 1) {
            return this.f5285b;
        }
        if (d0Var.b() < 1) {
            return 0;
        }
        return u(d0Var.b() - 1, x6, d0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int getRowCountForAccessibility(X x6, d0 d0Var) {
        if (this.mOrientation == 0) {
            return this.f5285b;
        }
        if (d0Var.b() < 1) {
            return 0;
        }
        return u(d0Var.b() - 1, x6, d0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(X x6, d0 d0Var, C0325w c0325w, C0324v c0324v) {
        int i;
        int i3;
        int i6;
        int iD;
        int paddingLeft;
        int paddingTop;
        int iD2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z6;
        int i7;
        View viewB;
        int iJ = this.mOrientationHelper.j();
        boolean z7 = iJ != 1073741824;
        int i8 = getChildCount() > 0 ? this.f5286c[this.f5285b] : 0;
        if (z7) {
            z();
        }
        boolean z8 = c0325w.f5623e == 1;
        int iV = this.f5285b;
        if (!z8) {
            iV = v(c0325w.f5622d, x6, d0Var) + w(c0325w.f5622d, x6, d0Var);
        }
        int i9 = 0;
        while (i9 < this.f5285b && (i7 = c0325w.f5622d) >= 0 && i7 < d0Var.b() && iV > 0) {
            int i10 = c0325w.f5622d;
            int iW = w(i10, x6, d0Var);
            if (iW > this.f5285b) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i10);
                sb.append(" requires ");
                sb.append(iW);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC2763b.d(this.f5285b, " spans.", sb));
            }
            iV -= iW;
            if (iV < 0 || (viewB = c0325w.b(x6)) == null) {
                break;
            }
            this.f5287d[i9] = viewB;
            i9++;
        }
        if (i9 == 0) {
            c0324v.f5616b = true;
            return;
        }
        if (z8) {
            i6 = 1;
            i3 = i9;
            i = 0;
        } else {
            i = i9 - 1;
            i3 = -1;
            i6 = -1;
        }
        int i11 = 0;
        while (i != i3) {
            View view = this.f5287d[i];
            C0321s c0321s = (C0321s) view.getLayoutParams();
            int iW2 = w(getPosition(view), x6, d0Var);
            c0321s.f5595f = iW2;
            c0321s.f5594e = i11;
            i11 += iW2;
            i += i6;
        }
        float f2 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            View view2 = this.f5287d[i13];
            if (c0325w.f5628k != null) {
                z6 = false;
                if (z8) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z8) {
                addView(view2);
                z6 = false;
            } else {
                z6 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f5291h);
            x(view2, iJ, z6);
            int iC = this.mOrientationHelper.c(view2);
            if (iC > i12) {
                i12 = iC;
            }
            float fD = (this.mOrientationHelper.d(view2) * 1.0f) / ((C0321s) view2.getLayoutParams()).f5595f;
            if (fD > f2) {
                f2 = fD;
            }
        }
        if (z7) {
            r(Math.max(Math.round(f2 * this.f5285b), i8));
            i12 = 0;
            for (int i14 = 0; i14 < i9; i14++) {
                View view3 = this.f5287d[i14];
                x(view3, 1073741824, true);
                int iC2 = this.mOrientationHelper.c(view3);
                if (iC2 > i12) {
                    i12 = iC2;
                }
            }
        }
        for (int i15 = 0; i15 < i9; i15++) {
            View view4 = this.f5287d[i15];
            if (this.mOrientationHelper.c(view4) != i12) {
                C0321s c0321s2 = (C0321s) view4.getLayoutParams();
                Rect rect = c0321s2.f5378b;
                int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0321s2).topMargin + ((ViewGroup.MarginLayoutParams) c0321s2).bottomMargin;
                int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0321s2).leftMargin + ((ViewGroup.MarginLayoutParams) c0321s2).rightMargin;
                int iT = t(c0321s2.f5594e, c0321s2.f5595f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = Q.getChildMeasureSpec(iT, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c0321s2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    childMeasureSpec = Q.getChildMeasureSpec(iT, 1073741824, i16, ((ViewGroup.MarginLayoutParams) c0321s2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (S) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        c0324v.f5615a = i12;
        if (this.mOrientation != 1) {
            if (c0325w.f5624f == -1) {
                int i18 = c0325w.f5620b;
                paddingLeft = i18 - i12;
                iD = i18;
            } else {
                int i19 = c0325w.f5620b;
                iD = i19 + i12;
                paddingLeft = i19;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (c0325w.f5624f == -1) {
            iD2 = c0325w.f5620b;
            paddingTop = iD2 - i12;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i20 = c0325w.f5620b;
            paddingTop = i20;
            iD = 0;
            iD2 = i20 + i12;
            paddingLeft = 0;
        }
        for (int i21 = 0; i21 < i9; i21++) {
            View view5 = this.f5287d[i21];
            C0321s c0321s3 = (C0321s) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f5286c[c0321s3.f5594e];
                iD2 = this.mOrientationHelper.d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iD = this.f5286c[this.f5285b - c0321s3.f5594e] + getPaddingLeft();
                paddingLeft = iD - this.mOrientationHelper.d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f5286c[c0321s3.f5594e];
                iD = this.mOrientationHelper.d(view5) + paddingLeft;
            }
            int i22 = iD;
            int i23 = paddingLeft;
            int i24 = iD2;
            layoutDecoratedWithMargins(view5, i23, paddingTop, i22, i24);
            paddingLeft = i23;
            iD = i22;
            iD2 = i24;
            if (c0321s3.f5377a.isRemoved() || c0321s3.f5377a.isUpdated()) {
                c0324v.f5617c = true;
            }
            c0324v.f5618d = view5.hasFocusable() | c0324v.f5618d;
        }
        Arrays.fill(this.f5287d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(X x6, d0 d0Var, C0323u c0323u, int i) {
        super.onAnchorReady(x6, d0Var, c0323u, i);
        z();
        if (d0Var.b() > 0 && !d0Var.f5448g) {
            boolean z6 = i == 1;
            int iV = v(c0323u.f5611b, x6, d0Var);
            if (z6) {
                while (iV > 0) {
                    int i3 = c0323u.f5611b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i6 = i3 - 1;
                    c0323u.f5611b = i6;
                    iV = v(i6, x6, d0Var);
                }
            } else {
                int iB = d0Var.b() - 1;
                int i7 = c0323u.f5611b;
                while (i7 < iB) {
                    int i8 = i7 + 1;
                    int iV2 = v(i8, x6, d0Var);
                    if (iV2 <= iV) {
                        break;
                    }
                    i7 = i8;
                    iV = iV2;
                }
                c0323u.f5611b = i7;
            }
        }
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.X r26, androidx.recyclerview.widget.d0 r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onInitializeAccessibilityNodeInfoForItem(X x6, d0 d0Var, View view, S.d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0321s)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        C0321s c0321s = (C0321s) layoutParams;
        int iU = u(c0321s.f5377a.getLayoutPosition(), x6, d0Var);
        if (this.mOrientation == 0) {
            dVar.j(C0117e.w(false, false, c0321s.f5594e, c0321s.f5595f, iU, 1));
        } else {
            dVar.j(C0117e.w(false, false, iU, 1, c0321s.f5594e, c0321s.f5595f));
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i3) {
        this.f5290g.p();
        ((SparseIntArray) this.f5290g.f663b).clear();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f5290g.p();
        ((SparseIntArray) this.f5290g.f663b).clear();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i3, int i6) {
        this.f5290g.p();
        ((SparseIntArray) this.f5290g.f663b).clear();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i3) {
        this.f5290g.p();
        ((SparseIntArray) this.f5290g.f663b).clear();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i3, Object obj) {
        this.f5290g.p();
        ((SparseIntArray) this.f5290g.f663b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final void onLayoutChildren(X x6, d0 d0Var) {
        boolean z6 = d0Var.f5448g;
        SparseIntArray sparseIntArray = this.f5289f;
        SparseIntArray sparseIntArray2 = this.f5288e;
        if (z6) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0321s c0321s = (C0321s) getChildAt(i).getLayoutParams();
                int layoutPosition = c0321s.f5377a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c0321s.f5595f);
                sparseIntArray.put(layoutPosition, c0321s.f5594e);
            }
        }
        super.onLayoutChildren(x6, d0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final void onLayoutCompleted(d0 d0Var) {
        super.onLayoutCompleted(d0Var);
        this.f5284a = false;
    }

    public final void r(int i) {
        int i3;
        int[] iArr = this.f5286c;
        int i6 = this.f5285b;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i / i6;
        int i9 = i % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i3 = i8;
            } else {
                i3 = i8 + 1;
                i7 -= i6;
            }
            i10 += i3;
            iArr[i11] = i10;
        }
        this.f5286c = iArr;
    }

    public final void s() {
        View[] viewArr = this.f5287d;
        if (viewArr == null || viewArr.length != this.f5285b) {
            this.f5287d = new View[this.f5285b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final int scrollHorizontallyBy(int i, X x6, d0 d0Var) {
        z();
        s();
        return super.scrollHorizontallyBy(i, x6, d0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final int scrollVerticallyBy(int i, X x6, d0 d0Var) {
        z();
        s();
        return super.scrollVerticallyBy(i, x6, d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void setMeasuredDimension(Rect rect, int i, int i3) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f5286c == null) {
            super.setMeasuredDimension(rect, i, i3);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = Q.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f5286c;
            iChooseSize = Q.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = Q.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f5286c;
            iChooseSize2 = Q.chooseSize(i3, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f5284a;
    }

    public final int t(int i, int i3) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f5286c;
            return iArr[i3 + i] - iArr[i];
        }
        int[] iArr2 = this.f5286c;
        int i6 = this.f5285b;
        return iArr2[i6 - i] - iArr2[(i6 - i) - i3];
    }

    public final int u(int i, X x6, d0 d0Var) {
        if (!d0Var.f5448g) {
            return this.f5290g.m(i, this.f5285b);
        }
        int iB = x6.b(i);
        if (iB != -1) {
            return this.f5290g.m(iB, this.f5285b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int v(int i, X x6, d0 d0Var) {
        if (!d0Var.f5448g) {
            return this.f5290g.n(i, this.f5285b);
        }
        int i3 = this.f5289f.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = x6.b(i);
        if (iB != -1) {
            return this.f5290g.n(iB, this.f5285b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int w(int i, X x6, d0 d0Var) {
        if (!d0Var.f5448g) {
            return this.f5290g.o(i);
        }
        int i3 = this.f5288e.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = x6.b(i);
        if (iB != -1) {
            return this.f5290g.o(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void x(View view, int i, boolean z6) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C0321s c0321s = (C0321s) view.getLayoutParams();
        Rect rect = c0321s.f5378b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0321s).topMargin + ((ViewGroup.MarginLayoutParams) c0321s).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0321s).leftMargin + ((ViewGroup.MarginLayoutParams) c0321s).rightMargin;
        int iT = t(c0321s.f5594e, c0321s.f5595f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = Q.getChildMeasureSpec(iT, i, i6, ((ViewGroup.MarginLayoutParams) c0321s).width, false);
            childMeasureSpec = Q.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i3, ((ViewGroup.MarginLayoutParams) c0321s).height, true);
        } else {
            int childMeasureSpec3 = Q.getChildMeasureSpec(iT, i, i3, ((ViewGroup.MarginLayoutParams) c0321s).height, false);
            int childMeasureSpec4 = Q.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i6, ((ViewGroup.MarginLayoutParams) c0321s).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        S s5 = (S) view.getLayoutParams();
        if (z6 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, s5) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, s5)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void y(int i) {
        if (i == this.f5285b) {
            return;
        }
        this.f5284a = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Span count should be at least 1. Provided "));
        }
        this.f5285b = i;
        this.f5290g.p();
        requestLayout();
    }

    public final void z() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0321s c0321s = new C0321s((ViewGroup.MarginLayoutParams) layoutParams);
            c0321s.f5594e = -1;
            c0321s.f5595f = 0;
            return c0321s;
        }
        C0321s c0321s2 = new C0321s(layoutParams);
        c0321s2.f5594e = -1;
        c0321s2.f5595f = 0;
        return c0321s2;
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.f5284a = false;
        this.f5285b = -1;
        this.f5288e = new SparseIntArray();
        this.f5289f = new SparseIntArray();
        this.f5290g = new r(2, false);
        this.f5291h = new Rect();
        y(i);
    }
}
