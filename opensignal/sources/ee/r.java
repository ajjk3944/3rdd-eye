package ee;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f8148b;

    /* renamed from: c, reason: collision with root package name */
    public float f8149c;

    @Override // ee.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8150a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f8148b, this.f8149c);
        path.transform(matrix);
    }
}
