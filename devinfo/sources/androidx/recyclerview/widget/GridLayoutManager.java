package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: l, reason: collision with root package name */
    public static final Set f1209l = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: a, reason: collision with root package name */
    public boolean f1210a;

    /* renamed from: b, reason: collision with root package name */
    public int f1211b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1212c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f1213d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f1214e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f1215f;
    public d0 g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1216h;

    /* renamed from: i, reason: collision with root package name */
    public int f1217i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f1218k;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i10) {
        super(context, attributeSet, i4, i10);
        this.f1210a = false;
        this.f1211b = -1;
        this.f1214e = new SparseIntArray();
        this.f1215f = new SparseIntArray();
        this.g = new b0(0);
        this.f1216h = new Rect();
        this.f1217i = -1;
        this.j = -1;
        this.f1218k = -1;
        C(f1.getProperties(context, attributeSet, i4, i10).f1342b);
    }

    public final int A(int i4, m1 m1Var, t1 t1Var) {
        if (!t1Var.g) {
            return this.g.n(i4);
        }
        int i10 = this.f1214e.get(i4, -1);
        if (i10 != -1) {
            return i10;
        }
        int iB = m1Var.b(i4);
        if (iB != -1) {
            return this.g.n(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    public final void B(View view, int i4, boolean z3) {
        int childMeasureSpec;
        int childMeasureSpec2;
        c0 c0Var = (c0) view.getLayoutParams();
        Rect rect = c0Var.f1375b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0Var).topMargin + ((ViewGroup.MarginLayoutParams) c0Var).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0Var).leftMargin + ((ViewGroup.MarginLayoutParams) c0Var).rightMargin;
        int iX = x(c0Var.f1312e, c0Var.f1313f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = f1.getChildMeasureSpec(iX, i4, i11, ((ViewGroup.MarginLayoutParams) c0Var).width, false);
            childMeasureSpec = f1.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i10, ((ViewGroup.MarginLayoutParams) c0Var).height, true);
        } else {
            int childMeasureSpec3 = f1.getChildMeasureSpec(iX, i4, i10, ((ViewGroup.MarginLayoutParams) c0Var).height, false);
            int childMeasureSpec4 = f1.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i11, ((ViewGroup.MarginLayoutParams) c0Var).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        g1 g1Var = (g1) view.getLayoutParams();
        if (z3 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, g1Var) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, g1Var)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void C(int i4) {
        if (i4 == this.f1211b) {
            return;
        }
        this.f1210a = true;
        if (i4 < 1) {
            throw new IllegalArgumentException(je.u.r(i4, "Span count should be at least 1. Provided "));
        }
        this.f1211b = i4;
        this.g.p();
        requestLayout();
    }

    public final void D() {
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

    @Override // androidx.recyclerview.widget.f1
    public final boolean checkLayoutParams(g1 g1Var) {
        return g1Var instanceof c0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(t1 t1Var, h0 h0Var, d1 d1Var) {
        int i4;
        int iN = this.f1211b;
        for (int i10 = 0; i10 < this.f1211b && (i4 = h0Var.f1393d) >= 0 && i4 < t1Var.b() && iN > 0; i10++) {
            int i11 = h0Var.f1393d;
            ((y) d1Var).a(i11, Math.max(0, h0Var.g));
            iN -= this.g.n(i11);
            h0Var.f1393d += h0Var.f1394e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(m1 m1Var, t1 t1Var, boolean z3, boolean z10) {
        int i4;
        int childCount;
        int childCount2 = getChildCount();
        int i10 = 1;
        if (z10) {
            childCount = getChildCount() - 1;
            i4 = -1;
            i10 = -1;
        } else {
            i4 = childCount2;
            childCount = 0;
        }
        int iB = t1Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i4) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && z(position, m1Var, t1Var) == 0) {
                if (((g1) childAt.getLayoutParams()).f1374a.isRemoved()) {
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
            childCount += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final g1 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new c0(-2, -1) : new c0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        c0 c0Var = new c0(context, attributeSet);
        c0Var.f1312e = -1;
        c0Var.f1313f = 0;
        return c0Var;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int getColumnCountForAccessibility(m1 m1Var, t1 t1Var) {
        if (this.mOrientation == 1) {
            return Math.min(this.f1211b, getItemCount());
        }
        if (t1Var.b() < 1) {
            return 0;
        }
        return y(t1Var.b() - 1, m1Var, t1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int getRowCountForAccessibility(m1 m1Var, t1 t1Var) {
        if (this.mOrientation == 0) {
            return Math.min(this.f1211b, getItemCount());
        }
        if (t1Var.b() < 1) {
            return 0;
        }
        return y(t1Var.b() - 1, m1Var, t1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(m1 m1Var, t1 t1Var, h0 h0Var, g0 g0Var) {
        int i4;
        int i10;
        int i11;
        int iD;
        int paddingLeft;
        int paddingTop;
        int iD2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z3;
        int i12;
        View viewB;
        int iJ = this.mOrientationHelper.j();
        boolean z10 = iJ != 1073741824;
        int i13 = getChildCount() > 0 ? this.f1212c[this.f1211b] : 0;
        if (z10) {
            D();
        }
        boolean z11 = h0Var.f1394e == 1;
        int iZ = this.f1211b;
        if (!z11) {
            iZ = z(h0Var.f1393d, m1Var, t1Var) + A(h0Var.f1393d, m1Var, t1Var);
        }
        int i14 = 0;
        while (i14 < this.f1211b && (i12 = h0Var.f1393d) >= 0 && i12 < t1Var.b() && iZ > 0) {
            int i15 = h0Var.f1393d;
            int iA = A(i15, m1Var, t1Var);
            if (iA > this.f1211b) {
                throw new IllegalArgumentException(r5.c.j(this.f1211b, " spans.", r5.c.n(i15, "Item at position ", " requires ", iA, " spans but GridLayoutManager has only ")));
            }
            iZ -= iA;
            if (iZ < 0 || (viewB = h0Var.b(m1Var)) == null) {
                break;
            }
            this.f1213d[i14] = viewB;
            i14++;
        }
        if (i14 == 0) {
            g0Var.f1371b = true;
            return;
        }
        if (z11) {
            i11 = 1;
            i10 = i14;
            i4 = 0;
        } else {
            i4 = i14 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i16 = 0;
        while (i4 != i10) {
            View view = this.f1213d[i4];
            c0 c0Var = (c0) view.getLayoutParams();
            int iA2 = A(getPosition(view), m1Var, t1Var);
            c0Var.f1313f = iA2;
            c0Var.f1312e = i16;
            i16 += iA2;
            i4 += i11;
        }
        float f10 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.f1213d[i18];
            if (h0Var.f1398k != null) {
                z3 = false;
                if (z11) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z11) {
                addView(view2);
                z3 = false;
            } else {
                z3 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f1216h);
            B(view2, iJ, z3);
            int iC = this.mOrientationHelper.c(view2);
            if (iC > i17) {
                i17 = iC;
            }
            float fD = (this.mOrientationHelper.d(view2) * 1.0f) / ((c0) view2.getLayoutParams()).f1313f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            r(Math.max(Math.round(f10 * this.f1211b), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.f1213d[i19];
                B(view3, 1073741824, true);
                int iC2 = this.mOrientationHelper.c(view3);
                if (iC2 > i17) {
                    i17 = iC2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.f1213d[i20];
            if (this.mOrientationHelper.c(view4) != i17) {
                c0 c0Var2 = (c0) view4.getLayoutParams();
                Rect rect = c0Var2.f1375b;
                int i21 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0Var2).topMargin + ((ViewGroup.MarginLayoutParams) c0Var2).bottomMargin;
                int i22 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) c0Var2).rightMargin;
                int iX = x(c0Var2.f1312e, c0Var2.f1313f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = f1.getChildMeasureSpec(iX, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c0Var2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    childMeasureSpec = f1.getChildMeasureSpec(iX, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c0Var2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (g1) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        g0Var.f1370a = i17;
        if (this.mOrientation != 1) {
            if (h0Var.f1395f == -1) {
                int i23 = h0Var.f1391b;
                paddingLeft = i23 - i17;
                iD = i23;
            } else {
                int i24 = h0Var.f1391b;
                iD = i24 + i17;
                paddingLeft = i24;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (h0Var.f1395f == -1) {
            iD2 = h0Var.f1391b;
            paddingTop = iD2 - i17;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i25 = h0Var.f1391b;
            paddingTop = i25;
            iD = 0;
            iD2 = i25 + i17;
            paddingLeft = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.f1213d[i26];
            c0 c0Var3 = (c0) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f1212c[c0Var3.f1312e];
                iD2 = this.mOrientationHelper.d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iD = this.f1212c[this.f1211b - c0Var3.f1312e] + getPaddingLeft();
                paddingLeft = iD - this.mOrientationHelper.d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f1212c[c0Var3.f1312e];
                iD = this.mOrientationHelper.d(view5) + paddingLeft;
            }
            int i27 = iD;
            int i28 = paddingLeft;
            int i29 = iD2;
            layoutDecoratedWithMargins(view5, i28, paddingTop, i27, i29);
            paddingLeft = i28;
            iD = i27;
            iD2 = i29;
            if (c0Var3.f1374a.isRemoved() || c0Var3.f1374a.isUpdated()) {
                g0Var.f1372c = true;
            }
            g0Var.f1373d = view5.hasFocusable() | g0Var.f1373d;
        }
        Arrays.fill(this.f1213d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(m1 m1Var, t1 t1Var, f0 f0Var, int i4) {
        super.onAnchorReady(m1Var, t1Var, f0Var, i4);
        D();
        if (t1Var.b() > 0 && !t1Var.g) {
            boolean z3 = i4 == 1;
            int iZ = z(f0Var.f1353b, m1Var, t1Var);
            if (z3) {
                while (iZ > 0) {
                    int i10 = f0Var.f1353b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    f0Var.f1353b = i11;
                    iZ = z(i11, m1Var, t1Var);
                }
            } else {
                int iB = t1Var.b() - 1;
                int i12 = f0Var.f1353b;
                while (i12 < iB) {
                    int i13 = i12 + 1;
                    int iZ2 = z(i13, m1Var, t1Var);
                    if (iZ2 <= iZ) {
                        break;
                    }
                    i12 = i13;
                    iZ = iZ2;
                }
                f0Var.f1353b = i12;
            }
        }
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.m1 r26, androidx.recyclerview.widget.t1 r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final void onInitializeAccessibilityNodeInfo(m1 m1Var, t1 t1Var, f4.f fVar) {
        super.onInitializeAccessibilityNodeInfo(m1Var, t1Var, fVar);
        fVar.k(GridView.class.getName());
        t0 t0Var = this.mRecyclerView.f1241m;
        if (t0Var == null || t0Var.getItemCount() <= 1) {
            return;
        }
        fVar.b(f4.c.f23644s);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onInitializeAccessibilityNodeInfoForItem(m1 m1Var, t1 t1Var, View view, f4.f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c0)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, fVar);
            return;
        }
        c0 c0Var = (c0) layoutParams;
        int iY = y(c0Var.f1374a.getLayoutPosition(), m1Var, t1Var);
        if (this.mOrientation == 0) {
            fVar.m(f4.e.a(c0Var.f1312e, c0Var.f1313f, iY, 1, false));
        } else {
            fVar.m(f4.e.a(iY, 1, c0Var.f1312e, c0Var.f1313f, false));
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsAdded(RecyclerView recyclerView, int i4, int i10) {
        this.g.p();
        ((SparseIntArray) this.g.f1326b).clear();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.p();
        ((SparseIntArray) this.g.f1326b).clear();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsMoved(RecyclerView recyclerView, int i4, int i10, int i11) {
        this.g.p();
        ((SparseIntArray) this.g.f1326b).clear();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsRemoved(RecyclerView recyclerView, int i4, int i10) {
        this.g.p();
        ((SparseIntArray) this.g.f1326b).clear();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsUpdated(RecyclerView recyclerView, int i4, int i10, Object obj) {
        this.g.p();
        ((SparseIntArray) this.g.f1326b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final void onLayoutChildren(m1 m1Var, t1 t1Var) {
        boolean z3 = t1Var.g;
        SparseIntArray sparseIntArray = this.f1215f;
        SparseIntArray sparseIntArray2 = this.f1214e;
        if (z3) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c0 c0Var = (c0) getChildAt(i4).getLayoutParams();
                int layoutPosition = c0Var.f1374a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c0Var.f1313f);
                sparseIntArray.put(layoutPosition, c0Var.f1312e);
            }
        }
        super.onLayoutChildren(m1Var, t1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final void onLayoutCompleted(t1 t1Var) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(t1Var);
        this.f1210a = false;
        int i4 = this.f1217i;
        if (i4 == -1 || (viewFindViewByPosition = findViewByPosition(i4)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f1217i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAccessibilityAction(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final void r(int i4) {
        int i10;
        int[] iArr = this.f1212c;
        int i11 = this.f1211b;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i4 / i11;
        int i14 = i4 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f1212c = iArr;
    }

    public final void s() {
        View[] viewArr = this.f1213d;
        if (viewArr == null || viewArr.length != this.f1211b) {
            this.f1213d = new View[this.f1211b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final int scrollHorizontallyBy(int i4, m1 m1Var, t1 t1Var) {
        D();
        s();
        return super.scrollHorizontallyBy(i4, m1Var, t1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final int scrollVerticallyBy(int i4, m1 m1Var, t1 t1Var) {
        D();
        s();
        return super.scrollVerticallyBy(i4, m1Var, t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void setMeasuredDimension(Rect rect, int i4, int i10) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f1212c == null) {
            super.setMeasuredDimension(rect, i4, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = f1.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f1212c;
            iChooseSize = f1.chooseSize(i4, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = f1.chooseSize(i4, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f1212c;
            iChooseSize2 = f1.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f1210a;
    }

    public final int t(int i4) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return y(i4, recyclerView.f1223c, recyclerView.f1233h0);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return z(i4, recyclerView2.f1223c, recyclerView2.f1233h0);
    }

    public final int u(int i4) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return y(i4, recyclerView.f1223c, recyclerView.f1233h0);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return z(i4, recyclerView2.f1223c, recyclerView2.f1233h0);
    }

    public final HashSet v(int i4) {
        return w(u(i4), i4);
    }

    public final HashSet w(int i4, int i10) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iA = A(i10, recyclerView.f1223c, recyclerView.f1233h0);
        for (int i11 = i4; i11 < i4 + iA; i11++) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    public final int x(int i4, int i10) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f1212c;
            return iArr[i10 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f1212c;
        int i11 = this.f1211b;
        return iArr2[i11 - i4] - iArr2[(i11 - i4) - i10];
    }

    public final int y(int i4, m1 m1Var, t1 t1Var) {
        if (!t1Var.g) {
            return this.g.l(i4, this.f1211b);
        }
        int iB = m1Var.b(i4);
        if (iB != -1) {
            return this.g.l(iB, this.f1211b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public final int z(int i4, m1 m1Var, t1 t1Var) {
        if (!t1Var.g) {
            return this.g.m(i4, this.f1211b);
        }
        int i10 = this.f1215f.get(i4, -1);
        if (i10 != -1) {
            return i10;
        }
        int iB = m1Var.b(i4);
        if (iB != -1) {
            return this.g.m(iB, this.f1211b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c0 c0Var = new c0((ViewGroup.MarginLayoutParams) layoutParams);
            c0Var.f1312e = -1;
            c0Var.f1313f = 0;
            return c0Var;
        }
        c0 c0Var2 = new c0(layoutParams);
        c0Var2.f1312e = -1;
        c0Var2.f1313f = 0;
        return c0Var2;
    }

    public GridLayoutManager(int i4, int i10) {
        super(1);
        this.f1210a = false;
        this.f1211b = -1;
        this.f1214e = new SparseIntArray();
        this.f1215f = new SparseIntArray();
        this.g = new b0(0);
        this.f1216h = new Rect();
        this.f1217i = -1;
        this.j = -1;
        this.f1218k = -1;
        C(i4);
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.f1210a = false;
        this.f1211b = -1;
        this.f1214e = new SparseIntArray();
        this.f1215f = new SparseIntArray();
        this.g = new b0(0);
        this.f1216h = new Rect();
        this.f1217i = -1;
        this.j = -1;
        this.f1218k = -1;
        C(i4);
    }
}
