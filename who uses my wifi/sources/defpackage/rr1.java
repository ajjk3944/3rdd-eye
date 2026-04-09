package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rr1 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final ba4 b;
    public final ba4 c;
    public final ba4 d;
    public final ba4 e;
    public final ba4 f;
    public final ga4 g;
    public final ga4 h;
    public final ga4 i;
    public final ga4 j;
    public final ga4 k;
    public final ga4 l;
    public final ca4 m;

    public rr1(ba4 ba4Var, ga4 ga4Var, ga4 ga4Var2, ri2 ri2Var, ga4 ga4Var3, ba4 ba4Var2, ga4 ga4Var4, ba4 ba4Var3, e02 e02Var, qm2 qm2Var, ba4 ba4Var4, ba4 ba4Var5) {
        this.b = ba4Var;
        this.g = ga4Var;
        this.h = ga4Var2;
        this.i = ri2Var;
        this.j = ga4Var3;
        this.c = ba4Var2;
        this.k = ga4Var4;
        this.d = ba4Var3;
        this.l = e02Var;
        this.m = qm2Var;
        this.e = ba4Var4;
        this.f = ba4Var5;
    }

    public km2 a() {
        u93 u93Var = (u93) this.b.d();
        e51 e51VarA = ((ph2) this.g).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.h.d();
        String packageName = ((hh2) ((ri2) this.i).b).a().getPackageName();
        i41.M(packageName);
        iz1 iz1Var = mz1.a;
        return new km2(u93Var, e51VarA, applicationInfo, packageName, tw1.e.a.H(), (PackageInfo) this.j.d(), ba4.b(this.c), ((fh2) this.k).d(), (String) this.d.d(), ((e02) this.l).c(), ((qm2) this.m).a(), (bp2) this.e.d(), ((Integer) this.f.d()).intValue());
    }

    public s13 b() {
        Context contextA = ((hh2) this.g).a();
        u93 u93Var = (u93) this.b.d();
        o13 o13Var = (o13) this.c.d();
        vm2 vm2Var = (vm2) this.d.d();
        db3 db3Var = (db3) this.e.d();
        eb3 eb3Var = (eb3) this.h.d();
        gl2 gl2Var = (gl2) this.f.d();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new s13(contextA, u93Var, o13Var, vm2Var, db3Var, eb3Var, gl2Var, ld2Var, (ScheduledExecutorService) this.l.d(), (e03) ((ba4) this.i).d(), (da3) ((ba4) this.j).d(), ((nt2) this.m).a(), (jv2) ((ba4) this.k).d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                th2 th2Var = (th2) ((da4) this.g).a;
                Context contextA = ((hh2) this.h).a();
                vs1 vs1Var = (vs1) this.b.d();
                v83 v83Var = (v83) this.c.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new cr1(th2Var, contextA, vs1Var, v83Var, ld2Var, (ScheduledExecutorService) this.d.d(), (pv2) this.e.d(), (eb3) this.f.d(), ((ph2) this.l).a(), ((e02) this.m).a(), (m83) ((ba4) this.i).d(), (jd4) ((ba4) this.j).d(), (k63) ((ba4) this.k).d());
            case 1:
                return a();
            default:
                return b();
        }
    }

    public rr1(da4 da4Var, hh2 hh2Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, ba4 ba4Var5, ph2 ph2Var, e02 e02Var, ba4 ba4Var6, ba4 ba4Var7, ba4 ba4Var8) {
        this.g = da4Var;
        this.h = hh2Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.e = ba4Var4;
        this.f = ba4Var5;
        this.l = ph2Var;
        this.m = e02Var;
        this.i = ba4Var6;
        this.j = ba4Var7;
        this.k = ba4Var8;
    }

    public rr1(ga4 ga4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, ga4 ga4Var2, ba4 ba4Var5, ga4 ga4Var3, ba4 ba4Var6, ba4 ba4Var7, nt2 nt2Var, ba4 ba4Var8) {
        this.g = ga4Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.e = ba4Var4;
        this.h = ga4Var2;
        this.f = ba4Var5;
        this.l = ga4Var3;
        this.i = ba4Var6;
        this.j = ba4Var7;
        this.m = nt2Var;
        this.k = ba4Var8;
    }
}
