package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* loaded from: classes.dex */
public class C extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public C0328z f5277a;

    /* renamed from: b, reason: collision with root package name */
    public C0328z f5278b;

    public static int a(View view, A a6) {
        return ((a6.c(view) / 2) + a6.e(view)) - ((a6.l() / 2) + a6.k());
    }

    public static View b(Q q3, A a6) {
        int childCount = q3.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (a6.l() / 2) + a6.k();
        int i = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = q3.getChildAt(i3);
            int iAbs = Math.abs(((a6.c(childAt) / 2) + a6.e(childAt)) - iL);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final A c(Q q3) {
        C0328z c0328z = this.f5278b;
        if (c0328z == null || c0328z.f5272a != q3) {
            this.f5278b = new C0328z(q3, 0);
        }
        return this.f5278b;
    }

    @Override // androidx.recyclerview.widget.k0
    public final int[] calculateDistanceToFinalSnap(Q q3, View view) {
        int[] iArr = new int[2];
        if (q3.canScrollHorizontally()) {
            iArr[0] = a(view, c(q3));
        } else {
            iArr[0] = 0;
        }
        if (q3.canScrollVertically()) {
            iArr[1] = a(view, d(q3));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.k0
    public final c0 createScroller(Q q3) {
        if (q3 instanceof b0) {
            return new B(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final A d(Q q3) {
        C0328z c0328z = this.f5277a;
        if (c0328z == null || c0328z.f5272a != q3) {
            this.f5277a = new C0328z(q3, 1);
        }
        return this.f5277a;
    }

    @Override // androidx.recyclerview.widget.k0
    public View findSnapView(Q q3) {
        if (q3.canScrollVertically()) {
            return b(q3, d(q3));
        }
        if (q3.canScrollHorizontally()) {
            return b(q3, c(q3));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.k0
    public final int findTargetSnapPosition(Q q3, int i, int i3) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = q3.getItemCount();
        if (itemCount != 0) {
            View view = null;
            A aD = q3.canScrollVertically() ? d(q3) : q3.canScrollHorizontally() ? c(q3) : null;
            if (aD != null) {
                int childCount = q3.getChildCount();
                boolean z6 = false;
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = q3.getChildAt(i8);
                    if (childAt != null) {
                        int iA = a(childAt, aD);
                        if (iA <= 0 && iA > i7) {
                            view2 = childAt;
                            i7 = iA;
                        }
                        if (iA >= 0 && iA < i6) {
                            view = childAt;
                            i6 = iA;
                        }
                    }
                }
                boolean z7 = !q3.canScrollHorizontally() ? i3 <= 0 : i <= 0;
                if (z7 && view != null) {
                    return q3.getPosition(view);
                }
                if (!z7 && view2 != null) {
                    return q3.getPosition(view2);
                }
                if (z7) {
                    view = view2;
                }
                if (view != null) {
                    int position = q3.getPosition(view);
                    int itemCount2 = q3.getItemCount();
                    if ((q3 instanceof b0) && (pointFComputeScrollVectorForPosition = ((b0) q3).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z6 = true;
                    }
                    int i9 = position + (z6 == z7 ? -1 : 1);
                    if (i9 >= 0 && i9 < itemCount) {
                        return i9;
                    }
                }
            }
        }
        return -1;
    }
}
