package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C0327y;
import androidx.recyclerview.widget.C0328z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.k0;

/* loaded from: classes.dex */
public class emc extends k0 {
    private A emc;
    private RecyclerView xq;
    private A ypw;

    private A ypw(Q q3) {
        A a6 = this.ypw;
        if (a6 == null || a6.f5272a != q3) {
            this.ypw = new C0328z(q3, 0);
        }
        return this.ypw;
    }

    @Override // androidx.recyclerview.widget.k0
    public void attachToRecyclerView(RecyclerView recyclerView) {
        this.xq = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.k0
    public int[] calculateDistanceToFinalSnap(Q q3, View view) {
        int[] iArr = {0, 0};
        if (q3.canScrollHorizontally()) {
            iArr[0] = emc(view, ypw(q3));
            return iArr;
        }
        if (q3.canScrollVertically()) {
            iArr[1] = emc(view, emc(q3));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.k0
    public c0 createScroller(Q q3) {
        if (q3 instanceof b0) {
            return new C0327y(this.xq.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.emc.1
                @Override // androidx.recyclerview.widget.C0327y
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.C0327y
                public int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // androidx.recyclerview.widget.C0327y, androidx.recyclerview.widget.c0
                public void onTargetFound(View view, d0 d0Var, a0 a0Var) {
                    emc emcVar = emc.this;
                    int[] iArrCalculateDistanceToFinalSnap = emcVar.calculateDistanceToFinalSnap(emcVar.xq.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i3 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i3)));
                    if (iCalculateTimeForDeceleration > 0) {
                        a0Var.b(i, i3, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.k0
    public View findSnapView(Q q3) {
        int childCount = q3.getChildCount();
        View view = null;
        if (childCount != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) q3;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                A aEmc = emc(q3);
                int i = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = linearLayoutManager.getChildAt(i3);
                    int iAbs = Math.abs(aEmc.e(childAt));
                    if (iAbs < i) {
                        view = childAt;
                        i = iAbs;
                    }
                }
                return view;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.k0
    public int findTargetSnapPosition(Q q3, int i, int i3) {
        View viewFindSnapView = findSnapView(q3);
        int i6 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = q3.getPosition(viewFindSnapView);
        if (q3.canScrollVertically()) {
            i6 = i3 < 0 ? position - 1 : position + 1;
        }
        return Math.min(q3.getItemCount() - 1, Math.max(i6, 0));
    }

    private int emc(View view, A a6) {
        int iE = a6.e(view);
        return iE >= a6.k() / 2 ? iE - a6.k() : iE;
    }

    private A emc(Q q3) {
        A a6 = this.emc;
        if (a6 == null || a6.f5272a != q3) {
            this.emc = new C0328z(q3, 1);
        }
        return this.emc;
    }
}
