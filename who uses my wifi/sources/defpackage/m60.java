package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m60 extends eq {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.eq
    public final int a() {
        v60 v60Var = this.a;
        return (v60Var.l * 2) + v60Var.a;
    }

    @Override // defpackage.eq
    public final void b() {
        Path path = this.b;
        path.rewind();
        v60 v60Var = this.a;
        if (v60Var.c(this.m)) {
            int i = this.m ? v60Var.j : v60Var.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void e(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fM;
        float fM2;
        float f5;
        Canvas canvas2;
        Pair pair = this.o;
        float fG = bd2.g(f, 0.0f, 1.0f);
        float fG2 = bd2.g(f2, 0.0f, 1.0f);
        float fM3 = g82.m(1.0f - this.n, 1.0f, fG);
        float fM4 = g82.m(1.0f - this.n, 1.0f, fG2);
        int iG = (int) ((bd2.g(fM3, 0.0f, 0.01f) * i2) / 0.01f);
        int iG2 = (int) (((1.0f - bd2.g(fM4, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f;
        int i4 = (int) ((fM3 * f6) + iG);
        int i5 = (int) ((fM4 * f6) - iG2);
        float f7 = this.h;
        float f8 = this.i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f;
            float f10 = fMax / f9;
            fM = g82.m(this.h, this.i, bd2.g(i4 / f9, 0.0f, f10) / f10);
            float f11 = this.h;
            float f12 = this.i;
            float f13 = this.f;
            fM2 = g82.m(f11, f12, bd2.g((f13 - i5) / f13, 0.0f, f10) / f10);
        } else {
            fM = f7;
            fM2 = fM;
        }
        float f14 = (-this.f) / 2.0f;
        v60 v60Var = this.a;
        boolean z2 = v60Var.c(this.m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f15 = i4 + fM;
            float f16 = i5 - fM2;
            float f17 = fM * 2.0f;
            float f18 = fM2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((dq) pair.first).a();
            ((dq) pair.second).a();
            ((dq) pair.first).c(f15 + f14);
            ((dq) pair.second).c(f16 + f14);
            if (i4 == 0 && f16 + fM2 < f15 + fM) {
                dq dqVar = (dq) pair.first;
                float f19 = this.g;
                f(canvas, paint, dqVar, f17, f19, fM, (dq) pair.second, f18, f19, fM2, true);
                return;
            }
            if (f15 - fM > f16 - fM2) {
                dq dqVar2 = (dq) pair.second;
                float f20 = this.g;
                f(canvas, paint, dqVar2, f18, f20, fM2, (dq) pair.first, f17, f20, fM, false);
                return;
            }
            float f21 = fM2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap((v60Var.d && v60Var.c == 0.5f && v60Var.b() == v60Var.a()) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                int i6 = this.m ? v60Var.j : v60Var.k;
                if (i6 != this.l) {
                    this.l = i6;
                    b();
                }
                Path path = this.c;
                path.rewind();
                float f25 = (-this.f) / 2.0f;
                boolean zC = v60Var.c(this.m);
                if (zC) {
                    float f26 = this.f;
                    f5 = 0.5f;
                    float f27 = this.k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 0.5f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                dq dqVar3 = (dq) pair.first;
                dqVar3.a();
                pathMeasure.getPosTan(length, dqVar3.a, dqVar3.b);
                dq dqVar4 = (dq) pair.second;
                dqVar4.a();
                pathMeasure.getPosTan(length2, dqVar4.a, dqVar4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                dqVar3.c(f25);
                dqVar4.c(f25);
                if (zC) {
                    float f31 = this.j * f3;
                    matrix.postScale(1.0f, f31);
                    dqVar3.b(f31);
                    dqVar4.b(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((dq) pair.first).a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((dq) pair.second).a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                f5 = 0.5f;
            }
            if (v60Var.d && v60Var.c == f5 && v60Var.b() == v60Var.a()) {
                return;
            }
            if (f15 > 0.0f && fM > 0.0f) {
                f(canvas2, paint, (dq) pair.first, f17, this.g, fM, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f || f21 <= 0.0f) {
                return;
            }
            f(canvas, paint, (dq) pair.second, f18, this.g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void f(Canvas canvas, Paint paint, dq dqVar, float f, float f2, float f3, dq dqVar2, float f4, float f5, float f6, boolean z) {
        float f7;
        float fMin = Math.min(f2, this.g);
        float f8 = (-f) / 2.0f;
        float f9 = (-fMin) / 2.0f;
        float f10 = f / 2.0f;
        float f11 = fMin / 2.0f;
        RectF rectF = new RectF(f8, f9, f10, f11);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (dqVar2 != null) {
            float[] fArr = dqVar2.b;
            float[] fArr2 = dqVar2.a;
            float fMin2 = Math.min(f5, this.g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f12 = (fArr2[0] - fMin3) - (dqVar.a[0] - f3);
                if (f12 > 0.0f) {
                    dqVar2.c((-f12) / 2.0f);
                    f7 = f4 + f12;
                } else {
                    f7 = f4;
                }
                rectF2.set(0.0f, f9, f10, f11);
            } else {
                float f13 = (fArr2[0] + fMin3) - (dqVar.a[0] + f3);
                if (f13 < 0.0f) {
                    dqVar2.c((-f13) / 2.0f);
                    f7 = f4 - f13;
                } else {
                    f7 = f4;
                }
                rectF2.set(f8, f9, 0.0f, f11);
            }
            RectF rectF3 = new RectF((-f7) / 2.0f, (-fMin2) / 2.0f, f7 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(eq.d(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-eq.d(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = dqVar.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(eq.d(dqVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = dqVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(eq.d(dqVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iB = i41.b(i, i2);
        this.m = false;
        e(canvas, paint, f, f2, iB, i3, i3, 0.0f, 0.0f, false);
    }
}
