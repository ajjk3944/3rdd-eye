package io.sentry.android.core;

/* loaded from: classes.dex */
public final class x extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {

    /* renamed from: r, reason: collision with root package name */
    public final long f11791r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11792x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11793y;

    public x(long j, io.sentry.u0 u0Var, long j7, boolean z10, boolean z11) {
        super(j, u0Var);
        this.f11791r = j7;
        this.f11792x = z10;
        this.f11793y = z11;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.f11792x;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.f11791r);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.f11793y ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.t tVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.t tVar) {
    }
}
