package i2;

import android.graphics.Paint;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends d1 {
    public static final l7.d T;
    public final w1 R;
    public p S;

    static {
        l7.d dVarF = p1.z.f();
        dVarF.c(p1.s.f31016e);
        ((Paint) dVarF.f28604b).setStrokeWidth(1.0f);
        dVarF.e(1);
        T = dVarF;
    }

    public q(e0 e0Var) {
        super(e0Var);
        w1 w1Var = new w1();
        w1Var.f25557d = 0;
        this.R = w1Var;
        w1Var.f25560h = this;
        this.S = e0Var.f25634i != null ? new p(this) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // i2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F0(i2.z0 r19, long r20, i2.o r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q.F0(i2.z0, long, i2.o, int, boolean):void");
    }

    @Override // g2.i0
    public final int J(int i4) {
        y4.a aVarU = this.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.e((d1) e0Var.G.f19258e, e0Var.n(), i4);
    }

    @Override // i2.d1
    public final void O0(p1.q qVar, s1.b bVar) {
        e0 e0Var = this.f25610o;
        m1 m1VarA = h0.a(e0Var);
        w0.e eVarY = e0Var.y();
        Object[] objArr = eVarY.f36397a;
        int i4 = eVarY.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (e0Var2.I()) {
                e0Var2.j(qVar, bVar);
            }
        }
        if (((j2.r) m1VarA).getShowLayoutBounds()) {
            long j = this.f24410c;
            qVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, T);
        }
    }

    @Override // g2.s0
    public final void R(long j, float f10, mk.c cVar) {
        P0(j, f10, cVar, null);
        if (this.j) {
            return;
        }
        this.f25610o.H.f25687p.d0();
    }

    @Override // i2.d1, g2.s0
    public final void S(long j, float f10, s1.b bVar) {
        P0(j, f10, null, bVar);
        if (this.j) {
            return;
        }
        this.f25610o.H.f25687p.d0();
    }

    @Override // i2.m0
    public final int Z(g2.a aVar) {
        p pVar = this.S;
        if (pVar != null) {
            return pVar.Z(aVar);
        }
        u0 u0Var = this.f25610o.H.f25687p;
        f0 f0Var = u0Var.f25802x;
        if (u0Var.f25786f.f25677d == a0.f25567a) {
            f0Var.f25661d = true;
            if (f0Var.f25659b) {
                u0Var.f25800v = true;
                u0Var.f25801w = true;
            }
        } else {
            f0Var.f25662e = true;
        }
        q qVarH = u0Var.h();
        boolean z3 = qVarH.f25712k;
        qVarH.f25712k = true;
        u0Var.B();
        qVarH.f25712k = z3;
        Integer num = (Integer) f0Var.g.get(aVar);
        return num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // g2.i0
    public final int d(int i4) {
        y4.a aVarU = this.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.h((d1) e0Var.G.f19258e, e0Var.n(), i4);
    }

    @Override // g2.i0
    public final int n(int i4) {
        y4.a aVarU = this.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.d((d1) e0Var.G.f19258e, e0Var.n(), i4);
    }

    @Override // g2.i0
    public final int t(int i4) {
        y4.a aVarU = this.f25610o.u();
        g2.j0 j0VarK = aVarU.k();
        e0 e0Var = (e0) aVarU.f37323a;
        return j0VarK.b((d1) e0Var.G.f19258e, e0Var.n(), i4);
    }

    @Override // i2.d1
    public final void u0() {
        if (this.S == null) {
            this.S = new p(this);
        }
    }

    @Override // g2.i0
    public final g2.s0 v(long j) {
        V(j);
        e0 e0Var = this.f25610o;
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((e0) objArr[i10]).H.f25687p.f25790l = c0.f25589c;
        }
        S0(e0Var.f25648x.f(this, e0Var.n(), j));
        J0();
        return this;
    }

    @Override // i2.d1
    public final n0 x0() {
        return this.S;
    }

    @Override // i2.d1
    public final i1.m z0() {
        return this.R;
    }
}
