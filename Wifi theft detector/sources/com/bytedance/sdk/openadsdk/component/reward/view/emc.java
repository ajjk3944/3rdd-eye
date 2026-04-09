package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;

/* loaded from: classes.dex */
public class emc extends n {
    private i emc;
    private RecyclerView xq;
    private i ypw;

    private i ypw(RecyclerView.n nVar) {
        i iVar = this.ypw;
        if (iVar == null || iVar.k() != nVar) {
            this.ypw = i.a(nVar);
        }
        return this.ypw;
    }

    @Override // androidx.recyclerview.widget.n
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.xq = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.n
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.n nVar, @NonNull View view) {
        int[] iArr = {0, 0};
        if (nVar.canScrollHorizontally()) {
            iArr[0] = emc(view, ypw(nVar));
            return iArr;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = emc(view, emc(nVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    @Nullable
    public RecyclerView.x createScroller(@NonNull RecyclerView.n nVar) {
        if (nVar instanceof RecyclerView.x.b) {
            return new g(this.xq.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.emc.1
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
                    emc emcVar = emc.this;
                    int[] iArrCalculateDistanceToFinalSnap = emcVar.calculateDistanceToFinalSnap(emcVar.xq.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    @Nullable
    public View findSnapView(@NonNull RecyclerView.n nVar) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nVar;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        i iVarEmc = emc(nVar);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(iVarEmc.g(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.n
    public int findTargetSnapPosition(RecyclerView.n nVar, int i10, int i11) {
        View viewFindSnapView = findSnapView(nVar);
        int i12 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = nVar.getPosition(viewFindSnapView);
        if (nVar.canScrollVertically()) {
            i12 = i11 < 0 ? position - 1 : position + 1;
        }
        return Math.min(nVar.getItemCount() - 1, Math.max(i12, 0));
    }

    private int emc(View view, @NonNull i iVar) {
        int iG = iVar.g(view);
        return iG >= iVar.n() / 2 ? iG - iVar.n() : iG;
    }

    private i emc(RecyclerView.n nVar) {
        i iVar = this.emc;
        if (iVar == null || iVar.k() != nVar) {
            this.emc = i.c(nVar);
        }
        return this.emc;
    }
}
