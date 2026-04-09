package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oj2 implements ca4 {
    public final ga4 a;
    public final ga4 b;
    public final ga4 c;
    public final ll2 d;
    public final ll2 e;
    public final ga4 f;
    public final ba4 g;
    public final ca4 h;
    public final ca4 i;
    public final ga4 j;
    public final ga4 k;
    public final ga4 l;
    public final ga4 m;
    public final ba4 n;
    public final ba4 o;

    public oj2(hh2 hh2Var, ba4 ba4Var, ba4 ba4Var2, ll2 ll2Var, ll2 ll2Var2, ba4 ba4Var3, ba4 ba4Var4, ca4 ca4Var, ca4 ca4Var2, ba4 ba4Var5, ba4 ba4Var6, ba4 ba4Var7, pm2 pm2Var, ba4 ba4Var8, ba4 ba4Var9) {
        this.a = hh2Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ll2Var;
        this.e = ll2Var2;
        this.f = ba4Var3;
        this.g = ba4Var4;
        this.h = ca4Var;
        this.i = ca4Var2;
        this.j = ba4Var5;
        this.k = ba4Var6;
        this.l = ba4Var7;
        this.m = pm2Var;
        this.n = ba4Var8;
        this.o = ba4Var9;
    }

    @Override // defpackage.ga4
    public final Object d() {
        Context contextA = ((hh2) this.a).a();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        Executor executor = (Executor) this.b.d();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.d();
        h83 h83VarB = this.d.b();
        a83 a83VarA = this.e.a();
        db3 db3Var = (db3) this.f.d();
        q83 q83Var = (q83) this.g.d();
        View view = (View) this.h.d();
        ag2 ag2Var = (ag2) this.i.d();
        vs1 vs1Var = (vs1) this.j.d();
        f02 f02Var = (f02) this.k.d();
        return new nj2(contextA, ld2Var, executor, scheduledExecutorService, h83VarB, a83VarA, db3Var, q83Var, view, ag2Var, vs1Var, f02Var, (t83) ((pm2) this.m).a.e, (ao2) this.n.d(), (gm2) this.o.d());
    }
}
