package wd;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f24442a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f24443b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f24444c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f24445d;

    public e(h hVar) {
        this.f24445d = hVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f24445d.f24462p = f10;
        float[] fArr = this.f24442a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f24443b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = c7.a.a(f11, f12, f10, f12);
        }
        Matrix matrix = this.f24444c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
