package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class S9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f40099a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f40100b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC5022vb f40101c;

    public S9(String str) {
        this(a(str));
    }

    public static HandlerThreadC5022vb a(String str) {
        StringBuilder sbV = N7.G8.v(str, "-");
        sbV.append(Md.f39862a.incrementAndGet());
        HandlerThreadC5022vb handlerThreadC5022vb = new HandlerThreadC5022vb(sbV.toString());
        handlerThreadC5022vb.start();
        return handlerThreadC5022vb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f40100b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j4) {
        this.f40100b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j4));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f40100b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f40099a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z10;
        HandlerThreadC5022vb handlerThreadC5022vb = this.f40101c;
        synchronized (handlerThreadC5022vb) {
            z10 = handlerThreadC5022vb.f41847a;
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f40100b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f40100b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC5022vb handlerThreadC5022vb = this.f40101c;
        synchronized (handlerThreadC5022vb) {
            handlerThreadC5022vb.f41847a = false;
            handlerThreadC5022vb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f40100b.post(futureTask);
        return futureTask;
    }

    public S9(HandlerThreadC5022vb handlerThreadC5022vb) {
        this(handlerThreadC5022vb, handlerThreadC5022vb.getLooper(), new Handler(handlerThreadC5022vb.getLooper()));
    }

    public S9(HandlerThreadC5022vb handlerThreadC5022vb, Looper looper, Handler handler) {
        this.f40101c = handlerThreadC5022vb;
        this.f40099a = looper;
        this.f40100b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j4, TimeUnit timeUnit) {
        this.f40100b.postDelayed(runnable, timeUnit.toMillis(j4));
    }
}
