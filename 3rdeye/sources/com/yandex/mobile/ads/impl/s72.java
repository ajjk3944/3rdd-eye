package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2101v;
import java.lang.Thread;
import java.util.Set;

/* loaded from: classes3.dex */
public final class s72 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f32887a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32888b;

    /* renamed from: c, reason: collision with root package name */
    private final du1 f32889c;

    public s72(mp1 reporter, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, du1 sdkConfiguration) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        this.f32887a = reporter;
        this.f32888b = uncaughtExceptionHandler;
        this.f32889c = sdkConfiguration;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        kotlin.jvm.internal.l.f(thread, "thread");
        kotlin.jvm.internal.l.f(throwable, "throwable");
        try {
            Set<z50> setR = this.f32889c.r();
            if (setR == null) {
                setR = C2101v.f18583b;
            }
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            kotlin.jvm.internal.l.e(stackTrace, "getStackTrace(...)");
            if (x12.a(stackTrace, setR)) {
                this.f32887a.reportUnhandledException(throwable);
            }
            if (this.f32889c.q() || (uncaughtExceptionHandler = this.f32888b) == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                this.f32887a.reportError("Failed to report uncaught exception", th);
                C1992A c1992a = C1992A.f18074a;
            } finally {
                try {
                    if (this.f32889c.q() || (uncaughtExceptionHandler = this.f32888b) == null) {
                        return;
                    }
                } catch (Throwable th2) {
                }
            }
            if (this.f32889c.q()) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, throwable);
    }
}
