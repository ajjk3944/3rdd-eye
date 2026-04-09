package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g33 implements q53 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public g33(e51 e51Var, pq3 pq3Var) {
        this.a = 2;
        this.c = e51Var;
        this.b = pq3Var;
    }

    @Override // defpackage.q53
    public final n70 a() {
        switch (this.a) {
            case 0:
                ym ymVar = (ym) this.b;
                l83 l83Var = (l83) this.c;
                ymVar.getClass();
                return pu1.r(new h33(l83Var, System.currentTimeMillis()));
            case 1:
                if (((Boolean) tw1.e.c.a(mz1.j3)).booleanValue()) {
                    return pu1.r(new q33(0, null));
                }
                gd2 gd2Var = (gd2) this.c;
                return pu1.P(gd2Var.h(), gj1.n, (Executor) this.b);
            case 2:
                return ((ld2) ((pq3) this.b)).c(new xs1(13, this));
            case 3:
                return ((ld2) ((pq3) this.b)).c(new xs1(19, this));
            case 4:
                gi2.G("HsdpMigrationSignal.produce");
                if (!((Boolean) tw1.e.c.a(mz1.Dd)).booleanValue()) {
                    return pu1.r(new r43(null, 1));
                }
                boolean z = false;
                try {
                    if (((Intent) this.c).resolveActivity(((Context) this.b).getPackageManager()) != null) {
                        gi2.G("HSDP intent is supported");
                        z = true;
                    }
                } catch (Exception e) {
                    hg4.C.h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
                }
                return pu1.r(new r43(Boolean.valueOf(z), 1));
            case 5:
                return ((ld2) ((pq3) this.b)).c(new xs1(21, this));
            case 6:
                return ((ld2) ((pq3) this.b)).c(new xs1(23, this));
            case 7:
                lq3 lq3VarR = pu1.r((String) this.c);
                gj1 gj1Var = gj1.p;
                Executor executor = (Executor) this.b;
                return pu1.L(pu1.P(lq3VarR, gj1Var, executor), Throwable.class, new u42(11, this), executor);
            default:
                return ((ld2) ((pq3) this.b)).c(new w53(2, this));
        }
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 4;
            case 1:
                return 10;
            case 2:
                return 54;
            case 3:
                return 21;
            case 4:
                return 60;
            case 5:
                return 23;
            case 6:
                return 62;
            case 7:
                return 41;
            default:
                return 48;
        }
    }

    public /* synthetic */ g33(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
