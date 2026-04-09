package h7;

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
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements f, i7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f24930a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24931b;

    /* renamed from: c, reason: collision with root package name */
    public final n7.a f24932c;

    /* renamed from: d, reason: collision with root package name */
    public final x.o f24933d = new x.o((Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final x.o f24934e = new x.o((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public final Path f24935f;
    public final g7.a g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f24936h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24937i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.j f24938k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.f f24939l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.j f24940m;

    /* renamed from: n, reason: collision with root package name */
    public final i7.j f24941n;

    /* renamed from: o, reason: collision with root package name */
    public i7.s f24942o;

    /* renamed from: p, reason: collision with root package name */
    public i7.s f24943p;

    /* renamed from: q, reason: collision with root package name */
    public final x f24944q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24945r;

    /* renamed from: s, reason: collision with root package name */
    public i7.e f24946s;

    /* renamed from: t, reason: collision with root package name */
    public float f24947t;

    public i(x xVar, f7.j jVar, n7.a aVar, m7.d dVar) {
        Path path = new Path();
        this.f24935f = path;
        this.g = new g7.a(1, 0);
        this.f24936h = new RectF();
        this.f24937i = new ArrayList();
        this.f24947t = 0.0f;
        this.f24932c = aVar;
        this.f24930a = dVar.g;
        this.f24931b = dVar.f28890h;
        this.f24944q = xVar;
        this.j = dVar.f28884a;
        path.setFillType(dVar.f28885b);
        this.f24945r = (int) (jVar.b() / 32.0f);
        i7.e eVarG = dVar.f28886c.g();
        this.f24938k = (i7.j) eVarG;
        eVarG.a(this);
        aVar.e(eVarG);
        i7.e eVarG2 = dVar.f28887d.g();
        this.f24939l = (i7.f) eVarG2;
        eVarG2.a(this);
        aVar.e(eVarG2);
        i7.e eVarG3 = dVar.f28888e.g();
        this.f24940m = (i7.j) eVarG3;
        eVarG3.a(this);
        aVar.e(eVarG3);
        i7.e eVarG4 = dVar.f28889f.g();
        this.f24941n = (i7.j) eVarG4;
        eVarG4.a(this);
        aVar.e(eVarG4);
        if (aVar.l() != null) {
            i7.i iVarG = ((l7.b) aVar.l().f28426b).g();
            this.f24946s = iVarG;
            iVarG.a(this);
            aVar.e(this.f24946s);
        }
    }

    @Override // i7.a
    public final void a() {
        this.f24944q.invalidateSelf();
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            d dVar = (d) list2.get(i4);
            if (dVar instanceof n) {
                this.f24937i.add((n) dVar);
            }
        }
    }

    @Override // h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f24935f;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f24937i;
            if (i4 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i4)).b(), matrix);
                i4++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        i7.s sVar = this.f24943p;
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

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        PointF pointF = b0.f23692a;
        if (obj == 4) {
            this.f24939l.j(oVar);
            return;
        }
        ColorFilter colorFilter = b0.I;
        n7.a aVar = this.f24932c;
        if (obj == colorFilter) {
            i7.s sVar = this.f24942o;
            if (sVar != null) {
                aVar.o(sVar);
            }
            i7.s sVar2 = new i7.s(null, oVar);
            this.f24942o = sVar2;
            sVar2.a(this);
            aVar.e(this.f24942o);
            return;
        }
        if (obj == b0.J) {
            i7.s sVar3 = this.f24943p;
            if (sVar3 != null) {
                aVar.o(sVar3);
            }
            this.f24933d.b();
            this.f24934e.b();
            i7.s sVar4 = new i7.s(null, oVar);
            this.f24943p = sVar4;
            sVar4.a(this);
            aVar.e(this.f24943p);
            return;
        }
        if (obj == b0.f23696e) {
            i7.e eVar = this.f24946s;
            if (eVar != null) {
                eVar.j(oVar);
                return;
            }
            i7.s sVar5 = new i7.s(null, oVar);
            this.f24946s = sVar5;
            sVar5.a(this);
            aVar.e(this.f24946s);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f24930a;
    }

    @Override // h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f24931b) {
            return;
        }
        Path path = this.f24935f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24937i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i10)).b(), matrix);
            i10++;
        }
        path.computeBounds(this.f24936h, false);
        int i11 = this.j;
        i7.j jVar = this.f24938k;
        i7.j jVar2 = this.f24941n;
        i7.j jVar3 = this.f24940m;
        if (i11 == 1) {
            long jI = i();
            x.o oVar = this.f24933d;
            linearGradient = (LinearGradient) oVar.e(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                m7.c cVar = (m7.c) jVar.e();
                int[] iArrE = e(cVar.f28883b);
                float[] fArr2 = cVar.f28882a;
                if (iArrE.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrE[0], iArrE[0]};
                } else {
                    iArr2 = iArrE;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                oVar.i(linearGradient, jI);
            }
        } else {
            long jI2 = i();
            x.o oVar2 = this.f24934e;
            RadialGradient radialGradient = (RadialGradient) oVar2.e(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                m7.c cVar2 = (m7.c) jVar.e();
                int[] iArrE2 = e(cVar2.f28883b);
                float[] fArr3 = cVar2.f28882a;
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
                oVar2.i(radialGradient2, jI2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        g7.a aVar = this.g;
        aVar.setShader(linearGradient);
        i7.s sVar = this.f24942o;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        i7.e eVar = this.f24946s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f24947t) {
                aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f24947t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f24939l.e()).intValue() / 100.0f;
        aVar.setAlpha(r7.h.c((int) (i4 * fIntValue)));
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), aVar);
        }
        canvas.drawPath(path, aVar);
    }

    public final int i() {
        float f10 = this.f24940m.f25875d;
        float f11 = this.f24945r;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f24941n.f25875d * f11);
        int iRound3 = Math.round(this.f24938k.f25875d * f11);
        int i4 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i4 = i4 * 31 * iRound2;
        }
        return iRound3 != 0 ? i4 * 31 * iRound3 : i4;
    }
}
