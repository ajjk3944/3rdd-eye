package ee;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f8141h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f8142b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8143c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8144d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8145e;

    /* renamed from: f, reason: collision with root package name */
    public float f8146f;

    /* renamed from: g, reason: collision with root package name */
    public float f8147g;

    public q(float f10, float f11, float f12, float f13) {
        this.f8142b = f10;
        this.f8143c = f11;
        this.f8144d = f12;
        this.f8145e = f13;
    }

    @Override // ee.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8150a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f10 = this.f8144d;
        float f11 = this.f8145e;
        RectF rectF = f8141h;
        rectF.set(this.f8142b, this.f8143c, f10, f11);
        path.arcTo(rectF, this.f8146f, this.f8147g, false);
        path.transform(matrix);
    }
}
