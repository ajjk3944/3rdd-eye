package x1;

import android.graphics.Paint;
import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public final class r extends f1 {
    public static final yb.k P;
    public final v1 N;
    public q O;

    static {
        yb.k kVarE = g1.f0.e();
        kVarE.d(g1.r.f9266d);
        ((Paint) kVarE.f26241b).setStrokeWidth(1.0f);
        kVarE.f(1);
        P = kVarE;
    }

    public r(f0 f0Var) {
        super(f0Var);
        v1 v1Var = new v1();
        v1Var.f26498e = 0;
        this.N = v1Var;
        v1Var.f26502i = this;
        this.O = f0Var.f24804h != null ? new q(this) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // x1.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(x1.d1 r19, long r20, x1.p r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r.B0(x1.d1, long, x1.p, int, boolean):void");
    }

    @Override // x1.f1
    public final void L0(g1.p pVar, j1.c cVar) throws Throwable {
        f0 f0Var = this.f24821o;
        Owner ownerT = k.t(f0Var);
        p0.e eVarH = f0Var.H();
        Object[] objArr = eVarH.f20230a;
        int i10 = eVarH.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.T()) {
                f0Var2.k(pVar, cVar);
            }
        }
        if (ownerT.getShowLayoutBounds()) {
            long j = this.f23811d;
            pVar.f(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, P);
        }
    }

    @Override // v1.v
    public final void N(long j, float f10, ar.k kVar) {
        M0(j, f10, kVar);
        if (this.j) {
            return;
        }
        this.f24821o.x().U();
    }

    @Override // x1.m0
    public final int S(v1.h hVar) {
        q qVar = this.O;
        if (qVar != null) {
            return qVar.S(hVar);
        }
        y0 y0Var = this.f24821o.r().f24859p;
        g0 g0Var = y0Var.f24974w;
        if (y0Var.f24960g.f24849d == b0.Measuring) {
            g0Var.f24839f = true;
            if (g0Var.f24835b) {
                y0Var.f24972u = true;
                y0Var.f24973v = true;
            }
        } else {
            g0Var.f24840g = true;
        }
        y0Var.d().k = true;
        y0Var.w();
        y0Var.d().k = false;
        Integer num = (Integer) g0Var.f24842i.get(hVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // x1.f1
    public final void q0() {
        if (this.O == null) {
            this.O = new q(this);
        }
    }

    @Override // v1.q
    public final v1.v s(long j) {
        Q(j);
        f0 f0Var = this.f24821o;
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).x().f24964m = d0.NotUsed;
        }
        P0(f0Var.f24816v.a(this, f0Var.o(), j));
        H0();
        return this;
    }

    @Override // x1.f1
    public final n0 t0() {
        return this.O;
    }

    @Override // x1.f1
    public final z0.l v0() {
        return this.N;
    }
}
