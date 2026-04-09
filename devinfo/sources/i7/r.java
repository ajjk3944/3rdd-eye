package i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import f7.b0;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f25910b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f25911c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f25912d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f25913e;

    /* renamed from: l, reason: collision with root package name */
    public e f25918l;

    /* renamed from: m, reason: collision with root package name */
    public e f25919m;

    /* renamed from: n, reason: collision with root package name */
    public e f25920n;

    /* renamed from: o, reason: collision with root package name */
    public e f25921o;

    /* renamed from: p, reason: collision with root package name */
    public e f25922p;

    /* renamed from: q, reason: collision with root package name */
    public i f25923q;

    /* renamed from: r, reason: collision with root package name */
    public i f25924r;

    /* renamed from: s, reason: collision with root package name */
    public i f25925s;

    /* renamed from: t, reason: collision with root package name */
    public i f25926t;

    /* renamed from: u, reason: collision with root package name */
    public i f25927u;

    /* renamed from: v, reason: collision with root package name */
    public e f25928v;

    /* renamed from: w, reason: collision with root package name */
    public e f25929w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25930x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f25909a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f25914f = Float.NaN;
    public float g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f25915h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f25916i = 1.0f;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25917k = true;

    public r(l7.e eVar) {
        h7.c cVar = eVar.f28607a;
        this.f25918l = cVar == null ? null : cVar.g();
        l7.f fVar = eVar.f28608b;
        this.f25919m = fVar == null ? null : fVar.g();
        l7.a aVar = eVar.f28609c;
        this.f25920n = aVar == null ? null : aVar.g();
        l7.b bVar = eVar.f28610d;
        this.f25921o = bVar == null ? null : bVar.g();
        l7.b bVar2 = eVar.f28612f;
        this.f25923q = bVar2 == null ? null : bVar2.g();
        this.f25930x = eVar.f28617m;
        l7.b bVar3 = eVar.f28613h;
        this.f25925s = bVar3 == null ? null : bVar3.g();
        l7.b bVar4 = eVar.f28614i;
        this.f25926t = bVar4 == null ? null : bVar4.g();
        l7.b bVar5 = eVar.j;
        this.f25927u = bVar5 == null ? null : bVar5.g();
        if (this.f25923q != null) {
            this.f25910b = new Matrix();
            this.f25911c = new Matrix();
            this.f25912d = new Matrix();
            this.f25913e = new float[9];
        } else {
            this.f25910b = null;
            this.f25911c = null;
            this.f25912d = null;
            this.f25913e = null;
        }
        l7.b bVar6 = eVar.g;
        this.f25924r = bVar6 == null ? null : bVar6.g();
        l7.a aVar2 = eVar.f28611e;
        if (aVar2 != null) {
            this.f25922p = aVar2.g();
        }
        l7.b bVar7 = eVar.f28615k;
        if (bVar7 != null) {
            this.f25928v = bVar7.g();
        } else {
            this.f25928v = null;
        }
        l7.b bVar8 = eVar.f28616l;
        if (bVar8 != null) {
            this.f25929w = bVar8.g();
        } else {
            this.f25929w = null;
        }
    }

    public final void a(n7.a aVar) {
        aVar.e(this.f25922p);
        aVar.e(this.f25928v);
        aVar.e(this.f25929w);
        aVar.e(this.f25918l);
        aVar.e(this.f25919m);
        aVar.e(this.f25920n);
        aVar.e(this.f25921o);
        aVar.e(this.f25923q);
        aVar.e(this.f25924r);
        aVar.e(this.f25925s);
        aVar.e(this.f25926t);
        aVar.e(this.f25927u);
    }

    public final void b(a aVar) {
        e eVar = this.f25922p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f25928v;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f25929w;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f25918l;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f25919m;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f25920n;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f25921o;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f25923q;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f25924r;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
        i iVar3 = this.f25925s;
        if (iVar3 != null) {
            iVar3.a(aVar);
            this.f25925s.a(new q(0, this));
        }
        i iVar4 = this.f25926t;
        if (iVar4 != null) {
            iVar4.a(aVar);
            this.f25926t.a(new q(1, this));
        }
        i iVar5 = this.f25927u;
        if (iVar5 != null) {
            iVar5.a(aVar);
            this.f25927u.a(new q(2, this));
        }
    }

    public final boolean c(Object obj, km.o oVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == b0.f23692a) {
            e eVar = this.f25918l;
            if (eVar == null) {
                this.f25918l = new s(new PointF(), oVar);
                return true;
            }
            eVar.j(oVar);
            return true;
        }
        if (obj == b0.f23693b) {
            e eVar2 = this.f25919m;
            if (eVar2 == null) {
                this.f25919m = new s(new PointF(), oVar);
                return true;
            }
            eVar2.j(oVar);
            return true;
        }
        if (obj == b0.f23694c) {
            e eVar3 = this.f25919m;
            if (eVar3 instanceof o) {
                ((o) eVar3).f25902m = oVar;
                return true;
            }
        }
        if (obj == b0.f23695d) {
            e eVar4 = this.f25919m;
            if (eVar4 instanceof o) {
                ((o) eVar4).f25903n = oVar;
                return true;
            }
        }
        if (obj == b0.j) {
            e eVar5 = this.f25920n;
            if (eVar5 == null) {
                this.f25920n = new s(new s7.c(), oVar);
                return true;
            }
            eVar5.j(oVar);
            return true;
        }
        if (obj == b0.f23700k) {
            e eVar6 = this.f25921o;
            if (eVar6 == null) {
                this.f25921o = new s(fValueOf2, oVar);
                return true;
            }
            eVar6.j(oVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f25922p;
            if (eVar7 == null) {
                this.f25922p = new s(100, oVar);
                return true;
            }
            eVar7.j(oVar);
            return true;
        }
        if (obj == b0.A) {
            e eVar8 = this.f25928v;
            if (eVar8 == null) {
                this.f25928v = new s(fValueOf, oVar);
                return true;
            }
            eVar8.j(oVar);
            return true;
        }
        if (obj == b0.B) {
            e eVar9 = this.f25929w;
            if (eVar9 == null) {
                this.f25929w = new s(fValueOf, oVar);
                return true;
            }
            eVar9.j(oVar);
            return true;
        }
        if (obj == b0.f23704o) {
            if (this.f25923q == null) {
                this.f25923q = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f25923q.j(oVar);
            return true;
        }
        if (obj == b0.f23705p) {
            if (this.f25924r == null) {
                this.f25924r = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f25924r.j(oVar);
            return true;
        }
        if (obj == b0.f23701l) {
            if (this.f25925s == null) {
                this.f25925s = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f25925s.j(oVar);
            return true;
        }
        if (obj == b0.f23702m) {
            if (this.f25926t == null) {
                this.f25926t = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f25926t.j(oVar);
            return true;
        }
        if (obj != b0.f23703n) {
            return false;
        }
        if (this.f25927u == null) {
            this.f25927u = new i(Collections.singletonList(new s7.a(fValueOf2)));
        }
        this.f25927u.j(oVar);
        return true;
    }

    public final void d() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f25913e[i4] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        s7.c cVar;
        PointF pointF2;
        Matrix matrix = this.f25909a;
        matrix.reset();
        i iVar3 = this.f25925s;
        if ((iVar3 == null || iVar3.l() == 0.0f) && (((iVar = this.f25926t) == null || iVar.l() == 0.0f) && ((iVar2 = this.f25927u) == null || iVar2.l() == 0.0f))) {
            e eVar = this.f25919m;
            if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
                float f10 = pointF2.x;
                if (f10 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f10, pointF2.y);
                }
            }
            if (!this.f25930x) {
                e eVar2 = this.f25921o;
                if (eVar2 != null) {
                    float fFloatValue = eVar2 instanceof s ? ((Float) eVar2.e()).floatValue() : ((i) eVar2).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (eVar != null) {
                float f11 = eVar.f25875d;
                PointF pointF3 = (PointF) eVar.e();
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                eVar.i(1.0E-4f + f11);
                PointF pointF4 = (PointF) eVar.e();
                eVar.i(f11);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
            }
            if (this.f25923q != null) {
                float fCos = this.f25924r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float fSin = this.f25924r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f25913e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f14 = -fSin;
                fArr[3] = f14;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f25910b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f25911c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f14;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f25912d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            e eVar3 = this.f25920n;
            if (eVar3 != null && (cVar = (s7.c) eVar3.e()) != null) {
                float f15 = cVar.f33503a;
                if (f15 != 1.0f || cVar.f33504b != 1.0f) {
                    matrix.preScale(f15, cVar.f33504b);
                }
            }
            e eVar4 = this.f25918l;
            if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
                float f16 = pointF.x;
                if (f16 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f16, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f25925s;
            float fL = iVar4 != null ? iVar4.l() : 0.0f;
            i iVar5 = this.f25926t;
            float fL2 = iVar5 != null ? iVar5.l() : 0.0f;
            i iVar6 = this.f25927u;
            float fL3 = iVar6 != null ? iVar6.l() : 0.0f;
            if (this.f25917k || fL != this.f25914f || fL2 != this.g || fL3 != this.f25915h) {
                this.f25914f = fL;
                this.g = fL2;
                this.f25915h = fL3;
                if (fL != 0.0f) {
                    this.f25916i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.f25916i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.j = 1.0f;
                }
                this.f25917k = false;
            }
            e eVar5 = this.f25918l;
            PointF pointF5 = eVar5 == null ? null : (PointF) eVar5.e();
            e eVar6 = this.f25919m;
            PointF pointF6 = eVar6 == null ? null : (PointF) eVar6.e();
            e eVar7 = this.f25920n;
            s7.c cVar2 = eVar7 != null ? (s7.c) eVar7.e() : null;
            float f17 = cVar2 != null ? cVar2.f33503a : 1.0f;
            float f18 = cVar2 != null ? cVar2.f33504b : 1.0f;
            float f19 = this.f25916i;
            float f20 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f21 = pointF6.x;
                if (f21 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f21, pointF6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f20, 1.0f);
            }
            if (fL != 0.0f) {
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
        e eVar = this.f25919m;
        PointF pointF = eVar == null ? null : (PointF) eVar.e();
        e eVar2 = this.f25920n;
        s7.c cVar = eVar2 == null ? null : (s7.c) eVar2.e();
        e eVar3 = this.f25918l;
        PointF pointF2 = eVar3 != null ? (PointF) eVar3.e() : null;
        Matrix matrix = this.f25909a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        i iVar = this.f25925s;
        float fL = iVar != null ? iVar.l() * f10 : 0.0f;
        i iVar2 = this.f25926t;
        float fL2 = iVar2 != null ? iVar2.l() * f10 : 0.0f;
        i iVar3 = this.f25927u;
        float fL3 = iVar3 != null ? iVar3.l() * f10 : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            e eVar4 = this.f25921o;
            if (eVar4 != null) {
                matrix.preRotate(((Float) eVar4.e()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (cVar != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(cVar.f33503a, d10), (float) Math.pow(cVar.f33504b, d10));
        }
        return matrix;
    }
}
