package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tz implements bq, x9, v40 {
    public final String a;
    public final boolean b;
    public final da c;
    public final l80 d = new l80();
    public final l80 e = new l80();
    public final Path f;
    public final d50 g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final rz k;
    public final fg l;
    public final rz m;
    public final rz n;
    public m41 o;
    public m41 p;
    public final i90 q;
    public final int r;
    public ba s;
    public float t;

    public tz(i90 i90Var, u80 u80Var, da daVar, sz szVar) {
        Path path = new Path();
        this.f = path;
        this.g = new d50(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = daVar;
        this.a = szVar.g;
        this.b = szVar.h;
        this.q = i90Var;
        this.j = szVar.a;
        path.setFillType(szVar.b);
        this.r = (int) (u80Var.b() / 32.0f);
        ba baVarQ0 = szVar.c.Q0();
        this.k = (rz) baVarQ0;
        baVarQ0.a(this);
        daVar.e(baVarQ0);
        ba baVarQ02 = szVar.d.Q0();
        this.l = (fg) baVarQ02;
        baVarQ02.a(this);
        daVar.e(baVarQ02);
        ba baVarQ03 = szVar.e.Q0();
        this.m = (rz) baVarQ03;
        baVarQ03.a(this);
        daVar.e(baVarQ03);
        ba baVarQ04 = szVar.f.Q0();
        this.n = (rz) baVarQ04;
        baVarQ04.a(this);
        daVar.e(baVarQ04);
        if (daVar.l() != null) {
            pu puVarQ0 = ((c4) daVar.l().g).Q0();
            this.s = puVarQ0;
            puVarQ0.a(this);
            daVar.e(this.s);
        }
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        PointF pointF = n90.a;
        if (obj == 4) {
            this.l.j(vq2Var);
            return;
        }
        ColorFilter colorFilter = n90.F;
        da daVar = this.c;
        if (obj == colorFilter) {
            m41 m41Var = this.o;
            if (m41Var != null) {
                daVar.o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.o = m41Var2;
            m41Var2.a(this);
            daVar.e(this.o);
            return;
        }
        if (obj == n90.G) {
            m41 m41Var3 = this.p;
            if (m41Var3 != null) {
                daVar.o(m41Var3);
            }
            this.d.a();
            this.e.a();
            m41 m41Var4 = new m41(null, vq2Var);
            this.p = m41Var4;
            m41Var4.a(this);
            daVar.e(this.p);
            return;
        }
        if (obj == n90.e) {
            ba baVar = this.s;
            if (baVar != null) {
                baVar.j(vq2Var);
                return;
            }
            m41 m41Var5 = new m41(null, vq2Var);
            this.s = m41Var5;
            m41Var5.a(this);
            daVar.e(this.s);
        }
    }

    @Override // defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((kk0) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            vi viVar = (vi) list2.get(i);
            if (viVar instanceof kk0) {
                this.i.add((kk0) viVar);
            }
        }
    }

    public final int[] e(int[] iArr) {
        m41 m41Var = this.p;
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

    @Override // defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((kk0) arrayList.get(i2)).f(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        rz rzVar = this.k;
        rz rzVar2 = this.n;
        rz rzVar3 = this.m;
        if (i3 == 1) {
            long jI = i();
            l80 l80Var = this.d;
            linearGradient = (LinearGradient) l80Var.b(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) rzVar3.e();
                PointF pointF2 = (PointF) rzVar2.e();
                qz qzVar = (qz) rzVar.e();
                int[] iArrE = e(qzVar.b);
                float[] fArr2 = qzVar.a;
                if (iArrE.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrE[0], iArrE[0]};
                } else {
                    iArr2 = iArrE;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                l80Var.e(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            l80 l80Var2 = this.e;
            RadialGradient radialGradient = (RadialGradient) l80Var2.b(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) rzVar3.e();
                PointF pointF4 = (PointF) rzVar2.e();
                qz qzVar2 = (qz) rzVar.e();
                int[] iArrE2 = e(qzVar2.b);
                float[] fArr3 = qzVar2.a;
                if (iArrE2.length < 2) {
                    iArr = new int[]{iArrE2[0], iArrE2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrE2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                l80Var2.e(jI2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        d50 d50Var = this.g;
        d50Var.setShader(linearGradient);
        m41 m41Var = this.o;
        if (m41Var != null) {
            d50Var.setColorFilter((ColorFilter) m41Var.e());
        }
        ba baVar = this.s;
        if (baVar != null) {
            float fFloatValue = ((Float) baVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                d50Var.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                d50Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = ((Integer) this.l.e()).intValue() / 100.0f;
        d50Var.setAlpha(te0.c((int) (i * fIntValue)));
        if (mqVar != null) {
            mqVar.a((int) (fIntValue * 255.0f), d50Var);
        }
        canvas.drawPath(path, d50Var);
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
