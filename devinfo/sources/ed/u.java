package ed;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends v {

    /* renamed from: b, reason: collision with root package name */
    public float f23376b;

    /* renamed from: c, reason: collision with root package name */
    public float f23377c;

    @Override // ed.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f23378a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f23376b, this.f23377c);
        path.transform(matrix);
    }
}
