package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    public l0 f1472a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f1473b;

    public static int a(View view, m0 m0Var) {
        return ((m0Var.c(view) / 2) + m0Var.e(view)) - ((m0Var.l() / 2) + m0Var.k());
    }

    public static View b(f1 f1Var, m0 m0Var) {
        int childCount = f1Var.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (m0Var.l() / 2) + m0Var.k();
        int i4 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f1Var.getChildAt(i10);
            int iAbs = Math.abs(((m0Var.c(childAt) / 2) + m0Var.e(childAt)) - iL);
            if (iAbs < i4) {
                view = childAt;
                i4 = iAbs;
            }
        }
        return view;
    }

    public final m0 c(f1 f1Var) {
        l0 l0Var = this.f1473b;
        if (l0Var == null || l0Var.f1452a != f1Var) {
            this.f1473b = new l0(f1Var, 0);
        }
        return this.f1473b;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int[] calculateDistanceToFinalSnap(f1 f1Var, View view) {
        int[] iArr = new int[2];
        if (f1Var.canScrollHorizontally()) {
            iArr[0] = a(view, c(f1Var));
        } else {
            iArr[0] = 0;
        }
        if (f1Var.canScrollVertically()) {
            iArr[1] = a(view, d(f1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.b2
    public final s1 createScroller(f1 f1Var) {
        if (f1Var instanceof r1) {
            return new n0(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final m0 d(f1 f1Var) {
        l0 l0Var = this.f1472a;
        if (l0Var == null || l0Var.f1452a != f1Var) {
            this.f1472a = new l0(f1Var, 1);
        }
        return this.f1472a;
    }

    @Override // androidx.recyclerview.widget.b2
    public final View findSnapView(f1 f1Var) {
        if (f1Var.canScrollVertically()) {
            return b(f1Var, d(f1Var));
        }
        if (f1Var.canScrollHorizontally()) {
            return b(f1Var, c(f1Var));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b2
    public final int findTargetSnapPosition(f1 f1Var, int i4, int i10) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = f1Var.getItemCount();
        if (itemCount != 0) {
            View view = null;
            m0 m0VarD = f1Var.canScrollVertically() ? d(f1Var) : f1Var.canScrollHorizontally() ? c(f1Var) : null;
            if (m0VarD != null) {
                int childCount = f1Var.getChildCount();
                boolean z3 = false;
                int i11 = Integer.MAX_VALUE;
                int i12 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = f1Var.getChildAt(i13);
                    if (childAt != null) {
                        int iA = a(childAt, m0VarD);
                        if (iA <= 0 && iA > i12) {
                            view2 = childAt;
                            i12 = iA;
                        }
                        if (iA >= 0 && iA < i11) {
                            view = childAt;
                            i11 = iA;
                        }
                    }
                }
                boolean z10 = !f1Var.canScrollHorizontally() ? i10 <= 0 : i4 <= 0;
                if (z10 && view != null) {
                    return f1Var.getPosition(view);
                }
                if (!z10 && view2 != null) {
                    return f1Var.getPosition(view2);
                }
                if (z10) {
                    view = view2;
                }
                if (view != null) {
                    int position = f1Var.getPosition(view);
                    int itemCount2 = f1Var.getItemCount();
                    if ((f1Var instanceof r1) && (pointFComputeScrollVectorForPosition = ((r1) f1Var).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z3 = true;
                    }
                    int i14 = position + (z3 == z10 ? -1 : 1);
                    if (i14 >= 0 && i14 < itemCount) {
                        return i14;
                    }
                }
            }
        }
        return -1;
    }
}
