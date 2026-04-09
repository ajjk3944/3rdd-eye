package io.sentry.hints;

import io.sentry.b5;
import io.sentry.protocol.t;
import io.sentry.u0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f12313a = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public final long f12314d;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f12315g;

    public c(long j, u0 u0Var) {
        this.f12314d = j;
        this.f12315g = u0Var;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f12313a.await(this.f12314d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            this.f12315g.g(b5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e4);
            return false;
        }
    }

    public abstract boolean f(t tVar);

    public abstract void g(t tVar);
}
