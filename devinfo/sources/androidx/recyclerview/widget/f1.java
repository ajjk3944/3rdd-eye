package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f1 {
    boolean mAutoMeasure;
    e mChildHelper;
    private int mHeight;
    private int mHeightMode;
    j2 mHorizontalBoundCheck;
    private final i2 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    s1 mSmoothScroller;
    j2 mVerticalBoundCheck;
    private final i2 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public f1() {
        c1 c1Var = new c1(this, 0);
        this.mHorizontalBoundCheckCallback = c1Var;
        c1 c1Var2 = new c1(this, 1);
        this.mVerticalBoundCheckCallback = c1Var2;
        this.mHorizontalBoundCheck = new j2(c1Var);
        this.mVerticalBoundCheck = new j2(c1Var2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i4, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i4 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    public static int chooseSize(int i4, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public static e1 getProperties(Context context, AttributeSet attributeSet, int i4, int i10) {
        e1 e1Var = new e1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f33469a, i4, i10);
        e1Var.f1341a = typedArrayObtainStyledAttributes.getInt(0, 1);
        e1Var.f1342b = typedArrayObtainStyledAttributes.getInt(10, 1);
        e1Var.f1343c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        e1Var.f1344d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return e1Var;
    }

    public final void a(View view, int i4, boolean z3) {
        x1 x1VarP = RecyclerView.P(view);
        if (z3 || x1VarP.isRemoved()) {
            x.n0 n0Var = (x.n0) this.mRecyclerView.g.f37323a;
            k2 k2VarA = (k2) n0Var.get(x1VarP);
            if (k2VarA == null) {
                k2VarA = k2.a();
                n0Var.put(x1VarP, k2VarA);
            }
            k2VarA.f1432a |= 1;
        } else {
            this.mRecyclerView.g.w(x1VarP);
        }
        g1 g1Var = (g1) view.getLayoutParams();
        if (x1VarP.wasReturnedFromScrap() || x1VarP.isScrap()) {
            if (x1VarP.isScrap()) {
                x1VarP.unScrap();
            } else {
                x1VarP.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i4, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iJ = this.mChildHelper.j(view);
            if (i4 == -1) {
                i4 = this.mChildHelper.e();
            }
            if (iJ == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(a0.g.k(this.mRecyclerView, sb2));
            }
            if (iJ != i4) {
                this.mRecyclerView.f1243n.moveView(iJ, i4);
            }
        } else {
            this.mChildHelper.a(view, i4, false);
            g1Var.f1376c = true;
            s1 s1Var = this.mSmoothScroller;
            if (s1Var != null && s1Var.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (g1Var.f1377d) {
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + g1Var.f1374a);
            }
            x1VarP.itemView.invalidate();
            g1Var.f1377d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.T()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(a0.g.k(recyclerView, d.h.z(str)));
        }
        throw new IllegalStateException(a0.g.k(recyclerView, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.l(str);
        }
    }

    public void attachView(View view, int i4, g1 g1Var) {
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP.isRemoved()) {
            x.n0 n0Var = (x.n0) this.mRecyclerView.g.f37323a;
            k2 k2VarA = (k2) n0Var.get(x1VarP);
            if (k2VarA == null) {
                k2VarA = k2.a();
                n0Var.put(x1VarP, k2VarA);
            }
            k2VarA.f1432a |= 1;
        } else {
            this.mRecyclerView.g.w(x1VarP);
        }
        this.mChildHelper.b(view, i4, g1Var, x1VarP.isRemoved());
    }

    public final void c(m1 m1Var, int i4, View view) {
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP.shouldIgnore()) {
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "ignoring view " + x1VarP);
                return;
            }
            return;
        }
        if (x1VarP.isInvalid() && !x1VarP.isRemoved() && !this.mRecyclerView.f1241m.hasStableIds()) {
            removeViewAt(i4);
            m1Var.j(x1VarP);
        } else {
            detachViewAt(i4);
            m1Var.k(view);
            this.mRecyclerView.g.w(x1VarP);
        }
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.R(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(g1 g1Var) {
        return g1Var != null;
    }

    public abstract int computeHorizontalScrollExtent(t1 t1Var);

    public abstract int computeHorizontalScrollOffset(t1 t1Var);

    public abstract int computeHorizontalScrollRange(t1 t1Var);

    public abstract int computeVerticalScrollExtent(t1 t1Var);

    public abstract int computeVerticalScrollOffset(t1 t1Var);

    public abstract int computeVerticalScrollRange(t1 t1Var);

    public void detachAndScrapAttachedViews(m1 m1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(m1Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, m1 m1Var) {
        c(m1Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i4, m1 m1Var) {
        c(m1Var, i4, getChildAt(i4));
    }

    public void detachView(View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i4) {
        getChildAt(i4);
        this.mChildHelper.c(i4);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, m1 m1Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, m1Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        a1 a1Var = this.mRecyclerView.M;
        if (a1Var != null) {
            a1Var.d(RecyclerView.P(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewF;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewF = recyclerView.F(view)) == null || this.mChildHelper.f1330c.contains(viewF)) {
            return null;
        }
        return viewF;
    }

    public View findViewByPosition(int i4) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            x1 x1VarP = RecyclerView.P(childAt);
            if (x1VarP != null && x1VarP.getLayoutPosition() == i4 && !x1VarP.shouldIgnore() && (this.mRecyclerView.f1233h0.g || !x1VarP.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract g1 generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public g1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g1 ? new g1((g1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g1((ViewGroup.MarginLayoutParams) layoutParams) : new g1(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((g1) view.getLayoutParams()).f1375b.bottom;
    }

    public View getChildAt(int i4) {
        e eVar = this.mChildHelper;
        if (eVar != null) {
            return eVar.d(i4);
        }
        return null;
    }

    public int getChildCount() {
        e eVar = this.mChildHelper;
        if (eVar != null) {
            return eVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.f1232h;
    }

    public int getColumnCountForAccessibility(m1 m1Var, t1 t1Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.f1241m == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.f1241m.getItemCount();
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.Q(rect, view);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((g1) view.getLayoutParams()).f1375b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((g1) view.getLayoutParams()).f1375b;
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
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f1330c.contains(focusedChild)) {
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
        t0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.P(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((g1) view.getLayoutParams()).f1375b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = e4.v0.f22405a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = e4.v0.f22405a;
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
        WeakHashMap weakHashMap = e4.v0.f22405a;
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
        WeakHashMap weakHashMap = e4.v0.f22405a;
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
        return ((g1) view.getLayoutParams()).f1374a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((g1) view.getLayoutParams()).f1375b.right;
    }

    public int getRowCountForAccessibility(m1 m1Var, t1 t1Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.f1241m == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.f1241m.getItemCount();
    }

    public int getSelectionModeForAccessibility(m1 m1Var, t1 t1Var) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((g1) view.getLayoutParams()).f1375b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z3, Rect rect) {
        Matrix matrix;
        if (z3) {
            Rect rect2 = ((g1) view.getLayoutParams()).f1375b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.f1239l;
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
        for (int i4 = 0; i4 < childCount; i4++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
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
            throw new IllegalArgumentException(a0.g.k(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        x1 x1VarP = RecyclerView.P(view);
        x1VarP.addFlags(128);
        this.mRecyclerView.g.x(x1VarP);
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

    public boolean isLayoutHierarchical(m1 m1Var, t1 t1Var) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        s1 s1Var = this.mSmoothScroller;
        return s1Var != null && s1Var.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z3, boolean z10) {
        boolean z11 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z3 ? z11 : !z11;
    }

    public void layoutDecorated(View view, int i4, int i10, int i11, int i12) {
        Rect rect = ((g1) view.getLayoutParams()).f1375b;
        view.layout(i4 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i4, int i10, int i11, int i12) {
        g1 g1Var = (g1) view.getLayoutParams();
        Rect rect = g1Var.f1375b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) g1Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) g1Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) g1Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin);
    }

    public void measureChild(View view, int i4, int i10) {
        g1 g1Var = (g1) view.getLayoutParams();
        Rect rectR = this.mRecyclerView.R(view);
        int i11 = rectR.left + rectR.right + i4;
        int i12 = rectR.top + rectR.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) g1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) g1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, g1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i4, int i10) {
        g1 g1Var = (g1) view.getLayoutParams();
        Rect rectR = this.mRecyclerView.R(view);
        int i11 = rectR.left + rectR.right + i4;
        int i12 = rectR.top + rectR.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) g1Var).leftMargin + ((ViewGroup.MarginLayoutParams) g1Var).rightMargin + i11, ((ViewGroup.MarginLayoutParams) g1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) g1Var).topMargin + ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) g1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, g1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i4, int i10) {
        View childAt = getChildAt(i4);
        if (childAt != null) {
            detachViewAt(i4);
            attachView(childAt, i10);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i4) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f1229f.e();
            for (int i10 = 0; i10 < iE; i10++) {
                recyclerView.f1229f.d(i10).offsetLeftAndRight(i4);
            }
        }
    }

    public void offsetChildrenVertical(int i4) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f1229f.e();
            for (int i10 = 0; i10 < iE; i10++) {
                recyclerView.f1229f.d(i10).offsetTopAndBottom(i4);
            }
        }
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i4, int i10) {
        return false;
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, m1 m1Var);

    public abstract View onFocusSearchFailed(View view, int i4, m1 m1Var, t1 t1Var);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.f1223c, recyclerView.f1233h0, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(f4.f fVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.f1223c, recyclerView.f1233h0, fVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, f4.f fVar) {
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP == null || x1VarP.isRemoved()) {
            return;
        }
        e eVar = this.mChildHelper;
        if (eVar.f1330c.contains(x1VarP.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.f1223c, recyclerView.f1233h0, view, fVar);
    }

    public View onInterceptFocusSearch(View view, int i4) {
        return null;
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i10) {
    }

    public abstract void onLayoutChildren(m1 m1Var, t1 t1Var);

    public abstract void onLayoutCompleted(t1 t1Var);

    public void onMeasure(m1 m1Var, t1 t1Var, int i4, int i10) {
        this.mRecyclerView.r(i4, i10);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.T();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(s1 s1Var) {
        if (this.mSmoothScroller == s1Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.f1223c, recyclerView.f1233h0, i4, bundle);
    }

    public boolean performAccessibilityActionForItem(m1 m1Var, t1 t1Var, View view, int i4, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = e4.v0.f22405a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(m1 m1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.P(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, m1Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(m1 m1Var) {
        ArrayList arrayList = m1Var.f1455a;
        int size = arrayList.size();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            View view = ((x1) arrayList.get(i4)).itemView;
            x1 x1VarP = RecyclerView.P(view);
            if (!x1VarP.shouldIgnore()) {
                x1VarP.setIsRecyclable(false);
                if (x1VarP.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                a1 a1Var = this.mRecyclerView.M;
                if (a1Var != null) {
                    a1Var.d(x1VarP);
                }
                x1VarP.setIsRecyclable(true);
                x1 x1VarP2 = RecyclerView.P(view);
                x1VarP2.mScrapContainer = null;
                x1VarP2.mInChangeScrap = false;
                x1VarP2.clearReturnedFromScrapFlag();
                m1Var.j(x1VarP2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = m1Var.f1456b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, m1 m1Var) {
        removeView(view);
        m1Var.i(view);
    }

    public void removeAndRecycleViewAt(int i4, m1 m1Var) {
        View childAt = getChildAt(i4);
        removeViewAt(i4);
        m1Var.i(childAt);
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

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        e eVar = this.mChildHelper;
        r0 r0Var = eVar.f1328a;
        int i4 = eVar.f1331d;
        if (i4 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i4 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            eVar.f1331d = 1;
            eVar.f1332e = view;
            int iIndexOfChild = r0Var.f1497a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (eVar.f1329b.q(iIndexOfChild)) {
                    eVar.l(view);
                }
                r0Var.h(iIndexOfChild);
            }
            eVar.f1331d = 0;
            eVar.f1332e = null;
        } catch (Throwable th2) {
            eVar.f1331d = 0;
            eVar.f1332e = null;
            throw th2;
        }
    }

    public void removeViewAt(int i4) {
        if (getChildAt(i4) != null) {
            this.mChildHelper.k(i4);
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
            android.graphics.Rect r5 = r5.j
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
            r9.m0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
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

    public abstract int scrollHorizontallyBy(int i4, m1 m1Var, t1 t1Var);

    public abstract void scrollToPosition(int i4);

    public abstract int scrollVerticallyBy(int i4, m1 m1Var, t1 t1Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z3) {
        this.mAutoMeasure = z3;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z3) {
        if (z3 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z3;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.f1223c.n();
            }
        }
    }

    public void setMeasureSpecs(int i4, int i10) {
        this.mWidth = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.G0) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.G0) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i4, int i10) {
        setMeasuredDimension(chooseSize(i4, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i4, int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.r(i4, i10);
            return;
        }
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Rect rect = this.mRecyclerView.j;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.mRecyclerView.j.set(i14, i12, i11, i13);
        setMeasuredDimension(this.mRecyclerView.j, i4, i10);
    }

    public void setMeasurementCacheEnabled(boolean z3) {
        this.mMeasurementCacheEnabled = z3;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.f1229f;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i4, int i10, g1 g1Var) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) g1Var).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) g1Var).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i4, int i10, g1 g1Var) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) g1Var).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) g1Var).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, t1 t1Var, int i4);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(s1 s1Var) {
        s1 s1Var2 = this.mSmoothScroller;
        if (s1Var2 != null && s1Var != s1Var2 && s1Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = s1Var;
        s1Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View view) {
        x1 x1VarP = RecyclerView.P(view);
        x1VarP.stopIgnoring();
        x1VarP.resetInternal();
        x1VarP.addFlags(4);
    }

    public void stopSmoothScroller() {
        s1 s1Var = this.mSmoothScroller;
        if (s1Var != null) {
            s1Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i4) {
        a(view, i4, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i4) {
        a(view, i4, false);
    }

    public void onInitializeAccessibilityEvent(m1 m1Var, t1 t1Var, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        t0 t0Var = this.mRecyclerView.f1241m;
        if (t0Var != null) {
            accessibilityEvent.setItemCount(t0Var.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(m1 m1Var, t1 t1Var, f4.f fVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            fVar.a(Segment.SIZE);
            fVar.t(true);
            fVar.j(67108864, true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            fVar.a(Buffer.SEGMENTING_THRESHOLD);
            fVar.t(true);
            fVar.j(67108864, true);
        }
        fVar.l(o7.d.n(getRowCountForAccessibility(m1Var, t1Var), getColumnCountForAccessibility(m1Var, t1Var), getSelectionModeForAccessibility(m1Var, t1Var), isLayoutHierarchical(m1Var, t1Var)));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i10, Object obj) {
        onItemsUpdated(recyclerView, i4, i10);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, t1 t1Var, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[PHI: r8
  0x0066: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:27:0x0082, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(androidx.recyclerview.widget.m1 r8, androidx.recyclerview.widget.t1 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.performAccessibilityAction(androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1, int, android.os.Bundle):boolean");
    }

    public boolean performAccessibilityActionForItem(View view, int i4, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.f1223c, recyclerView.f1233h0, view, i4, bundle);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    @SuppressLint({"UnknownNullness"})
    public g1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new g1(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(m1 m1Var, t1 t1Var, View view, f4.f fVar) {
        fVar.m(f4.e.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false));
    }

    public void setMeasuredDimension(int i4, int i10) {
        this.mRecyclerView.setMeasuredDimension(i4, i10);
    }

    public void attachView(View view, int i4) {
        attachView(view, i4, (g1) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i4) {
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z3, false);
    }

    public void collectInitialPrefetchPositions(int i4, d1 d1Var) {
    }

    public void onAdapterChanged(t0 t0Var, t0 t0Var2) {
    }

    public void onItemsAdded(RecyclerView recyclerView, int i4, int i10) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i10) {
    }

    public void collectAdjacentPrefetchPositions(int i4, int i10, t1 t1Var, d1 d1Var) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i4, int i10, int i11) {
    }
}
