package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class e9 extends f74 {
    public final d9 i;
    public final uk1 j;
    public final Paint k;
    public final Paint l;
    public final Paint m;

    public e9(u61 u61Var, uk1 uk1Var, d9 d9Var) {
        super(4, u61Var);
        this.j = uk1Var;
        this.i = d9Var;
        if (u61Var != null) {
            this.l = new Paint(1);
            Paint paint = new Paint();
            this.k = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.m = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            new Paint(1).setStyle(style);
        }
    }

    public void U1(float f, float f2) {
        u61 u61Var = (u61) this.g;
        if (u61Var != null) {
            RectF rectF = u61Var.b;
            if (rectF.width() > 10.0f) {
                float f3 = u61Var.j;
                float f4 = u61Var.e;
                if (f3 > f4 || f4 > 1.0f) {
                    float f5 = rectF.left;
                    float f6 = rectF.top;
                    uk1 uk1Var = this.j;
                    uk1Var.getClass();
                    ni0 ni0Var = z90.i;
                    z90 z90Var = (z90) ni0Var.b();
                    z90Var.g = 0.0d;
                    z90Var.h = 0.0d;
                    uk1Var.b(f5, f6, z90Var);
                    float f7 = rectF.left;
                    float f8 = rectF.bottom;
                    z90 z90Var2 = (z90) ni0Var.b();
                    z90Var2.g = 0.0d;
                    z90Var2.h = 0.0d;
                    uk1Var.b(f7, f8, z90Var2);
                    f = (float) z90Var2.h;
                    f2 = (float) z90Var.h;
                    ni0Var.c(z90Var);
                    ni0Var.c(z90Var2);
                }
            }
        }
        V1(f, f2);
    }

    public void V1(float f, float f2) {
        double dFloor;
        int i;
        float f3 = f;
        d9 d9Var = this.i;
        int i2 = d9Var.n;
        double dAbs = Math.abs(f2 - f3);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            d9Var.k = new float[0];
            d9Var.l = 0;
            return;
        }
        double d = k41.d(dAbs / i2);
        double d2 = k41.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d2)) > 5) {
            d = Math.floor(d2 * 10.0d);
        }
        if (d9Var.o) {
            d = ((float) dAbs) / (i2 - 1);
            d9Var.l = i2;
            if (d9Var.k.length < i2) {
                d9Var.k = new float[i2];
            }
            for (int i3 = 0; i3 < i2; i3++) {
                d9Var.k[i3] = f3;
                f3 = (float) (f3 + d);
            }
        } else {
            double dCeil = d == 0.0d ? 0.0d : Math.ceil(f3 / d) * d;
            if (d == 0.0d) {
                dFloor = 0.0d;
            } else {
                dFloor = Math.floor(f2 / d) * d;
                if (dFloor != Double.POSITIVE_INFINITY) {
                    double d3 = dFloor + 0.0d;
                    dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1L : -1L));
                }
            }
            if (d != 0.0d) {
                i = 0;
                for (double d4 = dCeil; d4 <= dFloor; d4 += d) {
                    i++;
                }
            } else {
                i = 0;
            }
            d9Var.l = i;
            if (d9Var.k.length < i) {
                d9Var.k = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                d9Var.k[i4] = (float) dCeil;
                dCeil += d;
            }
        }
        if (d < 1.0d) {
            d9Var.m = (int) Math.ceil(-Math.log10(d));
        } else {
            d9Var.m = 0;
        }
    }
}
