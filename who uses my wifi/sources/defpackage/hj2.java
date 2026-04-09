package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hj2 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final ba4 b;
    public final ba4 c;
    public final ga4 d;
    public final ga4 e;
    public final ga4 f;
    public final ga4 g;

    public hj2(hh2 hh2Var, fh2 fh2Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4) {
        this.d = hh2Var;
        this.e = fh2Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.f = ba4Var3;
        this.g = ba4Var4;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                Context contextA = ((hh2) this.d).a();
                ra4 ra4VarD = ((fh2) this.e).d();
                yz2 yz2Var = (yz2) this.b.d();
                tu2 tu2Var = (tu2) this.c.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new gj2(contextA, ra4VarD, yz2Var, tu2Var, ld2Var, (pq3) this.f.d(), (ScheduledExecutorService) this.g.d());
            default:
                return new mj3((uj3) this.b.d(), (rj3) this.c.d(), (xj3) this.d.d(), (gk3) this.e.d(), (vf3) this.f.d(), (ExecutorService) this.g.d());
        }
    }

    public hj2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, da4 da4Var, da4 da4Var2) {
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.e = ba4Var4;
        this.f = da4Var;
        this.g = da4Var2;
    }
}
