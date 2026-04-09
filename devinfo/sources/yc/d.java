package yc;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37540a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f37541b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f37542c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f37543d;

    public d(f fVar) {
        this.f37543d = fVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f37543d.f37559p = f10;
        float[] fArr = this.f37540a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f37541b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i4 = 0; i4 < 9; i4++) {
            float f11 = fArr2[i4];
            float f12 = fArr[i4];
            fArr2[i4] = r5.c.c(f11, f12, f10, f12);
        }
        Matrix matrix = this.f37542c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
