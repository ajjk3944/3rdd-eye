package io.sentry.android.core;

import io.sentry.b5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k0 implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {

    /* renamed from: r, reason: collision with root package name */
    public final long f11694r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.u0 f11695x;

    /* renamed from: g, reason: collision with root package name */
    public CountDownLatch f11693g = new CountDownLatch(1);

    /* renamed from: a, reason: collision with root package name */
    public boolean f11691a = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11692d = false;

    public k0(long j, io.sentry.u0 u0Var) {
        this.f11694r = j;
        ir.f0.T(u0Var, "ILogger is required.");
        this.f11695x = u0Var;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.f11691a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z10) {
        this.f11692d = z10;
        this.f11693g.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z10) {
        this.f11691a = z10;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f11693g.await(this.f11694r, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            this.f11695x.g(b5.ERROR, "Exception while awaiting on lock.", e4);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.f11692d;
    }
}
