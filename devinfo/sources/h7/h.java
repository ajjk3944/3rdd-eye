package h7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements f, i7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24920a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.a f24921b;

    /* renamed from: c, reason: collision with root package name */
    public final n7.a f24922c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24923d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24924e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24925f;
    public final i7.f g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.f f24926h;

    /* renamed from: i, reason: collision with root package name */
    public i7.s f24927i;
    public final x j;

    /* renamed from: k, reason: collision with root package name */
    public i7.e f24928k;

    /* renamed from: l, reason: collision with root package name */
    public float f24929l;

    public h(x xVar, n7.a aVar, m7.l lVar) {
        Path path = new Path();
        this.f24920a = path;
        this.f24921b = new g7.a(1, 0);
        this.f24925f = new ArrayList();
        this.f24922c = aVar;
        String str = lVar.f28929c;
        l7.a aVar2 = lVar.f28931e;
        l7.a aVar3 = lVar.f28930d;
        this.f24923d = str;
        this.f24924e = lVar.f28932f;
        this.j = xVar;
        if (aVar.l() != null) {
            i7.i iVarG = ((l7.b) aVar.l().f28426b).g();
            this.f24928k = iVarG;
            iVarG.a(this);
            aVar.e(this.f24928k);
        }
        if (aVar3 == null) {
            this.g = null;
            this.f24926h = null;
            return;
        }
        path.setFillType(lVar.f28928b);
        i7.e eVarG = aVar3.g();
        this.g = (i7.f) eVarG;
        eVarG.a(this);
        aVar.e(eVarG);
        i7.e eVarG2 = aVar2.g();
        this.f24926h = (i7.f) eVarG2;
        eVarG2.a(this);
        aVar.e(eVarG2);
    }

    @Override // i7.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            d dVar = (d) list2.get(i4);
            if (dVar instanceof n) {
                this.f24925f.add((n) dVar);
            }
        }
    }

    @Override // h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f24920a;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f24925f;
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

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        PointF pointF = b0.f23692a;
        if (obj == 1) {
            this.g.j(oVar);
            return;
        }
        if (obj == 4) {
            this.f24926h.j(oVar);
            return;
        }
        ColorFilter colorFilter = b0.I;
        n7.a aVar = this.f24922c;
        if (obj == colorFilter) {
            i7.s sVar = this.f24927i;
            if (sVar != null) {
                aVar.o(sVar);
            }
            i7.s sVar2 = new i7.s(null, oVar);
            this.f24927i = sVar2;
            sVar2.a(this);
            aVar.e(this.f24927i);
            return;
        }
        if (obj == b0.f23696e) {
            i7.e eVar = this.f24928k;
            if (eVar != null) {
                eVar.j(oVar);
                return;
            }
            i7.s sVar3 = new i7.s(null, oVar);
            this.f24928k = sVar3;
            sVar3.a(this);
            aVar.e(this.f24928k);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f24923d;
    }

    @Override // h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f24924e) {
            return;
        }
        i7.f fVar = this.g;
        float fIntValue = ((Integer) this.f24926h.e()).intValue() / 100.0f;
        int iC = (r7.h.c((int) (i4 * fIntValue)) << 24) | (fVar.l(fVar.f25874c.k(), fVar.c()) & 16777215);
        g7.a aVar = this.f24921b;
        aVar.setColor(iC);
        i7.s sVar = this.f24927i;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        i7.e eVar = this.f24928k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f24929l) {
                n7.a aVar2 = this.f24922c;
                if (aVar2.A == fFloatValue) {
                    blurMaskFilter = aVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar2.B = blurMaskFilter2;
                    aVar2.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f24929l = fFloatValue;
        }
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f24920a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24925f;
            if (i10 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                return;
            } else {
                path.addPath(((n) arrayList.get(i10)).b(), matrix);
                i10++;
            }
        }
    }
}
