package k4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public abstract class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21843a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f21844b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f21845c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f21843a);
        matrix2.getValues(this.f21844b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f21844b;
            float f11 = fArr[i10];
            float f12 = this.f21843a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f21845c.setValues(this.f21844b);
        return this.f21845c;
    }
}
