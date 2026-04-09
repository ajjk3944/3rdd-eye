package K1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // K1.t
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // K1.t
    public final void b(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // K1.x, K1.t
    public final void c(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // K1.v
    public final void d(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // K1.v
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // K1.w
    public final void f(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }
}
