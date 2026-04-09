package t8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import r8.z;

/* loaded from: classes.dex */
public final class r implements e, n, j, u8.a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f22635a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f22636b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final r8.v f22637c;

    /* renamed from: d, reason: collision with root package name */
    public final a9.b f22638d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22639e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22640f;

    /* renamed from: g, reason: collision with root package name */
    public final u8.h f22641g;

    /* renamed from: h, reason: collision with root package name */
    public final u8.h f22642h;

    /* renamed from: i, reason: collision with root package name */
    public final u8.q f22643i;
    public d j;

    public r(r8.v vVar, a9.b bVar, z8.n nVar) {
        this.f22637c = vVar;
        this.f22638d = bVar;
        this.f22639e = (String) nVar.f26751b;
        this.f22640f = nVar.f26753d;
        u8.h hVarE0 = nVar.f26752c.E0();
        this.f22641g = hVarE0;
        bVar.e(hVarE0);
        hVarE0.a(this);
        u8.h hVarE02 = ((y8.b) nVar.f26754e).E0();
        this.f22642h = hVarE02;
        bVar.e(hVarE02);
        hVarE02.a(this);
        y8.d dVar = (y8.d) nVar.f26755f;
        dVar.getClass();
        u8.q qVar = new u8.q(dVar);
        this.f22643i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // u8.a
    public final void a() {
        this.f22637c.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
        for (int i11 = 0; i11 < this.j.f22555i.size(); i11++) {
            c cVar = (c) this.j.f22555i.get(i11);
            if (cVar instanceof k) {
                e9.g.g(fVar, i10, arrayList, fVar2, (k) cVar);
            }
        }
    }

    @Override // t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.j.d(rectF, matrix, z10);
    }

    @Override // t8.j
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.f22637c, this.f22638d, "Repeater", this.f22640f, arrayList, null);
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        if (this.f22643i.c(eVar, obj)) {
            return;
        }
        if (obj == z.f21417s) {
            this.f22641g.k(eVar);
        } else if (obj == z.f21418t) {
            this.f22642h.k(eVar);
        }
    }

    @Override // t8.n
    public final Path g() {
        Path pathG = this.j.g();
        Path path = this.f22636b;
        path.reset();
        float fFloatValue = ((Float) this.f22641g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f22642h.f()).floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrixF = this.f22643i.f(i10 + fFloatValue2);
            Matrix matrix = this.f22635a;
            matrix.set(matrixF);
            path.addPath(pathG, matrix);
        }
        return path;
    }

    @Override // t8.c
    public final String getName() {
        return this.f22639e;
    }

    @Override // t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        float fFloatValue = ((Float) this.f22641g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f22642h.f()).floatValue();
        u8.q qVar = this.f22643i;
        float fFloatValue3 = ((Float) qVar.f23502v.f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) qVar.f23503w.f()).floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f22635a;
            matrix2.set(matrix);
            float f10 = i11;
            matrix2.preConcat(qVar.f(f10 + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (e9.g.f(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i10), aVar);
        }
    }
}
