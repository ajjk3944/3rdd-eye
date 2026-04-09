package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ky2 implements ly2 {
    public final Map a;
    public final pq3 b;
    public final io2 c;

    public ky2(Map map, pq3 pq3Var, io2 io2Var) {
        this.a = map;
        this.b = pq3Var;
        this.c = io2Var;
    }

    @Override // defpackage.ly2
    public final n70 e(fa2 fa2Var) {
        this.c.G0(fa2Var);
        op3 op3VarB = pu1.B(new hx2(3));
        for (String str : ((String) tw1.e.c.a(mz1.R8)).split(",")) {
            ga4 ga4Var = (ga4) this.a.get(str.trim());
            if (ga4Var != null) {
                op3VarB = pu1.L(op3VarB, hx2.class, new z02(ga4Var, fa2Var, 8), this.b);
            }
        }
        op3VarB.c(new jq3(op3VarB, new of3(21, this), 0), md2.g);
        return op3VarB;
    }
}
