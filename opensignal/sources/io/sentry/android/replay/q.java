package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11943a = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f11944d = new io.sentry.util.a();

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.b0 f11945g = new io.sentry.android.core.b0(1, this);

    /* renamed from: r, reason: collision with root package name */
    public final p f11946r = new p(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11943a.set(true);
        this.f11945g.clear();
    }
}
