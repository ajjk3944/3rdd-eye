package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lo0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13564a;

    public /* synthetic */ lo0(int i4) {
        this.f13564a = i4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f13564a) {
            case 0:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new nm0(exVar, 4);
            case 1:
                return new fq0();
            case 2:
                return new eq0();
            case 3:
                nq0 nq0Var = new nq0();
                try {
                    w91.a();
                } catch (GeneralSecurityException e2) {
                    ya.a0.m("Failed to Configure Aead. ".concat(e2.toString()));
                    ua.j.C.f35265h.f("CryptoUtils.registerAead", e2);
                }
                return nq0Var;
            case 4:
                return new oq0();
            case 5:
                return tb.a.f34528a;
            case 6:
                tq0 tq0Var = new tq0();
                tq0Var.f16922a = null;
                return tq0Var;
            case 7:
                return new fr0();
            case 8:
                ex exVar2 = fx.f11279f;
                al0.z(exVar2);
                return exVar2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof w81) {
                    return (w81) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new c91((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new ex(executorServiceUnconfigurableExecutorService);
            case 10:
                c91 c91Var = fx.f11278e;
                al0.z(c91Var);
                return c91Var;
            case 11:
                ex exVar3 = fx.f11279f;
                al0.z(exVar3);
                return exVar3;
            case 12:
                return new cw();
            case 13:
                return new nx0();
            case 14:
                return new gy0();
            case 15:
                return new rz0();
            case 16:
                return new iz0();
            case 17:
                return new fv0();
            case 18:
                return new h11();
            default:
                return new a21();
        }
    }
}
