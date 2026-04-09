package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y03 implements zz2 {
    public final Context b;
    public final pu2 c;
    public final l83 d;
    public final Executor e;
    public final e51 f;
    public final e42 g;
    public final pz2 i;
    public final jv2 j;
    public final mv2 k;
    public final Object l;
    public final /* synthetic */ int a = 0;
    public final boolean h = ((Boolean) tw1.e.c.a(mz1.H9)).booleanValue();

    public y03(Context context, e51 e51Var, l83 l83Var, Executor executor, ei2 ei2Var, pu2 pu2Var, e42 e42Var, pz2 pz2Var, jv2 jv2Var, mv2 mv2Var) {
        this.b = context;
        this.d = l83Var;
        this.l = ei2Var;
        this.e = executor;
        this.f = e51Var;
        this.c = pu2Var;
        this.g = e42Var;
        this.i = pz2Var;
        this.j = jv2Var;
        this.k = mv2Var;
    }

    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) {
        switch (this.a) {
            case 0:
                e83 e83Var = a83Var.s;
                if (e83Var == null || e83Var.a == null) {
                }
                break;
            default:
                e83 e83Var2 = a83Var.s;
                if (e83Var2 == null || e83Var2.a == null) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) {
        switch (this.a) {
            case 0:
                su2 su2Var = new su2(0);
                lq3 lq3Var = lq3.g;
                op1 op1Var = new op1(this, a83Var, h83Var, su2Var, 8);
                Executor executor = this.e;
                qp3 qp3VarO = pu1.O(lq3Var, op1Var, executor);
                qp3VarO.c(new vr(5), executor);
                return qp3VarO;
            default:
                su2 su2Var2 = new su2(0);
                lq3 lq3Var2 = lq3.g;
                op1 op1Var2 = new op1(this, a83Var, h83Var, su2Var2, 10);
                Executor executor2 = this.e;
                qp3 qp3VarO2 = pu1.O(lq3Var2, op1Var2, executor2);
                qp3VarO2.c(new vr(6), executor2);
                return qp3VarO2;
        }
    }

    public y03(Context context, e51 e51Var, l83 l83Var, Executor executor, ji2 ji2Var, pu2 pu2Var, e42 e42Var, pz2 pz2Var, jv2 jv2Var, mv2 mv2Var) {
        this.b = context;
        this.d = l83Var;
        this.l = ji2Var;
        this.e = executor;
        this.f = e51Var;
        this.c = pu2Var;
        this.g = e42Var;
        this.i = pz2Var;
        this.j = jv2Var;
        this.k = mv2Var;
    }
}
