package io.sentry.android.core;

/* loaded from: classes.dex */
public final class u implements io.sentry.hints.a, io.sentry.hints.k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11778a;

    public u(boolean z10) {
        this.f11778a = z10;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.f11778a ? "anr_background" : "anr_foreground";
    }
}
