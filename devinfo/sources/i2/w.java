package i2;

import android.graphics.Paint;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends d1 {
    public static final l7.d T;
    public u R;
    public v S;

    static {
        l7.d dVarF = p1.z.f();
        dVarF.c(p1.s.f31017f);
        ((Paint) dVarF.f28604b).setStrokeWidth(1.0f);
        dVarF.e(1);
        T = dVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(e0 e0Var, u uVar) {
        super(e0Var);
        this.R = uVar;
        this.S = e0Var.f25634i != null ? new v(this) : null;
        if ((((i1.m) uVar).f25554a.f25556c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // g2.i0
    public final int J(int i4) {
        u uVar = this.R;
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        return uVar.h(this, d1Var, i4);
    }

    @Override // i2.d1
    public final void O0(p1.q qVar, s1.b bVar) {
        d1 d1Var;
        d1 d1Var2 = this.f25611p;
        nk.k.b(d1Var2);
        d1Var2.s0(qVar, bVar);
        if (!((j2.r) h0.a(this.f25610o)).getShowLayoutBounds() || (d1Var = this.f25611p) == null) {
            return;
        }
        if (d3.k.a(this.f24410c, d1Var.f24410c) && d3.i.a(d1Var.f25621z, 0L)) {
            return;
        }
        long j = this.f24410c;
        qVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, T);
    }

    @Override // g2.s0
    public final void R(long j, float f10, mk.c cVar) {
        P0(j, f10, cVar, null);
        X0();
    }

    @Override // i2.d1, g2.s0
    public final void S(long j, float f10, s1.b bVar) {
        P0(j, f10, null, bVar);
        X0();
    }

    public final void X0() {
        if (this.j) {
            return;
        }
        K0();
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        d1Var.f25712k = this.f25712k;
        h0().c();
        d1Var.f25712k = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(u uVar) {
        if (!uVar.equals(this.R) && (((i1.m) uVar).f25554a.f25556c & 512) != 0) {
            throw new ClassCastException();
        }
        this.R = uVar;
    }

    @Override // i2.m0
    public final int Z(g2.a aVar) {
        v vVar = this.S;
        if (vVar == null) {
            return k.c(this, aVar);
        }
        x.z zVar = vVar.f25724t;
        int iD = zVar.d(aVar);
        return iD >= 0 ? zVar.f36967c[iD] : LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // g2.i0
    public final int d(int i4) {
        u uVar = this.R;
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        return uVar.t(this, d1Var, i4);
    }

    @Override // g2.i0
    public final int n(int i4) {
        u uVar = this.R;
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        return uVar.S(this, d1Var, i4);
    }

    @Override // g2.i0
    public final int t(int i4) {
        u uVar = this.R;
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        return uVar.L(this, d1Var, i4);
    }

    @Override // i2.d1
    public final void u0() {
        if (this.S == null) {
            this.S = new v(this);
        }
    }

    @Override // g2.i0
    public final g2.s0 v(long j) {
        V(j);
        u uVar = this.R;
        d1 d1Var = this.f25611p;
        nk.k.b(d1Var);
        S0(uVar.a0(this, d1Var, j));
        J0();
        return this;
    }

    @Override // i2.d1
    public final n0 x0() {
        return this.S;
    }

    @Override // i2.d1
    public final i1.m z0() {
        return ((i1.m) this.R).f25554a;
    }
}
