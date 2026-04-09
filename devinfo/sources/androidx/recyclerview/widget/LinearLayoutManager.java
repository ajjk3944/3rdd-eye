package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class LinearLayoutManager extends f1 implements r1 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final f0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final g0 mLayoutChunkResult;
    private h0 mLayoutState;
    int mOrientation;
    m0 mOrientationHelper;
    j0 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(int i4) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new f0();
        this.mLayoutChunkResult = new g0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i4);
        setReverseLayout(false);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(t1 t1Var, int[] iArr) {
        int i4;
        int extraLayoutSpace = getExtraLayoutSpace(t1Var);
        if (this.mLayoutState.f1395f == -1) {
            i4 = 0;
        } else {
            i4 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i4;
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i4, int i10, t1 t1Var, d1 d1Var) {
        if (this.mOrientation != 0) {
            i4 = i10;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        ensureLayoutState();
        o(i4 > 0 ? 1 : -1, Math.abs(i4), true, t1Var);
        collectPrefetchPositionsForLayoutState(t1Var, this.mLayoutState, d1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i4, d1 d1Var) {
        boolean z3;
        int i10;
        j0 j0Var = this.mPendingSavedState;
        if (j0Var == null || (i10 = j0Var.f1417a) < 0) {
            n();
            z3 = this.mShouldReverseLayout;
            i10 = this.mPendingScrollPosition;
            if (i10 == -1) {
                i10 = z3 ? i4 - 1 : 0;
            }
        } else {
            z3 = j0Var.f1419c;
        }
        int i11 = z3 ? -1 : 1;
        for (int i12 = 0; i12 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i4; i12++) {
            ((y) d1Var).a(i10, 0);
            i10 += i11;
        }
    }

    public void collectPrefetchPositionsForLayoutState(t1 t1Var, h0 h0Var, d1 d1Var) {
        int i4 = h0Var.f1393d;
        if (i4 < 0 || i4 >= t1Var.b()) {
            return;
        }
        ((y) d1Var).a(i4, Math.max(0, h0Var.g));
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(t1 t1Var) {
        return d(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(t1 t1Var) {
        return e(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(t1 t1Var) {
        return f(t1Var);
    }

    @Override // androidx.recyclerview.widget.r1
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i4) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = (i4 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(t1 t1Var) {
        return d(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(t1 t1Var) {
        return e(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(t1 t1Var) {
        return f(t1Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i4) {
        if (i4 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i4 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i4 == 17) {
            if (this.mOrientation == 0) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i4 == 33) {
            if (this.mOrientation == 1) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i4 == 66) {
            if (this.mOrientation == 0) {
                return 1;
            }
            return INVALID_OFFSET;
        }
        if (i4 == 130 && this.mOrientation == 1) {
            return 1;
        }
        return INVALID_OFFSET;
    }

    public h0 createLayoutState() {
        h0 h0Var = new h0();
        h0Var.f1390a = true;
        h0Var.f1396h = 0;
        h0Var.f1397i = 0;
        h0Var.f1398k = null;
        return h0Var;
    }

    public final int d(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.a(t1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.b(t1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.c(t1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(m1 m1Var, h0 h0Var, t1 t1Var, boolean z3) {
        int i4;
        int i10 = h0Var.f1392c;
        int i11 = h0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                h0Var.g = i11 + i10;
            }
            l(m1Var, h0Var);
        }
        int i12 = h0Var.f1392c + h0Var.f1396h;
        g0 g0Var = this.mLayoutChunkResult;
        while (true) {
            if ((!h0Var.f1399l && i12 <= 0) || (i4 = h0Var.f1393d) < 0 || i4 >= t1Var.b()) {
                break;
            }
            g0Var.f1370a = 0;
            g0Var.f1371b = false;
            g0Var.f1372c = false;
            g0Var.f1373d = false;
            layoutChunk(m1Var, t1Var, h0Var, g0Var);
            if (!g0Var.f1371b) {
                int i13 = h0Var.f1391b;
                int i14 = g0Var.f1370a;
                h0Var.f1391b = (h0Var.f1395f * i14) + i13;
                if (!g0Var.f1372c || h0Var.f1398k != null || !t1Var.g) {
                    h0Var.f1392c -= i14;
                    i12 -= i14;
                }
                int i15 = h0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    h0Var.g = i16;
                    int i17 = h0Var.f1392c;
                    if (i17 < 0) {
                        h0Var.g = i16 + i17;
                    }
                    l(m1Var, h0Var);
                }
                if (z3 && g0Var.f1373d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - h0Var.f1392c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z3, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z3, z10) : findOneVisibleChild(getChildCount() - 1, -1, z3, z10);
    }

    public View findFirstVisibleChildClosestToStart(boolean z3, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z3, z10) : findOneVisibleChild(0, getChildCount(), z3, z10);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i4, int i10) {
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 <= i4 && i10 >= i4) {
            return getChildAt(i4);
        }
        if (this.mOrientationHelper.e(getChildAt(i4)) < this.mOrientationHelper.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i10, i11, i12) : this.mVerticalBoundCheck.a(i4, i10, i11, i12);
    }

    public View findOneVisibleChild(int i4, int i10, boolean z3, boolean z10) {
        ensureLayoutState();
        int i11 = z3 ? 24579 : 320;
        int i12 = z10 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i10, i11, i12) : this.mVerticalBoundCheck.a(i4, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.m1 r17, androidx.recyclerview.widget.t1 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.m0 r7 = r0.mOrientationHelper
            int r7 = r7.k()
            androidx.recyclerview.widget.m0 r8 = r0.mOrientationHelper
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.m0 r14 = r0.mOrientationHelper
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.m0 r15 = r0.mOrientationHelper
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.g1 r13 = (androidx.recyclerview.widget.g1) r13
            androidx.recyclerview.widget.x1 r13 = r13.f1374a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i4 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i4) {
                return childAt;
            }
        }
        return super.findViewByPosition(i4);
    }

    public final int g(int i4, m1 m1Var, t1 t1Var, boolean z3) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i4;
        if (iG2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(-iG2, m1Var, t1Var);
        int i11 = i4 + i10;
        if (!z3 || (iG = this.mOrientationHelper.g() - i11) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(iG);
        return iG + i10;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public g1 generateDefaultLayoutParams() {
        return new g1(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(t1 t1Var) {
        if (t1Var.f1503a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i4, m1 m1Var, t1 t1Var, boolean z3) {
        int iK;
        int iK2 = i4 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(iK2, m1Var, t1Var);
        int i11 = i4 + i10;
        if (!z3 || (iK = i11 - this.mOrientationHelper.k()) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(-iK);
        return i10 - iK;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(m1 m1Var, h0 h0Var) {
        if (!h0Var.f1390a || h0Var.f1399l) {
            return;
        }
        int i4 = h0Var.g;
        int i10 = h0Var.f1397i;
        if (h0Var.f1395f == -1) {
            int childCount = getChildCount();
            if (i4 < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i4) + i10;
            if (this.mShouldReverseLayout) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.n(childAt) < iF) {
                        m(m1Var, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt2 = getChildAt(i13);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.n(childAt2) < iF) {
                    m(m1Var, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i4 < 0) {
            return;
        }
        int i14 = i4 - i10;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt3 = getChildAt(i15);
                if (this.mOrientationHelper.b(childAt3) > i14 || this.mOrientationHelper.m(childAt3) > i14) {
                    m(m1Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = childCount2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View childAt4 = getChildAt(i17);
            if (this.mOrientationHelper.b(childAt4) > i14 || this.mOrientationHelper.m(childAt4) > i14) {
                m(m1Var, i16, i17);
                return;
            }
        }
    }

    public void layoutChunk(m1 m1Var, t1 t1Var, h0 h0Var, g0 g0Var) {
        int i4;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iD;
        int i13;
        int i14;
        View viewB = h0Var.b(m1Var);
        if (viewB == null) {
            g0Var.f1371b = true;
            return;
        }
        g1 g1Var = (g1) viewB.getLayoutParams();
        if (h0Var.f1398k == null) {
            if (this.mShouldReverseLayout == (h0Var.f1395f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (h0Var.f1395f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        g0Var.f1370a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            if (h0Var.f1395f == -1) {
                i14 = h0Var.f1391b;
                i13 = i14 - g0Var.f1370a;
            } else {
                i13 = h0Var.f1391b;
                i14 = g0Var.f1370a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            i10 = i14;
            i4 = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewB) + paddingTop;
            if (h0Var.f1395f == -1) {
                int i16 = h0Var.f1391b;
                i11 = i16 - g0Var.f1370a;
                i4 = i16;
                i10 = iD2;
            } else {
                int i17 = h0Var.f1391b;
                i4 = g0Var.f1370a + i17;
                i10 = iD2;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i11, i12, i4, i10);
        if (g1Var.f1374a.isRemoved() || g1Var.f1374a.isUpdated()) {
            g0Var.f1372c = true;
        }
        g0Var.f1373d = viewB.hasFocusable();
    }

    public final void m(m1 m1Var, int i4, int i10) {
        if (i4 == i10) {
            return;
        }
        if (i10 <= i4) {
            while (i4 > i10) {
                removeAndRecycleViewAt(i4, m1Var);
                i4--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i4; i11--) {
                removeAndRecycleViewAt(i11, m1Var);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i4, int i10, boolean z3, t1 t1Var) {
        int iK;
        this.mLayoutState.f1399l = resolveIsInfinite();
        this.mLayoutState.f1395f = i4;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(t1Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z10 = i4 == 1;
        h0 h0Var = this.mLayoutState;
        int i11 = z10 ? iMax2 : iMax;
        h0Var.f1396h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        h0Var.f1397i = iMax;
        if (z10) {
            h0Var.f1396h = this.mOrientationHelper.h() + i11;
            View viewI = i();
            h0 h0Var2 = this.mLayoutState;
            h0Var2.f1394e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            h0 h0Var3 = this.mLayoutState;
            h0Var2.f1393d = position + h0Var3.f1394e;
            h0Var3.f1391b = this.mOrientationHelper.b(viewI);
            iK = this.mOrientationHelper.b(viewI) - this.mOrientationHelper.g();
        } else {
            View viewJ = j();
            h0 h0Var4 = this.mLayoutState;
            h0Var4.f1396h = this.mOrientationHelper.k() + h0Var4.f1396h;
            h0 h0Var5 = this.mLayoutState;
            h0Var5.f1394e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            h0 h0Var6 = this.mLayoutState;
            h0Var5.f1393d = position2 + h0Var6.f1394e;
            h0Var6.f1391b = this.mOrientationHelper.e(viewJ);
            iK = (-this.mOrientationHelper.e(viewJ)) + this.mOrientationHelper.k();
        }
        h0 h0Var7 = this.mLayoutState;
        h0Var7.f1392c = i10;
        if (z3) {
            h0Var7.f1392c = i10 - iK;
        }
        h0Var7.g = iK;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, m1 m1Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(m1Var);
            m1Var.f1455a.clear();
            m1Var.g();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i4, m1 m1Var, t1 t1Var) {
        int iConvertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, t1Var);
            h0 h0Var = this.mLayoutState;
            h0Var.g = INVALID_OFFSET;
            h0Var.f1390a = false;
            fill(m1Var, h0Var, t1Var, true);
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewJ = iConvertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!viewJ.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public void onInitializeAccessibilityNodeInfo(m1 m1Var, t1 t1Var, f4.f fVar) {
        super.onInitializeAccessibilityNodeInfo(m1Var, t1Var, fVar);
        t0 t0Var = this.mRecyclerView.f1241m;
        if (t0Var == null || t0Var.getItemCount() <= 0) {
            return;
        }
        fVar.b(f4.c.f23638m);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // androidx.recyclerview.widget.f1
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayoutChildren(androidx.recyclerview.widget.m1 r14, androidx.recyclerview.widget.t1 r15) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1):void");
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(t1 t1Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof j0) {
            j0 j0Var = (j0) parcelable;
            this.mPendingSavedState = j0Var;
            if (this.mPendingScrollPosition != -1) {
                j0Var.f1417a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        j0 j0Var = this.mPendingSavedState;
        if (j0Var != null) {
            j0 j0Var2 = new j0();
            j0Var2.f1417a = j0Var.f1417a;
            j0Var2.f1418b = j0Var.f1418b;
            j0Var2.f1419c = j0Var.f1419c;
            return j0Var2;
        }
        j0 j0Var3 = new j0();
        if (getChildCount() <= 0) {
            j0Var3.f1417a = -1;
            return j0Var3;
        }
        ensureLayoutState();
        boolean z3 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        j0Var3.f1419c = z3;
        if (z3) {
            View viewI = i();
            j0Var3.f1418b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewI);
            j0Var3.f1417a = getPosition(viewI);
            return j0Var3;
        }
        View viewJ = j();
        j0Var3.f1417a = getPosition(viewJ);
        j0Var3.f1418b = this.mOrientationHelper.e(viewJ) - this.mOrientationHelper.k();
        return j0Var3;
    }

    public final void p(int i4, int i10) {
        this.mLayoutState.f1392c = this.mOrientationHelper.g() - i10;
        h0 h0Var = this.mLayoutState;
        h0Var.f1394e = this.mShouldReverseLayout ? -1 : 1;
        h0Var.f1393d = i4;
        h0Var.f1395f = 1;
        h0Var.f1391b = i10;
        h0Var.g = INVALID_OFFSET;
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i4, bundle)) {
            return true;
        }
        if (i4 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i10 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i10, getRowCountForAccessibility(recyclerView.f1223c, recyclerView.f1233h0) - 1);
            } else {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i11, getColumnCountForAccessibility(recyclerView2.f1223c, recyclerView2.f1233h0) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public void prepareForDrop(View view, View view2, int i4, int i10) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c9 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c9 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c9 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i4, int i10) {
        this.mLayoutState.f1392c = i10 - this.mOrientationHelper.k();
        h0 h0Var = this.mLayoutState;
        h0Var.f1393d = i4;
        h0Var.f1394e = this.mShouldReverseLayout ? 1 : -1;
        h0Var.f1395f = -1;
        h0Var.f1391b = i10;
        h0Var.g = INVALID_OFFSET;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i4, m1 m1Var, t1 t1Var) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f1390a = true;
        int i10 = i4 > 0 ? 1 : -1;
        int iAbs = Math.abs(i4);
        o(i10, iAbs, true, t1Var);
        h0 h0Var = this.mLayoutState;
        int iFill = fill(m1Var, h0Var, t1Var, false) + h0Var.g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i4 = i10 * iFill;
        }
        this.mOrientationHelper.o(-i4);
        this.mLayoutState.j = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i4, m1 m1Var, t1 t1Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i4, m1Var, t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public void scrollToPosition(int i4) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        j0 j0Var = this.mPendingSavedState;
        if (j0Var != null) {
            j0Var.f1417a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i4, int i10) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = i10;
        j0 j0Var = this.mPendingSavedState;
        if (j0Var != null) {
            j0Var.f1417a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i4, m1 m1Var, t1 t1Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i4, m1Var, t1Var);
    }

    public void setInitialPrefetchItemCount(int i4) {
        this.mInitialPrefetchItemCount = i4;
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(je.u.r(i4, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mOrientation || this.mOrientationHelper == null) {
            m0 m0VarA = m0.a(this, i4);
            this.mOrientationHelper = m0VarA;
            this.mAnchorInfo.f1352a = m0VarA;
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z3) {
        this.mRecycleChildrenOnDetach = z3;
    }

    public void setReverseLayout(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (z3 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z3;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z3) {
        this.mSmoothScrollbarEnabled = z3;
    }

    public void setStackFromEnd(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z3) {
            return;
        }
        this.mStackFromEnd = z3;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.f1
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, t1 t1Var, int i4) {
        k0 k0Var = new k0(recyclerView.getContext());
        k0Var.setTargetPosition(i4);
        startSmoothScroll(k0Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i4 = 1; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE2 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE2 > iE) {
                    k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iE3 < iE);
                throw new RuntimeException(sb3.toString());
            }
            if (iE3 < iE) {
                k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new f0();
        this.mLayoutChunkResult = new g0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        e1 properties = f1.getProperties(context, attributeSet, i4, i10);
        setOrientation(properties.f1341a);
        setReverseLayout(properties.f1343c);
        setStackFromEnd(properties.f1344d);
    }

    public void onAnchorReady(m1 m1Var, t1 t1Var, f0 f0Var, int i4) {
    }
}
