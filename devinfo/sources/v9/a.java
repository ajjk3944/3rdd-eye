package v9;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final n9.a f35979c;

    /* renamed from: d, reason: collision with root package name */
    public final pe.c f35980d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f35981e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f35982f;
    public final Paint g;

    public a(w9.h hVar, pe.c cVar, n9.a aVar) {
        super(9, hVar);
        this.f35980d = cVar;
        this.f35979c = aVar;
        if (hVar != null) {
            this.f35982f = new Paint(1);
            Paint paint = new Paint();
            this.f35981e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            new Paint(1).setStyle(style);
        }
    }

    public void C(float f10, float f11) {
        w9.h hVar = (w9.h) this.f218b;
        if (hVar != null) {
            RectF rectF = hVar.f36564b;
            if (rectF.width() > 10.0f) {
                float f12 = hVar.j;
                float f13 = hVar.f36567e;
                if (f12 > f13 || f13 > 1.0f) {
                    float f14 = rectF.left;
                    float f15 = rectF.top;
                    pe.c cVar = this.f35980d;
                    cVar.getClass();
                    w9.f fVar = w9.c.f36542d;
                    w9.c cVar2 = (w9.c) fVar.b();
                    cVar2.f36543b = 0.0d;
                    cVar2.f36544c = 0.0d;
                    cVar.c(f14, f15, cVar2);
                    float f16 = rectF.left;
                    float f17 = rectF.bottom;
                    w9.c cVar3 = (w9.c) fVar.b();
                    cVar3.f36543b = 0.0d;
                    cVar3.f36544c = 0.0d;
                    cVar.c(f16, f17, cVar3);
                    f10 = (float) cVar3.f36544c;
                    f11 = (float) cVar2.f36544c;
                    fVar.c(cVar2);
                    fVar.c(cVar3);
                }
            }
        }
        D(f10, f11);
    }

    public void D(float f10, float f11) {
        double dFloor;
        int i4;
        n9.a aVar = this.f35979c;
        int i10 = aVar.f29841n;
        double dAbs = Math.abs(f11 - f10);
        if (i10 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            aVar.f29838k = new float[0];
            aVar.f29839l = 0;
            return;
        }
        double d10 = w9.g.d(dAbs / i10);
        double d11 = w9.g.d(Math.pow(10.0d, (int) Math.log10(d10)));
        if (((int) (d10 / d11)) > 5) {
            d10 = Math.floor(d11 * 10.0d);
        }
        double dCeil = d10 == 0.0d ? 0.0d : Math.ceil(f10 / d10) * d10;
        if (d10 == 0.0d) {
            dFloor = 0.0d;
        } else {
            dFloor = Math.floor(f11 / d10) * d10;
            if (dFloor != Double.POSITIVE_INFINITY) {
                double d12 = dFloor + 0.0d;
                dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d12) + (d12 >= 0.0d ? 1L : -1L));
            }
        }
        if (d10 != 0.0d) {
            i4 = 0;
            for (double d13 = dCeil; d13 <= dFloor; d13 += d10) {
                i4++;
            }
        } else {
            i4 = 0;
        }
        aVar.f29839l = i4;
        if (aVar.f29838k.length < i4) {
            aVar.f29838k = new float[i4];
        }
        for (int i11 = 0; i11 < i4; i11++) {
            if (dCeil == 0.0d) {
                dCeil = 0.0d;
            }
            aVar.f29838k[i11] = (float) dCeil;
            dCeil += d10;
        }
        if (d10 < 1.0d) {
            aVar.f29840m = (int) Math.ceil(-Math.log10(d10));
        } else {
            aVar.f29840m = 0;
        }
    }
}
