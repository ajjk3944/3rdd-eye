package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.k0;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.q1;
import androidx.recyclerview.widget.r1;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends b2 {

    /* renamed from: lh, reason: collision with root package name */
    private RecyclerView f8024lh;
    private m0 ouw;
    private m0 vt;

    @Override // androidx.recyclerview.widget.b2
    public final void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.f8024lh = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int[] calculateDistanceToFinalSnap(f1 f1Var, View view) {
        int[] iArr = {0, 0};
        if (!f1Var.canScrollHorizontally()) {
            if (f1Var.canScrollVertically()) {
                iArr[1] = ouw(view, ouw(f1Var));
            }
            return iArr;
        }
        m0 m0Var = this.vt;
        if (m0Var == null || m0Var.f1452a != f1Var) {
            this.vt = new l0(f1Var, 0);
        }
        iArr[0] = ouw(view, this.vt);
        return iArr;
    }

    @Override // androidx.recyclerview.widget.b2
    public final s1 createScroller(f1 f1Var) {
        if (f1Var instanceof r1) {
            return new k0(this.f8024lh.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ouw.1
                @Override // androidx.recyclerview.widget.k0
                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.k0
                public final int calculateTimeForScrolling(int i4) {
                    return Math.min(100, super.calculateTimeForScrolling(i4));
                }

                @Override // androidx.recyclerview.widget.k0, androidx.recyclerview.widget.s1
                public final void onTargetFound(View view, t1 t1Var, q1 q1Var) {
                    ouw ouwVar = ouw.this;
                    int[] iArrCalculateDistanceToFinalSnap = ouwVar.calculateDistanceToFinalSnap(ouwVar.f8024lh.getLayoutManager(), view);
                    int i4 = iArrCalculateDistanceToFinalSnap[0];
                    int i10 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i10)));
                    if (iCalculateTimeForDeceleration > 0) {
                        q1Var.b(i4, i10, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b2
    public final View findSnapView(f1 f1Var) {
        int childCount = f1Var.getChildCount();
        View view = null;
        if (childCount != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) f1Var;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                m0 m0VarOuw = ouw(f1Var);
                int i4 = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayoutManager.getChildAt(i10);
                    int iAbs = Math.abs(m0VarOuw.e(childAt));
                    if (iAbs < i4) {
                        view = childAt;
                        i4 = iAbs;
                    }
                }
                return view;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int findTargetSnapPosition(f1 f1Var, int i4, int i10) {
        View viewFindSnapView = findSnapView(f1Var);
        int i11 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = f1Var.getPosition(viewFindSnapView);
        if (f1Var.canScrollVertically()) {
            i11 = i10 < 0 ? position - 1 : position + 1;
        }
        return Math.min(f1Var.getItemCount() - 1, Math.max(i11, 0));
    }

    private static int ouw(View view, m0 m0Var) {
        int iE = m0Var.e(view);
        return iE >= m0Var.k() / 2 ? iE - m0Var.k() : iE;
    }

    private m0 ouw(f1 f1Var) {
        m0 m0Var = this.ouw;
        if (m0Var == null || m0Var.f1452a != f1Var) {
            this.ouw = new l0(f1Var, 1);
        }
        return this.ouw;
    }
}
