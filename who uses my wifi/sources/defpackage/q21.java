package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q21 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public ba f;
    public ba g;
    public ba h;
    public ba i;
    public ba j;
    public pu k;
    public pu l;
    public ba m;
    public ba n;
    public final boolean o;

    public q21(h4 h4Var) {
        kf3 kf3Var = h4Var.a;
        this.f = kf3Var == null ? null : kf3Var.Q0();
        j4 j4Var = h4Var.b;
        this.g = j4Var == null ? null : j4Var.Q0();
        b4 b4Var = h4Var.c;
        this.h = b4Var == null ? null : b4Var.Q0();
        c4 c4Var = h4Var.d;
        this.i = c4Var == null ? null : c4Var.Q0();
        c4 c4Var2 = h4Var.f;
        pu puVarQ0 = c4Var2 == null ? null : c4Var2.Q0();
        this.k = puVarQ0;
        this.o = h4Var.j;
        if (puVarQ0 != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        c4 c4Var3 = h4Var.g;
        this.l = c4Var3 == null ? null : c4Var3.Q0();
        b4 b4Var2 = h4Var.e;
        if (b4Var2 != null) {
            this.j = b4Var2.Q0();
        }
        c4 c4Var4 = h4Var.h;
        if (c4Var4 != null) {
            this.m = c4Var4.Q0();
        } else {
            this.m = null;
        }
        c4 c4Var5 = h4Var.i;
        if (c4Var5 != null) {
            this.n = c4Var5.Q0();
        } else {
            this.n = null;
        }
    }

    public final void a(da daVar) {
        daVar.e(this.j);
        daVar.e(this.m);
        daVar.e(this.n);
        daVar.e(this.f);
        daVar.e(this.g);
        daVar.e(this.h);
        daVar.e(this.i);
        daVar.e(this.k);
        daVar.e(this.l);
    }

    public final void b(x9 x9Var) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.a(x9Var);
        }
        ba baVar2 = this.m;
        if (baVar2 != null) {
            baVar2.a(x9Var);
        }
        ba baVar3 = this.n;
        if (baVar3 != null) {
            baVar3.a(x9Var);
        }
        ba baVar4 = this.f;
        if (baVar4 != null) {
            baVar4.a(x9Var);
        }
        ba baVar5 = this.g;
        if (baVar5 != null) {
            baVar5.a(x9Var);
        }
        ba baVar6 = this.h;
        if (baVar6 != null) {
            baVar6.a(x9Var);
        }
        ba baVar7 = this.i;
        if (baVar7 != null) {
            baVar7.a(x9Var);
        }
        pu puVar = this.k;
        if (puVar != null) {
            puVar.a(x9Var);
        }
        pu puVar2 = this.l;
        if (puVar2 != null) {
            puVar2.a(x9Var);
        }
    }

    public final boolean c(Object obj, vq2 vq2Var) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == n90.a) {
            ba baVar = this.f;
            if (baVar == null) {
                this.f = new m41(new PointF(), vq2Var);
                return true;
            }
            baVar.j(vq2Var);
            return true;
        }
        if (obj == n90.b) {
            ba baVar2 = this.g;
            if (baVar2 == null) {
                this.g = new m41(new PointF(), vq2Var);
                return true;
            }
            baVar2.j(vq2Var);
            return true;
        }
        if (obj == n90.c) {
            ba baVar3 = this.g;
            if (baVar3 instanceof mx0) {
                ((mx0) baVar3).m = vq2Var;
                return true;
            }
        }
        if (obj == n90.d) {
            ba baVar4 = this.g;
            if (baVar4 instanceof mx0) {
                ((mx0) baVar4).n = vq2Var;
                return true;
            }
        }
        if (obj == n90.j) {
            ba baVar5 = this.h;
            if (baVar5 == null) {
                this.h = new m41(new dt0(), vq2Var);
                return true;
            }
            baVar5.j(vq2Var);
            return true;
        }
        if (obj == n90.k) {
            ba baVar6 = this.i;
            if (baVar6 == null) {
                this.i = new m41(fValueOf2, vq2Var);
                return true;
            }
            baVar6.j(vq2Var);
            return true;
        }
        if (obj == 3) {
            ba baVar7 = this.j;
            if (baVar7 == null) {
                this.j = new m41(100, vq2Var);
                return true;
            }
            baVar7.j(vq2Var);
            return true;
        }
        if (obj == n90.x) {
            ba baVar8 = this.m;
            if (baVar8 == null) {
                this.m = new m41(fValueOf, vq2Var);
                return true;
            }
            baVar8.j(vq2Var);
            return true;
        }
        if (obj == n90.y) {
            ba baVar9 = this.n;
            if (baVar9 == null) {
                this.n = new m41(fValueOf, vq2Var);
                return true;
            }
            baVar9.j(vq2Var);
            return true;
        }
        if (obj == n90.l) {
            if (this.k == null) {
                this.k = new pu(Collections.singletonList(new w40(fValueOf2)));
            }
            this.k.j(vq2Var);
            return true;
        }
        if (obj != n90.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new pu(Collections.singletonList(new w40(fValueOf2)));
        }
        this.l.j(vq2Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        dt0 dt0Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        ba baVar = this.g;
        if (baVar != null && (pointF2 = (PointF) baVar.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            ba baVar2 = this.i;
            if (baVar2 != null) {
                float fFloatValue = baVar2 instanceof m41 ? ((Float) baVar2.e()).floatValue() : ((pu) baVar2).l();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (baVar != null) {
            float f2 = baVar.d;
            PointF pointF3 = (PointF) baVar.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            baVar.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) baVar.e();
            baVar.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.k != null) {
            float fCos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.l()) + 90.0f));
            float fSin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.l()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        ba baVar3 = this.h;
        if (baVar3 != null && (dt0Var = (dt0) baVar3.e()) != null) {
            float f6 = dt0Var.a;
            if (f6 != 1.0f || dt0Var.b != 1.0f) {
                matrix.preScale(f6, dt0Var.b);
            }
        }
        ba baVar4 = this.f;
        if (baVar4 != null && (pointF = (PointF) baVar4.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        ba baVar = this.g;
        PointF pointF = baVar == null ? null : (PointF) baVar.e();
        ba baVar2 = this.h;
        dt0 dt0Var = baVar2 == null ? null : (dt0) baVar2.e();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dt0Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(dt0Var.a, d), (float) Math.pow(dt0Var.b, d));
        }
        ba baVar3 = this.i;
        if (baVar3 != null) {
            float fFloatValue = ((Float) baVar3.e()).floatValue();
            ba baVar4 = this.f;
            PointF pointF2 = baVar4 != null ? (PointF) baVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
