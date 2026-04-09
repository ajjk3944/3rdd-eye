package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122et implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13996a;

    public /* synthetic */ C1122et(int i) {
        this.f13996a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        ID od;
        switch (this.f13996a) {
            case 0:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C1606ns(c0623Mf, 4);
            case 1:
                return new Zt();
            case 2:
                return new Yt();
            case 3:
                C1232gu c1232gu = new C1232gu();
                try {
                    AbstractC1307iE.a();
                } catch (GeneralSecurityException e6) {
                    AbstractC2907C.m("Failed to Configure Aead. ".concat(e6.toString()));
                    p2.j.f22785C.f22795h.f("CryptoUtils.registerAead", e6);
                }
                return c1232gu;
            case 4:
                return new C1286hu();
            case 5:
                return Q2.a.f3169a;
            case 6:
                C1554mu c1554mu = new C1554mu();
                c1554mu.f15688a = null;
                return c1554mu;
            case 7:
                return new C2147xu();
            case 8:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10010f;
                Cr.v(c0623Mf2);
                return c0623Mf2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof ID) {
                    od = (ID) executorServiceUnconfigurableExecutorService;
                } else {
                    od = executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new OD((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new C0623Mf(executorServiceUnconfigurableExecutorService);
                }
                Cr.v(od);
                return od;
            case 10:
                OD od2 = AbstractC0640Nf.f10009e;
                Cr.v(od2);
                return od2;
            case 11:
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10010f;
                Cr.v(c0623Mf3);
                return c0623Mf3;
            case 12:
                return new ThreadFactoryC1539mf();
            case 13:
                return new Sx();
            case 14:
                return new C1827ry();
            case 15:
                return new C1237gz();
            case 16:
                return new Vy();
            case 17:
                return new Bw();
            case 18:
                return new Uz();
            default:
                return new C1571nA();
        }
    }
}
