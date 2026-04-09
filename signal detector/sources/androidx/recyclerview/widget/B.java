package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class B extends C0327y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f5276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(k0 k0Var, Context context, int i) {
        super(context);
        this.f5275a = i;
        this.f5276b = k0Var;
    }

    @Override // androidx.recyclerview.widget.C0327y
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f5275a) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // androidx.recyclerview.widget.C0327y
    public int calculateTimeForScrolling(int i) {
        switch (this.f5275a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i));
            default:
                return super.calculateTimeForScrolling(i);
        }
    }

    @Override // androidx.recyclerview.widget.C0327y, androidx.recyclerview.widget.c0
    public final void onTargetFound(View view, d0 d0Var, a0 a0Var) {
        switch (this.f5275a) {
            case 0:
                C c6 = (C) this.f5276b;
                int[] iArrCalculateDistanceToFinalSnap = c6.calculateDistanceToFinalSnap(c6.mRecyclerView.getLayoutManager(), view);
                int i = iArrCalculateDistanceToFinalSnap[0];
                int i3 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i3)));
                if (iCalculateTimeForDeceleration > 0) {
                    a0Var.b(i, i3, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    break;
                }
                break;
            default:
                k0 k0Var = this.f5276b;
                RecyclerView recyclerView = k0Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = k0Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i6 = iArrCalculateDistanceToFinalSnap2[0];
                    int i7 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i6), Math.abs(i7)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        a0Var.b(i6, i7, iCalculateTimeForDeceleration2, this.mDecelerateInterpolator);
                        break;
                    }
                }
                break;
        }
    }
}
