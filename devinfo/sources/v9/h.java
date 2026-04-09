package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: h, reason: collision with root package name */
    public final n9.h f36025h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f36026i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f36027k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f36028l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f36029m;

    public h(w9.h hVar, n9.h hVar2, pe.c cVar) {
        super(hVar, cVar, hVar2);
        this.f36026i = new Path();
        this.j = new RectF();
        this.f36027k = new float[2];
        new Path();
        new RectF();
        this.f36028l = new Path();
        this.f36029m = new float[2];
        new RectF();
        this.f36025h = hVar2;
        if (hVar != null) {
            this.f35982f.setColor(-16777216);
            this.f35982f.setTextSize(w9.g.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final float[] E() {
        int length = this.f36027k.length;
        n9.h hVar = this.f36025h;
        int i4 = hVar.f29839l;
        if (length != i4 * 2) {
            this.f36027k = new float[i4 * 2];
        }
        float[] fArr = this.f36027k;
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            fArr[i10 + 1] = hVar.f29838k[i10 / 2];
        }
        this.f35980d.f(fArr);
        return fArr;
    }

    public final void F(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        w9.h hVar = (w9.h) this.f218b;
        n9.h hVar2 = this.f36025h;
        if (hVar2.f29850a && hVar2.f29844q) {
            float[] fArrE = E();
            Paint paint = this.f35982f;
            paint.setTypeface(null);
            paint.setTextSize(hVar2.f29853d);
            paint.setColor(hVar2.f29854e);
            float f13 = hVar2.f29851b;
            float fA = (w9.g.a(paint, "A") / 2.5f) + hVar2.f29852c;
            int i4 = hVar2.B;
            int i10 = hVar2.A;
            if (i4 == 1) {
                if (i10 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f10 = hVar.f36564b.left;
                    f12 = f10 - f13;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f11 = hVar.f36564b.left;
                    f12 = f11 + f13;
                }
            } else if (i10 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f11 = hVar.f36564b.right;
                f12 = f11 + f13;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f10 = hVar.f36564b.right;
                f12 = f10 - f13;
            }
            int i11 = !hVar2.f29877w ? 1 : 0;
            int i12 = hVar2.f29878x ? hVar2.f29839l : hVar2.f29839l - 1;
            while (i11 < i12) {
                canvas.drawText((i11 < 0 || i11 >= hVar2.f29838k.length) ? "" : hVar2.c().a(hVar2.f29838k[i11]), f12, fArrE[(i11 * 2) + 1] + fA, paint);
                i11++;
            }
        }
    }

    public final void G(Canvas canvas) {
        w9.h hVar = (w9.h) this.f218b;
        n9.h hVar2 = this.f36025h;
        if (hVar2.f29850a && hVar2.f29843p) {
            int i4 = hVar2.f29837i;
            Paint paint = this.g;
            paint.setColor(i4);
            paint.setStrokeWidth(hVar2.j);
            if (hVar2.B == 1) {
                RectF rectF = hVar.f36564b;
                float f10 = rectF.left;
                canvas.drawLine(f10, rectF.top, f10, rectF.bottom, paint);
            } else {
                RectF rectF2 = hVar.f36564b;
                float f11 = rectF2.right;
                canvas.drawLine(f11, rectF2.top, f11, rectF2.bottom, paint);
            }
        }
    }

    public final void H(Canvas canvas) {
        w9.h hVar = (w9.h) this.f218b;
        n9.h hVar2 = this.f36025h;
        if (hVar2.f29850a && hVar2.f29842o) {
            int iSave = canvas.save();
            RectF rectF = hVar.f36564b;
            RectF rectF2 = hVar.f36564b;
            RectF rectF3 = this.j;
            rectF3.set(rectF);
            rectF3.inset(0.0f, -this.f35979c.f29836h);
            canvas.clipRect(rectF3);
            float[] fArrE = E();
            int i4 = hVar2.g;
            Paint paint = this.f35981e;
            paint.setColor(i4);
            paint.setStrokeWidth(hVar2.f29836h);
            paint.setPathEffect(null);
            Path path = this.f36026i;
            path.reset();
            for (int i10 = 0; i10 < fArrE.length; i10 += 2) {
                int i11 = i10 + 1;
                path.moveTo(rectF2.left, fArrE[i11]);
                path.lineTo(rectF2.right, fArrE[i11]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void I() {
        ArrayList arrayList = this.f36025h.f29845r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.f36029m;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.f36028l.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }
}
