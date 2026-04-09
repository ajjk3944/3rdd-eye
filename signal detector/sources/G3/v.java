package G3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public float f1660b;

    /* renamed from: c, reason: collision with root package name */
    public float f1661c;

    @Override // G3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1662a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1660b, this.f1661c);
        path.transform(matrix);
    }
}
