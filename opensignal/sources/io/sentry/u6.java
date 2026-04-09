package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u6 extends io.sentry.hints.c implements io.sentry.hints.h, io.sentry.hints.k {

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReference f12800r;

    public u6(long j, u0 u0Var) {
        super(j, u0Var);
        this.f12800r = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = (io.sentry.protocol.t) this.f12800r.get();
        return tVar2 != null && tVar2.equals(tVar);
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.t tVar) {
        this.f12800r.set(tVar);
    }
}
