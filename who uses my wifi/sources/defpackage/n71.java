package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n71 extends m71 {
    @Override // defpackage.m71
    public final void T(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.m71
    public final void U(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.m71
    public final void V(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.i41
    public final float l(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.i41
    public final void y(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.m71, defpackage.i41
    public final void z(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
