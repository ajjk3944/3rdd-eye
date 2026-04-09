package y1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class f0 extends e0 {
    @Override // y1.w
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // y1.c0, y1.w
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // y1.w
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // y1.e0, y1.w
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // y1.a0, y1.w
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // y1.a0, y1.w
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
