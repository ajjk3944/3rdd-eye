package y1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class w0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f25790a = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f25791d = new int[2];

    @Override // y1.v0
    public void U(View view, float[] fArr) {
        Matrix matrix = this.f25790a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f25791d;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        g1.f0.n(fArr, matrix);
    }
}
