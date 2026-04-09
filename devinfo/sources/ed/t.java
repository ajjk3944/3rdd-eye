package ed;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f23370h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f23371b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23372c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23373d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23374e;

    /* renamed from: f, reason: collision with root package name */
    public float f23375f;
    public float g;

    public t(float f10, float f11, float f12, float f13) {
        this.f23371b = f10;
        this.f23372c = f11;
        this.f23373d = f12;
        this.f23374e = f13;
    }

    @Override // ed.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f23378a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f10 = this.f23373d;
        float f11 = this.f23374e;
        RectF rectF = f23370h;
        rectF.set(this.f23371b, this.f23372c, f10, f11);
        path.arcTo(rectF, this.f23375f, this.g, false);
        path.transform(matrix);
    }
}
