package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e02 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;

    public e02(hh2 hh2Var, ph2 ph2Var, ba4 ba4Var, ba4 ba4Var2) {
        this.a = 14;
        this.d = hh2Var;
        this.e = ph2Var;
        this.b = ba4Var;
        this.c = ba4Var2;
    }

    public b02 a() {
        return new b02((ScheduledExecutorService) ((ba4) this.b).d(), (jd4) ((ba4) this.c).d(), (k63) ((ba4) this.d).d(), (pv2) ((ba4) this.e).d());
    }

    public b23 b() {
        return new b23((u93) ((ba4) this.b).d(), (pq3) this.c.d(), (b03) this.d.d(), (f03) ((ca4) this.e).d(), 0);
    }

    public s53 c() {
        Context contextA = ((hh2) this.c).a();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new s53(contextA, ld2Var, ((ha4) this.d).d(), (da3) ((ba4) this.b).d(), (mv2) this.e.d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                u93 u93Var = (u93) ((ba4) this.b).d();
                pq3 pq3Var = (pq3) this.c.d();
                xb2 xb2Var = (xb2) this.d;
                return new b23(u93Var, pq3Var, ((sj2) this.e).a(), new n03((Context) xb2Var.b.d(), (zh2) xb2Var.c.a, 0), 0);
            case 2:
                u93 u93Var2 = (u93) ((ba4) this.b).d();
                pq3 pq3Var2 = (pq3) this.c.d();
                xb2 xb2Var2 = (xb2) this.d;
                return new b23(u93Var2, pq3Var2, ((sj2) this.e).a(), new r03((Context) xb2Var2.b.d(), (bi2) xb2Var2.c.a), 0);
            case 3:
                return new yk2(((ll2) this.e).a(), (cn2) ((ba4) this.b).d(), (vn2) ((ba4) this.c).d(), (co2) ((ba4) this.d).d());
            case 4:
                return new tl2((ym) this.c.d(), (ul2) this.d.d(), ((qm2) this.e).a(), (String) ((ba4) this.b).d());
            case 5:
                u93 u93Var3 = (u93) ((ba4) this.b).d();
                pq3 pq3Var3 = (pq3) this.c.d();
                xb2 xb2Var3 = (xb2) this.d;
                return new b23(u93Var3, pq3Var3, ((sj2) this.e).a(), new n03((Context) xb2Var3.b.d(), (ei2) xb2Var3.c.a, 1), 0);
            case 6:
                pu2 pu2Var = (pu2) this.c.d();
                au2 au2Var = (au2) ((fr2) this.d).b.h;
                i41.M(au2Var);
                zj2 zj2Var = (zj2) ((ba4) this.b).d();
                dr2 dr2Var = (dr2) ((gr2) this.e).b.d();
                i41.M(dr2Var);
                return new ns2(pu2Var, au2Var, zj2Var, dr2Var);
            case 7:
                return new tt2(((hh2) this.b).a(), ((u12) this.c).a(), ((es2) this.d).a(), (pr2) ((u43) this.e).d());
            case 8:
                return new ut2((String) ((ll2) this.b).b.i, (pr2) ((u43) this.c).d(), ((u12) this.d).a(), (mv2) this.e.d());
            case 9:
                u93 u93Var4 = (u93) ((ba4) this.b).d();
                pq3 pq3Var4 = (pq3) this.c.d();
                xb2 xb2Var4 = (xb2) this.d;
                return new b23(u93Var4, pq3Var4, ((sj2) this.e).a(), new n03((Context) xb2Var4.b.d(), (ji2) xb2Var4.c.a, 2), 0);
            case 10:
                return new pz2(((hh2) this.d).a(), (jz2) ((ba4) this.b).d(), (ug4) this.e.d(), (mv2) ((ba4) this.c).d());
            case 11:
                return b();
            case 12:
                return new b23((u93) ((ba4) this.b).d(), (pq3) this.c.d(), (vz1) ((g23) this.d).b.g, new vg0(23, (ei2) ((aw2) this.e).b.a), 1);
            case 13:
                return c();
            case 14:
                return new ea3(((hh2) this.d).a(), ((ph2) this.e).a(), (xu2) ((ba4) this.b).d(), new ts0(), (ch2) ((ba4) this.c).d());
            case 15:
                return new og3(ba4.b((ha4) this.c), ba4.b((ha4) this.d), (ExecutorService) ((da4) this.e).a, ba4.b((ba4) this.b));
            default:
                ba4 ba4Var = (ba4) this.c;
                z94 z94VarB = ba4.b((ba4) this.b);
                z94 z94VarB2 = ba4.b(ba4Var);
                z94 z94VarB3 = ba4.b(this.d);
                vf3 vf3Var = (vf3) this.e.d();
                return new xi3(z94VarB, z94VarB2, z94VarB3, vf3Var.K().A(), vf3Var.K().D());
        }
    }

    public e02(hh2 hh2Var, ba4 ba4Var, ga4 ga4Var, ba4 ba4Var2) {
        this.a = 10;
        this.d = hh2Var;
        this.b = ba4Var;
        this.e = ga4Var;
        this.c = ba4Var2;
    }

    public e02(ll2 ll2Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3) {
        this.a = 3;
        this.e = ll2Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
    }

    public /* synthetic */ e02(ga4 ga4Var, ca4 ca4Var, ba4 ba4Var, ga4 ga4Var2, int i) {
        this.a = i;
        this.c = ga4Var;
        this.d = ca4Var;
        this.b = ba4Var;
        this.e = ga4Var2;
    }

    public /* synthetic */ e02(ga4 ga4Var, ga4 ga4Var2, ca4 ca4Var, ba4 ba4Var, int i) {
        this.a = i;
        this.c = ga4Var;
        this.d = ga4Var2;
        this.e = ca4Var;
        this.b = ba4Var;
    }

    public /* synthetic */ e02(ga4 ga4Var, ga4 ga4Var2, ga4 ga4Var3, ga4 ga4Var4, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ga4Var2;
        this.d = ga4Var3;
        this.e = ga4Var4;
    }
}
