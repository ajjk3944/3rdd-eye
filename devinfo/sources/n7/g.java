package n7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import f7.b0;
import f7.x;
import i7.s;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends a {
    public final RectF D;
    public final g7.a E;
    public final float[] F;
    public final Path G;
    public final d H;
    public s I;
    public s J;

    public g(x xVar, d dVar) {
        super(xVar, dVar);
        this.D = new RectF();
        g7.a aVar = new g7.a();
        this.E = aVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.f29812l);
    }

    @Override // n7.a, h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        d dVar = this.H;
        float f10 = dVar.j;
        float f11 = dVar.f29811k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f10, f11);
        this.f29790n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // n7.a, k7.f
    public final void f(Object obj, o oVar) {
        super.f(obj, oVar);
        if (obj == b0.I) {
            this.I = new s(null, oVar);
        } else if (obj == 1) {
            this.J = new s(null, oVar);
        }
    }

    @Override // n7.a
    public final void k(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        d dVar = this.H;
        int iAlpha = Color.alpha(dVar.f29812l);
        if (iAlpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.e();
        g7.a aVar = this.E;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(dVar.f29812l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f29799w.f25922p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i4 / 255.0f) * 255.0f);
        aVar.setAlpha(iIntValue);
        if (bVar == null || Color.alpha(bVar.f32849d) <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(bVar.f32846a, Float.MIN_VALUE), bVar.f32847b, bVar.f32848c, bVar.f32849d);
        }
        s sVar2 = this.I;
        if (sVar2 != null) {
            aVar.setColorFilter((ColorFilter) sVar2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = dVar.j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = dVar.f29811k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
