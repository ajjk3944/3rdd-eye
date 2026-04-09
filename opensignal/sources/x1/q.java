package x1;

/* loaded from: classes.dex */
public final class q extends n0 {
    @Override // x1.m0
    public final int S(v1.h hVar) {
        s0 s0Var = this.f24889o.f24821o.r().f24860q;
        br.l.b(s0Var);
        g0 g0Var = s0Var.f24927r;
        i0 i0Var = s0Var.f24918g;
        if (i0Var.f24849d == b0.LookaheadMeasuring) {
            g0Var.f24839f = true;
            if (g0Var.f24835b) {
                i0Var.f24851f = true;
                i0Var.f24852g = true;
            }
        } else {
            g0Var.f24840g = true;
        }
        q qVar = s0Var.d().O;
        if (qVar != null) {
            qVar.k = true;
        }
        s0Var.w();
        q qVar2 = s0Var.d().O;
        if (qVar2 != null) {
            qVar2.k = false;
        }
        Integer num = (Integer) g0Var.f24842i.get(hVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f24894t.h(iIntValue, hVar);
        return iIntValue;
    }

    @Override // x1.n0
    public final void l0() {
        s0 s0VarW = this.f24889o.f24821o.w();
        br.l.b(s0VarW);
        s0VarW.U();
    }

    @Override // v1.q
    public final v1.v s(long j) {
        Q(j);
        f1 f1Var = this.f24889o;
        p0.e eVarI = f1Var.f24821o.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            s0 s0VarW = ((f0) objArr[i11]).w();
            br.l.b(s0VarW);
            s0VarW.k = d0.NotUsed;
        }
        f0 f0Var = f1Var.f24821o;
        n0.k0(this, f0Var.f24816v.a(this, f0Var.n(), j));
        return this;
    }
}
