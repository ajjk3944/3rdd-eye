package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b2 extends h1 {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final j1 mScrollListener = new a2(this);

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            j1 j1Var = this.mScrollListener;
            ArrayList arrayList = recyclerView2.f1236j0;
            if (arrayList != null) {
                arrayList.remove(j1Var);
            }
            this.mRecyclerView.setOnFlingListener(null);
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.mRecyclerView.j(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(f1 f1Var, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i4, int i10) {
        this.mGravityScroller.fling(0, 0, i4, i10, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public abstract s1 createScroller(f1 f1Var);

    @Deprecated
    public k0 createSnapScroller(f1 f1Var) {
        if (f1Var instanceof r1) {
            return new n0(this, this.mRecyclerView.getContext(), 1);
        }
        return null;
    }

    public abstract View findSnapView(f1 f1Var);

    public abstract int findTargetSnapPosition(f1 f1Var, int i4, int i10);

    @Override // androidx.recyclerview.widget.h1
    public boolean onFling(int i4, int i10) {
        s1 s1VarCreateScroller;
        int iFindTargetSnapPosition;
        f1 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i10) <= minFlingVelocity && Math.abs(i4) <= minFlingVelocity) || !(layoutManager instanceof r1) || (s1VarCreateScroller = createScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i4, i10)) == -1) {
            return false;
        }
        s1VarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(s1VarCreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        f1 layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i4 = iArrCalculateDistanceToFinalSnap[0];
        if (i4 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.m0(i4, iArrCalculateDistanceToFinalSnap[1], false);
    }
}
