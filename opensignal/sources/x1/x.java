package x1;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class x extends f1 {
    public static final yb.k P;
    public v N;
    public w O;

    static {
        yb.k kVarE = g1.f0.e();
        kVarE.d(g1.r.f9267e);
        ((Paint) kVarE.f26241b).setStrokeWidth(1.0f);
        kVarE.f(1);
        P = kVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(f0 f0Var, v vVar) {
        super(f0Var);
        this.N = vVar;
        this.O = f0Var.f24804h != null ? new w(this) : null;
        if ((((z0.l) vVar).f26495b.f26497d & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // x1.f1
    public final void L0(g1.p pVar, j1.c cVar) {
        f1 f1Var;
        f1 f1Var2 = this.f24822p;
        br.l.b(f1Var2);
        f1Var2.o0(pVar, cVar);
        if (!k.t(this.f24821o).getShowLayoutBounds() || (f1Var = this.f24822p) == null) {
            return;
        }
        if (ir.f0.t(this.f23811d, f1Var.f23811d) && i3.g.l(f1Var.f24832z, 0L)) {
            return;
        }
        long j = this.f23811d;
        pVar.f(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, P);
    }

    @Override // v1.v
    public final void N(long j, float f10, ar.k kVar) {
        M0(j, f10, kVar);
        if (this.j) {
            return;
        }
        I0();
        a0().e();
        br.l.b(this.f24822p);
    }

    @Override // x1.m0
    public final int S(v1.h hVar) {
        w wVar = this.O;
        if (wVar == null) {
            return k.c(this, hVar);
        }
        u.y yVar = wVar.f24894t;
        int iD = yVar.d(hVar);
        if (iD >= 0) {
            return yVar.f23130c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(v vVar) {
        if (!vVar.equals(this.N) && (((z0.l) vVar).f26495b.f26497d & 512) != 0) {
            throw new ClassCastException();
        }
        this.N = vVar;
    }

    @Override // x1.f1
    public final void q0() {
        if (this.O == null) {
            this.O = new w(this);
        }
    }

    @Override // v1.q
    public final v1.v s(long j) {
        Q(j);
        v vVar = this.N;
        f1 f1Var = this.f24822p;
        br.l.b(f1Var);
        P0(vVar.K(this, f1Var, j));
        H0();
        return this;
    }

    @Override // x1.f1
    public final n0 t0() {
        return this.O;
    }

    @Override // x1.f1
    public final z0.l v0() {
        return ((z0.l) this.N).f26495b;
    }
}
