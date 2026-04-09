package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fb1 extends e9 {
    public final eb1 n;
    public final Path o;
    public final RectF p;
    public float[] q;
    public final Path r;
    public final float[] s;

    public fb1(u61 u61Var, eb1 eb1Var, uk1 uk1Var) {
        super(u61Var, uk1Var, eb1Var);
        this.o = new Path();
        this.p = new RectF();
        this.q = new float[2];
        new Path();
        new RectF();
        this.r = new Path();
        this.s = new float[2];
        new RectF();
        this.n = eb1Var;
        if (u61Var != null) {
            this.l.setColor(-16777216);
            this.l.setTextSize(k41.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final float[] W1() {
        int length = this.q.length;
        eb1 eb1Var = this.n;
        int i = eb1Var.l;
        if (length != i * 2) {
            this.q = new float[i * 2];
        }
        float[] fArr = this.q;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = eb1Var.k[i2 / 2];
        }
        this.j.e(fArr);
        return fArr;
    }

    public final void X1(Canvas canvas) {
        float f;
        float f2;
        float f3;
        u61 u61Var = (u61) this.g;
        eb1 eb1Var = this.n;
        if (eb1Var.a && eb1Var.r) {
            float[] fArrW1 = W1();
            Paint paint = this.l;
            paint.setTypeface(null);
            paint.setTextSize(eb1Var.d);
            paint.setColor(eb1Var.e);
            float f4 = eb1Var.b;
            float fA = (k41.a(paint, "A") / 2.5f) + eb1Var.c;
            int i = eb1Var.D;
            int i2 = eb1Var.C;
            if (i == 1) {
                if (i2 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = u61Var.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = u61Var.b.left;
                    f3 = f2 + f4;
                }
            } else if (i2 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = u61Var.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = u61Var.b.right;
                f3 = f - f4;
            }
            int i3 = !eb1Var.y ? 1 : 0;
            int i4 = eb1Var.z ? eb1Var.l : eb1Var.l - 1;
            while (i3 < i4) {
                canvas.drawText((i3 < 0 || i3 >= eb1Var.k.length) ? "" : eb1Var.c().a(eb1Var.k[i3]), f3, fArrW1[(i3 * 2) + 1] + fA, paint);
                i3++;
            }
        }
    }

    public final void Y1(Canvas canvas) {
        u61 u61Var = (u61) this.g;
        eb1 eb1Var = this.n;
        if (eb1Var.a && eb1Var.q) {
            int i = eb1Var.i;
            Paint paint = this.m;
            paint.setColor(i);
            paint.setStrokeWidth(eb1Var.j);
            if (eb1Var.D == 1) {
                RectF rectF = u61Var.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = u61Var.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void Z1(Canvas canvas) {
        u61 u61Var = (u61) this.g;
        eb1 eb1Var = this.n;
        if (eb1Var.a && eb1Var.p) {
            int iSave = canvas.save();
            RectF rectF = u61Var.b;
            RectF rectF2 = u61Var.b;
            RectF rectF3 = this.p;
            rectF3.set(rectF);
            rectF3.inset(0.0f, -this.i.h);
            canvas.clipRect(rectF3);
            float[] fArrW1 = W1();
            int i = eb1Var.g;
            Paint paint = this.k;
            paint.setColor(i);
            paint.setStrokeWidth(eb1Var.h);
            paint.setPathEffect(null);
            Path path = this.o;
            path.reset();
            for (int i2 = 0; i2 < fArrW1.length; i2 += 2) {
                int i3 = i2 + 1;
                path.moveTo(rectF2.left, fArrW1[i3]);
                path.lineTo(rectF2.right, fArrW1[i3]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void a2() {
        ArrayList arrayList = this.n.s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.s;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.r.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }
}
