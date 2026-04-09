package defpackage;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eb1 extends d9 {
    public final int D;
    public final boolean y = true;
    public final boolean z = true;
    public float A = 10.0f;
    public float B = 10.0f;
    public int C = 1;
    public final float E = Float.POSITIVE_INFINITY;

    public eb1(int i) {
        this.D = i;
        this.c = 0.0f;
    }

    @Override // defpackage.d9
    public final void a(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        float f3 = this.u ? this.w : f - ((fAbs / 100.0f) * this.B);
        this.w = f3;
        float f4 = ((fAbs / 100.0f) * this.A) + f2;
        this.v = f4;
        this.x = Math.abs(f3 - f4);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.d);
        String strB = b();
        DisplayMetrics displayMetrics = k41.a;
        float fMeasureText = (this.b * 2.0f) + ((int) paint.measureText(strB));
        float fC = this.E;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = k41.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }
}
