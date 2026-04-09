package M0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import u.C2936e;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2668p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2669a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2670b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2671c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f2672d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2673e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2674f;

    /* renamed from: g, reason: collision with root package name */
    public final l f2675g;

    /* renamed from: h, reason: collision with root package name */
    public float f2676h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2677j;

    /* renamed from: k, reason: collision with root package name */
    public float f2678k;

    /* renamed from: l, reason: collision with root package name */
    public int f2679l;

    /* renamed from: m, reason: collision with root package name */
    public String f2680m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2681n;

    /* renamed from: o, reason: collision with root package name */
    public final C2936e f2682o;

    public o() {
        this.f2671c = new Matrix();
        this.f2676h = 0.0f;
        this.i = 0.0f;
        this.f2677j = 0.0f;
        this.f2678k = 0.0f;
        this.f2679l = 255;
        this.f2680m = null;
        this.f2681n = null;
        this.f2682o = new C2936e(0);
        this.f2675g = new l();
        this.f2669a = new Path();
        this.f2670b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l lVar, Matrix matrix, Canvas canvas, int i, int i3) {
        int i6;
        float f2;
        int i7;
        float f5;
        Matrix matrix2 = lVar.f2655a;
        ArrayList arrayList = lVar.f2656b;
        matrix2.set(matrix);
        Matrix matrix3 = lVar.f2655a;
        matrix3.preConcat(lVar.f2663j);
        canvas.save();
        char c6 = 0;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            m mVar = (m) arrayList.get(i8);
            if (mVar instanceof l) {
                a((l) mVar, matrix3, canvas, i, i3);
            } else if (mVar instanceof n) {
                n nVar = (n) mVar;
                float f6 = i / this.f2677j;
                float f7 = i3 / this.f2678k;
                float fMin = Math.min(f6, f7);
                Matrix matrix4 = this.f2671c;
                matrix4.set(matrix3);
                matrix4.postScale(f6, f7);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c6], fArr[1]);
                boolean z6 = c6;
                i6 = i8;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f8 = (fArr[z6 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f8) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    nVar.getClass();
                    Path path = this.f2669a;
                    path.reset();
                    J.e[] eVarArr = nVar.f2665a;
                    if (eVarArr != null) {
                        J.e.b(eVarArr, path);
                    }
                    Path path2 = this.f2670b;
                    path2.reset();
                    if (nVar instanceof j) {
                        path2.setFillType(nVar.f2667c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        k kVar = (k) nVar;
                        float f9 = kVar.i;
                        if (f9 != 0.0f || kVar.f2650j != 1.0f) {
                            float f10 = kVar.f2651k;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (kVar.f2650j + f10) % 1.0f;
                            if (this.f2674f == null) {
                                this.f2674f = new PathMeasure();
                            }
                            this.f2674f.setPath(path, z6);
                            float length = this.f2674f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f2674f.getSegment(f13, length, path, true);
                                f2 = 0.0f;
                                this.f2674f.getSegment(0.0f, f14, path, true);
                            } else {
                                f2 = 0.0f;
                                this.f2674f.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        I.d dVar = kVar.f2647f;
                        if (((Shader) dVar.f1851c) == null && dVar.f1850b == 0) {
                            f5 = 255.0f;
                            i7 = 16777215;
                        } else {
                            if (this.f2673e == null) {
                                i7 = 16777215;
                                Paint paint = new Paint(1);
                                this.f2673e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i7 = 16777215;
                            }
                            Paint paint2 = this.f2673e;
                            Shader shader = (Shader) dVar.f1851c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(kVar.f2649h * 255.0f));
                                f5 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i9 = dVar.f1850b;
                                float f15 = kVar.f2649h;
                                PorterDuff.Mode mode = r.f2695j;
                                f5 = 255.0f;
                                paint2.setColor((i9 & i7) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(kVar.f2667c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        I.d dVar2 = kVar.f2645d;
                        if (((Shader) dVar2.f1851c) != null || dVar2.f1850b != 0) {
                            if (this.f2672d == null) {
                                Paint paint3 = new Paint(1);
                                this.f2672d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f2672d;
                            Paint.Join join = kVar.f2653m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = kVar.f2652l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(kVar.f2654n);
                            Shader shader2 = (Shader) dVar2.f1851c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(kVar.f2648g * f5));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i10 = dVar2.f1850b;
                                float f16 = kVar.f2648g;
                                PorterDuff.Mode mode2 = r.f2695j;
                                paint4.setColor((i10 & i7) | (((int) (Color.alpha(i10) * f16)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(kVar.f2646e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i8 = i6 + 1;
                c6 = 0;
            }
            i6 = i8;
            i8 = i6 + 1;
            c6 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2679l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2679l = i;
    }

    public o(o oVar) {
        this.f2671c = new Matrix();
        this.f2676h = 0.0f;
        this.i = 0.0f;
        this.f2677j = 0.0f;
        this.f2678k = 0.0f;
        this.f2679l = 255;
        this.f2680m = null;
        this.f2681n = null;
        C2936e c2936e = new C2936e(0);
        this.f2682o = c2936e;
        this.f2675g = new l(oVar.f2675g, c2936e);
        this.f2669a = new Path(oVar.f2669a);
        this.f2670b = new Path(oVar.f2670b);
        this.f2676h = oVar.f2676h;
        this.i = oVar.i;
        this.f2677j = oVar.f2677j;
        this.f2678k = oVar.f2678k;
        this.f2679l = oVar.f2679l;
        this.f2680m = oVar.f2680m;
        String str = oVar.f2680m;
        if (str != null) {
            c2936e.put(str, this);
        }
        this.f2681n = oVar.f2681n;
    }
}
