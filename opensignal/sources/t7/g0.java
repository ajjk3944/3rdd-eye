package t7;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class g0 extends f0 {
    @Override // a.a
    public final void B(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // t7.f0, a.a
    public final void C(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // t7.f0
    public final void T(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // t7.f0
    public final void U(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // t7.f0
    public final void V(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a.a
    public final float s(View view) {
        return view.getTransitionAlpha();
    }
}
