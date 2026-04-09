package k6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.google.android.gms.common.api.internal.a0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f28006p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f28007a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f28008b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f28009c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f28010d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f28011e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f28012f;
    public final k g;

    /* renamed from: h, reason: collision with root package name */
    public float f28013h;

    /* renamed from: i, reason: collision with root package name */
    public float f28014i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f28015k;

    /* renamed from: l, reason: collision with root package name */
    public int f28016l;

    /* renamed from: m, reason: collision with root package name */
    public String f28017m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f28018n;

    /* renamed from: o, reason: collision with root package name */
    public final x.e f28019o;

    public n() {
        this.f28009c = new Matrix();
        this.f28013h = 0.0f;
        this.f28014i = 0.0f;
        this.j = 0.0f;
        this.f28015k = 0.0f;
        this.f28016l = 255;
        this.f28017m = null;
        this.f28018n = null;
        this.f28019o = new x.e(0);
        this.g = new k();
        this.f28007a = new Path();
        this.f28008b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i4, int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        Matrix matrix2 = kVar.f27994a;
        ArrayList arrayList = kVar.f27995b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f27994a;
        matrix3.preConcat(kVar.j);
        canvas.save();
        char c9 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            l lVar = (l) arrayList.get(i13);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i4, i10);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f12 = i4 / this.j;
                float f13 = i10 / this.f28015k;
                float fMin = Math.min(f12, f13);
                Matrix matrix4 = this.f28009c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c9], fArr[1]);
                boolean z3 = c9;
                i11 = i13;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f28007a;
                    path.reset();
                    v3.d[] dVarArr = mVar.f28003a;
                    if (dVarArr != null) {
                        v3.d.b(dVarArr, path);
                    }
                    Path path2 = this.f28008b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.f28005c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f15 = jVar.f27989i;
                        if (f15 != 0.0f || jVar.j != 1.0f) {
                            float f16 = jVar.f27990k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (jVar.j + f16) % 1.0f;
                            if (this.f28012f == null) {
                                this.f28012f = new PathMeasure();
                            }
                            this.f28012f.setPath(path, z3);
                            float length = this.f28012f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f28012f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f28012f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f28012f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a0 a0Var = jVar.f27987f;
                        if (((Shader) a0Var.f9070c) == null && a0Var.f9069b == 0) {
                            f11 = 255.0f;
                            i12 = 16777215;
                        } else {
                            if (this.f28011e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f28011e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f28011e;
                            Shader shader = (Shader) a0Var.f9070c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.f27988h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = a0Var.f9069b;
                                float f21 = jVar.f27988h;
                                PorterDuff.Mode mode = q.j;
                                f11 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.f28005c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        a0 a0Var2 = jVar.f27985d;
                        if (((Shader) a0Var2.f9070c) != null || a0Var2.f9069b != 0) {
                            if (this.f28010d == null) {
                                Paint paint3 = new Paint(1);
                                this.f28010d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f28010d;
                            Paint.Join join = jVar.f27992m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.f27991l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f27993n);
                            Shader shader2 = (Shader) a0Var2.f9070c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = a0Var2.f9069b;
                                float f22 = jVar.g;
                                PorterDuff.Mode mode2 = q.j;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f27986e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c9 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c9 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f28016l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f28016l = i4;
    }

    public n(n nVar) {
        this.f28009c = new Matrix();
        this.f28013h = 0.0f;
        this.f28014i = 0.0f;
        this.j = 0.0f;
        this.f28015k = 0.0f;
        this.f28016l = 255;
        this.f28017m = null;
        this.f28018n = null;
        x.e eVar = new x.e(0);
        this.f28019o = eVar;
        this.g = new k(nVar.g, eVar);
        this.f28007a = new Path(nVar.f28007a);
        this.f28008b = new Path(nVar.f28008b);
        this.f28013h = nVar.f28013h;
        this.f28014i = nVar.f28014i;
        this.j = nVar.j;
        this.f28015k = nVar.f28015k;
        this.f28016l = nVar.f28016l;
        this.f28017m = nVar.f28017m;
        String str = nVar.f28017m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f28018n = nVar.f28018n;
    }
}
