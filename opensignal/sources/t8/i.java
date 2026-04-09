package t8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import r8.z;

/* loaded from: classes.dex */
public final class i extends b {
    public u8.r A;

    /* renamed from: q, reason: collision with root package name */
    public final String f22593q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f22594r;

    /* renamed from: s, reason: collision with root package name */
    public final u.o f22595s;

    /* renamed from: t, reason: collision with root package name */
    public final u.o f22596t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f22597u;

    /* renamed from: v, reason: collision with root package name */
    public final z8.f f22598v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22599w;

    /* renamed from: x, reason: collision with root package name */
    public final u8.i f22600x;

    /* renamed from: y, reason: collision with root package name */
    public final u8.i f22601y;

    /* renamed from: z, reason: collision with root package name */
    public final u8.i f22602z;

    public i(r8.v vVar, a9.b bVar, z8.e eVar) {
        super(vVar, bVar, eVar.f26731h.toPaintCap(), eVar.f26732i.toPaintJoin(), eVar.j, eVar.f26727d, eVar.f26730g, eVar.k, eVar.f26733l);
        this.f22595s = new u.o((Object) null);
        this.f22596t = new u.o((Object) null);
        this.f22597u = new RectF();
        this.f22593q = eVar.f26724a;
        this.f22598v = eVar.f26725b;
        this.f22594r = eVar.f26734m;
        this.f22599w = (int) (vVar.f21375a.b() / 32.0f);
        u8.d dVarE0 = eVar.f26726c.E0();
        this.f22600x = (u8.i) dVarE0;
        dVarE0.a(this);
        bVar.e(dVarE0);
        u8.d dVarE02 = eVar.f26728e.E0();
        this.f22601y = (u8.i) dVarE02;
        dVarE02.a(this);
        bVar.e(dVarE02);
        u8.d dVarE03 = eVar.f26729f.E0();
        this.f22602z = (u8.i) dVarE03;
        dVarE03.a(this);
        bVar.e(dVarE03);
    }

    public final int[] e(int[] iArr) {
        u8.r rVar = this.A;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // t8.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        if (obj == z.J) {
            u8.r rVar = this.A;
            a9.b bVar = this.f22538f;
            if (rVar != null) {
                bVar.o(rVar);
            }
            u8.r rVar2 = new u8.r(eVar, null);
            this.A = rVar2;
            rVar2.a(this);
            bVar.e(this.A);
        }
    }

    @Override // t8.c
    public final String getName() {
        return this.f22593q;
    }

    @Override // t8.b, t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f22594r) {
            return;
        }
        d(this.f22597u, matrix, false);
        z8.f fVar = this.f22598v;
        z8.f fVar2 = z8.f.LINEAR;
        u8.i iVar = this.f22600x;
        u8.i iVar2 = this.f22602z;
        u8.i iVar3 = this.f22601y;
        if (fVar == fVar2) {
            long jI = i();
            u.o oVar = this.f22595s;
            shader = (LinearGradient) oVar.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) iVar3.f();
                PointF pointF2 = (PointF) iVar2.f();
                z8.c cVar = (z8.c) iVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(cVar.f26715b), cVar.f26714a, Shader.TileMode.CLAMP);
                oVar.e(radialGradient, jI);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            u.o oVar2 = this.f22596t;
            shader = (RadialGradient) oVar2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) iVar3.f();
                PointF pointF4 = (PointF) iVar2.f();
                z8.c cVar2 = (z8.c) iVar.f();
                int[] iArrE = e(cVar2.f26715b);
                float[] fArr = cVar2.f26714a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrE, fArr, Shader.TileMode.CLAMP);
                oVar2.e(radialGradient, jI2);
                shader = radialGradient;
            }
        }
        this.f22541i.setShader(shader);
        super.h(canvas, matrix, i10, aVar);
    }

    public final int i() {
        float f10 = this.f22601y.f23450d;
        float f11 = this.f22599w;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f22602z.f23450d * f11);
        int iRound3 = Math.round(this.f22600x.f23450d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
