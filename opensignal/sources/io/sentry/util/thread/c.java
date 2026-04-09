package io.sentry.util.thread;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f12821a = Thread.currentThread().getId();

    /* renamed from: b, reason: collision with root package name */
    public static final c f12822b = new c();

    @Override // io.sentry.util.thread.a
    public final String a() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return f12821a == Thread.currentThread().getId();
    }
}
