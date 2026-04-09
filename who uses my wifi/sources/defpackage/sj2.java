package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sj2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ba4 c;

    public /* synthetic */ sj2(ba4 ba4Var, ga4 ga4Var, int i) {
        this.a = i;
        this.c = ba4Var;
        this.b = ga4Var;
    }

    public w13 a() {
        return new w13((h23) this.c.d(), (yu2) this.b.d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new rj2(((hh2) this.b).a(), (mv1) this.c.d());
            case 1:
                return new rl2((ym) this.b.d(), (dd2) this.c.d());
            case 2:
                return new su1((Context) this.b.d(), (sb2) this.c.d());
            case 3:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 4:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 5:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 6:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 7:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 8:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 9:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 10:
                return new up2((po2) this.c.d(), (Executor) this.b.d());
            case 11:
                return a();
            case 12:
                n70 n70Var = (n70) this.c.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new k33(n70Var, ld2Var, (ScheduledExecutorService) this.b.d(), 0);
            default:
                return gi2.J((Context) this.b.d(), (gd3) this.c.d());
        }
    }

    public /* synthetic */ sj2(ga4 ga4Var, ba4 ba4Var, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ba4Var;
    }
}
