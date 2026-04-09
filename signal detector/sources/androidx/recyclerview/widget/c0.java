package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public abstract class c0 {
    private Q mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final a0 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public c0() {
        a0 a0Var = new a0();
        a0Var.f5426d = -1;
        a0Var.f5428f = false;
        a0Var.f5429g = 0;
        a0Var.f5423a = 0;
        a0Var.f5424b = 0;
        a0Var.f5425c = LinearLayoutManager.INVALID_OFFSET;
        a0Var.f5427e = null;
        this.mRecyclingAction = a0Var;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof b0) {
            return ((b0) layoutManager).computeScrollVectorForPosition(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.f5362m.findViewByPosition(i);
    }

    public int getChildCount() {
        return this.mRecyclerView.f5362m.getChildCount();
    }

    public int getChildPosition(View view) {
        this.mRecyclerView.getClass();
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ != null) {
            return g0VarJ.getLayoutPosition();
        }
        return -1;
    }

    public Q getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.c0(i);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f2 = pointF.x;
        float f5 = pointF.y;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f2 * f2));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i, int i3) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f2 = pointFComputeScrollVectorForPosition.x;
            if (f2 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                recyclerView.b0(null, (int) Math.signum(f2), (int) Math.signum(pointFComputeScrollVectorForPosition.y));
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.f5372u0, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i3, recyclerView.f5372u0, this.mRecyclingAction);
            a0 a0Var = this.mRecyclingAction;
            boolean z6 = a0Var.f5426d >= 0;
            a0Var.a(recyclerView);
            if (z6 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.f5369r0.a();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
        }
    }

    public abstract void onSeekTargetStep(int i, int i3, d0 d0Var, a0 a0Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, d0 d0Var, a0 a0Var);

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public void start(RecyclerView recyclerView, Q q3) {
        f0 f0Var = recyclerView.f5369r0;
        f0Var.f5472g.removeCallbacks(f0Var);
        f0Var.f5468c.abortAnimation();
        if (this.mStarted) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = q3;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f5372u0.f5442a = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.f5369r0.a();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.f5372u0.f5442a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
