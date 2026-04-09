package w9;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f36563a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f36564b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public float f36565c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f36566d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public final float f36567e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public final float f36568f = Float.MAX_VALUE;
    public float g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f36569h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public float f36570i = 1.0f;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f36571k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f36572l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f36573m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f36574n = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    public final float[] f36575o = new float[9];

    public final void a(View view, float[] fArr) {
        Matrix matrix = this.f36574n;
        matrix.reset();
        matrix.set(this.f36563a);
        float f10 = fArr[0];
        RectF rectF = this.f36564b;
        matrix.postTranslate(-(f10 - rectF.left), -(fArr[1] - rectF.top));
        e(matrix, view, true);
    }

    public final boolean b(float f10) {
        return this.f36564b.left <= f10 + 1.0f;
    }

    public final boolean c(float f10) {
        return this.f36564b.right >= (((float) ((int) (f10 * 100.0f))) / 100.0f) - 1.0f;
    }

    public final void d(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.f36575o;
        matrix.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = fArr[4];
        this.f36570i = Math.min(Math.max(this.g, f11), this.f36569h);
        this.j = Math.min(Math.max(this.f36567e, f13), this.f36568f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.f36571k = Math.min(Math.max(f10, ((this.f36570i - 1.0f) * (-fWidth)) - this.f36572l), this.f36572l);
        float fMax = Math.max(Math.min(f12, ((this.j - 1.0f) * fHeight) + this.f36573m), -this.f36573m);
        fArr[2] = this.f36571k;
        fArr[0] = this.f36570i;
        fArr[5] = fMax;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final void e(Matrix matrix, View view, boolean z3) {
        Matrix matrix2 = this.f36563a;
        matrix2.set(matrix);
        d(matrix2, this.f36564b);
        if (z3) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
