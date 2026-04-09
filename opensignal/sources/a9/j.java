package a9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r8.v;
import r8.z;
import z8.r;

/* loaded from: classes.dex */
public final class j extends b {
    public final t8.d D;
    public final d E;
    public final u8.g F;

    public j(v vVar, h hVar, d dVar, r8.h hVar2) {
        super(vVar, hVar);
        this.E = dVar;
        t8.d dVar2 = new t8.d(vVar, this, new r("__container", hVar.f248a, false), hVar2);
        this.D = dVar2;
        List list = Collections.EMPTY_LIST;
        dVar2.b(list, list);
        cj.a aVar = this.f236p.f269x;
        if (aVar != null) {
            this.F = new u8.g(this, this, aVar);
        }
    }

    @Override // a9.b, t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.D.d(rectF, this.f234n, z10);
    }

    @Override // a9.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        PointF pointF = z.f21401a;
        u8.g gVar = this.F;
        if (obj == 5 && gVar != null) {
            gVar.f23459c.k(eVar);
            return;
        }
        if (obj == z.E && gVar != null) {
            gVar.c(eVar);
            return;
        }
        if (obj == z.F && gVar != null) {
            gVar.f23461e.k(eVar);
            return;
        }
        if (obj == z.G && gVar != null) {
            gVar.f23462f.k(eVar);
        } else {
            if (obj != z.H || gVar == null) {
                return;
            }
            gVar.f23463g.k(eVar);
        }
    }

    @Override // a9.b
    public final void k(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        u8.g gVar = this.F;
        if (gVar != null) {
            aVar = gVar.b(matrix, i10);
        }
        this.D.h(canvas, matrix, i10, aVar);
    }

    @Override // a9.b
    public final z7.b l() {
        z7.b bVar = this.f236p.f268w;
        return bVar != null ? bVar : this.E.f236p.f268w;
    }

    @Override // a9.b
    public final void p(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        this.D.c(fVar, i10, arrayList, fVar2);
    }
}
