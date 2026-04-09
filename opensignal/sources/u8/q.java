package u8;

import android.graphics.Matrix;
import android.graphics.PointF;
import br.a0;
import java.util.Collections;
import r8.z;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f23484b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23485c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f23486d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f23487e;

    /* renamed from: l, reason: collision with root package name */
    public d f23492l;

    /* renamed from: m, reason: collision with root package name */
    public d f23493m;

    /* renamed from: n, reason: collision with root package name */
    public d f23494n;

    /* renamed from: o, reason: collision with root package name */
    public d f23495o;

    /* renamed from: p, reason: collision with root package name */
    public d f23496p;

    /* renamed from: q, reason: collision with root package name */
    public h f23497q;

    /* renamed from: r, reason: collision with root package name */
    public h f23498r;

    /* renamed from: s, reason: collision with root package name */
    public h f23499s;

    /* renamed from: t, reason: collision with root package name */
    public h f23500t;

    /* renamed from: u, reason: collision with root package name */
    public h f23501u;

    /* renamed from: v, reason: collision with root package name */
    public d f23502v;

    /* renamed from: w, reason: collision with root package name */
    public d f23503w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f23504x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f23483a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f23488f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f23489g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f23490h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f23491i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public q(y8.d dVar) {
        a0 a0Var = dVar.f25882a;
        this.f23492l = a0Var == null ? null : a0Var.E0();
        y8.e eVar = dVar.f25883b;
        this.f23493m = eVar == null ? null : eVar.E0();
        y8.a aVar = dVar.f25884c;
        this.f23494n = aVar == null ? null : aVar.E0();
        y8.b bVar = dVar.f25885d;
        this.f23495o = bVar == null ? null : bVar.E0();
        y8.b bVar2 = dVar.f25887f;
        this.f23497q = bVar2 == null ? null : bVar2.E0();
        this.f23504x = dVar.f25892m;
        y8.b bVar3 = dVar.f25889h;
        this.f23499s = bVar3 == null ? null : bVar3.E0();
        y8.b bVar4 = dVar.f25890i;
        this.f23500t = bVar4 == null ? null : bVar4.E0();
        y8.b bVar5 = dVar.j;
        this.f23501u = bVar5 == null ? null : bVar5.E0();
        if (this.f23497q != null) {
            this.f23484b = new Matrix();
            this.f23485c = new Matrix();
            this.f23486d = new Matrix();
            this.f23487e = new float[9];
        } else {
            this.f23484b = null;
            this.f23485c = null;
            this.f23486d = null;
            this.f23487e = null;
        }
        y8.b bVar6 = dVar.f25888g;
        this.f23498r = bVar6 == null ? null : bVar6.E0();
        y8.a aVar2 = dVar.f25886e;
        if (aVar2 != null) {
            this.f23496p = aVar2.E0();
        }
        y8.b bVar7 = dVar.k;
        if (bVar7 != null) {
            this.f23502v = bVar7.E0();
        } else {
            this.f23502v = null;
        }
        y8.b bVar8 = dVar.f25891l;
        if (bVar8 != null) {
            this.f23503w = bVar8.E0();
        } else {
            this.f23503w = null;
        }
    }

    public final void a(a9.b bVar) {
        bVar.e(this.f23496p);
        bVar.e(this.f23502v);
        bVar.e(this.f23503w);
        bVar.e(this.f23492l);
        bVar.e(this.f23493m);
        bVar.e(this.f23494n);
        bVar.e(this.f23495o);
        bVar.e(this.f23497q);
        bVar.e(this.f23498r);
        bVar.e(this.f23499s);
        bVar.e(this.f23500t);
        bVar.e(this.f23501u);
    }

    public final void b(a aVar) {
        d dVar = this.f23496p;
        if (dVar != null) {
            dVar.a(aVar);
        }
        d dVar2 = this.f23502v;
        if (dVar2 != null) {
            dVar2.a(aVar);
        }
        d dVar3 = this.f23503w;
        if (dVar3 != null) {
            dVar3.a(aVar);
        }
        d dVar4 = this.f23492l;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
        d dVar5 = this.f23493m;
        if (dVar5 != null) {
            dVar5.a(aVar);
        }
        d dVar6 = this.f23494n;
        if (dVar6 != null) {
            dVar6.a(aVar);
        }
        d dVar7 = this.f23495o;
        if (dVar7 != null) {
            dVar7.a(aVar);
        }
        h hVar = this.f23497q;
        if (hVar != null) {
            hVar.a(aVar);
        }
        h hVar2 = this.f23498r;
        if (hVar2 != null) {
            hVar2.a(aVar);
        }
        h hVar3 = this.f23499s;
        if (hVar3 != null) {
            hVar3.a(aVar);
            this.f23499s.a(new p(0, this));
        }
        h hVar4 = this.f23500t;
        if (hVar4 != null) {
            hVar4.a(aVar);
            this.f23500t.a(new p(1, this));
        }
        h hVar5 = this.f23501u;
        if (hVar5 != null) {
            hVar5.a(aVar);
            this.f23501u.a(new p(2, this));
        }
    }

    public final boolean c(bm.e eVar, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == z.f21401a) {
            d dVar = this.f23492l;
            if (dVar == null) {
                this.f23492l = new r(eVar, new PointF());
                return true;
            }
            dVar.k(eVar);
            return true;
        }
        if (obj == z.f21402b) {
            d dVar2 = this.f23493m;
            if (dVar2 == null) {
                this.f23493m = new r(eVar, new PointF());
                return true;
            }
            dVar2.k(eVar);
            return true;
        }
        if (obj == z.f21403c) {
            d dVar3 = this.f23493m;
            if (dVar3 instanceof n) {
                ((n) dVar3).f23476m = eVar;
                return true;
            }
        }
        if (obj == z.f21404d) {
            d dVar4 = this.f23493m;
            if (dVar4 instanceof n) {
                ((n) dVar4).f23477n = eVar;
                return true;
            }
        }
        if (obj == z.j) {
            d dVar5 = this.f23494n;
            if (dVar5 == null) {
                this.f23494n = new r(eVar, new f9.b());
                return true;
            }
            dVar5.k(eVar);
            return true;
        }
        if (obj == z.k) {
            d dVar6 = this.f23495o;
            if (dVar6 == null) {
                this.f23495o = new r(eVar, fValueOf2);
                return true;
            }
            dVar6.k(eVar);
            return true;
        }
        if (obj == 3) {
            d dVar7 = this.f23496p;
            if (dVar7 == null) {
                this.f23496p = new r(eVar, 100);
                return true;
            }
            dVar7.k(eVar);
            return true;
        }
        if (obj == z.A) {
            d dVar8 = this.f23502v;
            if (dVar8 == null) {
                this.f23502v = new r(eVar, fValueOf);
                return true;
            }
            dVar8.k(eVar);
            return true;
        }
        if (obj == z.B) {
            d dVar9 = this.f23503w;
            if (dVar9 == null) {
                this.f23503w = new r(eVar, fValueOf);
                return true;
            }
            dVar9.k(eVar);
            return true;
        }
        if (obj == z.f21413o) {
            if (this.f23497q == null) {
                this.f23497q = new h(Collections.singletonList(new f9.a(fValueOf2)));
            }
            this.f23497q.k(eVar);
            return true;
        }
        if (obj == z.f21414p) {
            if (this.f23498r == null) {
                this.f23498r = new h(Collections.singletonList(new f9.a(fValueOf2)));
            }
            this.f23498r.k(eVar);
            return true;
        }
        if (obj == z.f21410l) {
            if (this.f23499s == null) {
                this.f23499s = new h(Collections.singletonList(new f9.a(fValueOf2)));
            }
            this.f23499s.k(eVar);
            return true;
        }
        if (obj == z.f21411m) {
            if (this.f23500t == null) {
                this.f23500t = new h(Collections.singletonList(new f9.a(fValueOf2)));
            }
            this.f23500t.k(eVar);
            return true;
        }
        if (obj != z.f21412n) {
            return false;
        }
        if (this.f23501u == null) {
            this.f23501u = new h(Collections.singletonList(new f9.a(fValueOf2)));
        }
        this.f23501u.k(eVar);
        return true;
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f23487e[i10] = 0.0f;
        }
    }

    public final Matrix e() {
        h hVar;
        h hVar2;
        PointF pointF;
        f9.b bVar;
        PointF pointF2;
        Matrix matrix = this.f23483a;
        matrix.reset();
        h hVar3 = this.f23499s;
        if ((hVar3 == null || hVar3.m() == 0.0f) && (((hVar = this.f23500t) == null || hVar.m() == 0.0f) && ((hVar2 = this.f23501u) == null || hVar2.m() == 0.0f))) {
            d dVar = this.f23493m;
            if (dVar != null && (pointF2 = (PointF) dVar.f()) != null) {
                float f10 = pointF2.x;
                if (f10 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f10, pointF2.y);
                }
            }
            if (!this.f23504x) {
                d dVar2 = this.f23495o;
                if (dVar2 != null) {
                    float fFloatValue = dVar2 instanceof r ? ((Float) dVar2.f()).floatValue() : ((h) dVar2).m();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (dVar != null) {
                float f11 = dVar.f23450d;
                PointF pointF3 = (PointF) dVar.f();
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                dVar.j(1.0E-4f + f11);
                PointF pointF4 = (PointF) dVar.f();
                dVar.j(f11);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
            }
            if (this.f23497q != null) {
                float fCos = this.f23498r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.m()) + 90.0f));
                float fSin = this.f23498r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.m()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r1.m()));
                d();
                float[] fArr = this.f23487e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f14 = -fSin;
                fArr[3] = f14;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f23484b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f23485c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f14;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f23486d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            d dVar3 = this.f23494n;
            if (dVar3 != null && (bVar = (f9.b) dVar3.f()) != null) {
                float f15 = bVar.f8718a;
                if (f15 != 1.0f || bVar.f8719b != 1.0f) {
                    matrix.preScale(f15, bVar.f8719b);
                }
            }
            d dVar4 = this.f23492l;
            if (dVar4 != null && (pointF = (PointF) dVar4.f()) != null) {
                float f16 = pointF.x;
                if (f16 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f16, -pointF.y);
                }
            }
        } else {
            h hVar4 = this.f23499s;
            float fM = hVar4 != null ? hVar4.m() : 0.0f;
            h hVar5 = this.f23500t;
            float fM2 = hVar5 != null ? hVar5.m() : 0.0f;
            h hVar6 = this.f23501u;
            float fM3 = hVar6 != null ? hVar6.m() : 0.0f;
            if (this.k || fM != this.f23488f || fM2 != this.f23489g || fM3 != this.f23490h) {
                this.f23488f = fM;
                this.f23489g = fM2;
                this.f23490h = fM3;
                if (fM != 0.0f) {
                    this.f23491i = (float) Math.cos(Math.toRadians(fM));
                } else {
                    this.f23491i = 1.0f;
                }
                if (fM2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fM2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            d dVar5 = this.f23492l;
            PointF pointF5 = dVar5 == null ? null : (PointF) dVar5.f();
            d dVar6 = this.f23493m;
            PointF pointF6 = dVar6 == null ? null : (PointF) dVar6.f();
            d dVar7 = this.f23494n;
            f9.b bVar2 = dVar7 != null ? (f9.b) dVar7.f() : null;
            float f17 = bVar2 != null ? bVar2.f8718a : 1.0f;
            float f18 = bVar2 != null ? bVar2.f8719b : 1.0f;
            float f19 = this.f23491i;
            float f20 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f21 = pointF6.x;
                if (f21 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f21, pointF6.y);
                }
            }
            if (fM3 != 0.0f) {
                matrix.preRotate(fM3);
            }
            if (fM2 != 0.0f) {
                matrix.preScale(f20, 1.0f);
            }
            if (fM != 0.0f) {
                matrix.preScale(1.0f, f19);
            }
            if (f17 != 1.0f || f18 != 1.0f) {
                matrix.preScale(f17, f18);
            }
            if (pointF5 != null) {
                float f22 = pointF5.x;
                if (f22 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f22, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f10) {
        d dVar = this.f23493m;
        PointF pointF = dVar == null ? null : (PointF) dVar.f();
        d dVar2 = this.f23494n;
        f9.b bVar = dVar2 == null ? null : (f9.b) dVar2.f();
        d dVar3 = this.f23492l;
        PointF pointF2 = dVar3 != null ? (PointF) dVar3.f() : null;
        Matrix matrix = this.f23483a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        h hVar = this.f23499s;
        float fM = hVar != null ? hVar.m() * f10 : 0.0f;
        h hVar2 = this.f23500t;
        float fM2 = hVar2 != null ? hVar2.m() * f10 : 0.0f;
        h hVar3 = this.f23501u;
        float fM3 = hVar3 != null ? hVar3.m() * f10 : 0.0f;
        if (fM == 0.0f && fM2 == 0.0f && fM3 == 0.0f) {
            d dVar4 = this.f23495o;
            if (dVar4 != null) {
                matrix.preRotate(((Float) dVar4.f()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fM != 0.0f ? (float) Math.cos(Math.toRadians(fM)) : 1.0f;
            float fCos2 = fM2 != 0.0f ? (float) Math.cos(Math.toRadians(fM2)) : 1.0f;
            if (fM3 != 0.0f) {
                matrix.preRotate(fM3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fM2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fM != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (bVar != null) {
            double d6 = f10;
            matrix.preScale((float) Math.pow(bVar.f8718a, d6), (float) Math.pow(bVar.f8719b, d6));
        }
        return matrix;
    }
}
