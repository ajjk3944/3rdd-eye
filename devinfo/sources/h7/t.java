package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import f7.b0;
import f7.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: q, reason: collision with root package name */
    public final n7.a f25005q;

    /* renamed from: r, reason: collision with root package name */
    public final String f25006r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f25007s;

    /* renamed from: t, reason: collision with root package name */
    public final i7.f f25008t;

    /* renamed from: u, reason: collision with root package name */
    public i7.s f25009u;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(x xVar, n7.a aVar, m7.o oVar) {
        int iC = i3.e.c(oVar.g);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = i3.e.c(oVar.f28946h);
        super(xVar, aVar, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.f28947i, oVar.f28944e, oVar.f28945f, oVar.f28942c, oVar.f28941b);
        this.f25005q = aVar;
        this.f25006r = oVar.f28940a;
        this.f25007s = oVar.j;
        i7.e eVarG = oVar.f28943d.g();
        this.f25008t = (i7.f) eVarG;
        eVarG.a(this);
        aVar.e(eVarG);
    }

    @Override // h7.b, k7.f
    public final void f(Object obj, km.o oVar) {
        super.f(obj, oVar);
        PointF pointF = b0.f23692a;
        i7.f fVar = this.f25008t;
        if (obj == 2) {
            fVar.j(oVar);
            return;
        }
        if (obj == b0.I) {
            i7.s sVar = this.f25009u;
            n7.a aVar = this.f25005q;
            if (sVar != null) {
                aVar.o(sVar);
            }
            i7.s sVar2 = new i7.s(null, oVar);
            this.f25009u = sVar2;
            sVar2.a(this);
            aVar.e(fVar);
        }
    }

    @Override // h7.d
    public final String getName() {
        return this.f25006r;
    }

    @Override // h7.b, h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        if (this.f25007s) {
            return;
        }
        i7.f fVar = this.f25008t;
        int iL = fVar.l(fVar.f25874c.k(), fVar.c());
        g7.a aVar = this.f24895i;
        aVar.setColor(iL);
        i7.s sVar = this.f25009u;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        super.h(canvas, matrix, i4, bVar);
    }
}
