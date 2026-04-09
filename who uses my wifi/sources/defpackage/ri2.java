package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ri2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;

    public /* synthetic */ ri2(ga4 ga4Var, int i) {
        this.a = i;
        this.b = ga4Var;
    }

    public iy2 a() {
        Context contextA = ((hh2) this.b).a();
        iy2 iy2Var = new iy2();
        iy2Var.m = 1;
        iy2Var.k = new vw1(contextA, hg4.C.t.a(), iy2Var, iy2Var, 2);
        return iy2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        Object en3Var;
        int i = this.a;
        int i2 = 0;
        byte b = 0;
        byte b2 = 0;
        int i3 = 1;
        ga4 ga4Var = this.b;
        switch (i) {
            case 0:
                return new p32(((hh2) ga4Var).a());
            case 1:
                return new ti2(((fh2) ga4Var).d(), 0);
            case 2:
                return new ti2(((fh2) ga4Var).d(), 1);
            case 3:
                return new xi2((zw2) ga4Var.d(), 0);
            case 4:
                return new zi2(0, (zw2) ga4Var.d());
            case 5:
                return new bj2(((hh2) ga4Var).a());
            case 6:
                return new yi2(i3, (z73) ga4Var.d());
            case 7:
                mc2 mc2VarM = mc2.m(((qi2) ga4Var).a.a());
                return new zi2(1, new gw3((ym) mc2VarM.g, (vb2) ((ba4) mc2VarM.i).d(), 24, b == true ? 1 : 0));
            case 8:
                return new xi2((zw2) ga4Var.d(), 1);
            case 9:
                return new l62(((i62) ga4Var.d()).a);
            case 10:
                return new up2(new kk2(b2 == true ? 1 : 0, (go2) ((bl2) ga4Var).a.f), md2.g);
            case 11:
                return new up2((vl2) ga4Var.d(), md2.g);
            case 12:
                return new up2((vl2) ga4Var.d(), md2.g);
            case 13:
                return ((hk2) ga4Var).d();
            case 14:
                e51 e51VarA = ((ph2) ga4Var).a();
                lf4 lf4Var = hg4.C.c;
                return new mv1(UUID.randomUUID().toString(), e51VarA, "native", new JSONObject(), true);
            case 15:
                String packageName = ((hh2) ga4Var).a().getPackageName();
                i41.M(packageName);
                return packageName;
            case 16:
                Context contextA = ((hh2) ga4Var).a();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new ay2(contextA, ld2Var, 1);
            case 17:
                return a();
            case 18:
                return new zs1(23, ((rh2) ga4Var).d());
            case 19:
                return new cz2(((hh2) ga4Var).a());
            case 20:
                return new yz2(((hh2) ga4Var).a());
            case zy1.zzm /* 21 */:
                return new x91(((hh2) ga4Var).a());
            case 22:
                return new h23((yu2) ga4Var.d());
            case 23:
                return new s23((mv2) ga4Var.d());
            case 24:
                return new b33(1, (Set) ga4Var.d());
            case 25:
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new o33(ld2Var2, ((hh2) ga4Var).a(), i2);
            case 26:
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                g43 g43Var = new g43(ld2Var3, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ga4Var.d();
                if (((Boolean) tw1.e.c.a(mz1.x4)).booleanValue()) {
                    x43 x43Var = new x43(g43Var, ((Integer) r3.c.a(mz1.y4)).intValue(), scheduledExecutorService);
                    int i4 = dn3.h;
                    en3Var = new en3(x43Var);
                } else {
                    int i5 = dn3.h;
                    en3Var = yn3.o;
                }
                i41.M(en3Var);
                return en3Var;
            case 27:
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new x43(new g43(ld2Var4, 1), ((Integer) tw1.e.c.a(mz1.Zc)).intValue(), (ScheduledExecutorService) ga4Var.d());
            case 28:
                Context contextA2 = ((hh2) ga4Var).a();
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new o33(contextA2, ld2Var5, 3);
            default:
                ld2 ld2Var6 = md2.a;
                i41.M(ld2Var6);
                return new o33(ld2Var6, ((hh2) ga4Var).a(), 4);
        }
    }
}
