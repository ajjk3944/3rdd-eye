package h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements f, n, k, i7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f24988a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24989b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final x f24990c;

    /* renamed from: d, reason: collision with root package name */
    public final n7.a f24991d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24992e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24993f;
    public final i7.i g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.i f24994h;

    /* renamed from: i, reason: collision with root package name */
    public final i7.r f24995i;
    public e j;

    public q(x xVar, n7.a aVar, m7.i iVar) {
        this.f24990c = xVar;
        this.f24991d = aVar;
        this.f24992e = iVar.f28918b;
        this.f24993f = iVar.f28920d;
        i7.i iVarG = iVar.f28919c.g();
        this.g = iVarG;
        aVar.e(iVarG);
        iVarG.a(this);
        i7.i iVarG2 = ((l7.b) iVar.f28921e).g();
        this.f24994h = iVarG2;
        aVar.e(iVarG2);
        iVarG2.a(this);
        l7.e eVar = (l7.e) iVar.f28922f;
        eVar.getClass();
        i7.r rVar = new i7.r(eVar);
        this.f24995i = rVar;
        rVar.a(aVar);
        rVar.b(this);
    }

    @Override // i7.a
    public final void a() {
        this.f24990c.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        Path pathB = this.j.b();
        Path path = this.f24989b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f24994h.e()).floatValue();
        for (int i4 = ((int) fFloatValue) - 1; i4 >= 0; i4--) {
            Matrix matrixF = this.f24995i.f(i4 + fFloatValue2);
            Matrix matrix = this.f24988a;
            matrix.set(matrixF);
            path.addPath(pathB, matrix);
        }
        return path;
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        this.j.c(list, list2);
    }

    @Override // h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        this.j.d(rectF, matrix, z3);
    }

    @Override // h7.k
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new e(this.f24990c, this.f24991d, "Repeater", this.f24993f, arrayList, null);
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        if (this.f24995i.c(obj, oVar)) {
            return;
        }
        if (obj == b0.f23708s) {
            this.g.j(oVar);
        } else if (obj == b0.f23709t) {
            this.f24994h.j(oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
        for (int i10 = 0; i10 < this.j.f24910i.size(); i10++) {
            d dVar = (d) this.j.f24910i.get(i10);
            if (dVar instanceof l) {
                r7.h.g(eVar, i4, arrayList, eVar2, (l) dVar);
            }
        }
    }

    @Override // h7.d
    public final String getName() {
        return this.f24992e;
    }

    @Override // h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f24994h.e()).floatValue();
        i7.r rVar = this.f24995i;
        float fFloatValue3 = ((Float) rVar.f25928v.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) rVar.f25929w.e()).floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f24988a;
            matrix2.set(matrix);
            float f10 = i10;
            matrix2.preConcat(rVar.f(f10 + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (r7.h.f(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i4), bVar);
        }
    }
}
