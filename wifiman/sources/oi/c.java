package oi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f55711c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f55712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable checkCancelled, InterfaceC6835l interruptedExceptionHandler) {
        super(lock);
        AbstractC6492s.i(lock, "lock");
        AbstractC6492s.i(checkCancelled, "checkCancelled");
        AbstractC6492s.i(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f55711c = checkCancelled;
        this.f55712d = interruptedExceptionHandler;
    }

    @Override // oi.d, oi.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f55711c.run();
            } catch (InterruptedException e10) {
                this.f55712d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, InterfaceC6835l interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC6492s.i(checkCancelled, "checkCancelled");
        AbstractC6492s.i(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
