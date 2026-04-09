package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s1 {
    private f1 mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final q1 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public s1() {
        q1 q1Var = new q1();
        q1Var.f1489d = -1;
        q1Var.f1491f = false;
        q1Var.g = 0;
        q1Var.f1486a = 0;
        q1Var.f1487b = 0;
        q1Var.f1488c = LinearLayoutManager.INVALID_OFFSET;
        q1Var.f1490e = null;
        this.mRecyclingAction = q1Var;
    }

    public PointF computeScrollVectorForPosition(int i4) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof r1) {
            return ((r1) layoutManager).computeScrollVectorForPosition(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + r1.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i4) {
        return this.mRecyclerView.f1243n.findViewByPosition(i4);
    }

    public int getChildCount() {
        return this.mRecyclerView.f1243n.getChildCount();
    }

    public int getChildPosition(View view) {
        this.mRecyclerView.getClass();
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP != null) {
            return x1VarP.getLayoutPosition();
        }
        return -1;
    }

    public f1 getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i4) {
        this.mRecyclerView.k0(i4);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i4, int i10) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f10 = pointFComputeScrollVectorForPosition.x;
            if (f10 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                recyclerView.j0(null, (int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y));
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.f1233h0, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i4, i10, recyclerView.f1233h0, this.mRecyclingAction);
            q1 q1Var = this.mRecyclingAction;
            boolean z3 = q1Var.f1489d >= 0;
            q1Var.a(recyclerView);
            if (z3 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.f1228e0.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    public abstract void onSeekTargetStep(int i4, int i10, t1 t1Var, q1 q1Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, t1 t1Var, q1 q1Var);

    public void setTargetPosition(int i4) {
        this.mTargetPosition = i4;
    }

    public void start(RecyclerView recyclerView, f1 f1Var) {
        w1 w1Var = recyclerView.f1228e0;
        w1Var.g.removeCallbacks(w1Var);
        w1Var.f1523c.abortAnimation();
        if (this.mStarted) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = f1Var;
        int i4 = this.mTargetPosition;
        if (i4 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1233h0.f1503a = i4;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.f1228e0.b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.f1233h0.f1503a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
