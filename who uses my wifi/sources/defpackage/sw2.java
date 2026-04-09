package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sw2 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;

    public /* synthetic */ sw2(ba4 ba4Var, int i) {
        this.a = i;
        this.b = ba4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                rw2 rw2Var = (rw2) this.b.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new up2(rw2Var, ld2Var);
            case 1:
                rw2 rw2Var2 = (rw2) this.b.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new up2(rw2Var2, ld2Var2);
            case 2:
                rw2 rw2Var3 = (rw2) this.b.d();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new up2(rw2Var3, ld2Var3);
            case 3:
                return new up2((ix2) this.b.d(), md2.g);
            case 4:
                return new up2((ix2) this.b.d(), md2.g);
            case 5:
                return new up2((ix2) this.b.d(), md2.g);
            case 6:
                Context context = (Context) this.b.d();
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new ay2(context, ld2Var4, 0);
            case 7:
                dz2 dz2Var = (dz2) this.b.d();
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new up2(dz2Var, ld2Var5);
            case 8:
                dz2 dz2Var2 = (dz2) this.b.d();
                ld2 ld2Var6 = md2.a;
                i41.M(ld2Var6);
                return new up2(dz2Var2, ld2Var6);
            case 9:
                return new m83((vs1) this.b.d());
            case 10:
                return new up2((w83) this.b.d(), md2.g);
            case 11:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.b.d()));
                i41.M(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 12:
                return new bb3((jz2) this.b.d());
            case 13:
                return new wh3((gk3) this.b.d());
            case 14:
                return new ck3();
            default:
                return new oh4((pv2) this.b.d());
        }
    }
}
