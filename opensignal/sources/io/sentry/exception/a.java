package io.sentry.exception;

import io.sentry.protocol.k;
import ir.f0;

/* loaded from: classes.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final k f12241a;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f12242d;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f12243g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12244r;

    public a(k kVar, Throwable th2, Thread thread, boolean z10) {
        this.f12241a = kVar;
        f0.T(th2, "Throwable is required.");
        this.f12242d = th2;
        f0.T(thread, "Thread is required.");
        this.f12243g = thread;
        this.f12244r = z10;
    }
}
