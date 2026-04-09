package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class R9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4852ok f40042a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f40043b;

    public R9() {
        C4852ok c4852okW = Ga.j().w();
        this.f40042a = c4852okW;
        this.f40043b = c4852okW.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f40042a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        StringBuilder sbV = N7.G8.v(str + '-' + str2, "-");
        sbV.append(Md.f39862a.incrementAndGet());
        return new InterruptionSafeThread(runnable, sbV.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f40043b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C4852ok c4852ok = this.f40042a;
        if (c4852ok.f41389f == null) {
            synchronized (c4852ok) {
                try {
                    if (c4852ok.f41389f == null) {
                        c4852ok.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-SIO");
                        c4852ok.f41389f = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c4852ok.f41389f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        return this.f40042a.f();
    }
}
