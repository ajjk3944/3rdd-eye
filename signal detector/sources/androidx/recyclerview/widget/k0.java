package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class k0 extends T {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final U mScrollListener = new j0(this);

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            U u6 = this.mScrollListener;
            ArrayList arrayList = recyclerView2.f5373w0;
            if (arrayList != null) {
                arrayList.remove(u6);
            }
            this.mRecyclerView.setOnFlingListener(null);
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.mRecyclerView.h(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(Q q3, View view);

    public int[] calculateScrollDistance(int i, int i3) {
        this.mGravityScroller.fling(0, 0, i, i3, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public abstract c0 createScroller(Q q3);

    @Deprecated
    public C0327y createSnapScroller(Q q3) {
        if (q3 instanceof b0) {
            return new B(this, this.mRecyclerView.getContext(), 1);
        }
        return null;
    }

    public abstract View findSnapView(Q q3);

    public abstract int findTargetSnapPosition(Q q3, int i, int i3);

    @Override // androidx.recyclerview.widget.T
    public boolean onFling(int i, int i3) {
        c0 c0VarCreateScroller;
        int iFindTargetSnapPosition;
        Q layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i3) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof b0) || (c0VarCreateScroller = createScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i, i3)) == -1) {
            return false;
        }
        c0VarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(c0VarCreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        Q layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.d0(i, iArrCalculateDistanceToFinalSnap[1], false);
    }
}
