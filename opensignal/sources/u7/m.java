package u7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import bc.f0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f23413p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f23414a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f23415b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23416c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f23417d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f23418e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f23419f;

    /* renamed from: g, reason: collision with root package name */
    public final j f23420g;

    /* renamed from: h, reason: collision with root package name */
    public float f23421h;

    /* renamed from: i, reason: collision with root package name */
    public float f23422i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f23423l;

    /* renamed from: m, reason: collision with root package name */
    public String f23424m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f23425n;

    /* renamed from: o, reason: collision with root package name */
    public final u.e f23426o;

    public m() {
        this.f23416c = new Matrix();
        this.f23421h = 0.0f;
        this.f23422i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f23423l = 255;
        this.f23424m = null;
        this.f23425n = null;
        this.f23426o = new u.e(0);
        this.f23420g = new j();
        this.f23414a = new Path();
        this.f23415b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        int i13;
        float f11;
        Matrix matrix2 = jVar.f23401a;
        ArrayList arrayList = jVar.f23402b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f23401a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c4 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.j;
                float f13 = i11 / this.k;
                float fMin = Math.min(f12, f13);
                Matrix matrix4 = this.f23416c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c4], fArr[1]);
                boolean z10 = c4;
                i12 = i14;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f23414a;
                    path.reset();
                    k3.f[] fVarArr = lVar.f23410a;
                    if (fVarArr != null) {
                        k3.f.b(fVarArr, path);
                    }
                    Path path2 = this.f23415b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f23412c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f23397i;
                        if (f15 != 0.0f || iVar.j != 1.0f) {
                            float f16 = iVar.k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.j + f16) % 1.0f;
                            if (this.f23419f == null) {
                                this.f23419f = new PathMeasure();
                            }
                            this.f23419f.setPath(path, z10);
                            float length = this.f23419f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f23419f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f23419f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f23419f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        f0 f0Var = iVar.f23394f;
                        if (((Shader) f0Var.f2603g) == null && f0Var.f2602d == 0) {
                            f11 = 255.0f;
                            i13 = 16777215;
                        } else {
                            if (this.f23418e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f23418e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f23418e;
                            Shader shader = (Shader) f0Var.f2603g;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f23396h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = f0Var.f2602d;
                                float f21 = iVar.f23396h;
                                PorterDuff.Mode mode = p.F;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f23412c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        f0 f0Var2 = iVar.f23392d;
                        if (((Shader) f0Var2.f2603g) != null || f0Var2.f2602d != 0) {
                            if (this.f23417d == null) {
                                Paint paint3 = new Paint(1);
                                this.f23417d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f23417d;
                            Paint.Join join = iVar.f23399m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f23398l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f23400n);
                            Shader shader2 = (Shader) f0Var2.f2603g;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f23395g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = f0Var2.f2602d;
                                float f22 = iVar.f23395g;
                                PorterDuff.Mode mode2 = p.F;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f23393e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c4 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c4 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f23423l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f23423l = i10;
    }

    public m(m mVar) {
        this.f23416c = new Matrix();
        this.f23421h = 0.0f;
        this.f23422i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f23423l = 255;
        this.f23424m = null;
        this.f23425n = null;
        u.e eVar = new u.e(0);
        this.f23426o = eVar;
        this.f23420g = new j(mVar.f23420g, eVar);
        this.f23414a = new Path(mVar.f23414a);
        this.f23415b = new Path(mVar.f23415b);
        this.f23421h = mVar.f23421h;
        this.f23422i = mVar.f23422i;
        this.j = mVar.j;
        this.k = mVar.k;
        this.f23423l = mVar.f23423l;
        this.f23424m = mVar.f23424m;
        String str = mVar.f23424m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f23425n = mVar.f23425n;
    }
}
