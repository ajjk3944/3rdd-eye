package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class db1 extends e9 {
    public cb1 n;
    public Path o;
    public float[] p;
    public RectF q;
    public float[] r;

    @Override // defpackage.e9
    public final void U1(float f, float f2) {
        u61 u61Var = (u61) this.g;
        RectF rectF = u61Var.b;
        RectF rectF2 = u61Var.b;
        if (rectF.width() > 10.0f) {
            float f3 = u61Var.i;
            float f4 = u61Var.g;
            if (f3 > f4 || f4 > 1.0f) {
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                uk1 uk1Var = this.j;
                uk1Var.getClass();
                ni0 ni0Var = z90.i;
                z90 z90Var = (z90) ni0Var.b();
                z90Var.g = 0.0d;
                z90Var.h = 0.0d;
                uk1Var.b(f5, f6, z90Var);
                float f7 = rectF2.right;
                float f8 = rectF2.top;
                z90 z90Var2 = (z90) ni0Var.b();
                z90Var2.g = 0.0d;
                z90Var2.h = 0.0d;
                uk1Var.b(f7, f8, z90Var2);
                f = (float) z90Var.g;
                f2 = (float) z90Var2.g;
                ni0Var.c(z90Var);
                ni0Var.c(z90Var2);
            }
        }
        V1(f, f2);
    }

    @Override // defpackage.e9
    public final void V1(float f, float f2) {
        super.V1(f, f2);
        cb1 cb1Var = this.n;
        String strB = cb1Var.b();
        Paint paint = this.l;
        paint.setTypeface(null);
        paint.setTextSize(cb1Var.d);
        xt xtVarB = k41.b(paint, strB);
        float f3 = xtVarB.g;
        float fA = k41.a(paint, "Q");
        double d = 0.0f;
        float fAbs = Math.abs(((float) Math.sin(d)) * fA) + Math.abs(((float) Math.cos(d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(d)) * fA) + Math.abs(((float) Math.sin(d)) * f3);
        ni0 ni0Var = xt.i;
        xt xtVar = (xt) ni0Var.b();
        xtVar.g = fAbs;
        xtVar.h = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(xtVar.g);
        cb1Var.y = Math.round(xtVar.h);
        ni0Var.c(xtVar);
        ni0Var.c(xtVarB);
    }

    public final void W1(Canvas canvas, float f, aa0 aa0Var) {
        cb1 cb1Var = this.n;
        cb1Var.getClass();
        int i = cb1Var.l * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = cb1Var.k[i3 / 2];
        }
        this.j.e(fArr);
        int i4 = 0;
        while (i4 < i) {
            float f2 = fArr[i4];
            u61 u61Var = (u61) this.g;
            if (u61Var.b(f2) && u61Var.c(f2)) {
                String strA = cb1Var.c().a(cb1Var.k[i4 / 2]);
                Paint.FontMetrics fontMetrics = k41.i;
                Paint paint = this.l;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                paint.getTextBounds(strA, i2, strA.length(), k41.h);
                float fWidth = 0.0f - r13.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (aa0Var.g != 0.0f || aa0Var.h != 0.0f) {
                    fWidth -= r13.width() * aa0Var.g;
                    f3 -= fontMetrics2 * aa0Var.h;
                }
                canvas.drawText(strA, fWidth + f2, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
            i4 += 2;
            i2 = 0;
        }
    }

    public final void X1(Canvas canvas) {
        u61 u61Var = (u61) this.g;
        cb1 cb1Var = this.n;
        if (cb1Var.p && cb1Var.a) {
            int iSave = canvas.save();
            RectF rectF = this.q;
            RectF rectF2 = u61Var.b;
            RectF rectF3 = u61Var.b;
            rectF.set(rectF2);
            d9 d9Var = this.i;
            rectF.inset(-d9Var.h, 0.0f);
            canvas.clipRect(rectF);
            if (this.p.length != d9Var.l * 2) {
                this.p = new float[cb1Var.l * 2];
            }
            float[] fArr = this.p;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = cb1Var.k;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.j.e(fArr);
            int i3 = cb1Var.g;
            Paint paint = this.k;
            paint.setColor(i3);
            paint.setStrokeWidth(cb1Var.h);
            paint.setPathEffect(null);
            Path path = this.o;
            path.reset();
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                float f = fArr[i4];
                float f2 = fArr[i4 + 1];
                path.moveTo(f, rectF3.bottom);
                path.lineTo(f, rectF3.top);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }
}
