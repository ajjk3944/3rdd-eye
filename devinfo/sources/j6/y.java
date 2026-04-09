package j6;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // wb.e
    public final float B(View view) {
        return view.getTransitionAlpha();
    }

    @Override // wb.e
    public final void J(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // j6.x, wb.e
    public final void K(int i4, View view) {
        view.setTransitionVisibility(i4);
    }

    @Override // j6.x
    public final void c0(View view, int i4, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i4, i10, i11, i12);
    }

    @Override // j6.x
    public final void d0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // j6.x
    public final void e0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
