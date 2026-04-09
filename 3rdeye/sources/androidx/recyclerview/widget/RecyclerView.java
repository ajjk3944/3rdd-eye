package androidx.recyclerview.widget;

import L0.C0770a;
import L0.C0785p;
import L0.I;
import L0.InterfaceC0784o;
import L0.K;
import L0.S;
import N7.C1154e9;
import N7.G8;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C1799a;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import c9.C2092m;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import m0.C5316i;
import t4.C5606d;
import v1.C5672a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0784o {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final C sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.D mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    C1799a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    C1804f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<F> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    s.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0785p mScrollingChildHelper;
    final B mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final E mViewFlinger;
    private final I.b mViewInfoProcessCallback;
    final I mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class A {

        /* renamed from: a, reason: collision with root package name */
        public int f16448a = -1;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f16449b;

        /* renamed from: c, reason: collision with root package name */
        public p f16450c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16451d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16452e;

        /* renamed from: f, reason: collision with root package name */
        public View f16453f;

        /* renamed from: g, reason: collision with root package name */
        public final a f16454g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16455h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f16456a;

            /* renamed from: b, reason: collision with root package name */
            public int f16457b;

            /* renamed from: c, reason: collision with root package name */
            public int f16458c;

            /* renamed from: d, reason: collision with root package name */
            public int f16459d;

            /* renamed from: e, reason: collision with root package name */
            public BaseInterpolator f16460e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f16461f;

            /* renamed from: g, reason: collision with root package name */
            public int f16462g;

            public final void a(RecyclerView recyclerView) {
                int i = this.f16459d;
                if (i >= 0) {
                    this.f16459d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f16461f = false;
                    return;
                }
                if (!this.f16461f) {
                    this.f16462g = 0;
                    return;
                }
                BaseInterpolator baseInterpolator = this.f16460e;
                if (baseInterpolator != null && this.f16458c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i10 = this.f16458c;
                if (i10 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.c(this.f16456a, this.f16457b, baseInterpolator, i10);
                int i11 = this.f16462g + 1;
                this.f16462g = i11;
                if (i11 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f16461f = false;
            }
        }

        public interface b {
            PointF f(int i);
        }

        public A() {
            a aVar = new a();
            aVar.f16459d = -1;
            aVar.f16461f = false;
            aVar.f16462g = 0;
            aVar.f16456a = 0;
            aVar.f16457b = 0;
            aVar.f16458c = RecyclerView.UNDEFINED_DURATION;
            aVar.f16460e = null;
            this.f16454g = aVar;
        }

        public PointF a(int i) {
            Object obj = this.f16450c;
            if (obj instanceof b) {
                return ((b) obj).f(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i, int i10) {
            PointF pointFA;
            RecyclerView recyclerView = this.f16449b;
            if (this.f16448a == -1 || recyclerView == null) {
                f();
            }
            if (this.f16451d && this.f16453f == null && this.f16450c != null && (pointFA = a(this.f16448a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f16451d = false;
            View view = this.f16453f;
            a aVar = this.f16454g;
            if (view != null) {
                if (this.f16449b.getChildLayoutPosition(view) == this.f16448a) {
                    View view2 = this.f16453f;
                    B b10 = recyclerView.mState;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f16453f = null;
                }
            }
            if (this.f16452e) {
                B b11 = recyclerView.mState;
                c(i, i10, aVar);
                boolean z10 = aVar.f16459d >= 0;
                aVar.a(recyclerView);
                if (z10 && this.f16452e) {
                    this.f16451d = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public abstract void c(int i, int i10, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (this.f16452e) {
                this.f16452e = false;
                d();
                this.f16449b.mState.f16463a = -1;
                this.f16453f = null;
                this.f16448a = -1;
                this.f16451d = false;
                p pVar = this.f16450c;
                if (pVar.f16502e == this) {
                    pVar.f16502e = null;
                }
                this.f16450c = null;
                this.f16449b = null;
            }
        }
    }

    public static class B {

        /* renamed from: a, reason: collision with root package name */
        public int f16463a;

        /* renamed from: b, reason: collision with root package name */
        public int f16464b;

        /* renamed from: c, reason: collision with root package name */
        public int f16465c;

        /* renamed from: d, reason: collision with root package name */
        public int f16466d;

        /* renamed from: e, reason: collision with root package name */
        public int f16467e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16468f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16469g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16470h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f16471j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16472k;

        /* renamed from: l, reason: collision with root package name */
        public int f16473l;

        /* renamed from: m, reason: collision with root package name */
        public long f16474m;

        /* renamed from: n, reason: collision with root package name */
        public int f16475n;

        public final void a(int i) {
            if ((this.f16466d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f16466d));
        }

        public final int b() {
            return this.f16469g ? this.f16464b - this.f16465c : this.f16467e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f16463a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.f16467e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f16464b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f16465c);
            sb.append(", mStructureChanged=");
            sb.append(this.f16468f);
            sb.append(", mInPreLayout=");
            sb.append(this.f16469g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f16471j);
            sb.append(", mRunPredictiveAnimations=");
            return C1154e9.k(sb, this.f16472k, '}');
        }
    }

    public static class C extends l {
    }

    public static abstract class D {
    }

    public class E implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public int f16476b;

        /* renamed from: c, reason: collision with root package name */
        public int f16477c;

        /* renamed from: d, reason: collision with root package name */
        public OverScroller f16478d;

        /* renamed from: e, reason: collision with root package name */
        public Interpolator f16479e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16480f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16481g;

        public E() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f16479e = interpolator;
            this.f16480f = false;
            this.f16481g = false;
            this.f16478d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f16477c = 0;
            this.f16476b = 0;
            Interpolator interpolator = this.f16479e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f16479e = interpolator2;
                this.f16478d = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f16478d.fling(0, 0, i, i10, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f16480f) {
                this.f16481g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i10, Interpolator interpolator, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i10);
                boolean z10 = iAbs > iAbs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    iAbs = iAbs2;
                }
                i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f16479e != interpolator) {
                this.f16479e = interpolator;
                this.f16478d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f16477c = 0;
            this.f16476b = 0;
            recyclerView.setScrollState(2);
            this.f16478d.startScroll(0, 0, i, i10, i12);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f16478d.abortAnimation();
                return;
            }
            this.f16481g = false;
            this.f16480f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f16478d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f16476b;
                int i14 = currY - this.f16477c;
                this.f16476b = currX;
                this.f16477c = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i13);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i14);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    int i17 = iConsumeFlingInHorizontalStretch - i15;
                    int i18 = iConsumeFlingInVerticalStretch - i16;
                    androidx.recyclerview.widget.u uVar = recyclerView.mLayout.f16502e;
                    if (uVar != null && !uVar.f16451d && uVar.f16452e) {
                        int iB = recyclerView.mState.b();
                        if (iB == 0) {
                            uVar.f();
                        } else if (uVar.f16448a >= iB) {
                            uVar.f16448a = iB - 1;
                            uVar.b(i15, i16);
                        } else {
                            uVar.b(i15, i16);
                        }
                    }
                    i = i17;
                    i11 = i15;
                    i10 = i18;
                    i12 = i16;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i10 = iConsumeFlingInVerticalStretch;
                    i11 = 0;
                    i12 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i11, i12, i, i10, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i19 = i - iArr6[0];
                int i20 = i10 - iArr6[1];
                if (i11 != 0 || i12 != 0) {
                    recyclerView.dispatchOnScrolled(i11, i12);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                androidx.recyclerview.widget.u uVar2 = recyclerView.mLayout.f16502e;
                if ((uVar2 == null || !uVar2.f16451d) && z10) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i21, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        s.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.f16754c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f16755d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.s sVar = recyclerView.mGapWorker;
                    if (sVar != null) {
                        sVar.a(recyclerView, i11, i12);
                    }
                }
            }
            androidx.recyclerview.widget.u uVar3 = recyclerView.mLayout.f16502e;
            if (uVar3 != null && uVar3.f16451d) {
                uVar3.b(0, 0);
            }
            this.f16480f = false;
            if (!this.f16481g) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class F {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends F> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        F mShadowedHolder = null;
        F mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public F(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i10, boolean z10) {
            addFlags(8);
            offsetPosition(i10, z10);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends F> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f16520c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i10) {
            this.mFlags = (i & i10) | (this.mFlags & (~i10));
        }

        public final void setIsRecyclable(boolean z10) {
            int i = this.mIsRecyclableCount;
            int i10 = z10 ? i - 1 : i + 1;
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i10 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + StringUtils.PROCESS_POSTFIX_DELIMITER + this);
            }
        }

        public void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbV = G8.v(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbV.append(Integer.toHexString(hashCode()));
            sbV.append(" position=");
            sbV.append(this.mPosition);
            sbV.append(" id=");
            sbV.append(this.mItemId);
            sbV.append(", oldPos=");
            sbV.append(this.mOldPosition);
            sbV.append(", pLpos:");
            sbV.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbV.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC1793a implements Runnable {
        public RunnableC1793a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC1794b implements Runnable {
        public RunnableC1794b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j4;
            RecyclerView recyclerView = RecyclerView.this;
            m mVar = recyclerView.mItemAnimator;
            if (mVar != null) {
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) mVar;
                ArrayList<F> arrayList = oVar.f16664h;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList<o.b> arrayList2 = oVar.f16665j;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList<o.a> arrayList3 = oVar.f16666k;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList<F> arrayList4 = oVar.i;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    Iterator<F> it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        j4 = oVar.f16492d;
                        if (!zHasNext) {
                            break;
                        }
                        F next = it.next();
                        View view = next.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        oVar.f16672q.add(next);
                        viewPropertyAnimatorAnimate.setDuration(j4).alpha(0.0f).setListener(new androidx.recyclerview.widget.j(view, viewPropertyAnimatorAnimate, oVar, next)).start();
                        arrayList = arrayList;
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList<o.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        oVar.f16668m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC1805g runnableC1805g = new RunnableC1805g(oVar, arrayList5);
                        if (zIsEmpty) {
                            runnableC1805g.run();
                        } else {
                            View view2 = arrayList5.get(0).f16680a.itemView;
                            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                            view2.postOnAnimationDelayed(runnableC1805g, j4);
                        }
                    }
                    if (!zIsEmpty3) {
                        ArrayList<o.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        oVar.f16669n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC1806h runnableC1806h = new RunnableC1806h(oVar, arrayList6);
                        if (zIsEmpty) {
                            runnableC1806h.run();
                        } else {
                            View view3 = arrayList6.get(0).f16674a.itemView;
                            WeakHashMap<View, S> weakHashMap2 = L0.I.f3792a;
                            view3.postOnAnimationDelayed(runnableC1806h, j4);
                        }
                    }
                    if (!zIsEmpty4) {
                        ArrayList<F> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        oVar.f16667l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC1807i runnableC1807i = new RunnableC1807i(oVar, arrayList7);
                        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                            runnableC1807i.run();
                        } else {
                            if (zIsEmpty) {
                                j4 = 0;
                            }
                            long jMax = Math.max(!zIsEmpty2 ? oVar.f16493e : 0L, zIsEmpty3 ? 0L : oVar.f16494f) + j4;
                            View view4 = arrayList7.get(0).itemView;
                            WeakHashMap<View, S> weakHashMap3 = L0.I.f3792a;
                            view4.postOnAnimationDelayed(runnableC1807i, jMax);
                        }
                    }
                }
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC1795c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    public class C1796d implements I.b {
        public C1796d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    public class C1797e {
        public C1797e() {
        }

        public final void a(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    public class C1798f {
        public C1798f() {
        }

        public final void a(C1799a.C0260a c0260a) {
            int i = c0260a.f16597a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.t0(c0260a.f16598b, c0260a.f16600d);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.w0(c0260a.f16598b, c0260a.f16600d);
            } else if (i == 4) {
                recyclerView.mLayout.x0(c0260a.f16598b, c0260a.f16600d);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.v0(c0260a.f16598b, c0260a.f16600d);
            }
        }

        public final F b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            F fFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
            if (fFindViewHolderForPosition != null) {
                C1804f c1804f = recyclerView.mChildHelper;
                if (!c1804f.f16630c.contains(fFindViewHolderForPosition.itemView)) {
                    return fFindViewHolderForPosition;
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
                }
            }
            return null;
        }
    }

    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16488a;

        static {
            int[] iArr = new int[h.a.values().length];
            f16488a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16488a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class i extends Observable<j> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i10, 1);
            }
        }

        public final void d(int i, int i10, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i10, obj);
            }
        }

        public final void e(int i, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i10);
            }
        }

        public final void f(int i, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i10);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public static abstract class j {
        public void onItemRangeChanged(int i, int i10) {
        }

        public void onItemRangeChanged(int i, int i10, Object obj) {
            onItemRangeChanged(i, i10);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i, int i10) {
        }

        public void onItemRangeRemoved(int i, int i10) {
        }

        public void onItemRangeMoved(int i, int i10, int i11) {
        }
    }

    public interface k {
    }

    public static class l {
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public b f16489a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f16490b;

        /* renamed from: c, reason: collision with root package name */
        public long f16491c;

        /* renamed from: d, reason: collision with root package name */
        public long f16492d;

        /* renamed from: e, reason: collision with root package name */
        public long f16493e;

        /* renamed from: f, reason: collision with root package name */
        public long f16494f;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f16495a;

            /* renamed from: b, reason: collision with root package name */
            public int f16496b;

            public final void a(F f10) {
                View view = f10.itemView;
                this.f16495a = view.getLeft();
                this.f16496b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(F f10) {
            int i = f10.mFlags;
            if (!f10.isInvalid() && (i & 4) == 0) {
                f10.getOldPosition();
                f10.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(F f10, F f11, c cVar, c cVar2);

        public final void c(F f10) {
            b bVar = this.f16489a;
            if (bVar != null) {
                n nVar = (n) bVar;
                nVar.getClass();
                f10.setIsRecyclable(true);
                if (f10.mShadowedHolder != null && f10.mShadowingHolder == null) {
                    f10.mShadowedHolder = null;
                }
                f10.mShadowingHolder = null;
                if (f10.shouldBeKeptAsChild()) {
                    return;
                }
                View view = f10.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.removeAnimatingView(view) || !f10.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(f10.itemView, false);
            }
        }

        public abstract void d(F f10);

        public abstract void e();

        public abstract boolean f();
    }

    public class n implements m.b {
        public n() {
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b10) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).f16518a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface r {
        void a(View view);
    }

    public static abstract class s {
    }

    public interface t {
        boolean a(MotionEvent motionEvent);

        void onTouchEvent(MotionEvent motionEvent);
    }

    public static class v {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f16522a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public int f16523b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final Set<h<?>> f16524c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<F> f16525a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public final int f16526b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f16527c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f16528d = 0;
        }

        public void a() {
            int i = 0;
            while (true) {
                SparseArray<a> sparseArray = this.f16522a;
                if (i >= sparseArray.size()) {
                    return;
                }
                a aVarValueAt = sparseArray.valueAt(i);
                Iterator<F> it = aVarValueAt.f16525a.iterator();
                while (it.hasNext()) {
                    C5606d.g(it.next().itemView);
                }
                aVarValueAt.f16525a.clear();
                i++;
            }
        }

        public F b(int i) {
            a aVar = this.f16522a.get(i);
            if (aVar == null) {
                return null;
            }
            ArrayList<F> arrayList = aVar.f16525a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a c(int i) {
            SparseArray<a> sparseArray = this.f16522a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }

        public void d(F f10) {
            int itemViewType = f10.getItemViewType();
            ArrayList<F> arrayList = c(itemViewType).f16525a;
            if (this.f16522a.get(itemViewType).f16526b <= arrayList.size()) {
                C5606d.g(f10.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f10.resetInternal();
                arrayList.add(f10);
            }
        }
    }

    public final class w {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<F> f16529a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<F> f16530b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<F> f16531c;

        /* renamed from: d, reason: collision with root package name */
        public final List<F> f16532d;

        /* renamed from: e, reason: collision with root package name */
        public int f16533e;

        /* renamed from: f, reason: collision with root package name */
        public int f16534f;

        /* renamed from: g, reason: collision with root package name */
        public v f16535g;

        public w() {
            ArrayList<F> arrayList = new ArrayList<>();
            this.f16529a = arrayList;
            this.f16530b = null;
            this.f16531c = new ArrayList<>();
            this.f16532d = Collections.unmodifiableList(arrayList);
            this.f16533e = 2;
            this.f16534f = 2;
        }

        public static void d(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(F f10, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(f10);
            View view = f10.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.D d10 = recyclerView.mAccessibilityDelegate;
            if (d10 != null) {
                C0770a c0770aJ = d10.j();
                L0.I.o(view, c0770aJ instanceof D.a ? (C0770a) ((D.a) c0770aJ).f16373e.remove(view) : null);
            }
            if (z10) {
                x xVar = recyclerView.mRecyclerListener;
                if (xVar != null) {
                    xVar.a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).a();
                }
                h hVar = recyclerView.mAdapter;
                if (hVar != null) {
                    hVar.onViewRecycled(f10);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(f10);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + f10);
                }
            }
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = null;
            c().d(f10);
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.b()) {
                return !recyclerView.mState.f16469g ? i : recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder sbJ = C4356c.j(i, "invalid position ", ". State item count is ");
            sbJ.append(recyclerView.mState.b());
            sbJ.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }

        public final v c() {
            if (this.f16535g == null) {
                this.f16535g = new v();
                e();
            }
            return this.f16535g;
        }

        public final void e() {
            if (this.f16535g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                v vVar = this.f16535g;
                vVar.f16524c.add(recyclerView.mAdapter);
            }
        }

        public final void f(h<?> hVar, boolean z10) {
            v vVar = this.f16535g;
            if (vVar == null) {
                return;
            }
            Set<h<?>> set = vVar.f16524c;
            set.remove(hVar);
            if (set.size() != 0 || z10) {
                return;
            }
            int i = 0;
            while (true) {
                SparseArray<v.a> sparseArray = vVar.f16522a;
                if (i >= sparseArray.size()) {
                    return;
                }
                ArrayList<F> arrayList = sparseArray.get(sparseArray.keyAt(i)).f16525a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C5606d.g(arrayList.get(i10).itemView);
                }
                i++;
            }
        }

        public final void g() {
            ArrayList<F> arrayList = this.f16531c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                s.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f16754c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f16755d = 0;
            }
        }

        public final void h(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                com.google.android.gms.measurement.internal.a.i(i, "Recycling cached view at index ", RecyclerView.TAG);
            }
            ArrayList<F> arrayList = this.f16531c;
            F f10 = arrayList.get(i);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + f10);
            }
            a(f10, true);
            arrayList.remove(i);
        }

        public final void i(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            j(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.d(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
        
            r4 = r4 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(androidx.recyclerview.widget.RecyclerView.F r12) {
            /*
                Method dump skipped, instructions count: 341
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.j(androidx.recyclerview.widget.RecyclerView$F):void");
        }

        public final void k(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f16530b == null) {
                    this.f16530b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f16530b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(G8.q(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f16529a.add(childViewHolderInt);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:285:0x0521  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x0548  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.F l(int r31, long r32) {
            /*
                Method dump skipped, instructions count: 1392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.l(int, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        public final void m(F f10) {
            if (f10.mInChangeScrap) {
                this.f16530b.remove(f10);
            } else {
                this.f16529a.remove(f10);
            }
            f10.mScrapContainer = null;
            f10.mInChangeScrap = false;
            f10.clearReturnedFromScrapFlag();
        }

        public final void n() {
            p pVar = RecyclerView.this.mLayout;
            this.f16534f = this.f16533e + (pVar != null ? pVar.f16506j : 0);
            ArrayList<F> arrayList = this.f16531c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f16534f; size--) {
                h(size);
            }
        }
    }

    public interface x {
        void a();
    }

    public class y extends j {
        public y() {
        }

        public final void a() {
            boolean z10 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f16468f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i10, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C1799a c1799a = recyclerView.mAdapterHelper;
            if (i10 < 1) {
                c1799a.getClass();
                return;
            }
            ArrayList<C1799a.C0260a> arrayList = c1799a.f16592b;
            arrayList.add(c1799a.h(4, i, i10, obj));
            c1799a.f16596f |= 4;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C1799a c1799a = recyclerView.mAdapterHelper;
            if (i10 < 1) {
                c1799a.getClass();
                return;
            }
            ArrayList<C1799a.C0260a> arrayList = c1799a.f16592b;
            arrayList.add(c1799a.h(1, i, i10, null));
            c1799a.f16596f |= 1;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C1799a c1799a = recyclerView.mAdapterHelper;
            c1799a.getClass();
            if (i == i10) {
                return;
            }
            if (i11 != 1) {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            ArrayList<C1799a.C0260a> arrayList = c1799a.f16592b;
            arrayList.add(c1799a.h(8, i, i10, null));
            c1799a.f16596f |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C1799a c1799a = recyclerView.mAdapterHelper;
            if (i10 < 1) {
                c1799a.getClass();
                return;
            }
            ArrayList<C1799a.C0260a> arrayList = c1799a.f16592b;
            arrayList.add(c1799a.h(2, i, i10, null));
            c1799a.f16596f |= 2;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    public static class z extends U0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f16538d;

        public class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new z[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16538d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f16538d, 0);
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC1795c();
        sDefaultEdgeEffectFactory = new C();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(F f10) {
        View view = f10.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.m(getChildViewHolder(view));
        if (f10.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        C1804f c1804f = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1804f.f16629b.h(iIndexOfChild);
            c1804f.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(F f10, F f11, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        f10.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(f10);
        }
        if (f10 != f11) {
            if (z11) {
                addAnimatingView(f11);
            }
            f10.mShadowedHolder = f11;
            addAnimatingView(f10);
            this.mRecycler.m(f10);
            f11.setIsRecyclable(false);
            f11.mShadowingHolder = f10;
        }
        if (this.mItemAnimator.a(f10, f11, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(F f10) {
        WeakReference<RecyclerView> weakReference = f10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f10.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && R0.d.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(R0.d.b(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f) * ((-i11) / FLING_DESTRETCH_FACTOR));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || R0.d.a(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(R0.d.b(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f) * (f10 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e4) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e10) {
                        e10.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e12);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e13);
            } catch (InstantiationException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        I.a aVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        I i10 = this.mViewInfoStore;
        i10.f16404a.clear();
        i10.f16405b.b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        B b10 = this.mState;
        b10.f16470h = b10.f16471j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b10.f16469g = b10.f16472k;
        b10.f16467e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f16471j) {
            int iE = this.mChildHelper.e();
            for (int i11 = 0; i11 < iE; i11++) {
                F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    m mVar = this.mItemAnimator;
                    m.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    mVar.getClass();
                    m.c cVar = new m.c();
                    cVar.a(childViewHolderInt);
                    C5316i<F, I.a> c5316i = this.mViewInfoStore.f16404a;
                    I.a aVarA = c5316i.get(childViewHolderInt);
                    if (aVarA == null) {
                        aVarA = I.a.a();
                        c5316i.put(childViewHolderInt, aVarA);
                    }
                    aVarA.f16408b = cVar;
                    aVarA.f16407a |= 4;
                    if (this.mState.f16470h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f16405b.i(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f16472k) {
            saveOldPositions();
            B b11 = this.mState;
            boolean z10 = b11.f16468f;
            b11.f16468f = false;
            this.mLayout.y0(this.mRecycler, b11);
            this.mState.f16468f = z10;
            for (int i12 = 0; i12 < this.mChildHelper.e(); i12++) {
                F childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i12));
                if (!childViewHolderInt2.shouldIgnore() && ((aVar = this.mViewInfoStore.f16404a.get(childViewHolderInt2)) == null || (aVar.f16407a & 4) == 0)) {
                    m.b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    m mVar2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    mVar2.getClass();
                    m.c cVar2 = new m.c();
                    cVar2.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                    } else {
                        C5316i<F, I.a> c5316i2 = this.mViewInfoStore.f16404a;
                        I.a aVarA2 = c5316i2.get(childViewHolderInt2);
                        if (aVarA2 == null) {
                            aVarA2 = I.a.a();
                            c5316i2.put(childViewHolderInt2, aVarA2);
                        }
                        aVarA2.f16407a |= 2;
                        aVarA2.f16408b = cVar2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f16466d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f16467e = this.mAdapter.getItemCount();
        this.mState.f16465c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f16538d;
            if (parcelable != null) {
                this.mLayout.A0(parcelable);
            }
            this.mPendingSavedState = null;
        }
        B b10 = this.mState;
        b10.f16469g = false;
        this.mLayout.y0(this.mRecycler, b10);
        B b11 = this.mState;
        b11.f16468f = false;
        b11.f16471j = b11.f16471j && this.mItemAnimator != null;
        b11.f16466d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dispatchLayoutStep3() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchLayoutStep3():void");
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.mOnItemTouchListeners.get(i10);
            if (tVar.a(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = UNDEFINED_DURATION;
        for (int i12 = 0; i12 < iE; i12++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        F fFindViewHolderForAdapterPosition;
        B b10 = this.mState;
        int i10 = b10.f16473l;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            F fFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (fFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (fFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return fFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (fFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!fFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return fFindViewHolderForAdapterPosition.itemView;
    }

    public static F getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f16518a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f16519b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0785p getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0785p(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double dLog = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (Math.exp((f10 / (f10 - 1.0d)) * dLog) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j4, F f10, F f11) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != f10 && getChangedHolderKey(childViewHolderInt) == j4) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(f10);
                    throw new IllegalStateException(G8.q(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(f10);
                throw new IllegalStateException(G8.q(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f11 + " cannot be found but it is necessary for " + f10 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 26 ? I.f.c(this) : 0) != 0 || i10 < 26) {
            return;
        }
        I.f.m(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1804f(new C1797e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i12 = this.mLayout.W() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i10);
        throw new IllegalArgumentException(G8.q(this, sb));
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zV = pVar.v();
        boolean zW = this.mLayout.w();
        int i13 = zW ? (zV ? 1 : 0) | 2 : zV ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, height);
        int iReleaseVerticalGlow = i11 - releaseVerticalGlow(i11, width);
        startNestedScroll(i13, i12);
        if (dispatchNestedPreScroll(zV ? iReleaseHorizontalGlow : 0, zW ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zV ? iReleaseHorizontalGlow : 0, zW ? iReleaseVerticalGlow : 0, motionEvent, i12);
        androidx.recyclerview.widget.s sVar = this.mGapWorker;
        if (sVar != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            sVar.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.X0();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C1799a c1799a = this.mAdapterHelper;
            c1799a.k(c1799a.f16592b);
            c1799a.k(c1799a.f16593c);
            c1799a.f16596f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.u0();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f16471j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.f16503f) && (!z10 || this.mAdapter.hasStableIds());
        B b10 = this.mState;
        if (b10.f16471j && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        b10.f16472k = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            R0.d.b(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            R0.d.b(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            R0.d.b(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            R0.d.b(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            java.util.WeakHashMap<android.view.View, L0.S> r7 = L0.I.f3792a
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void recoverFocusFromState() {
        /*
            r6 = this;
            boolean r0 = r6.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb5
            androidx.recyclerview.widget.RecyclerView$h r0 = r6.mAdapter
            if (r0 == 0) goto Lb5
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto Lb5
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb5
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L26
            goto Lb5
        L26:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L57
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.f r0 = r6.mChildHelper
            int r0 = r0.e()
            if (r0 != 0) goto L57
            r6.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.f r1 = r6.mChildHelper
            java.util.ArrayList r1 = r1.f16630c
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L57
            goto Lb5
        L57:
            androidx.recyclerview.widget.RecyclerView$B r0 = r6.mState
            long r0 = r0.f16474m
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L73
            androidx.recyclerview.widget.RecyclerView$h r0 = r6.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L73
            androidx.recyclerview.widget.RecyclerView$B r0 = r6.mState
            long r4 = r0.f16474m
            androidx.recyclerview.widget.RecyclerView$F r0 = r6.findViewHolderForItemId(r4)
            goto L74
        L73:
            r0 = r1
        L74:
            if (r0 == 0) goto L8e
            androidx.recyclerview.widget.f r4 = r6.mChildHelper
            android.view.View r5 = r0.itemView
            java.util.ArrayList r4 = r4.f16630c
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L8e
            android.view.View r4 = r0.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 != 0) goto L8b
            goto L8e
        L8b:
            android.view.View r1 = r0.itemView
            goto L9a
        L8e:
            androidx.recyclerview.widget.f r0 = r6.mChildHelper
            int r0 = r0.e()
            if (r0 <= 0) goto L9a
            android.view.View r1 = r6.findNextViewToFocus()
        L9a:
            if (r1 == 0) goto Lb5
            androidx.recyclerview.widget.RecyclerView$B r0 = r6.mState
            int r0 = r0.f16475n
            long r4 = (long) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto Lb2
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto Lb2
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto Lb2
            r1 = r0
        Lb2:
            r1.requestFocus()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || R0.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && R0.d.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fB = R0.d.b(this.mRightGlow, width, height);
                    if (R0.d.a(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -R0.d.b(this.mLeftGlow, -width, 1.0f - height);
                if (R0.d.a(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || R0.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && R0.d.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fB = R0.d.b(this.mBottomGlow, height, 1.0f - width);
                    if (R0.d.a(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -R0.d.b(this.mTopGlow, -height, width);
                if (R0.d.a(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f16520c) {
                Rect rect = this.mTempRect;
                int i10 = rect.left;
                Rect rect2 = qVar.f16519b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.I0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        B b10 = this.mState;
        b10.f16474m = -1L;
        b10.f16473l = -1;
        b10.f16475n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        F fFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (fFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f16474m = this.mAdapter.hasStableIds() ? fFindContainingViewHolder.getItemId() : -1L;
        this.mState.f16473l = this.mDataSetHasChangedAfterLayout ? -1 : fFindContainingViewHolder.isRemoved() ? fFindContainingViewHolder.mOldPosition : fFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f16475n = getDeepestFocusedViewWithId(fFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        C1799a c1799a = this.mAdapterHelper;
        c1799a.k(c1799a.f16592b);
        c1799a.k(c1799a.f16593c);
        c1799a.f16596f = 0;
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.l0();
        }
        w wVar = this.mRecycler;
        h hVar4 = this.mAdapter;
        wVar.f16529a.clear();
        wVar.g();
        wVar.f(hVar3, true);
        v vVarC = wVar.c();
        if (hVar3 != null) {
            vVarC.f16523b--;
        }
        if (!z10 && vVarC.f16523b == 0) {
            vVarC.a();
        }
        if (hVar4 != null) {
            vVarC.f16523b++;
        } else {
            vVarC.getClass();
        }
        wVar.e();
        this.mState.f16468f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i10) < R0.d.a(edgeEffect) * ((float) i11);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || R0.d.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            R0.d.b(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && R0.d.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            R0.d.b(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && R0.d.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            R0.d.b(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || R0.d.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        R0.d.b(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        androidx.recyclerview.widget.u uVar;
        E e4 = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(e4);
        e4.f16478d.abortAnimation();
        p pVar = this.mLayout;
        if (pVar == null || (uVar = pVar.f16502e) == null) {
            return;
        }
        uVar.f();
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public void addItemDecoration(o oVar, int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.t("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i10, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        A2.l.k("'listener' arg cannot be null.", xVar != null);
        this.mRecyclerListeners.add(xVar);
    }

    public void animateAppearance(F f10, m.c cVar, m.c cVar2) {
        boolean zG;
        int i10;
        int i11;
        f10.setIsRecyclable(false);
        androidx.recyclerview.widget.F f11 = (androidx.recyclerview.widget.F) this.mItemAnimator;
        f11.getClass();
        if (cVar == null || ((i10 = cVar.f16495a) == (i11 = cVar2.f16495a) && cVar.f16496b == cVar2.f16496b)) {
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) f11;
            oVar.l(f10);
            f10.itemView.setAlpha(0.0f);
            oVar.i.add(f10);
            zG = true;
        } else {
            zG = f11.g(f10, i10, cVar.f16496b, i11, cVar2.f16496b);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(F f10, m.c cVar, m.c cVar2) {
        boolean zG;
        addAnimatingView(f10);
        f10.setIsRecyclable(false);
        androidx.recyclerview.widget.F f11 = (androidx.recyclerview.widget.F) this.mItemAnimator;
        f11.getClass();
        int i10 = cVar.f16495a;
        int i11 = cVar.f16496b;
        View view = f10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f16495a;
        int top = cVar2 == null ? view.getTop() : cVar2.f16496b;
        if (f10.isRemoved() || (i10 == left && i11 == top)) {
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) f11;
            oVar.l(f10);
            oVar.f16664h.add(f10);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = f11.g(f10, i10, i11, left, top);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(G8.q(this, G8.u(str)));
        }
        throw new IllegalStateException(G8.q(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(G8.q(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(G8.q(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(F f10) {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            return (f10.getUnmodifiedPayloads().isEmpty() && ((androidx.recyclerview.widget.o) mVar).f16380g && !f10.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.x((q) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        w wVar = this.mRecycler;
        ArrayList<F> arrayList = wVar.f16531c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).clearOldPosition();
        }
        ArrayList<F> arrayList2 = wVar.f16529a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.get(i12).clearOldPosition();
        }
        ArrayList<F> arrayList3 = wVar.f16530b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                wVar.f16530b.get(i13).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.B(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.C(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.D(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.w()) {
            return this.mLayout.E(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.w()) {
            return this.mLayout.F(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.w()) {
            return this.mLayout.G(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i10 = G0.s.f1858a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            C1799a c1799a = this.mAdapterHelper;
            int i11 = c1799a.f16596f;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (c1799a.g()) {
                    int i12 = G0.s.f1858a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = G0.s.f1858a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        setMeasuredDimension(p.y(i10, paddingRight, getMinimumWidth()), p.y(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.i = false;
        boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f16466d == 1) {
            dispatchLayoutStep1();
            this.mLayout.N0(this);
            dispatchLayoutStep2();
        } else {
            C1799a c1799a = this.mAdapterHelper;
            if ((c1799a.f16593c.isEmpty() || c1799a.f16592b.isEmpty()) && !z10 && this.mLayout.f16510n == getWidth() && this.mLayout.f16511o == getHeight()) {
                this.mLayout.N0(this);
            } else {
                this.mLayout.N0(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.C0(i10);
        }
        onScrollStateChanged(i10);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            F f10 = this.mPendingAccessibilityImportanceChange.get(size);
            if (f10.itemView.getParent() == this && !f10.shouldIgnore() && (i10 = f10.mPendingAccessibilityState) != -1) {
                View view = f10.itemView;
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                view.setImportantForAccessibility(i10);
                f10.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z10 : true) {
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((C) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((C) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((C) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(B b10) {
        if (getScrollState() != 2) {
            b10.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f16478d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b10.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public F findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public F findViewHolderForAdapterPosition(int i10) {
        F f10 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                C1804f c1804f = this.mChildHelper;
                if (!c1804f.f16630c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f10 = childViewHolderInt;
            }
        }
        return f10;
    }

    public F findViewHolderForItemId(long j4) {
        h hVar = this.mAdapter;
        F f10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i10 = 0; i10 < iH; i10++) {
                F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j4) {
                    C1804f c1804f = this.mChildHelper;
                    if (!c1804f.f16630c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f10 = childViewHolderInt;
                }
            }
        }
        return f10;
    }

    public F findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public F findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fling(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.K();
        }
        throw new IllegalStateException(G8.q(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.L(getContext(), attributeSet);
        }
        throw new IllegalStateException(G8.q(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(F f10) {
        if (f10.hasAnyOfTheFlags(524) || !f10.isBound()) {
            return -1;
        }
        C1799a c1799a = this.mAdapterHelper;
        int i10 = f10.mPosition;
        ArrayList<C1799a.C0260a> arrayList = c1799a.f16592b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1799a.C0260a c0260a = arrayList.get(i11);
            int i12 = c0260a.f16597a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = c0260a.f16598b;
                    if (i13 <= i10) {
                        int i14 = c0260a.f16600d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = c0260a.f16598b;
                    if (i15 == i10) {
                        i10 = c0260a.f16600d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (c0260a.f16600d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (c0260a.f16598b <= i10) {
                i10 += c0260a.f16600d;
            }
        }
        return i10;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar == null) {
            return super.getBaseline();
        }
        pVar.getClass();
        return -1;
    }

    public long getChangedHolderKey(F f10) {
        return this.mAdapter.hasStableIds() ? f10.getItemId() : f10.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(View view) {
        F childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public F getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.D getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        boolean z10 = qVar.f16520c;
        Rect rect = qVar.f16519b;
        if (!z10 || (this.mState.f16469g && (qVar.f16518a.isUpdated() || qVar.f16518a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f16520c = false;
        return rect;
    }

    public o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1799a(new C1798f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(G8.q(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.r(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.t("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3929d;
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.L0(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((q) this.mChildHelper.g(i10).getLayoutParams()).f16520c = true;
        }
        ArrayList<F> arrayList = this.mRecycler.f16531c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11).itemView.getLayoutParams();
            if (qVar != null) {
                qVar.f16520c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        w wVar = this.mRecycler;
        ArrayList<F> arrayList = wVar.f16531c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            F f10 = arrayList.get(i11);
            if (f10 != null) {
                f10.addFlags(6);
                f10.addChangePayload(null);
            }
        }
        h hVar = RecyclerView.this.mAdapter;
        if (hVar == null || !hVar.hasStableIds()) {
            wVar.g();
        }
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f16468f = true;
            }
        }
        ArrayList<F> arrayList = this.mRecycler.f16531c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            F f10 = arrayList.get(i13);
            if (f10 != null && f10.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i13 + " holder " + f10 + " now at position " + (f10.mPosition + i11));
                }
                f10.offsetPosition(i11, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iH = this.mChildHelper.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i20 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f16468f = true;
            }
        }
        w wVar = this.mRecycler;
        wVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        ArrayList<F> arrayList = wVar.f16531c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            F f10 = arrayList.get(i21);
            if (f10 != null && (i17 = f10.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    f10.offsetPosition(i11 - i10, false);
                } else {
                    f10.offsetPosition(i19, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i21 + " holder " + f10);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.mChildHelper.h();
        for (int i13 = 0; i13 < iH; i13++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f16468f = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f16468f = true;
                }
            }
        }
        w wVar = this.mRecycler;
        ArrayList<F> arrayList = wVar.f16531c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f10 = arrayList.get(size);
            if (f10 != null) {
                int i15 = f10.mPosition;
                if (i15 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + f10 + " now at position " + (f10.mPosition - i11));
                    }
                    f10.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    f10.addFlags(8);
                    wVar.h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.RecyclerView$w r2 = r5.mRecycler
            r2.e()
            androidx.recyclerview.widget.RecyclerView$p r2 = r5.mLayout
            if (r2 == 0) goto L26
            r2.f16504g = r1
            r2.m0(r5)
        L26:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L83
            java.lang.ThreadLocal<androidx.recyclerview.widget.s> r0 = androidx.recyclerview.widget.s.f16746f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.s r1 = (androidx.recyclerview.widget.s) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L66
            androidx.recyclerview.widget.s r1 = new androidx.recyclerview.widget.s
            r1.<init>()
            r5.mGapWorker = r1
            java.util.WeakHashMap<android.view.View, L0.S> r1 = L0.I.f3792a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            androidx.recyclerview.widget.s r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f16750d = r3
            r0.set(r2)
        L66:
            androidx.recyclerview.widget.s r0 = r5.mGapWorker
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f16748b
            if (r1 == 0) goto L80
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L78
            goto L80
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L80:
            r0.add(r5)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.s sVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.e();
        }
        stopScroll();
        int i10 = 0;
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            w wVar = this.mRecycler;
            pVar.f16504g = false;
            pVar.n0(this, wVar);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (I.a.f16406d.a() != null) {
        }
        w wVar2 = this.mRecycler;
        int i11 = 0;
        while (true) {
            ArrayList<F> arrayList = wVar2.f16531c;
            if (i11 >= arrayList.size()) {
                break;
            }
            C5606d.g(arrayList.get(i11).itemView);
            i11++;
        }
        wVar2.f(RecyclerView.this.mAdapter, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            T0.b bVar = (T0.b) childAt.getTag(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new T0.b();
                childAt.setTag(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<T0.a> arrayList2 = bVar.f12117a;
            for (int iV = C2092m.V(arrayList2); -1 < iV; iV--) {
                arrayList2.get(iV).a();
            }
            i10 = i12;
        }
        if (!ALLOW_THREAD_GAP_WORK || (sVar = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = sVar.f16748b.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.w()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.v()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.w()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.v()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zV = pVar.v();
        boolean zW = this.mLayout.w();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zV;
            if (zW) {
                i10 = (zV ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i11 = x11 - this.mInitialTouchX;
                int i12 = y11 - this.mInitialTouchY;
                if (zV == 0 || Math.abs(i11) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (zW && Math.abs(i12) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = G0.s.f1858a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.f0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.f16499b.defaultOnMeasure(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f16466d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.O0(i10, i11);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.Q0(i10, i11);
            if (this.mLayout.T0()) {
                this.mLayout.O0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.Q0(i10, i11);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.f16499b.defaultOnMeasure(i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            B b10 = this.mState;
            if (b10.f16472k) {
                b10.f16469g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f16469g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f16472k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f16467e = hVar.getItemCount();
        } else {
            this.mState.f16467e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.f16499b.defaultOnMeasure(i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f16469g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.f12348b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.f16538d = zVar2.f16538d;
            return zVar;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            zVar.f16538d = pVar.B0();
            return zVar;
        }
        zVar.f16538d = null;
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[PHI: r1
  0x00dc: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(F f10, m.c cVar) {
        f10.setFlags(0, 8192);
        if (this.mState.f16470h && f10.isUpdated() && !f10.isRemoved() && !f10.shouldIgnore()) {
            this.mViewInfoStore.f16405b.i(getChangedHolderKey(f10), f10);
        }
        C5316i<F, I.a> c5316i = this.mViewInfoStore.f16404a;
        I.a aVarA = c5316i.get(f10);
        if (aVarA == null) {
            aVarA = I.a.a();
            c5316i.put(f10, aVarA);
        }
        aVarA.f16408b = cVar;
        aVarA.f16407a |= 4;
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.e();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.E0(this.mRecycler);
            this.mLayout.F0(this.mRecycler);
        }
        w wVar = this.mRecycler;
        wVar.f16529a.clear();
        wVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean removeAnimatingView(android.view.View r8) {
        /*
            r7 = this;
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.f r0 = r7.mChildHelper
            androidx.recyclerview.widget.f$a r1 = r0.f16629b
            androidx.recyclerview.widget.RecyclerView$e r2 = r0.f16628a
            int r3 = r0.f16631d
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L1d
            android.view.View r0 = r0.f16632e
            if (r0 != r8) goto L15
        L13:
            r4 = r5
            goto L46
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r0)
            throw r8
        L1d:
            r6 = 2
            if (r3 == r6) goto L7e
            r0.f16631d = r6     // Catch: java.lang.Throwable -> L31
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this     // Catch: java.lang.Throwable -> L31
            int r3 = r3.indexOfChild(r8)     // Catch: java.lang.Throwable -> L31
            r6 = -1
            if (r3 != r6) goto L33
            r0.j(r8)     // Catch: java.lang.Throwable -> L31
        L2e:
            r0.f16631d = r5
            goto L46
        L31:
            r8 = move-exception
            goto L7b
        L33:
            boolean r6 = r1.d(r3)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L43
            r1.f(r3)     // Catch: java.lang.Throwable -> L31
            r0.j(r8)     // Catch: java.lang.Throwable -> L31
            r2.a(r3)     // Catch: java.lang.Throwable -> L31
            goto L2e
        L43:
            r0.f16631d = r5
            goto L13
        L46:
            if (r4 == 0) goto L75
            androidx.recyclerview.widget.RecyclerView$F r0 = getChildViewHolderInt(r8)
            androidx.recyclerview.widget.RecyclerView$w r1 = r7.mRecycler
            r1.m(r0)
            androidx.recyclerview.widget.RecyclerView$w r1 = r7.mRecycler
            r1.j(r0)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r0 == 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "after removing animated view: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.d(r0, r8)
        L75:
            r8 = r4 ^ 1
            r7.stopInterceptRequestLayout(r8)
            return r4
        L7b:
            r0.f16631d = r5
            throw r8
        L7e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(G8.q(this, sb));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(G8.q(this, sb2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.t("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    public void repositionShadowingViews() {
        F f10;
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            View viewD = this.mChildHelper.d(i10);
            F childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (f10 = childViewHolder.mShadowingHolder) != null) {
                View view = f10.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.u uVar = this.mLayout.f16502e;
        if ((uVar == null || !uVar.f16452e) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.I0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(G8.q(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zV = pVar.v();
        boolean zW = this.mLayout.w();
        if (zV || zW) {
            if (!zV) {
                i10 = 0;
            }
            if (!zW) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i14, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            dispatchOnScrolled(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    public void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i12 = G0.s.f1858a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iK0 = i10 != 0 ? this.mLayout.K0(i10, this.mRecycler, this.mState) : 0;
        int iM0 = i11 != 0 ? this.mLayout.M0(i11, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iK0;
            iArr[1] = iM0;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.L0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.D d10) {
        this.mAccessibilityDelegate = d10;
        L0.I.o(this, d10);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(F f10, int i10) {
        if (isComputingLayout()) {
            f10.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(f10);
            return false;
        }
        View view = f10.itemView;
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        view.setImportantForAccessibility(i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        lVar.getClass();
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.e();
            this.mItemAnimator.f16489a = null;
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.f16489a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        w wVar = this.mRecycler;
        wVar.f16533e = i10;
        wVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        RecyclerView recyclerView;
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.e();
            }
            this.mLayout.E0(this.mRecycler);
            this.mLayout.F0(this.mRecycler);
            w wVar = this.mRecycler;
            wVar.f16529a.clear();
            wVar.g();
            if (this.mIsAttached) {
                p pVar2 = this.mLayout;
                w wVar2 = this.mRecycler;
                pVar2.f16504g = false;
                pVar2.n0(this, wVar2);
            }
            this.mLayout.R0(null);
            this.mLayout = null;
        } else {
            w wVar3 = this.mRecycler;
            wVar3.f16529a.clear();
            wVar3.g();
        }
        C1804f c1804f = this.mChildHelper;
        c1804f.f16629b.g();
        ArrayList arrayList = c1804f.f16630c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = RecyclerView.this;
            if (size < 0) {
                break;
            }
            F childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.f16499b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(pVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(G8.q(pVar.f16499b, sb));
            }
            pVar.R0(this);
            if (this.mIsAttached) {
                p pVar3 = this.mLayout;
                pVar3.f16504g = true;
                pVar3.m0(this);
            }
        }
        this.mRecycler.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0785p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3929d) {
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            I.d.z(scrollingChildHelper.f3928c);
        }
        scrollingChildHelper.f3929d = z10;
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(v vVar) {
        w wVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        wVar.f(recyclerView.mAdapter, false);
        if (wVar.f16535g != null) {
            r2.f16523b--;
        }
        wVar.f16535g = vVar;
        if (vVar != null && recyclerView.getAdapter() != null) {
            wVar.f16535g.f16523b++;
        }
        wVar.e();
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    public void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbJ = C4356c.j(i10, "setting scroll state to ", " from ");
            sbJ.append(this.mScrollState);
            Log.d(TAG, sbJ.toString(), new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d10) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.V0(this, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(G8.q(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(h hVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int iH = this.mChildHelper.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = this.mChildHelper.g(i15);
            F childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) viewG.getLayoutParams()).f16520c = true;
            }
        }
        w wVar = this.mRecycler;
        ArrayList<F> arrayList = wVar.f16531c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f10 = arrayList.get(size);
            if (f10 != null && (i12 = f10.mPosition) >= i10 && i12 < i14) {
                f10.addFlags(2);
                wVar.h(size);
            }
        }
    }

    public static abstract class h<VH extends F> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i10 = G0.s.f1858a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null) {
                    View view = vh.itemView;
                    WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                    if (view.isAttachedToWindow() != vh.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                    }
                }
                if (vh.itemView.getParent() == null) {
                    View view2 = vh.itemView;
                    WeakHashMap<View, S> weakHashMap2 = L0.I.f3792a;
                    if (view2.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                    }
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f16520c = true;
                }
                int i11 = G0.s.f1858a;
                Trace.endSection();
            }
        }

        public void c(int i) {
            notifyItemInserted(i);
        }

        public boolean canRestoreState() {
            int i = g.f16488a[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i10 = G0.s.f1858a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                int i11 = G0.s.f1858a;
                Trace.endSection();
                throw th;
            }
        }

        public void d(int i) {
            notifyItemRemoved(i);
        }

        public int findRelativeAdapterPositionIn(h<? extends F> hVar, F f10, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i10) {
            this.mObservable.c(i, i10);
        }

        public final void notifyItemRangeChanged(int i, int i10) {
            this.mObservable.d(i, i10, null);
        }

        public final void notifyItemRangeInserted(int i, int i10) {
            this.mObservable.e(i, i10);
        }

        public final void notifyItemRangeRemoved(int i, int i10) {
            this.mObservable.f(i, i10);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i10, Object obj) {
            this.mObservable.d(i, i10, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.F findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            androidx.recyclerview.widget.f r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$F r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L39
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L39
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L39
        L2a:
            androidx.recyclerview.widget.f r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f16630c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L38
            r1 = r3
            goto L39
        L38:
            return r3
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$F");
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException(G8.q(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, UNDEFINED_DURATION);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        float fA;
        float fA2;
        super(context, attributeSet, i10);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new I();
        this.mUpdateChildViewsRunnable = new RunnableC1793a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        androidx.recyclerview.widget.o oVar = new androidx.recyclerview.widget.o();
        oVar.f16489a = null;
        oVar.f16490b = new ArrayList<>();
        oVar.f16491c = 120L;
        oVar.f16492d = 120L;
        oVar.f16493e = 250L;
        oVar.f16494f = 250L;
        oVar.f16380g = true;
        oVar.f16664h = new ArrayList<>();
        oVar.i = new ArrayList<>();
        oVar.f16665j = new ArrayList<>();
        oVar.f16666k = new ArrayList<>();
        oVar.f16667l = new ArrayList<>();
        oVar.f16668m = new ArrayList<>();
        oVar.f16669n = new ArrayList<>();
        oVar.f16670o = new ArrayList<>();
        oVar.f16671p = new ArrayList<>();
        oVar.f16672q = new ArrayList<>();
        oVar.f16673r = new ArrayList<>();
        this.mItemAnimator = oVar;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new E();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new s.b() : null;
        B b10 = new B();
        b10.f16463a = -1;
        b10.f16464b = 0;
        b10.f16465c = 0;
        b10.f16466d = 1;
        b10.f16467e = 0;
        b10.f16468f = false;
        b10.f16469g = false;
        b10.f16470h = false;
        b10.i = false;
        b10.f16471j = false;
        b10.f16472k = false;
        this.mState = b10;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1794b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1796d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = K.f3812a;
            fA = K.a.a(viewConfiguration);
        } else {
            fA = K.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        if (i11 >= 26) {
            fA2 = K.a.b(viewConfiguration);
        } else {
            fA2 = K.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fA2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f16489a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.D(this));
        int[] iArr = C5672a.f47010a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        L0.I.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        L0.I.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().f(i10);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().g(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public F f16518a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f16519b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16520c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16521d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16519b = new Rect();
            this.f16520c = true;
            this.f16521d = false;
        }

        public q(int i, int i10) {
            super(i, i10);
            this.f16519b = new Rect();
            this.f16520c = true;
            this.f16521d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16519b = new Rect();
            this.f16520c = true;
            this.f16521d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16519b = new Rect();
            this.f16520c = true;
            this.f16521d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f16519b = new Rect();
            this.f16520c = true;
            this.f16521d = false;
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.v()) {
            i10 = 0;
        }
        if (!this.mLayout.w()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            startNestedScroll(i13, 1);
        }
        this.mViewFlinger.c(i10, i11, interpolator, i12);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.M(layoutParams);
        }
        throw new IllegalStateException(G8.q(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public C1804f f16498a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f16499b;

        /* renamed from: c, reason: collision with root package name */
        public final H f16500c;

        /* renamed from: d, reason: collision with root package name */
        public final H f16501d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.u f16502e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16503f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16504g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f16505h;
        public final boolean i;

        /* renamed from: j, reason: collision with root package name */
        public int f16506j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16507k;

        /* renamed from: l, reason: collision with root package name */
        public int f16508l;

        /* renamed from: m, reason: collision with root package name */
        public int f16509m;

        /* renamed from: n, reason: collision with root package name */
        public int f16510n;

        /* renamed from: o, reason: collision with root package name */
        public int f16511o;

        public class a implements H.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int a(View view) {
                return (view.getLeft() - ((q) view.getLayoutParams()).f16519b.left) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int b() {
                return p.this.Y();
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int c() {
                p pVar = p.this;
                return pVar.f16510n - pVar.Z();
            }

            @Override // androidx.recyclerview.widget.H.b
            public final View d(int i) {
                return p.this.N(i);
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int e(View view) {
                return view.getRight() + ((q) view.getLayoutParams()).f16519b.right + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements H.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int a(View view) {
                return (view.getTop() - ((q) view.getLayoutParams()).f16519b.top) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int b() {
                return p.this.a0();
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int c() {
                p pVar = p.this;
                return pVar.f16511o - pVar.X();
            }

            @Override // androidx.recyclerview.widget.H.b
            public final View d(int i) {
                return p.this.N(i);
            }

            @Override // androidx.recyclerview.widget.H.b
            public final int e(View view) {
                return view.getBottom() + ((q) view.getLayoutParams()).f16519b.bottom + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f16514a;

            /* renamed from: b, reason: collision with root package name */
            public int f16515b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f16516c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f16517d;
        }

        public p() {
            a aVar = new a();
            b bVar = new b();
            this.f16500c = new H(aVar);
            this.f16501d = new H(bVar);
            this.f16503f = false;
            this.f16504g = false;
            this.f16505h = true;
            this.i = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L1d
                if (r8 < 0) goto L12
            L10:
                r6 = r3
                goto L30
            L12:
                if (r8 != r1) goto L1a
                if (r6 == r2) goto L22
                if (r6 == 0) goto L1a
                if (r6 == r3) goto L22
            L1a:
                r6 = r7
                r8 = r6
                goto L30
            L1d:
                if (r8 < 0) goto L20
                goto L10
            L20:
                if (r8 != r1) goto L24
            L22:
                r8 = r5
                goto L30
            L24:
                if (r8 != r0) goto L1a
                if (r6 == r2) goto L2e
                if (r6 != r3) goto L2b
                goto L2e
            L2b:
                r8 = r5
                r6 = r7
                goto L30
            L2e:
                r8 = r5
                r6 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(boolean, int, int, int, int):int");
        }

        public static int T(View view) {
            Rect rect = ((q) view.getLayoutParams()).f16519b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int U(View view) {
            Rect rect = ((q) view.getLayoutParams()).f16519b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int b0(View view) {
            return ((q) view.getLayoutParams()).f16518a.getLayoutPosition();
        }

        public static c c0(Context context, AttributeSet attributeSet, int i, int i10) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5672a.f47010a, i, i10);
            cVar.f16514a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.f16515b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.f16516c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.f16517d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean g0(int i, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i != i11) {
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

        public static int y(int i, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
        }

        public int B(B b10) {
            return 0;
        }

        public Parcelable B0() {
            return null;
        }

        public int C(B b10) {
            return 0;
        }

        public int D(B b10) {
            return 0;
        }

        public boolean D0(w wVar, B b10, int i, Bundle bundle) {
            int iA0;
            int iY;
            int i10;
            int i11;
            if (this.f16499b == null) {
                return false;
            }
            int iHeight = this.f16511o;
            int iWidth = this.f16510n;
            Rect rect = new Rect();
            if (this.f16499b.getMatrix().isIdentity() && this.f16499b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iA0 = this.f16499b.canScrollVertically(1) ? (iHeight - a0()) - X() : 0;
                if (this.f16499b.canScrollHorizontally(1)) {
                    iY = (iWidth - Y()) - Z();
                    i10 = iA0;
                    i11 = iY;
                }
                i10 = iA0;
                i11 = 0;
            } else if (i != 8192) {
                i11 = 0;
                i10 = 0;
            } else {
                iA0 = this.f16499b.canScrollVertically(-1) ? -((iHeight - a0()) - X()) : 0;
                if (this.f16499b.canScrollHorizontally(-1)) {
                    iY = -((iWidth - Y()) - Z());
                    i10 = iA0;
                    i11 = iY;
                }
                i10 = iA0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            this.f16499b.smoothScrollBy(i11, i10, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        public int E(B b10) {
            return 0;
        }

        public void E0(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.getChildViewHolderInt(N(iO)).shouldIgnore()) {
                    View viewN = N(iO);
                    H0(iO);
                    wVar.i(viewN);
                }
            }
        }

        public int F(B b10) {
            return 0;
        }

        public final void F0(w wVar) {
            ArrayList<F> arrayList;
            int size = wVar.f16529a.size();
            int i = size - 1;
            while (true) {
                arrayList = wVar.f16529a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f16499b.removeDetachedView(view, false);
                    }
                    m mVar = this.f16499b.mItemAnimator;
                    if (mVar != null) {
                        mVar.d(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    F childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    wVar.j(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<F> arrayList2 = wVar.f16530b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f16499b.invalidate();
            }
        }

        public int G(B b10) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void G0(View view) {
            C1804f c1804f = this.f16498a;
            C1797e c1797e = c1804f.f16628a;
            int i = c1804f.f16631d;
            if (i == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                c1804f.f16631d = 1;
                c1804f.f16632e = view;
                int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (c1804f.f16629b.f(iIndexOfChild)) {
                        c1804f.j(view);
                    }
                    c1797e.a(iIndexOfChild);
                }
                c1804f.f16631d = 0;
                c1804f.f16632e = null;
            } catch (Throwable th) {
                c1804f.f16631d = 0;
                c1804f.f16632e = null;
                throw th;
            }
        }

        public final void H(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                View viewN = N(iO);
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewN);
                if (childViewHolderInt.shouldIgnore()) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    }
                } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f16499b.mAdapter.hasStableIds()) {
                    I(iO);
                    wVar.k(viewN);
                    this.f16499b.mViewInfoStore.c(childViewHolderInt);
                } else {
                    H0(iO);
                    wVar.j(childViewHolderInt);
                }
            }
        }

        public void H0(int i) {
            if (N(i) != null) {
                C1804f c1804f = this.f16498a;
                C1797e c1797e = c1804f.f16628a;
                int i10 = c1804f.f16631d;
                if (i10 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iF = c1804f.f(i);
                    View childAt = RecyclerView.this.getChildAt(iF);
                    if (childAt != null) {
                        c1804f.f16631d = 1;
                        c1804f.f16632e = childAt;
                        if (c1804f.f16629b.f(iF)) {
                            c1804f.j(childAt);
                        }
                        c1797e.a(iF);
                    }
                    c1804f.f16631d = 0;
                    c1804f.f16632e = null;
                } catch (Throwable th) {
                    c1804f.f16631d = 0;
                    c1804f.f16632e = null;
                    throw th;
                }
            }
        }

        public void I(int i) {
            N(i);
            this.f16498a.c(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean I0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.Y()
                int r1 = r8.a0()
                int r2 = r8.f16510n
                int r3 = r8.Z()
                int r2 = r2 - r3
                int r3 = r8.f16511o
                int r4 = r8.X()
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
                int r3 = r8.W()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lae
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L7c
                goto Lb3
            L7c:
                int r1 = r8.Y()
                int r2 = r8.a0()
                int r3 = r8.f16510n
                int r4 = r8.Z()
                int r3 = r3 - r4
                int r4 = r8.f16511o
                int r5 = r8.X()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f16499b
                android.graphics.Rect r5 = r5.mTempRect
                r8.S(r13, r5)
                int r13 = r5.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lb3
                int r13 = r5.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lb3
                int r13 = r5.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lb3
                int r13 = r5.bottom
                int r13 = r13 - r10
                if (r13 > r2) goto Lae
                goto Lb3
            Lae:
                if (r11 != 0) goto Lb4
                if (r10 == 0) goto Lb3
                goto Lb4
            Lb3:
                return r0
            Lb4:
                if (r12 == 0) goto Lba
                r9.scrollBy(r11, r10)
                return r7
            Lba:
                r9.smoothScrollBy(r11, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.I0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public View J(int i) {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                View viewN = N(i10);
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewN);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f16499b.mState.f16469g || !childViewHolderInt.isRemoved())) {
                    return viewN;
                }
            }
            return null;
        }

        public final void J0() {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q K();

        @SuppressLint({"UnknownNullness"})
        public int K0(int i, w wVar, B b10) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public q L(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void L0(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public q M(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        public int M0(int i, w wVar, B b10) {
            return 0;
        }

        public final View N(int i) {
            C1804f c1804f = this.f16498a;
            if (c1804f != null) {
                return c1804f.d(i);
            }
            return null;
        }

        public final void N0(RecyclerView recyclerView) {
            O0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final int O() {
            C1804f c1804f = this.f16498a;
            if (c1804f != null) {
                return c1804f.e();
            }
            return 0;
        }

        public final void O0(int i, int i10) {
            this.f16510n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f16508l = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f16510n = 0;
            }
            this.f16511o = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f16509m = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.f16511o = 0;
        }

        public void P0(Rect rect, int i, int i10) {
            int iZ = Z() + Y() + rect.width();
            int iX = X() + a0() + rect.height();
            RecyclerView recyclerView = this.f16499b;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            this.f16499b.setMeasuredDimension(y(i, iZ, recyclerView.getMinimumWidth()), y(i10, iX, this.f16499b.getMinimumHeight()));
        }

        public final boolean Q() {
            RecyclerView recyclerView = this.f16499b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public final void Q0(int i, int i10) {
            int iO = O();
            if (iO == 0) {
                this.f16499b.defaultOnMeasure(i, i10);
                return;
            }
            int i11 = RecyclerView.UNDEFINED_DURATION;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < iO; i15++) {
                View viewN = N(i15);
                Rect rect = this.f16499b.mTempRect;
                S(viewN, rect);
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
            this.f16499b.mTempRect.set(i14, i12, i11, i13);
            P0(this.f16499b.mTempRect, i, i10);
        }

        public int R(w wVar, B b10) {
            return -1;
        }

        public final void R0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f16499b = null;
                this.f16498a = null;
                this.f16510n = 0;
                this.f16511o = 0;
            } else {
                this.f16499b = recyclerView;
                this.f16498a = recyclerView.mChildHelper;
                this.f16510n = recyclerView.getWidth();
                this.f16511o = recyclerView.getHeight();
            }
            this.f16508l = 1073741824;
            this.f16509m = 1073741824;
        }

        public void S(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public final boolean S0(View view, int i, int i10, q qVar) {
            return (!view.isLayoutRequested() && this.f16505h && g0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && g0(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public boolean T0() {
            return false;
        }

        public final boolean U0(View view, int i, int i10, q qVar) {
            return (this.f16505h && g0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && g0(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public final int V() {
            RecyclerView recyclerView = this.f16499b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void V0(RecyclerView recyclerView, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int W() {
            RecyclerView recyclerView = this.f16499b;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            return recyclerView.getLayoutDirection();
        }

        @SuppressLint({"UnknownNullness"})
        public final void W0(androidx.recyclerview.widget.u uVar) {
            androidx.recyclerview.widget.u uVar2 = this.f16502e;
            if (uVar2 != null && uVar != uVar2 && uVar2.f16452e) {
                uVar2.f();
            }
            this.f16502e = uVar;
            RecyclerView recyclerView = this.f16499b;
            E e4 = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(e4);
            e4.f16478d.abortAnimation();
            if (uVar.f16455h) {
                Log.w(RecyclerView.TAG, "An instance of " + uVar.getClass().getSimpleName() + " was started more than once. Each instance of" + uVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            uVar.f16449b = recyclerView;
            uVar.f16450c = this;
            int i = uVar.f16448a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f16463a = i;
            uVar.f16452e = true;
            uVar.f16451d = true;
            uVar.f16453f = recyclerView.mLayout.J(i);
            uVar.f16449b.mViewFlinger.b();
            uVar.f16455h = true;
        }

        public int X() {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean X0() {
            return false;
        }

        public int Y() {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int Z() {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int a0() {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int d0(w wVar, B b10) {
            return -1;
        }

        public final void e0(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((q) view.getLayoutParams()).f16519b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f16499b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f16499b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean f0() {
            return false;
        }

        public void h0(View view, int i, int i10, int i11, int i12) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f16519b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void i0(View view) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f16499b.getItemDecorInsetsForChild(view);
            int i = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i10 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int iP = P(v(), this.f16510n, this.f16508l, Z() + Y() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i, ((ViewGroup.MarginLayoutParams) qVar).width);
            int iP2 = P(w(), this.f16511o, this.f16509m, X() + a0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) qVar).height);
            if (S0(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        public void j0(int i) {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void k0(int i) {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public View o0(View view, int i, w wVar, B b10) {
            return null;
        }

        public void p0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f16499b;
            w wVar = recyclerView.mRecycler;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f16499b.canScrollVertically(-1) && !this.f16499b.canScrollHorizontally(-1) && !this.f16499b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f16499b.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void q0(w wVar, B b10, M0.g gVar) {
            if (this.f16499b.canScrollVertically(-1) || this.f16499b.canScrollHorizontally(-1)) {
                gVar.a(8192);
                gVar.m(true);
            }
            if (this.f16499b.canScrollVertically(1) || this.f16499b.canScrollHorizontally(1)) {
                gVar.a(4096);
                gVar.m(true);
            }
            gVar.f4122a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(d0(wVar, b10), R(wVar, b10), false, 0));
        }

        public View r(int i) {
            return N(i);
        }

        public final void r0(View view, M0.g gVar) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            C1804f c1804f = this.f16498a;
            if (c1804f.f16630c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f16499b;
            s0(recyclerView.mRecycler, recyclerView.mState, view, gVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s(android.view.View r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 345
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.s(android.view.View, int, boolean):void");
        }

        @SuppressLint({"UnknownNullness"})
        public void t(String str) {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void u(View view, Rect rect) {
            RecyclerView recyclerView = this.f16499b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean v() {
            return false;
        }

        public boolean w() {
            return false;
        }

        public boolean x(q qVar) {
            return qVar != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void y0(w wVar, B b10) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void l0() {
        }

        public void u0() {
        }

        @SuppressLint({"UnknownNullness"})
        public void A0(Parcelable parcelable) {
        }

        public void C0(int i) {
        }

        public void m0(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void z0(B b10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void A(int i, s.b bVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void n0(RecyclerView recyclerView, w wVar) {
        }

        public void t0(int i, int i10) {
        }

        public void v0(int i, int i10) {
        }

        public void w0(int i, int i10) {
        }

        public void x0(int i, int i10) {
        }

        public void s0(w wVar, B b10, View view, M0.g gVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void z(int i, int i10, B b10, s.b bVar) {
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i10) {
        }
    }

    public void onScrolled(int i10, int i11) {
    }
}
