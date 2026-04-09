package i2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends n0 {
    @Override // g2.i0
    public final int J(int i4) {
        y4.a aVarU = this.f25719o.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.e((d1) e0Var.G.f19258e, e0Var.m(), i4);
    }

    @Override // i2.m0
    public final int Z(g2.a aVar) {
        q0 q0Var = this.f25719o.f25610o.H.f25688q;
        nk.k.b(q0Var);
        f0 f0Var = q0Var.f25751r;
        i0 i0Var = q0Var.f25741f;
        if (i0Var.f25677d == a0.f25568b) {
            f0Var.f25661d = true;
            if (f0Var.f25659b) {
                i0Var.f25679f = true;
                i0Var.g = true;
            }
        } else {
            f0Var.f25662e = true;
        }
        p pVar = q0Var.h().S;
        if (pVar != null) {
            pVar.f25712k = true;
        }
        q0Var.B();
        p pVar2 = q0Var.h().S;
        if (pVar2 != null) {
            pVar2.f25712k = false;
        }
        Integer num = (Integer) f0Var.g.get(aVar);
        int iIntValue = num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
        this.f25724t.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override // g2.i0
    public final int d(int i4) {
        y4.a aVarU = this.f25719o.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.h((d1) e0Var.G.f19258e, e0Var.m(), i4);
    }

    @Override // g2.i0
    public final int n(int i4) {
        y4.a aVarU = this.f25719o.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.d((d1) e0Var.G.f19258e, e0Var.m(), i4);
    }

    @Override // i2.n0
    public final void p0() {
        q0 q0Var = this.f25719o.f25610o.H.f25688q;
        nk.k.b(q0Var);
        q0Var.d0();
    }

    @Override // g2.i0
    public final int t(int i4) {
        y4.a aVarU = this.f25719o.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.b((d1) e0Var.G.f19258e, e0Var.m(), i4);
    }

    @Override // g2.i0
    public final g2.s0 v(long j) {
        V(j);
        d1 d1Var = this.f25719o;
        w0.e eVarZ = d1Var.f25610o.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            q0 q0Var = ((e0) objArr[i10]).H.f25688q;
            nk.k.b(q0Var);
            q0Var.j = c0.f25589c;
        }
        e0 e0Var = d1Var.f25610o;
        n0.o0(this, e0Var.f25648x.f(this, e0Var.m(), j));
        return this;
    }
}
