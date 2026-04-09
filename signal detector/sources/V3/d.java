package v3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public final class d implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f23854a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23855b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23856c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f23857d;

    public d(f fVar) {
        this.f23857d = fVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        this.f23857d.f23883p = f2;
        float[] fArr = this.f23854a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f23855b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f5 = fArr2[i];
            float f6 = fArr[i];
            fArr2[i] = AbstractC1135f5.h(f5, f6, f2, f6);
        }
        Matrix matrix = this.f23856c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
