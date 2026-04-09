package B3;

import android.graphics.Matrix;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f654a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f655b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f656c;

    public s() {
        this.f654a = new float[2];
        this.f655b = new float[]{1.0f, 0.0f};
        this.f656c = new Matrix();
    }

    public final void a(float f2) {
        float[] fArr = this.f655b;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f654a;
        double d6 = f2;
        double d7 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d7) * d6) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d7) * d6) + fArr2[1]);
    }

    public final void b() {
        Arrays.fill(this.f654a, 0.0f);
        float[] fArr = this.f655b;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.f656c.reset();
    }

    public final void c(float f2) {
        Matrix matrix = this.f656c;
        matrix.reset();
        matrix.setRotate(f2);
        matrix.mapPoints(this.f654a);
        matrix.mapPoints(this.f655b);
    }

    public final void d(float f2) {
        float[] fArr = this.f654a;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f2;
        float[] fArr2 = this.f655b;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f2;
    }

    public final void e(float f2) {
        float[] fArr = this.f654a;
        fArr[0] = fArr[0] + f2;
        fArr[1] = fArr[1] + 0.0f;
    }

    public s(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.f654a = fArr3;
        float[] fArr4 = new float[2];
        this.f655b = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.f656c = new Matrix();
    }
}
