package n9;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends a {
    public final int B;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f29877w = true;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f29878x = true;

    /* renamed from: y, reason: collision with root package name */
    public final float f29879y = 10.0f;

    /* renamed from: z, reason: collision with root package name */
    public final float f29880z = 10.0f;
    public final int A = 1;
    public final float C = Float.POSITIVE_INFINITY;

    public h(int i4) {
        this.B = i4;
        this.f29852c = 0.0f;
    }

    @Override // n9.a
    public final void a(float f10, float f11) {
        if (Math.abs(f11 - f10) == 0.0f) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        float fAbs = Math.abs(f11 - f10);
        float f12 = f10 - ((fAbs / 100.0f) * this.f29880z);
        this.f29848u = f12;
        float f13 = ((fAbs / 100.0f) * this.f29879y) + f11;
        this.f29847t = f13;
        this.f29849v = Math.abs(f12 - f13);
    }

    public final float d(Paint paint) {
        paint.setTextSize(this.f29853d);
        String strB = b();
        DisplayMetrics displayMetrics = w9.g.f36555a;
        float fMeasureText = (this.f29851b * 2.0f) + ((int) paint.measureText(strB));
        float fC = this.C;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = w9.g.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }
}
