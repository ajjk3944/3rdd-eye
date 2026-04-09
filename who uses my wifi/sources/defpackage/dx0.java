package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dx0 extends da {
    public final RectF D;
    public final d50 E;
    public final float[] F;
    public final Path G;
    public final f50 H;
    public m41 I;
    public m41 J;

    public dx0(i90 i90Var, f50 f50Var) {
        super(i90Var, f50Var);
        this.D = new RectF();
        d50 d50Var = new d50();
        this.E = d50Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = f50Var;
        d50Var.setAlpha(0);
        d50Var.setStyle(Paint.Style.FILL);
        d50Var.setColor(f50Var.l);
    }

    @Override // defpackage.da, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        if (obj == n90.F) {
            this.I = new m41(null, vq2Var);
        } else if (obj == 1) {
            this.J = new m41(null, vq2Var);
        }
    }

    @Override // defpackage.da, defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        f50 f50Var = this.H;
        float f = f50Var.j;
        float f2 = f50Var.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.da
    public final void k(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        f50 f50Var = this.H;
        int iAlpha = Color.alpha(f50Var.l);
        if (iAlpha == 0) {
            return;
        }
        m41 m41Var = this.J;
        Integer num = m41Var == null ? null : (Integer) m41Var.e();
        d50 d50Var = this.E;
        if (num != null) {
            d50Var.setColor(num.intValue());
        } else {
            d50Var.setColor(f50Var.l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.w.j == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        d50Var.setAlpha(iIntValue);
        if (mqVar == null || Color.alpha(mqVar.d) <= 0) {
            d50Var.clearShadowLayer();
        } else {
            d50Var.setShadowLayer(Math.max(mqVar.a, Float.MIN_VALUE), mqVar.b, mqVar.c, mqVar.d);
        }
        m41 m41Var2 = this.I;
        if (m41Var2 != null) {
            d50Var.setColorFilter((ColorFilter) m41Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = f50Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = f50Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, d50Var);
        }
    }
}
