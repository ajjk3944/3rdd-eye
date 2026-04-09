package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dv0 extends da {
    public final zi D;
    public final fh E;
    public final pq F;

    public dv0(i90 i90Var, f50 f50Var, fh fhVar, u80 u80Var) {
        super(i90Var, f50Var);
        this.E = fhVar;
        zi ziVar = new zi(i90Var, this, new av0("__container", f50Var.a, false), u80Var);
        this.D = ziVar;
        List list = Collections.EMPTY_LIST;
        ziVar.d(list, list);
        g4 g4Var = this.p.x;
        if (g4Var != null) {
            this.F = new pq(this, this, g4Var);
        }
    }

    @Override // defpackage.da, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        PointF pointF = n90.a;
        pq pqVar = this.F;
        if (obj == 5 && pqVar != null) {
            pqVar.c.j(vq2Var);
            return;
        }
        if (obj == n90.B && pqVar != null) {
            pqVar.b(vq2Var);
            return;
        }
        if (obj == n90.C && pqVar != null) {
            pqVar.e.j(vq2Var);
            return;
        }
        if (obj == n90.D && pqVar != null) {
            pqVar.f.j(vq2Var);
        } else {
            if (obj != n90.E || pqVar == null) {
                return;
            }
            pqVar.g.j(vq2Var);
        }
    }

    @Override // defpackage.da, defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        this.D.b(rectF, this.n, z);
    }

    @Override // defpackage.da
    public final void k(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        pq pqVar = this.F;
        if (pqVar != null) {
            mqVar = pqVar.a(matrix, i);
        }
        this.D.g(canvas, matrix, i, mqVar);
    }

    @Override // defpackage.da
    public final kf3 l() {
        kf3 kf3Var = this.p.w;
        return kf3Var != null ? kf3Var : this.E.p.w;
    }

    @Override // defpackage.da
    public final void p(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        this.D.h(t40Var, i, arrayList, t40Var2);
    }
}
