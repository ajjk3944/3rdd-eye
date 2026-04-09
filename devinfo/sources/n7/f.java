package n7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.f1;
import f7.b0;
import f7.j;
import f7.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import km.o;
import m7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends a {
    public final h7.e D;
    public final b E;
    public final i7.h F;

    public f(x xVar, d dVar, b bVar, j jVar) {
        super(xVar, dVar);
        this.E = bVar;
        h7.e eVar = new h7.e(xVar, this, new m("__container", dVar.f29803a, false), jVar);
        this.D = eVar;
        List list = Collections.EMPTY_LIST;
        eVar.c(list, list);
        f1 f1Var = this.f29792p.f29824x;
        if (f1Var != null) {
            this.F = new i7.h(this, this, f1Var);
        }
    }

    @Override // n7.a, h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        this.D.d(rectF, this.f29790n, z3);
    }

    @Override // n7.a, k7.f
    public final void f(Object obj, o oVar) {
        super.f(obj, oVar);
        PointF pointF = b0.f23692a;
        i7.h hVar = this.F;
        if (obj == 5 && hVar != null) {
            hVar.f25883c.j(oVar);
            return;
        }
        if (obj == b0.E && hVar != null) {
            hVar.c(oVar);
            return;
        }
        if (obj == b0.F && hVar != null) {
            hVar.f25885e.j(oVar);
            return;
        }
        if (obj == b0.G && hVar != null) {
            hVar.f25886f.j(oVar);
        } else {
            if (obj != b0.H || hVar == null) {
                return;
            }
            hVar.g.j(oVar);
        }
    }

    @Override // n7.a
    public final void k(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        i7.h hVar = this.F;
        if (hVar != null) {
            bVar = hVar.b(matrix, i4);
        }
        this.D.h(canvas, matrix, i4, bVar);
    }

    @Override // n7.a
    public final km.i l() {
        km.i iVar = this.f29792p.f29823w;
        return iVar != null ? iVar : this.E.f29792p.f29823w;
    }

    @Override // n7.a
    public final void p(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        this.D.g(eVar, i4, arrayList, eVar2);
    }
}
