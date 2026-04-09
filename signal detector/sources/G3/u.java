package G3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1653h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1654b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1655c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1656d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1657e;

    /* renamed from: f, reason: collision with root package name */
    public float f1658f;

    /* renamed from: g, reason: collision with root package name */
    public float f1659g;

    public u(float f2, float f5, float f6, float f7) {
        this.f1654b = f2;
        this.f1655c = f5;
        this.f1656d = f6;
        this.f1657e = f7;
    }

    @Override // G3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1662a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f2 = this.f1656d;
        float f5 = this.f1657e;
        RectF rectF = f1653h;
        rectF.set(this.f1654b, this.f1655c, f2, f5);
        path.arcTo(rectF, this.f1658f, this.f1659g, false);
        path.transform(matrix);
    }
}
