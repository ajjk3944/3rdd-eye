package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u.C2940i;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public abstract class Q {
    boolean mAutoMeasure;
    C0306c mChildHelper;
    private int mHeight;
    private int mHeightMode;
    s0 mHorizontalBoundCheck;
    private final r0 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    c0 mSmoothScroller;
    s0 mVerticalBoundCheck;
    private final r0 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public Q() {
        N n6 = new N(0, this);
        this.mHorizontalBoundCheckCallback = n6;
        N n7 = new N(1, this);
        this.mVerticalBoundCheckCallback = n7;
        this.mHorizontalBoundCheck = new s0(n6);
        this.mVerticalBoundCheck = new s0(n7);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i, int i3, int i6) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i6 > 0 && i != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int chooseSize(int i, int i3, int i6) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i6) : size : Math.min(size, Math.max(i3, i6));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L10
            if (r3 < 0) goto Le
        Lc:
            r2 = r0
            goto L1e
        Le:
            r3 = r2
            goto L1e
        L10:
            if (r3 < 0) goto L13
            goto Lc
        L13:
            r4 = -1
            if (r3 != r4) goto L18
            r3 = r1
            goto Lc
        L18:
            r4 = -2
            if (r3 != r4) goto Le
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public static P getProperties(Context context, AttributeSet attributeSet, int i, int i3) {
        P p6 = new P();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B0.a.f518a, i, i3);
        p6.f5300a = typedArrayObtainStyledAttributes.getInt(0, 1);
        p6.f5301b = typedArrayObtainStyledAttributes.getInt(10, 1);
        p6.f5302c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        p6.f5303d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return p6;
    }

    public final void a(View view, int i, boolean z6) {
        g0 g0VarJ = RecyclerView.J(view);
        if (z6 || g0VarJ.isRemoved()) {
            C2940i c2940i = (C2940i) this.mRecyclerView.f5349f.f3875b;
            t0 t0VarA = (t0) c2940i.get(g0VarJ);
            if (t0VarA == null) {
                t0VarA = t0.a();
                c2940i.put(g0VarJ, t0VarA);
            }
            t0VarA.f5607a |= 1;
        } else {
            this.mRecyclerView.f5349f.x(g0VarJ);
        }
        S s5 = (S) view.getLayoutParams();
        if (g0VarJ.wasReturnedFromScrap() || g0VarJ.isScrap()) {
            if (g0VarJ.isScrap()) {
                g0VarJ.unScrap();
            } else {
                g0VarJ.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iJ = this.mChildHelper.j(view);
            if (i == -1) {
                i = this.mChildHelper.e();
            }
            if (iJ == -1) {
                StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(A.f.j(this.mRecyclerView, sb));
            }
            if (iJ != i) {
                this.mRecyclerView.f5362m.moveView(iJ, i);
            }
        } else {
            this.mChildHelper.a(view, i, false);
            s5.f5379c = true;
            c0 c0Var = this.mSmoothScroller;
            if (c0Var != null && c0Var.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (s5.f5380d) {
            g0VarJ.itemView.invalidate();
            s5.f5380d = false;
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.N()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(A.f.j(recyclerView, AbstractC2984e.a(str)));
        }
        throw new IllegalStateException(A.f.j(recyclerView, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public void attachView(View view, int i, S s5) {
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ.isRemoved()) {
            C2940i c2940i = (C2940i) this.mRecyclerView.f5349f.f3875b;
            t0 t0VarA = (t0) c2940i.get(g0VarJ);
            if (t0VarA == null) {
                t0VarA = t0.a();
                c2940i.put(g0VarJ, t0VarA);
            }
            t0VarA.f5607a |= 1;
        } else {
            this.mRecyclerView.f5349f.x(g0VarJ);
        }
        this.mChildHelper.b(view, i, s5, g0VarJ.isRemoved());
    }

    public final void c(X x6, int i, View view) {
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ.shouldIgnore()) {
            return;
        }
        if (g0VarJ.isInvalid() && !g0VarJ.isRemoved() && !this.mRecyclerView.f5360l.hasStableIds()) {
            removeViewAt(i);
            x6.h(g0VarJ);
        } else {
            detachViewAt(i);
            x6.i(view);
            this.mRecyclerView.f5349f.x(g0VarJ);
        }
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(S s5) {
        return s5 != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i3, d0 d0Var, O o5) {
    }

    public void collectInitialPrefetchPositions(int i, O o5) {
    }

    public abstract int computeHorizontalScrollExtent(d0 d0Var);

    public abstract int computeHorizontalScrollOffset(d0 d0Var);

    public abstract int computeHorizontalScrollRange(d0 d0Var);

    public abstract int computeVerticalScrollExtent(d0 d0Var);

    public abstract int computeVerticalScrollOffset(d0 d0Var);

    public abstract int computeVerticalScrollRange(d0 d0Var);

    public void detachAndScrapAttachedViews(X x6) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(x6, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, X x6) {
        c(x6, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i, X x6) {
        c(x6, i, getChildAt(i));
    }

    public void detachView(View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i) {
        getChildAt(i);
        this.mChildHelper.c(i);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, X x6) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, x6);
    }

    public void endAnimation(View view) {
        L l2 = this.mRecyclerView.f5344c0;
        if (l2 != null) {
            l2.d(RecyclerView.J(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewB;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewB = recyclerView.B(view)) == null || this.mChildHelper.f5438c.contains(viewB)) {
            return null;
        }
        return viewB;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            g0 g0VarJ = RecyclerView.J(childAt);
            if (g0VarJ != null && g0VarJ.getLayoutPosition() == i && !g0VarJ.shouldIgnore() && (this.mRecyclerView.f5372u0.f5448g || !g0VarJ.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract S generateDefaultLayoutParams();

    public S generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof S ? new S((S) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new S((ViewGroup.MarginLayoutParams) layoutParams) : new S(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((S) view.getLayoutParams()).f5378b.bottom;
    }

    public View getChildAt(int i) {
        C0306c c0306c = this.mChildHelper;
        if (c0306c != null) {
            return c0306c.d(i);
        }
        return null;
    }

    public int getChildCount() {
        C0306c c0306c = this.mChildHelper;
        if (c0306c != null) {
            return c0306c.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.f5351g;
    }

    public int getColumnCountForAccessibility(X x6, d0 d0Var) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.K(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((S) view.getLayoutParams()).f5378b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((S) view.getLayoutParams()).f5378b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f5438c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        G adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.J(view).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = R.O.f3270a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((S) view.getLayoutParams()).f5378b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = R.O.f3270a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = R.O.f3270a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = R.O.f3270a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = R.O.f3270a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((S) view.getLayoutParams()).f5377a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((S) view.getLayoutParams()).f5378b.right;
    }

    public int getRowCountForAccessibility(X x6, d0 d0Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(X x6, d0 d0Var) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((S) view.getLayoutParams()).f5378b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z6, Rect rect) {
        Matrix matrix;
        if (z6) {
            Rect rect2 = ((S) view.getLayoutParams()).f5378b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.f5358k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(A.f.j(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        g0 g0VarJ = RecyclerView.J(view);
        g0VarJ.addFlags(128);
        this.mRecyclerView.f5349f.y(g0VarJ);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(X x6, d0 d0Var) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        c0 c0Var = this.mSmoothScroller;
        return c0Var != null && c0Var.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z6, boolean z7) {
        boolean z8 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z6 ? z8 : !z8;
    }

    public void layoutDecorated(View view, int i, int i3, int i6, int i7) {
        Rect rect = ((S) view.getLayoutParams()).f5378b;
        view.layout(i + rect.left, i3 + rect.top, i6 - rect.right, i7 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i3, int i6, int i7) {
        S s5 = (S) view.getLayoutParams();
        Rect rect = s5.f5378b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) s5).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) s5).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) s5).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) s5).bottomMargin);
    }

    public void measureChild(View view, int i, int i3) {
        S s5 = (S) view.getLayoutParams();
        Rect rectL = this.mRecyclerView.L(view);
        int i6 = rectL.left + rectL.right + i;
        int i7 = rectL.top + rectL.bottom + i3;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i6, ((ViewGroup.MarginLayoutParams) s5).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i7, ((ViewGroup.MarginLayoutParams) s5).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, s5)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i, int i3) {
        S s5 = (S) view.getLayoutParams();
        Rect rectL = this.mRecyclerView.L(view);
        int i6 = rectL.left + rectL.right + i;
        int i7 = rectL.top + rectL.bottom + i3;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) s5).leftMargin + ((ViewGroup.MarginLayoutParams) s5).rightMargin + i6, ((ViewGroup.MarginLayoutParams) s5).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) s5).topMargin + ((ViewGroup.MarginLayoutParams) s5).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) s5).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, s5)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i3) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i3);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f5347e.e();
            for (int i3 = 0; i3 < iE; i3++) {
                recyclerView.f5347e.d(i3).offsetLeftAndRight(i);
            }
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f5347e.e();
            for (int i3 = 0; i3 < iE; i3++) {
                recyclerView.f5347e.d(i3).offsetTopAndBottom(i);
            }
        }
    }

    public void onAdapterChanged(G g2, G g6) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i3) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, X x6);

    public abstract View onFocusSearchFailed(View view, int i, X x6, d0 d0Var);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.f5342b, recyclerView.f5372u0, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(S.d dVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.f5342b, recyclerView.f5372u0, dVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, S.d dVar) {
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ == null || g0VarJ.isRemoved()) {
            return;
        }
        C0306c c0306c = this.mChildHelper;
        if (c0306c.f5438c.contains(g0VarJ.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.f5342b, recyclerView.f5372u0, view, dVar);
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i3) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i3, int i6) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i3) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i3) {
    }

    public abstract void onLayoutChildren(X x6, d0 d0Var);

    public abstract void onLayoutCompleted(d0 d0Var);

    public void onMeasure(X x6, d0 d0Var, int i, int i3) {
        this.mRecyclerView.n(i, i3);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.N();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onSmoothScrollerStopped(c0 c0Var) {
        if (this.mSmoothScroller == c0Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.f5342b, recyclerView.f5372u0, i, bundle);
    }

    public boolean performAccessibilityActionForItem(X x6, d0 d0Var, View view, int i, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = R.O.f3270a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(X x6) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.J(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, x6);
            }
        }
    }

    public void removeAndRecycleScrapInt(X x6) {
        ArrayList arrayList = x6.f5410a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((g0) arrayList.get(i)).itemView;
            g0 g0VarJ = RecyclerView.J(view);
            if (!g0VarJ.shouldIgnore()) {
                g0VarJ.setIsRecyclable(false);
                if (g0VarJ.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                L l2 = this.mRecyclerView.f5344c0;
                if (l2 != null) {
                    l2.d(g0VarJ);
                }
                g0VarJ.setIsRecyclable(true);
                g0 g0VarJ2 = RecyclerView.J(view);
                g0VarJ2.mScrapContainer = null;
                g0VarJ2.mInChangeScrap = false;
                g0VarJ2.clearReturnedFromScrapFlag();
                x6.h(g0VarJ2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = x6.f5411b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, X x6) {
        removeView(view);
        x6.g(view);
    }

    public void removeAndRecycleViewAt(int i, X x6) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        x6.g(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void removeView(View view) {
        C0306c c0306c = this.mChildHelper;
        E e6 = c0306c.f5436a;
        int iIndexOfChild = e6.f5281a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (c0306c.f5437b.q(iIndexOfChild)) {
            c0306c.l(view);
        }
        e6.h(iIndexOfChild);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.k(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb6
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lbb
        L80:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.i
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lbb
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lbb
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lbb
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb6
            goto Lbb
        Lb6:
            if (r11 != 0) goto Lbc
            if (r10 == 0) goto Lbb
            goto Lbc
        Lbb:
            return r0
        Lbc:
            if (r12 == 0) goto Lc2
            r9.scrollBy(r11, r10)
            return r7
        Lc2:
            r9.d0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i, X x6, d0 d0Var);

    public abstract void scrollToPosition(int i);

    public abstract int scrollVerticallyBy(int i, X x6, d0 d0Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z6) {
        this.mAutoMeasure = z6;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z6) {
        if (z6 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z6;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.f5342b.l();
            }
        }
    }

    public void setMeasureSpecs(int i, int i3) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5304N0;
        }
        this.mHeight = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.mHeightMode = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5304N0;
        }
    }

    public void setMeasuredDimension(Rect rect, int i, int i3) {
        setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i3, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i, int i3) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.n(i, i3);
            return;
        }
        int i6 = LinearLayoutManager.INVALID_OFFSET;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Rect rect = this.mRecyclerView.i;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.mRecyclerView.i.set(i9, i7, i6, i8);
        setMeasuredDimension(this.mRecyclerView.i, i, i3);
    }

    public void setMeasurementCacheEnabled(boolean z6) {
        this.mMeasurementCacheEnabled = z6;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.f5347e;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i3, S s5) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) s5).width) && b(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) s5).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i3, S s5) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) s5).width) && b(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) s5).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, d0 d0Var, int i);

    public void startSmoothScroll(c0 c0Var) {
        c0 c0Var2 = this.mSmoothScroller;
        if (c0Var2 != null && c0Var != c0Var2 && c0Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = c0Var;
        c0Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View view) {
        g0 g0VarJ = RecyclerView.J(view);
        g0VarJ.stopIgnoring();
        g0VarJ.resetInternal();
        g0VarJ.addFlags(4);
    }

    public void stopSmoothScroller() {
        c0 c0Var = this.mSmoothScroller;
        if (c0Var != null) {
            c0Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void addDisappearingView(View view, int i) {
        a(view, i, true);
    }

    public void addView(View view, int i) {
        a(view, i, false);
    }

    public void onInitializeAccessibilityEvent(X x6, d0 d0Var, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        G g2 = this.mRecyclerView.f5360l;
        if (g2 != null) {
            accessibilityEvent.setItemCount(g2.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(X x6, d0 d0Var, S.d dVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            dVar.a(8192);
            dVar.k(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            dVar.a(4096);
            dVar.k(true);
        }
        dVar.f3446a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) U0.j.q(getRowCountForAccessibility(x6, d0Var), getColumnCountForAccessibility(x6, d0Var), getSelectionModeForAccessibility(x6, d0Var), isLayoutHierarchical(x6, d0Var)).f3677b);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i3, Object obj) {
        onItemsUpdated(recyclerView, i, i3);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, d0 d0Var, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[PHI: r2
  0x0043: PHI (r2v8 int) = (r2v4 int), (r2v12 int) binds: [B:23:0x0061, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(androidx.recyclerview.widget.X r2, androidx.recyclerview.widget.d0 r3, int r4, android.os.Bundle r5) {
        /*
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
            r3 = 0
            if (r2 != 0) goto L7
            goto L75
        L7:
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = 1
            if (r4 == r5) goto L45
            r5 = 8192(0x2000, float:1.148E-41)
            if (r4 == r5) goto L13
            r2 = r3
            r4 = r2
            goto L71
        L13:
            r4 = -1
            boolean r2 = r2.canScrollVertically(r4)
            if (r2 == 0) goto L2a
            int r2 = r1.getHeight()
            int r5 = r1.getPaddingTop()
            int r2 = r2 - r5
            int r5 = r1.getPaddingBottom()
            int r2 = r2 - r5
            int r2 = -r2
            goto L2b
        L2a:
            r2 = r3
        L2b:
            androidx.recyclerview.widget.RecyclerView r5 = r1.mRecyclerView
            boolean r4 = r5.canScrollHorizontally(r4)
            if (r4 == 0) goto L43
            int r4 = r1.getWidth()
            int r5 = r1.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r1.getPaddingRight()
            int r4 = r4 - r5
            int r4 = -r4
            goto L71
        L43:
            r4 = r3
            goto L71
        L45:
            boolean r2 = r2.canScrollVertically(r0)
            if (r2 == 0) goto L5a
            int r2 = r1.getHeight()
            int r4 = r1.getPaddingTop()
            int r2 = r2 - r4
            int r4 = r1.getPaddingBottom()
            int r2 = r2 - r4
            goto L5b
        L5a:
            r2 = r3
        L5b:
            androidx.recyclerview.widget.RecyclerView r4 = r1.mRecyclerView
            boolean r4 = r4.canScrollHorizontally(r0)
            if (r4 == 0) goto L43
            int r4 = r1.getWidth()
            int r5 = r1.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r1.getPaddingRight()
            int r4 = r4 - r5
        L71:
            if (r2 != 0) goto L76
            if (r4 != 0) goto L76
        L75:
            return r3
        L76:
            androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
            r3.d0(r4, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.performAccessibilityAction(androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0, int, android.os.Bundle):boolean");
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.f5342b, recyclerView.f5372u0, view, i, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    public S generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new S(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(X x6, d0 d0Var, View view, S.d dVar) {
    }

    public void setMeasuredDimension(int i, int i3) {
        this.mRecyclerView.setMeasuredDimension(i, i3);
    }

    public void attachView(View view, int i) {
        attachView(view, i, (S) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z6) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z6, false);
    }
}
