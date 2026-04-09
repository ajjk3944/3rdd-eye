package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public class LinearLayoutManager extends Q implements b0 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0323u mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0324v mLayoutChunkResult;
    private C0325w mLayoutState;
    int mOrientation;
    A mOrientationHelper;
    C0326x mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(int i, boolean z6) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0323u();
        this.mLayoutChunkResult = new C0324v();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z6);
    }

    @Override // androidx.recyclerview.widget.Q
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(d0 d0Var, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(d0Var);
        if (this.mLayoutState.f5624f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.Q
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.Q
    public void collectAdjacentPrefetchPositions(int i, int i3, d0 d0Var, O o5) {
        if (this.mOrientation != 0) {
            i = i3;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        o(i > 0 ? 1 : -1, Math.abs(i), true, d0Var);
        collectPrefetchPositionsForLayoutState(d0Var, this.mLayoutState, o5);
    }

    @Override // androidx.recyclerview.widget.Q
    public void collectInitialPrefetchPositions(int i, O o5) {
        boolean z6;
        int i3;
        C0326x c0326x = this.mPendingSavedState;
        if (c0326x == null || (i3 = c0326x.f5630a) < 0) {
            n();
            z6 = this.mShouldReverseLayout;
            i3 = this.mPendingScrollPosition;
            if (i3 == -1) {
                i3 = z6 ? i - 1 : 0;
            }
        } else {
            z6 = c0326x.f5632c;
        }
        int i6 = z6 ? -1 : 1;
        for (int i7 = 0; i7 < this.mInitialPrefetchItemCount && i3 >= 0 && i3 < i; i7++) {
            ((C0318o) o5).a(i3, 0);
            i3 += i6;
        }
    }

    public void collectPrefetchPositionsForLayoutState(d0 d0Var, C0325w c0325w, O o5) {
        int i = c0325w.f5622d;
        if (i < 0 || i >= d0Var.b()) {
            return;
        }
        ((C0318o) o5).a(i, Math.max(0, c0325w.f5625g));
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeHorizontalScrollExtent(d0 d0Var) {
        return d(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeHorizontalScrollOffset(d0 d0Var) {
        return e(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeHorizontalScrollRange(d0 d0Var) {
        return f(d0Var);
    }

    @Override // androidx.recyclerview.widget.b0
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeVerticalScrollExtent(d0 d0Var) {
        return d(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeVerticalScrollOffset(d0 d0Var) {
        return e(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public int computeVerticalScrollRange(d0 d0Var) {
        return f(d0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.mOrientation == 0) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i == 33) {
            if (this.mOrientation == 1) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i == 66) {
            if (this.mOrientation == 0) {
                return 1;
            }
            return INVALID_OFFSET;
        }
        if (i == 130 && this.mOrientation == 1) {
            return 1;
        }
        return INVALID_OFFSET;
    }

    public C0325w createLayoutState() {
        C0325w c0325w = new C0325w();
        c0325w.f5619a = true;
        c0325w.f5626h = 0;
        c0325w.i = 0;
        c0325w.f5628k = null;
        return c0325w;
    }

    public final int d(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.bumptech.glide.c.g(d0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.bumptech.glide.c.h(d0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.bumptech.glide.c.i(d0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(X x6, C0325w c0325w, d0 d0Var, boolean z6) {
        int i;
        int i3 = c0325w.f5621c;
        int i6 = c0325w.f5625g;
        if (i6 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0325w.f5625g = i6 + i3;
            }
            l(x6, c0325w);
        }
        int i7 = c0325w.f5621c + c0325w.f5626h;
        C0324v c0324v = this.mLayoutChunkResult;
        while (true) {
            if ((!c0325w.f5629l && i7 <= 0) || (i = c0325w.f5622d) < 0 || i >= d0Var.b()) {
                break;
            }
            c0324v.f5615a = 0;
            c0324v.f5616b = false;
            c0324v.f5617c = false;
            c0324v.f5618d = false;
            layoutChunk(x6, d0Var, c0325w, c0324v);
            if (!c0324v.f5616b) {
                int i8 = c0325w.f5620b;
                int i9 = c0324v.f5615a;
                c0325w.f5620b = (c0325w.f5624f * i9) + i8;
                if (!c0324v.f5617c || c0325w.f5628k != null || !d0Var.f5448g) {
                    c0325w.f5621c -= i9;
                    i7 -= i9;
                }
                int i10 = c0325w.f5625g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    c0325w.f5625g = i11;
                    int i12 = c0325w.f5621c;
                    if (i12 < 0) {
                        c0325w.f5625g = i11 + i12;
                    }
                    l(x6, c0325w);
                }
                if (z6 && c0324v.f5618d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0325w.f5621c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z6, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z6, z7) : findOneVisibleChild(getChildCount() - 1, -1, z6, z7);
    }

    public View findFirstVisibleChildClosestToStart(boolean z6, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z6, z7) : findOneVisibleChild(0, getChildCount(), z6, z7);
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

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i3) {
        int i6;
        int i7;
        ensureLayoutState();
        if (i3 <= i && i3 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.e(getChildAt(i)) < this.mOrientationHelper.k()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i3, i6, i7) : this.mVerticalBoundCheck.a(i, i3, i6, i7);
    }

    public View findOneVisibleChild(int i, int i3, boolean z6, boolean z7) {
        ensureLayoutState();
        int i6 = z6 ? 24579 : 320;
        int i7 = z7 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i3, i6, i7) : this.mVerticalBoundCheck.a(i, i3, i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.X r17, androidx.recyclerview.widget.d0 r18, boolean r19, boolean r20) {
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
            androidx.recyclerview.widget.A r7 = r0.mOrientationHelper
            int r7 = r7.k()
            androidx.recyclerview.widget.A r8 = r0.mOrientationHelper
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.A r14 = r0.mOrientationHelper
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.A r15 = r0.mOrientationHelper
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.S r13 = (androidx.recyclerview.widget.S) r13
            androidx.recyclerview.widget.g0 r13 = r13.f5377a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.Q
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public final int g(int i, X x6, d0 d0Var, boolean z6) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(-iG2, x6, d0Var);
        int i6 = i + i3;
        if (!z6 || (iG = this.mOrientationHelper.g() - i6) <= 0) {
            return i3;
        }
        this.mOrientationHelper.o(iG);
        return iG + i3;
    }

    @Override // androidx.recyclerview.widget.Q
    public S generateDefaultLayoutParams() {
        return new S(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(d0 d0Var) {
        if (d0Var.f5442a != -1) {
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

    public final int h(int i, X x6, d0 d0Var, boolean z6) {
        int iK;
        int iK2 = i - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(iK2, x6, d0Var);
        int i6 = i + i3;
        if (!z6 || (iK = i6 - this.mOrientationHelper.k()) <= 0) {
            return i3;
        }
        this.mOrientationHelper.o(-iK);
        return i3 - iK;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.Q
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(X x6, C0325w c0325w) {
        if (!c0325w.f5619a || c0325w.f5629l) {
            return;
        }
        int i = c0325w.f5625g;
        int i3 = c0325w.i;
        if (c0325w.f5624f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i) + i3;
            if (this.mShouldReverseLayout) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.n(childAt) < iF) {
                        m(x6, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = childCount - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View childAt2 = getChildAt(i8);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.n(childAt2) < iF) {
                    m(x6, i7, i8);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i9 = i - i3;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt3 = getChildAt(i10);
                if (this.mOrientationHelper.b(childAt3) > i9 || this.mOrientationHelper.m(childAt3) > i9) {
                    m(x6, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = childCount2 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View childAt4 = getChildAt(i12);
            if (this.mOrientationHelper.b(childAt4) > i9 || this.mOrientationHelper.m(childAt4) > i9) {
                m(x6, i11, i12);
                return;
            }
        }
    }

    public void layoutChunk(X x6, d0 d0Var, C0325w c0325w, C0324v c0324v) {
        int i;
        int i3;
        int i6;
        int i7;
        int paddingLeft;
        int iD;
        int i8;
        int i9;
        View viewB = c0325w.b(x6);
        if (viewB == null) {
            c0324v.f5616b = true;
            return;
        }
        S s5 = (S) viewB.getLayoutParams();
        if (c0325w.f5628k == null) {
            if (this.mShouldReverseLayout == (c0325w.f5624f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c0325w.f5624f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        c0324v.f5615a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            if (c0325w.f5624f == -1) {
                i9 = c0325w.f5620b;
                i8 = i9 - c0324v.f5615a;
            } else {
                i8 = c0325w.f5620b;
                i9 = c0324v.f5615a + i8;
            }
            int i10 = paddingLeft;
            i7 = i8;
            i6 = i10;
            i3 = i9;
            i = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewB) + paddingTop;
            if (c0325w.f5624f == -1) {
                int i11 = c0325w.f5620b;
                i6 = i11 - c0324v.f5615a;
                i = i11;
                i3 = iD2;
            } else {
                int i12 = c0325w.f5620b;
                i = c0324v.f5615a + i12;
                i3 = iD2;
                i6 = i12;
            }
            i7 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i6, i7, i, i3);
        if (s5.f5377a.isRemoved() || s5.f5377a.isUpdated()) {
            c0324v.f5617c = true;
        }
        c0324v.f5618d = viewB.hasFocusable();
    }

    public final void m(X x6, int i, int i3) {
        if (i == i3) {
            return;
        }
        if (i3 <= i) {
            while (i > i3) {
                removeAndRecycleViewAt(i, x6);
                i--;
            }
        } else {
            for (int i6 = i3 - 1; i6 >= i; i6--) {
                removeAndRecycleViewAt(i6, x6);
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

    public final void o(int i, int i3, boolean z6, d0 d0Var) {
        int iK;
        this.mLayoutState.f5629l = resolveIsInfinite();
        this.mLayoutState.f5624f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(d0Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z7 = i == 1;
        C0325w c0325w = this.mLayoutState;
        int i6 = z7 ? iMax2 : iMax;
        c0325w.f5626h = i6;
        if (!z7) {
            iMax = iMax2;
        }
        c0325w.i = iMax;
        if (z7) {
            c0325w.f5626h = this.mOrientationHelper.h() + i6;
            View viewI = i();
            C0325w c0325w2 = this.mLayoutState;
            c0325w2.f5623e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            C0325w c0325w3 = this.mLayoutState;
            c0325w2.f5622d = position + c0325w3.f5623e;
            c0325w3.f5620b = this.mOrientationHelper.b(viewI);
            iK = this.mOrientationHelper.b(viewI) - this.mOrientationHelper.g();
        } else {
            View viewJ = j();
            C0325w c0325w4 = this.mLayoutState;
            c0325w4.f5626h = this.mOrientationHelper.k() + c0325w4.f5626h;
            C0325w c0325w5 = this.mLayoutState;
            c0325w5.f5623e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            C0325w c0325w6 = this.mLayoutState;
            c0325w5.f5622d = position2 + c0325w6.f5623e;
            c0325w6.f5620b = this.mOrientationHelper.e(viewJ);
            iK = (-this.mOrientationHelper.e(viewJ)) + this.mOrientationHelper.k();
        }
        C0325w c0325w7 = this.mLayoutState;
        c0325w7.f5621c = i3;
        if (z6) {
            c0325w7.f5621c = i3 - iK;
        }
        c0325w7.f5625g = iK;
    }

    public void onAnchorReady(X x6, d0 d0Var, C0323u c0323u, int i) {
    }

    @Override // androidx.recyclerview.widget.Q
    public void onDetachedFromWindow(RecyclerView recyclerView, X x6) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(x6);
            x6.f5410a.clear();
            x6.e();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public View onFocusSearchFailed(View view, int i, X x6, d0 d0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, d0Var);
            C0325w c0325w = this.mLayoutState;
            c0325w.f5625g = INVALID_OFFSET;
            c0325w.f5619a = false;
            fill(x6, c0325w, d0Var, true);
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

    @Override // androidx.recyclerview.widget.Q
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // androidx.recyclerview.widget.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayoutChildren(androidx.recyclerview.widget.X r14, androidx.recyclerview.widget.d0 r15) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0):void");
    }

    @Override // androidx.recyclerview.widget.Q
    public void onLayoutCompleted(d0 d0Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.Q
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0326x) {
            C0326x c0326x = (C0326x) parcelable;
            this.mPendingSavedState = c0326x;
            if (this.mPendingScrollPosition != -1) {
                c0326x.f5630a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public Parcelable onSaveInstanceState() {
        C0326x c0326x = this.mPendingSavedState;
        if (c0326x != null) {
            C0326x c0326x2 = new C0326x();
            c0326x2.f5630a = c0326x.f5630a;
            c0326x2.f5631b = c0326x.f5631b;
            c0326x2.f5632c = c0326x.f5632c;
            return c0326x2;
        }
        C0326x c0326x3 = new C0326x();
        if (getChildCount() <= 0) {
            c0326x3.f5630a = -1;
            return c0326x3;
        }
        ensureLayoutState();
        boolean z6 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        c0326x3.f5632c = z6;
        if (z6) {
            View viewI = i();
            c0326x3.f5631b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewI);
            c0326x3.f5630a = getPosition(viewI);
            return c0326x3;
        }
        View viewJ = j();
        c0326x3.f5630a = getPosition(viewJ);
        c0326x3.f5631b = this.mOrientationHelper.e(viewJ) - this.mOrientationHelper.k();
        return c0326x3;
    }

    public final void p(int i, int i3) {
        this.mLayoutState.f5621c = this.mOrientationHelper.g() - i3;
        C0325w c0325w = this.mLayoutState;
        c0325w.f5623e = this.mShouldReverseLayout ? -1 : 1;
        c0325w.f5622d = i;
        c0325w.f5624f = 1;
        c0325w.f5620b = i3;
        c0325w.f5625g = INVALID_OFFSET;
    }

    public void prepareForDrop(View view, View view2, int i, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c6 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c6 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c6 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i, int i3) {
        this.mLayoutState.f5621c = i3 - this.mOrientationHelper.k();
        C0325w c0325w = this.mLayoutState;
        c0325w.f5622d = i;
        c0325w.f5623e = this.mShouldReverseLayout ? 1 : -1;
        c0325w.f5624f = -1;
        c0325w.f5620b = i3;
        c0325w.f5625g = INVALID_OFFSET;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i, X x6, d0 d0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f5619a = true;
        int i3 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        o(i3, iAbs, true, d0Var);
        C0325w c0325w = this.mLayoutState;
        int iFill = fill(x6, c0325w, d0Var, false) + c0325w.f5625g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i3 * iFill;
        }
        this.mOrientationHelper.o(-i);
        this.mLayoutState.f5627j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.Q
    public int scrollHorizontallyBy(int i, X x6, d0 d0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, x6, d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        C0326x c0326x = this.mPendingSavedState;
        if (c0326x != null) {
            c0326x.f5630a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i3) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i3;
        C0326x c0326x = this.mPendingSavedState;
        if (c0326x != null) {
            c0326x.f5630a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.Q
    public int scrollVerticallyBy(int i, X x6, d0 d0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, x6, d0Var);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            A a6 = A.a(this, i);
            this.mOrientationHelper = a6;
            this.mAnchorInfo.f5610a = a6;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z6) {
        this.mRecycleChildrenOnDetach = z6;
    }

    public void setReverseLayout(boolean z6) {
        assertNotInLayoutOrScroll(null);
        if (z6 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z6;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z6) {
        this.mSmoothScrollbarEnabled = z6;
    }

    public void setStackFromEnd(boolean z6) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z6) {
            return;
        }
        this.mStackFromEnd = z6;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.Q
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.Q
    public void smoothScrollToPosition(RecyclerView recyclerView, d0 d0Var, int i) {
        C0327y c0327y = new C0327y(recyclerView.getContext());
        c0327y.setTargetPosition(i);
        startSmoothScroll(c0327y);
    }

    @Override // androidx.recyclerview.widget.Q
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
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iE2 < iE);
                    throw new RuntimeException(sb.toString());
                }
                if (iE2 > iE) {
                    k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iE3 < iE);
                throw new RuntimeException(sb2.toString());
            }
            if (iE3 < iE) {
                k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0323u();
        this.mLayoutChunkResult = new C0324v();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        P properties = Q.getProperties(context, attributeSet, i, i3);
        setOrientation(properties.f5300a);
        setReverseLayout(properties.f5302c);
        setStackFromEnd(properties.f5303d);
    }
}
