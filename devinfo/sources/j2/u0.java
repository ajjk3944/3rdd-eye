package j2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f27326a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27327b = new int[2];

    @Override // j2.s0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f27326a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f27327b;
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i4, iArr[1] - i10);
        p1.z.s(fArr, matrix);
    }
}
