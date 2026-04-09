package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.q {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.s mScrollListener = new a();

    public class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4003a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f4003a) {
                this.f4003a = false;
                n.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4003a = true;
        }
    }

    public class b extends g {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.x
        public void onTargetFound(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            n nVar = n.this;
            RecyclerView recyclerView = nVar.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = nVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public final void a() {
        this.mRecyclerView.n1(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            a();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            b();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public final void b() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.n(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    public final boolean c(RecyclerView.n nVar, int i10, int i11) {
        RecyclerView.x xVarCreateScroller;
        int iFindTargetSnapPosition;
        if (!(nVar instanceof RecyclerView.x.b) || (xVarCreateScroller = createScroller(nVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(nVar, i10, i11)) == -1) {
            return false;
        }
        xVarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        nVar.startSmoothScroll(xVarCreateScroller);
        return true;
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.n nVar, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i10, int i11) {
        this.mGravityScroller.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public abstract RecyclerView.x createScroller(RecyclerView.n nVar);

    @Nullable
    @Deprecated
    public g createSnapScroller(@NonNull RecyclerView.n nVar) {
        if (nVar instanceof RecyclerView.x.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.n nVar);

    public abstract int findTargetSnapPosition(RecyclerView.n nVar, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean onFling(int i10, int i11) {
        RecyclerView.n layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && c(layoutManager, i10, i11);
    }

    public void snapToTargetExistingView() {
        RecyclerView.n layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.B1(i10, iArrCalculateDistanceToFinalSnap[1]);
    }
}
