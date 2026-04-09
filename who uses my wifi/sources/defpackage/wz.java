package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wz extends la {
    public m41 A;
    public final String q;
    public final boolean r;
    public final l80 s;
    public final l80 t;
    public final RectF u;
    public final int v;
    public final int w;
    public final rz x;
    public final rz y;
    public final rz z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wz(i90 i90Var, da daVar, vz vzVar) {
        int iS = ex0.s(vzVar.h);
        Paint.Cap cap = iS != 0 ? iS != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iS2 = ex0.s(vzVar.i);
        super(i90Var, daVar, cap, iS2 != 0 ? iS2 != 1 ? iS2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, vzVar.j, vzVar.d, vzVar.g, vzVar.k, vzVar.l);
        this.s = new l80();
        this.t = new l80();
        this.u = new RectF();
        this.q = vzVar.a;
        this.v = vzVar.b;
        this.r = vzVar.m;
        this.w = (int) (i90Var.f.b() / 32.0f);
        ba baVarQ0 = vzVar.c.Q0();
        this.x = (rz) baVarQ0;
        baVarQ0.a(this);
        daVar.e(baVarQ0);
        ba baVarQ02 = vzVar.e.Q0();
        this.y = (rz) baVarQ02;
        baVarQ02.a(this);
        daVar.e(baVarQ02);
        ba baVarQ03 = vzVar.f.Q0();
        this.z = (rz) baVarQ03;
        baVarQ03.a(this);
        daVar.e(baVarQ03);
    }

    @Override // defpackage.la, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        if (obj == n90.G) {
            m41 m41Var = this.A;
            da daVar = this.f;
            if (m41Var != null) {
                daVar.o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.A = m41Var2;
            m41Var2.a(this);
            daVar.e(this.A);
        }
    }

    public final int[] e(int[] iArr) {
        m41 m41Var = this.A;
        if (m41Var != null) {
            Integer[] numArr = (Integer[]) m41Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.la, defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        b(this.u, matrix, false);
        int i2 = this.v;
        rz rzVar = this.x;
        rz rzVar2 = this.z;
        rz rzVar3 = this.y;
        if (i2 == 1) {
            long jI = i();
            l80 l80Var = this.s;
            shader = (LinearGradient) l80Var.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) rzVar3.e();
                PointF pointF2 = (PointF) rzVar2.e();
                qz qzVar = (qz) rzVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(qzVar.b), qzVar.a, Shader.TileMode.CLAMP);
                l80Var.e(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            l80 l80Var2 = this.t;
            shader = (RadialGradient) l80Var2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) rzVar3.e();
                PointF pointF4 = (PointF) rzVar2.e();
                qz qzVar2 = (qz) rzVar.e();
                int[] iArrE = e(qzVar2.b);
                float[] fArr = qzVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrE, fArr, Shader.TileMode.CLAMP);
                l80Var2.e(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, mqVar);
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.q;
    }

    public final int i() {
        float f = this.y.d;
        float f2 = this.w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.z.d * f2);
        int iRound3 = Math.round(this.x.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
