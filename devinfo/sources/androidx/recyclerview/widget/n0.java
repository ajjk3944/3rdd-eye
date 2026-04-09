package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f1466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(b2 b2Var, Context context, int i4) {
        super(context);
        this.f1465a = i4;
        this.f1466b = b2Var;
    }

    @Override // androidx.recyclerview.widget.k0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i4;
        switch (this.f1465a) {
            case 0:
                i4 = displayMetrics.densityDpi;
                break;
            default:
                i4 = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i4;
    }

    @Override // androidx.recyclerview.widget.k0
    public int calculateTimeForScrolling(int i4) {
        switch (this.f1465a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i4));
            default:
                return super.calculateTimeForScrolling(i4);
        }
    }

    @Override // androidx.recyclerview.widget.k0, androidx.recyclerview.widget.s1
    public final void onTargetFound(View view, t1 t1Var, q1 q1Var) {
        switch (this.f1465a) {
            case 0:
                o0 o0Var = (o0) this.f1466b;
                int[] iArrCalculateDistanceToFinalSnap = o0Var.calculateDistanceToFinalSnap(o0Var.mRecyclerView.getLayoutManager(), view);
                int i4 = iArrCalculateDistanceToFinalSnap[0];
                int i10 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i10)));
                if (iCalculateTimeForDeceleration > 0) {
                    q1Var.b(i4, i10, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    break;
                }
                break;
            default:
                b2 b2Var = this.f1466b;
                RecyclerView recyclerView = b2Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = b2Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i11 = iArrCalculateDistanceToFinalSnap2[0];
                    int i12 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        q1Var.b(i11, i12, iCalculateTimeForDeceleration2, this.mDecelerateInterpolator);
                        break;
                    }
                }
                break;
        }
    }
}
