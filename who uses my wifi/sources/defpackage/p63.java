package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p63 implements ca4 {
    public final /* synthetic */ int a;

    public /* synthetic */ p63(int i) {
        this.a = i;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new g43(ld2Var, 5);
            case 1:
                return new j83();
            case 2:
                return new i83();
            case 3:
                r83 r83Var = new r83();
                try {
                    qr3.a();
                } catch (GeneralSecurityException e) {
                    gi2.G("Failed to Configure Aead. ".concat(e.toString()));
                    hg4.C.h.d("CryptoUtils.registerAead", e);
                }
                return r83Var;
            case 4:
                return new s83();
            case 5:
                return ym.a;
            case 6:
                x83 x83Var = new x83();
                x83Var.a = null;
                return x83Var;
            case 7:
                return new j93();
            case 8:
                ld2 ld2Var2 = md2.f;
                i41.M(ld2Var2);
                return ld2Var2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof pq3) {
                    return (pq3) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new uq3((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new ld2(executorServiceUnconfigurableExecutorService);
            case 10:
                uq3 uq3Var = md2.e;
                i41.M(uq3Var);
                return uq3Var;
            case 11:
                ld2 ld2Var3 = md2.f;
                i41.M(ld2Var3);
                return ld2Var3;
            case 12:
                return new un(2);
            case 13:
                return new rf3();
            case 14:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                i41.M(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            case 15:
                return new fi3();
            case 16:
                return new sh3();
            case 17:
                return new fd3();
            case 18:
                return new qj3();
            default:
                return new bk3();
        }
    }
}
