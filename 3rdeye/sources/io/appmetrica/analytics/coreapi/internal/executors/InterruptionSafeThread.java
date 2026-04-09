package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes3.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f38867a;

    public InterruptionSafeThread() {
        this.f38867a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f38867a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f38867a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f38867a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f38867a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f38867a = true;
    }
}
