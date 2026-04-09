package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nt2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ba4 c;
    public final ba4 d;
    public final ba4 e;

    public nt2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4) {
        this.a = 5;
        this.c = ba4Var;
        this.b = ba4Var2;
        this.d = ba4Var3;
        this.e = ba4Var4;
    }

    public h2 a() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.d();
        gl2 gl2Var = (gl2) this.c.d();
        o13 o13Var = (o13) this.d.d();
        db3 db3Var = (db3) this.e.d();
        h2 h2Var = new h2();
        h2Var.f = new wq3();
        h2Var.g = new AtomicBoolean();
        h2Var.a = ld2Var;
        h2Var.b = scheduledExecutorService;
        h2Var.c = gl2Var;
        h2Var.d = o13Var;
        h2Var.e = db3Var;
        return h2Var;
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new lt2((Executor) this.b.d(), (zj2) this.c.d(), (vp2) this.d.d(), (gj2) this.e.d());
            case 1:
                return a();
            case 2:
                return new fj3((uj3) this.c.d(), (pj3) this.d.d(), (rj3) this.e.d(), (gk3) this.b.d());
            case 3:
                return new rj3((lg3) this.c.d(), (lg3) this.d.d(), ba4.b(this.e), (gk3) this.b.d(), 0);
            case 4:
                return new rj3((lg3) this.c.d(), (lg3) this.d.d(), ba4.b(this.e), (gk3) this.b.d(), 1);
            default:
                return new ei4((jv2) this.c.d(), (oh4) this.b.d(), (String) this.d.d(), ((Integer) this.e.d()).intValue());
        }
    }

    public /* synthetic */ nt2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, int i) {
        this.a = i;
        this.c = ba4Var;
        this.d = ba4Var2;
        this.e = ba4Var3;
        this.b = ba4Var4;
    }

    public /* synthetic */ nt2(ga4 ga4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ba4Var;
        this.d = ba4Var2;
        this.e = ba4Var3;
    }
}
