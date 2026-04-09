package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h03 implements zz2 {
    public final zh2 a;
    public final pu2 b;
    public final l83 c;
    public final Executor d;
    public final e51 e;
    public final e42 f;
    public final boolean g = ((Boolean) tw1.e.c.a(mz1.H9)).booleanValue();
    public final pz2 h;
    public final jv2 i;
    public final mv2 j;

    public h03(zh2 zh2Var, Executor executor, pu2 pu2Var, l83 l83Var, e51 e51Var, e42 e42Var, pz2 pz2Var, jv2 jv2Var, mv2 mv2Var) {
        this.a = zh2Var;
        this.d = executor;
        this.b = pu2Var;
        this.c = l83Var;
        this.e = e51Var;
        this.f = e42Var;
        this.h = pz2Var;
        this.i = jv2Var;
        this.j = mv2Var;
    }

    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) {
        e83 e83Var = a83Var.s;
        return (e83Var == null || e83Var.a == null) ? false : true;
    }

    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) {
        su2 su2Var = new su2(0);
        lq3 lq3Var = lq3.g;
        op1 op1Var = new op1(this, a83Var, h83Var, su2Var, 4);
        Executor executor = this.d;
        qp3 qp3VarO = pu1.O(lq3Var, op1Var, executor);
        qp3VarO.c(new vr(4), executor);
        return qp3VarO;
    }
}
