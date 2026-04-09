package t8;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import r8.z;

/* loaded from: classes.dex */
public final class g implements e, u8.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f22565a;

    /* renamed from: b, reason: collision with root package name */
    public final a9.l f22566b;

    /* renamed from: c, reason: collision with root package name */
    public final a9.b f22567c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22568d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22569e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22570f;

    /* renamed from: g, reason: collision with root package name */
    public final u8.e f22571g;

    /* renamed from: h, reason: collision with root package name */
    public final u8.e f22572h;

    /* renamed from: i, reason: collision with root package name */
    public u8.r f22573i;
    public final r8.v j;
    public u8.d k;

    /* renamed from: l, reason: collision with root package name */
    public float f22574l;

    public g(r8.v vVar, a9.b bVar, z8.q qVar) {
        Path path = new Path();
        this.f22565a = path;
        this.f22566b = new a9.l(1, 2);
        this.f22570f = new ArrayList();
        this.f22567c = bVar;
        String str = qVar.f26762c;
        y8.a aVar = qVar.f26764e;
        y8.a aVar2 = qVar.f26763d;
        this.f22568d = str;
        this.f22569e = qVar.f26765f;
        this.j = vVar;
        if (bVar.l() != null) {
            u8.h hVarE0 = ((y8.b) bVar.l().f26690a).E0();
            this.k = hVarE0;
            hVarE0.a(this);
            bVar.e(this.k);
        }
        if (aVar2 == null) {
            this.f22571g = null;
            this.f22572h = null;
            return;
        }
        path.setFillType(qVar.f26761b);
        u8.d dVarE0 = aVar2.E0();
        this.f22571g = (u8.e) dVarE0;
        dVarE0.a(this);
        bVar.e(dVarE0);
        u8.d dVarE02 = aVar.E0();
        this.f22572h = (u8.e) dVarE02;
        dVarE02.a(this);
        bVar.e(dVarE02);
    }

    @Override // u8.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof n) {
                this.f22570f.add((n) cVar);
            }
        }
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f22565a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22570f;
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

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        PointF pointF = z.f21401a;
        if (obj == 1) {
            this.f22571g.k(eVar);
            return;
        }
        if (obj == 4) {
            this.f22572h.k(eVar);
            return;
        }
        ColorFilter colorFilter = z.I;
        a9.b bVar = this.f22567c;
        if (obj == colorFilter) {
            u8.r rVar = this.f22573i;
            if (rVar != null) {
                bVar.o(rVar);
            }
            u8.r rVar2 = new u8.r(eVar, null);
            this.f22573i = rVar2;
            rVar2.a(this);
            bVar.e(this.f22573i);
            return;
        }
        if (obj == z.f21405e) {
            u8.d dVar = this.k;
            if (dVar != null) {
                dVar.k(eVar);
                return;
            }
            u8.r rVar3 = new u8.r(eVar, null);
            this.k = rVar3;
            rVar3.a(this);
            bVar.e(this.k);
        }
    }

    @Override // t8.c
    public final String getName() {
        return this.f22568d;
    }

    @Override // t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f22569e) {
            return;
        }
        r8.a aVar2 = r8.d.f21312a;
        u8.e eVar = this.f22571g;
        float fIntValue = ((Integer) this.f22572h.f()).intValue() / 100.0f;
        int iC = (e9.g.c((int) (i10 * fIntValue)) << 24) | (eVar.m(eVar.b(), eVar.d()) & 16777215);
        a9.l lVar = this.f22566b;
        lVar.setColor(iC);
        u8.r rVar = this.f22573i;
        if (rVar != null) {
            lVar.setColorFilter((ColorFilter) rVar.f());
        }
        u8.d dVar = this.k;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                lVar.setMaskFilter(null);
            } else if (fFloatValue != this.f22574l) {
                a9.b bVar = this.f22567c;
                if (bVar.A == fFloatValue) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                lVar.setMaskFilter(blurMaskFilter);
            }
            this.f22574l = fFloatValue;
        }
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), lVar);
        } else {
            lVar.clearShadowLayer();
        }
        Path path = this.f22565a;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22570f;
            if (i11 >= arrayList.size()) {
                canvas.drawPath(path, lVar);
                r8.a aVar3 = r8.d.f21312a;
                return;
            } else {
                path.addPath(((n) arrayList.get(i11)).g(), matrix);
                i11++;
            }
        }
    }
}
