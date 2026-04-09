package L0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class B extends A {
    @Override // L0.A
    public final void J(View view, int i, int i3, int i6, int i7) {
        view.setLeftTopRightBottom(i, i3, i6, i7);
    }

    @Override // L0.A
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // L0.A
    public final void L(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a4.t
    public final float k(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a4.t
    public final void r(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // L0.A, a4.t
    public final void s(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
