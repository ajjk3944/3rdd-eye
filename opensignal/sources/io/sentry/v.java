package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {
    public final Queue B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12823a = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12824d = false;

    /* renamed from: g, reason: collision with root package name */
    public final CountDownLatch f12825g = new CountDownLatch(1);

    /* renamed from: r, reason: collision with root package name */
    public final long f12826r;

    /* renamed from: x, reason: collision with root package name */
    public final u0 f12827x;

    /* renamed from: y, reason: collision with root package name */
    public final String f12828y;

    public v(long j, u0 u0Var, String str, p6 p6Var) {
        this.f12826r = j;
        this.f12828y = str;
        this.B = p6Var;
        this.f12827x = u0Var;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.f12823a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z10) {
        this.f12824d = z10;
        this.f12825g.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z10) {
        this.f12823a = z10;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f12825g.await(this.f12826r, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            this.f12827x.g(b5.ERROR, "Exception while awaiting on lock.", e4);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.f12824d;
    }
}
