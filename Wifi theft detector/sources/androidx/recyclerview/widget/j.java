package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public i f3995a;

    /* renamed from: b, reason: collision with root package name */
    public i f3996b;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.x
        public void onTargetFound(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            j jVar = j.this;
            int[] iArrCalculateDistanceToFinalSnap = jVar.calculateDistanceToFinalSnap(jVar.mRecyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public int[] calculateDistanceToFinalSnap(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            iArr[0] = d(view, f(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = d(view, h(nVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public RecyclerView.x createScroller(RecyclerView.n nVar) {
        if (nVar instanceof RecyclerView.x.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    public final int d(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.n() + (iVar.o() / 2));
    }

    public final View e(RecyclerView.n nVar, i iVar) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN = iVar.n() + (iVar.o() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = nVar.getChildAt(i11);
            int iAbs = Math.abs((iVar.g(childAt) + (iVar.e(childAt) / 2)) - iN);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final i f(RecyclerView.n nVar) {
        i iVar = this.f3996b;
        if (iVar == null || iVar.f3992a != nVar) {
            this.f3996b = i.a(nVar);
        }
        return this.f3996b;
    }

    @Override // androidx.recyclerview.widget.n
    public View findSnapView(RecyclerView.n nVar) {
        if (nVar.canScrollVertically()) {
            return e(nVar, h(nVar));
        }
        if (nVar.canScrollHorizontally()) {
            return e(nVar, f(nVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int findTargetSnapPosition(RecyclerView.n nVar, int i10, int i11) {
        i iVarG;
        int itemCount = nVar.getItemCount();
        if (itemCount == 0 || (iVarG = g(nVar)) == null) {
            return -1;
        }
        int childCount = nVar.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = nVar.getChildAt(i14);
            if (childAt != null) {
                int iD = d(childAt, iVarG);
                if (iD <= 0 && iD > i13) {
                    view2 = childAt;
                    i13 = iD;
                }
                if (iD >= 0 && iD < i12) {
                    view = childAt;
                    i12 = iD;
                }
            }
        }
        boolean zI = i(nVar, i10, i11);
        if (zI && view != null) {
            return nVar.getPosition(view);
        }
        if (!zI && view2 != null) {
            return nVar.getPosition(view2);
        }
        if (zI) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = nVar.getPosition(view) + (j(nVar) == zI ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final i g(RecyclerView.n nVar) {
        if (nVar.canScrollVertically()) {
            return h(nVar);
        }
        if (nVar.canScrollHorizontally()) {
            return f(nVar);
        }
        return null;
    }

    public final i h(RecyclerView.n nVar) {
        i iVar = this.f3995a;
        if (iVar == null || iVar.f3992a != nVar) {
            this.f3995a = i.c(nVar);
        }
        return this.f3995a;
    }

    public final boolean i(RecyclerView.n nVar, int i10, int i11) {
        return nVar.canScrollHorizontally() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(RecyclerView.n nVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = nVar.getItemCount();
        if (!(nVar instanceof RecyclerView.x.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.x.b) nVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }
}
