package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: h, reason: collision with root package name */
    public n9.g f36021h;

    /* renamed from: i, reason: collision with root package name */
    public Path f36022i;
    public float[] j;

    /* renamed from: k, reason: collision with root package name */
    public RectF f36023k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f36024l;

    @Override // v9.a
    public final void C(float f10, float f11) {
        w9.h hVar = (w9.h) this.f218b;
        RectF rectF = hVar.f36564b;
        RectF rectF2 = hVar.f36564b;
        if (rectF.width() > 10.0f) {
            float f12 = hVar.f36570i;
            float f13 = hVar.g;
            if (f12 > f13 || f13 > 1.0f) {
                float f14 = rectF2.left;
                float f15 = rectF2.top;
                pe.c cVar = this.f35980d;
                cVar.getClass();
                w9.f fVar = w9.c.f36542d;
                w9.c cVar2 = (w9.c) fVar.b();
                cVar2.f36543b = 0.0d;
                cVar2.f36544c = 0.0d;
                cVar.c(f14, f15, cVar2);
                float f16 = rectF2.right;
                float f17 = rectF2.top;
                w9.c cVar3 = (w9.c) fVar.b();
                cVar3.f36543b = 0.0d;
                cVar3.f36544c = 0.0d;
                cVar.c(f16, f17, cVar3);
                f10 = (float) cVar2.f36543b;
                f11 = (float) cVar3.f36543b;
                fVar.c(cVar2);
                fVar.c(cVar3);
            }
        }
        D(f10, f11);
    }

    @Override // v9.a
    public final void D(float f10, float f11) {
        super.D(f10, f11);
        n9.g gVar = this.f36021h;
        String strB = gVar.b();
        Paint paint = this.f35982f;
        paint.setTypeface(null);
        paint.setTextSize(gVar.f29853d);
        w9.b bVarB = w9.g.b(paint, strB);
        float f12 = bVarB.f36540b;
        float fA = w9.g.a(paint, "Q");
        double d10 = 0.0f;
        float fAbs = Math.abs(((float) Math.sin(d10)) * fA) + Math.abs(((float) Math.cos(d10)) * f12);
        float fAbs2 = Math.abs(((float) Math.cos(d10)) * fA) + Math.abs(((float) Math.sin(d10)) * f12);
        w9.f fVar = w9.b.f36539d;
        w9.b bVar = (w9.b) fVar.b();
        bVar.f36540b = fAbs;
        bVar.f36541c = fAbs2;
        Math.round(f12);
        Math.round(fA);
        Math.round(bVar.f36540b);
        gVar.f29875w = Math.round(bVar.f36541c);
        fVar.c(bVar);
        fVar.c(bVarB);
    }

    public final void E(Canvas canvas, float f10, w9.d dVar) {
        n9.g gVar = this.f36021h;
        gVar.getClass();
        int i4 = gVar.f29839l * 2;
        float[] fArr = new float[i4];
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11 += 2) {
            fArr[i11] = gVar.f29838k[i11 / 2];
        }
        this.f35980d.f(fArr);
        int i12 = 0;
        while (i12 < i4) {
            float f11 = fArr[i12];
            w9.h hVar = (w9.h) this.f218b;
            if (hVar.b(f11) && hVar.c(f11)) {
                String strA = gVar.c().a(gVar.f29838k[i12 / 2]);
                Paint.FontMetrics fontMetrics = w9.g.j;
                Paint paint = this.f35982f;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                paint.getTextBounds(strA, i10, strA.length(), w9.g.f36562i);
                float fWidth = 0.0f - r13.left;
                float f12 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (dVar.f36546b != 0.0f || dVar.f36547c != 0.0f) {
                    fWidth -= r13.width() * dVar.f36546b;
                    f12 -= fontMetrics2 * dVar.f36547c;
                }
                canvas.drawText(strA, fWidth + f11, f12 + f10, paint);
                paint.setTextAlign(textAlign);
            }
            i12 += 2;
            i10 = 0;
        }
    }

    public final void F(Canvas canvas) {
        w9.h hVar = (w9.h) this.f218b;
        n9.g gVar = this.f36021h;
        if (gVar.f29842o && gVar.f29850a) {
            int iSave = canvas.save();
            RectF rectF = this.f36023k;
            RectF rectF2 = hVar.f36564b;
            RectF rectF3 = hVar.f36564b;
            rectF.set(rectF2);
            n9.a aVar = this.f35979c;
            rectF.inset(-aVar.f29836h, 0.0f);
            canvas.clipRect(rectF);
            if (this.j.length != aVar.f29839l * 2) {
                this.j = new float[gVar.f29839l * 2];
            }
            float[] fArr = this.j;
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                float[] fArr2 = gVar.f29838k;
                int i10 = i4 / 2;
                fArr[i4] = fArr2[i10];
                fArr[i4 + 1] = fArr2[i10];
            }
            this.f35980d.f(fArr);
            int i11 = gVar.g;
            Paint paint = this.f35981e;
            paint.setColor(i11);
            paint.setStrokeWidth(gVar.f29836h);
            paint.setPathEffect(null);
            Path path = this.f36022i;
            path.reset();
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                float f10 = fArr[i12];
                float f11 = fArr[i12 + 1];
                path.moveTo(f10, rectF3.bottom);
                path.lineTo(f10, rectF3.top);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }
}
