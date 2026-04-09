package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ty0 extends la {
    public final da q;
    public final String r;
    public final boolean s;
    public final fg t;
    public m41 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public ty0(i90 i90Var, da daVar, nv0 nv0Var) {
        int iS = ex0.s(nv0Var.g);
        Paint.Cap cap = iS != 0 ? iS != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iS2 = ex0.s(nv0Var.h);
        super(i90Var, daVar, cap, iS2 != 0 ? iS2 != 1 ? iS2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, nv0Var.i, nv0Var.e, nv0Var.f, nv0Var.c, nv0Var.b);
        this.q = daVar;
        this.r = nv0Var.a;
        this.s = nv0Var.j;
        ba baVarQ0 = nv0Var.d.Q0();
        this.t = (fg) baVarQ0;
        baVarQ0.a(this);
        daVar.e(baVarQ0);
    }

    @Override // defpackage.la, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        PointF pointF = n90.a;
        fg fgVar = this.t;
        if (obj == 2) {
            fgVar.j(vq2Var);
            return;
        }
        if (obj == n90.F) {
            m41 m41Var = this.u;
            da daVar = this.q;
            if (m41Var != null) {
                daVar.o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.u = m41Var2;
            m41Var2.a(this);
            daVar.e(fgVar);
        }
    }

    @Override // defpackage.la, defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        if (this.s) {
            return;
        }
        fg fgVar = this.t;
        int iL = fgVar.l(fgVar.c.e(), fgVar.c());
        d50 d50Var = this.i;
        d50Var.setColor(iL);
        m41 m41Var = this.u;
        if (m41Var != null) {
            d50Var.setColorFilter((ColorFilter) m41Var.e());
        }
        super.g(canvas, matrix, i, mqVar);
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.r;
    }
}
