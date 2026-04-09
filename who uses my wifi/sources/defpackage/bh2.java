package defpackage;

import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bh2 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ba4 c;

    public /* synthetic */ bh2(ba4 ba4Var, ba4 ba4Var2, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ba4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        ld2 ld2Var;
        switch (this.a) {
            case 0:
                return new ah2((wg2) this.b.d(), (mv2) this.c.d());
            case 1:
                return new ch2((ScheduledExecutorService) this.c.d());
            case 2:
                return ((Boolean) tw1.e.c.a(mz1.d3)).booleanValue() ? new vs1((rs1) this.c.d()) : new vs1((rs1) this.b.d());
            case 3:
                mv1 mv1Var = (mv1) this.b.d();
                l62 l62Var = (l62) this.c.d();
                iz1 iz1Var = mz1.g6;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    ld2Var = md2.c;
                } else {
                    ld2Var = ((Boolean) tw1Var.c.a(mz1.f6)).booleanValue() ? md2.a : md2.f;
                }
                i41.M(ld2Var);
                return new qj2(mv1Var.c, l62Var, ld2Var);
            case 4:
                xj2 xj2Var = (xj2) this.b.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                Set setSingleton = ((JSONObject) this.c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new up2(xj2Var, ld2Var2));
                i41.M(setSingleton);
                return setSingleton;
            case 5:
                xj2 xj2Var2 = (xj2) this.b.d();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                Set setSingleton2 = ((JSONObject) this.c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new up2(xj2Var2, ld2Var3));
                i41.M(setSingleton2);
                return setSingleton2;
            case 6:
                xj2 xj2Var3 = (xj2) this.b.d();
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                Set setSingleton3 = ((JSONObject) this.c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new up2(xj2Var3, ld2Var4));
                i41.M(setSingleton3);
                return setSingleton3;
            case 7:
                xj2 xj2Var4 = (xj2) this.b.d();
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                Set setSingleton4 = ((JSONObject) this.c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new up2(xj2Var4, ld2Var5));
                i41.M(setSingleton4);
                return setSingleton4;
            case 8:
                return new oq2((xn2) this.b.d(), (rp2) this.c.d());
            case 9:
                return new rv2((String) this.b.d(), (pv2) this.c.d());
            case 10:
                return new vw2((mw2) this.b.d(), (xu2) this.c.d());
            case 11:
                u93 u93Var = (u93) this.b.d();
                hg4.C.f.getClass();
                CookieManager cookieManagerD = bd2.D();
                Objects.requireNonNull(u93Var);
                xs1 xs1Var = new xs1(5, cookieManagerD);
                pq3 pq3Var = u93Var.a;
                lq3 lq3Var = u93.d;
                List list = Collections.EMPTY_LIST;
                n70 n70VarC = ((ld2) pq3Var).c(xs1Var);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                bu1 bu1Var = new bu1(u93Var, s93.x, null, lq3Var, list, pu1.N(n70VarC, 1L, TimeUnit.SECONDS, u93Var.b));
                fi1 fi1Var = new fi1(15);
                u93 u93Var2 = (u93) bu1Var.l;
                return new bu1(u93Var2, bu1Var.g, (String) bu1Var.h, (n70) bu1Var.i, (List) bu1Var.j, pu1.L((n70) bu1Var.k, Exception.class, fi1Var, u93Var2.a)).A();
            case 12:
                ld2 ld2Var6 = md2.a;
                i41.M(ld2Var6);
                g43 g43Var = new g43(ld2Var6, 2);
                ym ymVar = (ym) this.b.d();
                i41.M(ld2Var6);
                return new f43(g43Var, ((Long) k02.f.w()).longValue(), ymVar, ld2Var6, (mv2) this.c.d());
            case 13:
                return new z73((ym) this.b.d(), (mv2) this.c.d());
            case 14:
                return new c53((String) this.b.d(), ((Integer) this.c.d()).intValue());
            case 15:
                return new mb3((nb3) this.b.d(), (gb3) this.c.d());
            case 16:
                pm pmVar = (pm) this.b.d();
                ld2 ld2Var7 = md2.a;
                i41.M(ld2Var7);
                return new mu2(pmVar, new kf3(27, ld2Var7), (vu2) this.c.d(), new tv2(11, (byte) 0));
            default:
                return new gk3((rf3) this.b.d(), (pg3) this.c.d());
        }
    }
}
