package B3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* loaded from: classes.dex */
public final class w extends t {

    /* renamed from: f, reason: collision with root package name */
    public float f668f;

    /* renamed from: g, reason: collision with root package name */
    public float f669g;

    /* renamed from: h, reason: collision with root package name */
    public float f670h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f671j;

    /* renamed from: k, reason: collision with root package name */
    public float f672k;

    /* renamed from: l, reason: collision with root package name */
    public int f673l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f674m;

    /* renamed from: n, reason: collision with root package name */
    public float f675n;

    /* renamed from: o, reason: collision with root package name */
    public Pair f676o;

    @Override // B3.t
    public final void a(Canvas canvas, Rect rect, float f2, boolean z6, boolean z7) {
        if (this.f668f != rect.width()) {
            this.f668f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        B b5 = (B) this.f657a;
        if (b5.f534q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f5 = this.f668f / 2.0f;
        float f6 = fE / 2.0f;
        canvas.clipRect(-f5, -f6, f5, f6);
        this.f669g = b5.f559a * f2;
        this.f670h = Math.min(r0 / 2, b5.a()) * f2;
        this.f671j = b5.f569l * f2;
        this.i = Math.min(b5.f559a / 2.0f, b5.e()) * f2;
        if (z6 || z7) {
            if ((z6 && b5.f565g == 2) || (z7 && b5.f566h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z6 || (z7 && b5.f566h != 3)) {
                canvas.translate(0.0f, ((1.0f - f2) * b5.f559a) / 2.0f);
            }
        }
        if (z7 && b5.f566h == 3) {
            this.f675n = f2;
        } else {
            this.f675n = 1.0f;
        }
    }

    @Override // B3.t
    public final void b(int i, int i3, Canvas canvas, Paint paint) {
        int iC = com.bumptech.glide.e.c(i, i3);
        this.f674m = false;
        B b5 = (B) this.f657a;
        if (b5.f535r <= 0 || iC == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iC);
        Integer num = b5.f536s;
        s sVar = new s(new float[]{(this.f668f / 2.0f) - (num != null ? (b5.f535r / 2.0f) + num.floatValue() : this.f669g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        int i6 = b5.f535r;
        j(canvas, paint, sVar, i6, i6, (this.f670h * i6) / this.f669g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // B3.t
    public final void c(Canvas canvas, Paint paint, r rVar, int i) {
        int iC = com.bumptech.glide.e.c(rVar.f648c, i);
        this.f674m = rVar.f653h;
        float f2 = rVar.f646a;
        float f5 = rVar.f647b;
        int i3 = rVar.f649d;
        i(canvas, paint, f2, f5, iC, i3, i3, rVar.f650e, rVar.f651f, true);
    }

    @Override // B3.t
    public final void d(Canvas canvas, Paint paint, float f2, float f5, int i, int i3, int i6) {
        int iC = com.bumptech.glide.e.c(i, i3);
        this.f674m = false;
        i(canvas, paint, f2, f5, iC, i6, i6, 0.0f, 0.0f, false);
    }

    @Override // B3.t
    public final int e() {
        e eVar = this.f657a;
        return (((B) eVar).f569l * 2) + ((B) eVar).f559a;
    }

    @Override // B3.t
    public final int f() {
        return -1;
    }

    @Override // B3.t
    public final void g() {
        Path path = this.f658b;
        path.rewind();
        B b5 = (B) this.f657a;
        if (b5.b(this.f674m)) {
            int i = this.f674m ? b5.f567j : b5.f568k;
            float f2 = this.f668f;
            int i3 = (int) (f2 / i);
            this.f672k = f2 / i3;
            for (int i6 = 0; i6 <= i3; i6++) {
                int i7 = i6 * 2;
                float f5 = i7 + 1;
                path.cubicTo(i7 + 0.48f, 0.0f, f5 - 0.48f, 1.0f, f5, 1.0f);
                float f6 = f5 + 0.48f;
                float f7 = i7 + 2;
                path.cubicTo(f6, 1.0f, f7 - 0.48f, 0.0f, f7, 0.0f);
            }
            Matrix matrix = this.f661e;
            matrix.reset();
            matrix.setScale(this.f672k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f668f, 0.0f);
        }
        this.f660d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f2, float f5, int i, int i3, int i6, float f6, float f7, boolean z6) {
        float fM;
        float fM2;
        B b5;
        float f8;
        Canvas canvas2;
        Pair pair = this.f676o;
        float fE = d5.y.e(f2, 0.0f, 1.0f);
        float fE2 = d5.y.e(f5, 0.0f, 1.0f);
        float fM3 = a4.t.m(1.0f - this.f675n, 1.0f, fE);
        float fM4 = a4.t.m(1.0f - this.f675n, 1.0f, fE2);
        int iE = (int) ((d5.y.e(fM3, 0.0f, 0.01f) * i3) / 0.01f);
        int iE2 = (int) (((1.0f - d5.y.e(fM4, 0.99f, 1.0f)) * i6) / 0.01f);
        float f9 = this.f668f;
        int i7 = (int) ((fM3 * f9) + iE);
        int i8 = (int) ((fM4 * f9) - iE2);
        float f10 = this.f670h;
        float f11 = this.i;
        if (f10 != f11) {
            float fMax = Math.max(f10, f11);
            float f12 = this.f668f;
            float f13 = fMax / f12;
            fM = a4.t.m(this.f670h, this.i, d5.y.e(i7 / f12, 0.0f, f13) / f13);
            float f14 = this.f670h;
            float f15 = this.i;
            float f16 = this.f668f;
            fM2 = a4.t.m(f14, f15, d5.y.e((f16 - i8) / f16, 0.0f, f13) / f13);
        } else {
            fM = f10;
            fM2 = fM;
        }
        float f17 = (-this.f668f) / 2.0f;
        B b6 = (B) this.f657a;
        boolean z7 = b6.b(this.f674m) && z6 && f6 > 0.0f;
        if (i7 <= i8) {
            float f18 = i7 + fM;
            float f19 = i8 - fM2;
            float f20 = fM * 2.0f;
            float f21 = fM2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f669g);
            ((s) pair.first).b();
            ((s) pair.second).b();
            ((s) pair.first).e(f18 + f17);
            ((s) pair.second).e(f19 + f17);
            if (i7 == 0 && f19 + fM2 < f18 + fM) {
                s sVar = (s) pair.first;
                float f22 = this.f669g;
                j(canvas, paint, sVar, f20, f22, fM, (s) pair.second, f21, f22, fM2, true);
                return;
            }
            if (f18 - fM > f19 - fM2) {
                s sVar2 = (s) pair.second;
                float f23 = this.f669g;
                j(canvas, paint, sVar2, f21, f23, fM2, (s) pair.first, f20, f23, fM, false);
                return;
            }
            float f24 = fM2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(b6.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z7) {
                float f25 = this.f668f;
                float f26 = f18 / f25;
                float f27 = f19 / f25;
                b5 = b6;
                int i9 = this.f674m ? b5.f567j : b5.f568k;
                if (i9 != this.f673l) {
                    this.f673l = i9;
                    g();
                }
                Path path = this.f659c;
                path.rewind();
                float f28 = (-this.f668f) / 2.0f;
                boolean zB = b5.b(this.f674m);
                if (zB) {
                    float f29 = this.f668f;
                    f8 = 1.0f;
                    float f30 = this.f672k;
                    float f31 = f29 / f30;
                    float f32 = f7 / f31;
                    float f33 = f31 / (f31 + 1.0f);
                    f26 = (f26 + f32) * f33;
                    f27 = (f27 + f32) * f33;
                    f28 -= f30 * f7;
                } else {
                    f8 = 1.0f;
                }
                PathMeasure pathMeasure = this.f660d;
                float length = pathMeasure.getLength() * f26;
                float length2 = pathMeasure.getLength() * f27;
                pathMeasure.getSegment(length, length2, path, true);
                s sVar3 = (s) pair.first;
                sVar3.b();
                pathMeasure.getPosTan(length, sVar3.f654a, sVar3.f655b);
                s sVar4 = (s) pair.second;
                sVar4.b();
                pathMeasure.getPosTan(length2, sVar4.f654a, sVar4.f655b);
                Matrix matrix = this.f661e;
                matrix.reset();
                matrix.setTranslate(f28, 0.0f);
                sVar3.e(f28);
                sVar4.e(f28);
                if (zB) {
                    float f34 = this.f671j * f6;
                    matrix.postScale(f8, f34);
                    sVar3.d(f34);
                    sVar4.d(f34);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((s) pair.first).f654a;
                float f35 = fArr[0];
                float f36 = fArr[1];
                float[] fArr2 = ((s) pair.second).f654a;
                canvas.drawLine(f35, f36, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                b5 = b6;
            }
            if (b5.c()) {
                return;
            }
            if (f18 > 0.0f && fM > 0.0f) {
                j(canvas2, paint, (s) pair.first, f20, this.f669g, fM, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f19 >= this.f668f || f24 <= 0.0f) {
                return;
            }
            j(canvas, paint, (s) pair.second, f21, this.f669g, f24, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, s sVar, float f2, float f5, float f6, s sVar2, float f7, float f8, float f9, boolean z6) {
        float f10;
        float fMin = Math.min(f5, this.f669g);
        float f11 = (-f2) / 2.0f;
        float f12 = (-fMin) / 2.0f;
        float f13 = f2 / 2.0f;
        float f14 = fMin / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f14);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (sVar2 != null) {
            float[] fArr = sVar2.f655b;
            float[] fArr2 = sVar2.f654a;
            float fMin2 = Math.min(f8, this.f669g);
            float fMin3 = Math.min(f7 / 2.0f, (f9 * fMin2) / this.f669g);
            RectF rectF2 = new RectF();
            if (z6) {
                float f15 = (fArr2[0] - fMin3) - (sVar.f654a[0] - f6);
                if (f15 > 0.0f) {
                    sVar2.e((-f15) / 2.0f);
                    f10 = f7 + f15;
                } else {
                    f10 = f7;
                }
                rectF2.set(0.0f, f12, f13, f14);
            } else {
                float f16 = (fArr2[0] + fMin3) - (sVar.f654a[0] + f6);
                if (f16 < 0.0f) {
                    sVar2.e((-f16) / 2.0f);
                    f10 = f7 - f16;
                } else {
                    f10 = f7;
                }
                rectF2.set(f11, f12, 0.0f, f14);
            }
            RectF rectF3 = new RectF((-f10) / 2.0f, (-fMin2) / 2.0f, f10 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(t.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-t.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = sVar.f654a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(t.h(sVar.f655b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        } else {
            float[] fArr4 = sVar.f654a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(t.h(sVar.f655b));
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        canvas.restore();
    }
}
