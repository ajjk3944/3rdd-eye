package h7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import f7.b0;
import f7.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends b {
    public i7.s A;

    /* renamed from: q, reason: collision with root package name */
    public final String f24948q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f24949r;

    /* renamed from: s, reason: collision with root package name */
    public final x.o f24950s;

    /* renamed from: t, reason: collision with root package name */
    public final x.o f24951t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f24952u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24953v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24954w;

    /* renamed from: x, reason: collision with root package name */
    public final i7.j f24955x;

    /* renamed from: y, reason: collision with root package name */
    public final i7.j f24956y;

    /* renamed from: z, reason: collision with root package name */
    public final i7.j f24957z;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(x xVar, n7.a aVar, m7.e eVar) {
        Paint.Join join;
        Paint.Join join2;
        int iC = i3.e.c(eVar.f28897h);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = i3.e.c(eVar.f28898i);
        if (iC2 == 0) {
            join = Paint.Join.MITER;
        } else if (iC2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iC2 != 2) {
                join2 = null;
                super(xVar, aVar, cap, join2, eVar.j, eVar.f28894d, eVar.g, eVar.f28899k, eVar.f28900l);
                this.f24950s = new x.o((Object) null);
                this.f24951t = new x.o((Object) null);
                this.f24952u = new RectF();
                this.f24948q = eVar.f28891a;
                this.f24953v = eVar.f28892b;
                this.f24949r = eVar.f28901m;
                this.f24954w = (int) (xVar.f23801a.b() / 32.0f);
                i7.e eVarG = eVar.f28893c.g();
                this.f24955x = (i7.j) eVarG;
                eVarG.a(this);
                aVar.e(eVarG);
                i7.e eVarG2 = eVar.f28895e.g();
                this.f24956y = (i7.j) eVarG2;
                eVarG2.a(this);
                aVar.e(eVarG2);
                i7.e eVarG3 = eVar.f28896f.g();
                this.f24957z = (i7.j) eVarG3;
                eVarG3.a(this);
                aVar.e(eVarG3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(xVar, aVar, cap, join2, eVar.j, eVar.f28894d, eVar.g, eVar.f28899k, eVar.f28900l);
        this.f24950s = new x.o((Object) null);
        this.f24951t = new x.o((Object) null);
        this.f24952u = new RectF();
        this.f24948q = eVar.f28891a;
        this.f24953v = eVar.f28892b;
        this.f24949r = eVar.f28901m;
        this.f24954w = (int) (xVar.f23801a.b() / 32.0f);
        i7.e eVarG4 = eVar.f28893c.g();
        this.f24955x = (i7.j) eVarG4;
        eVarG4.a(this);
        aVar.e(eVarG4);
        i7.e eVarG22 = eVar.f28895e.g();
        this.f24956y = (i7.j) eVarG22;
        eVarG22.a(this);
        aVar.e(eVarG22);
        i7.e eVarG32 = eVar.f28896f.g();
        this.f24957z = (i7.j) eVarG32;
        eVarG32.a(this);
        aVar.e(eVarG32);
    }

    public final int[] e(int[] iArr) {
        i7.s sVar = this.A;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    @Override // h7.b, k7.f
    public final void f(Object obj, km.o oVar) {
        super.f(obj, oVar);
        if (obj == b0.J) {
            i7.s sVar = this.A;
            n7.a aVar = this.f24893f;
            if (sVar != null) {
                aVar.o(sVar);
            }
            i7.s sVar2 = new i7.s(null, oVar);
            this.A = sVar2;
            sVar2.a(this);
            aVar.e(this.A);
        }
    }

    @Override // h7.d
    public final String getName() {
        return this.f24948q;
    }

    @Override // h7.b, h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f24949r) {
            return;
        }
        d(this.f24952u, matrix, false);
        int i10 = this.f24953v;
        i7.j jVar = this.f24955x;
        i7.j jVar2 = this.f24957z;
        i7.j jVar3 = this.f24956y;
        if (i10 == 1) {
            long jI = i();
            x.o oVar = this.f24950s;
            shader = (LinearGradient) oVar.e(jI);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                m7.c cVar = (m7.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(cVar.f28883b), cVar.f28882a, Shader.TileMode.CLAMP);
                oVar.i(radialGradient, jI);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            x.o oVar2 = this.f24951t;
            shader = (RadialGradient) oVar2.e(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                m7.c cVar2 = (m7.c) jVar.e();
                int[] iArrE = e(cVar2.f28883b);
                float[] fArr = cVar2.f28882a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrE, fArr, Shader.TileMode.CLAMP);
                oVar2.i(radialGradient, jI2);
                shader = radialGradient;
            }
        }
        this.f24895i.setShader(shader);
        super.h(canvas, matrix, i4, bVar);
    }

    public final int i() {
        float f10 = this.f24956y.f25875d;
        float f11 = this.f24954w;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f24957z.f25875d * f11);
        int iRound3 = Math.round(this.f24955x.f25875d * f11);
        int i4 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i4 = i4 * 31 * iRound2;
        }
        return iRound3 != 0 ? i4 * 31 * iRound3 : i4;
    }
}
