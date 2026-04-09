package B3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends t {

    /* renamed from: f, reason: collision with root package name */
    public float f572f;

    /* renamed from: g, reason: collision with root package name */
    public float f573g;

    /* renamed from: h, reason: collision with root package name */
    public float f574h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f575j;

    /* renamed from: k, reason: collision with root package name */
    public float f576k;

    /* renamed from: l, reason: collision with root package name */
    public int f577l;

    /* renamed from: m, reason: collision with root package name */
    public float f578m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f579n;

    /* renamed from: o, reason: collision with root package name */
    public float f580o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f581p;

    /* renamed from: q, reason: collision with root package name */
    public final Pair f582q;

    public f(l lVar) {
        super(lVar);
        this.f581p = new RectF();
        this.f582q = new Pair(new s(), new s());
    }

    @Override // B3.t
    public final void a(Canvas canvas, Rect rect, float f2, boolean z6, boolean z7) {
        float fWidth = rect.width() / k();
        float fHeight = rect.height() / k();
        l lVar = (l) this.f657a;
        float f5 = (lVar.f613p / 2.0f) + lVar.f614q;
        canvas.translate((f5 * fWidth) + rect.left, (f5 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (lVar.f615r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f6 = -f5;
        canvas.clipRect(f6, f6, f5, f5);
        this.f572f = lVar.f559a * f2;
        this.f573g = Math.min(r9 / 2, lVar.a()) * f2;
        this.f574h = lVar.f569l * f2;
        int i = lVar.f613p;
        int i3 = lVar.f559a;
        float f7 = (i - i3) / 2.0f;
        this.i = f7;
        if (z6 || z7) {
            float f8 = ((1.0f - f2) * i3) / 2.0f;
            if ((z6 && lVar.f565g == 2) || (z7 && lVar.f566h == 1)) {
                this.i = f7 + f8;
            } else if ((z6 && lVar.f565g == 1) || (z7 && lVar.f566h == 2)) {
                this.i = f7 - f8;
            }
        }
        if (z7 && lVar.f566h == 3) {
            this.f580o = f2;
        } else {
            this.f580o = 1.0f;
        }
    }

    @Override // B3.t
    public final void c(Canvas canvas, Paint paint, r rVar, int i) {
        int iC = com.bumptech.glide.e.c(rVar.f648c, i);
        canvas.save();
        canvas.rotate(rVar.f652g);
        this.f579n = rVar.f653h;
        float f2 = rVar.f646a;
        float f5 = rVar.f647b;
        int i3 = rVar.f649d;
        i(canvas, paint, f2, f5, iC, i3, i3, rVar.f650e, rVar.f651f, true);
        canvas.restore();
    }

    @Override // B3.t
    public final void d(Canvas canvas, Paint paint, float f2, float f5, int i, int i3, int i6) {
        int iC = com.bumptech.glide.e.c(i, i3);
        this.f579n = false;
        i(canvas, paint, f2, f5, iC, i6, i6, 0.0f, 0.0f, false);
    }

    @Override // B3.t
    public final int e() {
        return k();
    }

    @Override // B3.t
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B3.t
    public final void g() {
        int i;
        Path path = this.f658b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i3 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            if (i6 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i6++;
        }
        Matrix matrix = this.f661e;
        matrix.reset();
        float f2 = this.i;
        matrix.setScale(f2, f2);
        path.transform(matrix);
        boolean zB = ((l) this.f657a).b(this.f579n);
        PathMeasure pathMeasure = this.f660d;
        if (zB) {
            pathMeasure.setPath(path, false);
            float f5 = this.f576k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f6 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.f579n ? r2.f567j : r2.f568k)) / 2.0f)) * 2;
            this.f575j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < iMax; i7++) {
                s sVar = new s();
                float f7 = i7;
                pathMeasure.getPosTan(this.f575j * f7, sVar.f654a, sVar.f655b);
                s sVar2 = new s();
                float f8 = this.f575j;
                pathMeasure.getPosTan((f8 / 2.0f) + (f7 * f8), sVar2.f654a, sVar2.f655b);
                arrayList.add(sVar);
                sVar2.a(f5 * 2.0f);
                arrayList.add(sVar2);
            }
            arrayList.add((s) arrayList.get(0));
            s sVar3 = (s) arrayList.get(0);
            float[] fArr = sVar3.f654a;
            char c6 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i8 = 1;
            while (i8 < arrayList.size()) {
                s sVar4 = (s) arrayList.get(i8);
                float f9 = (this.f575j / f6) * 0.48f;
                float[] fArr2 = sVar3.f654a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i3, fArr3, i3, i);
                System.arraycopy(sVar3.f655b, i3, new float[i], i3, i);
                new Matrix();
                float[] fArr4 = sVar4.f654a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i3, fArr5, i3, i);
                System.arraycopy(sVar4.f655b, i3, new float[i], i3, i);
                new Matrix();
                char c7 = c6;
                float fAtan2 = (float) Math.atan2(r6[c6], r6[i3]);
                double d6 = fArr3[i3];
                double d7 = f9;
                int i9 = i3;
                double d8 = fAtan2;
                fArr3[i9] = (float) ((Math.cos(d8) * d7) + d6);
                fArr3[c7] = (float) ((Math.sin(d8) * d7) + fArr3[c7]);
                double d9 = -f9;
                double dAtan2 = (float) Math.atan2(r11[c7], r11[i9]);
                fArr5[i9] = (float) ((Math.cos(dAtan2) * d9) + fArr5[i9]);
                float fSin = (float) ((Math.sin(dAtan2) * d9) + fArr5[c7]);
                fArr5[c7] = fSin;
                float f10 = fArr3[i9];
                float f11 = fArr3[c7];
                float f12 = fArr5[i9];
                float[] fArr6 = sVar4.f654a;
                path.cubicTo(f10, f11, f12, fSin, fArr6[i9], fArr6[c7]);
                i8++;
                sVar3 = sVar4;
                c6 = c7;
                i3 = i9;
                pathMeasure = pathMeasure;
                i = 2;
                f6 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i3);
    }

    public final void i(Canvas canvas, Paint paint, float f2, float f5, int i, int i3, int i6, float f6, float f7, boolean z6) {
        float f8;
        float f9;
        Canvas canvas2;
        float f10 = f5 >= f2 ? f5 - f2 : (f5 + 1.0f) - f2;
        float f11 = f2 % 1.0f;
        if (f11 < 0.0f) {
            f11 += 1.0f;
        }
        if (this.f580o < 1.0f) {
            float f12 = f11 + f10;
            if (f12 > 1.0f) {
                i(canvas, paint, f11, 1.0f, i, i3, 0, f6, f7, z6);
                i(canvas, paint, 1.0f, f12, i, 0, i6, f6, f7, z6);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f573g / this.i);
        float f13 = f10 - 0.99f;
        if (f13 >= 0.0f) {
            float f14 = ((f13 * degrees) / 180.0f) / 0.01f;
            f10 += f14;
            if (!z6) {
                f11 -= f14 / 2.0f;
            }
        }
        float fM = a4.t.m(1.0f - this.f580o, 1.0f, f11);
        float fM2 = a4.t.m(0.0f, this.f580o, f10);
        float degrees2 = (float) Math.toDegrees(i3 / this.i);
        float degrees3 = ((fM2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i6 / this.i));
        float f15 = (fM * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        l lVar = (l) this.f657a;
        boolean z7 = lVar.b(this.f579n) && z6 && f6 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f572f);
        float f16 = this.f573g * 2.0f;
        float f17 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f660d;
        if (degrees3 < f17) {
            float f18 = degrees3 / f17;
            float f19 = (degrees * f18) + f15;
            s sVar = new s();
            if (z7) {
                float length = (pathMeasure.getLength() * (f19 / 360.0f)) / 2.0f;
                float f20 = this.f574h * f6;
                float f21 = this.i;
                if (f21 != this.f578m || f20 != this.f576k) {
                    this.f576k = f20;
                    this.f578m = f21;
                    g();
                }
                pathMeasure.getPosTan(length, sVar.f654a, sVar.f655b);
            } else {
                sVar.c(f19 + 90.0f);
                sVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, sVar, f16, this.f572f, f18);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(lVar.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f22 = f15 + degrees;
        float f23 = degrees3 - f17;
        Pair pair = this.f582q;
        ((s) pair.first).b();
        ((s) pair.second).b();
        if (z7) {
            float f24 = f22 / 360.0f;
            float f25 = f23 / 360.0f;
            float f26 = this.f574h * f6;
            int i7 = this.f579n ? lVar.f567j : lVar.f568k;
            float f27 = this.i;
            if (f27 != this.f578m || f26 != this.f576k || i7 != this.f577l) {
                this.f576k = f26;
                this.f577l = i7;
                this.f578m = f27;
                g();
            }
            Path path = this.f659c;
            path.rewind();
            float fE = d5.y.e(f25, 0.0f, 1.0f);
            if (lVar.b(this.f579n)) {
                f8 = 1.0f;
                float f28 = f7 / ((float) ((this.i * 6.283185307179586d) / this.f575j));
                f24 += f28;
                f9 = 0.0f - (f28 * 360.0f);
            } else {
                f8 = 1.0f;
                f9 = 0.0f;
            }
            float f29 = f24 % f8;
            float length2 = (pathMeasure.getLength() * f29) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f29 + fE)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            s sVar2 = (s) pair.first;
            sVar2.b();
            pathMeasure.getPosTan(length2, sVar2.f654a, sVar2.f655b);
            s sVar3 = (s) pair.second;
            sVar3.b();
            pathMeasure.getPosTan(length3, sVar3.f654a, sVar3.f655b);
            Matrix matrix = this.f661e;
            matrix.reset();
            matrix.setRotate(f9);
            sVar2.c(f9);
            sVar3.c(f9);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((s) pair.first).c(f22 + 90.0f);
            ((s) pair.first).a(-this.i);
            ((s) pair.second).c(f22 + f23 + 90.0f);
            ((s) pair.second).a(-this.i);
            float f30 = this.i;
            float f31 = -f30;
            RectF rectF = this.f581p;
            rectF.set(f31, f31, f30, f30);
            canvas.drawArc(rectF, f22, f23, false, paint);
            canvas2 = canvas;
        }
        if (lVar.c() || this.f573g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (s) pair.first, f16, this.f572f, 1.0f);
        j(canvas, paint, (s) pair.second, f16, this.f572f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, s sVar, float f2, float f5, float f6) {
        float fMin = Math.min(f5, this.f572f);
        float f7 = f2 / 2.0f;
        float fMin2 = Math.min(f7, (this.f573g * fMin) / this.f572f);
        RectF rectF = new RectF((-f2) / 2.0f, (-fMin) / 2.0f, f7, fMin / 2.0f);
        canvas.save();
        float[] fArr = sVar.f654a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(t.h(sVar.f655b));
        canvas.scale(f6, f6);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        e eVar = this.f657a;
        return (((l) eVar).f614q * 2) + ((l) eVar).f613p;
    }

    @Override // B3.t
    public final void b(int i, int i3, Canvas canvas, Paint paint) {
    }
}
