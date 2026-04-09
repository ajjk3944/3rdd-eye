package io.sentry;

/* loaded from: classes.dex */
public final class r implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12686a = new ThreadLocal();

    @Override // io.sentry.c1
    public final f1 a(b1 b1Var) {
        b1 b1Var2 = get();
        f12686a.set(b1Var);
        return new q(0, b1Var2);
    }

    @Override // io.sentry.c1
    public final void close() {
        f12686a.remove();
    }

    @Override // io.sentry.c1
    public final b1 get() {
        return (b1) f12686a.get();
    }
}
