package io.sentry;

/* loaded from: classes.dex */
public final class r1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f12687a = Runtime.getRuntime();

    @Override // io.sentry.y0
    public final void a(a3 a3Var) {
        Runtime runtime = this.f12687a;
        a3Var.f11462b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.y0
    public final void c() {
    }
}
