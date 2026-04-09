package a9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import r8.v;
import r8.z;
import u8.r;

/* loaded from: classes.dex */
public final class k extends b {
    public final RectF D;
    public final l E;
    public final float[] F;
    public final Path G;
    public final h H;
    public r I;
    public r J;

    public k(v vVar, h hVar) {
        super(vVar, hVar);
        this.D = new RectF();
        l lVar = new l();
        this.E = lVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = hVar;
        lVar.setAlpha(0);
        lVar.setStyle(Paint.Style.FILL);
        lVar.setColor(hVar.f257l);
    }

    @Override // a9.b, t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        h hVar = this.H;
        float f10 = hVar.j;
        float f11 = hVar.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f10, f11);
        this.f234n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // a9.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        if (obj == z.I) {
            this.I = new r(eVar, null);
        } else if (obj == 1) {
            this.J = new r(eVar, null);
        }
    }

    @Override // a9.b
    public final void k(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        h hVar = this.H;
        int iAlpha = Color.alpha(hVar.f257l);
        if (iAlpha == 0) {
            return;
        }
        r rVar = this.J;
        Integer num = rVar == null ? null : (Integer) rVar.f();
        l lVar = this.E;
        if (num != null) {
            lVar.setColor(num.intValue());
        } else {
            lVar.setColor(hVar.f257l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f243w.f23496p == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        lVar.setAlpha(iIntValue);
        if (aVar == null || Color.alpha(aVar.f7979d) <= 0) {
            lVar.clearShadowLayer();
        } else {
            lVar.setShadowLayer(Math.max(aVar.f7976a, Float.MIN_VALUE), aVar.f7977b, aVar.f7978c, aVar.f7979d);
        }
        r rVar2 = this.I;
        if (rVar2 != null) {
            lVar.setColorFilter((ColorFilter) rVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = hVar.j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = hVar.k;
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
            canvas.drawPath(path, lVar);
        }
    }
}
