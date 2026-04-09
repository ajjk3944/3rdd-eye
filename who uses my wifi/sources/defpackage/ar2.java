package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ar2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;
    public final ga4 f;
    public final ga4 g;

    public ar2(hh2 hh2Var, ba4 ba4Var, ga4 ga4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4) {
        this.a = 10;
        this.c = hh2Var;
        this.d = ba4Var;
        this.b = ga4Var;
        this.e = ba4Var2;
        this.f = ba4Var3;
        this.g = ba4Var4;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                th2 th2Var = (th2) this.b.d();
                mm2 mm2VarB = ((om2) this.e).b.b();
                fp2 fp2Var = ((gp2) this.f).b;
                vq2 vq2Var = (vq2) ((u12) this.g).b;
                go2 go2VarD = ((hk2) this.c).d();
                o13 o13Var = (o13) ((ba4) this.d).d();
                th2 th2Var2 = th2Var.b;
                mm2 mm2Var = new mm2(mm2VarB);
                f23 f23Var = null;
                f23 f23Var2 = new f23(0, (Object) null);
                l92 l92Var = new l92(go2VarD, (Object) null);
                ug0 ug0Var = new ug0(19, (Object) null);
                if (((Boolean) tw1.e.c.a(mz1.Y3)).booleanValue()) {
                    f23Var = new f23(25);
                    f23Var.g = o13Var;
                }
                i41.P(fp2Var, fp2.class);
                if (f23Var == null) {
                    f23Var = new f23(25);
                }
                i41.P(vq2Var, vq2.class);
                gl2 gl2Var = (gl2) new bi2(th2Var2, ug0Var, vq2Var, new tv2(0, (byte) 0), fp2Var, mm2Var, f23Var, f23Var2, l92Var, null, null).q.d();
                i41.M(gl2Var);
                return gl2Var;
            case 1:
                Context contextA = ((hh2) this.b).a();
                l83 l83VarA = ((qm2) this.e).a();
                rc2 rc2Var = (rc2) this.f;
                ld2 ld2Var = md2.b;
                i41.M(ld2Var);
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                mc2 mc2Var = new mc2(ld2Var, ld2Var2, new ay2((Context) ((sw2) rc2Var.b).b.d(), ld2Var2, 0), ba4.b((ic2) rc2Var.c), 16, false);
                i41.M(ld2Var2);
                return new yx2(contextA, l83VarA, mc2Var, ld2Var2, (ScheduledExecutorService) this.c.d(), (ez2) ((ba4) this.d).d(), (da3) ((ba4) this.g).d());
            case 2:
                return new i13((th2) this.b.d(), (vq2) ((u12) this.g).b, ((om2) this.e).b.b(), ((gp2) this.f).b, (o13) ((ba4) this.d).d(), (e03) ((ba4) this.c).d());
            case 3:
                return new i13((th2) this.b.d(), ((om2) this.e).b.b(), ((g23) this.c).b, ((gp2) this.f).b, (o13) ((ba4) this.d).d(), (e03) ((ba4) this.g).d());
            case 4:
                return new i13((th2) this.b.d(), ((om2) this.e).b.b(), ((gp2) this.f).b, (i83) ((om2) this.c).b.d, (o13) ((ba4) this.d).d(), (e03) ((ba4) this.g).d());
            case 5:
                ra4 ra4VarD = ((fh2) this.b).d();
                Context contextA2 = ((hh2) this.c).a();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new y53(ra4VarD, contextA2, ld2Var3, (ScheduledExecutorService) this.e.d(), new x91(((hh2) ((ri2) this.f).b).a()), ((qm2) this.g).a(), ((ph2) this.d).a());
            case 6:
                gd2 gd2Var = (gd2) this.b.d();
                boolean z = ((fa2) ((n63) this.e).b.h).p;
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                i41.M(((fa2) ((n63) this.f).b.h).i);
                return new o63(gd2Var, z, ld2Var4, (ScheduledExecutorService) this.c.d(), ((n63) this.g).a().intValue(), ((fa2) ((n63) this.d).b.h).t);
            case 7:
                return new t63((Context) ((da4) this.e).a, (Executor) this.b.d(), (th2) this.c.d(), ((l73) this.f).a(), (s63) ((ba4) this.d).d(), new k83(), ((ph2) this.g).a());
            case 8:
                return new v73((Context) ((da4) this.e).a, (Executor) this.b.d(), (th2) this.c.d(), ((l73) this.f).a(), (s73) ((ba4) this.d).d(), new k83(), (i83) ((ba4) this.g).d());
            case 9:
                return new q83((eb3) this.b.d(), (bb3) this.c.d(), ((ll2) this.e).a(), ((ll2) this.f).b.G(), (gj2) ((ba4) this.d).d(), (da3) this.g.d());
            case 10:
                Context contextA3 = ((hh2) this.c).a();
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new eb3(contextA3, ld2Var5, (qq3) ((ba4) this.d).d(), (ug4) this.b.d(), (bb3) ((ba4) this.e).d(), (ea3) ((ba4) this.f).d(), (ch2) ((ba4) this.g).d());
            case 11:
                return new tf3((og3) ((ba4) this.d).d(), (oh3) ((ba4) this.b).d(), (xj3) ((ba4) this.c).d(), (gk3) ((ba4) this.e).d(), ba4.b((ba4) this.f), (vf3) ((da4) this.g).a);
            case 12:
                return new ri3((fr1) ((da4) this.e).a, (gi3) this.b.d(), (eg3) ((da4) this.f).a, (Context) ((da4) this.g).a, (Map) ((da4) this.d).a, (gk3) this.c.d());
            case 13:
                return new lj3((fe3) ((ba4) this.d).d(), (rj3) ((ba4) this.e).d(), (uj3) ((ba4) this.f).d(), (gk3) this.b.d(), (ExecutorService) this.c.d(), (File) ((ba4) this.g).d());
            default:
                return new pj3((Context) this.b.d(), (ExecutorService) this.c.d(), (vf3) this.e.d(), (hg3) this.f.d(), (gk3) this.g.d(), (qj3) ((ba4) this.d).d());
        }
    }

    public ar2(ba4 ba4Var, n63 n63Var, n63 n63Var2, ba4 ba4Var2, n63 n63Var3, n63 n63Var4) {
        this.a = 6;
        this.b = ba4Var;
        this.e = n63Var;
        this.f = n63Var2;
        this.c = ba4Var2;
        this.g = n63Var3;
        this.d = n63Var4;
    }

    public ar2(ba4 ba4Var, ba4 ba4Var2, ll2 ll2Var, ll2 ll2Var2, ba4 ba4Var3, ba4 ba4Var4) {
        this.a = 9;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.e = ll2Var;
        this.f = ll2Var2;
        this.d = ba4Var3;
        this.g = ba4Var4;
    }

    public ar2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, ba4 ba4Var5, da4 da4Var) {
        this.a = 11;
        this.d = ba4Var;
        this.b = ba4Var2;
        this.c = ba4Var3;
        this.e = ba4Var4;
        this.f = ba4Var5;
        this.g = da4Var;
    }

    public ar2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, da4 da4Var, ba4 ba4Var5) {
        this.a = 13;
        this.d = ba4Var;
        this.e = ba4Var2;
        this.f = ba4Var3;
        this.b = ba4Var4;
        this.c = da4Var;
        this.g = ba4Var5;
    }

    public ar2(da4 da4Var, om2 om2Var, g23 g23Var, gp2 gp2Var, ba4 ba4Var, ba4 ba4Var2) {
        this.a = 3;
        this.b = da4Var;
        this.e = om2Var;
        this.c = g23Var;
        this.f = gp2Var;
        this.d = ba4Var;
        this.g = ba4Var2;
    }

    public /* synthetic */ ar2(da4 da4Var, ba4 ba4Var, da4 da4Var2, ca4 ca4Var, ba4 ba4Var2, ga4 ga4Var, int i) {
        this.a = i;
        this.e = da4Var;
        this.b = ba4Var;
        this.c = da4Var2;
        this.f = ca4Var;
        this.d = ba4Var2;
        this.g = ga4Var;
    }

    public ar2(da4 da4Var, ba4 ba4Var, da4 da4Var2, da4 da4Var3, da4 da4Var4, ba4 ba4Var2) {
        this.a = 12;
        this.e = da4Var;
        this.b = ba4Var;
        this.f = da4Var2;
        this.g = da4Var3;
        this.d = da4Var4;
        this.c = ba4Var2;
    }

    public ar2(ga4 ga4Var, u12 u12Var, om2 om2Var, gp2 gp2Var, ba4 ba4Var, ba4 ba4Var2) {
        this.a = 2;
        this.b = ga4Var;
        this.g = u12Var;
        this.e = om2Var;
        this.f = gp2Var;
        this.d = ba4Var;
        this.c = ba4Var2;
    }

    public ar2(ga4 ga4Var, om2 om2Var, gp2 gp2Var, u12 u12Var, ga4 ga4Var2, ba4 ba4Var) {
        this.a = 0;
        this.b = ga4Var;
        this.e = om2Var;
        this.f = gp2Var;
        this.g = u12Var;
        this.c = ga4Var2;
        this.d = ba4Var;
    }

    public /* synthetic */ ar2(ga4 ga4Var, ca4 ca4Var, ca4 ca4Var2, ga4 ga4Var2, ba4 ba4Var, ba4 ba4Var2, int i) {
        this.a = i;
        this.b = ga4Var;
        this.e = ca4Var;
        this.f = ca4Var2;
        this.c = ga4Var2;
        this.d = ba4Var;
        this.g = ba4Var2;
    }

    public /* synthetic */ ar2(ga4 ga4Var, ga4 ga4Var2, ga4 ga4Var3, ga4 ga4Var4, ga4 ga4Var5, ga4 ga4Var6, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ga4Var2;
        this.e = ga4Var3;
        this.f = ga4Var4;
        this.g = ga4Var5;
        this.d = ga4Var6;
    }
}
