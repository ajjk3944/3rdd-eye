package ia;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes3.dex */
public final class l extends D {

    /* renamed from: b, reason: collision with root package name */
    public D f38653b;

    public l(D delegate) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f38653b = delegate;
    }

    @Override // ia.D
    public final void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.l.f(condition, "condition");
        this.f38653b.awaitSignal(condition);
    }

    @Override // ia.D
    public final void cancel() {
        this.f38653b.cancel();
    }

    @Override // ia.D
    public final D clearDeadline() {
        return this.f38653b.clearDeadline();
    }

    @Override // ia.D
    public final D clearTimeout() {
        return this.f38653b.clearTimeout();
    }

    @Override // ia.D
    public final long deadlineNanoTime() {
        return this.f38653b.deadlineNanoTime();
    }

    @Override // ia.D
    public final boolean hasDeadline() {
        return this.f38653b.hasDeadline();
    }

    @Override // ia.D
    public final void throwIfReached() throws IOException {
        this.f38653b.throwIfReached();
    }

    @Override // ia.D
    public final D timeout(long j4, TimeUnit unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        return this.f38653b.timeout(j4, unit);
    }

    @Override // ia.D
    public final long timeoutNanos() {
        return this.f38653b.timeoutNanos();
    }

    @Override // ia.D
    public final void waitUntilNotified(Object monitor) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.l.f(monitor, "monitor");
        this.f38653b.waitUntilNotified(monitor);
    }

    @Override // ia.D
    public final D deadlineNanoTime(long j4) {
        return this.f38653b.deadlineNanoTime(j4);
    }
}
