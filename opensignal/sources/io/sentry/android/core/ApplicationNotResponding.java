package io.sentry.android.core;

/* loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f11495a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        ir.f0.T(thread, "Thread must be provided.");
        this.f11495a = thread;
        setStackTrace(thread.getStackTrace());
    }
}
