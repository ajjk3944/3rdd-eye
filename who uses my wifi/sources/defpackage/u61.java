package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u61 {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public final float e = 1.0f;
    public final float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = Float.MAX_VALUE;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public final Matrix n = new Matrix();
    public final float[] o = new float[9];

    public final void a(float[] fArr, View view) {
        Matrix matrix = this.n;
        matrix.reset();
        matrix.set(this.a);
        float f = fArr[0];
        RectF rectF = this.b;
        matrix.postTranslate(-(f - rectF.left), -(fArr[1] - rectF.top));
        e(matrix, view, true);
    }

    public final boolean b(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean c(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final void d(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.i = Math.min(Math.max(this.g, f2), this.h);
        this.j = Math.min(Math.max(this.e, f4), this.f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.k = Math.min(Math.max(f, ((this.i - 1.0f) * (-fWidth)) - this.l), this.l);
        float fMax = Math.max(Math.min(f3, ((this.j - 1.0f) * fHeight) + this.m), -this.m);
        fArr[2] = this.k;
        fArr[0] = this.i;
        fArr[5] = fMax;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final void e(Matrix matrix, View view, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        d(matrix2, this.b);
        if (z) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
