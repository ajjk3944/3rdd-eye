package t8;

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
import r8.z;

/* loaded from: classes.dex */
public final class h implements e, u8.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f22575a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22576b;

    /* renamed from: c, reason: collision with root package name */
    public final a9.b f22577c;

    /* renamed from: d, reason: collision with root package name */
    public final u.o f22578d = new u.o((Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final u.o f22579e = new u.o((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public final Path f22580f;

    /* renamed from: g, reason: collision with root package name */
    public final a9.l f22581g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f22582h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22583i;
    public final z8.f j;
    public final u8.i k;

    /* renamed from: l, reason: collision with root package name */
    public final u8.e f22584l;

    /* renamed from: m, reason: collision with root package name */
    public final u8.i f22585m;

    /* renamed from: n, reason: collision with root package name */
    public final u8.i f22586n;

    /* renamed from: o, reason: collision with root package name */
    public u8.r f22587o;

    /* renamed from: p, reason: collision with root package name */
    public u8.r f22588p;

    /* renamed from: q, reason: collision with root package name */
    public final r8.v f22589q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22590r;

    /* renamed from: s, reason: collision with root package name */
    public u8.d f22591s;

    /* renamed from: t, reason: collision with root package name */
    public float f22592t;

    public h(r8.v vVar, r8.h hVar, a9.b bVar, z8.d dVar) {
        Path path = new Path();
        this.f22580f = path;
        this.f22581g = new a9.l(1, 2);
        this.f22582h = new RectF();
        this.f22583i = new ArrayList();
        this.f22592t = 0.0f;
        this.f22577c = bVar;
        this.f22575a = dVar.f26722g;
        this.f22576b = dVar.f26723h;
        this.f22589q = vVar;
        this.j = dVar.f26716a;
        path.setFillType(dVar.f26717b);
        this.f22590r = (int) (hVar.b() / 32.0f);
        u8.d dVarE0 = dVar.f26718c.E0();
        this.k = (u8.i) dVarE0;
        dVarE0.a(this);
        bVar.e(dVarE0);
        u8.d dVarE02 = dVar.f26719d.E0();
        this.f22584l = (u8.e) dVarE02;
        dVarE02.a(this);
        bVar.e(dVarE02);
        u8.d dVarE03 = dVar.f26720e.E0();
        this.f22585m = (u8.i) dVarE03;
        dVarE03.a(this);
        bVar.e(dVarE03);
        u8.d dVarE04 = dVar.f26721f.E0();
        this.f22586n = (u8.i) dVarE04;
        dVarE04.a(this);
        bVar.e(dVarE04);
        if (bVar.l() != null) {
            u8.h hVarE0 = ((y8.b) bVar.l().f26690a).E0();
            this.f22591s = hVarE0;
            hVarE0.a(this);
            bVar.e(this.f22591s);
        }
    }

    @Override // u8.a
    public final void a() {
        this.f22589q.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof n) {
                this.f22583i.add((n) cVar);
            }
        }
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f22580f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22583i;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i10)).g(), matrix);
                i10++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        u8.r rVar = this.f22588p;
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

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        PointF pointF = z.f21401a;
        if (obj == 4) {
            this.f22584l.k(eVar);
            return;
        }
        ColorFilter colorFilter = z.I;
        a9.b bVar = this.f22577c;
        if (obj == colorFilter) {
            u8.r rVar = this.f22587o;
            if (rVar != null) {
                bVar.o(rVar);
            }
            u8.r rVar2 = new u8.r(eVar, null);
            this.f22587o = rVar2;
            rVar2.a(this);
            bVar.e(this.f22587o);
            return;
        }
        if (obj == z.J) {
            u8.r rVar3 = this.f22588p;
            if (rVar3 != null) {
                bVar.o(rVar3);
            }
            this.f22578d.a();
            this.f22579e.a();
            u8.r rVar4 = new u8.r(eVar, null);
            this.f22588p = rVar4;
            rVar4.a(this);
            bVar.e(this.f22588p);
            return;
        }
        if (obj == z.f21405e) {
            u8.d dVar = this.f22591s;
            if (dVar != null) {
                dVar.k(eVar);
                return;
            }
            u8.r rVar5 = new u8.r(eVar, null);
            this.f22591s = rVar5;
            rVar5.a(this);
            bVar.e(this.f22591s);
        }
    }

    @Override // t8.c
    public final String getName() {
        return this.f22575a;
    }

    @Override // t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f22576b) {
            return;
        }
        r8.a aVar2 = r8.d.f21312a;
        Path path = this.f22580f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22583i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i11)).g(), matrix);
            i11++;
        }
        path.computeBounds(this.f22582h, false);
        z8.f fVar = this.j;
        z8.f fVar2 = z8.f.LINEAR;
        u8.i iVar = this.k;
        u8.i iVar2 = this.f22586n;
        u8.i iVar3 = this.f22585m;
        if (fVar == fVar2) {
            long jI = i();
            u.o oVar = this.f22578d;
            linearGradient = (LinearGradient) oVar.b(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) iVar3.f();
                PointF pointF2 = (PointF) iVar2.f();
                z8.c cVar = (z8.c) iVar.f();
                int[] iArrE = e(cVar.f26715b);
                float[] fArr2 = cVar.f26714a;
                if (iArrE.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrE[0], iArrE[0]};
                } else {
                    iArr2 = iArrE;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                oVar.e(linearGradient, jI);
            }
        } else {
            long jI2 = i();
            u.o oVar2 = this.f22579e;
            RadialGradient radialGradient = (RadialGradient) oVar2.b(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) iVar3.f();
                PointF pointF4 = (PointF) iVar2.f();
                z8.c cVar2 = (z8.c) iVar.f();
                int[] iArrE2 = e(cVar2.f26715b);
                float[] fArr3 = cVar2.f26714a;
                if (iArrE2.length < 2) {
                    iArr = new int[]{iArrE2[0], iArrE2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrE2;
                }
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                oVar2.e(radialGradient2, jI2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        a9.l lVar = this.f22581g;
        lVar.setShader(linearGradient);
        u8.r rVar = this.f22587o;
        if (rVar != null) {
            lVar.setColorFilter((ColorFilter) rVar.f());
        }
        u8.d dVar = this.f22591s;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                lVar.setMaskFilter(null);
            } else if (fFloatValue != this.f22592t) {
                lVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f22592t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f22584l.f()).intValue() / 100.0f;
        lVar.setAlpha(e9.g.c((int) (i10 * fIntValue)));
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), lVar);
        }
        canvas.drawPath(path, lVar);
        r8.a aVar3 = r8.d.f21312a;
    }

    public final int i() {
        float f10 = this.f22585m.f23450d;
        float f11 = this.f22590r;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f22586n.f23450d * f11);
        int iRound3 = Math.round(this.k.f23450d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
